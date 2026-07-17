grammar Expr;

root : expr EOF;
expr: EOF;

// PALABRAS CLAVE
ABSTRACT : 'abstract';
AND : 'and' ;
ARRAY : 'array' ;
AS : 'as' ;
BREAK : 'break' ;
CALLABLE : 'callable' ;
CASE : 'case' ;
CATCH : 'catch' ;
CLASS : 'class' ;
CLONE : 'clone' ;
CONST : 'const' ;
CONTINUE : 'continue' ;
DECLARE : 'declare' ;
DEFAULT : 'default' ;
DO : 'do' ;
ECHO : 'echo' ;
ELSE : 'else' ;
ELSEIF : 'elseif' ;
EMPTY : 'empty' | 'empty()' ;
ENDDECLARE : 'enddeclare' ;
ENDFOR : 'endfor' ;
ENDFOREACH : 'endforeach' ;
ENDIF : 'endif' ;
ENDSWITCH : 'endswitch' ;
ENDWHILE : 'endwhile' ;
EVAL : 'eval' ;
EXIT : 'exit' | 'die' ;
EXTENDS : 'extends' ;
FINAL : 'final' ;
FINALLY : 'finally' ;
FN : 'fn' ;
FOR : 'for' ;
FOREACH : 'foreach' ;
FUNCTION : 'function' ;
GLOBAL : 'global' ;
GOTO : 'goto' ;
IF : 'if' ;
IMPLEMENTS : 'implements' ;
INCLUDE : 'include' ;
INCLUDE_ONCE : 'include_once' ;
INSTANCEOF : 'instanceof' ;
INSTEADOF : 'insteadof' ;
INTERFACE : 'interface' ;
ISSET : 'isset';
LIST : 'list';
MATCH : 'match' ;
NAMESPACE : 'namespace' ;
NEW : 'new' ;
OR : 'or' ;
PRINT : 'print' ;
PRIVATE : 'private' ;
PROTECTED : 'protected' ;
PUBLIC : 'public' ;
READONLY : 'readonly' ;
REQUIRE : 'require' ;
REQUIRE_ONCE : 'require_once' ;
RETURN : 'return' ;
STATIC : 'static' ;
SWITCH : 'switch' ;
THROW : 'throw' ;
TRAIT : 'trait' ;
TRY : 'try' ;
UNSET : 'unset' ;
USE : 'use' ;
VAR : 'var' ;
WHILE : 'while' ;
LOGICAL_XOR : 'xor' ;
YIELD : 'yield' ;
YIELD_FROM : 'yield from' ;

CADENA : '"' ~["\r\n]* '"' | '\'' ~['\r\n]* '\'' ;
IDT : [a-zA-Z_][a-zA-Z0-9_]+ ;
NUM: [0-9]+ ;

// OPERADORES ARITMÉTICOS
PLUS : '+' ;
MINUS : '-' ;
MUL : '*' ;
DIV : '/' ;
MOD : '%' ;
POW : '**' ;

// OPERADORES DE ASIGNACIÓN
ASSIGN : '=' ;
PLUS_EQUAL : '+=' ;
MINUS_EQUAL : '-=' ;
MUL_EQUAL : '*=' ;
DIV_EQUAL : '/=' ;
MOD_EQUAL : '%=' ;
POW_EQUAL : '**=' ;
CONCAT_EQUAL : '.=' ;
COALESCE_EQUAL : '??=' ;

// OPERADORES DE COMPARACIÓN
IS_EQUAL : '==' ;
IS_IDENTICAL : '===' ;
IS_NOT_EQUAL : '!=' | '<>' ;
IS_NOT_IDENTICAL : '!==' ;
LT : '<' ;
GT : '>' ;
LE : '<=' ;
GE : '>=' ;
SPACESHIP : '<=>' ;

// OPERADORES LÓGICOS
BOOLEAN_AND : '&&' ;
BOOLEAN_OR : '||' ;
NOT : '!' ;

// OPERADORES DE INCREMENTO / DECREMENTO

INC : '++' ;
DEC : '--' ;

// OTROS 
DOT : '.' ;
QUESTION : '?' ;
COLON : ':' ;
COALESCE : '??' ;
ELLIPSIS : '...' ;
DOUBLE_ARROW : '=>' ;

// PUNTUACIÓN Y DELIMITADORES
SEMICOLON : ';' ;
COMMA : ',' ;
PAREN_OPEN : '(' ;
PAREN_CLOSE : ')' ;
BRACE_OPEN : '{' ;
BRACE_CLOSE : '}' ;
BRACKET_OPEN : '[' ;
BRACKET_CLOSE : ']' ;
OBJECT_OPERATOR : '->' ;
DOUBLE_COLON : '::' ;
DOLLAR : '$' ;
NS_SEPARATOR : '\\' ;
OPEN_TAG : '<?php' ;
CLOSE_TAG : '?>' ;

LINE_COMMENT : '//' ~[\r\n]* -> skip ;
BLOCK_COMMENT : '/*' .*? '*/' -> skip ;
HASH_COMMENT : '#' ~[\r\n]* -> skip ;

WS: [ \t\r\n]+ -> skip ;