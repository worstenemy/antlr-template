package we.template.segment;

import we.template.function.RuntimeManager;

public class ArgEvalSegment extends Segment {
  public ArgEvalSegment(String arg) {
    super(arg);
  }

  @Override
  public Object eval() {
    return RuntimeManager.arg(getText());
  }
}
