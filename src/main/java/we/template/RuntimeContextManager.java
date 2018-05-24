package we.template;

public class RuntimeContextManager {
  private final static RuntimeContext CONTEXT = new DefaultRuntimeContext();

  public static RuntimeContext getContext() {
    return CONTEXT;
  }
}