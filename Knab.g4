grammar Knab;

kihelkond: uldandmed kirjed lisainfo? EOF;

uldandmed: Rida Rida;

kirjed: kirje ('%\r\n' kirje)*? '!\r\n';

kirje: pohirida lisarida jargrida*?;

pohirida: //Juhtmark Abijuhtmark Rida;
Rida;

//juhtmark: Juhtmark;

//Juhtmark: [ #*?^];

//abijuhtmark: Abijuhtmark;

//Abijuhtmark: ~[\t];

lisarida: '/' Rida;
//lisarida: Rida;
//lisarida: liigikood pr_halduvuskuuluvus '\u002F' aj_halduvuskuuluvus '\u002F' lahikuuluvus '\u002F' kohaviide '\r\n';
//liigikood: TEXT+? '/';
//pr_halduvuskuuluvus: TEXT+?;
//aj_halduvuskuuluvus: TEXT+?;
//lahikuuluvus: TEXT+?;
//kohaviide: TEXT+?;

jargrida: Rida;


Rida: TEXT*? '\r\n';
TEXT: ~[\r\n];
//Osa: (~[/\r\n] | '\u000D' | '\u000A' | '\uFEFF' )+?;

//lisainfo: .*?;
lisainfo: Rida*?;