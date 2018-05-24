// Generated from /Users/pxr/Desktop/antlr-template/src/main/java/we/template/Template.g4 by ANTLR 4.6
package we.template.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TemplateLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, INTEGER_VALUE=17, 
		IDENTIFIER=18, QUOTED_IDENTIFIER=19, WS=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "INTEGER_VALUE", 
		"IDENTIFIER", "QUOTED_IDENTIFIER", "DIGIT", "LETTER", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'*'", "'/'", "'%'", "'>'", "'<'", "'='", "'''", "'!'", 
		"'~'", "'${'", "'}'", "'('", "','", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "INTEGER_VALUE", "IDENTIFIER", "QUOTED_IDENTIFIER", 
		"WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public TemplateLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Template.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26w\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\6\22R\n\22\r"+
		"\22\16\22S\3\23\3\23\5\23X\n\23\3\23\3\23\3\23\7\23]\n\23\f\23\16\23`"+
		"\13\23\3\24\3\24\3\24\3\24\7\24f\n\24\f\24\16\24i\13\24\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\6\27r\n\27\r\27\16\27s\3\27\3\27\2\2\30\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\2+\2-\26\3\2\7\5\2<<BBaa\3\2$$\3\2\62;\4\2C\\c|\5\2\13"+
		"\f\17\17\"\"|\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2"+
		"\2\2\7\63\3\2\2\2\t\65\3\2\2\2\13\67\3\2\2\2\r9\3\2\2\2\17;\3\2\2\2\21"+
		"=\3\2\2\2\23?\3\2\2\2\25A\3\2\2\2\27C\3\2\2\2\31E\3\2\2\2\33H\3\2\2\2"+
		"\35J\3\2\2\2\37L\3\2\2\2!N\3\2\2\2#Q\3\2\2\2%W\3\2\2\2\'a\3\2\2\2)l\3"+
		"\2\2\2+n\3\2\2\2-q\3\2\2\2/\60\7-\2\2\60\4\3\2\2\2\61\62\7/\2\2\62\6\3"+
		"\2\2\2\63\64\7,\2\2\64\b\3\2\2\2\65\66\7\61\2\2\66\n\3\2\2\2\678\7\'\2"+
		"\28\f\3\2\2\29:\7@\2\2:\16\3\2\2\2;<\7>\2\2<\20\3\2\2\2=>\7?\2\2>\22\3"+
		"\2\2\2?@\7)\2\2@\24\3\2\2\2AB\7#\2\2B\26\3\2\2\2CD\7\u0080\2\2D\30\3\2"+
		"\2\2EF\7&\2\2FG\7}\2\2G\32\3\2\2\2HI\7\177\2\2I\34\3\2\2\2JK\7*\2\2K\36"+
		"\3\2\2\2LM\7.\2\2M \3\2\2\2NO\7+\2\2O\"\3\2\2\2PR\5)\25\2QP\3\2\2\2RS"+
		"\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T$\3\2\2\2UX\5+\26\2VX\7a\2\2WU\3\2\2\2WV"+
		"\3\2\2\2X^\3\2\2\2Y]\5+\26\2Z]\5)\25\2[]\t\2\2\2\\Y\3\2\2\2\\Z\3\2\2\2"+
		"\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_&\3\2\2\2`^\3\2\2\2ag\7$\2"+
		"\2bf\n\3\2\2cd\7$\2\2df\7$\2\2eb\3\2\2\2ec\3\2\2\2fi\3\2\2\2ge\3\2\2\2"+
		"gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7$\2\2k(\3\2\2\2lm\t\4\2\2m*\3\2\2\2"+
		"no\t\5\2\2o,\3\2\2\2pr\t\6\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2"+
		"tu\3\2\2\2uv\b\27\2\2v.\3\2\2\2\n\2SW\\^egs\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}