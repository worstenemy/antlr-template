package we.template;

public abstract class Segment {
  private final String text;

  public Segment(String text) {
    this.text = text;
  }

  public String getText() {
    return this.text;
  }

  public abstract Object eval();
}