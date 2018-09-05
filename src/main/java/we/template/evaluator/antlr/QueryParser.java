// Generated from E:/report/query/src/main/java/cn/cdxt/hbd/evaluator/antlr\QueryParser.g4 by ANTLR 4.7
package we.template.evaluator.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		StartTag=1, Text=2, EndTag=3, DualQuotedString=4, SingleQuotedString=5, 
		Identifier=6, Number=7, GT=8, LT=9, GE=10, LE=11, EQ=12, NE=13, ADD=14, 
		OR=15, AND=16, LParen=17, RParen=18, Comma=19, WS=20;
	public static final int
		RULE_query = 0, RULE_statement = 1, RULE_dsl = 2, RULE_dslType = 3, RULE_function = 4, 
		RULE_parameters = 5, RULE_logicExpression = 6, RULE_boolExpression = 7, 
		RULE_comparator = 8, RULE_expression = 9;
	public static final String[] ruleNames = {
		"query", "statement", "dsl", "dslType", "function", "parameters", "logicExpression", 
		"boolExpression", "comparator", "expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'${'", null, "'}'", null, null, null, null, "'>'", "'<'", "'>='", 
		"'<='", "'=='", "'!='", "'+'", "'||'", "'&&'", "'('", "')'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "StartTag", "Text", "EndTag", "DualQuotedString", "SingleQuotedString", 
		"Identifier", "Number", "GT", "LT", "GE", "LE", "EQ", "NE", "ADD", "OR", 
		"AND", "LParen", "RParen", "Comma", "WS"
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
	public String getGrammarFileName() { return "QueryParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class QueryContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(QueryParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryParserVisitor ) return ((QueryParserVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				statement();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==StartTag || _la==Text );
			setState(25);
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
	public static class PlainTextContext extends StatementContext {
		public TerminalNode Text() { return getToken(QueryParser.Text, 0); }
		public PlainTextContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterPlainText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitPlainText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryParserVisitor ) return ((QueryParserVisitor<? extends T>)visitor).visitPlainText(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RichTextContext extends StatementContext {
		public DslContext dsl() {
			return getRuleContext(DslContext.class,0);
		}
		public RichTextContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterRichText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitRichText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryParserVisitor ) return ((QueryParserVisitor<? extends T>)visitor).visitRichText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartTag:
				_localctx = new RichTextContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				dsl();
				}
				break;
			case Text:
				_localctx = new PlainTextContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				match(Text);
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

	public static class DslContext extends ParserRuleContext {
		public TerminalNode StartTag() { return getToken(QueryParser.StartTag, 0); }
		public DslTypeContext dslType() {
			return getRuleContext(DslTypeContext.class,0);
		}
		public TerminalNode EndTag() { return getToken(QueryParser.EndTag, 0); }
		public DslContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dsl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterDsl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitDsl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryParserVisitor ) return ((QueryParserVisitor<? extends T>)visitor).visitDsl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DslContext dsl() throws RecognitionException {
		DslContext _localctx = new DslContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dsl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(StartTag);
			setState(32);
			dslType();
			setState(33);
			match(EndTag);
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

	public static class DslTypeContext extends ParserRuleContext {
		public DslTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dslType; }
	 
		public DslTypeContext() { }
		public void copyFrom(DslTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdTypeContext extends DslTypeContext {
		public TerminalNode Identifier() { return getToken(QueryParser.Identifier, 0); }
		public IdTypeContext(DslTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterIdType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitIdType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryParserVisitor ) return ((QueryParserVisitor<? extends T>)visitor).visitIdType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncTypeContext extends DslTypeContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FuncTypeContext(DslTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterFuncType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitFuncType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryParserVisitor ) return ((QueryParserVisitor<? extends T>)visitor).visitFuncType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DslTypeContext dslType() throws RecognitionException {
		DslTypeContext _localctx = new DslTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dslType);
		try {
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new IdTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				match(Identifier);
				}
				break;
			case 2:
				_localctx = new FuncTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				function();
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

	public static class FunctionContext extends ParserRuleContext {
		public Token name;
		public ParametersContext params;
		public TerminalNode Identifier() { return getToken(QueryParser.Identifier, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryParserVisitor ) return ((QueryParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			((FunctionContext)_localctx).name = match(Identifier);
			setState(40);
			match(LParen);
			setState(41);
			((FunctionContext)_localctx).params = parameters();
			setState(42);
			match(RParen);
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

	public static class ParametersContext extends ParserRuleContext {
		public List<LogicExpressionContext> logicExpression() {
			return getRuleContexts(LogicExpressionContext.class);
		}
		public LogicExpressionContext logicExpression(int i) {
			return getRuleContext(LogicExpressionContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryParserVisitor ) return ((QueryParserVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			logicExpression(0);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(45);
				match(Comma);
				setState(46);
				logicExpression(0);
				}
				}
				setState(51);
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

	public static class LogicExpressionContext extends ParserRuleContext {
		public LogicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExpression; }
	 
		public LogicExpressionContext() { }
		public void copyFrom(LogicExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicAndExpressionContext extends LogicExpressionContext {
		public LogicExpressionContext left;
		public LogicExpressionContext right;
		public List<LogicExpressionContext> logicExpression() {
			return getRuleContexts(LogicExpressionContext.class);
		}
		public LogicExpressionContext logicExpression(int i) {
			return getRuleContext(LogicExpressionContext.class,i);
		}
		public LogicAndExpressionContext(LogicExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterLogicAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitLogicAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryParserVisitor ) return ((QueryParserVisitor<? extends T>)visitor).visitLogicAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicOrExpressionContext extends LogicExpressionContext {
		public LogicExpressionContext left;
		public LogicExpressionContext right;
		public List<LogicExpressionContext> logicExpression() {
			return getRuleContexts(LogicExpressionContext.class);
		}
		public LogicExpressionContext logicExpression(int i) {
			return getRuleContext(LogicExpressionContext.class,i);
		}
		public LogicOrExpressionContext(LogicExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterLogicOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitLogicOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryParserVisitor ) return ((QueryParserVisitor<? extends T>)visitor).visitLogicOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicBaseExpressionContext extends LogicExpressionContext {
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public LogicBaseExpressionContext(LogicExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterLogicBaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitLogicBaseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryParserVisitor ) return ((QueryParserVisitor<? extends T>)visitor).visitLogicBaseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicExpressionContext logicExpression() throws RecognitionException {
		return logicExpression(0);
	}

	private LogicExpressionContext logicExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicExpressionContext _localctx = new LogicExpressionContext(_ctx, _parentState);
		LogicExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_logicExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LogicBaseExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(53);
			boolExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(61);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new LogicAndExpressionContext(new LogicExpressionContext(_parentctx, _parentState));
						((LogicAndExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpression);
						setState(55);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(56);
						match(AND);
						setState(57);
						((LogicAndExpressionContext)_localctx).right = logicExpression(4);
						}
						break;
					case 2:
						{
						_localctx = new LogicOrExpressionContext(new LogicExpressionContext(_parentctx, _parentState));
						((LogicOrExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpression);
						setState(58);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(59);
						match(OR);
						setState(60);
						((LogicOrExpressionContext)_localctx).right = logicExpression(3);
						}
						break;
					}
					} 
				}
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class BoolExpressionContext extends ParserRuleContext {
		public BoolExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpression; }
	 
		public BoolExpressionContext() { }
		public void copyFrom(BoolExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CompareExpressionContext extends BoolExpressionContext {
		public BoolExpressionContext left;
		public ComparatorContext comp;
		public BoolExpressionContext right;
		public List<BoolExpressionContext> boolExpression() {
			return getRuleContexts(BoolExpressionContext.class);
		}
		public BoolExpressionContext boolExpression(int i) {
			return getRuleContext(BoolExpressionContext.class,i);
		}
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public CompareExpressionContext(BoolExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterCompareExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitCompareExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryParserVisitor ) return ((QueryParserVisitor<? extends T>)visitor).visitCompareExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompareBaseExpressionContext extends BoolExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CompareBaseExpressionContext(BoolExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterCompareBaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitCompareBaseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryParserVisitor ) return ((QueryParserVisitor<? extends T>)visitor).visitCompareBaseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExpressionContext boolExpression() throws RecognitionException {
		return boolExpression(0);
	}

	private BoolExpressionContext boolExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolExpressionContext _localctx = new BoolExpressionContext(_ctx, _parentState);
		BoolExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_boolExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CompareBaseExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(67);
			expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CompareExpressionContext(new BoolExpressionContext(_parentctx, _parentState));
					((CompareExpressionContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_boolExpression);
					setState(69);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(70);
					((CompareExpressionContext)_localctx).comp = comparator();
					setState(71);
					((CompareExpressionContext)_localctx).right = boolExpression(3);
					}
					} 
				}
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class ComparatorContext extends ParserRuleContext {
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
	 
		public ComparatorContext() { }
		public void copyFrom(ComparatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NeContext extends ComparatorContext {
		public NeContext(ComparatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterNe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitNe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryParserVisitor ) return ((QueryParserVisitor<? extends T>)visitor).visitNe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LtContext extends ComparatorContext {
		public LtContext(ComparatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterLt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitLt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryParserVisitor ) return ((QueryParserVisitor<? extends T>)visitor).visitLt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LeContext extends ComparatorContext {
		public LeContext(ComparatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterLe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitLe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryParserVisitor ) return ((QueryParserVisitor<? extends T>)visitor).visitLe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqContext extends ComparatorContext {
		public EqContext(ComparatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryParserVisitor ) return ((QueryParserVisitor<? extends T>)visitor).visitEq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GtContext extends ComparatorContext {
		public GtContext(ComparatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterGt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitGt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryParserVisitor ) return ((QueryParserVisitor<? extends T>)visitor).visitGt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GeContext extends ComparatorContext {
		public GeContext(ComparatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterGe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitGe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryParserVisitor ) return ((QueryParserVisitor<? extends T>)visitor).visitGe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comparator);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GT:
				_localctx = new GtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(GT);
				}
				break;
			case LT:
				_localctx = new LtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(LT);
				}
				break;
			case EQ:
				_localctx = new EqContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				match(EQ);
				}
				break;
			case GE:
				_localctx = new GeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				match(GE);
				}
				break;
			case LE:
				_localctx = new LeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				match(LE);
				}
				break;
			case NE:
				_localctx = new NeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(83);
				match(NE);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdExpressionContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(QueryParser.Identifier, 0); }
		public IdExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterIdExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitIdExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryParserVisitor ) return ((QueryParserVisitor<? extends T>)visitor).visitIdExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringExpressionContext extends ExpressionContext {
		public TerminalNode DualQuotedString() { return getToken(QueryParser.DualQuotedString, 0); }
		public TerminalNode SingleQuotedString() { return getToken(QueryParser.SingleQuotedString, 0); }
		public StringExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryParserVisitor ) return ((QueryParserVisitor<? extends T>)visitor).visitStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberExpressionContext extends ExpressionContext {
		public TerminalNode Number() { return getToken(QueryParser.Number, 0); }
		public NumberExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterNumberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitNumberExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryParserVisitor ) return ((QueryParserVisitor<? extends T>)visitor).visitNumberExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConcatExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConcatExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterConcatExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitConcatExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryParserVisitor ) return ((QueryParserVisitor<? extends T>)visitor).visitConcatExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionExpressionContext extends ExpressionContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).enterFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParserListener ) ((QueryParserListener)listener).exitFunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryParserVisitor ) return ((QueryParserVisitor<? extends T>)visitor).visitFunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new IdExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(87);
				match(Identifier);
				}
				break;
			case 2:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88);
				match(DualQuotedString);
				}
				break;
			case 3:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				match(SingleQuotedString);
				}
				break;
			case 4:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(90);
				match(Number);
				}
				break;
			case 5:
				{
				_localctx = new FunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConcatExpressionContext(new ExpressionContext(_parentctx, _parentState));
					((ConcatExpressionContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(94);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(95);
					match(ADD);
					setState(96);
					((ConcatExpressionContext)_localctx).right = expression(7);
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return logicExpression_sempred((LogicExpressionContext)_localctx, predIndex);
		case 7:
			return boolExpression_sempred((BoolExpressionContext)_localctx, predIndex);
		case 9:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logicExpression_sempred(LogicExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean boolExpression_sempred(BoolExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26i\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\6\2\30\n\2\r\2\16\2\31\3\2\3\2\3\3\3\3\5\3 \n\3\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\5\5(\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7\62\n\7\f\7\16\7\65\13"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b@\n\b\f\b\16\bC\13\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\7\tL\n\t\f\t\16\tO\13\t\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\nW\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13_\n\13\3\13\3\13\3\13\7\13d"+
		"\n\13\f\13\16\13g\13\13\3\13\2\5\16\20\24\f\2\4\6\b\n\f\16\20\22\24\2"+
		"\2\2o\2\27\3\2\2\2\4\37\3\2\2\2\6!\3\2\2\2\b\'\3\2\2\2\n)\3\2\2\2\f.\3"+
		"\2\2\2\16\66\3\2\2\2\20D\3\2\2\2\22V\3\2\2\2\24^\3\2\2\2\26\30\5\4\3\2"+
		"\27\26\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\33\3\2\2\2"+
		"\33\34\7\2\2\3\34\3\3\2\2\2\35 \5\6\4\2\36 \7\4\2\2\37\35\3\2\2\2\37\36"+
		"\3\2\2\2 \5\3\2\2\2!\"\7\3\2\2\"#\5\b\5\2#$\7\5\2\2$\7\3\2\2\2%(\7\b\2"+
		"\2&(\5\n\6\2\'%\3\2\2\2\'&\3\2\2\2(\t\3\2\2\2)*\7\b\2\2*+\7\23\2\2+,\5"+
		"\f\7\2,-\7\24\2\2-\13\3\2\2\2.\63\5\16\b\2/\60\7\25\2\2\60\62\5\16\b\2"+
		"\61/\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\r\3\2\2\2\65"+
		"\63\3\2\2\2\66\67\b\b\1\2\678\5\20\t\28A\3\2\2\29:\f\5\2\2:;\7\22\2\2"+
		";@\5\16\b\6<=\f\4\2\2=>\7\21\2\2>@\5\16\b\5?9\3\2\2\2?<\3\2\2\2@C\3\2"+
		"\2\2A?\3\2\2\2AB\3\2\2\2B\17\3\2\2\2CA\3\2\2\2DE\b\t\1\2EF\5\24\13\2F"+
		"M\3\2\2\2GH\f\4\2\2HI\5\22\n\2IJ\5\20\t\5JL\3\2\2\2KG\3\2\2\2LO\3\2\2"+
		"\2MK\3\2\2\2MN\3\2\2\2N\21\3\2\2\2OM\3\2\2\2PW\7\n\2\2QW\7\13\2\2RW\7"+
		"\16\2\2SW\7\f\2\2TW\7\r\2\2UW\7\17\2\2VP\3\2\2\2VQ\3\2\2\2VR\3\2\2\2V"+
		"S\3\2\2\2VT\3\2\2\2VU\3\2\2\2W\23\3\2\2\2XY\b\13\1\2Y_\7\b\2\2Z_\7\6\2"+
		"\2[_\7\7\2\2\\_\7\t\2\2]_\5\n\6\2^X\3\2\2\2^Z\3\2\2\2^[\3\2\2\2^\\\3\2"+
		"\2\2^]\3\2\2\2_e\3\2\2\2`a\f\b\2\2ab\7\20\2\2bd\5\24\13\tc`\3\2\2\2dg"+
		"\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\25\3\2\2\2ge\3\2\2\2\f\31\37\'\63?AMV^e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}