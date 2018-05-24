package we.template;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import we.template.antlr.TemplateBaseVisitor;
import we.template.antlr.TemplateParser;

import java.util.List;

public class FunctionEvalSegment implements Segment {
  private final String function;

  public FunctionEvalSegment(String function) {
    this.function = function;
  }

  @Override
  public String getText() {
    return this.function;
  }

  @Override
  public Object eval() {
    Pair<ParseTree, BufferedTokenStream> pair =
      ParseHelper.invoke("eval function", this.function, ParseHelper.TEMPLATE_PARSER, ParseHelper.TEMPLATE_LEXER,
        TemplateParser::tinyCall);
    EvalVisitor visitor = new EvalVisitor();
    return visitor.visit(pair.getFirst());
  }

  private static class EvalVisitor extends TemplateBaseVisitor<Object> {
    private static final RuntimeContext CONTEXT = RuntimeContextManager.getContext();

    @Override
    public Object visitTinyCall(TemplateParser.TinyCallContext ctx) {
      String symbol = ctx.IDENTIFIER().getText();
      List<TemplateParser.TinyExprContext> contexts = ctx.tinyExpr();
      Object[] args = new Object[contexts.size()];
      for (int i = 0; i < contexts.size(); ++i) {
        args[i] = visit(contexts.get(i));
      }
      Function function;
      if (null != (function = CONTEXT.function(symbol))) {
        return function.call(args);
      }
      throw new RuntimeException("function not found");
    }

    @Override
    public Object visitECall(TemplateParser.ECallContext ctx) {
      return visitTinyCall(ctx.tinyCall());
    }

    @Override
    public Object visitEId(TemplateParser.EIdContext ctx) {
      String symbol = ctx.IDENTIFIER().getText();
      return CONTEXT.arg(symbol);
    }

    @Override
    public Object visitEInt(TemplateParser.EIntContext ctx) {
      return Integer.valueOf(ctx.INTEGER_VALUE().getText());
    }

    @Override
    public Object visitEStr(TemplateParser.EStrContext ctx) {
      return ctx.QUOTED_IDENTIFIER().getText();
    }
  }
}