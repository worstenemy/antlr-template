package we.template.reflection;

import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class MethodHelper {
  private static final Object OBJECT = new Object();

  private static final Class<?>[] EQUALS_SIG = {Object.class};

  private static final String EQUALS = "equals";

  private static final ConcurrentMap<MethodDescriptor, WeakReference<Method>> EXIST_METHODS =
    new ConcurrentHashMap<>(128);

  private static final ConcurrentMap<MethodDescriptor, Object> FORBIDDEN_METHODS =
    new ConcurrentHashMap<>(128);

  static {
    preheat(String.class);
  }

  private static void preheat(Class<?> clazz) {
    Objects.requireNonNull(clazz, "class cannot be null");
    Method[] methods;
    if (0 != (methods = clazz.getMethods()).length) {
      for (Method method : methods) {
        doPreheat(clazz, method);
      }
    }
    preheatEquals(clazz);
  }

  private static void preheatEquals(Class<?> clazz) {
    MethodDescriptor objectEquals = new MethodDescriptor(clazz, EQUALS, EQUALS_SIG);
    Method method = getCachedMethod(objectEquals);

    Class<?>[] thisSig = {clazz};
    MethodDescriptor thisEquals = new MethodDescriptor(clazz, EQUALS, thisSig);
    cachedMethod(thisEquals, method);
  }

  private static void doPreheat(Class<?> clazz, Method method) {
    Class<?>[] paramTypes = method.getParameterTypes();
    MethodDescriptor descriptor = new MethodDescriptor(clazz, method.getName(),
      ReflectionHelper.replaceTypes(paramTypes));
    cachedMethod(descriptor, method);
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
      FORBIDDEN_METHODS.putIfAbsent(descriptor, OBJECT);
      throw new RuntimeException(e);
    }
  }

  private static Method fallThrough(MethodDescriptor descriptor) {
    int actualLength = descriptor.getActualTypes().length;
    Method[] methods = descriptor.getClazz().getMethods();
    for (Method method : methods) {
      if (method.getName().equals(descriptor.getMethodName())) {
        Class<?>[] expectTypes = method.getParameterTypes();
        if (actualLength == expectTypes.length && paramTypesCompatible(expectTypes, descriptor.getActualTypes())) {
          cachedMethod(descriptor, method);
          return method;
        }
      }
    }
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
      (expectType.isPrimitive() && ReflectionHelper.getWrapper(expectType).equals(actualType));
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