// Generated from c:\Users\bshelor24\Documents\Taylor 2018-19\lang-struct\A02\Antlr_action.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Antlr_actionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		ID=10, NUM=11;
	public static final int
		RULE_start = 0, RULE_list = 1, RULE_expr = 2, RULE_terms = 3, RULE_term = 4, 
		RULE_factors = 5, RULE_factor = 6;
	public static final String[] ruleNames = {
		"start", "list", "expr", "terms", "term", "factors", "factor"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'EOF'", "';'", "'+'", "'-'", "'*'", "'/'", "'MOD'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "ID", "NUM"
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
	public String getGrammarFileName() { return "AntlrActions.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Antlr_actionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			list();
			setState(15);
			match(T__0);
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

	public static class ListContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_list);
		try {
			setState(22);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case ID:
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				expr();
				setState(18);
				match(T__1);
				setState(19);
				list();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			term();
			setState(25);
			terms();
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

	public static class TermsContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public TermsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terms; }
	}

	public final TermsContext terms() throws RecognitionException {
		TermsContext _localctx = new TermsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_terms);
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				match(T__2);
				setState(28);
				term();
				setState(29);
				terms();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(T__3);
				setState(32);
				term();
				setState(33);
				terms();
				}
				break;
			case T__1:
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactorsContext factors() {
			return getRuleContext(FactorsContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			factor();
			setState(39);
			factors();
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

	public static class FactorsContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactorsContext factors() {
			return getRuleContext(FactorsContext.class,0);
		}
		public FactorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factors; }
	}

	public final FactorsContext factors() throws RecognitionException {
		FactorsContext _localctx = new FactorsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_factors);
		try {
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(T__4);
				setState(42);
				factor();
				setState(43);
				factors();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(T__5);
				setState(46);
				factor();
				setState(47);
				factors();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				match(T__6);
				setState(50);
				factor();
				setState(51);
				factors();
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
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

	public static class FactorContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(Antlr_actionParser.ID, 0); }
		public TerminalNode NUM() { return getToken(Antlr_actionParser.NUM, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_factor);
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				match(T__7);
				setState(57);
				expr();
				setState(58);
				match(T__8);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				match(ID);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				match(NUM);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\rC\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\5\3\31\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\'"+
		"\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\79\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bA\n\b\3\b\2\2\t\2\4\6\b\n\f\16\2\2"+
		"\2C\2\20\3\2\2\2\4\30\3\2\2\2\6\32\3\2\2\2\b&\3\2\2\2\n(\3\2\2\2\f8\3"+
		"\2\2\2\16@\3\2\2\2\20\21\5\4\3\2\21\22\7\3\2\2\22\3\3\2\2\2\23\24\5\6"+
		"\4\2\24\25\7\4\2\2\25\26\5\4\3\2\26\31\3\2\2\2\27\31\3\2\2\2\30\23\3\2"+
		"\2\2\30\27\3\2\2\2\31\5\3\2\2\2\32\33\5\n\6\2\33\34\5\b\5\2\34\7\3\2\2"+
		"\2\35\36\7\5\2\2\36\37\5\n\6\2\37 \5\b\5\2 \'\3\2\2\2!\"\7\6\2\2\"#\5"+
		"\n\6\2#$\5\b\5\2$\'\3\2\2\2%\'\3\2\2\2&\35\3\2\2\2&!\3\2\2\2&%\3\2\2\2"+
		"\'\t\3\2\2\2()\5\16\b\2)*\5\f\7\2*\13\3\2\2\2+,\7\7\2\2,-\5\16\b\2-.\5"+
		"\f\7\2.9\3\2\2\2/\60\7\b\2\2\60\61\5\16\b\2\61\62\5\f\7\2\629\3\2\2\2"+
		"\63\64\7\t\2\2\64\65\5\16\b\2\65\66\5\f\7\2\669\3\2\2\2\679\3\2\2\28+"+
		"\3\2\2\28/\3\2\2\28\63\3\2\2\28\67\3\2\2\29\r\3\2\2\2:;\7\n\2\2;<\5\6"+
		"\4\2<=\7\13\2\2=A\3\2\2\2>A\7\f\2\2?A\7\r\2\2@:\3\2\2\2@>\3\2\2\2@?\3"+
		"\2\2\2A\17\3\2\2\2\6\30&8@";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}