grammar Dsl;

dsl_braced: '${' dsl_param '}'           #dsl_arg
          | '${' dsl_methodInvoke '}'    #dsl_call
          | '${' dsl_objectAccess '}'    #dsl_access
          | '${' dsl_literal '}'         #dsl_notation;

dsl_methodInvoke: dsl_methodName '(' dsl_expressions? ')';

dsl_methodName: DSL_IDENTIFIER;

dsl_objectAccess: dsl_param                                #dsl_accessParam
                | dsl_methodInvoke                         #dsl_accessMethod
                | dsl_objectAccess '.' dsl_methodInvoke    #dsl_accessObjectMethod
                | dsl_objectAccess '.' dsl_field           #dsl_accessObjectField;

dsl_field: DSL_IDENTIFIER;

dsl_expressions: dsl_expression (',' dsl_expression)*;

dsl_expression: dsl_param              #dsl_paramExpression
              | dsl_literal            #dsl_literalExpression
              | dsl_objectAccess       #dsl_objectExpression
              | dsl_methodInvoke       #dsl_methodInvokeExpression;

dsl_literal: dsl_number                 #dsl_numberLiteral
           | '#' dsl_typedString '#'    #dsl_stringLiteral;

dsl_param: DSL_IDENTIFIER;

dsl_number: DSL_INTEGER_VALUE;

dsl_typedString: (~'#' | dsl_specialString)+;

dsl_specialString: (':' | '@' | '$' | '^' | '&' | '{' | '[' | ']' | '"' | ';');

DSL_INTEGER_VALUE: DSL_DIGIT+;

DSL_IDENTIFIER: (DSL_LETTER | '_') (DSL_LETTER | DSL_DIGIT | '_')*;

fragment DSL_DIGIT: [0-9];

fragment DSL_LETTER: [a-zA-Z];

WS: [ \r\n\t]+ -> channel(HIDDEN);