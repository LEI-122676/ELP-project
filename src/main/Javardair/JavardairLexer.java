// Generated from /mnt/SharedData/documents/university/3-ano/2-sem/ELP/project/project/src/main/kotlin/Javardair.g4 by ANTLR 4.13.2
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, TYPE=6, VARIABLE=7, LITERAL=8, 
		OPERATOR=9, EQUAL=10, OPENPARENTHESIS=11, CLOSEPARENTHESIS=12, OPENBRACKETS=13, 
		CLOSEBRACKETS=14, COMMENT=15, SEPARATOR=16, WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "TYPE", "VARIABLE", "LITERAL", 
			"OPERATOR", "EQUAL", "OPENPARENTHESIS", "CLOSEPARENTHESIS", "OPENBRACKETS", 
			"CLOSEBRACKETS", "COMMENT", "SEPARATOR", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "'break'", "'if'", "'else'", "'while'", null, null, 
			null, null, "':='", "'('", "')'", "'{'", "'}'", null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "TYPE", "VARIABLE", "LITERAL", "OPERATOR", 
			"EQUAL", "OPENPARENTHESIS", "CLOSEPARENTHESIS", "OPENBRACKETS", "CLOSEBRACKETS", 
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
		"\u0004\u0000\u0011{\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005F\b\u0005\u0001\u0006\u0004\u0006I\b\u0006"+
		"\u000b\u0006\f\u0006J\u0001\u0007\u0004\u0007N\b\u0007\u000b\u0007\f\u0007"+
		"O\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b]\b\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0005\u000el\b\u000e\n\u000e\f\u000eo\t\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0004\u0010v\b\u0010"+
		"\u000b\u0010\f\u0010w\u0001\u0010\u0001\u0010\u0000\u0000\u0011\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011\u0001\u0000\u0005\u0002\u0000AZaz\u0001\u0000"+
		"09\u0004\u0000%%*+--//\u0002\u0000\n\n\r\r\u0003\u0000\t\n\r\r  \u0085"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0001#\u0001\u0000\u0000\u0000\u0003)\u0001\u0000\u0000"+
		"\u0000\u0005/\u0001\u0000\u0000\u0000\u00072\u0001\u0000\u0000\u0000\t"+
		"7\u0001\u0000\u0000\u0000\u000bE\u0001\u0000\u0000\u0000\rH\u0001\u0000"+
		"\u0000\u0000\u000fM\u0001\u0000\u0000\u0000\u0011\\\u0001\u0000\u0000"+
		"\u0000\u0013^\u0001\u0000\u0000\u0000\u0015a\u0001\u0000\u0000\u0000\u0017"+
		"c\u0001\u0000\u0000\u0000\u0019e\u0001\u0000\u0000\u0000\u001bg\u0001"+
		"\u0000\u0000\u0000\u001di\u0001\u0000\u0000\u0000\u001fr\u0001\u0000\u0000"+
		"\u0000!u\u0001\u0000\u0000\u0000#$\u0005p\u0000\u0000$%\u0005r\u0000\u0000"+
		"%&\u0005i\u0000\u0000&\'\u0005n\u0000\u0000\'(\u0005t\u0000\u0000(\u0002"+
		"\u0001\u0000\u0000\u0000)*\u0005b\u0000\u0000*+\u0005r\u0000\u0000+,\u0005"+
		"e\u0000\u0000,-\u0005a\u0000\u0000-.\u0005k\u0000\u0000.\u0004\u0001\u0000"+
		"\u0000\u0000/0\u0005i\u0000\u000001\u0005f\u0000\u00001\u0006\u0001\u0000"+
		"\u0000\u000023\u0005e\u0000\u000034\u0005l\u0000\u000045\u0005s\u0000"+
		"\u000056\u0005e\u0000\u00006\b\u0001\u0000\u0000\u000078\u0005w\u0000"+
		"\u000089\u0005h\u0000\u00009:\u0005i\u0000\u0000:;\u0005l\u0000\u0000"+
		";<\u0005e\u0000\u0000<\n\u0001\u0000\u0000\u0000=>\u0005m\u0000\u0000"+
		">?\u0005u\u0000\u0000?F\u0005t\u0000\u0000@A\u0005c\u0000\u0000AB\u0005"+
		"o\u0000\u0000BC\u0005n\u0000\u0000CD\u0005s\u0000\u0000DF\u0005t\u0000"+
		"\u0000E=\u0001\u0000\u0000\u0000E@\u0001\u0000\u0000\u0000F\f\u0001\u0000"+
		"\u0000\u0000GI\u0007\u0000\u0000\u0000HG\u0001\u0000\u0000\u0000IJ\u0001"+
		"\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000"+
		"K\u000e\u0001\u0000\u0000\u0000LN\u0007\u0001\u0000\u0000ML\u0001\u0000"+
		"\u0000\u0000NO\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001"+
		"\u0000\u0000\u0000P\u0010\u0001\u0000\u0000\u0000Q]\u0007\u0002\u0000"+
		"\u0000RS\u0005=\u0000\u0000S]\u0005=\u0000\u0000TU\u0005!\u0000\u0000"+
		"U]\u0005=\u0000\u0000V]\u0005<\u0000\u0000WX\u0005<\u0000\u0000X]\u0005"+
		"=\u0000\u0000Y]\u0005>\u0000\u0000Z[\u0005>\u0000\u0000[]\u0005=\u0000"+
		"\u0000\\Q\u0001\u0000\u0000\u0000\\R\u0001\u0000\u0000\u0000\\T\u0001"+
		"\u0000\u0000\u0000\\V\u0001\u0000\u0000\u0000\\W\u0001\u0000\u0000\u0000"+
		"\\Y\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]\u0012\u0001\u0000"+
		"\u0000\u0000^_\u0005:\u0000\u0000_`\u0005=\u0000\u0000`\u0014\u0001\u0000"+
		"\u0000\u0000ab\u0005(\u0000\u0000b\u0016\u0001\u0000\u0000\u0000cd\u0005"+
		")\u0000\u0000d\u0018\u0001\u0000\u0000\u0000ef\u0005{\u0000\u0000f\u001a"+
		"\u0001\u0000\u0000\u0000gh\u0005}\u0000\u0000h\u001c\u0001\u0000\u0000"+
		"\u0000im\u0005#\u0000\u0000jl\b\u0003\u0000\u0000kj\u0001\u0000\u0000"+
		"\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000"+
		"\u0000\u0000np\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pq\u0006"+
		"\u000e\u0000\u0000q\u001e\u0001\u0000\u0000\u0000rs\u0005;\u0000\u0000"+
		"s \u0001\u0000\u0000\u0000tv\u0007\u0004\u0000\u0000ut\u0001\u0000\u0000"+
		"\u0000vw\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0006\u0010\u0000\u0000z\"\u0001"+
		"\u0000\u0000\u0000\u0007\u0000EJO\\mw\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}