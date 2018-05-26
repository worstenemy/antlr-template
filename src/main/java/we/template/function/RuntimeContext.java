package we.template.function;

public abstract class RuntimeContext {
  public abstract Object arg(String symbol);

  public abstract Function function(String symbol, Class<?>[] paramTypes);
}