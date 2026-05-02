grammar Javardair;

script: instruction+;

instruction: controlstructure | assign | print | break;

controlstructure: ifelse | while;

assign: VARIABLE ':=' expression SEPARATOR;

expression: term (OPERATOR term)*;

term: LITERAL | VARIABLE | OPENPARENTHESIS expression CLOSEPARENTHESIS;

print: 'print' expression SEPARATOR;

break: 'break' SEPARATOR;

ifelse: 'if' guard OPENBRACKETS instruction+ CLOSEBRACKETS
        ('else' OPENBRACKETS instruction+ CLOSEBRACKETS)?;
while: 'while' guard OPENBRACKETS instruction+ CLOSEBRACKETS;

guard: OPENPARENTHESIS expression CLOSEPARENTHESIS;


LITERAL: [0-9]+;
VARIABLE: [A-Za-z]+;

OPERATOR: PLUS | MINUS | TIMES | DIVISION | MODULE | EQUALSTO | DIFFERENT | LESSTHEN | LESSOREQUALTO | GREATERTHEN | GREATEROREQUALTO;

EQUAL: '=';
PLUS: '+';
MINUS: '-';
TIMES: '*';
DIVISION: '/';
MODULE: '%';

EQUALSTO: '==';
DIFFERENT: '!=';
LESSTHEN: '<';
LESSOREQUALTO: '<=';
GREATERTHEN: '>';
GREATEROREQUALTO: '>=';

OPENPARENTHESIS: '(';
CLOSEPARENTHESIS: ')';
OPENBRACKETS: '{';
CLOSEBRACKETS: '}';

COMMENT: '#' ~[\r\n]* -> skip;
SEPARATOR: ';';
WS: [ \t\r\n]+ -> skip;