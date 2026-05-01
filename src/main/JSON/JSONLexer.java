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
		NULL=1, TRUE=2, FALSE=3, STRING=4, NUMBER=5, DIGIT=6, LEFT_BRACE=7, RIGHT_BRACE=8, 
		LEFT_BRACKET=9, RIGHT_BRACKET=10, QUOTATION_MARK=11, COLON=12, COMMA=13, 
		WHITESPACE=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NULL", "TRUE", "FALSE", "STRING", "NUMBER", "DIGIT", "LEFT_BRACE", "RIGHT_BRACE", 
			"LEFT_BRACKET", "RIGHT_BRACKET", "QUOTATION_MARK", "COLON", "COMMA", 
			"WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'null'", "'true'", "'false'", null, null, null, "'{'", "'}'", 
			"'['", "']'", "'\"'", "':'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NULL", "TRUE", "FALSE", "STRING", "NUMBER", "DIGIT", "LEFT_BRACE", 
			"RIGHT_BRACE", "LEFT_BRACKET", "RIGHT_BRACKET", "QUOTATION_MARK", "COLON", 
			"COMMA", "WHITESPACE"
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
		"\u0004\u0000\u000e_\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0005\u00030\b\u0003\n\u0003"+
		"\f\u00033\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0003\u00048\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004<\b\u0004\n\u0004\f\u0004?\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0004\u0004C\b\u0004\u000b\u0004\f\u0004D\u0003"+
		"\u0004G\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0004\rZ\b\r\u000b\r\f\r[\u0001"+
		"\r\u0001\r\u0000\u0000\u000e\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u0001\u0000\u0004\u0001\u0000\"\"\u0001\u0000"+
		"19\u0001\u000009\u0003\u0000\t\n\r\r  d\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0001\u001d\u0001\u0000\u0000\u0000\u0003"+
		"\"\u0001\u0000\u0000\u0000\u0005\'\u0001\u0000\u0000\u0000\u0007-\u0001"+
		"\u0000\u0000\u0000\t7\u0001\u0000\u0000\u0000\u000bH\u0001\u0000\u0000"+
		"\u0000\rJ\u0001\u0000\u0000\u0000\u000fL\u0001\u0000\u0000\u0000\u0011"+
		"N\u0001\u0000\u0000\u0000\u0013P\u0001\u0000\u0000\u0000\u0015R\u0001"+
		"\u0000\u0000\u0000\u0017T\u0001\u0000\u0000\u0000\u0019V\u0001\u0000\u0000"+
		"\u0000\u001bY\u0001\u0000\u0000\u0000\u001d\u001e\u0005n\u0000\u0000\u001e"+
		"\u001f\u0005u\u0000\u0000\u001f \u0005l\u0000\u0000 !\u0005l\u0000\u0000"+
		"!\u0002\u0001\u0000\u0000\u0000\"#\u0005t\u0000\u0000#$\u0005r\u0000\u0000"+
		"$%\u0005u\u0000\u0000%&\u0005e\u0000\u0000&\u0004\u0001\u0000\u0000\u0000"+
		"\'(\u0005f\u0000\u0000()\u0005a\u0000\u0000)*\u0005l\u0000\u0000*+\u0005"+
		"s\u0000\u0000+,\u0005e\u0000\u0000,\u0006\u0001\u0000\u0000\u0000-1\u0005"+
		"\"\u0000\u0000.0\b\u0000\u0000\u0000/.\u0001\u0000\u0000\u000003\u0001"+
		"\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u0000"+
		"24\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000045\u0005\"\u0000\u0000"+
		"5\b\u0001\u0000\u0000\u000068\u0005-\u0000\u000076\u0001\u0000\u0000\u0000"+
		"78\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009=\u0007\u0001\u0000"+
		"\u0000:<\u0003\u000b\u0005\u0000;:\u0001\u0000\u0000\u0000<?\u0001\u0000"+
		"\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>F\u0001"+
		"\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@B\u0005.\u0000\u0000AC\u0003"+
		"\u000b\u0005\u0000BA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000"+
		"DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EG\u0001\u0000\u0000"+
		"\u0000F@\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000G\n\u0001\u0000"+
		"\u0000\u0000HI\u0007\u0002\u0000\u0000I\f\u0001\u0000\u0000\u0000JK\u0005"+
		"{\u0000\u0000K\u000e\u0001\u0000\u0000\u0000LM\u0005}\u0000\u0000M\u0010"+
		"\u0001\u0000\u0000\u0000NO\u0005[\u0000\u0000O\u0012\u0001\u0000\u0000"+
		"\u0000PQ\u0005]\u0000\u0000Q\u0014\u0001\u0000\u0000\u0000RS\u0005\"\u0000"+
		"\u0000S\u0016\u0001\u0000\u0000\u0000TU\u0005:\u0000\u0000U\u0018\u0001"+
		"\u0000\u0000\u0000VW\u0005,\u0000\u0000W\u001a\u0001\u0000\u0000\u0000"+
		"XZ\u0007\u0003\u0000\u0000YX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0001\u0000"+
		"\u0000\u0000]^\u0006\r\u0000\u0000^\u001c\u0001\u0000\u0000\u0000\u0007"+
		"\u000017=DF[\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}