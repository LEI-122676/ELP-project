grammar Javardair;

script: instruction+;

instruction: break | controlstructure | assign | print; // | compoundassign;

controlstructure: ifelse | forloop;

assign: type VARIABLE EQUAL expression SEPARATOR | VARIABLE COMPOUNDOP expression SEPARATOR;   // mut nomeVariavel = 123;

//compoundassign: VARIABLE COMPOUNDOP expression SEPARATOR;

type: MUT | CONST;

expression: term (OPERATOR term)*;

term: BOOLEAN | NUMBER | STRING | VARIABLE (ACCESS VARIABLE)* | OPENPARENTHESIS expression CLOSEPARENTHESIS;

print: 'print' OPENPARENTHESIS expression CLOSEPARENTHESIS SEPARATOR;

break: BREAK SEPARATOR;

ifelse: 'if' guard OPENBLOCK ifSequence=instruction+ CLOSEBLOCK
        ('else' OPENBLOCK elseSequence=instruction+ CLOSEBLOCK)?;
forloop: 'for' OPENPARENTHESIS VARIABLE IN expression CLOSEPARENTHESIS OPENBLOCK sequence=instruction+ CLOSEBLOCK;

guard: OPENPARENTHESIS expression CLOSEPARENTHESIS;

BREAK : 'break';

MUT: 'mut';
CONST: 'const';
IN: '>>>';

BOOLEAN : 'true' | 'false';
VARIABLE: [A-Za-z] ([A-Za-z_0-9]+)?;
STRING: '"' ~["]* '"';

NUMBER: '0' | '0.' DIGIT+ | '-'? [1-9] DIGIT* ('.' DIGIT+)? | '-0.' [0-9]* [1-9] [0-9]*;
DIGIT: [0-9];

OPERATOR: '+' | '-' | '*' | '/' | '%' | '==' | '!=' | '<' | '<=' | '>' | '>=';
COMPOUNDOP: '+=' | '-=' | '*=' | '/=' | '%=';
EQUAL: ':=';

OPENPARENTHESIS: '(';
CLOSEPARENTHESIS: ')';
OPENBLOCK: '<<';
CLOSEBLOCK: '>>';

ACCESS: '..';
COMMENT: '###' ~[\r\n]* -> skip;
SEPARATOR: '.';
WS: [ \t\r\n]+ -> skip;

