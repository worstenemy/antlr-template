grammar Template;

template
    : statement+ EOF
    ;

statement
    : braced  #sBraced
    | text    #sText
    ;

text
    : symbol  #tSymbol
    | plain   #tPlain
    ;

symbol
    : '+'
    | '-'
    | '*'
    | '/'
    | '%'
    | '>'
    | '<'
    | '='
    | '\''
    | '!'
    | '~'
    ;

plain
    : ~('${' | '}')
    ;

braced
    : '${' tinyStmt '}'
    ;

tinyStmt
    : tinyCall       #sCall
    | IDENTIFIER     #sId
    ;

tinyCall
    : IDENTIFIER '(' tinyExpr (',' tinyExpr)* ')'
    ;

tinyExpr
    : tinyCall            #eCall
    | IDENTIFIER          #eId
    | INTEGER_VALUE       #eInt
    | QUOTED_IDENTIFIER   #eStr
    ;

INTEGER_VALUE
    : DIGIT+
    ;

IDENTIFIER
    : (LETTER | '_') (LETTER | DIGIT | '_' | '@' | ':')*
    ;

QUOTED_IDENTIFIER
    : '"' ( ~'"' | '""' )* '"'
    ;

fragment DIGIT
    : [0-9]
    ;

fragment LETTER
    : [a-zA-Z]
    ;

WS
    : [ \r\n\t]+ -> channel(HIDDEN)
    ;