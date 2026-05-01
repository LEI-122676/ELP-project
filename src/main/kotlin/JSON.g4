grammar JSON;

value: boolean | string | number | object | array | null;
object: LEFT_BRACE (pair (COMMA pair)*)? RIGHT_BRACE;

pair: string COLON value;

null: NULL;
boolean: TRUE | FALSE;
string: STRING;
number: NUMBER;
array: LEFT_BRACKET (value (COMMA value)*)? RIGHT_BRACKET;

NULL: 'null';
TRUE: 'true';
FALSE: 'false';

STRING: '"' ~["]* '"';

NUMBER: '-'? [1-9] DIGIT* ('.' DIGIT+)?;
DIGIT: [0-9];

LEFT_BRACE: '{';
RIGHT_BRACE: '}';

LEFT_BRACKET: '[';
RIGHT_BRACKET: ']';

QUOTATION_MARK: '"';
COLON: ':';
COMMA: ',';
WHITESPACE: [ \r\n\t]+ -> skip;