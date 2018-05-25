package we.template.segment;

public class PlainTextSegment extends Segment {
  public PlainTextSegment(String plainText) {
    super(plainText);
  }

  @Override
  public Object eval() {
    return getText();
  }
}