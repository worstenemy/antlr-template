package we.template;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import we.template.antlr.TemplateBaseListener;
import we.template.antlr.TemplateParser;
import we.template.function.RuntimeHelper;
import we.template.segment.ArgEvalSegment;
import we.template.segment.FunctionEvalSegment;
import we.template.segment.ObjectEvalSegment;
import we.template.segment.PlainTextSegment;
import we.template.segment.Segment;

import java.util.ArrayList;
import java.util.List;

import static we.template.ParseHelper.TEMPLATE_LEXER;
import static we.template.ParseHelper.TEMPLATE_PARSER;

public class SegmentCompiler extends TemplateBaseListener implements EvalAware {
  private final List<Segment> segments = new ArrayList<>(8);

  private BufferedTokenStream tokenStream;

  private int lastAccess = 0;

  public SegmentCompiler() {

  }

  public SegmentCompiler(String template) {
    compile(template);
  }

  private List<Segment> getSegments() {
    dealWithLeftOver();
    return this.segments;
  }

  private void dealWithLeftOver() {
    int size = this.tokenStream.size();
    int lastAccess = this.lastAccess;
    if (lastAccess < size - 1) {
      String plainText = append(lastAccess, size - 1);
      this.segments.add(new PlainTextSegment(plainText));
      this.lastAccess = size;
    }
  }

  @Override
  public String eval(String template) {
    if (this.segments.isEmpty()) {
      compile(template);
    }
    return eval();
  }

  @Override
  public String eval() {
    if (this.segments.isEmpty()) {
      throw new RuntimeException("no template available");
    }
    List<Segment> segments = getSegments();
    if (1 == segments.size()) {
      return String.valueOf(segments.get(0).eval());
    }
    StringBuilder builder = new StringBuilder();
    for (Segment segment : segments) {
      builder.append(segment.eval());
    }
    return builder.toString();
  }

  private void compile(String template) {
    Pair<ParseTree, BufferedTokenStream> pair =
      ParseHelper.invoke("compile template", template,
        TEMPLATE_PARSER,
        TEMPLATE_LEXER,
        TemplateParser::template);
    this.tokenStream = pair.getSecond();
    ParseTreeWalker walker = new ParseTreeWalker();
    walker.walk(this, pair.getFirst());
  }

  @Override
  public void enterBraced(TemplateParser.BracedContext ctx) {
    Token start = ctx.getStart();
    Token stop = ctx.getStop();

    // not the first one
    if (start.getTokenIndex() > 0) {
      String plainText = append(this.lastAccess, start.getTokenIndex() - 1);
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