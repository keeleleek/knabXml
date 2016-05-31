parser grammar KnabParser;
options { tokenVocab=KnabLexer; }

//antlr4 KnabLexer.g4 && antlr4 KnabParser.g4 && javac Knab*.java && grun Knab kihelkond -tokens -gui ./EHRHAG.JXF

kihelkond: uldandmed kirjed lisainfo? EOF;

uldandmed: TEXT NL TEXT NL;

kirjed: kirje (KIRJESEP kirje)*? KIRJEEND;

kirje: pohirida lisarida jargread?;

pohirida: text;

lisarida: LisaridaSep text;

jargread: (viiterida
          | ametlikRoopnimi
          | laiend
          | roopnimed
          | iseloomustus
          | morfoloogia
          | etymoloogia
          | geotunnused
          | alaobjektid
          | ylaobjektid
          | lisaviited
          | ajalugu
          | koostaja
          )+;

lisainfo: NL? (text? NL)+;

viiterida:       ViiteridaSep    text;
ametlikRoopnimi: AmetlikRoopnimiSep text;
laiend:          LaiendSep       text;
roopnimed:       RoopnimedSep    text;
iseloomustus:    IseloomustusSep text;
morfoloogia:     MorfoloogiaSep  text;
etymoloogia:     EtymoloogiaSep  text;
geotunnused:     GeotunnusedSep  text;
alaobjektid:     AlaobjektidSep  text;
ylaobjektid:     YlaobjektidSep  text;
lisaviited:      LisaviitedSep   text;
ajalugu:         AjaluguSep      text;
koostaja:        KoostajaSep     text;

text: (infomargend|allikaviide|kommentaar|sisu)+;
infomargend: INFOMARGEND;
allikaviide: ALLIKAVIIDE;
kommentaar: KOMMENTAAR;
sisu: TEXT;