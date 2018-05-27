package we.template.segment;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import we.template.Pair;
import we.template.ParseHelper;
import we.template.antlr.TemplateParser;


public class FunctionEvalSegment extends Segment {
  private final ParseTree tree;

  private final EvalVisitor visitor = new EvalVisitor();

  public FunctionEvalSegment(String function) {
    super(function);
    Pair<ParseTree, BufferedTokenStream> pair =
      ParseHelper.invoke("eval defineFunctions", getText(),
        ParseHelper.TEMPLATE_PARSER,
        ParseHelper.TEMPLATE_LEXER,
        TemplateParser::tinyCall);
    this.tree = pair.getFirst();
  }

  @Override
  public Object eval() {
    return this.visitor.visit(this.tree);
  }
}