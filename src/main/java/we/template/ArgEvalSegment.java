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
  public String eval() {
    return String.valueOf(RuntimeManager.arg(this.arg));
  }
}
