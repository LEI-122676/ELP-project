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
		T__0=1, T__1=2, T__2=3, T__3=4, BREAK=5, MUT=6, CONST=7, IN=8, BOOLEAN=9, 
		VARIABLE=10, STRING=11, NUMBER=12, DIGIT=13, OPERATOR=14, COMPOUNDOP=15, 
		EQUAL=16, OPENPARENTHESIS=17, CLOSEPARENTHESIS=18, OPENBLOCK=19, CLOSEBLOCK=20, 
		ACCESS=21, COMMENT=22, SEPARATOR=23, WS=24;
	public static final int
		RULE_script = 0, RULE_instruction = 1, RULE_controlstructure = 2, RULE_assign = 3, 
		RULE_type = 4, RULE_expression = 5, RULE_term = 6, RULE_print = 7, RULE_break = 8, 
		RULE_ifelse = 9, RULE_forloop = 10, RULE_guard = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "instruction", "controlstructure", "assign", "type", "expression", 
			"term", "print", "break", "ifelse", "forloop", "guard"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "'if'", "'else'", "'for'", "'break'", "'mut'", "'const'", 
			"'>>>'", null, null, null, null, null, null, null, "':='", "'('", "')'", 
			"'<<'", "'>>'", "'..'", null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "BREAK", "MUT", "CONST", "IN", "BOOLEAN", 
			"VARIABLE", "STRING", "NUMBER", "DIGIT", "OPERATOR", "COMPOUNDOP", "EQUAL", 
			"OPENPARENTHESIS", "CLOSEPARENTHESIS", "OPENBLOCK", "CLOSEBLOCK", "ACCESS", 
			"COMMENT", "SEPARATOR", "WS"
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
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				instruction();
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1270L) != 0) );
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
		public BreakContext break_() {
			return getRuleContext(BreakContext.class,0);
		}
		public ControlstructureContext controlstructure() {
			return getRuleContext(ControlstructureContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
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
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				break_();
				}
				break;
			case T__1:
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				controlstructure();
				}
				break;
			case MUT:
			case CONST:
			case VARIABLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				assign();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 4);
				{
				setState(32);
				print();
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
		public ForloopContext forloop() {
			return getRuleContext(ForloopContext.class,0);
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
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				ifelse();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				forloop();
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(JavardairParser.VARIABLE, 0); }
		public TerminalNode EQUAL() { return getToken(JavardairParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEPARATOR() { return getToken(JavardairParser.SEPARATOR, 0); }
		public TerminalNode COMPOUNDOP() { return getToken(JavardairParser.COMPOUNDOP, 0); }
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
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUT:
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				type();
				setState(40);
				match(VARIABLE);
				setState(41);
				match(EQUAL);
				setState(42);
				expression();
				setState(43);
				match(SEPARATOR);
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(VARIABLE);
				setState(46);
				match(COMPOUNDOP);
				setState(47);
				expression();
				setState(48);
				match(SEPARATOR);
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode MUT() { return getToken(JavardairParser.MUT, 0); }
		public TerminalNode CONST() { return getToken(JavardairParser.CONST, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavardairListener ) ((JavardairListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavardairListener ) ((JavardairListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavardairVisitor ) return ((JavardairVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_la = _input.LA(1);
			if ( !(_la==MUT || _la==CONST) ) {
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
		enterRule(_localctx, 10, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			term();
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERATOR) {
				{
				{
				setState(55);
				match(OPERATOR);
				setState(56);
				term();
				}
				}
				setState(61);
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
		public TerminalNode BOOLEAN() { return getToken(JavardairParser.BOOLEAN, 0); }
		public TerminalNode NUMBER() { return getToken(JavardairParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(JavardairParser.STRING, 0); }
		public List<TerminalNode> VARIABLE() { return getTokens(JavardairParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(JavardairParser.VARIABLE, i);
		}
		public List<TerminalNode> ACCESS() { return getTokens(JavardairParser.ACCESS); }
		public TerminalNode ACCESS(int i) {
			return getToken(JavardairParser.ACCESS, i);
		}
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
		enterRule(_localctx, 12, RULE_term);
		int _la;
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(BOOLEAN);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				match(STRING);
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				match(VARIABLE);
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ACCESS) {
					{
					{
					setState(66);
					match(ACCESS);
					setState(67);
					match(VARIABLE);
					}
					}
					setState(72);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case OPENPARENTHESIS:
				enterOuterAlt(_localctx, 5);
				{
				setState(73);
				match(OPENPARENTHESIS);
				setState(74);
				expression();
				setState(75);
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
		public TerminalNode OPENPARENTHESIS() { return getToken(JavardairParser.OPENPARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSEPARENTHESIS() { return getToken(JavardairParser.CLOSEPARENTHESIS, 0); }
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
		enterRule(_localctx, 14, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__0);
			setState(80);
			match(OPENPARENTHESIS);
			setState(81);
			expression();
			setState(82);
			match(CLOSEPARENTHESIS);
			setState(83);
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
		public TerminalNode BREAK() { return getToken(JavardairParser.BREAK, 0); }
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
		enterRule(_localctx, 16, RULE_break);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(BREAK);
			setState(86);
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
		public List<TerminalNode> OPENBLOCK() { return getTokens(JavardairParser.OPENBLOCK); }
		public TerminalNode OPENBLOCK(int i) {
			return getToken(JavardairParser.OPENBLOCK, i);
		}
		public List<TerminalNode> CLOSEBLOCK() { return getTokens(JavardairParser.CLOSEBLOCK); }
		public TerminalNode CLOSEBLOCK(int i) {
			return getToken(JavardairParser.CLOSEBLOCK, i);
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
		enterRule(_localctx, 18, RULE_ifelse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__1);
			setState(89);
			guard();
			setState(90);
			match(OPENBLOCK);
			setState(92); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(91);
				((IfelseContext)_localctx).ifSequence = instruction();
				}
				}
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1270L) != 0) );
			setState(96);
			match(CLOSEBLOCK);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(97);
				match(T__2);
				setState(98);
				match(OPENBLOCK);
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(99);
					((IfelseContext)_localctx).elseSequence = instruction();
					}
					}
					setState(102); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1270L) != 0) );
				setState(104);
				match(CLOSEBLOCK);
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
	public static class ForloopContext extends ParserRuleContext {
		public InstructionContext sequence;
		public TerminalNode OPENPARENTHESIS() { return getToken(JavardairParser.OPENPARENTHESIS, 0); }
		public TerminalNode VARIABLE() { return getToken(JavardairParser.VARIABLE, 0); }
		public TerminalNode IN() { return getToken(JavardairParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSEPARENTHESIS() { return getToken(JavardairParser.CLOSEPARENTHESIS, 0); }
		public TerminalNode OPENBLOCK() { return getToken(JavardairParser.OPENBLOCK, 0); }
		public TerminalNode CLOSEBLOCK() { return getToken(JavardairParser.CLOSEBLOCK, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public ForloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavardairListener ) ((JavardairListener)listener).enterForloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavardairListener ) ((JavardairListener)listener).exitForloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavardairVisitor ) return ((JavardairVisitor<? extends T>)visitor).visitForloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForloopContext forloop() throws RecognitionException {
		ForloopContext _localctx = new ForloopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forloop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__3);
			setState(109);
			match(OPENPARENTHESIS);
			setState(110);
			match(VARIABLE);
			setState(111);
			match(IN);
			setState(112);
			expression();
			setState(113);
			match(CLOSEPARENTHESIS);
			setState(114);
			match(OPENBLOCK);
			setState(116); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(115);
				((ForloopContext)_localctx).sequence = instruction();
				}
				}
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1270L) != 0) );
			setState(120);
			match(CLOSEBLOCK);
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
		enterRule(_localctx, 22, RULE_guard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(OPENPARENTHESIS);
			setState(123);
			expression();
			setState(124);
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
		"\u0004\u0001\u0018\u007f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0001\u0000\u0004\u0000\u001a\b\u0000\u000b\u0000\f\u0000\u001b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\"\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0003\u0002&\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u00033\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005:\b\u0005\n\u0005"+
		"\f\u0005=\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006E\b\u0006\n\u0006\f\u0006H\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006N\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t]\b\t\u000b"+
		"\t\f\t^\u0001\t\u0001\t\u0001\t\u0001\t\u0004\te\b\t\u000b\t\f\tf\u0001"+
		"\t\u0001\t\u0003\tk\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0004\nu\b\n\u000b\n\f\nv\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0000\u0000\f\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0001\u0001\u0000"+
		"\u0006\u0007\u0082\u0000\u0019\u0001\u0000\u0000\u0000\u0002!\u0001\u0000"+
		"\u0000\u0000\u0004%\u0001\u0000\u0000\u0000\u00062\u0001\u0000\u0000\u0000"+
		"\b4\u0001\u0000\u0000\u0000\n6\u0001\u0000\u0000\u0000\fM\u0001\u0000"+
		"\u0000\u0000\u000eO\u0001\u0000\u0000\u0000\u0010U\u0001\u0000\u0000\u0000"+
		"\u0012X\u0001\u0000\u0000\u0000\u0014l\u0001\u0000\u0000\u0000\u0016z"+
		"\u0001\u0000\u0000\u0000\u0018\u001a\u0003\u0002\u0001\u0000\u0019\u0018"+
		"\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u0019"+
		"\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u0001"+
		"\u0001\u0000\u0000\u0000\u001d\"\u0003\u0010\b\u0000\u001e\"\u0003\u0004"+
		"\u0002\u0000\u001f\"\u0003\u0006\u0003\u0000 \"\u0003\u000e\u0007\u0000"+
		"!\u001d\u0001\u0000\u0000\u0000!\u001e\u0001\u0000\u0000\u0000!\u001f"+
		"\u0001\u0000\u0000\u0000! \u0001\u0000\u0000\u0000\"\u0003\u0001\u0000"+
		"\u0000\u0000#&\u0003\u0012\t\u0000$&\u0003\u0014\n\u0000%#\u0001\u0000"+
		"\u0000\u0000%$\u0001\u0000\u0000\u0000&\u0005\u0001\u0000\u0000\u0000"+
		"\'(\u0003\b\u0004\u0000()\u0005\n\u0000\u0000)*\u0005\u0010\u0000\u0000"+
		"*+\u0003\n\u0005\u0000+,\u0005\u0017\u0000\u0000,3\u0001\u0000\u0000\u0000"+
		"-.\u0005\n\u0000\u0000./\u0005\u000f\u0000\u0000/0\u0003\n\u0005\u0000"+
		"01\u0005\u0017\u0000\u000013\u0001\u0000\u0000\u00002\'\u0001\u0000\u0000"+
		"\u00002-\u0001\u0000\u0000\u00003\u0007\u0001\u0000\u0000\u000045\u0007"+
		"\u0000\u0000\u00005\t\u0001\u0000\u0000\u00006;\u0003\f\u0006\u000078"+
		"\u0005\u000e\u0000\u00008:\u0003\f\u0006\u000097\u0001\u0000\u0000\u0000"+
		":=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000"+
		"\u0000<\u000b\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000>N\u0005"+
		"\t\u0000\u0000?N\u0005\f\u0000\u0000@N\u0005\u000b\u0000\u0000AF\u0005"+
		"\n\u0000\u0000BC\u0005\u0015\u0000\u0000CE\u0005\n\u0000\u0000DB\u0001"+
		"\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000"+
		"FG\u0001\u0000\u0000\u0000GN\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000"+
		"\u0000IJ\u0005\u0011\u0000\u0000JK\u0003\n\u0005\u0000KL\u0005\u0012\u0000"+
		"\u0000LN\u0001\u0000\u0000\u0000M>\u0001\u0000\u0000\u0000M?\u0001\u0000"+
		"\u0000\u0000M@\u0001\u0000\u0000\u0000MA\u0001\u0000\u0000\u0000MI\u0001"+
		"\u0000\u0000\u0000N\r\u0001\u0000\u0000\u0000OP\u0005\u0001\u0000\u0000"+
		"PQ\u0005\u0011\u0000\u0000QR\u0003\n\u0005\u0000RS\u0005\u0012\u0000\u0000"+
		"ST\u0005\u0017\u0000\u0000T\u000f\u0001\u0000\u0000\u0000UV\u0005\u0005"+
		"\u0000\u0000VW\u0005\u0017\u0000\u0000W\u0011\u0001\u0000\u0000\u0000"+
		"XY\u0005\u0002\u0000\u0000YZ\u0003\u0016\u000b\u0000Z\\\u0005\u0013\u0000"+
		"\u0000[]\u0003\u0002\u0001\u0000\\[\u0001\u0000\u0000\u0000]^\u0001\u0000"+
		"\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0001"+
		"\u0000\u0000\u0000`j\u0005\u0014\u0000\u0000ab\u0005\u0003\u0000\u0000"+
		"bd\u0005\u0013\u0000\u0000ce\u0003\u0002\u0001\u0000dc\u0001\u0000\u0000"+
		"\u0000ef\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0005\u0014\u0000\u0000ik\u0001"+
		"\u0000\u0000\u0000ja\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000"+
		"k\u0013\u0001\u0000\u0000\u0000lm\u0005\u0004\u0000\u0000mn\u0005\u0011"+
		"\u0000\u0000no\u0005\n\u0000\u0000op\u0005\b\u0000\u0000pq\u0003\n\u0005"+
		"\u0000qr\u0005\u0012\u0000\u0000rt\u0005\u0013\u0000\u0000su\u0003\u0002"+
		"\u0001\u0000ts\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vt\u0001"+
		"\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000"+
		"xy\u0005\u0014\u0000\u0000y\u0015\u0001\u0000\u0000\u0000z{\u0005\u0011"+
		"\u0000\u0000{|\u0003\n\u0005\u0000|}\u0005\u0012\u0000\u0000}\u0017\u0001"+
		"\u0000\u0000\u0000\u000b\u001b!%2;FM^fjv";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}