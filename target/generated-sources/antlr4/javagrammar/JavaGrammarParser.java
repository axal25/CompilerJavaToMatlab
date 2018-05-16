// Generated from JavaGrammar.g4 by ANTLR 4.7.1

	package javagrammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITE_SPACES=1, LINE_COMMENT=2, NEW_LINE=3, COMMENTS_BLOCK=4, UNTERMINATED_STRING=5, 
		ADDITIONAL_LITERAL_AT=6, ADDITIONAL_LITERAL_ELLIPSIS=7, KEYWORDS_ABSTRACT=8, 
		KEYWORDS_ASSERT=9, KEYWORDS_BOOLEAN=10, KEYWORDS_BREAK=11, KEYWORDS_BYTE=12, 
		KEYWORDS_CASE=13, KEYWORDS_CATCH=14, KEYWORDS_CHAR=15, KEYWORDS_CLASS=16, 
		KEYWORDS_CONST=17, KEYWORDS_CONTINUE=18, KEYWORDS_DEFAULT=19, KEYWORDS_DO=20, 
		KEYWORDS_DOUBLE=21, KEYWORDS_ELSE=22, KEYWORDS_EXTENDS=23, KEYWORDS_FINAL=24, 
		KEYWORDS_FINALLY=25, KEYWORDS_FLOAT=26, KEYWORDS_FOR=27, KEYWORDS_GOTO=28, 
		KEYWORDS_IF=29, KEYWORDS_IMPLEMENTS=30, KEYWORDS_IMPORT=31, KEYWORDS_INSTANCEOF=32, 
		KEYWORDS_INT=33, KEYWORDS_INTERFACE=34, KEYWORDS_LONG=35, KEYWORDS_NATIVE=36, 
		KEYWORDS_NEW=37, KEYWORDS_PACKAGE=38, KEYWORDS_PRIVATE=39, KEYWORDS_PROTECTED=40, 
		KEYWORDS_PUBLIC=41, KEYWORDS_RETURN=42, KEYWORDS_SHORT=43, KEYWORDS_STATIC=44, 
		KEYWORDS_STRICTFP=45, KEYWORDS_STRING=46, KEYWORDS_SUPER=47, KEYWORDS_SYNCHRONIZED=48, 
		KEYWORDS_SWITCH=49, KEYWORDS_THIS=50, KEYWORDS_THROW=51, KEYWORDS_THROWS=52, 
		KEYWORDS_TRANSIENT=53, KEYWORDS_TRY=54, KEYWORDS_VOID=55, KEYWORDS_VOLATILE=56, 
		KEYWORDS_WHILE=57, IDENTIFIERS=58, LITERALS_NUMERIC_INT=59, LITERALS_NUMERIC_DOUBLE=60, 
		LITERALS_LOGICAL_BOOLEAN=61, LITERALS_TEXTUAL_CHAR=62, LITERALS_TEXTUAL_STRING=63, 
		LITERALS_REFERENCE_NULL=64, OPERATORS_IF=65, OPERATORS_ELSE=66, OPERATORS_ASSIGNMENT=67, 
		OPERATORS_GREATERTHAN=68, OPERATORS_LESSTHAN=69, OPERATORS_LOGICALNOT=70, 
		OPERATORS_LESSTHANOREQUAL=71, OPERATORS_GREATERTHANOREQUAL=72, OPERATORS_LOGICALEQUAL=73, 
		OPERATORS_LOGICALNOTEQUAL=74, OPERATORS_LOGICALAND=75, OPERATORS_LOGICALOR=76, 
		OPERATORS_INCREMENT=77, OPERATORS_DECREMENT=78, OPERATORS_ADDITION=79, 
		OPERATORS_SUBTRACTION=80, OPERATORS_MULTIPLICATION=81, OPERATORS_DIVISION=82, 
		OPERATORS_MODULO=83, OPERATORS_ADDITIONANDASSIGNMENT=84, OPERATORS_SUBTRACTIONANDASSIGNMENT=85, 
		OPERATORS_MULTIPLICATIONANDASSIGNMENT=86, OPERATORS_DIVISIONANDASSIGNMENT=87, 
		OPERATORS_MODULOANDASSIGMENT=88, OPERATORS_LOGICALANDASSIGNMENT=89, OPERATORS_BITWISENOT=90, 
		OPERATORS_BITWISEAND=91, OPERATORS_BITWISEOR=92, OPERATORS_BITWISEXOR=93, 
		OPERATORS_BITWISEANDASSIGNMENT=94, OPERATORS_BITWISEXORASSIGNMENT=95, 
		OPERATORS_BITWISEORASSIGNMENT=96, OPERATORS_SHIFTLEFT=97, OPERATORS_SHIFTRIGHT=98, 
		OPERATORS_SHIFTRIGHTUNSIGNED=99, OPERATORS_SHIFTLEFTASSIGNMENT=100, OPERATORS_SHIFTRIGHTASSIGNMENT=101, 
		OPERATORS_SHIFTRIGHTUNSIGNEDASSIGNMENT=102, SEPARATORS_PUNCTUATORS_SEMICOLON=103, 
		SEPARATORS_PUNCTUATORS_COMMA=104, SEPARATORS_PUNCTUATORS_DOT=105, SEPARATORS_PUNCTUATORS_ESCAPECHARACTER=106, 
		SEPARATORS_DELIMITERS_LEFTPARENTHESIS=107, SEPARATORS_DELIMITERS_RIGHTPARENTHESIS=108, 
		SEPARATORS_DELIMITERS_LEFTCURLYBRACKET=109, SEPARATORS_DELIMITERS_RIGHTCURLYBRACKET=110, 
		SEPARATORS_DELIMITERS_LEFTSQUAREBRACKET=111, SEPARATORS_DELIMITERS_RIGHTSQUAREBRACKET=112, 
		COMMENTS_LINE=113, COMMENTS_BLOCK_OPENING=114, COMMENTS_BLOCK_CLOSING=115;
	public static final int
		RULE_compilationUnit = 0, RULE_method = 1, RULE_methodPermissionModifier = 2, 
		RULE_methodTypeModifier = 3, RULE_methodReturnType = 4, RULE_variableDeclaration = 5, 
		RULE_statement = 6, RULE_loopStatment = 7, RULE_comparisonOperator = 8, 
		RULE_number = 9, RULE_numberEquivalent = 10, RULE_logicalConst = 11, RULE_logicalEquivalent = 12, 
		RULE_arithmeticExpression = 13, RULE_comparisonExpression = 14, RULE_logicalExpression = 15, 
		RULE_block = 16, RULE_loopBlock = 17, RULE_ifStatement = 18, RULE_doWhileStatement = 19, 
		RULE_whileDoStatement = 20, RULE_assignmentOperator = 21, RULE_expression = 22, 
		RULE_assignment = 23, RULE_assignmentExpression = 24, RULE_forStatement = 25, 
		RULE_forInit = 26, RULE_forUpdate = 27, RULE_enhancedForStatement = 28, 
		RULE_returnStatement = 29, RULE_breakStatement = 30, RULE_continueStatement = 31, 
		RULE_parameterList = 32, RULE_operatorsBitwise = 33, RULE_expressionBitwise = 34, 
		RULE_stringNullAssignment = 35, RULE_preIncrementationExpression = 36, 
		RULE_postIncrementationExpression = 37, RULE_preDecrementationExpression = 38, 
		RULE_postDecrementationExpression = 39, RULE_variableType = 40, RULE_keywordsType = 41;
	public static final String[] ruleNames = {
		"compilationUnit", "method", "methodPermissionModifier", "methodTypeModifier", 
		"methodReturnType", "variableDeclaration", "statement", "loopStatment", 
		"comparisonOperator", "number", "numberEquivalent", "logicalConst", "logicalEquivalent", 
		"arithmeticExpression", "comparisonExpression", "logicalExpression", "block", 
		"loopBlock", "ifStatement", "doWhileStatement", "whileDoStatement", "assignmentOperator", 
		"expression", "assignment", "assignmentExpression", "forStatement", "forInit", 
		"forUpdate", "enhancedForStatement", "returnStatement", "breakStatement", 
		"continueStatement", "parameterList", "operatorsBitwise", "expressionBitwise", 
		"stringNullAssignment", "preIncrementationExpression", "postIncrementationExpression", 
		"preDecrementationExpression", "postDecrementationExpression", "variableType", 
		"keywordsType"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "'@'", "'...'", "'abstract'", "'assert'", 
		"'boolean'", "'break'", "'byte'", "'case'", "'catch'", "'char'", "'class'", 
		"'const'", "'continue'", "'default'", "'do'", "'double'", "'else'", "'extends'", 
		"'final'", "'finally'", "'float'", "'for'", "'goto'", "'if'", "'implements'", 
		"'import'", "'instanceof'", "'int'", "'interface'", "'long'", "'native'", 
		"'new'", "'package'", "'private'", "'protected'", "'public'", "'return'", 
		"'short'", "'static'", "'strictfp'", "'String'", "'super'", "'synchronized'", 
		"'switch'", "'this'", "'throw'", "'throws'", "'transient'", "'try'", "'void'", 
		"'volatile'", "'while'", null, null, null, null, null, null, "'null'", 
		"'?'", "':'", "'='", "'>'", "'<'", "'!'", "'<='", "'>='", "'=='", "'!='", 
		"'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'%'", "'+='", 
		"'-='", "'*='", "'/='", "'%='", "'&&='", "'~'", "'&'", "'|'", "'^'", "'&='", 
		"'^='", "'|='", "'<<'", "'>>'", "'>>>'", "'<<='", "'>>='", "'>>>='", "';'", 
		"','", "'.'", "'\\'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'//'", 
		"'/*'", "'*/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WHITE_SPACES", "LINE_COMMENT", "NEW_LINE", "COMMENTS_BLOCK", "UNTERMINATED_STRING", 
		"ADDITIONAL_LITERAL_AT", "ADDITIONAL_LITERAL_ELLIPSIS", "KEYWORDS_ABSTRACT", 
		"KEYWORDS_ASSERT", "KEYWORDS_BOOLEAN", "KEYWORDS_BREAK", "KEYWORDS_BYTE", 
		"KEYWORDS_CASE", "KEYWORDS_CATCH", "KEYWORDS_CHAR", "KEYWORDS_CLASS", 
		"KEYWORDS_CONST", "KEYWORDS_CONTINUE", "KEYWORDS_DEFAULT", "KEYWORDS_DO", 
		"KEYWORDS_DOUBLE", "KEYWORDS_ELSE", "KEYWORDS_EXTENDS", "KEYWORDS_FINAL", 
		"KEYWORDS_FINALLY", "KEYWORDS_FLOAT", "KEYWORDS_FOR", "KEYWORDS_GOTO", 
		"KEYWORDS_IF", "KEYWORDS_IMPLEMENTS", "KEYWORDS_IMPORT", "KEYWORDS_INSTANCEOF", 
		"KEYWORDS_INT", "KEYWORDS_INTERFACE", "KEYWORDS_LONG", "KEYWORDS_NATIVE", 
		"KEYWORDS_NEW", "KEYWORDS_PACKAGE", "KEYWORDS_PRIVATE", "KEYWORDS_PROTECTED", 
		"KEYWORDS_PUBLIC", "KEYWORDS_RETURN", "KEYWORDS_SHORT", "KEYWORDS_STATIC", 
		"KEYWORDS_STRICTFP", "KEYWORDS_STRING", "KEYWORDS_SUPER", "KEYWORDS_SYNCHRONIZED", 
		"KEYWORDS_SWITCH", "KEYWORDS_THIS", "KEYWORDS_THROW", "KEYWORDS_THROWS", 
		"KEYWORDS_TRANSIENT", "KEYWORDS_TRY", "KEYWORDS_VOID", "KEYWORDS_VOLATILE", 
		"KEYWORDS_WHILE", "IDENTIFIERS", "LITERALS_NUMERIC_INT", "LITERALS_NUMERIC_DOUBLE", 
		"LITERALS_LOGICAL_BOOLEAN", "LITERALS_TEXTUAL_CHAR", "LITERALS_TEXTUAL_STRING", 
		"LITERALS_REFERENCE_NULL", "OPERATORS_IF", "OPERATORS_ELSE", "OPERATORS_ASSIGNMENT", 
		"OPERATORS_GREATERTHAN", "OPERATORS_LESSTHAN", "OPERATORS_LOGICALNOT", 
		"OPERATORS_LESSTHANOREQUAL", "OPERATORS_GREATERTHANOREQUAL", "OPERATORS_LOGICALEQUAL", 
		"OPERATORS_LOGICALNOTEQUAL", "OPERATORS_LOGICALAND", "OPERATORS_LOGICALOR", 
		"OPERATORS_INCREMENT", "OPERATORS_DECREMENT", "OPERATORS_ADDITION", "OPERATORS_SUBTRACTION", 
		"OPERATORS_MULTIPLICATION", "OPERATORS_DIVISION", "OPERATORS_MODULO", 
		"OPERATORS_ADDITIONANDASSIGNMENT", "OPERATORS_SUBTRACTIONANDASSIGNMENT", 
		"OPERATORS_MULTIPLICATIONANDASSIGNMENT", "OPERATORS_DIVISIONANDASSIGNMENT", 
		"OPERATORS_MODULOANDASSIGMENT", "OPERATORS_LOGICALANDASSIGNMENT", "OPERATORS_BITWISENOT", 
		"OPERATORS_BITWISEAND", "OPERATORS_BITWISEOR", "OPERATORS_BITWISEXOR", 
		"OPERATORS_BITWISEANDASSIGNMENT", "OPERATORS_BITWISEXORASSIGNMENT", "OPERATORS_BITWISEORASSIGNMENT", 
		"OPERATORS_SHIFTLEFT", "OPERATORS_SHIFTRIGHT", "OPERATORS_SHIFTRIGHTUNSIGNED", 
		"OPERATORS_SHIFTLEFTASSIGNMENT", "OPERATORS_SHIFTRIGHTASSIGNMENT", "OPERATORS_SHIFTRIGHTUNSIGNEDASSIGNMENT", 
		"SEPARATORS_PUNCTUATORS_SEMICOLON", "SEPARATORS_PUNCTUATORS_COMMA", "SEPARATORS_PUNCTUATORS_DOT", 
		"SEPARATORS_PUNCTUATORS_ESCAPECHARACTER", "SEPARATORS_DELIMITERS_LEFTPARENTHESIS", 
		"SEPARATORS_DELIMITERS_RIGHTPARENTHESIS", "SEPARATORS_DELIMITERS_LEFTCURLYBRACKET", 
		"SEPARATORS_DELIMITERS_RIGHTCURLYBRACKET", "SEPARATORS_DELIMITERS_LEFTSQUAREBRACKET", 
		"SEPARATORS_DELIMITERS_RIGHTSQUAREBRACKET", "COMMENTS_LINE", "COMMENTS_BLOCK_OPENING", 
		"COMMENTS_BLOCK_CLOSING"
	};
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
	public String getGrammarFileName() { return "JavaGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORDS_ABSTRACT) | (1L << KEYWORDS_BOOLEAN) | (1L << KEYWORDS_BYTE) | (1L << KEYWORDS_CHAR) | (1L << KEYWORDS_DOUBLE) | (1L << KEYWORDS_FINAL) | (1L << KEYWORDS_FLOAT) | (1L << KEYWORDS_INT) | (1L << KEYWORDS_LONG) | (1L << KEYWORDS_NATIVE) | (1L << KEYWORDS_PRIVATE) | (1L << KEYWORDS_PROTECTED) | (1L << KEYWORDS_PUBLIC) | (1L << KEYWORDS_SHORT) | (1L << KEYWORDS_STATIC) | (1L << KEYWORDS_STRICTFP) | (1L << KEYWORDS_STRING) | (1L << KEYWORDS_SYNCHRONIZED) | (1L << KEYWORDS_VOID))) != 0)) {
				{
				{
				setState(84);
				method();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class MethodContext extends ParserRuleContext {
		public MethodReturnTypeContext methodReturnType() {
			return getRuleContext(MethodReturnTypeContext.class,0);
		}
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public TerminalNode SEPARATORS_DELIMITERS_LEFTPARENTHESIS() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_LEFTPARENTHESIS, 0); }
		public TerminalNode SEPARATORS_DELIMITERS_RIGHTPARENTHESIS() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_RIGHTPARENTHESIS, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEPARATORS_PUNCTUATORS_SEMICOLON() { return getToken(JavaGrammarParser.SEPARATORS_PUNCTUATORS_SEMICOLON, 0); }
		public MethodPermissionModifierContext methodPermissionModifier() {
			return getRuleContext(MethodPermissionModifierContext.class,0);
		}
		public MethodTypeModifierContext methodTypeModifier() {
			return getRuleContext(MethodTypeModifierContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitMethod(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORDS_PRIVATE) | (1L << KEYWORDS_PROTECTED) | (1L << KEYWORDS_PUBLIC))) != 0)) {
				{
				setState(90);
				methodPermissionModifier();
				}
			}

			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORDS_ABSTRACT) | (1L << KEYWORDS_FINAL) | (1L << KEYWORDS_NATIVE) | (1L << KEYWORDS_STATIC) | (1L << KEYWORDS_STRICTFP) | (1L << KEYWORDS_SYNCHRONIZED))) != 0)) {
				{
				setState(93);
				methodTypeModifier();
				}
			}

			setState(96);
			methodReturnType();
			setState(97);
			match(IDENTIFIERS);
			setState(98);
			match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORDS_BOOLEAN) | (1L << KEYWORDS_BYTE) | (1L << KEYWORDS_CHAR) | (1L << KEYWORDS_DOUBLE) | (1L << KEYWORDS_FLOAT) | (1L << KEYWORDS_INT) | (1L << KEYWORDS_LONG) | (1L << KEYWORDS_SHORT) | (1L << KEYWORDS_STRING))) != 0)) {
				{
				setState(99);
				parameterList();
				}
			}

			setState(102);
			match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEPARATORS_DELIMITERS_LEFTCURLYBRACKET:
				{
				setState(103);
				block();
				}
				break;
			case SEPARATORS_PUNCTUATORS_SEMICOLON:
				{
				setState(104);
				match(SEPARATORS_PUNCTUATORS_SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class MethodPermissionModifierContext extends ParserRuleContext {
		public TerminalNode KEYWORDS_PUBLIC() { return getToken(JavaGrammarParser.KEYWORDS_PUBLIC, 0); }
		public TerminalNode KEYWORDS_PROTECTED() { return getToken(JavaGrammarParser.KEYWORDS_PROTECTED, 0); }
		public TerminalNode KEYWORDS_PRIVATE() { return getToken(JavaGrammarParser.KEYWORDS_PRIVATE, 0); }
		public MethodPermissionModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodPermissionModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterMethodPermissionModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitMethodPermissionModifier(this);
		}
	}

	public final MethodPermissionModifierContext methodPermissionModifier() throws RecognitionException {
		MethodPermissionModifierContext _localctx = new MethodPermissionModifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_methodPermissionModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORDS_PRIVATE) | (1L << KEYWORDS_PROTECTED) | (1L << KEYWORDS_PUBLIC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class MethodTypeModifierContext extends ParserRuleContext {
		public TerminalNode KEYWORDS_ABSTRACT() { return getToken(JavaGrammarParser.KEYWORDS_ABSTRACT, 0); }
		public TerminalNode KEYWORDS_STATIC() { return getToken(JavaGrammarParser.KEYWORDS_STATIC, 0); }
		public TerminalNode KEYWORDS_FINAL() { return getToken(JavaGrammarParser.KEYWORDS_FINAL, 0); }
		public TerminalNode KEYWORDS_SYNCHRONIZED() { return getToken(JavaGrammarParser.KEYWORDS_SYNCHRONIZED, 0); }
		public TerminalNode KEYWORDS_NATIVE() { return getToken(JavaGrammarParser.KEYWORDS_NATIVE, 0); }
		public TerminalNode KEYWORDS_STRICTFP() { return getToken(JavaGrammarParser.KEYWORDS_STRICTFP, 0); }
		public MethodTypeModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodTypeModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterMethodTypeModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitMethodTypeModifier(this);
		}
	}

	public final MethodTypeModifierContext methodTypeModifier() throws RecognitionException {
		MethodTypeModifierContext _localctx = new MethodTypeModifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_methodTypeModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORDS_ABSTRACT) | (1L << KEYWORDS_FINAL) | (1L << KEYWORDS_NATIVE) | (1L << KEYWORDS_STATIC) | (1L << KEYWORDS_STRICTFP) | (1L << KEYWORDS_SYNCHRONIZED))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class MethodReturnTypeContext extends ParserRuleContext {
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public TerminalNode KEYWORDS_VOID() { return getToken(JavaGrammarParser.KEYWORDS_VOID, 0); }
		public MethodReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReturnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterMethodReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitMethodReturnType(this);
		}
	}

	public final MethodReturnTypeContext methodReturnType() throws RecognitionException {
		MethodReturnTypeContext _localctx = new MethodReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodReturnType);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORDS_BOOLEAN:
			case KEYWORDS_BYTE:
			case KEYWORDS_CHAR:
			case KEYWORDS_DOUBLE:
			case KEYWORDS_FLOAT:
			case KEYWORDS_INT:
			case KEYWORDS_LONG:
			case KEYWORDS_SHORT:
			case KEYWORDS_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				variableType();
				}
				break;
			case KEYWORDS_VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(KEYWORDS_VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			variableType();
			setState(116);
			match(IDENTIFIERS);
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

	public static class StatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode SEPARATORS_PUNCTUATORS_SEMICOLON() { return getToken(JavaGrammarParser.SEPARATORS_PUNCTUATORS_SEMICOLON, 0); }
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileDoStatementContext whileDoStatement() {
			return getRuleContext(WhileDoStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public EnhancedForStatementContext enhancedForStatement() {
			return getRuleContext(EnhancedForStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				variableDeclaration();
				setState(119);
				match(SEPARATORS_PUNCTUATORS_SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				whileDoStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				doWhileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(124);
				forStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(125);
				enhancedForStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(126);
				returnStatement();
				}
				break;
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

	public static class LoopStatmentContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public LoopStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterLoopStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitLoopStatment(this);
		}
	}

	public final LoopStatmentContext loopStatment() throws RecognitionException {
		LoopStatmentContext _localctx = new LoopStatmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_loopStatment);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORDS_BOOLEAN:
			case KEYWORDS_BYTE:
			case KEYWORDS_CHAR:
			case KEYWORDS_DO:
			case KEYWORDS_DOUBLE:
			case KEYWORDS_FLOAT:
			case KEYWORDS_FOR:
			case KEYWORDS_IF:
			case KEYWORDS_INT:
			case KEYWORDS_LONG:
			case KEYWORDS_RETURN:
			case KEYWORDS_SHORT:
			case KEYWORDS_STRING:
			case KEYWORDS_WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				statement();
				}
				break;
			case KEYWORDS_BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				breakStatement();
				}
				break;
			case KEYWORDS_CONTINUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				continueStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode OPERATORS_GREATERTHAN() { return getToken(JavaGrammarParser.OPERATORS_GREATERTHAN, 0); }
		public TerminalNode OPERATORS_LESSTHAN() { return getToken(JavaGrammarParser.OPERATORS_LESSTHAN, 0); }
		public TerminalNode OPERATORS_GREATERTHANOREQUAL() { return getToken(JavaGrammarParser.OPERATORS_GREATERTHANOREQUAL, 0); }
		public TerminalNode OPERATORS_LESSTHANOREQUAL() { return getToken(JavaGrammarParser.OPERATORS_LESSTHANOREQUAL, 0); }
		public TerminalNode OPERATORS_LOGICALEQUAL() { return getToken(JavaGrammarParser.OPERATORS_LOGICALEQUAL, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitComparisonOperator(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_la = _input.LA(1);
			if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (OPERATORS_GREATERTHAN - 68)) | (1L << (OPERATORS_LESSTHAN - 68)) | (1L << (OPERATORS_LESSTHANOREQUAL - 68)) | (1L << (OPERATORS_GREATERTHANOREQUAL - 68)) | (1L << (OPERATORS_LOGICALEQUAL - 68)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode LITERALS_NUMERIC_INT() { return getToken(JavaGrammarParser.LITERALS_NUMERIC_INT, 0); }
		public TerminalNode LITERALS_NUMERIC_DOUBLE() { return getToken(JavaGrammarParser.LITERALS_NUMERIC_DOUBLE, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_la = _input.LA(1);
			if ( !(_la==LITERALS_NUMERIC_INT || _la==LITERALS_NUMERIC_DOUBLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class NumberEquivalentContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public NumberEquivalentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberEquivalent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterNumberEquivalent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitNumberEquivalent(this);
		}
	}

	public final NumberEquivalentContext numberEquivalent() throws RecognitionException {
		NumberEquivalentContext _localctx = new NumberEquivalentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_numberEquivalent);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERALS_NUMERIC_INT:
			case LITERALS_NUMERIC_DOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				number();
				}
				break;
			case IDENTIFIERS:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(IDENTIFIERS);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LogicalConstContext extends ParserRuleContext {
		public TerminalNode LITERALS_LOGICAL_BOOLEAN() { return getToken(JavaGrammarParser.LITERALS_LOGICAL_BOOLEAN, 0); }
		public LogicalConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalConst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterLogicalConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitLogicalConst(this);
		}
	}

	public final LogicalConstContext logicalConst() throws RecognitionException {
		LogicalConstContext _localctx = new LogicalConstContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_logicalConst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_la = _input.LA(1);
			if ( !(_la==LITERALS_LOGICAL_BOOLEAN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class LogicalEquivalentContext extends ParserRuleContext {
		public LogicalConstContext logicalConst() {
			return getRuleContext(LogicalConstContext.class,0);
		}
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public LogicalEquivalentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalEquivalent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterLogicalEquivalent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitLogicalEquivalent(this);
		}
	}

	public final LogicalEquivalentContext logicalEquivalent() throws RecognitionException {
		LogicalEquivalentContext _localctx = new LogicalEquivalentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_logicalEquivalent);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERALS_LOGICAL_BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				logicalConst();
				}
				break;
			case IDENTIFIERS:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(IDENTIFIERS);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ArithmeticExpressionContext extends ParserRuleContext {
		public TerminalNode OPERATORS_SUBTRACTION() { return getToken(JavaGrammarParser.OPERATORS_SUBTRACTION, 0); }
		public List<ArithmeticExpressionContext> arithmeticExpression() {
			return getRuleContexts(ArithmeticExpressionContext.class);
		}
		public ArithmeticExpressionContext arithmeticExpression(int i) {
			return getRuleContext(ArithmeticExpressionContext.class,i);
		}
		public TerminalNode SEPARATORS_DELIMITERS_LEFTPARENTHESIS() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_LEFTPARENTHESIS, 0); }
		public TerminalNode SEPARATORS_DELIMITERS_RIGHTPARENTHESIS() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_RIGHTPARENTHESIS, 0); }
		public NumberEquivalentContext numberEquivalent() {
			return getRuleContext(NumberEquivalentContext.class,0);
		}
		public TerminalNode OPERATORS_MULTIPLICATION() { return getToken(JavaGrammarParser.OPERATORS_MULTIPLICATION, 0); }
		public TerminalNode OPERATORS_DIVISION() { return getToken(JavaGrammarParser.OPERATORS_DIVISION, 0); }
		public TerminalNode OPERATORS_ADDITION() { return getToken(JavaGrammarParser.OPERATORS_ADDITION, 0); }
		public ArithmeticExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterArithmeticExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitArithmeticExpression(this);
		}
	}

	public final ArithmeticExpressionContext arithmeticExpression() throws RecognitionException {
		return arithmeticExpression(0);
	}

	private ArithmeticExpressionContext arithmeticExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmeticExpressionContext _localctx = new ArithmeticExpressionContext(_ctx, _parentState);
		ArithmeticExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_arithmeticExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPERATORS_SUBTRACTION:
				{
				setState(149);
				match(OPERATORS_SUBTRACTION);
				setState(150);
				arithmeticExpression(7);
				}
				break;
			case SEPARATORS_DELIMITERS_LEFTPARENTHESIS:
				{
				setState(151);
				match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
				setState(152);
				arithmeticExpression(0);
				setState(153);
				match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
				}
				break;
			case IDENTIFIERS:
			case LITERALS_NUMERIC_INT:
			case LITERALS_NUMERIC_DOUBLE:
				{
				setState(155);
				numberEquivalent();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(170);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(158);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(159);
						match(OPERATORS_MULTIPLICATION);
						setState(160);
						arithmeticExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(161);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(162);
						match(OPERATORS_DIVISION);
						setState(163);
						arithmeticExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(164);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(165);
						match(OPERATORS_ADDITION);
						setState(166);
						arithmeticExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(167);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(168);
						match(OPERATORS_SUBTRACTION);
						setState(169);
						arithmeticExpression(4);
						}
						break;
					}
					} 
				}
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ComparisonExpressionContext extends ParserRuleContext {
		public List<ArithmeticExpressionContext> arithmeticExpression() {
			return getRuleContexts(ArithmeticExpressionContext.class);
		}
		public ArithmeticExpressionContext arithmeticExpression(int i) {
			return getRuleContext(ArithmeticExpressionContext.class,i);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public TerminalNode SEPARATORS_DELIMITERS_LEFTPARENTHESIS() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_LEFTPARENTHESIS, 0); }
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public TerminalNode SEPARATORS_DELIMITERS_RIGHTPARENTHESIS() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_RIGHTPARENTHESIS, 0); }
		public ComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitComparisonExpression(this);
		}
	}

	public final ComparisonExpressionContext comparisonExpression() throws RecognitionException {
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comparisonExpression);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				arithmeticExpression(0);
				setState(176);
				comparisonOperator();
				setState(177);
				arithmeticExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
				setState(180);
				comparisonExpression();
				setState(181);
				match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
				}
				break;
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

	public static class LogicalExpressionContext extends ParserRuleContext {
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public TerminalNode SEPARATORS_DELIMITERS_LEFTPARENTHESIS() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_LEFTPARENTHESIS, 0); }
		public List<LogicalExpressionContext> logicalExpression() {
			return getRuleContexts(LogicalExpressionContext.class);
		}
		public LogicalExpressionContext logicalExpression(int i) {
			return getRuleContext(LogicalExpressionContext.class,i);
		}
		public TerminalNode SEPARATORS_DELIMITERS_RIGHTPARENTHESIS() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_RIGHTPARENTHESIS, 0); }
		public LogicalEquivalentContext logicalEquivalent() {
			return getRuleContext(LogicalEquivalentContext.class,0);
		}
		public TerminalNode OPERATORS_LOGICALAND() { return getToken(JavaGrammarParser.OPERATORS_LOGICALAND, 0); }
		public TerminalNode OPERATORS_LOGICALOR() { return getToken(JavaGrammarParser.OPERATORS_LOGICALOR, 0); }
		public TerminalNode OPERATORS_BITWISEAND() { return getToken(JavaGrammarParser.OPERATORS_BITWISEAND, 0); }
		public TerminalNode OPERATORS_BITWISEOR() { return getToken(JavaGrammarParser.OPERATORS_BITWISEOR, 0); }
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitLogicalExpression(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		return logicalExpression(0);
	}

	private LogicalExpressionContext logicalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, _parentState);
		LogicalExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_logicalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(186);
				comparisonExpression();
				}
				break;
			case 2:
				{
				setState(187);
				match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
				setState(188);
				logicalExpression(0);
				setState(189);
				match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
				}
				break;
			case 3:
				{
				setState(191);
				logicalEquivalent();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(206);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpression);
						setState(194);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(195);
						match(OPERATORS_LOGICALAND);
						setState(196);
						logicalExpression(8);
						}
						break;
					case 2:
						{
						_localctx = new LogicalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpression);
						setState(197);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(198);
						match(OPERATORS_LOGICALOR);
						setState(199);
						logicalExpression(7);
						}
						break;
					case 3:
						{
						_localctx = new LogicalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpression);
						setState(200);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(201);
						match(OPERATORS_BITWISEAND);
						setState(202);
						logicalExpression(6);
						}
						break;
					case 4:
						{
						_localctx = new LogicalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpression);
						setState(203);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(204);
						match(OPERATORS_BITWISEOR);
						setState(205);
						logicalExpression(5);
						}
						break;
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode SEPARATORS_DELIMITERS_LEFTCURLYBRACKET() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_LEFTCURLYBRACKET, 0); }
		public TerminalNode SEPARATORS_DELIMITERS_RIGHTCURLYBRACKET() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_RIGHTCURLYBRACKET, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(SEPARATORS_DELIMITERS_LEFTCURLYBRACKET);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORDS_BOOLEAN) | (1L << KEYWORDS_BYTE) | (1L << KEYWORDS_CHAR) | (1L << KEYWORDS_DO) | (1L << KEYWORDS_DOUBLE) | (1L << KEYWORDS_FLOAT) | (1L << KEYWORDS_FOR) | (1L << KEYWORDS_IF) | (1L << KEYWORDS_INT) | (1L << KEYWORDS_LONG) | (1L << KEYWORDS_RETURN) | (1L << KEYWORDS_SHORT) | (1L << KEYWORDS_STRING) | (1L << KEYWORDS_WHILE))) != 0)) {
				{
				{
				setState(212);
				statement();
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
			match(SEPARATORS_DELIMITERS_RIGHTCURLYBRACKET);
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

	public static class LoopBlockContext extends ParserRuleContext {
		public TerminalNode SEPARATORS_DELIMITERS_LEFTCURLYBRACKET() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_LEFTCURLYBRACKET, 0); }
		public TerminalNode SEPARATORS_DELIMITERS_RIGHTCURLYBRACKET() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_RIGHTCURLYBRACKET, 0); }
		public List<LoopStatmentContext> loopStatment() {
			return getRuleContexts(LoopStatmentContext.class);
		}
		public LoopStatmentContext loopStatment(int i) {
			return getRuleContext(LoopStatmentContext.class,i);
		}
		public LoopBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterLoopBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitLoopBlock(this);
		}
	}

	public final LoopBlockContext loopBlock() throws RecognitionException {
		LoopBlockContext _localctx = new LoopBlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_loopBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(SEPARATORS_DELIMITERS_LEFTCURLYBRACKET);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORDS_BOOLEAN) | (1L << KEYWORDS_BREAK) | (1L << KEYWORDS_BYTE) | (1L << KEYWORDS_CHAR) | (1L << KEYWORDS_CONTINUE) | (1L << KEYWORDS_DO) | (1L << KEYWORDS_DOUBLE) | (1L << KEYWORDS_FLOAT) | (1L << KEYWORDS_FOR) | (1L << KEYWORDS_IF) | (1L << KEYWORDS_INT) | (1L << KEYWORDS_LONG) | (1L << KEYWORDS_RETURN) | (1L << KEYWORDS_SHORT) | (1L << KEYWORDS_STRING) | (1L << KEYWORDS_WHILE))) != 0)) {
				{
				{
				setState(221);
				loopStatment();
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227);
			match(SEPARATORS_DELIMITERS_RIGHTCURLYBRACKET);
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

	public static class IfStatementContext extends ParserRuleContext {
		public List<TerminalNode> KEYWORDS_IF() { return getTokens(JavaGrammarParser.KEYWORDS_IF); }
		public TerminalNode KEYWORDS_IF(int i) {
			return getToken(JavaGrammarParser.KEYWORDS_IF, i);
		}
		public List<TerminalNode> SEPARATORS_DELIMITERS_LEFTPARENTHESIS() { return getTokens(JavaGrammarParser.SEPARATORS_DELIMITERS_LEFTPARENTHESIS); }
		public TerminalNode SEPARATORS_DELIMITERS_LEFTPARENTHESIS(int i) {
			return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_LEFTPARENTHESIS, i);
		}
		public List<LogicalExpressionContext> logicalExpression() {
			return getRuleContexts(LogicalExpressionContext.class);
		}
		public LogicalExpressionContext logicalExpression(int i) {
			return getRuleContext(LogicalExpressionContext.class,i);
		}
		public List<TerminalNode> SEPARATORS_DELIMITERS_RIGHTPARENTHESIS() { return getTokens(JavaGrammarParser.SEPARATORS_DELIMITERS_RIGHTPARENTHESIS); }
		public TerminalNode SEPARATORS_DELIMITERS_RIGHTPARENTHESIS(int i) {
			return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_RIGHTPARENTHESIS, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> KEYWORDS_ELSE() { return getTokens(JavaGrammarParser.KEYWORDS_ELSE); }
		public TerminalNode KEYWORDS_ELSE(int i) {
			return getToken(JavaGrammarParser.KEYWORDS_ELSE, i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ifStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(KEYWORDS_IF);
			setState(230);
			match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
			setState(231);
			logicalExpression(0);
			setState(232);
			match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEPARATORS_DELIMITERS_LEFTCURLYBRACKET:
				{
				setState(233);
				block();
				}
				break;
			case KEYWORDS_BOOLEAN:
			case KEYWORDS_BYTE:
			case KEYWORDS_CHAR:
			case KEYWORDS_DO:
			case KEYWORDS_DOUBLE:
			case KEYWORDS_FLOAT:
			case KEYWORDS_FOR:
			case KEYWORDS_IF:
			case KEYWORDS_INT:
			case KEYWORDS_LONG:
			case KEYWORDS_RETURN:
			case KEYWORDS_SHORT:
			case KEYWORDS_STRING:
			case KEYWORDS_WHILE:
				{
				setState(234);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(237);
					match(KEYWORDS_ELSE);
					setState(238);
					match(KEYWORDS_IF);
					setState(239);
					match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
					setState(240);
					logicalExpression(0);
					setState(241);
					match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
					setState(244);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SEPARATORS_DELIMITERS_LEFTCURLYBRACKET:
						{
						setState(242);
						block();
						}
						break;
					case KEYWORDS_BOOLEAN:
					case KEYWORDS_BYTE:
					case KEYWORDS_CHAR:
					case KEYWORDS_DO:
					case KEYWORDS_DOUBLE:
					case KEYWORDS_FLOAT:
					case KEYWORDS_FOR:
					case KEYWORDS_IF:
					case KEYWORDS_INT:
					case KEYWORDS_LONG:
					case KEYWORDS_RETURN:
					case KEYWORDS_SHORT:
					case KEYWORDS_STRING:
					case KEYWORDS_WHILE:
						{
						setState(243);
						statement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(251);
				match(KEYWORDS_ELSE);
				setState(254);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SEPARATORS_DELIMITERS_LEFTCURLYBRACKET:
					{
					setState(252);
					block();
					}
					break;
				case KEYWORDS_BOOLEAN:
				case KEYWORDS_BYTE:
				case KEYWORDS_CHAR:
				case KEYWORDS_DO:
				case KEYWORDS_DOUBLE:
				case KEYWORDS_FLOAT:
				case KEYWORDS_FOR:
				case KEYWORDS_IF:
				case KEYWORDS_INT:
				case KEYWORDS_LONG:
				case KEYWORDS_RETURN:
				case KEYWORDS_SHORT:
				case KEYWORDS_STRING:
				case KEYWORDS_WHILE:
					{
					setState(253);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
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

	public static class DoWhileStatementContext extends ParserRuleContext {
		public TerminalNode KEYWORDS_DO() { return getToken(JavaGrammarParser.KEYWORDS_DO, 0); }
		public TerminalNode KEYWORDS_WHILE() { return getToken(JavaGrammarParser.KEYWORDS_WHILE, 0); }
		public TerminalNode SEPARATORS_DELIMITERS_LEFTPARENTHESIS() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_LEFTPARENTHESIS, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode SEPARATORS_DELIMITERS_RIGHTPARENTHESIS() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_RIGHTPARENTHESIS, 0); }
		public LoopBlockContext loopBlock() {
			return getRuleContext(LoopBlockContext.class,0);
		}
		public LoopStatmentContext loopStatment() {
			return getRuleContext(LoopStatmentContext.class,0);
		}
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitDoWhileStatement(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(KEYWORDS_DO);
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEPARATORS_DELIMITERS_LEFTCURLYBRACKET:
				{
				setState(259);
				loopBlock();
				}
				break;
			case KEYWORDS_BOOLEAN:
			case KEYWORDS_BREAK:
			case KEYWORDS_BYTE:
			case KEYWORDS_CHAR:
			case KEYWORDS_CONTINUE:
			case KEYWORDS_DO:
			case KEYWORDS_DOUBLE:
			case KEYWORDS_FLOAT:
			case KEYWORDS_FOR:
			case KEYWORDS_IF:
			case KEYWORDS_INT:
			case KEYWORDS_LONG:
			case KEYWORDS_RETURN:
			case KEYWORDS_SHORT:
			case KEYWORDS_STRING:
			case KEYWORDS_WHILE:
				{
				setState(260);
				loopStatment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(263);
			match(KEYWORDS_WHILE);
			setState(264);
			match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
			setState(265);
			logicalExpression(0);
			setState(266);
			match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
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

	public static class WhileDoStatementContext extends ParserRuleContext {
		public TerminalNode KEYWORDS_WHILE() { return getToken(JavaGrammarParser.KEYWORDS_WHILE, 0); }
		public TerminalNode SEPARATORS_DELIMITERS_LEFTPARENTHESIS() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_LEFTPARENTHESIS, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode SEPARATORS_DELIMITERS_RIGHTPARENTHESIS() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_RIGHTPARENTHESIS, 0); }
		public LoopBlockContext loopBlock() {
			return getRuleContext(LoopBlockContext.class,0);
		}
		public LoopStatmentContext loopStatment() {
			return getRuleContext(LoopStatmentContext.class,0);
		}
		public WhileDoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileDoStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterWhileDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitWhileDoStatement(this);
		}
	}

	public final WhileDoStatementContext whileDoStatement() throws RecognitionException {
		WhileDoStatementContext _localctx = new WhileDoStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_whileDoStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(KEYWORDS_WHILE);
			setState(269);
			match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
			setState(270);
			logicalExpression(0);
			setState(271);
			match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEPARATORS_DELIMITERS_LEFTCURLYBRACKET:
				{
				setState(272);
				loopBlock();
				}
				break;
			case KEYWORDS_BOOLEAN:
			case KEYWORDS_BREAK:
			case KEYWORDS_BYTE:
			case KEYWORDS_CHAR:
			case KEYWORDS_CONTINUE:
			case KEYWORDS_DO:
			case KEYWORDS_DOUBLE:
			case KEYWORDS_FLOAT:
			case KEYWORDS_FOR:
			case KEYWORDS_IF:
			case KEYWORDS_INT:
			case KEYWORDS_LONG:
			case KEYWORDS_RETURN:
			case KEYWORDS_SHORT:
			case KEYWORDS_STRING:
			case KEYWORDS_WHILE:
				{
				setState(273);
				loopStatment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode OPERATORS_ASSIGNMENT() { return getToken(JavaGrammarParser.OPERATORS_ASSIGNMENT, 0); }
		public TerminalNode OPERATORS_MULTIPLICATIONANDASSIGNMENT() { return getToken(JavaGrammarParser.OPERATORS_MULTIPLICATIONANDASSIGNMENT, 0); }
		public TerminalNode OPERATORS_DIVISIONANDASSIGNMENT() { return getToken(JavaGrammarParser.OPERATORS_DIVISIONANDASSIGNMENT, 0); }
		public TerminalNode OPERATORS_MODULOANDASSIGMENT() { return getToken(JavaGrammarParser.OPERATORS_MODULOANDASSIGMENT, 0); }
		public TerminalNode OPERATORS_ADDITIONANDASSIGNMENT() { return getToken(JavaGrammarParser.OPERATORS_ADDITIONANDASSIGNMENT, 0); }
		public TerminalNode OPERATORS_SUBTRACTIONANDASSIGNMENT() { return getToken(JavaGrammarParser.OPERATORS_SUBTRACTIONANDASSIGNMENT, 0); }
		public TerminalNode OPERATORS_SHIFTLEFTASSIGNMENT() { return getToken(JavaGrammarParser.OPERATORS_SHIFTLEFTASSIGNMENT, 0); }
		public TerminalNode OPERATORS_SHIFTRIGHTASSIGNMENT() { return getToken(JavaGrammarParser.OPERATORS_SHIFTRIGHTASSIGNMENT, 0); }
		public TerminalNode OPERATORS_SHIFTRIGHTUNSIGNEDASSIGNMENT() { return getToken(JavaGrammarParser.OPERATORS_SHIFTRIGHTUNSIGNEDASSIGNMENT, 0); }
		public TerminalNode OPERATORS_BITWISEANDASSIGNMENT() { return getToken(JavaGrammarParser.OPERATORS_BITWISEANDASSIGNMENT, 0); }
		public TerminalNode OPERATORS_BITWISEXORASSIGNMENT() { return getToken(JavaGrammarParser.OPERATORS_BITWISEXORASSIGNMENT, 0); }
		public TerminalNode OPERATORS_BITWISEORASSIGNMENT() { return getToken(JavaGrammarParser.OPERATORS_BITWISEORASSIGNMENT, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (OPERATORS_ASSIGNMENT - 67)) | (1L << (OPERATORS_ADDITIONANDASSIGNMENT - 67)) | (1L << (OPERATORS_SUBTRACTIONANDASSIGNMENT - 67)) | (1L << (OPERATORS_MULTIPLICATIONANDASSIGNMENT - 67)) | (1L << (OPERATORS_DIVISIONANDASSIGNMENT - 67)) | (1L << (OPERATORS_MODULOANDASSIGMENT - 67)) | (1L << (OPERATORS_BITWISEANDASSIGNMENT - 67)) | (1L << (OPERATORS_BITWISEXORASSIGNMENT - 67)) | (1L << (OPERATORS_BITWISEORASSIGNMENT - 67)) | (1L << (OPERATORS_SHIFTLEFTASSIGNMENT - 67)) | (1L << (OPERATORS_SHIFTRIGHTASSIGNMENT - 67)) | (1L << (OPERATORS_SHIFTRIGHTUNSIGNEDASSIGNMENT - 67)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class ExpressionContext extends ParserRuleContext {
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public PreIncrementationExpressionContext preIncrementationExpression() {
			return getRuleContext(PreIncrementationExpressionContext.class,0);
		}
		public PostIncrementationExpressionContext postIncrementationExpression() {
			return getRuleContext(PostIncrementationExpressionContext.class,0);
		}
		public PreDecrementationExpressionContext preDecrementationExpression() {
			return getRuleContext(PreDecrementationExpressionContext.class,0);
		}
		public PostDecrementationExpressionContext postDecrementationExpression() {
			return getRuleContext(PostDecrementationExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expression);
		try {
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				arithmeticExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				logicalExpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				assignmentExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(281);
				preIncrementationExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(282);
				postIncrementationExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(283);
				preDecrementationExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(284);
				postDecrementationExpression();
				}
				break;
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode SEPARATORS_PUNCTUATORS_SEMICOLON() { return getToken(JavaGrammarParser.SEPARATORS_PUNCTUATORS_SEMICOLON, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			assignmentExpression();
			setState(288);
			match(SEPARATORS_PUNCTUATORS_SEMICOLON);
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

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIERS() { return getTokens(JavaGrammarParser.IDENTIFIERS); }
		public TerminalNode IDENTIFIERS(int i) {
			return getToken(JavaGrammarParser.IDENTIFIERS, i);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> OPERATORS_ASSIGNMENT() { return getTokens(JavaGrammarParser.OPERATORS_ASSIGNMENT); }
		public TerminalNode OPERATORS_ASSIGNMENT(int i) {
			return getToken(JavaGrammarParser.OPERATORS_ASSIGNMENT, i);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitAssignmentExpression(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assignmentExpression);
		int _la;
		try {
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				match(IDENTIFIERS);
				setState(291);
				assignmentOperator();
				setState(294);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(292);
					match(IDENTIFIERS);
					}
					break;
				case 2:
					{
					setState(293);
					expression();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				match(IDENTIFIERS);
				setState(299); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(297);
					match(OPERATORS_ASSIGNMENT);
					setState(298);
					match(IDENTIFIERS);
					}
					}
					setState(301); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OPERATORS_ASSIGNMENT );
				setState(304);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(303);
					expression();
					}
					break;
				}
				}
				break;
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

	public static class ForStatementContext extends ParserRuleContext {
		public EnhancedForStatementContext enhancedForStatement() {
			return getRuleContext(EnhancedForStatementContext.class,0);
		}
		public TerminalNode KEYWORDS_FOR() { return getToken(JavaGrammarParser.KEYWORDS_FOR, 0); }
		public TerminalNode SEPARATORS_DELIMITERS_LEFTPARENTHESIS() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_LEFTPARENTHESIS, 0); }
		public List<TerminalNode> SEPARATORS_PUNCTUATORS_SEMICOLON() { return getTokens(JavaGrammarParser.SEPARATORS_PUNCTUATORS_SEMICOLON); }
		public TerminalNode SEPARATORS_PUNCTUATORS_SEMICOLON(int i) {
			return getToken(JavaGrammarParser.SEPARATORS_PUNCTUATORS_SEMICOLON, i);
		}
		public TerminalNode SEPARATORS_DELIMITERS_RIGHTPARENTHESIS() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_RIGHTPARENTHESIS, 0); }
		public LoopBlockContext loopBlock() {
			return getRuleContext(LoopBlockContext.class,0);
		}
		public LoopStatmentContext loopStatment() {
			return getRuleContext(LoopStatmentContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_forStatement);
		int _la;
		try {
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				enhancedForStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				match(KEYWORDS_FOR);
				setState(310);
				match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORDS_BOOLEAN) | (1L << KEYWORDS_BYTE) | (1L << KEYWORDS_CHAR) | (1L << KEYWORDS_DOUBLE) | (1L << KEYWORDS_FLOAT) | (1L << KEYWORDS_INT) | (1L << KEYWORDS_LONG) | (1L << KEYWORDS_SHORT) | (1L << KEYWORDS_STRING) | (1L << IDENTIFIERS))) != 0)) {
					{
					setState(311);
					forInit();
					}
				}

				setState(314);
				match(SEPARATORS_PUNCTUATORS_SEMICOLON);
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IDENTIFIERS - 58)) | (1L << (LITERALS_NUMERIC_INT - 58)) | (1L << (LITERALS_NUMERIC_DOUBLE - 58)) | (1L << (LITERALS_LOGICAL_BOOLEAN - 58)) | (1L << (OPERATORS_SUBTRACTION - 58)) | (1L << (SEPARATORS_DELIMITERS_LEFTPARENTHESIS - 58)))) != 0)) {
					{
					setState(315);
					logicalExpression(0);
					}
				}

				setState(318);
				match(SEPARATORS_PUNCTUATORS_SEMICOLON);
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIERS) {
					{
					setState(319);
					forUpdate();
					}
				}

				setState(322);
				match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
				setState(325);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SEPARATORS_DELIMITERS_LEFTCURLYBRACKET:
					{
					setState(323);
					loopBlock();
					}
					break;
				case KEYWORDS_BOOLEAN:
				case KEYWORDS_BREAK:
				case KEYWORDS_BYTE:
				case KEYWORDS_CHAR:
				case KEYWORDS_CONTINUE:
				case KEYWORDS_DO:
				case KEYWORDS_DOUBLE:
				case KEYWORDS_FLOAT:
				case KEYWORDS_FOR:
				case KEYWORDS_IF:
				case KEYWORDS_INT:
				case KEYWORDS_LONG:
				case KEYWORDS_RETURN:
				case KEYWORDS_SHORT:
				case KEYWORDS_STRING:
				case KEYWORDS_WHILE:
					{
					setState(324);
					loopStatment();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
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

	public static class ForInitContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public List<TerminalNode> OPERATORS_ASSIGNMENT() { return getTokens(JavaGrammarParser.OPERATORS_ASSIGNMENT); }
		public TerminalNode OPERATORS_ASSIGNMENT(int i) {
			return getToken(JavaGrammarParser.OPERATORS_ASSIGNMENT, i);
		}
		public List<TerminalNode> IDENTIFIERS() { return getTokens(JavaGrammarParser.IDENTIFIERS); }
		public TerminalNode IDENTIFIERS(int i) {
			return getToken(JavaGrammarParser.IDENTIFIERS, i);
		}
		public NumberEquivalentContext numberEquivalent() {
			return getRuleContext(NumberEquivalentContext.class,0);
		}
		public TerminalNode LITERALS_TEXTUAL_CHAR() { return getToken(JavaGrammarParser.LITERALS_TEXTUAL_CHAR, 0); }
		public TerminalNode LITERALS_TEXTUAL_STRING() { return getToken(JavaGrammarParser.LITERALS_TEXTUAL_STRING, 0); }
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_forInit);
		int _la;
		try {
			int _alt;
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				variableDeclaration();
				setState(332); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(330);
						match(OPERATORS_ASSIGNMENT);
						setState(331);
						match(IDENTIFIERS);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(334); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPERATORS_ASSIGNMENT) {
					{
					setState(336);
					match(OPERATORS_ASSIGNMENT);
					setState(340);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIERS:
					case LITERALS_NUMERIC_INT:
					case LITERALS_NUMERIC_DOUBLE:
						{
						setState(337);
						numberEquivalent();
						}
						break;
					case LITERALS_TEXTUAL_CHAR:
						{
						setState(338);
						match(LITERALS_TEXTUAL_CHAR);
						}
						break;
					case LITERALS_TEXTUAL_STRING:
						{
						setState(339);
						match(LITERALS_TEXTUAL_STRING);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				match(IDENTIFIERS);
				setState(347); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(345);
						match(OPERATORS_ASSIGNMENT);
						setState(346);
						match(IDENTIFIERS);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(349); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPERATORS_ASSIGNMENT) {
					{
					setState(351);
					match(OPERATORS_ASSIGNMENT);
					setState(356);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						setState(352);
						numberEquivalent();
						}
						break;
					case 2:
						{
						setState(353);
						match(LITERALS_TEXTUAL_CHAR);
						}
						break;
					case 3:
						{
						setState(354);
						match(LITERALS_TEXTUAL_STRING);
						}
						break;
					case 4:
						{
						setState(355);
						match(IDENTIFIERS);
						}
						break;
					}
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(360);
				variableDeclaration();
				setState(361);
				match(OPERATORS_ASSIGNMENT);
				setState(366);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(362);
					numberEquivalent();
					}
					break;
				case 2:
					{
					setState(363);
					match(LITERALS_TEXTUAL_CHAR);
					}
					break;
				case 3:
					{
					setState(364);
					match(LITERALS_TEXTUAL_STRING);
					}
					break;
				case 4:
					{
					setState(365);
					match(IDENTIFIERS);
					}
					break;
				}
				}
				break;
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

	public static class ForUpdateContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> SEPARATORS_PUNCTUATORS_COMMA() { return getTokens(JavaGrammarParser.SEPARATORS_PUNCTUATORS_COMMA); }
		public TerminalNode SEPARATORS_PUNCTUATORS_COMMA(int i) {
			return getToken(JavaGrammarParser.SEPARATORS_PUNCTUATORS_COMMA, i);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitForUpdate(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_forUpdate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(370);
				assignmentExpression();
				}
				}
				setState(373); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIERS );
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARATORS_PUNCTUATORS_COMMA) {
				{
				{
				setState(375);
				match(SEPARATORS_PUNCTUATORS_COMMA);
				setState(376);
				assignmentExpression();
				}
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class EnhancedForStatementContext extends ParserRuleContext {
		public TerminalNode KEYWORDS_FOR() { return getToken(JavaGrammarParser.KEYWORDS_FOR, 0); }
		public TerminalNode SEPARATORS_DELIMITERS_LEFTPARENTHESIS() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_LEFTPARENTHESIS, 0); }
		public KeywordsTypeContext keywordsType() {
			return getRuleContext(KeywordsTypeContext.class,0);
		}
		public List<TerminalNode> IDENTIFIERS() { return getTokens(JavaGrammarParser.IDENTIFIERS); }
		public TerminalNode IDENTIFIERS(int i) {
			return getToken(JavaGrammarParser.IDENTIFIERS, i);
		}
		public TerminalNode OPERATORS_ELSE() { return getToken(JavaGrammarParser.OPERATORS_ELSE, 0); }
		public TerminalNode SEPARATORS_DELIMITERS_RIGHTPARENTHESIS() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_RIGHTPARENTHESIS, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public EnhancedForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterEnhancedForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitEnhancedForStatement(this);
		}
	}

	public final EnhancedForStatementContext enhancedForStatement() throws RecognitionException {
		EnhancedForStatementContext _localctx = new EnhancedForStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_enhancedForStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(KEYWORDS_FOR);
			setState(383);
			match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
			setState(384);
			keywordsType();
			setState(385);
			match(IDENTIFIERS);
			setState(386);
			match(OPERATORS_ELSE);
			setState(387);
			match(IDENTIFIERS);
			setState(388);
			match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
			setState(391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEPARATORS_DELIMITERS_LEFTCURLYBRACKET:
				{
				setState(389);
				block();
				}
				break;
			case KEYWORDS_BOOLEAN:
			case KEYWORDS_BYTE:
			case KEYWORDS_CHAR:
			case KEYWORDS_DO:
			case KEYWORDS_DOUBLE:
			case KEYWORDS_FLOAT:
			case KEYWORDS_FOR:
			case KEYWORDS_IF:
			case KEYWORDS_INT:
			case KEYWORDS_LONG:
			case KEYWORDS_RETURN:
			case KEYWORDS_SHORT:
			case KEYWORDS_STRING:
			case KEYWORDS_WHILE:
				{
				setState(390);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode KEYWORDS_RETURN() { return getToken(JavaGrammarParser.KEYWORDS_RETURN, 0); }
		public TerminalNode SEPARATORS_PUNCTUATORS_SEMICOLON() { return getToken(JavaGrammarParser.SEPARATORS_PUNCTUATORS_SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(KEYWORDS_RETURN);
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IDENTIFIERS - 58)) | (1L << (LITERALS_NUMERIC_INT - 58)) | (1L << (LITERALS_NUMERIC_DOUBLE - 58)) | (1L << (LITERALS_LOGICAL_BOOLEAN - 58)) | (1L << (OPERATORS_INCREMENT - 58)) | (1L << (OPERATORS_DECREMENT - 58)) | (1L << (OPERATORS_SUBTRACTION - 58)) | (1L << (SEPARATORS_DELIMITERS_LEFTPARENTHESIS - 58)))) != 0)) {
				{
				setState(394);
				expression();
				}
			}

			setState(397);
			match(SEPARATORS_PUNCTUATORS_SEMICOLON);
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

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode KEYWORDS_BREAK() { return getToken(JavaGrammarParser.KEYWORDS_BREAK, 0); }
		public TerminalNode SEPARATORS_PUNCTUATORS_SEMICOLON() { return getToken(JavaGrammarParser.SEPARATORS_PUNCTUATORS_SEMICOLON, 0); }
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(KEYWORDS_BREAK);
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIERS) {
				{
				setState(400);
				match(IDENTIFIERS);
				}
			}

			setState(403);
			match(SEPARATORS_PUNCTUATORS_SEMICOLON);
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

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode KEYWORDS_CONTINUE() { return getToken(JavaGrammarParser.KEYWORDS_CONTINUE, 0); }
		public TerminalNode SEPARATORS_PUNCTUATORS_SEMICOLON() { return getToken(JavaGrammarParser.SEPARATORS_PUNCTUATORS_SEMICOLON, 0); }
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitContinueStatement(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(KEYWORDS_CONTINUE);
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIERS) {
				{
				setState(406);
				match(IDENTIFIERS);
				}
			}

			setState(409);
			match(SEPARATORS_PUNCTUATORS_SEMICOLON);
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

	public static class ParameterListContext extends ParserRuleContext {
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public List<TerminalNode> SEPARATORS_PUNCTUATORS_COMMA() { return getTokens(JavaGrammarParser.SEPARATORS_PUNCTUATORS_COMMA); }
		public TerminalNode SEPARATORS_PUNCTUATORS_COMMA(int i) {
			return getToken(JavaGrammarParser.SEPARATORS_PUNCTUATORS_COMMA, i);
		}
		public List<ParameterListContext> parameterList() {
			return getRuleContexts(ParameterListContext.class);
		}
		public ParameterListContext parameterList(int i) {
			return getRuleContext(ParameterListContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_parameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(411);
			variableType();
			setState(412);
			match(IDENTIFIERS);
			setState(417);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(413);
					match(SEPARATORS_PUNCTUATORS_COMMA);
					setState(414);
					parameterList();
					}
					} 
				}
				setState(419);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			}
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

	public static class OperatorsBitwiseContext extends ParserRuleContext {
		public TerminalNode OPERATORS_BITWISENOT() { return getToken(JavaGrammarParser.OPERATORS_BITWISENOT, 0); }
		public TerminalNode OPERATORS_BITWISEAND() { return getToken(JavaGrammarParser.OPERATORS_BITWISEAND, 0); }
		public TerminalNode OPERATORS_BITWISEOR() { return getToken(JavaGrammarParser.OPERATORS_BITWISEOR, 0); }
		public TerminalNode OPERATORS_BITWISEXOR() { return getToken(JavaGrammarParser.OPERATORS_BITWISEXOR, 0); }
		public TerminalNode OPERATORS_BITWISEANDASSIGNMENT() { return getToken(JavaGrammarParser.OPERATORS_BITWISEANDASSIGNMENT, 0); }
		public TerminalNode OPERATORS_BITWISEORASSIGNMENT() { return getToken(JavaGrammarParser.OPERATORS_BITWISEORASSIGNMENT, 0); }
		public TerminalNode OPERATORS_BITWISEXORASSIGNMENT() { return getToken(JavaGrammarParser.OPERATORS_BITWISEXORASSIGNMENT, 0); }
		public TerminalNode OPERATORS_SHIFTRIGHTUNSIGNED() { return getToken(JavaGrammarParser.OPERATORS_SHIFTRIGHTUNSIGNED, 0); }
		public TerminalNode OPERATORS_SHIFTLEFT() { return getToken(JavaGrammarParser.OPERATORS_SHIFTLEFT, 0); }
		public TerminalNode OPERATORS_SHIFTRIGHT() { return getToken(JavaGrammarParser.OPERATORS_SHIFTRIGHT, 0); }
		public TerminalNode OPERATORS_SHIFTRIGHTUNSIGNEDASSIGNMENT() { return getToken(JavaGrammarParser.OPERATORS_SHIFTRIGHTUNSIGNEDASSIGNMENT, 0); }
		public TerminalNode OPERATORS_SHIFTLEFTASSIGNMENT() { return getToken(JavaGrammarParser.OPERATORS_SHIFTLEFTASSIGNMENT, 0); }
		public TerminalNode OPERATORS_SHIFTRIGHTASSIGNMENT() { return getToken(JavaGrammarParser.OPERATORS_SHIFTRIGHTASSIGNMENT, 0); }
		public OperatorsBitwiseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorsBitwise; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterOperatorsBitwise(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitOperatorsBitwise(this);
		}
	}

	public final OperatorsBitwiseContext operatorsBitwise() throws RecognitionException {
		OperatorsBitwiseContext _localctx = new OperatorsBitwiseContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_operatorsBitwise);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			_la = _input.LA(1);
			if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (OPERATORS_BITWISENOT - 90)) | (1L << (OPERATORS_BITWISEAND - 90)) | (1L << (OPERATORS_BITWISEOR - 90)) | (1L << (OPERATORS_BITWISEXOR - 90)) | (1L << (OPERATORS_BITWISEANDASSIGNMENT - 90)) | (1L << (OPERATORS_BITWISEXORASSIGNMENT - 90)) | (1L << (OPERATORS_BITWISEORASSIGNMENT - 90)) | (1L << (OPERATORS_SHIFTLEFT - 90)) | (1L << (OPERATORS_SHIFTRIGHT - 90)) | (1L << (OPERATORS_SHIFTRIGHTUNSIGNED - 90)) | (1L << (OPERATORS_SHIFTLEFTASSIGNMENT - 90)) | (1L << (OPERATORS_SHIFTRIGHTASSIGNMENT - 90)) | (1L << (OPERATORS_SHIFTRIGHTUNSIGNEDASSIGNMENT - 90)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class ExpressionBitwiseContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIERS() { return getTokens(JavaGrammarParser.IDENTIFIERS); }
		public TerminalNode IDENTIFIERS(int i) {
			return getToken(JavaGrammarParser.IDENTIFIERS, i);
		}
		public List<TerminalNode> LITERALS_NUMERIC_INT() { return getTokens(JavaGrammarParser.LITERALS_NUMERIC_INT); }
		public TerminalNode LITERALS_NUMERIC_INT(int i) {
			return getToken(JavaGrammarParser.LITERALS_NUMERIC_INT, i);
		}
		public List<OperatorsBitwiseContext> operatorsBitwise() {
			return getRuleContexts(OperatorsBitwiseContext.class);
		}
		public OperatorsBitwiseContext operatorsBitwise(int i) {
			return getRuleContext(OperatorsBitwiseContext.class,i);
		}
		public ExpressionBitwiseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionBitwise; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterExpressionBitwise(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitExpressionBitwise(this);
		}
	}

	public final ExpressionBitwiseContext expressionBitwise() throws RecognitionException {
		ExpressionBitwiseContext _localctx = new ExpressionBitwiseContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_expressionBitwise);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIERS || _la==LITERALS_NUMERIC_INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(426); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(423);
				operatorsBitwise();
				setState(424);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIERS || _la==LITERALS_NUMERIC_INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(428); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (OPERATORS_BITWISENOT - 90)) | (1L << (OPERATORS_BITWISEAND - 90)) | (1L << (OPERATORS_BITWISEOR - 90)) | (1L << (OPERATORS_BITWISEXOR - 90)) | (1L << (OPERATORS_BITWISEANDASSIGNMENT - 90)) | (1L << (OPERATORS_BITWISEXORASSIGNMENT - 90)) | (1L << (OPERATORS_BITWISEORASSIGNMENT - 90)) | (1L << (OPERATORS_SHIFTLEFT - 90)) | (1L << (OPERATORS_SHIFTRIGHT - 90)) | (1L << (OPERATORS_SHIFTRIGHTUNSIGNED - 90)) | (1L << (OPERATORS_SHIFTLEFTASSIGNMENT - 90)) | (1L << (OPERATORS_SHIFTRIGHTASSIGNMENT - 90)) | (1L << (OPERATORS_SHIFTRIGHTUNSIGNEDASSIGNMENT - 90)))) != 0) );
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

	public static class StringNullAssignmentContext extends ParserRuleContext {
		public TerminalNode KEYWORDS_STRING() { return getToken(JavaGrammarParser.KEYWORDS_STRING, 0); }
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public TerminalNode OPERATORS_ASSIGNMENT() { return getToken(JavaGrammarParser.OPERATORS_ASSIGNMENT, 0); }
		public TerminalNode LITERALS_REFERENCE_NULL() { return getToken(JavaGrammarParser.LITERALS_REFERENCE_NULL, 0); }
		public StringNullAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringNullAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterStringNullAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitStringNullAssignment(this);
		}
	}

	public final StringNullAssignmentContext stringNullAssignment() throws RecognitionException {
		StringNullAssignmentContext _localctx = new StringNullAssignmentContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_stringNullAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(KEYWORDS_STRING);
			setState(431);
			match(IDENTIFIERS);
			setState(432);
			match(OPERATORS_ASSIGNMENT);
			setState(433);
			match(LITERALS_REFERENCE_NULL);
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

	public static class PreIncrementationExpressionContext extends ParserRuleContext {
		public TerminalNode OPERATORS_INCREMENT() { return getToken(JavaGrammarParser.OPERATORS_INCREMENT, 0); }
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public PreIncrementationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preIncrementationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterPreIncrementationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitPreIncrementationExpression(this);
		}
	}

	public final PreIncrementationExpressionContext preIncrementationExpression() throws RecognitionException {
		PreIncrementationExpressionContext _localctx = new PreIncrementationExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_preIncrementationExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(OPERATORS_INCREMENT);
			setState(436);
			match(IDENTIFIERS);
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

	public static class PostIncrementationExpressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public TerminalNode OPERATORS_INCREMENT() { return getToken(JavaGrammarParser.OPERATORS_INCREMENT, 0); }
		public PostIncrementationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterPostIncrementationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitPostIncrementationExpression(this);
		}
	}

	public final PostIncrementationExpressionContext postIncrementationExpression() throws RecognitionException {
		PostIncrementationExpressionContext _localctx = new PostIncrementationExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_postIncrementationExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(IDENTIFIERS);
			setState(439);
			match(OPERATORS_INCREMENT);
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

	public static class PreDecrementationExpressionContext extends ParserRuleContext {
		public TerminalNode OPERATORS_DECREMENT() { return getToken(JavaGrammarParser.OPERATORS_DECREMENT, 0); }
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public PreDecrementationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preDecrementationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterPreDecrementationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitPreDecrementationExpression(this);
		}
	}

	public final PreDecrementationExpressionContext preDecrementationExpression() throws RecognitionException {
		PreDecrementationExpressionContext _localctx = new PreDecrementationExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_preDecrementationExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(OPERATORS_DECREMENT);
			setState(442);
			match(IDENTIFIERS);
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

	public static class PostDecrementationExpressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public TerminalNode OPERATORS_DECREMENT() { return getToken(JavaGrammarParser.OPERATORS_DECREMENT, 0); }
		public PostDecrementationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterPostDecrementationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitPostDecrementationExpression(this);
		}
	}

	public final PostDecrementationExpressionContext postDecrementationExpression() throws RecognitionException {
		PostDecrementationExpressionContext _localctx = new PostDecrementationExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_postDecrementationExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(IDENTIFIERS);
			setState(445);
			match(OPERATORS_DECREMENT);
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

	public static class VariableTypeContext extends ParserRuleContext {
		public KeywordsTypeContext keywordsType() {
			return getRuleContext(KeywordsTypeContext.class,0);
		}
		public TerminalNode SEPARATORS_DELIMITERS_LEFTSQUAREBRACKET() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_LEFTSQUAREBRACKET, 0); }
		public TerminalNode SEPARATORS_DELIMITERS_RIGHTSQUAREBRACKET() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_RIGHTSQUAREBRACKET, 0); }
		public TerminalNode LITERALS_NUMERIC_INT() { return getToken(JavaGrammarParser.LITERALS_NUMERIC_INT, 0); }
		public VariableTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterVariableType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitVariableType(this);
		}
	}

	public final VariableTypeContext variableType() throws RecognitionException {
		VariableTypeContext _localctx = new VariableTypeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_variableType);
		int _la;
		try {
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				keywordsType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				keywordsType();
				setState(449);
				match(SEPARATORS_DELIMITERS_LEFTSQUAREBRACKET);
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LITERALS_NUMERIC_INT) {
					{
					setState(450);
					match(LITERALS_NUMERIC_INT);
					}
				}

				setState(453);
				match(SEPARATORS_DELIMITERS_RIGHTSQUAREBRACKET);
				}
				break;
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

	public static class KeywordsTypeContext extends ParserRuleContext {
		public TerminalNode KEYWORDS_BOOLEAN() { return getToken(JavaGrammarParser.KEYWORDS_BOOLEAN, 0); }
		public TerminalNode KEYWORDS_BYTE() { return getToken(JavaGrammarParser.KEYWORDS_BYTE, 0); }
		public TerminalNode KEYWORDS_CHAR() { return getToken(JavaGrammarParser.KEYWORDS_CHAR, 0); }
		public TerminalNode KEYWORDS_INT() { return getToken(JavaGrammarParser.KEYWORDS_INT, 0); }
		public TerminalNode KEYWORDS_SHORT() { return getToken(JavaGrammarParser.KEYWORDS_SHORT, 0); }
		public TerminalNode KEYWORDS_LONG() { return getToken(JavaGrammarParser.KEYWORDS_LONG, 0); }
		public TerminalNode KEYWORDS_FLOAT() { return getToken(JavaGrammarParser.KEYWORDS_FLOAT, 0); }
		public TerminalNode KEYWORDS_DOUBLE() { return getToken(JavaGrammarParser.KEYWORDS_DOUBLE, 0); }
		public TerminalNode KEYWORDS_STRING() { return getToken(JavaGrammarParser.KEYWORDS_STRING, 0); }
		public KeywordsTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordsType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterKeywordsType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitKeywordsType(this);
		}
	}

	public final KeywordsTypeContext keywordsType() throws RecognitionException {
		KeywordsTypeContext _localctx = new KeywordsTypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_keywordsType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORDS_BOOLEAN) | (1L << KEYWORDS_BYTE) | (1L << KEYWORDS_CHAR) | (1L << KEYWORDS_DOUBLE) | (1L << KEYWORDS_FLOAT) | (1L << KEYWORDS_INT) | (1L << KEYWORDS_LONG) | (1L << KEYWORDS_SHORT) | (1L << KEYWORDS_STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return arithmeticExpression_sempred((ArithmeticExpressionContext)_localctx, predIndex);
		case 15:
			return logicalExpression_sempred((LogicalExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmeticExpression_sempred(ArithmeticExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean logicalExpression_sempred(LogicalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3u\u01ce\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\7\2X\n\2\f\2\16\2[\13\2\3\3\5\3^\n\3\3\3\5\3a\n\3\3\3\3\3\3\3\3\3\5"+
		"\3g\n\3\3\3\3\3\3\3\5\3l\n\3\3\4\3\4\3\5\3\5\3\6\3\6\5\6t\n\6\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0082\n\b\3\t\3\t\3\t\5\t"+
		"\u0087\n\t\3\n\3\n\3\13\3\13\3\f\3\f\5\f\u008f\n\f\3\r\3\r\3\16\3\16\5"+
		"\16\u0095\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u009f\n\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00ad"+
		"\n\17\f\17\16\17\u00b0\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5"+
		"\20\u00ba\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00c3\n\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00d1\n\21"+
		"\f\21\16\21\u00d4\13\21\3\22\3\22\7\22\u00d8\n\22\f\22\16\22\u00db\13"+
		"\22\3\22\3\22\3\23\3\23\7\23\u00e1\n\23\f\23\16\23\u00e4\13\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00ee\n\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u00f7\n\24\7\24\u00f9\n\24\f\24\16\24\u00fc\13\24"+
		"\3\24\3\24\3\24\5\24\u0101\n\24\5\24\u0103\n\24\3\25\3\25\3\25\5\25\u0108"+
		"\n\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0115"+
		"\n\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0120\n\30\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u0129\n\32\3\32\3\32\3\32\6\32\u012e"+
		"\n\32\r\32\16\32\u012f\3\32\5\32\u0133\n\32\5\32\u0135\n\32\3\33\3\33"+
		"\3\33\3\33\5\33\u013b\n\33\3\33\3\33\5\33\u013f\n\33\3\33\3\33\5\33\u0143"+
		"\n\33\3\33\3\33\3\33\5\33\u0148\n\33\5\33\u014a\n\33\3\34\3\34\3\34\6"+
		"\34\u014f\n\34\r\34\16\34\u0150\3\34\3\34\3\34\3\34\5\34\u0157\n\34\5"+
		"\34\u0159\n\34\3\34\3\34\3\34\6\34\u015e\n\34\r\34\16\34\u015f\3\34\3"+
		"\34\3\34\3\34\3\34\5\34\u0167\n\34\5\34\u0169\n\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\5\34\u0171\n\34\5\34\u0173\n\34\3\35\6\35\u0176\n\35\r\35\16"+
		"\35\u0177\3\35\3\35\7\35\u017c\n\35\f\35\16\35\u017f\13\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u018a\n\36\3\37\3\37\5\37\u018e"+
		"\n\37\3\37\3\37\3 \3 \5 \u0194\n \3 \3 \3!\3!\5!\u019a\n!\3!\3!\3\"\3"+
		"\"\3\"\3\"\7\"\u01a2\n\"\f\"\16\"\u01a5\13\"\3#\3#\3$\3$\3$\3$\6$\u01ad"+
		"\n$\r$\16$\u01ae\3%\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3"+
		")\3*\3*\3*\3*\5*\u01c6\n*\3*\3*\5*\u01ca\n*\3+\3+\3+\2\4\34 ,\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT\2"+
		"\13\3\2)+\7\2\n\n\32\32&&./\62\62\4\2FGIK\3\2=>\3\2??\6\2EEVZ`bfh\3\2"+
		"\\h\3\2<=\13\2\f\f\16\16\21\21\27\27\34\34##%%--\60\60\2\u01f0\2Y\3\2"+
		"\2\2\4]\3\2\2\2\6m\3\2\2\2\bo\3\2\2\2\ns\3\2\2\2\fu\3\2\2\2\16\u0081\3"+
		"\2\2\2\20\u0086\3\2\2\2\22\u0088\3\2\2\2\24\u008a\3\2\2\2\26\u008e\3\2"+
		"\2\2\30\u0090\3\2\2\2\32\u0094\3\2\2\2\34\u009e\3\2\2\2\36\u00b9\3\2\2"+
		"\2 \u00c2\3\2\2\2\"\u00d5\3\2\2\2$\u00de\3\2\2\2&\u00e7\3\2\2\2(\u0104"+
		"\3\2\2\2*\u010e\3\2\2\2,\u0116\3\2\2\2.\u011f\3\2\2\2\60\u0121\3\2\2\2"+
		"\62\u0134\3\2\2\2\64\u0149\3\2\2\2\66\u0172\3\2\2\28\u0175\3\2\2\2:\u0180"+
		"\3\2\2\2<\u018b\3\2\2\2>\u0191\3\2\2\2@\u0197\3\2\2\2B\u019d\3\2\2\2D"+
		"\u01a6\3\2\2\2F\u01a8\3\2\2\2H\u01b0\3\2\2\2J\u01b5\3\2\2\2L\u01b8\3\2"+
		"\2\2N\u01bb\3\2\2\2P\u01be\3\2\2\2R\u01c9\3\2\2\2T\u01cb\3\2\2\2VX\5\4"+
		"\3\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\3\3\2\2\2[Y\3\2\2\2\\^\5"+
		"\6\4\2]\\\3\2\2\2]^\3\2\2\2^`\3\2\2\2_a\5\b\5\2`_\3\2\2\2`a\3\2\2\2ab"+
		"\3\2\2\2bc\5\n\6\2cd\7<\2\2df\7m\2\2eg\5B\"\2fe\3\2\2\2fg\3\2\2\2gh\3"+
		"\2\2\2hk\7n\2\2il\5\"\22\2jl\7i\2\2ki\3\2\2\2kj\3\2\2\2l\5\3\2\2\2mn\t"+
		"\2\2\2n\7\3\2\2\2op\t\3\2\2p\t\3\2\2\2qt\5R*\2rt\79\2\2sq\3\2\2\2sr\3"+
		"\2\2\2t\13\3\2\2\2uv\5R*\2vw\7<\2\2w\r\3\2\2\2xy\5\f\7\2yz\7i\2\2z\u0082"+
		"\3\2\2\2{\u0082\5&\24\2|\u0082\5*\26\2}\u0082\5(\25\2~\u0082\5\64\33\2"+
		"\177\u0082\5:\36\2\u0080\u0082\5<\37\2\u0081x\3\2\2\2\u0081{\3\2\2\2\u0081"+
		"|\3\2\2\2\u0081}\3\2\2\2\u0081~\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080"+
		"\3\2\2\2\u0082\17\3\2\2\2\u0083\u0087\5\16\b\2\u0084\u0087\5> \2\u0085"+
		"\u0087\5@!\2\u0086\u0083\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2"+
		"\2\u0087\21\3\2\2\2\u0088\u0089\t\4\2\2\u0089\23\3\2\2\2\u008a\u008b\t"+
		"\5\2\2\u008b\25\3\2\2\2\u008c\u008f\5\24\13\2\u008d\u008f\7<\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f\27\3\2\2\2\u0090\u0091\t\6\2"+
		"\2\u0091\31\3\2\2\2\u0092\u0095\5\30\r\2\u0093\u0095\7<\2\2\u0094\u0092"+
		"\3\2\2\2\u0094\u0093\3\2\2\2\u0095\33\3\2\2\2\u0096\u0097\b\17\1\2\u0097"+
		"\u0098\7R\2\2\u0098\u009f\5\34\17\t\u0099\u009a\7m\2\2\u009a\u009b\5\34"+
		"\17\2\u009b\u009c\7n\2\2\u009c\u009f\3\2\2\2\u009d\u009f\5\26\f\2\u009e"+
		"\u0096\3\2\2\2\u009e\u0099\3\2\2\2\u009e\u009d\3\2\2\2\u009f\u00ae\3\2"+
		"\2\2\u00a0\u00a1\f\b\2\2\u00a1\u00a2\7S\2\2\u00a2\u00ad\5\34\17\t\u00a3"+
		"\u00a4\f\7\2\2\u00a4\u00a5\7T\2\2\u00a5\u00ad\5\34\17\b\u00a6\u00a7\f"+
		"\6\2\2\u00a7\u00a8\7Q\2\2\u00a8\u00ad\5\34\17\7\u00a9\u00aa\f\5\2\2\u00aa"+
		"\u00ab\7R\2\2\u00ab\u00ad\5\34\17\6\u00ac\u00a0\3\2\2\2\u00ac\u00a3\3"+
		"\2\2\2\u00ac\u00a6\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\35\3\2\2\2\u00b0\u00ae\3\2\2"+
		"\2\u00b1\u00b2\5\34\17\2\u00b2\u00b3\5\22\n\2\u00b3\u00b4\5\34\17\2\u00b4"+
		"\u00ba\3\2\2\2\u00b5\u00b6\7m\2\2\u00b6\u00b7\5\36\20\2\u00b7\u00b8\7"+
		"n\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b1\3\2\2\2\u00b9\u00b5\3\2\2\2\u00ba"+
		"\37\3\2\2\2\u00bb\u00bc\b\21\1\2\u00bc\u00c3\5\36\20\2\u00bd\u00be\7m"+
		"\2\2\u00be\u00bf\5 \21\2\u00bf\u00c0\7n\2\2\u00c0\u00c3\3\2\2\2\u00c1"+
		"\u00c3\5\32\16\2\u00c2\u00bb\3\2\2\2\u00c2\u00bd\3\2\2\2\u00c2\u00c1\3"+
		"\2\2\2\u00c3\u00d2\3\2\2\2\u00c4\u00c5\f\t\2\2\u00c5\u00c6\7M\2\2\u00c6"+
		"\u00d1\5 \21\n\u00c7\u00c8\f\b\2\2\u00c8\u00c9\7N\2\2\u00c9\u00d1\5 \21"+
		"\t\u00ca\u00cb\f\7\2\2\u00cb\u00cc\7]\2\2\u00cc\u00d1\5 \21\b\u00cd\u00ce"+
		"\f\6\2\2\u00ce\u00cf\7^\2\2\u00cf\u00d1\5 \21\7\u00d0\u00c4\3\2\2\2\u00d0"+
		"\u00c7\3\2\2\2\u00d0\u00ca\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d1\u00d4\3\2"+
		"\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3!\3\2\2\2\u00d4\u00d2"+
		"\3\2\2\2\u00d5\u00d9\7o\2\2\u00d6\u00d8\5\16\b\2\u00d7\u00d6\3\2\2\2\u00d8"+
		"\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2"+
		"\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\7p\2\2\u00dd#\3\2\2\2\u00de\u00e2"+
		"\7o\2\2\u00df\u00e1\5\20\t\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2"+
		"\2\2\u00e5\u00e6\7p\2\2\u00e6%\3\2\2\2\u00e7\u00e8\7\37\2\2\u00e8\u00e9"+
		"\7m\2\2\u00e9\u00ea\5 \21\2\u00ea\u00ed\7n\2\2\u00eb\u00ee\5\"\22\2\u00ec"+
		"\u00ee\5\16\b\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00fa\3"+
		"\2\2\2\u00ef\u00f0\7\30\2\2\u00f0\u00f1\7\37\2\2\u00f1\u00f2\7m\2\2\u00f2"+
		"\u00f3\5 \21\2\u00f3\u00f6\7n\2\2\u00f4\u00f7\5\"\22\2\u00f5\u00f7\5\16"+
		"\b\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8"+
		"\u00ef\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fb\u0102\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u0100\7\30\2\2\u00fe"+
		"\u0101\5\"\22\2\u00ff\u0101\5\16\b\2\u0100\u00fe\3\2\2\2\u0100\u00ff\3"+
		"\2\2\2\u0101\u0103\3\2\2\2\u0102\u00fd\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\'\3\2\2\2\u0104\u0107\7\26\2\2\u0105\u0108\5$\23\2\u0106\u0108\5\20\t"+
		"\2\u0107\u0105\3\2\2\2\u0107\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a"+
		"\7;\2\2\u010a\u010b\7m\2\2\u010b\u010c\5 \21\2\u010c\u010d\7n\2\2\u010d"+
		")\3\2\2\2\u010e\u010f\7;\2\2\u010f\u0110\7m\2\2\u0110\u0111\5 \21\2\u0111"+
		"\u0114\7n\2\2\u0112\u0115\5$\23\2\u0113\u0115\5\20\t\2\u0114\u0112\3\2"+
		"\2\2\u0114\u0113\3\2\2\2\u0115+\3\2\2\2\u0116\u0117\t\7\2\2\u0117-\3\2"+
		"\2\2\u0118\u0120\5\34\17\2\u0119\u0120\5 \21\2\u011a\u0120\5\62\32\2\u011b"+
		"\u0120\5J&\2\u011c\u0120\5L\'\2\u011d\u0120\5N(\2\u011e\u0120\5P)\2\u011f"+
		"\u0118\3\2\2\2\u011f\u0119\3\2\2\2\u011f\u011a\3\2\2\2\u011f\u011b\3\2"+
		"\2\2\u011f\u011c\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u011e\3\2\2\2\u0120"+
		"/\3\2\2\2\u0121\u0122\5\62\32\2\u0122\u0123\7i\2\2\u0123\61\3\2\2\2\u0124"+
		"\u0125\7<\2\2\u0125\u0128\5,\27\2\u0126\u0129\7<\2\2\u0127\u0129\5.\30"+
		"\2\u0128\u0126\3\2\2\2\u0128\u0127\3\2\2\2\u0129\u0135\3\2\2\2\u012a\u012d"+
		"\7<\2\2\u012b\u012c\7E\2\2\u012c\u012e\7<\2\2\u012d\u012b\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2"+
		"\2\2\u0131\u0133\5.\30\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0135\3\2\2\2\u0134\u0124\3\2\2\2\u0134\u012a\3\2\2\2\u0135\63\3\2\2"+
		"\2\u0136\u014a\5:\36\2\u0137\u0138\7\35\2\2\u0138\u013a\7m\2\2\u0139\u013b"+
		"\5\66\34\2\u013a\u0139\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2\2\2"+
		"\u013c\u013e\7i\2\2\u013d\u013f\5 \21\2\u013e\u013d\3\2\2\2\u013e\u013f"+
		"\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\7i\2\2\u0141\u0143\58\35\2\u0142"+
		"\u0141\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0147\7n"+
		"\2\2\u0145\u0148\5$\23\2\u0146\u0148\5\20\t\2\u0147\u0145\3\2\2\2\u0147"+
		"\u0146\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u0136\3\2\2\2\u0149\u0137\3\2"+
		"\2\2\u014a\65\3\2\2\2\u014b\u014e\5\f\7\2\u014c\u014d\7E\2\2\u014d\u014f"+
		"\7<\2\2\u014e\u014c\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u014e\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u0158\3\2\2\2\u0152\u0156\7E\2\2\u0153\u0157\5\26"+
		"\f\2\u0154\u0157\7@\2\2\u0155\u0157\7A\2\2\u0156\u0153\3\2\2\2\u0156\u0154"+
		"\3\2\2\2\u0156\u0155\3\2\2\2\u0157\u0159\3\2\2\2\u0158\u0152\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159\u0173\3\2\2\2\u015a\u015d\7<\2\2\u015b\u015c\7E\2"+
		"\2\u015c\u015e\7<\2\2\u015d\u015b\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u015d"+
		"\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0168\3\2\2\2\u0161\u0166\7E\2\2\u0162"+
		"\u0167\5\26\f\2\u0163\u0167\7@\2\2\u0164\u0167\7A\2\2\u0165\u0167\7<\2"+
		"\2\u0166\u0162\3\2\2\2\u0166\u0163\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0165"+
		"\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u0161\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"\u0173\3\2\2\2\u016a\u016b\5\f\7\2\u016b\u0170\7E\2\2\u016c\u0171\5\26"+
		"\f\2\u016d\u0171\7@\2\2\u016e\u0171\7A\2\2\u016f\u0171\7<\2\2\u0170\u016c"+
		"\3\2\2\2\u0170\u016d\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u016f\3\2\2\2\u0171"+
		"\u0173\3\2\2\2\u0172\u014b\3\2\2\2\u0172\u015a\3\2\2\2\u0172\u016a\3\2"+
		"\2\2\u0173\67\3\2\2\2\u0174\u0176\5\62\32\2\u0175\u0174\3\2\2\2\u0176"+
		"\u0177\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017d\3\2"+
		"\2\2\u0179\u017a\7j\2\2\u017a\u017c\5\62\32\2\u017b\u0179\3\2\2\2\u017c"+
		"\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e9\3\2\2\2"+
		"\u017f\u017d\3\2\2\2\u0180\u0181\7\35\2\2\u0181\u0182\7m\2\2\u0182\u0183"+
		"\5T+\2\u0183\u0184\7<\2\2\u0184\u0185\7D\2\2\u0185\u0186\7<\2\2\u0186"+
		"\u0189\7n\2\2\u0187\u018a\5\"\22\2\u0188\u018a\5\16\b\2\u0189\u0187\3"+
		"\2\2\2\u0189\u0188\3\2\2\2\u018a;\3\2\2\2\u018b\u018d\7,\2\2\u018c\u018e"+
		"\5.\30\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"\u0190\7i\2\2\u0190=\3\2\2\2\u0191\u0193\7\r\2\2\u0192\u0194\7<\2\2\u0193"+
		"\u0192\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\7i"+
		"\2\2\u0196?\3\2\2\2\u0197\u0199\7\24\2\2\u0198\u019a\7<\2\2\u0199\u0198"+
		"\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\7i\2\2\u019c"+
		"A\3\2\2\2\u019d\u019e\5R*\2\u019e\u01a3\7<\2\2\u019f\u01a0\7j\2\2\u01a0"+
		"\u01a2\5B\"\2\u01a1\u019f\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2"+
		"\2\2\u01a3\u01a4\3\2\2\2\u01a4C\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01a7"+
		"\t\b\2\2\u01a7E\3\2\2\2\u01a8\u01ac\t\t\2\2\u01a9\u01aa\5D#\2\u01aa\u01ab"+
		"\t\t\2\2\u01ab\u01ad\3\2\2\2\u01ac\u01a9\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae"+
		"\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01afG\3\2\2\2\u01b0\u01b1\7\60\2\2"+
		"\u01b1\u01b2\7<\2\2\u01b2\u01b3\7E\2\2\u01b3\u01b4\7B\2\2\u01b4I\3\2\2"+
		"\2\u01b5\u01b6\7O\2\2\u01b6\u01b7\7<\2\2\u01b7K\3\2\2\2\u01b8\u01b9\7"+
		"<\2\2\u01b9\u01ba\7O\2\2\u01baM\3\2\2\2\u01bb\u01bc\7P\2\2\u01bc\u01bd"+
		"\7<\2\2\u01bdO\3\2\2\2\u01be\u01bf\7<\2\2\u01bf\u01c0\7P\2\2\u01c0Q\3"+
		"\2\2\2\u01c1\u01ca\5T+\2\u01c2\u01c3\5T+\2\u01c3\u01c5\7q\2\2\u01c4\u01c6"+
		"\7=\2\2\u01c5\u01c4\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7"+
		"\u01c8\7r\2\2\u01c8\u01ca\3\2\2\2\u01c9\u01c1\3\2\2\2\u01c9\u01c2\3\2"+
		"\2\2\u01caS\3\2\2\2\u01cb\u01cc\t\n\2\2\u01ccU\3\2\2\28Y]`fks\u0081\u0086"+
		"\u008e\u0094\u009e\u00ac\u00ae\u00b9\u00c2\u00d0\u00d2\u00d9\u00e2\u00ed"+
		"\u00f6\u00fa\u0100\u0102\u0107\u0114\u011f\u0128\u012f\u0132\u0134\u013a"+
		"\u013e\u0142\u0147\u0149\u0150\u0156\u0158\u015f\u0166\u0168\u0170\u0172"+
		"\u0177\u017d\u0189\u018d\u0193\u0199\u01a3\u01ae\u01c5\u01c9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}