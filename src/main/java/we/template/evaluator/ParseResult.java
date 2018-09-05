package we.template.evaluator;

import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class ParseResult {
	private final ParseTree tree;

	private final TokenStream stream;

	ParseResult(ParseTree tree, TokenStream stream) {
		this.tree = tree;
		this.stream = stream;
	}

	public ParseTree getTree() {
		return tree;
	}

	public TokenStream getStream() {
		return stream;
	}
}