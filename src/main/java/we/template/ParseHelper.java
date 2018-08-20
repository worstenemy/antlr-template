package we.template;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.function.Function;

public class ParseHelper {
	private static final BaseErrorListener ERROR_LISTENER = new BaseErrorListener() {
		@Override
		public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
			throw new ParseCancellationException("syntax error near " + line + ", " + charPositionInLine + ", " + msg);
		}
	};

	public static <T extends Parser, U extends Lexer>
	Pair<ParseTree, TokenStream> invoke(String name,
	                                    String input,
	                                    Function<TokenStream, T> parserCreator,
	                                    Function<CharStream, U> lexerCreator,
	                                    Function<T, ParseTree> parseRule) {
		U lexer = lexerCreator.apply(new CaseInsensitiveStream(new ANTLRInputStream(input)));
		lexer.removeErrorListeners();
		lexer.addErrorListener(ERROR_LISTENER);

		CommonTokenStream tokenStream = new CommonTokenStream(lexer);

		T parser = parserCreator.apply(tokenStream);
		parser.removeErrorListeners();
		parser.addErrorListener(ERROR_LISTENER);

		ParseTree tree;
		try {
			tree = parseInternal(parseRule, tokenStream, parser);
		} catch (StackOverflowError error) {
			throw new ParseCancellationException(name + " is too large (stack overflow)");
		}
		return Pair.valueOf(tree, tokenStream);
	}

	private static <T extends Parser> ParseTree parseInternal(Function<T, ParseTree> parseRule, CommonTokenStream tokenStream, T parser) {
		ParseTree tree;
		try {
			parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
			tree = parseRule.apply(parser);
		} catch (ParseCancellationException e) {
			tokenStream.reset();
			parser.reset();
			parser.getInterpreter().setPredictionMode(PredictionMode.LL);
			tree = parseRule.apply(parser);
		}
		return tree;
	}
}