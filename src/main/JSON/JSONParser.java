// Generated from /mnt/SharedData/documents/university/3-ano/2-sem/ELP/project/project/src/main/kotlin/JSON.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class JSONParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, JSTRING=6, INT=7, DOUBLE=8, DIGIT=9, 
		JBOOLEAN=10, JNULL=11, COMMA=12, WHITESPACE=13;
	public static final int
		RULE_jvalue = 0, RULE_jfield = 1, RULE_jarray = 2, RULE_jobject = 3, RULE_jnumber = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"jvalue", "jfield", "jarray", "jobject", "jnumber"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'['", "']'", "'{'", "'}'", null, null, null, null, null, 
			"'null'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "JSTRING", "INT", "DOUBLE", "DIGIT", 
			"JBOOLEAN", "JNULL", "COMMA", "WHITESPACE"
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
	public String getGrammarFileName() { return "JSON.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JSONParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JvalueContext extends ParserRuleContext {
		public JarrayContext jarray() {
			return getRuleContext(JarrayContext.class,0);
		}
		public TerminalNode JSTRING() { return getToken(JSONParser.JSTRING, 0); }
		public JnumberContext jnumber() {
			return getRuleContext(JnumberContext.class,0);
		}
		public TerminalNode JBOOLEAN() { return getToken(JSONParser.JBOOLEAN, 0); }
		public TerminalNode JNULL() { return getToken(JSONParser.JNULL, 0); }
		public JobjectContext jobject() {
			return getRuleContext(JobjectContext.class,0);
		}
		public JvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterJvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitJvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitJvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JvalueContext jvalue() throws RecognitionException {
		JvalueContext _localctx = new JvalueContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_jvalue);
		try {
			setState(16);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(10);
				jarray();
				}
				break;
			case JSTRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(11);
				match(JSTRING);
				}
				break;
			case INT:
			case DOUBLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(12);
				jnumber();
				}
				break;
			case JBOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(13);
				match(JBOOLEAN);
				}
				break;
			case JNULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(14);
				match(JNULL);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 6);
				{
				setState(15);
				jobject();
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
	public static class JfieldContext extends ParserRuleContext {
		public TerminalNode JSTRING() { return getToken(JSONParser.JSTRING, 0); }
		public JvalueContext jvalue() {
			return getRuleContext(JvalueContext.class,0);
		}
		public JfieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jfield; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterJfield(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitJfield(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitJfield(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JfieldContext jfield() throws RecognitionException {
		JfieldContext _localctx = new JfieldContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_jfield);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(JSTRING);
			setState(19);
			match(T__0);
			setState(20);
			jvalue();
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
	public static class JarrayContext extends ParserRuleContext {
		public List<JvalueContext> jvalue() {
			return getRuleContexts(JvalueContext.class);
		}
		public JvalueContext jvalue(int i) {
			return getRuleContext(JvalueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JSONParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JSONParser.COMMA, i);
		}
		public JarrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jarray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterJarray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitJarray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitJarray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JarrayContext jarray() throws RecognitionException {
		JarrayContext _localctx = new JarrayContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_jarray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(T__1);
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3540L) != 0)) {
				{
				setState(23);
				jvalue();
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(24);
					match(COMMA);
					setState(25);
					jvalue();
					}
					}
					setState(30);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(33);
			match(T__2);
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
	public static class JobjectContext extends ParserRuleContext {
		public List<JfieldContext> jfield() {
			return getRuleContexts(JfieldContext.class);
		}
		public JfieldContext jfield(int i) {
			return getRuleContext(JfieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JSONParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JSONParser.COMMA, i);
		}
		public JobjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jobject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterJobject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitJobject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitJobject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JobjectContext jobject() throws RecognitionException {
		JobjectContext _localctx = new JobjectContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_jobject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(T__3);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JSTRING) {
				{
				setState(36);
				jfield();
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(37);
					match(COMMA);
					setState(38);
					jfield();
					}
					}
					setState(43);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(46);
			match(T__4);
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
	public static class JnumberContext extends ParserRuleContext {
		public TerminalNode DOUBLE() { return getToken(JSONParser.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(JSONParser.INT, 0); }
		public JnumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jnumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterJnumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitJnumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitJnumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JnumberContext jnumber() throws RecognitionException {
		JnumberContext _localctx = new JnumberContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_jnumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DOUBLE) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\r3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003"+
		"\u0000\u0011\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u001b\b\u0002\n"+
		"\u0002\f\u0002\u001e\t\u0002\u0003\u0002 \b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003(\b\u0003"+
		"\n\u0003\f\u0003+\t\u0003\u0003\u0003-\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0000\u0000\u0005\u0000\u0002\u0004"+
		"\u0006\b\u0000\u0001\u0001\u0000\u0007\b6\u0000\u0010\u0001\u0000\u0000"+
		"\u0000\u0002\u0012\u0001\u0000\u0000\u0000\u0004\u0016\u0001\u0000\u0000"+
		"\u0000\u0006#\u0001\u0000\u0000\u0000\b0\u0001\u0000\u0000\u0000\n\u0011"+
		"\u0003\u0004\u0002\u0000\u000b\u0011\u0005\u0006\u0000\u0000\f\u0011\u0003"+
		"\b\u0004\u0000\r\u0011\u0005\n\u0000\u0000\u000e\u0011\u0005\u000b\u0000"+
		"\u0000\u000f\u0011\u0003\u0006\u0003\u0000\u0010\n\u0001\u0000\u0000\u0000"+
		"\u0010\u000b\u0001\u0000\u0000\u0000\u0010\f\u0001\u0000\u0000\u0000\u0010"+
		"\r\u0001\u0000\u0000\u0000\u0010\u000e\u0001\u0000\u0000\u0000\u0010\u000f"+
		"\u0001\u0000\u0000\u0000\u0011\u0001\u0001\u0000\u0000\u0000\u0012\u0013"+
		"\u0005\u0006\u0000\u0000\u0013\u0014\u0005\u0001\u0000\u0000\u0014\u0015"+
		"\u0003\u0000\u0000\u0000\u0015\u0003\u0001\u0000\u0000\u0000\u0016\u001f"+
		"\u0005\u0002\u0000\u0000\u0017\u001c\u0003\u0000\u0000\u0000\u0018\u0019"+
		"\u0005\f\u0000\u0000\u0019\u001b\u0003\u0000\u0000\u0000\u001a\u0018\u0001"+
		"\u0000\u0000\u0000\u001b\u001e\u0001\u0000\u0000\u0000\u001c\u001a\u0001"+
		"\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d \u0001\u0000"+
		"\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001f\u0017\u0001\u0000"+
		"\u0000\u0000\u001f \u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000"+
		"!\"\u0005\u0003\u0000\u0000\"\u0005\u0001\u0000\u0000\u0000#,\u0005\u0004"+
		"\u0000\u0000$)\u0003\u0002\u0001\u0000%&\u0005\f\u0000\u0000&(\u0003\u0002"+
		"\u0001\u0000\'%\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001"+
		"\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*-\u0001\u0000\u0000\u0000"+
		"+)\u0001\u0000\u0000\u0000,$\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000"+
		"\u0000-.\u0001\u0000\u0000\u0000./\u0005\u0005\u0000\u0000/\u0007\u0001"+
		"\u0000\u0000\u000001\u0007\u0000\u0000\u00001\t\u0001\u0000\u0000\u0000"+
		"\u0005\u0010\u001c\u001f),";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}