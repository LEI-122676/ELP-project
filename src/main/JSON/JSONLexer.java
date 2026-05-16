// Generated from /mnt/SharedData/documents/university/3-ano/2-sem/ELP/project/project/src/main/kotlin/JSON.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class JSONLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, JSTRING=6, INT=7, DOUBLE=8, DIGIT=9, 
		JBOOLEAN=10, JNULL=11, COMMA=12, WHITESPACE=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "JSTRING", "INT", "DOUBLE", "DIGIT", 
			"JBOOLEAN", "JNULL", "COMMA", "WHITESPACE"
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


	public JSONLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JSON.g4"; }

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
		"\u0004\u0000\rh\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0005\u0005(\b\u0005\n\u0005\f\u0005+\t"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0003\u00061\b"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u00065\b\u0006\n\u0006\f\u00068\t"+
		"\u0006\u0003\u0006:\b\u0006\u0001\u0007\u0003\u0007=\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007A\b\u0007\n\u0007\f\u0007D\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0004\u0007H\b\u0007\u000b\u0007\f\u0007I\u0003\u0007L\b"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0003\tY\b\t\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0004\fc\b\f\u000b\f\f\fd\u0001"+
		"\f\u0001\f\u0000\u0000\r\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u0001\u0000\u0004\u0001\u0000\"\"\u0001\u000019\u0001\u0000"+
		"09\u0003\u0000\t\n\r\r  q\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0001\u001b\u0001\u0000"+
		"\u0000\u0000\u0003\u001d\u0001\u0000\u0000\u0000\u0005\u001f\u0001\u0000"+
		"\u0000\u0000\u0007!\u0001\u0000\u0000\u0000\t#\u0001\u0000\u0000\u0000"+
		"\u000b%\u0001\u0000\u0000\u0000\r9\u0001\u0000\u0000\u0000\u000f<\u0001"+
		"\u0000\u0000\u0000\u0011M\u0001\u0000\u0000\u0000\u0013X\u0001\u0000\u0000"+
		"\u0000\u0015Z\u0001\u0000\u0000\u0000\u0017_\u0001\u0000\u0000\u0000\u0019"+
		"b\u0001\u0000\u0000\u0000\u001b\u001c\u0005:\u0000\u0000\u001c\u0002\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\u0005[\u0000\u0000\u001e\u0004\u0001\u0000"+
		"\u0000\u0000\u001f \u0005]\u0000\u0000 \u0006\u0001\u0000\u0000\u0000"+
		"!\"\u0005{\u0000\u0000\"\b\u0001\u0000\u0000\u0000#$\u0005}\u0000\u0000"+
		"$\n\u0001\u0000\u0000\u0000%)\u0005\"\u0000\u0000&(\b\u0000\u0000\u0000"+
		"\'&\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000"+
		"\u0000)*\u0001\u0000\u0000\u0000*,\u0001\u0000\u0000\u0000+)\u0001\u0000"+
		"\u0000\u0000,-\u0005\"\u0000\u0000-\f\u0001\u0000\u0000\u0000.:\u0005"+
		"0\u0000\u0000/1\u0005-\u0000\u00000/\u0001\u0000\u0000\u000001\u0001\u0000"+
		"\u0000\u000012\u0001\u0000\u0000\u000026\u0007\u0001\u0000\u000035\u0003"+
		"\u0011\b\u000043\u0001\u0000\u0000\u000058\u0001\u0000\u0000\u000064\u0001"+
		"\u0000\u0000\u000067\u0001\u0000\u0000\u00007:\u0001\u0000\u0000\u0000"+
		"86\u0001\u0000\u0000\u00009.\u0001\u0000\u0000\u000090\u0001\u0000\u0000"+
		"\u0000:\u000e\u0001\u0000\u0000\u0000;=\u0005-\u0000\u0000<;\u0001\u0000"+
		"\u0000\u0000<=\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>B\u0007"+
		"\u0001\u0000\u0000?A\u0003\u0011\b\u0000@?\u0001\u0000\u0000\u0000AD\u0001"+
		"\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000"+
		"CK\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000EG\u0005.\u0000\u0000"+
		"FH\u0003\u0011\b\u0000GF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000"+
		"IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JL\u0001\u0000\u0000"+
		"\u0000KE\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000L\u0010\u0001"+
		"\u0000\u0000\u0000MN\u0007\u0002\u0000\u0000N\u0012\u0001\u0000\u0000"+
		"\u0000OP\u0005t\u0000\u0000PQ\u0005r\u0000\u0000QR\u0005u\u0000\u0000"+
		"RY\u0005e\u0000\u0000ST\u0005f\u0000\u0000TU\u0005a\u0000\u0000UV\u0005"+
		"l\u0000\u0000VW\u0005s\u0000\u0000WY\u0005e\u0000\u0000XO\u0001\u0000"+
		"\u0000\u0000XS\u0001\u0000\u0000\u0000Y\u0014\u0001\u0000\u0000\u0000"+
		"Z[\u0005n\u0000\u0000[\\\u0005u\u0000\u0000\\]\u0005l\u0000\u0000]^\u0005"+
		"l\u0000\u0000^\u0016\u0001\u0000\u0000\u0000_`\u0005,\u0000\u0000`\u0018"+
		"\u0001\u0000\u0000\u0000ac\u0007\u0003\u0000\u0000ba\u0001\u0000\u0000"+
		"\u0000cd\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000"+
		"\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0006\f\u0000\u0000g\u001a\u0001"+
		"\u0000\u0000\u0000\u000b\u0000)069<BIKXd\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}