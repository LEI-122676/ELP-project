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
		T__0=1, T__1=2, T__2=3, T__3=4, BREAK=5, MUT=6, CONST=7, IN=8, VARIABLE=9, 
		STRING=10, NUMBER=11, DIGIT=12, OPERATOR=13, COMPOUNDOP=14, EQUAL=15, 
		OPENPARENTHESIS=16, CLOSEPARENTHESIS=17, OPENBLOCK=18, CLOSEBLOCK=19, 
		ACCESS=20, COMMENT=21, SEPARATOR=22, WS=23;
	public static final int
		RULE_script = 0, RULE_instruction = 1, RULE_controlstructure = 2, RULE_assign = 3, 
		RULE_compoundassign = 4, RULE_type = 5, RULE_expression = 6, RULE_term = 7, 
		RULE_print = 8, RULE_break = 9, RULE_ifelse = 10, RULE_forloop = 11, RULE_guard = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "instruction", "controlstructure", "assign", "compoundassign", 
			"type", "expression", "term", "print", "break", "ifelse", "forloop", 
			"guard"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "'if'", "'else'", "'for'", "'break'", "'mut'", "'const'", 
			"'>>>'", null, null, null, null, null, null, "':='", "'('", "')'", "'<<'", 
			"'>>'", "'..'", null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "BREAK", "MUT", "CONST", "IN", "VARIABLE", 
			"STRING", "NUMBER", "DIGIT", "OPERATOR", "COMPOUNDOP", "EQUAL", "OPENPARENTHESIS", 
			"CLOSEPARENTHESIS", "OPENBLOCK", "CLOSEBLOCK", "ACCESS", "COMMENT", "SEPARATOR", 
			"WS"
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
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				instruction();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 758L) != 0) );
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
		public CompoundassignContext compoundassign() {
			return getRuleContext(CompoundassignContext.class,0);
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
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				break_();
				}
				break;
			case T__1:
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				controlstructure();
				}
				break;
			case MUT:
			case CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				assign();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(34);
				compoundassign();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 5);
				{
				setState(35);
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
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				ifelse();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
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
			setState(42);
			type();
			setState(43);
			match(VARIABLE);
			setState(44);
			match(EQUAL);
			setState(45);
			expression();
			setState(46);
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
	public static class CompoundassignContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(JavardairParser.VARIABLE, 0); }
		public TerminalNode COMPOUNDOP() { return getToken(JavardairParser.COMPOUNDOP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEPARATOR() { return getToken(JavardairParser.SEPARATOR, 0); }
		public CompoundassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundassign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavardairListener ) ((JavardairListener)listener).enterCompoundassign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavardairListener ) ((JavardairListener)listener).exitCompoundassign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavardairVisitor ) return ((JavardairVisitor<? extends T>)visitor).visitCompoundassign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundassignContext compoundassign() throws RecognitionException {
		CompoundassignContext _localctx = new CompoundassignContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_compoundassign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(VARIABLE);
			setState(49);
			match(COMPOUNDOP);
			setState(50);
			expression();
			setState(51);
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
		enterRule(_localctx, 10, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
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
		enterRule(_localctx, 12, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			term();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERATOR) {
				{
				{
				setState(56);
				match(OPERATOR);
				setState(57);
				term();
				}
				}
				setState(62);
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
		enterRule(_localctx, 14, RULE_term);
		int _la;
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(STRING);
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 3);
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
				enterOuterAlt(_localctx, 4);
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
		enterRule(_localctx, 16, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__0);
			setState(80);
			expression();
			setState(81);
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
		enterRule(_localctx, 18, RULE_break);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(BREAK);
			setState(84);
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
		enterRule(_localctx, 20, RULE_ifelse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__1);
			setState(87);
			guard();
			setState(88);
			match(OPENBLOCK);
			setState(90); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(89);
				((IfelseContext)_localctx).ifSequence = instruction();
				}
				}
				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 758L) != 0) );
			setState(94);
			match(CLOSEBLOCK);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(95);
				match(T__2);
				setState(96);
				match(OPENBLOCK);
				setState(98); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(97);
					((IfelseContext)_localctx).elseSequence = instruction();
					}
					}
					setState(100); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 758L) != 0) );
				setState(102);
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
		enterRule(_localctx, 22, RULE_forloop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__3);
			setState(107);
			match(OPENPARENTHESIS);
			setState(108);
			match(VARIABLE);
			setState(109);
			match(IN);
			setState(110);
			expression();
			setState(111);
			match(CLOSEPARENTHESIS);
			setState(112);
			match(OPENBLOCK);
			setState(114); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(113);
				((ForloopContext)_localctx).sequence = instruction();
				}
				}
				setState(116); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 758L) != 0) );
			setState(118);
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
		enterRule(_localctx, 24, RULE_guard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(OPENPARENTHESIS);
			setState(121);
			expression();
			setState(122);
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
		"\u0004\u0001\u0017}\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0004\u0000\u001c\b\u0000\u000b\u0000\f\u0000\u001d"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"%\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002)\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006;\b\u0006\n\u0006\f\u0006>\t"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007E\b\u0007\n\u0007\f\u0007H\t\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007N\b\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0004\n[\b"+
		"\n\u000b\n\f\n\\\u0001\n\u0001\n\u0001\n\u0001\n\u0004\nc\b\n\u000b\n"+
		"\f\nd\u0001\n\u0001\n\u0003\ni\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b"+
		"s\b\u000b\u000b\u000b\f\u000bt\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0000\u0000\r\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u0000\u0001\u0001\u0000\u0006\u0007~\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0002$\u0001\u0000\u0000\u0000\u0004(\u0001"+
		"\u0000\u0000\u0000\u0006*\u0001\u0000\u0000\u0000\b0\u0001\u0000\u0000"+
		"\u0000\n5\u0001\u0000\u0000\u0000\f7\u0001\u0000\u0000\u0000\u000eM\u0001"+
		"\u0000\u0000\u0000\u0010O\u0001\u0000\u0000\u0000\u0012S\u0001\u0000\u0000"+
		"\u0000\u0014V\u0001\u0000\u0000\u0000\u0016j\u0001\u0000\u0000\u0000\u0018"+
		"x\u0001\u0000\u0000\u0000\u001a\u001c\u0003\u0002\u0001\u0000\u001b\u001a"+
		"\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001b"+
		"\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u0001"+
		"\u0001\u0000\u0000\u0000\u001f%\u0003\u0012\t\u0000 %\u0003\u0004\u0002"+
		"\u0000!%\u0003\u0006\u0003\u0000\"%\u0003\b\u0004\u0000#%\u0003\u0010"+
		"\b\u0000$\u001f\u0001\u0000\u0000\u0000$ \u0001\u0000\u0000\u0000$!\u0001"+
		"\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000$#\u0001\u0000\u0000\u0000"+
		"%\u0003\u0001\u0000\u0000\u0000&)\u0003\u0014\n\u0000\')\u0003\u0016\u000b"+
		"\u0000(&\u0001\u0000\u0000\u0000(\'\u0001\u0000\u0000\u0000)\u0005\u0001"+
		"\u0000\u0000\u0000*+\u0003\n\u0005\u0000+,\u0005\t\u0000\u0000,-\u0005"+
		"\u000f\u0000\u0000-.\u0003\f\u0006\u0000./\u0005\u0016\u0000\u0000/\u0007"+
		"\u0001\u0000\u0000\u000001\u0005\t\u0000\u000012\u0005\u000e\u0000\u0000"+
		"23\u0003\f\u0006\u000034\u0005\u0016\u0000\u00004\t\u0001\u0000\u0000"+
		"\u000056\u0007\u0000\u0000\u00006\u000b\u0001\u0000\u0000\u00007<\u0003"+
		"\u000e\u0007\u000089\u0005\r\u0000\u00009;\u0003\u000e\u0007\u0000:8\u0001"+
		"\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000"+
		"<=\u0001\u0000\u0000\u0000=\r\u0001\u0000\u0000\u0000><\u0001\u0000\u0000"+
		"\u0000?N\u0005\u000b\u0000\u0000@N\u0005\n\u0000\u0000AF\u0005\t\u0000"+
		"\u0000BC\u0005\u0014\u0000\u0000CE\u0005\t\u0000\u0000DB\u0001\u0000\u0000"+
		"\u0000EH\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000"+
		"\u0000\u0000GN\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000IJ\u0005"+
		"\u0010\u0000\u0000JK\u0003\f\u0006\u0000KL\u0005\u0011\u0000\u0000LN\u0001"+
		"\u0000\u0000\u0000M?\u0001\u0000\u0000\u0000M@\u0001\u0000\u0000\u0000"+
		"MA\u0001\u0000\u0000\u0000MI\u0001\u0000\u0000\u0000N\u000f\u0001\u0000"+
		"\u0000\u0000OP\u0005\u0001\u0000\u0000PQ\u0003\f\u0006\u0000QR\u0005\u0016"+
		"\u0000\u0000R\u0011\u0001\u0000\u0000\u0000ST\u0005\u0005\u0000\u0000"+
		"TU\u0005\u0016\u0000\u0000U\u0013\u0001\u0000\u0000\u0000VW\u0005\u0002"+
		"\u0000\u0000WX\u0003\u0018\f\u0000XZ\u0005\u0012\u0000\u0000Y[\u0003\u0002"+
		"\u0001\u0000ZY\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\Z\u0001"+
		"\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000"+
		"^h\u0005\u0013\u0000\u0000_`\u0005\u0003\u0000\u0000`b\u0005\u0012\u0000"+
		"\u0000ac\u0003\u0002\u0001\u0000ba\u0001\u0000\u0000\u0000cd\u0001\u0000"+
		"\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0001"+
		"\u0000\u0000\u0000fg\u0005\u0013\u0000\u0000gi\u0001\u0000\u0000\u0000"+
		"h_\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000i\u0015\u0001\u0000"+
		"\u0000\u0000jk\u0005\u0004\u0000\u0000kl\u0005\u0010\u0000\u0000lm\u0005"+
		"\t\u0000\u0000mn\u0005\b\u0000\u0000no\u0003\f\u0006\u0000op\u0005\u0011"+
		"\u0000\u0000pr\u0005\u0012\u0000\u0000qs\u0003\u0002\u0001\u0000rq\u0001"+
		"\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000"+
		"tu\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0005\u0013\u0000"+
		"\u0000w\u0017\u0001\u0000\u0000\u0000xy\u0005\u0010\u0000\u0000yz\u0003"+
		"\f\u0006\u0000z{\u0005\u0011\u0000\u0000{\u0019\u0001\u0000\u0000\u0000"+
		"\n\u001d$(<FM\\dht";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}