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
		STRING=10, NUMBER=11, DIGIT=12, OPERATOR=13, EQUAL=14, OPENPARENTHESIS=15, 
		CLOSEPARENTHESIS=16, OPENBLOCK=17, CLOSEBLOCK=18, ACCESS=19, COMMENT=20, 
		SEPARATOR=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "BREAK", "MUT", "CONST", "IN", "VARIABLE", 
			"STRING", "NUMBER", "DIGIT", "OPERATOR", "EQUAL", "OPENPARENTHESIS", 
			"CLOSEPARENTHESIS", "OPENBLOCK", "CLOSEBLOCK", "ACCESS", "COMMENT", "SEPARATOR", 
			"WS"
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
		"\u0004\u0000\u0016\u00aa\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0004"+
		"\bV\b\b\u000b\b\f\bW\u0003\bZ\b\b\u0001\t\u0001\t\u0005\t^\b\t\n\t\f\t"+
		"a\t\t\u0001\t\u0001\t\u0001\n\u0003\nf\b\n\u0001\n\u0001\n\u0005\nj\b"+
		"\n\n\n\f\nm\t\n\u0001\n\u0001\n\u0004\nq\b\n\u000b\n\f\nr\u0003\nu\b\n"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0084\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0005\u0013\u009b\b\u0013\n\u0013\f\u0013\u009e\t\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0004\u0015\u00a5"+
		"\b\u0015\u000b\u0015\f\u0015\u00a6\u0001\u0015\u0001\u0015\u0000\u0000"+
		"\u0016\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016\u0001"+
		"\u0000\b\u0002\u0000AZaz\u0004\u000009AZ__az\u0001\u0000\"\"\u0001\u0000"+
		"19\u0001\u000009\u0004\u0000%%*+--//\u0002\u0000\n\n\r\r\u0003\u0000\t"+
		"\n\r\r  \u00b8\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0001-\u0001\u0000\u0000"+
		"\u0000\u00033\u0001\u0000\u0000\u0000\u00056\u0001\u0000\u0000\u0000\u0007"+
		";\u0001\u0000\u0000\u0000\t?\u0001\u0000\u0000\u0000\u000bE\u0001\u0000"+
		"\u0000\u0000\rI\u0001\u0000\u0000\u0000\u000fO\u0001\u0000\u0000\u0000"+
		"\u0011S\u0001\u0000\u0000\u0000\u0013[\u0001\u0000\u0000\u0000\u0015e"+
		"\u0001\u0000\u0000\u0000\u0017v\u0001\u0000\u0000\u0000\u0019\u0083\u0001"+
		"\u0000\u0000\u0000\u001b\u0085\u0001\u0000\u0000\u0000\u001d\u0088\u0001"+
		"\u0000\u0000\u0000\u001f\u008a\u0001\u0000\u0000\u0000!\u008c\u0001\u0000"+
		"\u0000\u0000#\u008f\u0001\u0000\u0000\u0000%\u0092\u0001\u0000\u0000\u0000"+
		"\'\u0095\u0001\u0000\u0000\u0000)\u00a1\u0001\u0000\u0000\u0000+\u00a4"+
		"\u0001\u0000\u0000\u0000-.\u0005p\u0000\u0000./\u0005r\u0000\u0000/0\u0005"+
		"i\u0000\u000001\u0005n\u0000\u000012\u0005t\u0000\u00002\u0002\u0001\u0000"+
		"\u0000\u000034\u0005i\u0000\u000045\u0005f\u0000\u00005\u0004\u0001\u0000"+
		"\u0000\u000067\u0005e\u0000\u000078\u0005l\u0000\u000089\u0005s\u0000"+
		"\u00009:\u0005e\u0000\u0000:\u0006\u0001\u0000\u0000\u0000;<\u0005f\u0000"+
		"\u0000<=\u0005o\u0000\u0000=>\u0005r\u0000\u0000>\b\u0001\u0000\u0000"+
		"\u0000?@\u0005b\u0000\u0000@A\u0005r\u0000\u0000AB\u0005e\u0000\u0000"+
		"BC\u0005a\u0000\u0000CD\u0005k\u0000\u0000D\n\u0001\u0000\u0000\u0000"+
		"EF\u0005m\u0000\u0000FG\u0005u\u0000\u0000GH\u0005t\u0000\u0000H\f\u0001"+
		"\u0000\u0000\u0000IJ\u0005c\u0000\u0000JK\u0005o\u0000\u0000KL\u0005n"+
		"\u0000\u0000LM\u0005s\u0000\u0000MN\u0005t\u0000\u0000N\u000e\u0001\u0000"+
		"\u0000\u0000OP\u0005>\u0000\u0000PQ\u0005>\u0000\u0000QR\u0005>\u0000"+
		"\u0000R\u0010\u0001\u0000\u0000\u0000SY\u0007\u0000\u0000\u0000TV\u0007"+
		"\u0001\u0000\u0000UT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000"+
		"WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XZ\u0001\u0000\u0000"+
		"\u0000YU\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\u0012\u0001"+
		"\u0000\u0000\u0000[_\u0005\"\u0000\u0000\\^\b\u0002\u0000\u0000]\\\u0001"+
		"\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000"+
		"_`\u0001\u0000\u0000\u0000`b\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000"+
		"\u0000bc\u0005\"\u0000\u0000c\u0014\u0001\u0000\u0000\u0000df\u0005-\u0000"+
		"\u0000ed\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0001\u0000"+
		"\u0000\u0000gk\u0007\u0003\u0000\u0000hj\u0003\u0017\u000b\u0000ih\u0001"+
		"\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000"+
		"kl\u0001\u0000\u0000\u0000lt\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000"+
		"\u0000np\u0005.\u0000\u0000oq\u0003\u0017\u000b\u0000po\u0001\u0000\u0000"+
		"\u0000qr\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000"+
		"\u0000\u0000su\u0001\u0000\u0000\u0000tn\u0001\u0000\u0000\u0000tu\u0001"+
		"\u0000\u0000\u0000u\u0016\u0001\u0000\u0000\u0000vw\u0007\u0004\u0000"+
		"\u0000w\u0018\u0001\u0000\u0000\u0000x\u0084\u0007\u0005\u0000\u0000y"+
		"z\u0005=\u0000\u0000z\u0084\u0005=\u0000\u0000{|\u0005!\u0000\u0000|\u0084"+
		"\u0005=\u0000\u0000}\u0084\u0005<\u0000\u0000~\u007f\u0005<\u0000\u0000"+
		"\u007f\u0084\u0005=\u0000\u0000\u0080\u0084\u0005>\u0000\u0000\u0081\u0082"+
		"\u0005>\u0000\u0000\u0082\u0084\u0005=\u0000\u0000\u0083x\u0001\u0000"+
		"\u0000\u0000\u0083y\u0001\u0000\u0000\u0000\u0083{\u0001\u0000\u0000\u0000"+
		"\u0083}\u0001\u0000\u0000\u0000\u0083~\u0001\u0000\u0000\u0000\u0083\u0080"+
		"\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u001a"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0005:\u0000\u0000\u0086\u0087\u0005"+
		"=\u0000\u0000\u0087\u001c\u0001\u0000\u0000\u0000\u0088\u0089\u0005(\u0000"+
		"\u0000\u0089\u001e\u0001\u0000\u0000\u0000\u008a\u008b\u0005)\u0000\u0000"+
		"\u008b \u0001\u0000\u0000\u0000\u008c\u008d\u0005<\u0000\u0000\u008d\u008e"+
		"\u0005<\u0000\u0000\u008e\"\u0001\u0000\u0000\u0000\u008f\u0090\u0005"+
		">\u0000\u0000\u0090\u0091\u0005>\u0000\u0000\u0091$\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0005.\u0000\u0000\u0093\u0094\u0005.\u0000\u0000\u0094"+
		"&\u0001\u0000\u0000\u0000\u0095\u0096\u0005#\u0000\u0000\u0096\u0097\u0005"+
		"#\u0000\u0000\u0097\u0098\u0005#\u0000\u0000\u0098\u009c\u0001\u0000\u0000"+
		"\u0000\u0099\u009b\b\u0006\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000"+
		"\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009f\u0001\u0000\u0000\u0000"+
		"\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u00a0\u0006\u0013\u0000\u0000"+
		"\u00a0(\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005.\u0000\u0000\u00a2*"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a5\u0007\u0007\u0000\u0000\u00a4\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0006\u0015\u0000\u0000\u00a9,\u0001"+
		"\u0000\u0000\u0000\u000b\u0000WY_ekrt\u0083\u009c\u00a6\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}