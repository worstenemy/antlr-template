package we.template.reflection;

import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class MethodHelper {
  private static final Object OBJECT = new Object();

  private static final ConcurrentMap<MethodDescriptor, WeakReference<Method>> EXIST_METHODS =
    new ConcurrentHashMap<>(32);

  private static final ConcurrentMap<MethodDescriptor, Object> FORBIDDEN_METHODS =
    new ConcurrentHashMap<>(32);

  private static final Map<Class<?>, Class<?>> PRIMITIVES_WRAPPER;

  static {
    Map<Class<?>, Class<?>> primitives2Wrapper = new HashMap<>(8);

    primitives2Wrapper.put(boolean.class, Boolean.class);
    primitives2Wrapper.put(byte.class, Byte.class);
    primitives2Wrapper.put(char.class, Character.class);
    primitives2Wrapper.put(short.class, Short.class);
    primitives2Wrapper.put(int.class, Integer.class);
    primitives2Wrapper.put(float.class, Float.class);
    primitives2Wrapper.put(long.class, Long.class);
    primitives2Wrapper.put(double.class, Double.class);

    PRIMITIVES_WRAPPER = Collections.unmodifiableMap(primitives2Wrapper);
  }

  static {
    preHeat(String.class);
  }

  private static void preHeat(Class<?> clazz) {
    Objects.requireNonNull(clazz, "class cannot be null");
    Method[] methods;
    if (0 != (methods = clazz.getMethods()).length) {
      for (Method method : methods) {
        doPreHeat(clazz, method);
      }
    }
  }

  private static void doPreHeat(Class<?> clazz, Method method) {
    Class<?>[] paramTypes = method.getParameterTypes();
    if (null != paramTypes) {
      for (int i = 0; i < paramTypes.length; ++i) {
        Class<?> paramType = paramTypes[i];
        paramTypes[i] = getWrapperClass(paramType);
      }
    }
    MethodDescriptor descriptor = new MethodDescriptor(clazz, method.getName(), paramTypes);
    cachedMethod(descriptor, method);
  }

  private static Class<?> getWrapperClass(Class<?> clazz) {
    return clazz.isPrimitive() ? PRIMITIVES_WRAPPER.get(clazz) : clazz;
  }

  public static Method searchMethod(Class<?> clazz, String methodName, Class<?>[] paramTypes) {
    MethodDescriptor descriptor = new MethodDescriptor(clazz, methodName, paramTypes);
    if (FORBIDDEN_METHODS.containsKey(descriptor)) {
      throw new RuntimeException("no such method " + methodName);
    }
    Method match;
    if (null != (match = getCachedMethod(descriptor))) {
      return match;
    }
    try {
      match = clazz.getMethod(methodName, paramTypes);
      cachedMethod(descriptor, match);
      return match;
    } catch (NoSuchMethodException e) {
      if (null != (match = fallThrough(descriptor))) {
        return match;
      }
    }
    throw new RuntimeException("no such method " + methodName);
  }

  private static Method fallThrough(MethodDescriptor descriptor) {
    int paramLength = descriptor.getActualTypes().length;
    Method[] methods = descriptor.getClazz().getMethods();
    for (Method method : methods) {
      if (method.getName().equals(descriptor.getMethodName())) {
        Class<?>[] expectTypes = method.getParameterTypes();
        if (paramLength == expectTypes.length && paramTypesCompatible(expectTypes, descriptor.getActualTypes())) {
          cachedMethod(descriptor, method);
          return method;
        }
      }
    }
    FORBIDDEN_METHODS.putIfAbsent(descriptor, OBJECT);
    return null;
  }

  private static boolean paramTypesCompatible(Class<?>[] expectTypes, Class<?>[] actualTypes) {
    int length = expectTypes.length;
    boolean match = true;
    for (int i = 0; i < length; ++i) {
      if (!isAssignmentCompatible(expectTypes[i], actualTypes[i])) {
        match = false;
        break;
      }
    }
    return match;
  }

  private static boolean isAssignmentCompatible(Class<?> expectType, Class<?> actualType) {
    return (expectType.isAssignableFrom(actualType)) ||
      (expectType.isPrimitive() && PRIMITIVES_WRAPPER.get(expectType).equals(actualType));
  }

  private static Method getCachedMethod(MethodDescriptor descriptor) {
    WeakReference<Method> reference = EXIST_METHODS.get(descriptor);
    if (null != reference) {
      return reference.get();
    }
    return null;
  }

  private static void cachedMethod(MethodDescriptor descriptor, Method method) {
    EXIST_METHODS.computeIfAbsent(descriptor, s -> new WeakReference<>(method));
  }
}