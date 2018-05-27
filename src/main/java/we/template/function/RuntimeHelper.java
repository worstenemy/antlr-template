package we.template.function;

import we.template.reflection.ReflectionHelper;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class RuntimeHelper {
  private static final ThreadLocal<Map<String, Object>> ARGS =
    ThreadLocal.withInitial(() -> new HashMap<String, Object>(32));

  private static final ConcurrentMap<FunctionDescriptor, Function> FUNCTIONS =
    new ConcurrentHashMap<>(32);

  public static void defineArg(String symbol, Object value) {
    ARGS.get().putIfAbsent(symbol, value);
  }

  public static void defineFunctions(Class<?> functions) {
    Method[] methods;
    Object instance = createInstance(functions);
    if (null != functions && null != instance && 0 != (methods = functions.getMethods()).length) {
      for (Method method : methods) {
        Class<?>[] paramTypes = method.getParameterTypes();
        FunctionDescriptor descriptor = new FunctionDescriptor(method.getName(),
          ReflectionHelper.replaceTypes(paramTypes));
        Function function = new JavaMethod(method, instance);
        FUNCTIONS.putIfAbsent(descriptor, function);
      }
    }
  }

  private static Object createInstance(Class<?> clazz) {
    try {
      return clazz.newInstance();
    } catch (Exception e) {
      return null;
    }
  }

  public static Object searchArg(String symbol) {
    return ARGS.get().get(symbol);
  }

  public static Function searchFunction(String symbol, Class<?>[] paramTypes) {
    FunctionDescriptor descriptor = new FunctionDescriptor(symbol, paramTypes);
    return FUNCTIONS.get(descriptor);
  }
}