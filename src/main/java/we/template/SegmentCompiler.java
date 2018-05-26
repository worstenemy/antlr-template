package we.template;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.Token;
import we.template.antlr.TemplateBaseListener;
import we.template.antlr.TemplateParser;
import we.template.segment.ArgEvalSegment;
import we.template.segment.FunctionEvalSegment;
import we.template.segment.ObjectEvalSegment;
import we.template.segment.PlainTextSegment;
import we.template.segment.Segment;

import java.util.ArrayList;
import java.util.List;

public class SegmentCompiler extends TemplateBaseListener implements SegmentsEvalAware {
  private static final String EMPTY = "";

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
    if (this.lastAccess < size - 1) {
      String plainText = append(this.lastAccess, size - 1);
      this.segments.add(new PlainTextSegment(plainText));
      this.lastAccess = size;
    }
  }

  @Override
  public void enterBraced(TemplateParser.BracedContext ctx) {
    Token start = ctx.getStart();
    Token stop = ctx.getStop();

    String plainText = append(this.lastAccess, start.getTokenIndex() - 1);

    if (!plainText.equals(EMPTY)) {
      this.segments.add(new PlainTextSegment(plainText));
    }

    this.lastAccess = stop.getTokenIndex() + 1;
  }

  @Override
  public void enterSObject(TemplateParser.SObjectContext ctx) {
    Token start = ctx.getStart();
    Token stop = ctx.getStop();

    String object = append(start.getTokenIndex(), stop.getTokenIndex());

    this.segments.add(new ObjectEvalSegment(object));
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
    if (null != tokens) {
      if (1 == tokens.size()) {
        return tokens.get(0).getText();
      }
      StringBuilder builder = new StringBuilder();
      for (Token token : tokens) {
        builder.append(token.getText());
      }
      return builder.toString();
    }
    return EMPTY;
  }
}