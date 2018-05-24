package we.template;

public abstract class RuntimeContext {
  public abstract Object arg(String symbol);

  public abstract Function function(String symbol);
}