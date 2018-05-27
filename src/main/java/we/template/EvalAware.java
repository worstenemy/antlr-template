package we.template;

public interface EvalAware {
  String eval();

  String eval(String template);

  EvalAware setArgs(String symbol, Object value);

  EvalAware setFunctions(Class<?> functions);
}