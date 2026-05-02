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
		T__0=1, T__1=2, T__2=3, T__3=4, TYPE=5, MUT=6, CONST=7, BREAK=8, VARIABLE=9, 
		NUMBER=10, DIGIT=11, OPERATOR=12, EQUAL=13, OPENPARENTHESIS=14, CLOSEPARENTHESIS=15, 
		OPENBRACKETS=16, CLOSEBRACKETS=17, COMMENT=18, SEPARATOR=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "TYPE", "MUT", "CONST", "BREAK", "VARIABLE", 
			"NUMBER", "DIGIT", "OPERATOR", "EQUAL", "OPENPARENTHESIS", "CLOSEPARENTHESIS", 
			"OPENBRACKETS", "CLOSEBRACKETS", "COMMENT", "SEPARATOR", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "'if'", "'else'", "'while'", null, "'mut'", "'const'", 
			"'break'", null, null, null, null, "':='", "'('", "')'", "'{'", "'}'", 
			null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "TYPE", "MUT", "CONST", "BREAK", "VARIABLE", 
			"NUMBER", "DIGIT", "OPERATOR", "EQUAL", "OPENPARENTHESIS", "CLOSEPARENTHESIS", 
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
		"\u0004\u0000\u0014\u0097\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0003\u0004@\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0004\bT\b\b\u000b\b\f\bU\u0003"+
		"\bX\b\b\u0001\t\u0003\t[\b\t\u0001\t\u0001\t\u0005\t_\b\t\n\t\f\tb\t\t"+
		"\u0001\t\u0001\t\u0004\tf\b\t\u000b\t\f\tg\u0003\tj\b\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"y\b\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0005\u0011\u0088\b\u0011\n\u0011\f\u0011\u008b\t\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0004\u0013\u0092\b\u0013\u000b"+
		"\u0013\f\u0013\u0093\u0001\u0013\u0001\u0013\u0000\u0000\u0014\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\'\u0014\u0001\u0000\u0007\u0002\u0000"+
		"AZaz\u0004\u000009AZ__az\u0001\u000019\u0001\u000009\u0004\u0000%%*+-"+
		"-//\u0002\u0000\n\n\r\r\u0003\u0000\t\n\r\r  \u00a5\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0001)\u0001\u0000\u0000\u0000\u0003/\u0001\u0000"+
		"\u0000\u0000\u00052\u0001\u0000\u0000\u0000\u00077\u0001\u0000\u0000\u0000"+
		"\t?\u0001\u0000\u0000\u0000\u000bA\u0001\u0000\u0000\u0000\rE\u0001\u0000"+
		"\u0000\u0000\u000fK\u0001\u0000\u0000\u0000\u0011Q\u0001\u0000\u0000\u0000"+
		"\u0013Z\u0001\u0000\u0000\u0000\u0015k\u0001\u0000\u0000\u0000\u0017x"+
		"\u0001\u0000\u0000\u0000\u0019z\u0001\u0000\u0000\u0000\u001b}\u0001\u0000"+
		"\u0000\u0000\u001d\u007f\u0001\u0000\u0000\u0000\u001f\u0081\u0001\u0000"+
		"\u0000\u0000!\u0083\u0001\u0000\u0000\u0000#\u0085\u0001\u0000\u0000\u0000"+
		"%\u008e\u0001\u0000\u0000\u0000\'\u0091\u0001\u0000\u0000\u0000)*\u0005"+
		"p\u0000\u0000*+\u0005r\u0000\u0000+,\u0005i\u0000\u0000,-\u0005n\u0000"+
		"\u0000-.\u0005t\u0000\u0000.\u0002\u0001\u0000\u0000\u0000/0\u0005i\u0000"+
		"\u000001\u0005f\u0000\u00001\u0004\u0001\u0000\u0000\u000023\u0005e\u0000"+
		"\u000034\u0005l\u0000\u000045\u0005s\u0000\u000056\u0005e\u0000\u0000"+
		"6\u0006\u0001\u0000\u0000\u000078\u0005w\u0000\u000089\u0005h\u0000\u0000"+
		"9:\u0005i\u0000\u0000:;\u0005l\u0000\u0000;<\u0005e\u0000\u0000<\b\u0001"+
		"\u0000\u0000\u0000=@\u0003\u000b\u0005\u0000>@\u0003\r\u0006\u0000?=\u0001"+
		"\u0000\u0000\u0000?>\u0001\u0000\u0000\u0000@\n\u0001\u0000\u0000\u0000"+
		"AB\u0005m\u0000\u0000BC\u0005u\u0000\u0000CD\u0005t\u0000\u0000D\f\u0001"+
		"\u0000\u0000\u0000EF\u0005c\u0000\u0000FG\u0005o\u0000\u0000GH\u0005n"+
		"\u0000\u0000HI\u0005s\u0000\u0000IJ\u0005t\u0000\u0000J\u000e\u0001\u0000"+
		"\u0000\u0000KL\u0005b\u0000\u0000LM\u0005r\u0000\u0000MN\u0005e\u0000"+
		"\u0000NO\u0005a\u0000\u0000OP\u0005k\u0000\u0000P\u0010\u0001\u0000\u0000"+
		"\u0000QW\u0007\u0000\u0000\u0000RT\u0007\u0001\u0000\u0000SR\u0001\u0000"+
		"\u0000\u0000TU\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001"+
		"\u0000\u0000\u0000VX\u0001\u0000\u0000\u0000WS\u0001\u0000\u0000\u0000"+
		"WX\u0001\u0000\u0000\u0000X\u0012\u0001\u0000\u0000\u0000Y[\u0005-\u0000"+
		"\u0000ZY\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0001\u0000"+
		"\u0000\u0000\\`\u0007\u0002\u0000\u0000]_\u0003\u0015\n\u0000^]\u0001"+
		"\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000"+
		"`a\u0001\u0000\u0000\u0000ai\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000"+
		"\u0000ce\u0005.\u0000\u0000df\u0003\u0015\n\u0000ed\u0001\u0000\u0000"+
		"\u0000fg\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000"+
		"\u0000\u0000hj\u0001\u0000\u0000\u0000ic\u0001\u0000\u0000\u0000ij\u0001"+
		"\u0000\u0000\u0000j\u0014\u0001\u0000\u0000\u0000kl\u0007\u0003\u0000"+
		"\u0000l\u0016\u0001\u0000\u0000\u0000my\u0007\u0004\u0000\u0000no\u0005"+
		"=\u0000\u0000oy\u0005=\u0000\u0000pq\u0005!\u0000\u0000qy\u0005=\u0000"+
		"\u0000ry\u0005<\u0000\u0000st\u0005<\u0000\u0000ty\u0005=\u0000\u0000"+
		"uy\u0005>\u0000\u0000vw\u0005>\u0000\u0000wy\u0005=\u0000\u0000xm\u0001"+
		"\u0000\u0000\u0000xn\u0001\u0000\u0000\u0000xp\u0001\u0000\u0000\u0000"+
		"xr\u0001\u0000\u0000\u0000xs\u0001\u0000\u0000\u0000xu\u0001\u0000\u0000"+
		"\u0000xv\u0001\u0000\u0000\u0000y\u0018\u0001\u0000\u0000\u0000z{\u0005"+
		":\u0000\u0000{|\u0005=\u0000\u0000|\u001a\u0001\u0000\u0000\u0000}~\u0005"+
		"(\u0000\u0000~\u001c\u0001\u0000\u0000\u0000\u007f\u0080\u0005)\u0000"+
		"\u0000\u0080\u001e\u0001\u0000\u0000\u0000\u0081\u0082\u0005{\u0000\u0000"+
		"\u0082 \u0001\u0000\u0000\u0000\u0083\u0084\u0005}\u0000\u0000\u0084\""+
		"\u0001\u0000\u0000\u0000\u0085\u0089\u0005#\u0000\u0000\u0086\u0088\b"+
		"\u0005\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u008b\u0001"+
		"\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001"+
		"\u0000\u0000\u0000\u008a\u008c\u0001\u0000\u0000\u0000\u008b\u0089\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0006\u0011\u0000\u0000\u008d$\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0005;\u0000\u0000\u008f&\u0001\u0000\u0000\u0000"+
		"\u0090\u0092\u0007\u0006\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0006\u0013\u0000\u0000\u0096(\u0001\u0000\u0000\u0000\u000b"+
		"\u0000?UWZ`gix\u0089\u0093\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}