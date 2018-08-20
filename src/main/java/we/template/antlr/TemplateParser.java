// Generated from C:/Users/Lenovo/Desktop/antlr-template/src/main/java/we/template\Template.g4 by ANTLR 4.7
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
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, DSL_INTEGER_VALUE=29, DSL_IDENTIFIER=30, 
		WS=31;
	public static final int
		RULE_template = 0, RULE_statement = 1, RULE_test = 2, RULE_dsl_braced = 3, 
		RULE_dsl_methodInvoke = 4, RULE_dsl_methodName = 5, RULE_dsl_objectAccess = 6, 
		RULE_dsl_field = 7, RULE_dsl_expressions = 8, RULE_dsl_expression = 9, 
		RULE_dsl_literal = 10, RULE_dsl_param = 11, RULE_dsl_number = 12, RULE_dsl_typedString = 13, 
		RULE_dsl_specialString = 14;
	public static final String[] ruleNames = {
		"template", "statement", "test", "dsl_braced", "dsl_methodInvoke", "dsl_methodName", 
		"dsl_objectAccess", "dsl_field", "dsl_expressions", "dsl_expression", 
		"dsl_literal", "dsl_param", "dsl_number", "dsl_typedString", "dsl_specialString"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'${'", "'}'", "'+'", "'-'", "'*'", "'/'", "'%'", "'>'", "'<'", 
		"'='", "'''", "'!'", "'~'", "'('", "')'", "'.'", "','", "'#'", "':'", 
		"'@'", "'$'", "'^'", "'&'", "'{'", "'['", "']'", "'\"'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "DSL_INTEGER_VALUE", "DSL_IDENTIFIER", "WS"
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
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				statement();
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << DSL_INTEGER_VALUE) | (1L << DSL_IDENTIFIER) | (1L << WS))) != 0) );
			setState(35);
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
	public static class BracedExpressionContext extends StatementContext {
		public Dsl_bracedContext dsl_braced() {
			return getRuleContext(Dsl_bracedContext.class,0);
		}
		public BracedExpressionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterBracedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitBracedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitBracedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlainTextContext extends StatementContext {
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public PlainTextContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterPlainText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitPlainText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitPlainText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new BracedExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				dsl_braced();
				}
				break;
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case DSL_INTEGER_VALUE:
			case DSL_IDENTIFIER:
			case WS:
				_localctx = new PlainTextContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				test();
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

	public static class TestContext extends ParserRuleContext {
		public TestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitTest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestContext test() throws RecognitionException {
		TestContext _localctx = new TestContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_test);
		int _la;
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				match(T__3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				match(T__4);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(45);
				match(T__5);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(46);
				match(T__6);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(47);
				match(T__7);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(48);
				match(T__8);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(49);
				match(T__9);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(50);
				match(T__10);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(51);
				match(T__11);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(52);
				match(T__12);
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

	public static class Dsl_bracedContext extends ParserRuleContext {
		public Dsl_bracedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dsl_braced; }
	 
		public Dsl_bracedContext() { }
		public void copyFrom(Dsl_bracedContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Dsl_accessContext extends Dsl_bracedContext {
		public Dsl_objectAccessContext dsl_objectAccess() {
			return getRuleContext(Dsl_objectAccessContext.class,0);
		}
		public Dsl_accessContext(Dsl_bracedContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterDsl_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitDsl_access(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitDsl_access(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Dsl_notationContext extends Dsl_bracedContext {
		public Dsl_literalContext dsl_literal() {
			return getRuleContext(Dsl_literalContext.class,0);
		}
		public Dsl_notationContext(Dsl_bracedContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterDsl_notation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitDsl_notation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitDsl_notation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Dsl_callContext extends Dsl_bracedContext {
		public Dsl_methodInvokeContext dsl_methodInvoke() {
			return getRuleContext(Dsl_methodInvokeContext.class,0);
		}
		public Dsl_callContext(Dsl_bracedContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterDsl_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitDsl_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitDsl_call(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Dsl_argContext extends Dsl_bracedContext {
		public Dsl_paramContext dsl_param() {
			return getRuleContext(Dsl_paramContext.class,0);
		}
		public Dsl_argContext(Dsl_bracedContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterDsl_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitDsl_arg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitDsl_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dsl_bracedContext dsl_braced() throws RecognitionException {
		Dsl_bracedContext _localctx = new Dsl_bracedContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dsl_braced);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new Dsl_argContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(T__0);
				setState(56);
				dsl_param();
				setState(57);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new Dsl_callContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				match(T__0);
				setState(60);
				dsl_methodInvoke();
				setState(61);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new Dsl_accessContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				match(T__0);
				setState(64);
				dsl_objectAccess(0);
				setState(65);
				match(T__1);
				}
				break;
			case 4:
				_localctx = new Dsl_notationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				match(T__0);
				setState(68);
				dsl_literal();
				setState(69);
				match(T__1);
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

	public static class Dsl_methodInvokeContext extends ParserRuleContext {
		public Dsl_methodNameContext dsl_methodName() {
			return getRuleContext(Dsl_methodNameContext.class,0);
		}
		public Dsl_expressionsContext dsl_expressions() {
			return getRuleContext(Dsl_expressionsContext.class,0);
		}
		public Dsl_methodInvokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dsl_methodInvoke; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterDsl_methodInvoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitDsl_methodInvoke(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitDsl_methodInvoke(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dsl_methodInvokeContext dsl_methodInvoke() throws RecognitionException {
		Dsl_methodInvokeContext _localctx = new Dsl_methodInvokeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dsl_methodInvoke);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			dsl_methodName();
			setState(74);
			match(T__13);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << DSL_INTEGER_VALUE) | (1L << DSL_IDENTIFIER))) != 0)) {
				{
				setState(75);
				dsl_expressions();
				}
			}

			setState(78);
			match(T__14);
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

	public static class Dsl_methodNameContext extends ParserRuleContext {
		public TerminalNode DSL_IDENTIFIER() { return getToken(TemplateParser.DSL_IDENTIFIER, 0); }
		public Dsl_methodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dsl_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterDsl_methodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitDsl_methodName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitDsl_methodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dsl_methodNameContext dsl_methodName() throws RecognitionException {
		Dsl_methodNameContext _localctx = new Dsl_methodNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dsl_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(DSL_IDENTIFIER);
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

	public static class Dsl_objectAccessContext extends ParserRuleContext {
		public Dsl_objectAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dsl_objectAccess; }
	 
		public Dsl_objectAccessContext() { }
		public void copyFrom(Dsl_objectAccessContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Dsl_accessObjectFieldContext extends Dsl_objectAccessContext {
		public Dsl_objectAccessContext dsl_objectAccess() {
			return getRuleContext(Dsl_objectAccessContext.class,0);
		}
		public Dsl_fieldContext dsl_field() {
			return getRuleContext(Dsl_fieldContext.class,0);
		}
		public Dsl_accessObjectFieldContext(Dsl_objectAccessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterDsl_accessObjectField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitDsl_accessObjectField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitDsl_accessObjectField(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Dsl_accessParamContext extends Dsl_objectAccessContext {
		public Dsl_paramContext dsl_param() {
			return getRuleContext(Dsl_paramContext.class,0);
		}
		public Dsl_accessParamContext(Dsl_objectAccessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterDsl_accessParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitDsl_accessParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitDsl_accessParam(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Dsl_accessMethodContext extends Dsl_objectAccessContext {
		public Dsl_methodInvokeContext dsl_methodInvoke() {
			return getRuleContext(Dsl_methodInvokeContext.class,0);
		}
		public Dsl_accessMethodContext(Dsl_objectAccessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterDsl_accessMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitDsl_accessMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitDsl_accessMethod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Dsl_accessObjectMethodContext extends Dsl_objectAccessContext {
		public Dsl_objectAccessContext dsl_objectAccess() {
			return getRuleContext(Dsl_objectAccessContext.class,0);
		}
		public Dsl_methodInvokeContext dsl_methodInvoke() {
			return getRuleContext(Dsl_methodInvokeContext.class,0);
		}
		public Dsl_accessObjectMethodContext(Dsl_objectAccessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterDsl_accessObjectMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitDsl_accessObjectMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitDsl_accessObjectMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dsl_objectAccessContext dsl_objectAccess() throws RecognitionException {
		return dsl_objectAccess(0);
	}

	private Dsl_objectAccessContext dsl_objectAccess(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Dsl_objectAccessContext _localctx = new Dsl_objectAccessContext(_ctx, _parentState);
		Dsl_objectAccessContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_dsl_objectAccess, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new Dsl_accessParamContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(83);
				dsl_param();
				}
				break;
			case 2:
				{
				_localctx = new Dsl_accessMethodContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(84);
				dsl_methodInvoke();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(93);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new Dsl_accessObjectMethodContext(new Dsl_objectAccessContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_dsl_objectAccess);
						setState(87);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(88);
						match(T__15);
						setState(89);
						dsl_methodInvoke();
						}
						break;
					case 2:
						{
						_localctx = new Dsl_accessObjectFieldContext(new Dsl_objectAccessContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_dsl_objectAccess);
						setState(90);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(91);
						match(T__15);
						setState(92);
						dsl_field();
						}
						break;
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Dsl_fieldContext extends ParserRuleContext {
		public TerminalNode DSL_IDENTIFIER() { return getToken(TemplateParser.DSL_IDENTIFIER, 0); }
		public Dsl_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dsl_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterDsl_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitDsl_field(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitDsl_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dsl_fieldContext dsl_field() throws RecognitionException {
		Dsl_fieldContext _localctx = new Dsl_fieldContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dsl_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(DSL_IDENTIFIER);
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

	public static class Dsl_expressionsContext extends ParserRuleContext {
		public List<Dsl_expressionContext> dsl_expression() {
			return getRuleContexts(Dsl_expressionContext.class);
		}
		public Dsl_expressionContext dsl_expression(int i) {
			return getRuleContext(Dsl_expressionContext.class,i);
		}
		public Dsl_expressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dsl_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterDsl_expressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitDsl_expressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitDsl_expressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dsl_expressionsContext dsl_expressions() throws RecognitionException {
		Dsl_expressionsContext _localctx = new Dsl_expressionsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dsl_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			dsl_expression();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(101);
				match(T__16);
				setState(102);
				dsl_expression();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Dsl_expressionContext extends ParserRuleContext {
		public Dsl_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dsl_expression; }
	 
		public Dsl_expressionContext() { }
		public void copyFrom(Dsl_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Dsl_objectExpressionContext extends Dsl_expressionContext {
		public Dsl_objectAccessContext dsl_objectAccess() {
			return getRuleContext(Dsl_objectAccessContext.class,0);
		}
		public Dsl_objectExpressionContext(Dsl_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterDsl_objectExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitDsl_objectExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitDsl_objectExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Dsl_literalExpressionContext extends Dsl_expressionContext {
		public Dsl_literalContext dsl_literal() {
			return getRuleContext(Dsl_literalContext.class,0);
		}
		public Dsl_literalExpressionContext(Dsl_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterDsl_literalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitDsl_literalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitDsl_literalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Dsl_methodInvokeExpressionContext extends Dsl_expressionContext {
		public Dsl_methodInvokeContext dsl_methodInvoke() {
			return getRuleContext(Dsl_methodInvokeContext.class,0);
		}
		public Dsl_methodInvokeExpressionContext(Dsl_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterDsl_methodInvokeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitDsl_methodInvokeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitDsl_methodInvokeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Dsl_paramExpressionContext extends Dsl_expressionContext {
		public Dsl_paramContext dsl_param() {
			return getRuleContext(Dsl_paramContext.class,0);
		}
		public Dsl_paramExpressionContext(Dsl_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterDsl_paramExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitDsl_paramExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitDsl_paramExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dsl_expressionContext dsl_expression() throws RecognitionException {
		Dsl_expressionContext _localctx = new Dsl_expressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dsl_expression);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new Dsl_paramExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				dsl_param();
				}
				break;
			case 2:
				_localctx = new Dsl_literalExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				dsl_literal();
				}
				break;
			case 3:
				_localctx = new Dsl_objectExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				dsl_objectAccess(0);
				}
				break;
			case 4:
				_localctx = new Dsl_methodInvokeExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				dsl_methodInvoke();
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

	public static class Dsl_literalContext extends ParserRuleContext {
		public Dsl_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dsl_literal; }
	 
		public Dsl_literalContext() { }
		public void copyFrom(Dsl_literalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Dsl_stringLiteralContext extends Dsl_literalContext {
		public Dsl_typedStringContext dsl_typedString() {
			return getRuleContext(Dsl_typedStringContext.class,0);
		}
		public Dsl_stringLiteralContext(Dsl_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterDsl_stringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitDsl_stringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitDsl_stringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Dsl_numberLiteralContext extends Dsl_literalContext {
		public Dsl_numberContext dsl_number() {
			return getRuleContext(Dsl_numberContext.class,0);
		}
		public Dsl_numberLiteralContext(Dsl_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterDsl_numberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitDsl_numberLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitDsl_numberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dsl_literalContext dsl_literal() throws RecognitionException {
		Dsl_literalContext _localctx = new Dsl_literalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dsl_literal);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DSL_INTEGER_VALUE:
				_localctx = new Dsl_numberLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				dsl_number();
				}
				break;
			case T__17:
				_localctx = new Dsl_stringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(T__17);
				setState(116);
				dsl_typedString();
				setState(117);
				match(T__17);
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

	public static class Dsl_paramContext extends ParserRuleContext {
		public TerminalNode DSL_IDENTIFIER() { return getToken(TemplateParser.DSL_IDENTIFIER, 0); }
		public Dsl_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dsl_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterDsl_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitDsl_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitDsl_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dsl_paramContext dsl_param() throws RecognitionException {
		Dsl_paramContext _localctx = new Dsl_paramContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dsl_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(DSL_IDENTIFIER);
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

	public static class Dsl_numberContext extends ParserRuleContext {
		public TerminalNode DSL_INTEGER_VALUE() { return getToken(TemplateParser.DSL_INTEGER_VALUE, 0); }
		public Dsl_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dsl_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterDsl_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitDsl_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitDsl_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dsl_numberContext dsl_number() throws RecognitionException {
		Dsl_numberContext _localctx = new Dsl_numberContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dsl_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(DSL_INTEGER_VALUE);
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

	public static class Dsl_typedStringContext extends ParserRuleContext {
		public List<Dsl_specialStringContext> dsl_specialString() {
			return getRuleContexts(Dsl_specialStringContext.class);
		}
		public Dsl_specialStringContext dsl_specialString(int i) {
			return getRuleContext(Dsl_specialStringContext.class,i);
		}
		public Dsl_typedStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dsl_typedString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterDsl_typedString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitDsl_typedString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitDsl_typedString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dsl_typedStringContext dsl_typedString() throws RecognitionException {
		Dsl_typedStringContext _localctx = new Dsl_typedStringContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dsl_typedString);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(127);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(125);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__17) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case 2:
					{
					setState(126);
					dsl_specialString();
					}
					break;
				}
				}
				setState(129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << DSL_INTEGER_VALUE) | (1L << DSL_IDENTIFIER) | (1L << WS))) != 0) );
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

	public static class Dsl_specialStringContext extends ParserRuleContext {
		public Dsl_specialStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dsl_specialString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).enterDsl_specialString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateListener ) ((TemplateListener)listener).exitDsl_specialString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateVisitor ) return ((TemplateVisitor<? extends T>)visitor).visitDsl_specialString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dsl_specialStringContext dsl_specialString() throws RecognitionException {
		Dsl_specialStringContext _localctx = new Dsl_specialStringContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dsl_specialString);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return dsl_objectAccess_sempred((Dsl_objectAccessContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean dsl_objectAccess_sempred(Dsl_objectAccessContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u0088\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\6\2\"\n\2\r\2\16"+
		"\2#\3\2\3\2\3\3\3\3\5\3*\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\48\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5J\n\5\3\6\3\6\3\6\5\6O\n\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\5"+
		"\bX\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b`\n\b\f\b\16\bc\13\b\3\t\3\t\3\n\3"+
		"\n\3\n\7\nj\n\n\f\n\16\nm\13\n\3\13\3\13\3\13\3\13\5\13s\n\13\3\f\3\f"+
		"\3\f\3\f\3\f\5\fz\n\f\3\r\3\r\3\16\3\16\3\17\3\17\6\17\u0082\n\17\r\17"+
		"\16\17\u0083\3\20\3\20\3\20\2\3\16\21\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36\2\5\3\2\3\4\3\2\24\24\3\2\25\36\2\u0093\2!\3\2\2\2\4)\3\2\2\2\6"+
		"\67\3\2\2\2\bI\3\2\2\2\nK\3\2\2\2\fR\3\2\2\2\16W\3\2\2\2\20d\3\2\2\2\22"+
		"f\3\2\2\2\24r\3\2\2\2\26y\3\2\2\2\30{\3\2\2\2\32}\3\2\2\2\34\u0081\3\2"+
		"\2\2\36\u0085\3\2\2\2 \"\5\4\3\2! \3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2"+
		"\2\2$%\3\2\2\2%&\7\2\2\3&\3\3\2\2\2\'*\5\b\5\2(*\5\6\4\2)\'\3\2\2\2)("+
		"\3\2\2\2*\5\3\2\2\2+8\n\2\2\2,8\7\5\2\2-8\7\6\2\2.8\7\7\2\2/8\7\b\2\2"+
		"\608\7\t\2\2\618\7\n\2\2\628\7\13\2\2\638\7\f\2\2\648\7\r\2\2\658\7\16"+
		"\2\2\668\7\17\2\2\67+\3\2\2\2\67,\3\2\2\2\67-\3\2\2\2\67.\3\2\2\2\67/"+
		"\3\2\2\2\67\60\3\2\2\2\67\61\3\2\2\2\67\62\3\2\2\2\67\63\3\2\2\2\67\64"+
		"\3\2\2\2\67\65\3\2\2\2\67\66\3\2\2\28\7\3\2\2\29:\7\3\2\2:;\5\30\r\2;"+
		"<\7\4\2\2<J\3\2\2\2=>\7\3\2\2>?\5\n\6\2?@\7\4\2\2@J\3\2\2\2AB\7\3\2\2"+
		"BC\5\16\b\2CD\7\4\2\2DJ\3\2\2\2EF\7\3\2\2FG\5\26\f\2GH\7\4\2\2HJ\3\2\2"+
		"\2I9\3\2\2\2I=\3\2\2\2IA\3\2\2\2IE\3\2\2\2J\t\3\2\2\2KL\5\f\7\2LN\7\20"+
		"\2\2MO\5\22\n\2NM\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\7\21\2\2Q\13\3\2\2\2R"+
		"S\7 \2\2S\r\3\2\2\2TU\b\b\1\2UX\5\30\r\2VX\5\n\6\2WT\3\2\2\2WV\3\2\2\2"+
		"Xa\3\2\2\2YZ\f\4\2\2Z[\7\22\2\2[`\5\n\6\2\\]\f\3\2\2]^\7\22\2\2^`\5\20"+
		"\t\2_Y\3\2\2\2_\\\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\17\3\2\2\2ca"+
		"\3\2\2\2de\7 \2\2e\21\3\2\2\2fk\5\24\13\2gh\7\23\2\2hj\5\24\13\2ig\3\2"+
		"\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\23\3\2\2\2mk\3\2\2\2ns\5\30\r\2os"+
		"\5\26\f\2ps\5\16\b\2qs\5\n\6\2rn\3\2\2\2ro\3\2\2\2rp\3\2\2\2rq\3\2\2\2"+
		"s\25\3\2\2\2tz\5\32\16\2uv\7\24\2\2vw\5\34\17\2wx\7\24\2\2xz\3\2\2\2y"+
		"t\3\2\2\2yu\3\2\2\2z\27\3\2\2\2{|\7 \2\2|\31\3\2\2\2}~\7\37\2\2~\33\3"+
		"\2\2\2\177\u0082\n\3\2\2\u0080\u0082\5\36\20\2\u0081\177\3\2\2\2\u0081"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2"+
		"\2\2\u0084\35\3\2\2\2\u0085\u0086\t\4\2\2\u0086\37\3\2\2\2\17#)\67INW"+
		"_akry\u0081\u0083";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}