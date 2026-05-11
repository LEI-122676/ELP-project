// Generated from /mnt/SharedData/documents/university/3-ano/2-sem/ELP/project/project/src/main/kotlin/Javardair.g4 by ANTLR 4.13.2
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
		STRING=10, NUMBER=11, DIGIT=12, OPERATOR=13, EQUAL=14, OPENPARENTHESIS=15, 
		CLOSEPARENTHESIS=16, OPENBLOCK=17, CLOSEBLOCK=18, ACCESS=19, COMMENT=20, 
		SEPARATOR=21, WS=22;
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
			"'>>>'", null, null, null, null, null, "':='", "'('", "')'", "'<<'", 
			"'>>'", "'..'", null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "BREAK", "MUT", "CONST", "IN", "VARIABLE", 
			"STRING", "NUMBER", "DIGIT", "OPERATOR", "EQUAL", "OPENPARENTHESIS", 
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 246L) != 0) );
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
			setState(45);
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
			setState(47);
			term();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERATOR) {
				{
				{
				setState(48);
				match(OPERATOR);
				setState(49);
				term();
				}
				}
				setState(54);
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
		enterRule(_localctx, 12, RULE_term);
		int _la;
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(STRING);
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				match(VARIABLE);
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ACCESS) {
					{
					{
					setState(58);
					match(ACCESS);
					setState(59);
					match(VARIABLE);
					}
					}
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case OPENPARENTHESIS:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				match(OPENPARENTHESIS);
				setState(66);
				expression();
				setState(67);
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
		enterRule(_localctx, 14, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__0);
			setState(72);
			expression();
			setState(73);
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
			setState(75);
			match(BREAK);
			setState(76);
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
			setState(78);
			match(T__1);
			setState(79);
			guard();
			setState(80);
			match(OPENBLOCK);
			setState(82); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(81);
				((IfelseContext)_localctx).ifSequence = instruction();
				}
				}
				setState(84); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 246L) != 0) );
			setState(86);
			match(CLOSEBLOCK);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(87);
				match(T__2);
				setState(88);
				match(OPENBLOCK);
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(89);
					((IfelseContext)_localctx).elseSequence = instruction();
					}
					}
					setState(92); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 246L) != 0) );
				setState(94);
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
			setState(98);
			match(T__3);
			setState(99);
			match(OPENPARENTHESIS);
			setState(100);
			match(VARIABLE);
			setState(101);
			match(IN);
			setState(102);
			expression();
			setState(103);
			match(CLOSEPARENTHESIS);
			setState(104);
			match(OPENBLOCK);
			setState(106); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(105);
				((ForloopContext)_localctx).sequence = instruction();
				}
				}
				setState(108); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 246L) != 0) );
			setState(110);
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
			setState(112);
			match(OPENPARENTHESIS);
			setState(113);
			expression();
			setState(114);
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
		"\u0004\u0001\u0016u\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0004\u0000\u001a\b\u0000\u000b\u0000\f\u0000\u001b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\"\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0003\u0002&\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u00053\b\u0005\n\u0005\f\u00056\t\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"=\b\u0006\n\u0006\f\u0006@\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006F\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0004"+
		"\tS\b\t\u000b\t\f\tT\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t[\b\t\u000b"+
		"\t\f\t\\\u0001\t\u0001\t\u0003\ta\b\t\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0004\nk\b\n\u000b\n\f\nl\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0000\u0000"+
		"\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0001"+
		"\u0001\u0000\u0006\u0007v\u0000\u0019\u0001\u0000\u0000\u0000\u0002!\u0001"+
		"\u0000\u0000\u0000\u0004%\u0001\u0000\u0000\u0000\u0006\'\u0001\u0000"+
		"\u0000\u0000\b-\u0001\u0000\u0000\u0000\n/\u0001\u0000\u0000\u0000\fE"+
		"\u0001\u0000\u0000\u0000\u000eG\u0001\u0000\u0000\u0000\u0010K\u0001\u0000"+
		"\u0000\u0000\u0012N\u0001\u0000\u0000\u0000\u0014b\u0001\u0000\u0000\u0000"+
		"\u0016p\u0001\u0000\u0000\u0000\u0018\u001a\u0003\u0002\u0001\u0000\u0019"+
		"\u0018\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b"+
		"\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c"+
		"\u0001\u0001\u0000\u0000\u0000\u001d\"\u0003\u0010\b\u0000\u001e\"\u0003"+
		"\u0004\u0002\u0000\u001f\"\u0003\u0006\u0003\u0000 \"\u0003\u000e\u0007"+
		"\u0000!\u001d\u0001\u0000\u0000\u0000!\u001e\u0001\u0000\u0000\u0000!"+
		"\u001f\u0001\u0000\u0000\u0000! \u0001\u0000\u0000\u0000\"\u0003\u0001"+
		"\u0000\u0000\u0000#&\u0003\u0012\t\u0000$&\u0003\u0014\n\u0000%#\u0001"+
		"\u0000\u0000\u0000%$\u0001\u0000\u0000\u0000&\u0005\u0001\u0000\u0000"+
		"\u0000\'(\u0003\b\u0004\u0000()\u0005\t\u0000\u0000)*\u0005\u000e\u0000"+
		"\u0000*+\u0003\n\u0005\u0000+,\u0005\u0015\u0000\u0000,\u0007\u0001\u0000"+
		"\u0000\u0000-.\u0007\u0000\u0000\u0000.\t\u0001\u0000\u0000\u0000/4\u0003"+
		"\f\u0006\u000001\u0005\r\u0000\u000013\u0003\f\u0006\u000020\u0001\u0000"+
		"\u0000\u000036\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000045\u0001"+
		"\u0000\u0000\u00005\u000b\u0001\u0000\u0000\u000064\u0001\u0000\u0000"+
		"\u00007F\u0005\u000b\u0000\u00008F\u0005\n\u0000\u00009>\u0005\t\u0000"+
		"\u0000:;\u0005\u0013\u0000\u0000;=\u0005\t\u0000\u0000<:\u0001\u0000\u0000"+
		"\u0000=@\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000"+
		"\u0000\u0000?F\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000AB\u0005"+
		"\u000f\u0000\u0000BC\u0003\n\u0005\u0000CD\u0005\u0010\u0000\u0000DF\u0001"+
		"\u0000\u0000\u0000E7\u0001\u0000\u0000\u0000E8\u0001\u0000\u0000\u0000"+
		"E9\u0001\u0000\u0000\u0000EA\u0001\u0000\u0000\u0000F\r\u0001\u0000\u0000"+
		"\u0000GH\u0005\u0001\u0000\u0000HI\u0003\n\u0005\u0000IJ\u0005\u0015\u0000"+
		"\u0000J\u000f\u0001\u0000\u0000\u0000KL\u0005\u0005\u0000\u0000LM\u0005"+
		"\u0015\u0000\u0000M\u0011\u0001\u0000\u0000\u0000NO\u0005\u0002\u0000"+
		"\u0000OP\u0003\u0016\u000b\u0000PR\u0005\u0011\u0000\u0000QS\u0003\u0002"+
		"\u0001\u0000RQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TR\u0001"+
		"\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000"+
		"V`\u0005\u0012\u0000\u0000WX\u0005\u0003\u0000\u0000XZ\u0005\u0011\u0000"+
		"\u0000Y[\u0003\u0002\u0001\u0000ZY\u0001\u0000\u0000\u0000[\\\u0001\u0000"+
		"\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0001"+
		"\u0000\u0000\u0000^_\u0005\u0012\u0000\u0000_a\u0001\u0000\u0000\u0000"+
		"`W\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a\u0013\u0001\u0000"+
		"\u0000\u0000bc\u0005\u0004\u0000\u0000cd\u0005\u000f\u0000\u0000de\u0005"+
		"\t\u0000\u0000ef\u0005\b\u0000\u0000fg\u0003\n\u0005\u0000gh\u0005\u0010"+
		"\u0000\u0000hj\u0005\u0011\u0000\u0000ik\u0003\u0002\u0001\u0000ji\u0001"+
		"\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000"+
		"lm\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0005\u0012\u0000"+
		"\u0000o\u0015\u0001\u0000\u0000\u0000pq\u0005\u000f\u0000\u0000qr\u0003"+
		"\n\u0005\u0000rs\u0005\u0010\u0000\u0000s\u0017\u0001\u0000\u0000\u0000"+
		"\n\u001b!%4>ET\\`l";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}