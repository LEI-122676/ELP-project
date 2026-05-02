grammar JSON;

value: object | array | STRING | NUMBER | 'true' | 'false' | 'null';

object: '{' (pair (COMMA pair)*)? '}';
array: '[' (value (COMMA value)*)? ']';
pair: STRING ':' value;

STRING: '"' ~["]* '"';

NUMBER: '-'? [1-9] DIGIT* ('.' DIGIT+)?;
DIGIT: [0-9];

COMMA: ',';
WHITESPACE: [ \r\n\t]+ -> skip;