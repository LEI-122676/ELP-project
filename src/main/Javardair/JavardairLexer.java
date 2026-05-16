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
		T__0=1, T__1=2, T__2=3, T__3=4, BREAK=5, MUT=6, CONST=7, IN=8, VARIABLE=9, 
		STRING=10, NUMBER=11, DIGIT=12, OPERATOR=13, COMPOUNDOP=14, EQUAL=15, 
		OPENPARENTHESIS=16, CLOSEPARENTHESIS=17, OPENBLOCK=18, CLOSEBLOCK=19, 
		ACCESS=20, COMMENT=21, SEPARATOR=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "BREAK", "MUT", "CONST", "IN", "VARIABLE", 
			"STRING", "NUMBER", "DIGIT", "OPERATOR", "COMPOUNDOP", "EQUAL", "OPENPARENTHESIS", 
			"CLOSEPARENTHESIS", "OPENBLOCK", "CLOSEBLOCK", "ACCESS", "COMMENT", "SEPARATOR", 
			"WS"
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
		"\u0004\u0000\u0017\u00b8\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0004\bX\b\b\u000b\b\f\bY\u0003\b\\\b\b\u0001\t\u0001"+
		"\t\u0005\t`\b\t\n\t\f\tc\t\t\u0001\t\u0001\t\u0001\n\u0003\nh\b\n\u0001"+
		"\n\u0001\n\u0005\nl\b\n\n\n\f\no\t\n\u0001\n\u0001\n\u0004\ns\b\n\u000b"+
		"\n\f\nt\u0003\nw\b\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0086"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u0092\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u00a9\b\u0014\n\u0014\f\u0014\u00ac\t\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0004\u0016\u00b3\b\u0016\u000b\u0016"+
		"\f\u0016\u00b4\u0001\u0016\u0001\u0016\u0000\u0000\u0017\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017\u0001\u0000\b\u0002"+
		"\u0000AZaz\u0004\u000009AZ__az\u0001\u0000\"\"\u0001\u000019\u0001\u0000"+
		"09\u0004\u0000%%*+--//\u0002\u0000\n\n\r\r\u0003\u0000\t\n\r\r  \u00ca"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0001/"+
		"\u0001\u0000\u0000\u0000\u00035\u0001\u0000\u0000\u0000\u00058\u0001\u0000"+
		"\u0000\u0000\u0007=\u0001\u0000\u0000\u0000\tA\u0001\u0000\u0000\u0000"+
		"\u000bG\u0001\u0000\u0000\u0000\rK\u0001\u0000\u0000\u0000\u000fQ\u0001"+
		"\u0000\u0000\u0000\u0011U\u0001\u0000\u0000\u0000\u0013]\u0001\u0000\u0000"+
		"\u0000\u0015g\u0001\u0000\u0000\u0000\u0017x\u0001\u0000\u0000\u0000\u0019"+
		"\u0085\u0001\u0000\u0000\u0000\u001b\u0091\u0001\u0000\u0000\u0000\u001d"+
		"\u0093\u0001\u0000\u0000\u0000\u001f\u0096\u0001\u0000\u0000\u0000!\u0098"+
		"\u0001\u0000\u0000\u0000#\u009a\u0001\u0000\u0000\u0000%\u009d\u0001\u0000"+
		"\u0000\u0000\'\u00a0\u0001\u0000\u0000\u0000)\u00a3\u0001\u0000\u0000"+
		"\u0000+\u00af\u0001\u0000\u0000\u0000-\u00b2\u0001\u0000\u0000\u0000/"+
		"0\u0005p\u0000\u000001\u0005r\u0000\u000012\u0005i\u0000\u000023\u0005"+
		"n\u0000\u000034\u0005t\u0000\u00004\u0002\u0001\u0000\u0000\u000056\u0005"+
		"i\u0000\u000067\u0005f\u0000\u00007\u0004\u0001\u0000\u0000\u000089\u0005"+
		"e\u0000\u00009:\u0005l\u0000\u0000:;\u0005s\u0000\u0000;<\u0005e\u0000"+
		"\u0000<\u0006\u0001\u0000\u0000\u0000=>\u0005f\u0000\u0000>?\u0005o\u0000"+
		"\u0000?@\u0005r\u0000\u0000@\b\u0001\u0000\u0000\u0000AB\u0005b\u0000"+
		"\u0000BC\u0005r\u0000\u0000CD\u0005e\u0000\u0000DE\u0005a\u0000\u0000"+
		"EF\u0005k\u0000\u0000F\n\u0001\u0000\u0000\u0000GH\u0005m\u0000\u0000"+
		"HI\u0005u\u0000\u0000IJ\u0005t\u0000\u0000J\f\u0001\u0000\u0000\u0000"+
		"KL\u0005c\u0000\u0000LM\u0005o\u0000\u0000MN\u0005n\u0000\u0000NO\u0005"+
		"s\u0000\u0000OP\u0005t\u0000\u0000P\u000e\u0001\u0000\u0000\u0000QR\u0005"+
		">\u0000\u0000RS\u0005>\u0000\u0000ST\u0005>\u0000\u0000T\u0010\u0001\u0000"+
		"\u0000\u0000U[\u0007\u0000\u0000\u0000VX\u0007\u0001\u0000\u0000WV\u0001"+
		"\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000"+
		"YZ\u0001\u0000\u0000\u0000Z\\\u0001\u0000\u0000\u0000[W\u0001\u0000\u0000"+
		"\u0000[\\\u0001\u0000\u0000\u0000\\\u0012\u0001\u0000\u0000\u0000]a\u0005"+
		"\"\u0000\u0000^`\b\u0002\u0000\u0000_^\u0001\u0000\u0000\u0000`c\u0001"+
		"\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000"+
		"bd\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000de\u0005\"\u0000\u0000"+
		"e\u0014\u0001\u0000\u0000\u0000fh\u0005-\u0000\u0000gf\u0001\u0000\u0000"+
		"\u0000gh\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000im\u0007\u0003"+
		"\u0000\u0000jl\u0003\u0017\u000b\u0000kj\u0001\u0000\u0000\u0000lo\u0001"+
		"\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"nv\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pr\u0005.\u0000\u0000"+
		"qs\u0003\u0017\u000b\u0000rq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000"+
		"\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uw\u0001\u0000"+
		"\u0000\u0000vp\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000w\u0016"+
		"\u0001\u0000\u0000\u0000xy\u0007\u0004\u0000\u0000y\u0018\u0001\u0000"+
		"\u0000\u0000z\u0086\u0007\u0005\u0000\u0000{|\u0005=\u0000\u0000|\u0086"+
		"\u0005=\u0000\u0000}~\u0005!\u0000\u0000~\u0086\u0005=\u0000\u0000\u007f"+
		"\u0086\u0005<\u0000\u0000\u0080\u0081\u0005<\u0000\u0000\u0081\u0086\u0005"+
		"=\u0000\u0000\u0082\u0086\u0005>\u0000\u0000\u0083\u0084\u0005>\u0000"+
		"\u0000\u0084\u0086\u0005=\u0000\u0000\u0085z\u0001\u0000\u0000\u0000\u0085"+
		"{\u0001\u0000\u0000\u0000\u0085}\u0001\u0000\u0000\u0000\u0085\u007f\u0001"+
		"\u0000\u0000\u0000\u0085\u0080\u0001\u0000\u0000\u0000\u0085\u0082\u0001"+
		"\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086\u001a\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0005+\u0000\u0000\u0088\u0092\u0005=\u0000"+
		"\u0000\u0089\u008a\u0005-\u0000\u0000\u008a\u0092\u0005=\u0000\u0000\u008b"+
		"\u008c\u0005*\u0000\u0000\u008c\u0092\u0005=\u0000\u0000\u008d\u008e\u0005"+
		"/\u0000\u0000\u008e\u0092\u0005=\u0000\u0000\u008f\u0090\u0005%\u0000"+
		"\u0000\u0090\u0092\u0005=\u0000\u0000\u0091\u0087\u0001\u0000\u0000\u0000"+
		"\u0091\u0089\u0001\u0000\u0000\u0000\u0091\u008b\u0001\u0000\u0000\u0000"+
		"\u0091\u008d\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000"+
		"\u0092\u001c\u0001\u0000\u0000\u0000\u0093\u0094\u0005:\u0000\u0000\u0094"+
		"\u0095\u0005=\u0000\u0000\u0095\u001e\u0001\u0000\u0000\u0000\u0096\u0097"+
		"\u0005(\u0000\u0000\u0097 \u0001\u0000\u0000\u0000\u0098\u0099\u0005)"+
		"\u0000\u0000\u0099\"\u0001\u0000\u0000\u0000\u009a\u009b\u0005<\u0000"+
		"\u0000\u009b\u009c\u0005<\u0000\u0000\u009c$\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0005>\u0000\u0000\u009e\u009f\u0005>\u0000\u0000\u009f&\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a1\u0005.\u0000\u0000\u00a1\u00a2\u0005.\u0000"+
		"\u0000\u00a2(\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005#\u0000\u0000\u00a4"+
		"\u00a5\u0005#\u0000\u0000\u00a5\u00a6\u0005#\u0000\u0000\u00a6\u00aa\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a9\b\u0006\u0000\u0000\u00a8\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ad\u0001\u0000"+
		"\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad\u00ae\u0006\u0014"+
		"\u0000\u0000\u00ae*\u0001\u0000\u0000\u0000\u00af\u00b0\u0005.\u0000\u0000"+
		"\u00b0,\u0001\u0000\u0000\u0000\u00b1\u00b3\u0007\u0007\u0000\u0000\u00b2"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0006\u0016\u0000\u0000\u00b7"+
		".\u0001\u0000\u0000\u0000\f\u0000Y[agmtv\u0085\u0091\u00aa\u00b4\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}