grammar JSON;

jvalue:  jarray | JSTRING | jnumber | JBOOLEAN | JNULL | jobject;

jfield: JSTRING ':' jvalue;

jarray: '[' (jvalue (COMMA jvalue)*)? ']';

jobject: '{' (jfield (COMMA jfield)*)? '}';

jnumber: DOUBLE | INT;


JSTRING: '"' ~["]* '"';

INT: '0' | '-'? [1-9] DIGIT*;
DOUBLE: '-'? [1-9] DIGIT* ('.' DIGIT+)?;
DIGIT: [0-9];

JBOOLEAN: 'true' | 'false';
JNULL: 'null';

COMMA: ',';
WHITESPACE: [ \r\n\t]+ -> skip;