// Generated from c:/Programas/Universidad/Automatas II/Analizador Lex-Sin/parser_antlr/Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, AND=2, ARRAY=3, AS=4, BREAK=5, CALLABLE=6, CASE=7, CATCH=8, 
		CLASS=9, CLONE=10, CONST=11, CONTINUE=12, DECLARE=13, DEFAULT=14, DO=15, 
		ECHO=16, ELSE=17, ELSEIF=18, EMPTY=19, ENDDECLARE=20, ENDFOR=21, ENDFOREACH=22, 
		ENDIF=23, ENDSWITCH=24, ENDWHILE=25, EVAL=26, EXIT=27, EXTENDS=28, FINAL=29, 
		FINALLY=30, FN=31, FOR=32, FOREACH=33, FUNCTION=34, GLOBAL=35, GOTO=36, 
		IF=37, IMPLEMENTS=38, INCLUDE=39, INCLUDE_ONCE=40, INSTANCEOF=41, INSTEADOF=42, 
		INTERFACE=43, ISSET=44, LIST=45, MATCH=46, NAMESPACE=47, NEW=48, OR=49, 
		PRINT=50, PRIVATE=51, PROTECTED=52, PUBLIC=53, READONLY=54, REQUIRE=55, 
		REQUIRE_ONCE=56, RETURN=57, STATIC=58, SWITCH=59, THROW=60, TRAIT=61, 
		TRY=62, UNSET=63, USE=64, VAR=65, WHILE=66, LOGICAL_XOR=67, YIELD=68, 
		YIELD_FROM=69, CADENA=70, IDT=71, NUM=72, PLUS=73, MINUS=74, MUL=75, DIV=76, 
		MOD=77, POW=78, ASSIGN=79, PLUS_EQUAL=80, MINUS_EQUAL=81, MUL_EQUAL=82, 
		DIV_EQUAL=83, MOD_EQUAL=84, POW_EQUAL=85, CONCAT_EQUAL=86, COALESCE_EQUAL=87, 
		IS_EQUAL=88, IS_IDENTICAL=89, IS_NOT_EQUAL=90, IS_NOT_IDENTICAL=91, LT=92, 
		GT=93, LE=94, GE=95, SPACESHIP=96, BOOLEAN_AND=97, BOOLEAN_OR=98, NOT=99, 
		INC=100, DEC=101, DOT=102, QUESTION=103, COLON=104, COALESCE=105, ELLIPSIS=106, 
		DOUBLE_ARROW=107, SEMICOLON=108, COMMA=109, PAREN_OPEN=110, PAREN_CLOSE=111, 
		BRACE_OPEN=112, BRACE_CLOSE=113, BRACKET_OPEN=114, BRACKET_CLOSE=115, 
		OBJECT_OPERATOR=116, DOUBLE_COLON=117, DOLLAR=118, NS_SEPARATOR=119, OPEN_TAG=120, 
		CLOSE_TAG=121, LINE_COMMENT=122, BLOCK_COMMENT=123, HASH_COMMENT=124, 
		WS=125;
	public static final int
		RULE_root = 0, RULE_expr = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'abstract'", "'and'", "'array'", "'as'", "'break'", "'callable'", 
			"'case'", "'catch'", "'class'", "'clone'", "'const'", "'continue'", "'declare'", 
			"'default'", "'do'", "'echo'", "'else'", "'elseif'", null, "'enddeclare'", 
			"'endfor'", "'endforeach'", "'endif'", "'endswitch'", "'endwhile'", "'eval'", 
			null, "'extends'", "'final'", "'finally'", "'fn'", "'for'", "'foreach'", 
			"'function'", "'global'", "'goto'", "'if'", "'implements'", "'include'", 
			"'include_once'", "'instanceof'", "'insteadof'", "'interface'", "'isset'", 
			"'list'", "'match'", "'namespace'", "'new'", "'or'", "'print'", "'private'", 
			"'protected'", "'public'", "'readonly'", "'require'", "'require_once'", 
			"'return'", "'static'", "'switch'", "'throw'", "'trait'", "'try'", "'unset'", 
			"'use'", "'var'", "'while'", "'xor'", "'yield'", "'yield from'", null, 
			null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'**'", "'='", "'+='", 
			"'-='", "'*='", "'/='", "'%='", "'**='", "'.='", "'??='", "'=='", "'==='", 
			null, "'!=='", "'<'", "'>'", "'<='", "'>='", "'<=>'", "'&&'", "'||'", 
			"'!'", "'++'", "'--'", "'.'", "'?'", "':'", "'??'", "'...'", "'=>'", 
			"';'", "','", "'('", "')'", "'{'", "'}'", "'['", "']'", "'->'", "'::'", 
			"'$'", "'\\'", "'<?php'", "'?>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABSTRACT", "AND", "ARRAY", "AS", "BREAK", "CALLABLE", "CASE", 
			"CATCH", "CLASS", "CLONE", "CONST", "CONTINUE", "DECLARE", "DEFAULT", 
			"DO", "ECHO", "ELSE", "ELSEIF", "EMPTY", "ENDDECLARE", "ENDFOR", "ENDFOREACH", 
			"ENDIF", "ENDSWITCH", "ENDWHILE", "EVAL", "EXIT", "EXTENDS", "FINAL", 
			"FINALLY", "FN", "FOR", "FOREACH", "FUNCTION", "GLOBAL", "GOTO", "IF", 
			"IMPLEMENTS", "INCLUDE", "INCLUDE_ONCE", "INSTANCEOF", "INSTEADOF", "INTERFACE", 
			"ISSET", "LIST", "MATCH", "NAMESPACE", "NEW", "OR", "PRINT", "PRIVATE", 
			"PROTECTED", "PUBLIC", "READONLY", "REQUIRE", "REQUIRE_ONCE", "RETURN", 
			"STATIC", "SWITCH", "THROW", "TRAIT", "TRY", "UNSET", "USE", "VAR", "WHILE", 
			"LOGICAL_XOR", "YIELD", "YIELD_FROM", "CADENA", "IDT", "NUM", "PLUS", 
			"MINUS", "MUL", "DIV", "MOD", "POW", "ASSIGN", "PLUS_EQUAL", "MINUS_EQUAL", 
			"MUL_EQUAL", "DIV_EQUAL", "MOD_EQUAL", "POW_EQUAL", "CONCAT_EQUAL", "COALESCE_EQUAL", 
			"IS_EQUAL", "IS_IDENTICAL", "IS_NOT_EQUAL", "IS_NOT_IDENTICAL", "LT", 
			"GT", "LE", "GE", "SPACESHIP", "BOOLEAN_AND", "BOOLEAN_OR", "NOT", "INC", 
			"DEC", "DOT", "QUESTION", "COLON", "COALESCE", "ELLIPSIS", "DOUBLE_ARROW", 
			"SEMICOLON", "COMMA", "PAREN_OPEN", "PAREN_CLOSE", "BRACE_OPEN", "BRACE_CLOSE", 
			"BRACKET_OPEN", "BRACKET_CLOSE", "OBJECT_OPERATOR", "DOUBLE_COLON", "DOLLAR", 
			"NS_SEPARATOR", "OPEN_TAG", "CLOSE_TAG", "LINE_COMMENT", "BLOCK_COMMENT", 
			"HASH_COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RootContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ExprParser.EOF, 0); }
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			expr();
			setState(5);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ExprParser.EOF, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001}\n\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000"+
		"\u0000\u0002\u0000\u0002\u0000\u0000\u0007\u0000\u0004\u0001\u0000\u0000"+
		"\u0000\u0002\u0007\u0001\u0000\u0000\u0000\u0004\u0005\u0003\u0002\u0001"+
		"\u0000\u0005\u0006\u0005\u0000\u0000\u0001\u0006\u0001\u0001\u0000\u0000"+
		"\u0000\u0007\b\u0005\u0000\u0000\u0001\b\u0003\u0001\u0000\u0000\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}