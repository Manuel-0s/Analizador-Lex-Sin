# Generated from ./Expr.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,125,10,2,0,7,0,2,1,7,1,1,0,1,0,1,0,1,1,1,1,1,1,0,0,2,0,2,0,0,
        7,0,4,1,0,0,0,2,7,1,0,0,0,4,5,3,2,1,0,5,6,5,0,0,1,6,1,1,0,0,0,7,
        8,5,0,0,1,8,3,1,0,0,0,0
    ]

class ExprParser ( Parser ):

    grammarFileName = "Expr.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'abstract'", "'and'", "'array'", "'as'", 
                     "'break'", "'callable'", "'case'", "'catch'", "'class'", 
                     "'clone'", "'const'", "'continue'", "'declare'", "'default'", 
                     "'do'", "'echo'", "'else'", "'elseif'", "<INVALID>", 
                     "'enddeclare'", "'endfor'", "'endforeach'", "'endif'", 
                     "'endswitch'", "'endwhile'", "'eval'", "<INVALID>", 
                     "'extends'", "'final'", "'finally'", "'fn'", "'for'", 
                     "'foreach'", "'function'", "'global'", "'goto'", "'if'", 
                     "'implements'", "'include'", "'include_once'", "'instanceof'", 
                     "'insteadof'", "'interface'", "'isset'", "'list'", 
                     "'match'", "'namespace'", "'new'", "'or'", "'print'", 
                     "'private'", "'protected'", "'public'", "'readonly'", 
                     "'require'", "'require_once'", "'return'", "'static'", 
                     "'switch'", "'throw'", "'trait'", "'try'", "'unset'", 
                     "'use'", "'var'", "'while'", "'xor'", "'yield'", "'yield from'", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "'+'", "'-'", 
                     "'*'", "'/'", "'%'", "'**'", "'='", "'+='", "'-='", 
                     "'*='", "'/='", "'%='", "'**='", "'.='", "'??='", "'=='", 
                     "'==='", "<INVALID>", "'!=='", "'<'", "'>'", "'<='", 
                     "'>='", "'<=>'", "'&&'", "'||'", "'!'", "'++'", "'--'", 
                     "'.'", "'?'", "':'", "'??'", "'...'", "'=>'", "';'", 
                     "','", "'('", "')'", "'{'", "'}'", "'['", "']'", "'->'", 
                     "'::'", "'$'", "'\\'", "'<?php'", "'?>'" ]

    symbolicNames = [ "<INVALID>", "ABSTRACT", "AND", "ARRAY", "AS", "BREAK", 
                      "CALLABLE", "CASE", "CATCH", "CLASS", "CLONE", "CONST", 
                      "CONTINUE", "DECLARE", "DEFAULT", "DO", "ECHO", "ELSE", 
                      "ELSEIF", "EMPTY", "ENDDECLARE", "ENDFOR", "ENDFOREACH", 
                      "ENDIF", "ENDSWITCH", "ENDWHILE", "EVAL", "EXIT", 
                      "EXTENDS", "FINAL", "FINALLY", "FN", "FOR", "FOREACH", 
                      "FUNCTION", "GLOBAL", "GOTO", "IF", "IMPLEMENTS", 
                      "INCLUDE", "INCLUDE_ONCE", "INSTANCEOF", "INSTEADOF", 
                      "INTERFACE", "ISSET", "LIST", "MATCH", "NAMESPACE", 
                      "NEW", "OR", "PRINT", "PRIVATE", "PROTECTED", "PUBLIC", 
                      "READONLY", "REQUIRE", "REQUIRE_ONCE", "RETURN", "STATIC", 
                      "SWITCH", "THROW", "TRAIT", "TRY", "UNSET", "USE", 
                      "VAR", "WHILE", "LOGICAL_XOR", "YIELD", "YIELD_FROM", 
                      "CADENA", "IDT", "NUM", "PLUS", "MINUS", "MUL", "DIV", 
                      "MOD", "POW", "ASSIGN", "PLUS_EQUAL", "MINUS_EQUAL", 
                      "MUL_EQUAL", "DIV_EQUAL", "MOD_EQUAL", "POW_EQUAL", 
                      "CONCAT_EQUAL", "COALESCE_EQUAL", "IS_EQUAL", "IS_IDENTICAL", 
                      "IS_NOT_EQUAL", "IS_NOT_IDENTICAL", "LT", "GT", "LE", 
                      "GE", "SPACESHIP", "BOOLEAN_AND", "BOOLEAN_OR", "NOT", 
                      "INC", "DEC", "DOT", "QUESTION", "COLON", "COALESCE", 
                      "ELLIPSIS", "DOUBLE_ARROW", "SEMICOLON", "COMMA", 
                      "PAREN_OPEN", "PAREN_CLOSE", "BRACE_OPEN", "BRACE_CLOSE", 
                      "BRACKET_OPEN", "BRACKET_CLOSE", "OBJECT_OPERATOR", 
                      "DOUBLE_COLON", "DOLLAR", "NS_SEPARATOR", "OPEN_TAG", 
                      "CLOSE_TAG", "LINE_COMMENT", "BLOCK_COMMENT", "HASH_COMMENT", 
                      "WS" ]

    RULE_root = 0
    RULE_expr = 1

    ruleNames =  [ "root", "expr" ]

    EOF = Token.EOF
    ABSTRACT=1
    AND=2
    ARRAY=3
    AS=4
    BREAK=5
    CALLABLE=6
    CASE=7
    CATCH=8
    CLASS=9
    CLONE=10
    CONST=11
    CONTINUE=12
    DECLARE=13
    DEFAULT=14
    DO=15
    ECHO=16
    ELSE=17
    ELSEIF=18
    EMPTY=19
    ENDDECLARE=20
    ENDFOR=21
    ENDFOREACH=22
    ENDIF=23
    ENDSWITCH=24
    ENDWHILE=25
    EVAL=26
    EXIT=27
    EXTENDS=28
    FINAL=29
    FINALLY=30
    FN=31
    FOR=32
    FOREACH=33
    FUNCTION=34
    GLOBAL=35
    GOTO=36
    IF=37
    IMPLEMENTS=38
    INCLUDE=39
    INCLUDE_ONCE=40
    INSTANCEOF=41
    INSTEADOF=42
    INTERFACE=43
    ISSET=44
    LIST=45
    MATCH=46
    NAMESPACE=47
    NEW=48
    OR=49
    PRINT=50
    PRIVATE=51
    PROTECTED=52
    PUBLIC=53
    READONLY=54
    REQUIRE=55
    REQUIRE_ONCE=56
    RETURN=57
    STATIC=58
    SWITCH=59
    THROW=60
    TRAIT=61
    TRY=62
    UNSET=63
    USE=64
    VAR=65
    WHILE=66
    LOGICAL_XOR=67
    YIELD=68
    YIELD_FROM=69
    CADENA=70
    IDT=71
    NUM=72
    PLUS=73
    MINUS=74
    MUL=75
    DIV=76
    MOD=77
    POW=78
    ASSIGN=79
    PLUS_EQUAL=80
    MINUS_EQUAL=81
    MUL_EQUAL=82
    DIV_EQUAL=83
    MOD_EQUAL=84
    POW_EQUAL=85
    CONCAT_EQUAL=86
    COALESCE_EQUAL=87
    IS_EQUAL=88
    IS_IDENTICAL=89
    IS_NOT_EQUAL=90
    IS_NOT_IDENTICAL=91
    LT=92
    GT=93
    LE=94
    GE=95
    SPACESHIP=96
    BOOLEAN_AND=97
    BOOLEAN_OR=98
    NOT=99
    INC=100
    DEC=101
    DOT=102
    QUESTION=103
    COLON=104
    COALESCE=105
    ELLIPSIS=106
    DOUBLE_ARROW=107
    SEMICOLON=108
    COMMA=109
    PAREN_OPEN=110
    PAREN_CLOSE=111
    BRACE_OPEN=112
    BRACE_CLOSE=113
    BRACKET_OPEN=114
    BRACKET_CLOSE=115
    OBJECT_OPERATOR=116
    DOUBLE_COLON=117
    DOLLAR=118
    NS_SEPARATOR=119
    OPEN_TAG=120
    CLOSE_TAG=121
    LINE_COMMENT=122
    BLOCK_COMMENT=123
    HASH_COMMENT=124
    WS=125

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class RootContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self):
            return self.getTypedRuleContext(ExprParser.ExprContext,0)


        def EOF(self):
            return self.getToken(ExprParser.EOF, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_root




    def root(self):

        localctx = ExprParser.RootContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_root)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 4
            self.expr()
            self.state = 5
            self.match(ExprParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(ExprParser.EOF, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_expr




    def expr(self):

        localctx = ExprParser.ExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_expr)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 7
            self.match(ExprParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





