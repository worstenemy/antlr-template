package we.template.segment;

import we.template.RuntimeManager;
import we.template.Segment;

public class ArgEvalSegment extends Segment {
  public ArgEvalSegment(String arg) {
    super(arg);
  }

  @Override
  public Object eval() {
    return RuntimeManager.arg(getText());
  }
}
