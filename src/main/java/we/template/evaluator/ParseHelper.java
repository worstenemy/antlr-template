package we.template.evaluator;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Function;

public class ParseHelper {
	private static final Logger LOGGER = LoggerFactory.getLogger(ParseHelper.class);

	private static final BaseErrorListener ERROR_LISTENER = new BaseErrorListener() {
		@Override
		public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String message, RecognitionException e) {
			throw new ParseCancellationException("parsing error at line " + line + " and position " + charPositionInLine + ", with message " + message);
		}
	};

	public static <T extends Parser, U extends Lexer>
	ParseResult parse(String name,
	                  String input,
	                  Function<TokenStream, T> parserCreator,
	                  Function<CharStream, U> lexerCreator,
	                  Function<T, ParseTree> parseRule,
	                  boolean caseInsensitive) {
		CharStream stream = getCharStream(input, caseInsensitive);
		U lexer = lexerCreator.apply(stream);
		lexer.removeErrorListeners();
		lexer.addErrorListener(ERROR_LISTENER);

		CommonTokenStream tokenStream = new CommonTokenStream(lexer);

		T parser = parserCreator.apply(tokenStream);
		parser.removeErrorListeners();
		parser.addErrorListener(ERROR_LISTENER);

		ParseTree tree;
		try {
			tree = parse(parseRule, tokenStream, parser);
		} catch (StackOverflowError error) {
			LOGGER.error("{} is too large (stack overflow)", name);
			throw new ParseCancellationException(name + " is too large (stack overflow)");
		}
		return new ParseResult(tree, tokenStream);
	}

	private static CharStream getCharStream(String input, boolean caseInsensitive) {
		return caseInsensitive ? new CaseInsensitiveStream(CharStreams.fromString(input)) : CharStreams.fromString(input);
	}

	private static <T extends Parser> ParseTree parse(Function<T, ParseTree> parseRule, CommonTokenStream tokenStream, T parser) {
		ParseTree tree;
		try {
			parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
			tree = parseRule.apply(parser);
		} catch (ParseCancellationException e) {
			tokenStream.seek(0);
			parser.reset();
			parser.getInterpreter().setPredictionMode(PredictionMode.LL);
			tree = parseRule.apply(parser);
		}
		return tree;
	}
}