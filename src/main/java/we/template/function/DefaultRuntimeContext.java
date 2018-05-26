package we.template.function;

import we.template.reflection.ReflectionHelper;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class DefaultRuntimeContext extends RuntimeContext {
  private static final ThreadLocal<Map<String, Object>> ARGS =
    ThreadLocal.withInitial(() -> new HashMap<String, Object>(32));

  private static final ConcurrentMap<FunctionDescriptor, Function> FUNCTIONS =
    new ConcurrentHashMap<>(32);

  public void setArgs(String symbol, Object value) {
    ARGS.get().putIfAbsent(symbol, value);
  }

  public void setFunctions(Class<?> functions) {
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

  private Object createInstance(Class<?> clazz) {
    try {
      return clazz.newInstance();
    } catch (Exception e) {
      return null;
    }
  }

  @Override
  public Object arg(String symbol) {
    return ARGS.get().get(symbol);
  }

  @Override
  public Function function(String symbol, Class<?>[] paramTypes) {
    FunctionDescriptor descriptor = new FunctionDescriptor(symbol, paramTypes);
    return FUNCTIONS.get(descriptor);
  }
}