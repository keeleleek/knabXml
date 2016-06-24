// Generated from KnabLexer.g4 by ANTLR 4.5.3
 package ee.eki; 
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KnabLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOM=1, KIRJESEP=2, KIRJEEND=3, LisaridaSep=4, ViiteridaSep=5, AmetlikRoopnimiSep=6, 
		LaiendSep=7, RoopnimedSep=8, IseloomustusSep=9, MorfoloogiaSep=10, EtymoloogiaSep=11, 
		GeotunnusedSep=12, AlaobjektidSep=13, YlaobjektidSep=14, LisaviitedSep=15, 
		AjaluguSep=16, KoostajaSep=17, NL=18, ALLIKAVIIDE=19, KOMMENTAAR=20, INFOMARGEND=21, 
		TEXT=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BOM", "KIRJESEP", "KIRJEEND", "LisaridaSep", "ViiteridaSep", "AmetlikRoopnimiSep", 
		"LaiendSep", "RoopnimedSep", "IseloomustusSep", "MorfoloogiaSep", "EtymoloogiaSep", 
		"GeotunnusedSep", "AlaobjektidSep", "YlaobjektidSep", "LisaviitedSep", 
		"AjaluguSep", "KoostajaSep", "NL", "ALLIKAVIIDE", "AllikaviideAlgus", 
		"AllikaviideTekst", "AllikaviideLopp", "KOMMENTAAR", "KommentaariAlgus", 
		"KommentaariTekst", "KommentaariLopp", "INFOMARGEND", "InfomargendAlgus", 
		"InfomargendTekst", "InfomargendLopp", "TEXT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\\uFEFF'", "'\r\n%\r\n'", "'\r\n!\r\n'", "'\r\n/'", "'\r\n>'", 
		"'\r\n='", "'\r\n$'", "'\r\n('", "'\r\n1'", "'\r\n2'", "'\r\n3'", "'\r\n4'", 
		"'\r\n5'", "'\r\n6'", "'\r\n7'", "'\r\n8'", "'\r\n9'", "'\r\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BOM", "KIRJESEP", "KIRJEEND", "LisaridaSep", "ViiteridaSep", "AmetlikRoopnimiSep", 
		"LaiendSep", "RoopnimedSep", "IseloomustusSep", "MorfoloogiaSep", "EtymoloogiaSep", 
		"GeotunnusedSep", "AlaobjektidSep", "YlaobjektidSep", "LisaviitedSep", 
		"AjaluguSep", "KoostajaSep", "NL", "ALLIKAVIIDE", "KOMMENTAAR", "INFOMARGEND", 
		"TEXT"
	};
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


	public KnabLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "KnabLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u00b6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\26\6\26\u0092\n\26\r\26\16\26\u0093\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\32\6\32\u009f\n\32\r\32\16\32\u00a0\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\36\6\36\u00ac\n\36\r\36\16\36\u00ad\3\37\3\37\3 \6 "+
		"\u00b3\n \r \16 \u00b4\3\u00b4\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\2+\2-\2/\26\61"+
		"\2\63\2\65\2\67\279\2;\2=\2?\30\3\2\6\5\2\f\f\17\17^_\5\2\f\f\17\17\177"+
		"\177\5\2\f\f\17\17@@\4\2\f\f\17\17\u00b0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2/"+
		"\3\2\2\2\2\67\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5C\3\2\2\2\7I\3\2\2\2\tO\3"+
		"\2\2\2\13S\3\2\2\2\rW\3\2\2\2\17[\3\2\2\2\21_\3\2\2\2\23c\3\2\2\2\25g"+
		"\3\2\2\2\27k\3\2\2\2\31o\3\2\2\2\33s\3\2\2\2\35w\3\2\2\2\37{\3\2\2\2!"+
		"\177\3\2\2\2#\u0083\3\2\2\2%\u0087\3\2\2\2\'\u008a\3\2\2\2)\u008e\3\2"+
		"\2\2+\u0091\3\2\2\2-\u0095\3\2\2\2/\u0097\3\2\2\2\61\u009b\3\2\2\2\63"+
		"\u009e\3\2\2\2\65\u00a2\3\2\2\2\67\u00a4\3\2\2\29\u00a8\3\2\2\2;\u00ab"+
		"\3\2\2\2=\u00af\3\2\2\2?\u00b2\3\2\2\2AB\7\uff01\2\2B\4\3\2\2\2CD\7\17"+
		"\2\2DE\7\f\2\2EF\7\'\2\2FG\7\17\2\2GH\7\f\2\2H\6\3\2\2\2IJ\7\17\2\2JK"+
		"\7\f\2\2KL\7#\2\2LM\7\17\2\2MN\7\f\2\2N\b\3\2\2\2OP\7\17\2\2PQ\7\f\2\2"+
		"QR\7\61\2\2R\n\3\2\2\2ST\7\17\2\2TU\7\f\2\2UV\7@\2\2V\f\3\2\2\2WX\7\17"+
		"\2\2XY\7\f\2\2YZ\7?\2\2Z\16\3\2\2\2[\\\7\17\2\2\\]\7\f\2\2]^\7&\2\2^\20"+
		"\3\2\2\2_`\7\17\2\2`a\7\f\2\2ab\7*\2\2b\22\3\2\2\2cd\7\17\2\2de\7\f\2"+
		"\2ef\7\63\2\2f\24\3\2\2\2gh\7\17\2\2hi\7\f\2\2ij\7\64\2\2j\26\3\2\2\2"+
		"kl\7\17\2\2lm\7\f\2\2mn\7\65\2\2n\30\3\2\2\2op\7\17\2\2pq\7\f\2\2qr\7"+
		"\66\2\2r\32\3\2\2\2st\7\17\2\2tu\7\f\2\2uv\7\67\2\2v\34\3\2\2\2wx\7\17"+
		"\2\2xy\7\f\2\2yz\78\2\2z\36\3\2\2\2{|\7\17\2\2|}\7\f\2\2}~\79\2\2~ \3"+
		"\2\2\2\177\u0080\7\17\2\2\u0080\u0081\7\f\2\2\u0081\u0082\7:\2\2\u0082"+
		"\"\3\2\2\2\u0083\u0084\7\17\2\2\u0084\u0085\7\f\2\2\u0085\u0086\7;\2\2"+
		"\u0086$\3\2\2\2\u0087\u0088\7\17\2\2\u0088\u0089\7\f\2\2\u0089&\3\2\2"+
		"\2\u008a\u008b\5)\25\2\u008b\u008c\5+\26\2\u008c\u008d\5-\27\2\u008d("+
		"\3\2\2\2\u008e\u008f\7]\2\2\u008f*\3\2\2\2\u0090\u0092\n\2\2\2\u0091\u0090"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		",\3\2\2\2\u0095\u0096\7_\2\2\u0096.\3\2\2\2\u0097\u0098\5\61\31\2\u0098"+
		"\u0099\5\63\32\2\u0099\u009a\5\65\33\2\u009a\60\3\2\2\2\u009b\u009c\7"+
		"}\2\2\u009c\62\3\2\2\2\u009d\u009f\n\3\2\2\u009e\u009d\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\64\3\2\2\2\u00a2"+
		"\u00a3\7\177\2\2\u00a3\66\3\2\2\2\u00a4\u00a5\59\35\2\u00a5\u00a6\5;\36"+
		"\2\u00a6\u00a7\5=\37\2\u00a78\3\2\2\2\u00a8\u00a9\7>\2\2\u00a9:\3\2\2"+
		"\2\u00aa\u00ac\n\4\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab"+
		"\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae<\3\2\2\2\u00af\u00b0\7@\2\2\u00b0>"+
		"\3\2\2\2\u00b1\u00b3\n\5\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5@\3\2\2\2\7\2\u0093\u00a0\u00ad"+
		"\u00b4\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}