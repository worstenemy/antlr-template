package we.template.segment;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import we.template.Pair;
import we.template.ParseHelper;
import we.template.antlr.TemplateParser;

public class ObjectEvalSegment extends Segment {
  public ObjectEvalSegment(String object) {
    super(object);
  }

  @Override
  public Object eval() {
    Pair<ParseTree, BufferedTokenStream> pair = ParseHelper.invoke("eval object", this.getText(),
      ParseHelper.TEMPLATE_PARSER,
      ParseHelper.TEMPLATE_LEXER,
      TemplateParser::tinyObject);
    EvalVisitor visitor = new EvalVisitor();
    return visitor.visit(pair.getFirst());
  }
}