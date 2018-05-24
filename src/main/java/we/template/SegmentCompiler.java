package we.template;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.Token;
import we.template.antlr.TemplateBaseListener;
import we.template.antlr.TemplateParser;

import java.util.ArrayList;
import java.util.List;

public class SegmentCompiler extends TemplateBaseListener implements SegmentsEvalAware {
  private final List<Segment> segments = new ArrayList<>(8);

  private final BufferedTokenStream tokenStream;

  private int lastAccess = 0;

  public SegmentCompiler(BufferedTokenStream tokenStream) {
    this.tokenStream = tokenStream;
  }

  @Override
  public List<Segment> getSegments() {
    dealWithLeftOver();
    return this.segments;
  }

  private void dealWithLeftOver() {
    int size = this.tokenStream.size();
    if (this.lastAccess < size) {
      String plainText = append(this.lastAccess, size - 1);
      this.segments.add(new PlainTextSegment(plainText));
      this.lastAccess = size;
    }
  }

  @Override
  public void enterBraced(TemplateParser.BracedContext ctx) {
    Token start = ctx.getStart();
    Token stop = ctx.getStop();

    if (notFirst(start)) {
      String plainText = append(this.lastAccess, start.getTokenIndex() - 1);
      this.segments.add(new PlainTextSegment(plainText));
    }

    this.lastAccess = stop.getTokenIndex() + 1;
  }

  private boolean notFirst(Token start) {
    return start.getTokenIndex() > 0;
  }

  @Override
  public void enterSCall(TemplateParser.SCallContext ctx) {
    Token start = ctx.getStart();
    Token stop = ctx.getStop();

    String function = append(start.getTokenIndex(), stop.getTokenIndex());

    this.segments.add(new FunctionEvalSegment(function));
  }

  @Override
  public void enterSId(TemplateParser.SIdContext ctx) {
    Token start = ctx.getStart();
    Token stop = ctx.getStop();

    String arg = append(start.getTokenIndex(), stop.getTokenIndex());

    this.segments.add(new ArgEvalSegment(arg));
  }

  private String append(int start, int stop) {
    List<Token> tokens = this.tokenStream.get(start, stop);
    if (1 == tokens.size()) {
      return tokens.get(0).getText();
    }
    StringBuilder builder = new StringBuilder();
    for (Token token : tokens) {
      builder.append(token.getText());
    }
    return builder.toString();
  }
}