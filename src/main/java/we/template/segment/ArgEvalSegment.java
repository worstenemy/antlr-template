package we.template.segment;

import we.template.function.RuntimeHelper;

public class ArgEvalSegment extends Segment {
  public ArgEvalSegment(String arg) {
    super(arg);
  }

  @Override
  public Object eval() {
    return RuntimeHelper.searchArg(getText());
  }
}