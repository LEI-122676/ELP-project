// Generated from C:/Users/patri/Desktop/ISCTE/ELP/ELP-project/src/main/kotlin/Javardair.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class JavardairParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, TYPE=6, VARIABLE=7, NUMBER=8, 
		DIGIT=9, OPERATOR=10, EQUAL=11, OPENPARENTHESIS=12, CLOSEPARENTHESIS=13, 
		OPENBRACKETS=14, CLOSEBRACKETS=15, COMMENT=16, SEPARATOR=17, WS=18;
	public static final int
		RULE_script = 0, RULE_instruction = 1, RULE_controlstructure = 2, RULE_assign = 3, 
		RULE_expression = 4, RULE_term = 5, RULE_print = 6, RULE_break = 7, RULE_ifelse = 8, 
		RULE_while = 9, RULE_guard = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "instruction", "controlstructure", "assign", "expression", 
			"term", "print", "break", "ifelse", "while", "guard"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "'break'", "'if'", "'else'", "'while'", null, null, 
			null, null, null, "':='", "'('", "')'", "'{'", "'}'", null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "TYPE", "VARIABLE", "NUMBER", "DIGIT", 
			"OPERATOR", "EQUAL", "OPENPARENTHESIS", "CLOSEPARENTHESIS", "OPENBRACKETS", 
			"CLOSEBRACKETS", "COMMENT", "SEPARATOR", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Javardair.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavardairParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavardairListener ) ((JavardairListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavardairListener ) ((JavardairListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavardairVisitor ) return ((JavardairVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				instruction();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 110L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstructionContext extends ParserRuleContext {
		public ControlstructureContext controlstructure() {
			return getRuleContext(ControlstructureContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public BreakContext break_() {
			return getRuleContext(BreakContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavardairListener ) ((JavardairListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavardairListener ) ((JavardairListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavardairVisitor ) return ((JavardairVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruction);
		try {
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				controlstructure();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				assign();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(29);
				print();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 4);
				{
				setState(30);
				break_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ControlstructureContext extends ParserRuleContext {
		public IfelseContext ifelse() {
			return getRuleContext(IfelseContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public ControlstructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlstructure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavardairListener ) ((JavardairListener)listener).enterControlstructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavardairListener ) ((JavardairListener)listener).exitControlstructure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavardairVisitor ) return ((JavardairVisitor<? extends T>)visitor).visitControlstructure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControlstructureContext controlstructure() throws RecognitionException {
		ControlstructureContext _localctx = new ControlstructureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_controlstructure);
		try {
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				ifelse();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				while_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(JavardairParser.TYPE, 0); }
		public TerminalNode VARIABLE() { return getToken(JavardairParser.VARIABLE, 0); }
		public TerminalNode EQUAL() { return getToken(JavardairParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEPARATOR() { return getToken(JavardairParser.SEPARATOR, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavardairListener ) ((JavardairListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavardairListener ) ((JavardairListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavardairVisitor ) return ((JavardairVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(TYPE);
			setState(38);
			match(VARIABLE);
			setState(39);
			match(EQUAL);
			setState(40);
			expression();
			setState(41);
			match(SEPARATOR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> OPERATOR() { return getTokens(JavardairParser.OPERATOR); }
		public TerminalNode OPERATOR(int i) {
			return getToken(JavardairParser.OPERATOR, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavardairListener ) ((JavardairListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavardairListener ) ((JavardairListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavardairVisitor ) return ((JavardairVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			term();
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERATOR) {
				{
				{
				setState(44);
				match(OPERATOR);
				setState(45);
				term();
				}
				}
				setState(50);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(JavardairParser.NUMBER, 0); }
		public TerminalNode VARIABLE() { return getToken(JavardairParser.VARIABLE, 0); }
		public TerminalNode OPENPARENTHESIS() { return getToken(JavardairParser.OPENPARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSEPARENTHESIS() { return getToken(JavardairParser.CLOSEPARENTHESIS, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavardairListener ) ((JavardairListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavardairListener ) ((JavardairListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavardairVisitor ) return ((JavardairVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_term);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				match(NUMBER);
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(VARIABLE);
				}
				break;
			case OPENPARENTHESIS:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				match(OPENPARENTHESIS);
				setState(54);
				expression();
				setState(55);
				match(CLOSEPARENTHESIS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEPARATOR() { return getToken(JavardairParser.SEPARATOR, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavardairListener ) ((JavardairListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavardairListener ) ((JavardairListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavardairVisitor ) return ((JavardairVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__0);
			setState(60);
			expression();
			setState(61);
			match(SEPARATOR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BreakContext extends ParserRuleContext {
		public TerminalNode SEPARATOR() { return getToken(JavardairParser.SEPARATOR, 0); }
		public BreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavardairListener ) ((JavardairListener)listener).enterBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavardairListener ) ((JavardairListener)listener).exitBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavardairVisitor ) return ((JavardairVisitor<? extends T>)visitor).visitBreak(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakContext break_() throws RecognitionException {
		BreakContext _localctx = new BreakContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_break);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__1);
			setState(64);
			match(SEPARATOR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfelseContext extends ParserRuleContext {
		public InstructionContext ifSequence;
		public InstructionContext elseSequence;
		public GuardContext guard() {
			return getRuleContext(GuardContext.class,0);
		}
		public List<TerminalNode> OPENBRACKETS() { return getTokens(JavardairParser.OPENBRACKETS); }
		public TerminalNode OPENBRACKETS(int i) {
			return getToken(JavardairParser.OPENBRACKETS, i);
		}
		public List<TerminalNode> CLOSEBRACKETS() { return getTokens(JavardairParser.CLOSEBRACKETS); }
		public TerminalNode CLOSEBRACKETS(int i) {
			return getToken(JavardairParser.CLOSEBRACKETS, i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public IfelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifelse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavardairListener ) ((JavardairListener)listener).enterIfelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavardairListener ) ((JavardairListener)listener).exitIfelse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavardairVisitor ) return ((JavardairVisitor<? extends T>)visitor).visitIfelse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfelseContext ifelse() throws RecognitionException {
		IfelseContext _localctx = new IfelseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifelse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__2);
			setState(67);
			guard();
			setState(68);
			match(OPENBRACKETS);
			setState(70); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(69);
				((IfelseContext)_localctx).ifSequence = instruction();
				}
				}
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 110L) != 0) );
			setState(74);
			match(CLOSEBRACKETS);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(75);
				match(T__3);
				setState(76);
				match(OPENBRACKETS);
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(77);
					((IfelseContext)_localctx).elseSequence = instruction();
					}
					}
					setState(80); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 110L) != 0) );
				setState(82);
				match(CLOSEBRACKETS);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ParserRuleContext {
		public InstructionContext sequence;
		public GuardContext guard() {
			return getRuleContext(GuardContext.class,0);
		}
		public TerminalNode OPENBRACKETS() { return getToken(JavardairParser.OPENBRACKETS, 0); }
		public TerminalNode CLOSEBRACKETS() { return getToken(JavardairParser.CLOSEBRACKETS, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavardairListener ) ((JavardairListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavardairListener ) ((JavardairListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavardairVisitor ) return ((JavardairVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__4);
			setState(87);
			guard();
			setState(88);
			match(OPENBRACKETS);
			setState(90); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(89);
				((WhileContext)_localctx).sequence = instruction();
				}
				}
				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 110L) != 0) );
			setState(94);
			match(CLOSEBRACKETS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GuardContext extends ParserRuleContext {
		public TerminalNode OPENPARENTHESIS() { return getToken(JavardairParser.OPENPARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSEPARENTHESIS() { return getToken(JavardairParser.CLOSEPARENTHESIS, 0); }
		public GuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavardairListener ) ((JavardairListener)listener).enterGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavardairListener ) ((JavardairListener)listener).exitGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavardairVisitor ) return ((JavardairVisitor<? extends T>)visitor).visitGuard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GuardContext guard() throws RecognitionException {
		GuardContext _localctx = new GuardContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_guard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(OPENPARENTHESIS);
			setState(97);
			expression();
			setState(98);
			match(CLOSEPARENTHESIS);
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
		"\u0004\u0001\u0012e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0004\u0000\u0018"+
		"\b\u0000\u000b\u0000\f\u0000\u0019\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001 \b\u0001\u0001\u0002\u0001\u0002\u0003\u0002"+
		"$\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004/\b\u0004"+
		"\n\u0004\f\u00042\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005:\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0004\bG\b\b\u000b\b\f\bH\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0004\bO\b\b\u000b\b\f\bP\u0001\b\u0001\b\u0003\bU\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0004\t[\b\t\u000b\t\f\t\\\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0000\u0000\u000b\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0000\u0000e\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0002\u001f\u0001\u0000\u0000\u0000\u0004#\u0001\u0000\u0000\u0000"+
		"\u0006%\u0001\u0000\u0000\u0000\b+\u0001\u0000\u0000\u0000\n9\u0001\u0000"+
		"\u0000\u0000\f;\u0001\u0000\u0000\u0000\u000e?\u0001\u0000\u0000\u0000"+
		"\u0010B\u0001\u0000\u0000\u0000\u0012V\u0001\u0000\u0000\u0000\u0014`"+
		"\u0001\u0000\u0000\u0000\u0016\u0018\u0003\u0002\u0001\u0000\u0017\u0016"+
		"\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u0017"+
		"\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u0001"+
		"\u0001\u0000\u0000\u0000\u001b \u0003\u0004\u0002\u0000\u001c \u0003\u0006"+
		"\u0003\u0000\u001d \u0003\f\u0006\u0000\u001e \u0003\u000e\u0007\u0000"+
		"\u001f\u001b\u0001\u0000\u0000\u0000\u001f\u001c\u0001\u0000\u0000\u0000"+
		"\u001f\u001d\u0001\u0000\u0000\u0000\u001f\u001e\u0001\u0000\u0000\u0000"+
		" \u0003\u0001\u0000\u0000\u0000!$\u0003\u0010\b\u0000\"$\u0003\u0012\t"+
		"\u0000#!\u0001\u0000\u0000\u0000#\"\u0001\u0000\u0000\u0000$\u0005\u0001"+
		"\u0000\u0000\u0000%&\u0005\u0006\u0000\u0000&\'\u0005\u0007\u0000\u0000"+
		"\'(\u0005\u000b\u0000\u0000()\u0003\b\u0004\u0000)*\u0005\u0011\u0000"+
		"\u0000*\u0007\u0001\u0000\u0000\u0000+0\u0003\n\u0005\u0000,-\u0005\n"+
		"\u0000\u0000-/\u0003\n\u0005\u0000.,\u0001\u0000\u0000\u0000/2\u0001\u0000"+
		"\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u00001\t\u0001"+
		"\u0000\u0000\u000020\u0001\u0000\u0000\u00003:\u0005\b\u0000\u00004:\u0005"+
		"\u0007\u0000\u000056\u0005\f\u0000\u000067\u0003\b\u0004\u000078\u0005"+
		"\r\u0000\u00008:\u0001\u0000\u0000\u000093\u0001\u0000\u0000\u000094\u0001"+
		"\u0000\u0000\u000095\u0001\u0000\u0000\u0000:\u000b\u0001\u0000\u0000"+
		"\u0000;<\u0005\u0001\u0000\u0000<=\u0003\b\u0004\u0000=>\u0005\u0011\u0000"+
		"\u0000>\r\u0001\u0000\u0000\u0000?@\u0005\u0002\u0000\u0000@A\u0005\u0011"+
		"\u0000\u0000A\u000f\u0001\u0000\u0000\u0000BC\u0005\u0003\u0000\u0000"+
		"CD\u0003\u0014\n\u0000DF\u0005\u000e\u0000\u0000EG\u0003\u0002\u0001\u0000"+
		"FE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000"+
		"\u0000HI\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JT\u0005\u000f"+
		"\u0000\u0000KL\u0005\u0004\u0000\u0000LN\u0005\u000e\u0000\u0000MO\u0003"+
		"\u0002\u0001\u0000NM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000"+
		"PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000"+
		"\u0000RS\u0005\u000f\u0000\u0000SU\u0001\u0000\u0000\u0000TK\u0001\u0000"+
		"\u0000\u0000TU\u0001\u0000\u0000\u0000U\u0011\u0001\u0000\u0000\u0000"+
		"VW\u0005\u0005\u0000\u0000WX\u0003\u0014\n\u0000XZ\u0005\u000e\u0000\u0000"+
		"Y[\u0003\u0002\u0001\u0000ZY\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000"+
		"\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0001\u0000"+
		"\u0000\u0000^_\u0005\u000f\u0000\u0000_\u0013\u0001\u0000\u0000\u0000"+
		"`a\u0005\f\u0000\u0000ab\u0003\b\u0004\u0000bc\u0005\r\u0000\u0000c\u0015"+
		"\u0001\u0000\u0000\u0000\t\u0019\u001f#09HPT\\";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}