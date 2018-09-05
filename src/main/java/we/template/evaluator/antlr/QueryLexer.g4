lexer grammar QueryLexer;

StartTag: '${' -> mode(DSL);
Text: ~'$'+;

mode DSL;
EndTag: '}' -> mode(DEFAULT_MODE);
DualQuotedString: '"' ( ~'"' | '""' )*  '"';
SingleQuotedString: '\'' ( ~ '\'' | '\'\'')* '\'';
Identifier: (Letter | '_') (Letter | '_')*;
Number: Digit+;

GT: '>';
LT: '<';
GE: '>=';
LE: '<=';
EQ: '==';
NE: '!=';

CONCAT: '+';

OR: '||';
AND: '&&';

LParen: '(';
RParen: ')';

Comma: ',';

fragment Digit: [0-9];
fragment Letter: [a-zA-Z];

WS: [ \r\n\t]+ -> channel(HIDDEN);