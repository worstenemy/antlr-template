package we.template;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class DefaultRuntimeContext extends RuntimeContext {
  private static final ThreadLocal<Map<String, Object>> ARGS =
    ThreadLocal.withInitial(() -> new HashMap<String, Object>(16));

  private static final ConcurrentMap<String, Function> FUNCTIONS =
    new ConcurrentHashMap<>(16);

  public void setArgs(String symbol, Object value) {
    ARGS.get().putIfAbsent(symbol, value);
  }

  public void setFunctions(String symbol, Function function) {
    FUNCTIONS.putIfAbsent(symbol, function);
  }

  public void setFunctions(Class<?> functions) {
    Method[] methods;
    Object instance = createInstance(functions);
    if (null != functions && null != instance && 0 != (methods = functions.getMethods()).length) {
      for (Method method : methods) {
        Function function = new JavaMethod(method, instance);
        FUNCTIONS.putIfAbsent(method.getName(), function);
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
  public Function function(String symbol) {
    return FUNCTIONS.get(symbol);
  }
}