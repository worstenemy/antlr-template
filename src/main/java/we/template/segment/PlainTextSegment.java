package we.template.segment;

import we.template.Segment;

public class PlainTextSegment extends Segment {
  public PlainTextSegment(String plainText) {
    super(plainText);
  }

  @Override
  public Object eval() {
    return getText();
  }
}