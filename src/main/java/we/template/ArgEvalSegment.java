package we.template;

public class ArgEvalSegment implements Segment {
  private static final RuntimeContext CONTEXT = RuntimeContextManager.getContext();

  private final String arg;

  public ArgEvalSegment(String arg) {
    this.arg = arg;
  }

  @Override
  public String getText() {
    return this.arg;
  }

  @Override
  public Object eval() {
    return CONTEXT.arg(this.arg);
  }
}
