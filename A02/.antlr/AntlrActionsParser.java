// Generated from c:\Users\bshelor24\Documents\Taylor 2018-19\lang-struct\A02\AntlrActions.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AntlrActionsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		ID=10, NUM=11, WS=12;
	public static final int
		RULE_block = 0, RULE_start = 1, RULE_list = 2, RULE_expr = 3, RULE_terms = 4, 
		RULE_term = 5, RULE_factors = 6, RULE_factor = 7;
	public static final String[] ruleNames = {
		"block", "start", "list", "expr", "terms", "term", "factors", "factor"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'EOF'", "';'", "'+'", "'-'", "'*'", "'/'", "'MOD'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "ID", "NUM", 
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
	public String getGrammarFileName() { return "AntlrActions.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AntlrActionsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class BlockContext extends ParserRuleContext {
		public List<String> symbols = new ArrayList<String>();
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			start();
			System.out.println("symbolTable="+_localctx.symbols);
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
		enterRule(_localctx, 2, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			list();
			setState(20);
			match(T__0);
			System.out.println("EOF");
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
		enterRule(_localctx, 4, RULE_list);
		try {
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case ID:
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				expr();
				setState(24);
				match(T__1);
				System.out.println(";");
				setState(26);
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
		enterRule(_localctx, 6, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			term();
			setState(32);
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
		enterRule(_localctx, 8, RULE_terms);
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(T__2);
				setState(35);
				term();
				System.out.print("+ ");
				setState(37);
				terms();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				match(T__3);
				setState(40);
				term();
				System.out.print("- ");
				setState(42);
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
		enterRule(_localctx, 10, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			factor();
			setState(48);
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
		enterRule(_localctx, 12, RULE_factors);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(T__4);
				setState(51);
				factor();
				System.out.print("* ");
				setState(53);
				factors();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(T__5);
				setState(56);
				factor();
				System.out.print("/ ");
				setState(58);
				factors();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				match(T__6);
				setState(61);
				factor();
				System.out.print("MOD ");
				setState(63);
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
		public Token ID;
		public Token NUM;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(AntlrActionsParser.ID, 0); }
		public TerminalNode NUM() { return getToken(AntlrActionsParser.NUM, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_factor);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(T__7);
				setState(69);
				expr();
				setState(70);
				match(T__8);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				((FactorContext)_localctx).ID = match(ID);
				System.out.print((((FactorContext)_localctx).ID!=null?((FactorContext)_localctx).ID.getText():null)+" ");
				((BlockContext)getInvokingContext(0)).symbols.add((((FactorContext)_localctx).ID!=null?((FactorContext)_localctx).ID.getText():null));
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				((FactorContext)_localctx).NUM = match(NUM);
				System.out.print((((FactorContext)_localctx).NUM!=null?((FactorContext)_localctx).NUM.getText():null)+" ");
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16R\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4 \n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\60\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bE\n\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\tP\n\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\2\2Q\2\22"+
		"\3\2\2\2\4\25\3\2\2\2\6\37\3\2\2\2\b!\3\2\2\2\n/\3\2\2\2\f\61\3\2\2\2"+
		"\16D\3\2\2\2\20O\3\2\2\2\22\23\5\4\3\2\23\24\b\2\1\2\24\3\3\2\2\2\25\26"+
		"\5\6\4\2\26\27\7\3\2\2\27\30\b\3\1\2\30\5\3\2\2\2\31\32\5\b\5\2\32\33"+
		"\7\4\2\2\33\34\b\4\1\2\34\35\5\6\4\2\35 \3\2\2\2\36 \3\2\2\2\37\31\3\2"+
		"\2\2\37\36\3\2\2\2 \7\3\2\2\2!\"\5\f\7\2\"#\5\n\6\2#\t\3\2\2\2$%\7\5\2"+
		"\2%&\5\f\7\2&\'\b\6\1\2\'(\5\n\6\2(\60\3\2\2\2)*\7\6\2\2*+\5\f\7\2+,\b"+
		"\6\1\2,-\5\n\6\2-\60\3\2\2\2.\60\3\2\2\2/$\3\2\2\2/)\3\2\2\2/.\3\2\2\2"+
		"\60\13\3\2\2\2\61\62\5\20\t\2\62\63\5\16\b\2\63\r\3\2\2\2\64\65\7\7\2"+
		"\2\65\66\5\20\t\2\66\67\b\b\1\2\678\5\16\b\28E\3\2\2\29:\7\b\2\2:;\5\20"+
		"\t\2;<\b\b\1\2<=\5\16\b\2=E\3\2\2\2>?\7\t\2\2?@\5\20\t\2@A\b\b\1\2AB\5"+
		"\16\b\2BE\3\2\2\2CE\3\2\2\2D\64\3\2\2\2D9\3\2\2\2D>\3\2\2\2DC\3\2\2\2"+
		"E\17\3\2\2\2FG\7\n\2\2GH\5\b\5\2HI\7\13\2\2IP\3\2\2\2JK\7\f\2\2KL\b\t"+
		"\1\2LP\b\t\1\2MN\7\r\2\2NP\b\t\1\2OF\3\2\2\2OJ\3\2\2\2OM\3\2\2\2P\21\3"+
		"\2\2\2\6\37/DO";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}