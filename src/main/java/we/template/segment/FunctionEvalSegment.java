package we.template.segment;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import we.template.Pair;
import we.template.ParseHelper;
import we.template.antlr.TemplateParser;


public class FunctionEvalSegment extends Segment {
  public FunctionEvalSegment(String function) {
    super(function);
  }

  @Override
  public Object eval() {
    Pair<ParseTree, BufferedTokenStream> pair =
      ParseHelper.invoke("eval defineFunctions", getText(),
        ParseHelper.TEMPLATE_PARSER,
        ParseHelper.TEMPLATE_LEXER,
        TemplateParser::tinyCall);
    EvalVisitor visitor = new EvalVisitor();
    return visitor.visit(pair.getFirst());
  }
}