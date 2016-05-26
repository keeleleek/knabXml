lexer grammar KnabLexer;

KIRJESEP: '%\r\n';
KIRJEEND: '!\r\n';

/*
LisaridaOsis: ~[/\n\r]+;
LisaridaSep:  '/';
*/

Viide:           '>' Rida;
AmetlikRoopnimi: '=' Rida;
Laiend:          '$' Rida; // -> mode(LAIEND);
Roopnimed:       '(' Rida;
Iseloomustus:    '1' Rida;
Morfoloogia:     '2' Rida;
Etymoloogia:     '3' Rida;
Geotunnused:     '4' Rida;
Alaobjektid:     '5' Rida;
Ylaobjektid:     '6' Rida;
Lisaviited:      '7' Rida;
Ajalugu:         '8' Rida;
Koostaja:        '9' Rida;

Rida: TEXT* NL;
TEXT: ~[\r\n];

NL: '\r'? '\n';


/* siia ei jõutagi, kuna '$' Rida ei leita, leitakse ainult '$jaReaTekstiKonkatenatsioon'
mode LAIEND;
EXIT_LAIEND: NL -> mode(DEFAULT_MODE);
Laiend_TEXT: ~[\r\n]+;
*/