package we.template.segment;

import we.template.Segment;

public class PlainTextSegment implements Segment {
  private final String plainText;

  public PlainTextSegment(String plainText) {
    this.plainText = plainText;
  }

  @Override
  public String getText() {
    return this.plainText;
  }

  @Override
  public Object eval() {
    return this.plainText;
  }
}