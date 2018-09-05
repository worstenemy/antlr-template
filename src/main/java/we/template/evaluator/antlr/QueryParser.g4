parser grammar QueryParser;

options { tokenVocab=QueryLexer; }

query: statement+ EOF;

statement: dsl    #richText
         | Text   #plainText;

dsl: StartTag dslType EndTag;

dslType: Identifier    #idType
       | function      #funcType;

function: name=Identifier '(' params=parameters ')';

parameters: logicExpression (',' logicExpression)*;

logicExpression: left=logicExpression '&&' right=logicExpression     #logicAndExpression
               | left=logicExpression '||' right=logicExpression     #logicOrExpression
               | boolExpression                                      #logicBaseExpression;

boolExpression: left=boolExpression comp=comparator right=boolExpression   #compareExpression
              | expression               #compareBaseExpression;

comparator: '>'     #gt
          | '<'     #lt
          | '=='    #eq
          | '>='    #ge
          | '<='    #le
          | '!='    #ne;

expression: left=expression '+' right=expression    #concatExpression
          | Identifier                   #idExpression
          | DualQuotedString             #stringExpression
          | SingleQuotedString           #stringExpression
          | Number          #numberExpression
          | function        #functionExpression;