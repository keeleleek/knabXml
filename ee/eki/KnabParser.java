// Generated from KnabParser.g4 by ANTLR 4.5.3
 package ee.eki; 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KnabParser extends Parser {
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
	public static final int
		RULE_kihelkond = 0, RULE_uldandmed = 1, RULE_kirjed = 2, RULE_kirje = 3, 
		RULE_pohirida = 4, RULE_lisarida = 5, RULE_jargread = 6, RULE_lisainfo = 7, 
		RULE_viiterida = 8, RULE_ametlikRoopnimi = 9, RULE_laiend = 10, RULE_roopnimed = 11, 
		RULE_iseloomustus = 12, RULE_morfoloogia = 13, RULE_etymoloogia = 14, 
		RULE_geotunnused = 15, RULE_alaobjektid = 16, RULE_ylaobjektid = 17, RULE_lisaviited = 18, 
		RULE_ajalugu = 19, RULE_koostaja = 20, RULE_text = 21, RULE_infomargend = 22, 
		RULE_allikaviide = 23, RULE_kommentaar = 24, RULE_sisu = 25, RULE_nl = 26;
	public static final String[] ruleNames = {
		"kihelkond", "uldandmed", "kirjed", "kirje", "pohirida", "lisarida", "jargread", 
		"lisainfo", "viiterida", "ametlikRoopnimi", "laiend", "roopnimed", "iseloomustus", 
		"morfoloogia", "etymoloogia", "geotunnused", "alaobjektid", "ylaobjektid", 
		"lisaviited", "ajalugu", "koostaja", "text", "infomargend", "allikaviide", 
		"kommentaar", "sisu", "nl"
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

	@Override
	public String getGrammarFileName() { return "KnabParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    /** Eemaldab tekstist esimese ja viimase tähemärgi. */
	    String chop(String text) {
	        return text.substring(1, text.length()-1);
	    }
	    /** Trükib teksti välja */
	    void print(String text) {
	        //System.out.print(text);
	    }

	public KnabParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class KihelkondContext extends ParserRuleContext {
		public UldandmedContext uldandmed() {
			return getRuleContext(UldandmedContext.class,0);
		}
		public KirjedContext kirjed() {
			return getRuleContext(KirjedContext.class,0);
		}
		public TerminalNode EOF() { return getToken(KnabParser.EOF, 0); }
		public TerminalNode BOM() { return getToken(KnabParser.BOM, 0); }
		public LisainfoContext lisainfo() {
			return getRuleContext(LisainfoContext.class,0);
		}
		public KihelkondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kihelkond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).enterKihelkond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).exitKihelkond(this);
		}
	}

	public final KihelkondContext kihelkond() throws RecognitionException {
		KihelkondContext _localctx = new KihelkondContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_kihelkond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_la = _input.LA(1);
			if (_la==BOM) {
				{
				setState(54);
				match(BOM);
				}
			}

			print("<kihelkond>\n");
			print("<üldandmed>");
			setState(59);
			uldandmed();
			print("</üldandmed>\n");
			setState(61);
			kirjed();
			setState(63);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << ALLIKAVIIDE) | (1L << KOMMENTAAR) | (1L << INFOMARGEND) | (1L << TEXT))) != 0)) {
				{
				setState(62);
				lisainfo();
				}
			}

			setState(65);
			match(EOF);
			print("</kihelkond>\n");
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

	public static class UldandmedContext extends ParserRuleContext {
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public List<NlContext> nl() {
			return getRuleContexts(NlContext.class);
		}
		public NlContext nl(int i) {
			return getRuleContext(NlContext.class,i);
		}
		public UldandmedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uldandmed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).enterUldandmed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).exitUldandmed(this);
		}
	}

	public final UldandmedContext uldandmed() throws RecognitionException {
		UldandmedContext _localctx = new UldandmedContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_uldandmed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("<rida1>");
			setState(69);
			text();
			print("</rida1>\n");
			setState(71);
			nl();
			print("<rida2>");
			setState(73);
			text();
			print("</rida2>\n");
			setState(75);
			nl();
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

	public static class KirjedContext extends ParserRuleContext {
		public List<KirjeContext> kirje() {
			return getRuleContexts(KirjeContext.class);
		}
		public KirjeContext kirje(int i) {
			return getRuleContext(KirjeContext.class,i);
		}
		public TerminalNode KIRJEEND() { return getToken(KnabParser.KIRJEEND, 0); }
		public List<TerminalNode> KIRJESEP() { return getTokens(KnabParser.KIRJESEP); }
		public TerminalNode KIRJESEP(int i) {
			return getToken(KnabParser.KIRJESEP, i);
		}
		public KirjedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kirjed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).enterKirjed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).exitKirjed(this);
		}
	}

	public final KirjedContext kirjed() throws RecognitionException {
		KirjedContext _localctx = new KirjedContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_kirjed);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			kirje();
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(78);
					match(KIRJESEP);
					setState(79);
					kirje();
					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(85);
			match(KIRJEEND);
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

	public static class KirjeContext extends ParserRuleContext {
		public PohiridaContext pohirida() {
			return getRuleContext(PohiridaContext.class,0);
		}
		public LisaridaContext lisarida() {
			return getRuleContext(LisaridaContext.class,0);
		}
		public JargreadContext jargread() {
			return getRuleContext(JargreadContext.class,0);
		}
		public KirjeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kirje; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).enterKirje(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).exitKirje(this);
		}
	}

	public final KirjeContext kirje() throws RecognitionException {
		KirjeContext _localctx = new KirjeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_kirje);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("<kirje>\n");
			setState(88);
			pohirida();
			setState(89);
			lisarida();
			setState(91);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ViiteridaSep) | (1L << AmetlikRoopnimiSep) | (1L << LaiendSep) | (1L << RoopnimedSep) | (1L << IseloomustusSep) | (1L << MorfoloogiaSep) | (1L << EtymoloogiaSep) | (1L << GeotunnusedSep) | (1L << AlaobjektidSep) | (1L << YlaobjektidSep) | (1L << LisaviitedSep) | (1L << AjaluguSep) | (1L << KoostajaSep))) != 0)) {
				{
				setState(90);
				jargread();
				}
			}

			print("</kirje>\n\n");
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

	public static class PohiridaContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public PohiridaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pohirida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).enterPohirida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).exitPohirida(this);
		}
	}

	public final PohiridaContext pohirida() throws RecognitionException {
		PohiridaContext _localctx = new PohiridaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pohirida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("<põhirida>");
			setState(96);
			text();
			print("</põhirida>\n");
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

	public static class LisaridaContext extends ParserRuleContext {
		public TerminalNode LisaridaSep() { return getToken(KnabParser.LisaridaSep, 0); }
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public LisaridaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lisarida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).enterLisarida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).exitLisarida(this);
		}
	}

	public final LisaridaContext lisarida() throws RecognitionException {
		LisaridaContext _localctx = new LisaridaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lisarida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(LisaridaSep);
			print("<lisarida>");
			setState(101);
			text();
			print("</lisarida>\n");
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

	public static class JargreadContext extends ParserRuleContext {
		public List<ViiteridaContext> viiterida() {
			return getRuleContexts(ViiteridaContext.class);
		}
		public ViiteridaContext viiterida(int i) {
			return getRuleContext(ViiteridaContext.class,i);
		}
		public List<AmetlikRoopnimiContext> ametlikRoopnimi() {
			return getRuleContexts(AmetlikRoopnimiContext.class);
		}
		public AmetlikRoopnimiContext ametlikRoopnimi(int i) {
			return getRuleContext(AmetlikRoopnimiContext.class,i);
		}
		public List<LaiendContext> laiend() {
			return getRuleContexts(LaiendContext.class);
		}
		public LaiendContext laiend(int i) {
			return getRuleContext(LaiendContext.class,i);
		}
		public List<RoopnimedContext> roopnimed() {
			return getRuleContexts(RoopnimedContext.class);
		}
		public RoopnimedContext roopnimed(int i) {
			return getRuleContext(RoopnimedContext.class,i);
		}
		public List<IseloomustusContext> iseloomustus() {
			return getRuleContexts(IseloomustusContext.class);
		}
		public IseloomustusContext iseloomustus(int i) {
			return getRuleContext(IseloomustusContext.class,i);
		}
		public List<MorfoloogiaContext> morfoloogia() {
			return getRuleContexts(MorfoloogiaContext.class);
		}
		public MorfoloogiaContext morfoloogia(int i) {
			return getRuleContext(MorfoloogiaContext.class,i);
		}
		public List<EtymoloogiaContext> etymoloogia() {
			return getRuleContexts(EtymoloogiaContext.class);
		}
		public EtymoloogiaContext etymoloogia(int i) {
			return getRuleContext(EtymoloogiaContext.class,i);
		}
		public List<GeotunnusedContext> geotunnused() {
			return getRuleContexts(GeotunnusedContext.class);
		}
		public GeotunnusedContext geotunnused(int i) {
			return getRuleContext(GeotunnusedContext.class,i);
		}
		public List<AlaobjektidContext> alaobjektid() {
			return getRuleContexts(AlaobjektidContext.class);
		}
		public AlaobjektidContext alaobjektid(int i) {
			return getRuleContext(AlaobjektidContext.class,i);
		}
		public List<YlaobjektidContext> ylaobjektid() {
			return getRuleContexts(YlaobjektidContext.class);
		}
		public YlaobjektidContext ylaobjektid(int i) {
			return getRuleContext(YlaobjektidContext.class,i);
		}
		public List<LisaviitedContext> lisaviited() {
			return getRuleContexts(LisaviitedContext.class);
		}
		public LisaviitedContext lisaviited(int i) {
			return getRuleContext(LisaviitedContext.class,i);
		}
		public List<AjaluguContext> ajalugu() {
			return getRuleContexts(AjaluguContext.class);
		}
		public AjaluguContext ajalugu(int i) {
			return getRuleContext(AjaluguContext.class,i);
		}
		public List<KoostajaContext> koostaja() {
			return getRuleContexts(KoostajaContext.class);
		}
		public KoostajaContext koostaja(int i) {
			return getRuleContext(KoostajaContext.class,i);
		}
		public JargreadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jargread; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).enterJargread(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).exitJargread(this);
		}
	}

	public final JargreadContext jargread() throws RecognitionException {
		JargreadContext _localctx = new JargreadContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_jargread);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(117);
				switch (_input.LA(1)) {
				case ViiteridaSep:
					{
					setState(104);
					viiterida();
					}
					break;
				case AmetlikRoopnimiSep:
					{
					setState(105);
					ametlikRoopnimi();
					}
					break;
				case LaiendSep:
					{
					setState(106);
					laiend();
					}
					break;
				case RoopnimedSep:
					{
					setState(107);
					roopnimed();
					}
					break;
				case IseloomustusSep:
					{
					setState(108);
					iseloomustus();
					}
					break;
				case MorfoloogiaSep:
					{
					setState(109);
					morfoloogia();
					}
					break;
				case EtymoloogiaSep:
					{
					setState(110);
					etymoloogia();
					}
					break;
				case GeotunnusedSep:
					{
					setState(111);
					geotunnused();
					}
					break;
				case AlaobjektidSep:
					{
					setState(112);
					alaobjektid();
					}
					break;
				case YlaobjektidSep:
					{
					setState(113);
					ylaobjektid();
					}
					break;
				case LisaviitedSep:
					{
					setState(114);
					lisaviited();
					}
					break;
				case AjaluguSep:
					{
					setState(115);
					ajalugu();
					}
					break;
				case KoostajaSep:
					{
					setState(116);
					koostaja();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ViiteridaSep) | (1L << AmetlikRoopnimiSep) | (1L << LaiendSep) | (1L << RoopnimedSep) | (1L << IseloomustusSep) | (1L << MorfoloogiaSep) | (1L << EtymoloogiaSep) | (1L << GeotunnusedSep) | (1L << AlaobjektidSep) | (1L << YlaobjektidSep) | (1L << LisaviitedSep) | (1L << AjaluguSep) | (1L << KoostajaSep))) != 0) );
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

	public static class LisainfoContext extends ParserRuleContext {
		public List<NlContext> nl() {
			return getRuleContexts(NlContext.class);
		}
		public NlContext nl(int i) {
			return getRuleContext(NlContext.class,i);
		}
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public LisainfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lisainfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).enterLisainfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).exitLisainfo(this);
		}
	}

	public final LisainfoContext lisainfo() throws RecognitionException {
		LisainfoContext _localctx = new LisainfoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lisainfo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(121);
				nl();
				}
				break;
			}
			print("<lisainfo>");
			setState(129); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(126);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALLIKAVIIDE) | (1L << KOMMENTAAR) | (1L << INFOMARGEND) | (1L << TEXT))) != 0)) {
					{
					setState(125);
					text();
					}
				}

				setState(128);
				nl();
				}
				}
				setState(131); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << ALLIKAVIIDE) | (1L << KOMMENTAAR) | (1L << INFOMARGEND) | (1L << TEXT))) != 0) );
			print("</lisainfo>\n");
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

	public static class ViiteridaContext extends ParserRuleContext {
		public TerminalNode ViiteridaSep() { return getToken(KnabParser.ViiteridaSep, 0); }
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public ViiteridaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viiterida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).enterViiterida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).exitViiterida(this);
		}
	}

	public final ViiteridaContext viiterida() throws RecognitionException {
		ViiteridaContext _localctx = new ViiteridaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_viiterida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(ViiteridaSep);
			print("<viiterida>");
			setState(137);
			text();
			print("</viiterida>\n");
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

	public static class AmetlikRoopnimiContext extends ParserRuleContext {
		public TerminalNode AmetlikRoopnimiSep() { return getToken(KnabParser.AmetlikRoopnimiSep, 0); }
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public AmetlikRoopnimiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ametlikRoopnimi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).enterAmetlikRoopnimi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).exitAmetlikRoopnimi(this);
		}
	}

	public final AmetlikRoopnimiContext ametlikRoopnimi() throws RecognitionException {
		AmetlikRoopnimiContext _localctx = new AmetlikRoopnimiContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ametlikRoopnimi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(AmetlikRoopnimiSep);
			print("<ametlikrööpnimirida>");
			setState(142);
			text();
			print("</ametlikrööpnimirida>\n");
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

	public static class LaiendContext extends ParserRuleContext {
		public TerminalNode LaiendSep() { return getToken(KnabParser.LaiendSep, 0); }
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public LaiendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_laiend; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).enterLaiend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).exitLaiend(this);
		}
	}

	public final LaiendContext laiend() throws RecognitionException {
		LaiendContext _localctx = new LaiendContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_laiend);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(LaiendSep);
			print("<laiendirida>");
			setState(147);
			text();
			print("</laiendirida>\n");
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

	public static class RoopnimedContext extends ParserRuleContext {
		public TerminalNode RoopnimedSep() { return getToken(KnabParser.RoopnimedSep, 0); }
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public RoopnimedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roopnimed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).enterRoopnimed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).exitRoopnimed(this);
		}
	}

	public final RoopnimedContext roopnimed() throws RecognitionException {
		RoopnimedContext _localctx = new RoopnimedContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_roopnimed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(RoopnimedSep);
			print("<rööpnimerida>");
			setState(152);
			text();
			print("</rööpnimerida>\n");
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

	public static class IseloomustusContext extends ParserRuleContext {
		public TerminalNode IseloomustusSep() { return getToken(KnabParser.IseloomustusSep, 0); }
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public IseloomustusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iseloomustus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).enterIseloomustus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).exitIseloomustus(this);
		}
	}

	public final IseloomustusContext iseloomustus() throws RecognitionException {
		IseloomustusContext _localctx = new IseloomustusContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_iseloomustus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(IseloomustusSep);
			print("<iseloomustusrida>");
			setState(157);
			text();
			print("</iseloomustusrida>\n");
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

	public static class MorfoloogiaContext extends ParserRuleContext {
		public TerminalNode MorfoloogiaSep() { return getToken(KnabParser.MorfoloogiaSep, 0); }
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public MorfoloogiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_morfoloogia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).enterMorfoloogia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).exitMorfoloogia(this);
		}
	}

	public final MorfoloogiaContext morfoloogia() throws RecognitionException {
		MorfoloogiaContext _localctx = new MorfoloogiaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_morfoloogia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(MorfoloogiaSep);
			print("<morfoloogiarida>");
			setState(162);
			text();
			print("</morfoloogiarida>\n");
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

	public static class EtymoloogiaContext extends ParserRuleContext {
		public TerminalNode EtymoloogiaSep() { return getToken(KnabParser.EtymoloogiaSep, 0); }
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public EtymoloogiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etymoloogia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).enterEtymoloogia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).exitEtymoloogia(this);
		}
	}

	public final EtymoloogiaContext etymoloogia() throws RecognitionException {
		EtymoloogiaContext _localctx = new EtymoloogiaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_etymoloogia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(EtymoloogiaSep);
			print("<etümoloogiarida>");
			setState(167);
			text();
			print("</etümoloogiarida>\n");
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

	public static class GeotunnusedContext extends ParserRuleContext {
		public TerminalNode GeotunnusedSep() { return getToken(KnabParser.GeotunnusedSep, 0); }
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public GeotunnusedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_geotunnused; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).enterGeotunnused(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).exitGeotunnused(this);
		}
	}

	public final GeotunnusedContext geotunnused() throws RecognitionException {
		GeotunnusedContext _localctx = new GeotunnusedContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_geotunnused);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(GeotunnusedSep);
			print("<geotunnusterida>");
			setState(172);
			text();
			print("</geotunnusterida>\n");
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

	public static class AlaobjektidContext extends ParserRuleContext {
		public TerminalNode AlaobjektidSep() { return getToken(KnabParser.AlaobjektidSep, 0); }
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public AlaobjektidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alaobjektid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).enterAlaobjektid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).exitAlaobjektid(this);
		}
	}

	public final AlaobjektidContext alaobjektid() throws RecognitionException {
		AlaobjektidContext _localctx = new AlaobjektidContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_alaobjektid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(AlaobjektidSep);
			print("<alaobjektiderida>");
			setState(177);
			text();
			print("</alaobjektiderida>\n");
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

	public static class YlaobjektidContext extends ParserRuleContext {
		public TerminalNode YlaobjektidSep() { return getToken(KnabParser.YlaobjektidSep, 0); }
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public YlaobjektidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ylaobjektid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).enterYlaobjektid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).exitYlaobjektid(this);
		}
	}

	public final YlaobjektidContext ylaobjektid() throws RecognitionException {
		YlaobjektidContext _localctx = new YlaobjektidContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ylaobjektid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(YlaobjektidSep);
			print("<ülaobjektiderida>");
			setState(182);
			text();
			print("</ülaobjektiderida>\n");
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

	public static class LisaviitedContext extends ParserRuleContext {
		public TerminalNode LisaviitedSep() { return getToken(KnabParser.LisaviitedSep, 0); }
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public LisaviitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lisaviited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).enterLisaviited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).exitLisaviited(this);
		}
	}

	public final LisaviitedContext lisaviited() throws RecognitionException {
		LisaviitedContext _localctx = new LisaviitedContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_lisaviited);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(LisaviitedSep);
			print("<lisaviiterida>");
			setState(187);
			text();
			print("</lisaviiterida>\n");
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

	public static class AjaluguContext extends ParserRuleContext {
		public TerminalNode AjaluguSep() { return getToken(KnabParser.AjaluguSep, 0); }
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public AjaluguContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ajalugu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).enterAjalugu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).exitAjalugu(this);
		}
	}

	public final AjaluguContext ajalugu() throws RecognitionException {
		AjaluguContext _localctx = new AjaluguContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ajalugu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(AjaluguSep);
			print("<ajaloorida>");
			setState(192);
			text();
			print("</ajaloorida>\n");
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

	public static class KoostajaContext extends ParserRuleContext {
		public TerminalNode KoostajaSep() { return getToken(KnabParser.KoostajaSep, 0); }
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public KoostajaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_koostaja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).enterKoostaja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).exitKoostaja(this);
		}
	}

	public final KoostajaContext koostaja() throws RecognitionException {
		KoostajaContext _localctx = new KoostajaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_koostaja);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(KoostajaSep);
			print("<koostajarida>");
			setState(197);
			text();
			print("</koostajarida>\n");
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

	public static class TextContext extends ParserRuleContext {
		public List<InfomargendContext> infomargend() {
			return getRuleContexts(InfomargendContext.class);
		}
		public InfomargendContext infomargend(int i) {
			return getRuleContext(InfomargendContext.class,i);
		}
		public List<AllikaviideContext> allikaviide() {
			return getRuleContexts(AllikaviideContext.class);
		}
		public AllikaviideContext allikaviide(int i) {
			return getRuleContext(AllikaviideContext.class,i);
		}
		public List<KommentaarContext> kommentaar() {
			return getRuleContexts(KommentaarContext.class);
		}
		public KommentaarContext kommentaar(int i) {
			return getRuleContext(KommentaarContext.class,i);
		}
		public List<SisuContext> sisu() {
			return getRuleContexts(SisuContext.class);
		}
		public SisuContext sisu(int i) {
			return getRuleContext(SisuContext.class,i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).exitText(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(204);
				switch (_input.LA(1)) {
				case INFOMARGEND:
					{
					setState(200);
					infomargend();
					}
					break;
				case ALLIKAVIIDE:
					{
					setState(201);
					allikaviide();
					}
					break;
				case KOMMENTAAR:
					{
					setState(202);
					kommentaar();
					}
					break;
				case TEXT:
					{
					setState(203);
					sisu();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(206); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALLIKAVIIDE) | (1L << KOMMENTAAR) | (1L << INFOMARGEND) | (1L << TEXT))) != 0) );
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

	public static class InfomargendContext extends ParserRuleContext {
		public Token INFOMARGEND;
		public TerminalNode INFOMARGEND() { return getToken(KnabParser.INFOMARGEND, 0); }
		public InfomargendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infomargend; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).enterInfomargend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).exitInfomargend(this);
		}
	}

	public final InfomargendContext infomargend() throws RecognitionException {
		InfomargendContext _localctx = new InfomargendContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_infomargend);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			((InfomargendContext)_localctx).INFOMARGEND = match(INFOMARGEND);
			print("<infomärgendid>"         + chop((((InfomargendContext)_localctx).INFOMARGEND!=null?((InfomargendContext)_localctx).INFOMARGEND.getText():null)) + "</infomärgendid>");
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

	public static class AllikaviideContext extends ParserRuleContext {
		public Token ALLIKAVIIDE;
		public TerminalNode ALLIKAVIIDE() { return getToken(KnabParser.ALLIKAVIIDE, 0); }
		public AllikaviideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allikaviide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).enterAllikaviide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).exitAllikaviide(this);
		}
	}

	public final AllikaviideContext allikaviide() throws RecognitionException {
		AllikaviideContext _localctx = new AllikaviideContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_allikaviide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			((AllikaviideContext)_localctx).ALLIKAVIIDE = match(ALLIKAVIIDE);
			print("<allikaviitemärgendid>"  + chop((((AllikaviideContext)_localctx).ALLIKAVIIDE!=null?((AllikaviideContext)_localctx).ALLIKAVIIDE.getText():null)) + "</allikaviitemärgendid>");
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

	public static class KommentaarContext extends ParserRuleContext {
		public Token KOMMENTAAR;
		public TerminalNode KOMMENTAAR() { return getToken(KnabParser.KOMMENTAAR, 0); }
		public KommentaarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kommentaar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).enterKommentaar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).exitKommentaar(this);
		}
	}

	public final KommentaarContext kommentaar() throws RecognitionException {
		KommentaarContext _localctx = new KommentaarContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_kommentaar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			((KommentaarContext)_localctx).KOMMENTAAR = match(KOMMENTAAR);
			print("<kommentaarimärgendid>"  + chop((((KommentaarContext)_localctx).KOMMENTAAR!=null?((KommentaarContext)_localctx).KOMMENTAAR.getText():null))  + "</kommentaarimärgendid>");
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

	public static class SisuContext extends ParserRuleContext {
		public Token TEXT;
		public TerminalNode TEXT() { return getToken(KnabParser.TEXT, 0); }
		public SisuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sisu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).enterSisu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).exitSisu(this);
		}
	}

	public final SisuContext sisu() throws RecognitionException {
		SisuContext _localctx = new SisuContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_sisu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			((SisuContext)_localctx).TEXT = match(TEXT);
			print((((SisuContext)_localctx).TEXT!=null?((SisuContext)_localctx).TEXT.getText():null));
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

	public static class NlContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(KnabParser.NL, 0); }
		public NlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).enterNl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnabParserListener ) ((KnabParserListener)listener).exitNl(this);
		}
	}

	public final NlContext nl() throws RecognitionException {
		NlContext _localctx = new NlContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_nl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(NL);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30\u00e1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\5\2:\n\2\3\2\3\2\3\2\3\2\3\2\3\2\5"+
		"\2B\n\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7"+
		"\4S\n\4\f\4\16\4V\13\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5^\n\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\6\bx\n\b\r\b\16\by\3\t\5\t}\n\t\3\t\3\t\5\t\u0081\n\t\3\t"+
		"\6\t\u0084\n\t\r\t\16\t\u0085\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\6\27\u00cf\n\27\r\27\16\27\u00d0\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3T\2\35\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\2\u00dd\29\3"+
		"\2\2\2\4F\3\2\2\2\6O\3\2\2\2\bY\3\2\2\2\na\3\2\2\2\fe\3\2\2\2\16w\3\2"+
		"\2\2\20|\3\2\2\2\22\u0089\3\2\2\2\24\u008e\3\2\2\2\26\u0093\3\2\2\2\30"+
		"\u0098\3\2\2\2\32\u009d\3\2\2\2\34\u00a2\3\2\2\2\36\u00a7\3\2\2\2 \u00ac"+
		"\3\2\2\2\"\u00b1\3\2\2\2$\u00b6\3\2\2\2&\u00bb\3\2\2\2(\u00c0\3\2\2\2"+
		"*\u00c5\3\2\2\2,\u00ce\3\2\2\2.\u00d2\3\2\2\2\60\u00d5\3\2\2\2\62\u00d8"+
		"\3\2\2\2\64\u00db\3\2\2\2\66\u00de\3\2\2\28:\7\3\2\298\3\2\2\29:\3\2\2"+
		"\2:;\3\2\2\2;<\b\2\1\2<=\b\2\1\2=>\5\4\3\2>?\b\2\1\2?A\5\6\4\2@B\5\20"+
		"\t\2A@\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\7\2\2\3DE\b\2\1\2E\3\3\2\2\2FG\b"+
		"\3\1\2GH\5,\27\2HI\b\3\1\2IJ\5\66\34\2JK\b\3\1\2KL\5,\27\2LM\b\3\1\2M"+
		"N\5\66\34\2N\5\3\2\2\2OT\5\b\5\2PQ\7\4\2\2QS\5\b\5\2RP\3\2\2\2SV\3\2\2"+
		"\2TU\3\2\2\2TR\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7\5\2\2X\7\3\2\2\2YZ\b\5"+
		"\1\2Z[\5\n\6\2[]\5\f\7\2\\^\5\16\b\2]\\\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`"+
		"\b\5\1\2`\t\3\2\2\2ab\b\6\1\2bc\5,\27\2cd\b\6\1\2d\13\3\2\2\2ef\7\6\2"+
		"\2fg\b\7\1\2gh\5,\27\2hi\b\7\1\2i\r\3\2\2\2jx\5\22\n\2kx\5\24\13\2lx\5"+
		"\26\f\2mx\5\30\r\2nx\5\32\16\2ox\5\34\17\2px\5\36\20\2qx\5 \21\2rx\5\""+
		"\22\2sx\5$\23\2tx\5&\24\2ux\5(\25\2vx\5*\26\2wj\3\2\2\2wk\3\2\2\2wl\3"+
		"\2\2\2wm\3\2\2\2wn\3\2\2\2wo\3\2\2\2wp\3\2\2\2wq\3\2\2\2wr\3\2\2\2ws\3"+
		"\2\2\2wt\3\2\2\2wu\3\2\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\17"+
		"\3\2\2\2{}\5\66\34\2|{\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\u0083\b\t\1\2\177"+
		"\u0081\5,\27\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2"+
		"\2\u0082\u0084\5\66\34\2\u0083\u0080\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\b\t"+
		"\1\2\u0088\21\3\2\2\2\u0089\u008a\7\7\2\2\u008a\u008b\b\n\1\2\u008b\u008c"+
		"\5,\27\2\u008c\u008d\b\n\1\2\u008d\23\3\2\2\2\u008e\u008f\7\b\2\2\u008f"+
		"\u0090\b\13\1\2\u0090\u0091\5,\27\2\u0091\u0092\b\13\1\2\u0092\25\3\2"+
		"\2\2\u0093\u0094\7\t\2\2\u0094\u0095\b\f\1\2\u0095\u0096\5,\27\2\u0096"+
		"\u0097\b\f\1\2\u0097\27\3\2\2\2\u0098\u0099\7\n\2\2\u0099\u009a\b\r\1"+
		"\2\u009a\u009b\5,\27\2\u009b\u009c\b\r\1\2\u009c\31\3\2\2\2\u009d\u009e"+
		"\7\13\2\2\u009e\u009f\b\16\1\2\u009f\u00a0\5,\27\2\u00a0\u00a1\b\16\1"+
		"\2\u00a1\33\3\2\2\2\u00a2\u00a3\7\f\2\2\u00a3\u00a4\b\17\1\2\u00a4\u00a5"+
		"\5,\27\2\u00a5\u00a6\b\17\1\2\u00a6\35\3\2\2\2\u00a7\u00a8\7\r\2\2\u00a8"+
		"\u00a9\b\20\1\2\u00a9\u00aa\5,\27\2\u00aa\u00ab\b\20\1\2\u00ab\37\3\2"+
		"\2\2\u00ac\u00ad\7\16\2\2\u00ad\u00ae\b\21\1\2\u00ae\u00af\5,\27\2\u00af"+
		"\u00b0\b\21\1\2\u00b0!\3\2\2\2\u00b1\u00b2\7\17\2\2\u00b2\u00b3\b\22\1"+
		"\2\u00b3\u00b4\5,\27\2\u00b4\u00b5\b\22\1\2\u00b5#\3\2\2\2\u00b6\u00b7"+
		"\7\20\2\2\u00b7\u00b8\b\23\1\2\u00b8\u00b9\5,\27\2\u00b9\u00ba\b\23\1"+
		"\2\u00ba%\3\2\2\2\u00bb\u00bc\7\21\2\2\u00bc\u00bd\b\24\1\2\u00bd\u00be"+
		"\5,\27\2\u00be\u00bf\b\24\1\2\u00bf\'\3\2\2\2\u00c0\u00c1\7\22\2\2\u00c1"+
		"\u00c2\b\25\1\2\u00c2\u00c3\5,\27\2\u00c3\u00c4\b\25\1\2\u00c4)\3\2\2"+
		"\2\u00c5\u00c6\7\23\2\2\u00c6\u00c7\b\26\1\2\u00c7\u00c8\5,\27\2\u00c8"+
		"\u00c9\b\26\1\2\u00c9+\3\2\2\2\u00ca\u00cf\5.\30\2\u00cb\u00cf\5\60\31"+
		"\2\u00cc\u00cf\5\62\32\2\u00cd\u00cf\5\64\33\2\u00ce\u00ca\3\2\2\2\u00ce"+
		"\u00cb\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1-\3\2\2\2\u00d2\u00d3"+
		"\7\27\2\2\u00d3\u00d4\b\30\1\2\u00d4/\3\2\2\2\u00d5\u00d6\7\25\2\2\u00d6"+
		"\u00d7\b\31\1\2\u00d7\61\3\2\2\2\u00d8\u00d9\7\26\2\2\u00d9\u00da\b\32"+
		"\1\2\u00da\63\3\2\2\2\u00db\u00dc\7\30\2\2\u00dc\u00dd\b\33\1\2\u00dd"+
		"\65\3\2\2\2\u00de\u00df\7\24\2\2\u00df\67\3\2\2\2\r9AT]wy|\u0080\u0085"+
		"\u00ce\u00d0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}