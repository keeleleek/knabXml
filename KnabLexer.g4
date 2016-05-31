lexer grammar KnabLexer;

/* üldine loogika on, et reavahetustega algavad read, mitte ei lõpe */


/** kirjete vahel on % ja kirjete loendi lõpus on ! */
KIRJESEP: '\r\n%\r\n';
KIRJEEND: '\r\n!\r\n';

/** lisarida algab / märgiga */
LisaridaSep:        '\r\n/';

/** viiterida algab > märgiga */
ViiteridaSep:       '\r\n>';
/** ametlik rööpnimi algab = märgiga */
AmetlikRoopnimiSep: '\r\n=';
/** laiendirida algab $ märgiga */
LaiendSep:          '\r\n$';
/** rööpnimeread algab ( märgiga */
RoopnimedSep:       '\r\n(';
/** iseloomustusrida algab 1 märgiga */
IseloomustusSep:    '\r\n1';
/**  morfoloogiarida algab 2 märgiga */
MorfoloogiaSep:     '\r\n2';
/** etümoloogiarida algab 3 märgiga */
EtymoloogiaSep:     '\r\n3';
/** geotunnuste rida algab 4 märgiga */
GeotunnusedSep:     '\r\n4';
/** alaobjektide rida algab 5 märgiga */
AlaobjektidSep:     '\r\n5';
/** ülaobjektide rida algab 6 märgiga */
YlaobjektidSep:     '\r\n6';
/** lisaviidete rida algab 7 märgiga */
LisaviitedSep:      '\r\n7';
/** ajaloorida algab 8 märgiga */
AjaluguSep:         '\r\n8';
/** koostajarida algab 9 märgiga */
KoostajaSep:        '\r\n9';

/** tavaline reavahetus */
NL: '\r\n';

/** allikaviide on nurksulgudes */
ALLIKAVIIDE: AllikaviideAlgus AllikaviideTekst AllikaviideLopp;
fragment AllikaviideAlgus: '[';
fragment AllikaviideTekst: ~[\]]+;
fragment AllikaviideLopp:  ']';


/** kommentaarid on loogelistes sulgudes */
KOMMENTAAR: KommentaariAlgus KommentaariTekst KommentaariLopp;
fragment KommentaariAlgus: '{';
fragment KommentaariTekst: ~[}]+;
fragment KommentaariLopp:  '}';

/** infomärgendid on looksulgudes */
INFOMARGEND: InfomargendAlgus InfomargendTekst InfomargendLopp;
fragment InfomargendAlgus: '<';
fragment InfomargendTekst: ~[>]+;
fragment InfomargendLopp:  '>';

/** tekst on kõik peale erimärgendite ja reavahetuste */
TEXT: ~[[{<\r\n]+;
