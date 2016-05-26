lexer grammar KnabLexer;

KIRJESEP: '%\r\n';
KIRJEEND: '!\r\n';

Viide: '>' Rida;
AmetlikRoopnimi: '=' Rida;
Laiend: '$' Rida;
Roopnimed: '(' Rida;
Iseloomustus: '1' Rida;// '1'
Etymoloogia: '3' Rida;// '3'
Alaobjektid: '5' Rida;// '5'
Ajalugu: '8' Rida;// '8'
Koostaja: '9' Rida;

Rida: TEXT* NL;
TEXT: ~[\r\n];

NL: '\r'? '\n';
//WS: [\r\n] {skip();} ;

