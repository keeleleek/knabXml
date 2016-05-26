parser grammar KnabParser;
options { tokenVocab=KnabLexer; }


kihelkond: uldandmed kirjed lisainfo? EOF;

uldandmed: Rida Rida;

kirjed: kirje (KIRJESEP kirje)*? KIRJEEND;
//kirjed: kirje ('%' NL kirje)*? '!' NL;

kirje: pohirida lisarida jargrida*?;

pohirida: Rida;

lisarida: Rida;

jargrida: viide  // lisada -> rewriteRule mis asendab jargrida viide-ga
        | ametlikRoopnimi // siia samuti parsepuu tipu asendus
        | laiend
        | roopnimed
        | iseloomustus
        | etymoloogia
        | alaobjektid
        | ajalugu
        | koostaja
        //| Rida
        ;

lisainfo: Rida*;

viide: Viide;
ametlikRoopnimi: AmetlikRoopnimi;
laiend: Laiend;
roopnimed: Roopnimed;
iseloomustus: Iseloomustus;
etymoloogia: Etymoloogia;
alaobjektid: Alaobjektid;
ajalugu: Ajalugu;
koostaja: Koostaja;

/*
Viide: '>' Rida;
AmetlikRoopnimi: '=' Rida;
Laiend: '$' Rida;
Roopnimed: '(' Rida;
// '1'
// '3'
// '5'
// '8'
// '9'


Rida: TEXT*;
TEXT: ~[\r\n];

WS: [\r\n] {skip();} ;
*/