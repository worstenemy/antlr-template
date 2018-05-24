// Generated from /Users/pxr/Desktop/antlr-template/src/main/java/we/template/Template.g4 by ANTLR 4.6
package we.template.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TemplateParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, INTEGER_VALUE=17, 
		IDENTIFIER=18, QUOTED_IDENTIFIER=19, WS=20;
	public static final int
		RULE_template = 0, RULE_statement = 1, RULE_text = 2, RULE_symbol = 3, 
		RULE_plain = 4, RULE_braced = 5, RULE_tinyStmt = 6, RULE_tinyCall = 7, 
		RULE_tinyExpr = 8;
	public static final String[] ruleNames = {
		"template", "statement", "text", "symbol", "plain", "braced", "tinyStmt", 
		"tinyCall", "tinyExpr"
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

	@Override
	public String getGrammarFileName() { return "Template.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TemplateParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TemplateContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TemplateParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_template);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				statement();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << INTEGER_VALUE) | (1L << IDENTIFIER) | (1L << QUOTED_IDENTIFIER) | (1L << WS))) != 0) );
			setState(23);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SBracedContext extends StatementContext {
		public BracedContext braced() {
			return getRuleContext(BracedContext.class,0);
		}
		public SBracedContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterSBraced(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitSBraced(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitSBraced(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class STextContext extends StatementContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public STextContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterSText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitSText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitSText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				_localctx = new SBracedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				braced();
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__13:
			case T__14:
			case T__15:
			case INTEGER_VALUE:
			case IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case WS:
				_localctx = new STextContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				text();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextContext extends ParserRuleContext {
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
	 
		public TextContext() { }
		public void copyFrom(TextContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TPlainContext extends TextContext {
		public PlainContext plain() {
			return getRuleContext(PlainContext.class,0);
		}
		public TPlainContext(TextContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterTPlain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitTPlain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitTPlain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TSymbolContext extends TextContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TSymbolContext(TextContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterTSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitTSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitTSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_text);
		try {
			setState(31);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new TSymbolContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				symbol();
				}
				break;
			case 2:
				_localctx = new TPlainContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				plain();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SymbolContext extends ParserRuleContext {
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_symbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlainContext extends ParserRuleContext {
		public PlainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterPlain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitPlain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitPlain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlainContext plain() throws RecognitionException {
		PlainContext _localctx = new PlainContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_plain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__11 || _la==T__12) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BracedContext extends ParserRuleContext {
		public TinyStmtContext tinyStmt() {
			return getRuleContext(TinyStmtContext.class,0);
		}
		public BracedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_braced; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterBraced(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitBraced(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitBraced(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracedContext braced() throws RecognitionException {
		BracedContext _localctx = new BracedContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_braced);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(T__11);
			setState(38);
			tinyStmt();
			setState(39);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TinyStmtContext extends ParserRuleContext {
		public TinyStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tinyStmt; }
	 
		public TinyStmtContext() { }
		public void copyFrom(TinyStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SCallContext extends TinyStmtContext {
		public TinyCallContext tinyCall() {
			return getRuleContext(TinyCallContext.class,0);
		}
		public SCallContext(TinyStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterSCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitSCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitSCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SIdContext extends TinyStmtContext {
		public TerminalNode IDENTIFIER() { return getToken(TemplateParser.IDENTIFIER, 0); }
		public SIdContext(TinyStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterSId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitSId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitSId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TinyStmtContext tinyStmt() throws RecognitionException {
		TinyStmtContext _localctx = new TinyStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tinyStmt);
		try {
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new SCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				tinyCall();
				}
				break;
			case 2:
				_localctx = new SIdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				match(IDENTIFIER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TinyCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TemplateParser.IDENTIFIER, 0); }
		public List<TinyExprContext> tinyExpr() {
			return getRuleContexts(TinyExprContext.class);
		}
		public TinyExprContext tinyExpr(int i) {
			return getRuleContext(TinyExprContext.class,i);
		}
		public TinyCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tinyCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterTinyCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitTinyCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitTinyCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TinyCallContext tinyCall() throws RecognitionException {
		TinyCallContext _localctx = new TinyCallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tinyCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(IDENTIFIER);
			setState(46);
			match(T__13);
			setState(47);
			tinyExpr();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(48);
				match(T__14);
				setState(49);
				tinyExpr();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TinyExprContext extends ParserRuleContext {
		public TinyExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tinyExpr; }
	 
		public TinyExprContext() { }
		public void copyFrom(TinyExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EIdContext extends TinyExprContext {
		public TerminalNode IDENTIFIER() { return getToken(TemplateParser.IDENTIFIER, 0); }
		public EIdContext(TinyExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterEId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitEId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitEId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EStrContext extends TinyExprContext {
		public TerminalNode QUOTED_IDENTIFIER() { return getToken(TemplateParser.QUOTED_IDENTIFIER, 0); }
		public EStrContext(TinyExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterEStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitEStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitEStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EIntContext extends TinyExprContext {
		public TerminalNode INTEGER_VALUE() { return getToken(TemplateParser.INTEGER_VALUE, 0); }
		public EIntContext(TinyExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterEInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitEInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitEInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ECallContext extends TinyExprContext {
		public TinyCallContext tinyCall() {
			return getRuleContext(TinyCallContext.class,0);
		}
		public ECallContext(TinyExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterECall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitECall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitECall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TinyExprContext tinyExpr() throws RecognitionException {
		TinyExprContext _localctx = new TinyExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tinyExpr);
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new ECallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				tinyCall();
				}
				break;
			case 2:
				_localctx = new EIdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				match(IDENTIFIER);
				}
				break;
			case 3:
				_localctx = new EIntContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				match(INTEGER_VALUE);
				}
				break;
			case 4:
				_localctx = new EStrContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				match(QUOTED_IDENTIFIER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\26B\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\6\2\26"+
		"\n\2\r\2\16\2\27\3\2\3\2\3\3\3\3\5\3\36\n\3\3\4\3\4\5\4\"\n\4\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\5\b.\n\b\3\t\3\t\3\t\3\t\3\t\7\t\65\n"+
		"\t\f\t\16\t8\13\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n@\n\n\3\n\2\2\13\2\4\6\b"+
		"\n\f\16\20\22\2\4\3\2\3\r\3\2\16\17@\2\25\3\2\2\2\4\35\3\2\2\2\6!\3\2"+
		"\2\2\b#\3\2\2\2\n%\3\2\2\2\f\'\3\2\2\2\16-\3\2\2\2\20/\3\2\2\2\22?\3\2"+
		"\2\2\24\26\5\4\3\2\25\24\3\2\2\2\26\27\3\2\2\2\27\25\3\2\2\2\27\30\3\2"+
		"\2\2\30\31\3\2\2\2\31\32\7\2\2\3\32\3\3\2\2\2\33\36\5\f\7\2\34\36\5\6"+
		"\4\2\35\33\3\2\2\2\35\34\3\2\2\2\36\5\3\2\2\2\37\"\5\b\5\2 \"\5\n\6\2"+
		"!\37\3\2\2\2! \3\2\2\2\"\7\3\2\2\2#$\t\2\2\2$\t\3\2\2\2%&\n\3\2\2&\13"+
		"\3\2\2\2\'(\7\16\2\2()\5\16\b\2)*\7\17\2\2*\r\3\2\2\2+.\5\20\t\2,.\7\24"+
		"\2\2-+\3\2\2\2-,\3\2\2\2.\17\3\2\2\2/\60\7\24\2\2\60\61\7\20\2\2\61\66"+
		"\5\22\n\2\62\63\7\21\2\2\63\65\5\22\n\2\64\62\3\2\2\2\658\3\2\2\2\66\64"+
		"\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29:\7\22\2\2:\21\3\2\2\2"+
		";@\5\20\t\2<@\7\24\2\2=@\7\23\2\2>@\7\25\2\2?;\3\2\2\2?<\3\2\2\2?=\3\2"+
		"\2\2?>\3\2\2\2@\23\3\2\2\2\b\27\35!-\66?";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}