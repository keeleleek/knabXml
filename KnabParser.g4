parser grammar KnabParser;
options { tokenVocab=KnabLexer; }


kihelkond: uldandmed kirjed lisainfo? EOF;

uldandmed: Rida Rida;

kirjed: kirje (KIRJESEP kirje)*? KIRJEEND;

kirje: pohirida lisarida jargrida*?;

pohirida: Rida;

lisarida: Rida;

jargrida: viide
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
        ;

lisainfo: Rida*;

viide: Viide;
ametlikRoopnimi: AmetlikRoopnimi;
laiend: Laiend;
roopnimed: Roopnimed;
iseloomustus: Iseloomustus;
morfoloogia: Morfoloogia;
etymoloogia: Etymoloogia;
geotunnused: Geotunnused;
alaobjektid: Alaobjektid;
ylaobjektid: Ylaobjektid;
lisaviited: Lisaviited;
ajalugu: Ajalugu;
koostaja: Koostaja;

