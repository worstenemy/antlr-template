grammar Template;

template: statement+ EOF;

statement: braced  #sBraced
         | text    #sText;

text: symbol  #tSymbol
    | plain   #tPlain;

symbol: '+'
      | '-'
      | '*'
      | '/'
      | '%'
      | '>'
      | '<'
      | '='
      | '\''
      | '!'
      | '~';

plain: ~('${' | '}');

braced: '${' tinyStmt '}';

tinyStmt: IDENTIFIER     #sId
        | tinyObject     #sObject
        | tinyCall       #sCall;

tinyObject: IDENTIFIER                                                   #oSymbol
          | tinyObject '.' IDENTIFIER '(' tinyExpr (',' tinyExpr)* ')'   #oArgCall
          | tinyObject '.' IDENTIFIER '(' ')'                            #oNonArgCall
          | tinyObject '.' IDENTIFIER                                    #oAccess;

tinyCall: IDENTIFIER '(' tinyExpr (',' tinyExpr)* ')';

tinyExpr: IDENTIFIER          #eId
        | INTEGER_VALUE       #eInt
        | QUOTED_IDENTIFIER   #eStr
        | tinyObject          #eObject
        | tinyCall            #eCall;

INTEGER_VALUE: DIGIT+;

IDENTIFIER: (LETTER | '_') (LETTER | DIGIT | '_' | '@' | ':')*;

QUOTED_IDENTIFIER: '"' ( ~'"' | '""' )* '"';

fragment DIGIT: [0-9];

fragment LETTER: [a-zA-Z];

WS: [ \r\n\t]+ -> channel(HIDDEN);