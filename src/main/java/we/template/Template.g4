grammar Template;

import dsl;

template: statement+ EOF;

statement: dsl_braced  #bracedExpression
         | test        #plainText;

test: ~('${' | '}')
    | '+'
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