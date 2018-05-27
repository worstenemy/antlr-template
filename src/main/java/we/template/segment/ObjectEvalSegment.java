package we.template.segment;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import we.template.Pair;
import we.template.ParseHelper;
import we.template.antlr.TemplateParser;

public class ObjectEvalSegment extends Segment {
  private final ParseTree tree;

  private final EvalVisitor visitor = new EvalVisitor();

  public ObjectEvalSegment(String object) {
    super(object);
    Pair<ParseTree, BufferedTokenStream> pair = ParseHelper.invoke("eval object", this.getText(),
      ParseHelper.TEMPLATE_PARSER,
      ParseHelper.TEMPLATE_LEXER,
      TemplateParser::tinyObject);
    this.tree = pair.getFirst();
  }

  @Override
  public Object eval() {
    return this.visitor.visit(this.tree);
  }
}