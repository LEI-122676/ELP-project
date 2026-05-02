grammar Javardair;

script: instruction+;

instruction: /*function | */ controlstructure | assign | print | break;

//function: 'function' VARIABLE OPENPARENTHESIS (VARIABLE (',' VARIABLE)*)? CLOSEPARENTHESIS OPENBRACKETS instruction+ CLOSEBRACKETS;

controlstructure: ifelse | while;

assign: TYPE VARIABLE EQUAL expression SEPARATOR;   // mut nomeVariavel = 123;

expression: term (OPERATOR term)*;

term: NUMBER | VARIABLE | OPENPARENTHESIS expression CLOSEPARENTHESIS;

print: 'print' expression SEPARATOR;

break: BREAK SEPARATOR;

ifelse: 'if' guard OPENBRACKETS ifSequence=instruction+ CLOSEBRACKETS
        ('else' OPENBRACKETS elseSequence=instruction+ CLOSEBRACKETS)?;
while: 'while' guard OPENBRACKETS sequence=instruction+ CLOSEBRACKETS;

guard: OPENPARENTHESIS expression CLOSEPARENTHESIS;


TYPE: MUT | CONST;
MUT: 'mut';
CONST: 'const';

BREAK : 'break';
VARIABLE: [A-Za-z] ([A-Za-z_0-9]+)?;

NUMBER: '-'? [1-9] DIGIT* ('.' DIGIT+)?;
DIGIT: [0-9];

OPERATOR: '+' | '-' | '*' | '/' | '%' | '==' | '!=' | '<' | '<=' | '>' | '>=';

EQUAL: ':=';

OPENPARENTHESIS: '(';
CLOSEPARENTHESIS: ')';
OPENBRACKETS: '{';
CLOSEBRACKETS: '}';

COMMENT: '#' ~[\r\n]* -> skip;
SEPARATOR: ';';
WS: [ \t\r\n]+ -> skip;
