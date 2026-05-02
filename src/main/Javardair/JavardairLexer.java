// Generated from C:/Users/patri/Desktop/ISCTE/ELP/ELP-project/src/main/kotlin/Javardair.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class JavardairLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, TYPE=5, BREAK=6, VARIABLE=7, NUMBER=8, 
		DIGIT=9, OPERATOR=10, EQUAL=11, OPENPARENTHESIS=12, CLOSEPARENTHESIS=13, 
		OPENBRACKETS=14, CLOSEBRACKETS=15, COMMENT=16, SEPARATOR=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "TYPE", "BREAK", "VARIABLE", "NUMBER", 
			"DIGIT", "OPERATOR", "EQUAL", "OPENPARENTHESIS", "CLOSEPARENTHESIS", 
			"OPENBRACKETS", "CLOSEBRACKETS", "COMMENT", "SEPARATOR", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "'if'", "'else'", "'while'", null, "'break'", null, 
			null, null, null, "':='", "'('", "')'", "'{'", "'}'", null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "TYPE", "BREAK", "VARIABLE", "NUMBER", 
			"DIGIT", "OPERATOR", "EQUAL", "OPENPARENTHESIS", "CLOSEPARENTHESIS", 
			"OPENBRACKETS", "CLOSEBRACKETS", "COMMENT", "SEPARATOR", "WS"
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


	public JavardairLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Javardair.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0012\u008f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004B\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0004\u0006L\b\u0006\u000b\u0006\f\u0006M\u0003"+
		"\u0006P\b\u0006\u0001\u0007\u0003\u0007S\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007W\b\u0007\n\u0007\f\u0007Z\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0004\u0007^\b\u0007\u000b\u0007\f\u0007_\u0003\u0007b\b\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\tq\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u0080\b\u000f\n\u000f\f\u000f\u0083"+
		"\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0004"+
		"\u0011\u008a\b\u0011\u000b\u0011\f\u0011\u008b\u0001\u0011\u0001\u0011"+
		"\u0000\u0000\u0012\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012\u0001\u0000\u0007"+
		"\u0002\u0000AZaz\u0004\u000009AZ__az\u0001\u000019\u0001\u000009\u0004"+
		"\u0000%%*+--//\u0002\u0000\n\n\r\r\u0003\u0000\t\n\r\r  \u009d\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0001%\u0001\u0000\u0000\u0000\u0003"+
		"+\u0001\u0000\u0000\u0000\u0005.\u0001\u0000\u0000\u0000\u00073\u0001"+
		"\u0000\u0000\u0000\tA\u0001\u0000\u0000\u0000\u000bC\u0001\u0000\u0000"+
		"\u0000\rI\u0001\u0000\u0000\u0000\u000fR\u0001\u0000\u0000\u0000\u0011"+
		"c\u0001\u0000\u0000\u0000\u0013p\u0001\u0000\u0000\u0000\u0015r\u0001"+
		"\u0000\u0000\u0000\u0017u\u0001\u0000\u0000\u0000\u0019w\u0001\u0000\u0000"+
		"\u0000\u001by\u0001\u0000\u0000\u0000\u001d{\u0001\u0000\u0000\u0000\u001f"+
		"}\u0001\u0000\u0000\u0000!\u0086\u0001\u0000\u0000\u0000#\u0089\u0001"+
		"\u0000\u0000\u0000%&\u0005p\u0000\u0000&\'\u0005r\u0000\u0000\'(\u0005"+
		"i\u0000\u0000()\u0005n\u0000\u0000)*\u0005t\u0000\u0000*\u0002\u0001\u0000"+
		"\u0000\u0000+,\u0005i\u0000\u0000,-\u0005f\u0000\u0000-\u0004\u0001\u0000"+
		"\u0000\u0000./\u0005e\u0000\u0000/0\u0005l\u0000\u000001\u0005s\u0000"+
		"\u000012\u0005e\u0000\u00002\u0006\u0001\u0000\u0000\u000034\u0005w\u0000"+
		"\u000045\u0005h\u0000\u000056\u0005i\u0000\u000067\u0005l\u0000\u0000"+
		"78\u0005e\u0000\u00008\b\u0001\u0000\u0000\u00009:\u0005m\u0000\u0000"+
		":;\u0005u\u0000\u0000;B\u0005t\u0000\u0000<=\u0005c\u0000\u0000=>\u0005"+
		"o\u0000\u0000>?\u0005n\u0000\u0000?@\u0005s\u0000\u0000@B\u0005t\u0000"+
		"\u0000A9\u0001\u0000\u0000\u0000A<\u0001\u0000\u0000\u0000B\n\u0001\u0000"+
		"\u0000\u0000CD\u0005b\u0000\u0000DE\u0005r\u0000\u0000EF\u0005e\u0000"+
		"\u0000FG\u0005a\u0000\u0000GH\u0005k\u0000\u0000H\f\u0001\u0000\u0000"+
		"\u0000IO\u0007\u0000\u0000\u0000JL\u0007\u0001\u0000\u0000KJ\u0001\u0000"+
		"\u0000\u0000LM\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001"+
		"\u0000\u0000\u0000NP\u0001\u0000\u0000\u0000OK\u0001\u0000\u0000\u0000"+
		"OP\u0001\u0000\u0000\u0000P\u000e\u0001\u0000\u0000\u0000QS\u0005-\u0000"+
		"\u0000RQ\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0001\u0000"+
		"\u0000\u0000TX\u0007\u0002\u0000\u0000UW\u0003\u0011\b\u0000VU\u0001\u0000"+
		"\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001"+
		"\u0000\u0000\u0000Ya\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000"+
		"[]\u0005.\u0000\u0000\\^\u0003\u0011\b\u0000]\\\u0001\u0000\u0000\u0000"+
		"^_\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000"+
		"\u0000`b\u0001\u0000\u0000\u0000a[\u0001\u0000\u0000\u0000ab\u0001\u0000"+
		"\u0000\u0000b\u0010\u0001\u0000\u0000\u0000cd\u0007\u0003\u0000\u0000"+
		"d\u0012\u0001\u0000\u0000\u0000eq\u0007\u0004\u0000\u0000fg\u0005=\u0000"+
		"\u0000gq\u0005=\u0000\u0000hi\u0005!\u0000\u0000iq\u0005=\u0000\u0000"+
		"jq\u0005<\u0000\u0000kl\u0005<\u0000\u0000lq\u0005=\u0000\u0000mq\u0005"+
		">\u0000\u0000no\u0005>\u0000\u0000oq\u0005=\u0000\u0000pe\u0001\u0000"+
		"\u0000\u0000pf\u0001\u0000\u0000\u0000ph\u0001\u0000\u0000\u0000pj\u0001"+
		"\u0000\u0000\u0000pk\u0001\u0000\u0000\u0000pm\u0001\u0000\u0000\u0000"+
		"pn\u0001\u0000\u0000\u0000q\u0014\u0001\u0000\u0000\u0000rs\u0005:\u0000"+
		"\u0000st\u0005=\u0000\u0000t\u0016\u0001\u0000\u0000\u0000uv\u0005(\u0000"+
		"\u0000v\u0018\u0001\u0000\u0000\u0000wx\u0005)\u0000\u0000x\u001a\u0001"+
		"\u0000\u0000\u0000yz\u0005{\u0000\u0000z\u001c\u0001\u0000\u0000\u0000"+
		"{|\u0005}\u0000\u0000|\u001e\u0001\u0000\u0000\u0000}\u0081\u0005#\u0000"+
		"\u0000~\u0080\b\u0005\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080"+
		"\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0001\u0000\u0000\u0000\u0082\u0084\u0001\u0000\u0000\u0000\u0083"+
		"\u0081\u0001\u0000\u0000\u0000\u0084\u0085\u0006\u000f\u0000\u0000\u0085"+
		" \u0001\u0000\u0000\u0000\u0086\u0087\u0005;\u0000\u0000\u0087\"\u0001"+
		"\u0000\u0000\u0000\u0088\u008a\u0007\u0006\u0000\u0000\u0089\u0088\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0089\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0006\u0011\u0000\u0000\u008e$\u0001\u0000"+
		"\u0000\u0000\u000b\u0000AMORX_ap\u0081\u008b\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}