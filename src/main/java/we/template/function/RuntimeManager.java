package we.template.function;

public class RuntimeManager {
  private final static DefaultRuntimeContext CONTEXT = new DefaultRuntimeContext();

  public static void setArgs(String symbol, Object value) {
    CONTEXT.setArgs(symbol, value);
  }

  public static void setFunctions(Class<?> functions) {
    CONTEXT.setFunctions(functions);
  }

  public static Object arg(String symbol) {
    return CONTEXT.arg(symbol);
  }

  public static Function function(String symbol, Class<?>[] paramTypes) {
    return CONTEXT.function(symbol, paramTypes);
  }
}