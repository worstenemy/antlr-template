package we.template;

public class ArgEvalSegment implements Segment {
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
    return RuntimeManager.arg(this.arg);
  }
}
