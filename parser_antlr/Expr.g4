grammar Expr;

root : programa EOF;

programa : OPEN_TAG codigo CLOSE_TAG ;

codigo : (func | declarar_clase | importar_libreria | instruccion)* ;

bloque : instruccion* ;

instruccion
    : cond_if
    | cond_while
    | cond_for
    | cond_foreach
    | cond_switch
    | manejo_excepcion
    | control_salto
    | echo
    | declarar_var
    | expr_incremento SEMICOLON
    | llamada_funcion SEMICOLON
    | acceso_miembro SEMICOLON;

importar_libreria 
    : (REQUIRE_ONCE | REQUIRE | INCLUDE | INCLUDE_ONCE) CADENA SEMICOLON;

// FUNCIONES
declarar_func : FUNCTION IDT PAREN_OPEN paremetros? PAREN_CLOSE;

func :
    declarar_func BRACE_OPEN
        bloque
        (retorno SEMICOLON)?
    BRACE_CLOSE ;

paremetros 
    : ARRAY? var (COMMA ARRAY? var)*;

retorno : RETURN expr_matematica ;

llamada_funcion : IDT PAREN_OPEN argumentos? PAREN_CLOSE;

argumentos : valor (COMMA valor)*;

// CONDICIONALES / CONTROL DE FLUJO

cond_if
    : IF PAREN_OPEN condicional PAREN_CLOSE BRACE_OPEN bloque BRACE_CLOSE
    ( ELSEIF PAREN_OPEN condicional PAREN_CLOSE BRACE_OPEN bloque BRACE_CLOSE )*
    ( ELSE BRACE_OPEN bloque BRACE_CLOSE )? ;

cond_while
    : WHILE PAREN_OPEN condicional PAREN_CLOSE BRACE_OPEN bloque BRACE_CLOSE;

cond_for
    : FOR PAREN_OPEN declarar_var? SEMICOLON condicional? SEMICOLON expr_incremento? PAREN_CLOSE
      BRACE_OPEN bloque BRACE_CLOSE;

cond_foreach
    : FOREACH PAREN_OPEN var AS (var DOUBLE_ARROW)? var PAREN_CLOSE
      BRACE_OPEN bloque BRACE_CLOSE;

cond_switch
    : SWITCH PAREN_OPEN valor PAREN_CLOSE BRACE_OPEN
        (CASE valor COLON bloque)*
        (DEFAULT COLON bloque)?
      BRACE_CLOSE;

manejo_excepcion
    : TRY BRACE_OPEN bloque BRACE_CLOSE
      (CATCH PAREN_OPEN IDT var PAREN_CLOSE BRACE_OPEN bloque BRACE_CLOSE)+
      (FINALLY BRACE_OPEN bloque BRACE_CLOSE)?;

control_salto : (BREAK | CONTINUE) NUM? SEMICOLON;

condicional
    : condicional (BOOLEAN_AND | BOOLEAN_OR) condicional
    | valor_comparable op_comparacion valor_comparable
    | NOT condicional
    | PAREN_OPEN condicional PAREN_CLOSE
    | valor_comparable;

// VARIABLES, ASIGNACIONES Y SALIDA

var : DOLLAR IDT ;

expr_incremento : var (INC | DEC) | (INC | DEC) var;

declarar_var
    : var op_asignacion expr_matematica SEMICOLON
    | var ASSIGN declarar_func SEMICOLON
    | var ASSIGN declarar_array SEMICOLON
    | var ASSIGN acceso_arreglo SEMICOLON
    | var ASSIGN llamada_funcion SEMICOLON
    | var ASSIGN ternario SEMICOLON;

declarar_array
    : ARRAY BRACKET_OPEN elementos? BRACKET_CLOSE
    | BRACKET_OPEN elementos? BRACKET_CLOSE;

elementos : elemento (COMMA elemento)*;

elemento : (valor DOUBLE_ARROW)? valor;

acceso_arreglo
    : var BRACKET_OPEN valor BRACKET_CLOSE;

ternario : condicional QUESTION valor COLON valor;

expr_matematica
    : expr_matematica (MUL | DIV | MOD | POW) expr_matematica
    | expr_matematica (PLUS | MINUS) expr_matematica
    | expr_matematica DOT expr_matematica
    | PAREN_OPEN expr_matematica PAREN_CLOSE
    | MINUS valor
    | valor;

echo : ECHO valor (DOT valor)* SEMICOLON;

// CLASES (POO)

declarar_clase
    : (ABSTRACT | FINAL)? CLASS IDT (EXTENDS IDT)? (IMPLEMENTS IDT (COMMA IDT)*)?
      BRACE_OPEN miembro_clase* BRACE_CLOSE;

miembro_clase
    : modificador* var (ASSIGN valor)? SEMICOLON    
    | modificador* declarar_func BRACE_OPEN bloque (retorno SEMICOLON)? BRACE_CLOSE  
    ;

modificador : PUBLIC | PRIVATE | PROTECTED | STATIC | ABSTRACT | FINAL;

instanciacion : NEW IDT PAREN_OPEN argumentos? PAREN_CLOSE;

acceso_miembro : var OBJECT_OPERATOR IDT (PAREN_OPEN argumentos? PAREN_CLOSE)?;

acceso_estatico : IDT DOUBLE_COLON IDT;

// VALORES Y EXPRESIONES
valor
    : var
    | NUM
    | IDT
    | CADENA
    | llamada_funcion
    | instanciacion
    | acceso_miembro
    | acceso_estatico
    | acceso_arreglo
    | ternario;

valor_comparable
    : var
    | NUM
    | IDT;

// OPERADORES
op_aritmeticos
    : PLUS
    | MINUS
    | MUL
    | DIV
    | MOD
    | POW;

op_comparacion
    : IS_EQUAL
    | IS_IDENTICAL
    | IS_NOT_EQUAL
    | IS_NOT_IDENTICAL
    | LT
    | GT
    | LE
    | GE
    | SPACESHIP;

op_asignacion
    : ASSIGN
    | PLUS_EQUAL
    | MINUS_EQUAL
    | MUL_EQUAL
    | DIV_EQUAL
    | MOD_EQUAL
    | POW_EQUAL
    | CONCAT_EQUAL
    | COALESCE_EQUAL;

//REGLAS LEXICAS --------------------------------------------------

// PALABRAS CLAE
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
IDT : [a-zA-Z_][a-zA-Z0-9_]*;
NUM : [0-9]+ ('.' [0-9]+)? ;

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