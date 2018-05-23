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
		T__0=1, WHITE_SPACES=2, LINE_COMMENT=3, NEW_LINE=4, COMMENTS_BLOCK=5, 
		UNTERMINATED_STRING=6, ADDITIONAL_LITERAL_AT=7, ADDITIONAL_LITERAL_ELLIPSIS=8, 
		KEYWORDS_ABSTRACT=9, KEYWORDS_ASSERT=10, KEYWORDS_BOOLEAN=11, KEYWORDS_BREAK=12, 
		KEYWORDS_BYTE=13, KEYWORDS_CASE=14, KEYWORDS_CATCH=15, KEYWORDS_CHAR=16, 
		KEYWORDS_CLASS=17, KEYWORDS_CONST=18, KEYWORDS_CONTINUE=19, KEYWORDS_DEFAULT=20, 
		KEYWORDS_DO=21, KEYWORDS_DOUBLE=22, KEYWORDS_ELSE=23, KEYWORDS_EXTENDS=24, 
		KEYWORDS_FINAL=25, KEYWORDS_FINALLY=26, KEYWORDS_FLOAT=27, KEYWORDS_FOR=28, 
		KEYWORDS_GOTO=29, KEYWORDS_IF=30, KEYWORDS_IMPLEMENTS=31, KEYWORDS_IMPORT=32, 
		KEYWORDS_INSTANCEOF=33, KEYWORDS_INT=34, KEYWORDS_INTERFACE=35, KEYWORDS_LONG=36, 
		KEYWORDS_NATIVE=37, KEYWORDS_NEW=38, KEYWORDS_PACKAGE=39, KEYWORDS_PRIVATE=40, 
		KEYWORDS_PROTECTED=41, KEYWORDS_PUBLIC=42, KEYWORDS_RETURN=43, KEYWORDS_SHORT=44, 
		KEYWORDS_STATIC=45, KEYWORDS_STRICTFP=46, KEYWORDS_SUPER=47, KEYWORDS_SYNCHRONIZED=48, 
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
		RULE_compilationUnit = 0, RULE_typeDeclaration = 1, RULE_classDeclaration = 2, 
		RULE_classPermissionModifier = 3, RULE_classTypeModifier = 4, RULE_classBody = 5, 
		RULE_classBodyDeclaration = 6, RULE_classMemberDeclaration = 7, RULE_methodDeclaraction = 8, 
		RULE_methodDeclarator = 9, RULE_methodPermissionModifier = 10, RULE_methodTypeModifier = 11, 
		RULE_methodReturnType = 12, RULE_variableDeclaration = 13, RULE_statementNoShortIf = 14, 
		RULE_forStatementNoShortIf = 15, RULE_basicForStatementNoShortIf = 16, 
		RULE_enhancedForStatementNoShortIf = 17, RULE_forStatement = 18, RULE_basicForStatement = 19, 
		RULE_statement = 20, RULE_statementWithoutTrailingSubStatement = 21, RULE_expressionStatement = 22, 
		RULE_classInstanceCreationExpression = 23, RULE_typeArgumentsOrDiamond = 24, 
		RULE_methodInvocation = 25, RULE_primary = 26, RULE_typeName = 27, RULE_argumentList = 28, 
		RULE_typeLiteralArguments = 29, RULE_expressionName = 30, RULE_switchStatement = 31, 
		RULE_switchLabel = 32, RULE_blockStatement = 33, RULE_localVariableDeclaration = 34, 
		RULE_variableDeclaratorList = 35, RULE_variableDeclarator = 36, RULE_variableDeclaratorId = 37, 
		RULE_variableInitializer = 38, RULE_arrayInitializer = 39, RULE_variableInitializerList = 40, 
		RULE_dims = 41, RULE_unannType = 42, RULE_unannPrimitiveType = 43, RULE_unannReferenceType = 44, 
		RULE_unannClassOrInterfaceType = 45, RULE_unannClassType_lfno_unannClassOrInterfaceType = 46, 
		RULE_unannInterfaceType_lfno_unannClassOrInterfaceType = 47, RULE_unannClassType_lf_unannClassOrInterfaceType = 48, 
		RULE_unannInterfaceType_lf_unannClassOrInterfaceType = 49, RULE_unannArrayType = 50, 
		RULE_loopStatement = 51, RULE_comparisonOperator = 52, RULE_number = 53, 
		RULE_numberEquivalent = 54, RULE_logicalConst = 55, RULE_logicalEquivalent = 56, 
		RULE_arithmeticExpression = 57, RULE_comparisonExpression = 58, RULE_logicalExpression = 59, 
		RULE_block = 60, RULE_loopBlock = 61, RULE_ifStatement = 62, RULE_doWhileStatement = 63, 
		RULE_whileDoStatement = 64, RULE_expression = 65, RULE_assignment = 66, 
		RULE_assignmentExpression = 67, RULE_assignmentOperator = 68, RULE_forInit = 69, 
		RULE_forUpdate = 70, RULE_enhancedForStatement = 71, RULE_returnStatement = 72, 
		RULE_breakStatement = 73, RULE_continueStatement = 74, RULE_parameterList = 75, 
		RULE_formalParameters = 76, RULE_lastFormalParameter = 77, RULE_formalParameter = 78, 
		RULE_receiverParameter = 79, RULE_operatorsBitwise = 80, RULE_expressionBitwise = 81, 
		RULE_preIncrementationExpression = 82, RULE_postIncrementationExpression = 83, 
		RULE_preDecrementationExpression = 84, RULE_postDecrementationExpression = 85, 
		RULE_variableType = 86, RULE_keywordsType = 87;
	public static final String[] ruleNames = {
		"compilationUnit", "typeDeclaration", "classDeclaration", "classPermissionModifier", 
		"classTypeModifier", "classBody", "classBodyDeclaration", "classMemberDeclaration", 
		"methodDeclaraction", "methodDeclarator", "methodPermissionModifier", 
		"methodTypeModifier", "methodReturnType", "variableDeclaration", "statementNoShortIf", 
		"forStatementNoShortIf", "basicForStatementNoShortIf", "enhancedForStatementNoShortIf", 
		"forStatement", "basicForStatement", "statement", "statementWithoutTrailingSubStatement", 
		"expressionStatement", "classInstanceCreationExpression", "typeArgumentsOrDiamond", 
		"methodInvocation", "primary", "typeName", "argumentList", "typeLiteralArguments", 
		"expressionName", "switchStatement", "switchLabel", "blockStatement", 
		"localVariableDeclaration", "variableDeclaratorList", "variableDeclarator", 
		"variableDeclaratorId", "variableInitializer", "arrayInitializer", "variableInitializerList", 
		"dims", "unannType", "unannPrimitiveType", "unannReferenceType", "unannClassOrInterfaceType", 
		"unannClassType_lfno_unannClassOrInterfaceType", "unannInterfaceType_lfno_unannClassOrInterfaceType", 
		"unannClassType_lf_unannClassOrInterfaceType", "unannInterfaceType_lf_unannClassOrInterfaceType", 
		"unannArrayType", "loopStatement", "comparisonOperator", "number", "numberEquivalent", 
		"logicalConst", "logicalEquivalent", "arithmeticExpression", "comparisonExpression", 
		"logicalExpression", "block", "loopBlock", "ifStatement", "doWhileStatement", 
		"whileDoStatement", "expression", "assignment", "assignmentExpression", 
		"assignmentOperator", "forInit", "forUpdate", "enhancedForStatement", 
		"returnStatement", "breakStatement", "continueStatement", "parameterList", 
		"formalParameters", "lastFormalParameter", "formalParameter", "receiverParameter", 
		"operatorsBitwise", "expressionBitwise", "preIncrementationExpression", 
		"postIncrementationExpression", "preDecrementationExpression", "postDecrementationExpression", 
		"variableType", "keywordsType"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\u000E'", null, null, null, null, null, "'@'", "'...'", "'abstract'", 
		"'assert'", "'boolean'", "'break'", "'byte'", "'case'", "'catch'", "'char'", 
		"'class'", "'const'", "'continue'", "'default'", "'do'", "'double'", "'else'", 
		"'extends'", "'final'", "'finally'", "'float'", "'for'", "'goto'", "'if'", 
		"'implements'", "'import'", "'instanceof'", "'int'", "'interface'", "'long'", 
		"'native'", "'new'", "'package'", "'private'", "'protected'", "'public'", 
		"'return'", "'short'", "'static'", "'strictfp'", "'super'", "'synchronized'", 
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
		null, null, "WHITE_SPACES", "LINE_COMMENT", "NEW_LINE", "COMMENTS_BLOCK", 
		"UNTERMINATED_STRING", "ADDITIONAL_LITERAL_AT", "ADDITIONAL_LITERAL_ELLIPSIS", 
		"KEYWORDS_ABSTRACT", "KEYWORDS_ASSERT", "KEYWORDS_BOOLEAN", "KEYWORDS_BREAK", 
		"KEYWORDS_BYTE", "KEYWORDS_CASE", "KEYWORDS_CATCH", "KEYWORDS_CHAR", "KEYWORDS_CLASS", 
		"KEYWORDS_CONST", "KEYWORDS_CONTINUE", "KEYWORDS_DEFAULT", "KEYWORDS_DO", 
		"KEYWORDS_DOUBLE", "KEYWORDS_ELSE", "KEYWORDS_EXTENDS", "KEYWORDS_FINAL", 
		"KEYWORDS_FINALLY", "KEYWORDS_FLOAT", "KEYWORDS_FOR", "KEYWORDS_GOTO", 
		"KEYWORDS_IF", "KEYWORDS_IMPLEMENTS", "KEYWORDS_IMPORT", "KEYWORDS_INSTANCEOF", 
		"KEYWORDS_INT", "KEYWORDS_INTERFACE", "KEYWORDS_LONG", "KEYWORDS_NATIVE", 
		"KEYWORDS_NEW", "KEYWORDS_PACKAGE", "KEYWORDS_PRIVATE", "KEYWORDS_PROTECTED", 
		"KEYWORDS_PUBLIC", "KEYWORDS_RETURN", "KEYWORDS_SHORT", "KEYWORDS_STATIC", 
		"KEYWORDS_STRICTFP", "KEYWORDS_SUPER", "KEYWORDS_SYNCHRONIZED", "KEYWORDS_SWITCH", 
		"KEYWORDS_THIS", "KEYWORDS_THROW", "KEYWORDS_THROWS", "KEYWORDS_TRANSIENT", 
		"KEYWORDS_TRY", "KEYWORDS_VOID", "KEYWORDS_VOLATILE", "KEYWORDS_WHILE", 
		"IDENTIFIERS", "LITERALS_NUMERIC_INT", "LITERALS_NUMERIC_DOUBLE", "LITERALS_LOGICAL_BOOLEAN", 
		"LITERALS_TEXTUAL_CHAR", "LITERALS_TEXTUAL_STRING", "LITERALS_REFERENCE_NULL", 
		"OPERATORS_IF", "OPERATORS_ELSE", "OPERATORS_ASSIGNMENT", "OPERATORS_GREATERTHAN", 
		"OPERATORS_LESSTHAN", "OPERATORS_LOGICALNOT", "OPERATORS_LESSTHANOREQUAL", 
		"OPERATORS_GREATERTHANOREQUAL", "OPERATORS_LOGICALEQUAL", "OPERATORS_LOGICALNOTEQUAL", 
		"OPERATORS_LOGICALAND", "OPERATORS_LOGICALOR", "OPERATORS_INCREMENT", 
		"OPERATORS_DECREMENT", "OPERATORS_ADDITION", "OPERATORS_SUBTRACTION", 
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
		public List<MethodDeclaractionContext> methodDeclaraction() {
			return getRuleContexts(MethodDeclaractionContext.class);
		}
		public MethodDeclaractionContext methodDeclaraction(int i) {
			return getRuleContext(MethodDeclaractionContext.class,i);
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
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORDS_ABSTRACT) | (1L << KEYWORDS_BOOLEAN) | (1L << KEYWORDS_BYTE) | (1L << KEYWORDS_CHAR) | (1L << KEYWORDS_DOUBLE) | (1L << KEYWORDS_FINAL) | (1L << KEYWORDS_FLOAT) | (1L << KEYWORDS_INT) | (1L << KEYWORDS_LONG) | (1L << KEYWORDS_NATIVE) | (1L << KEYWORDS_PRIVATE) | (1L << KEYWORDS_PROTECTED) | (1L << KEYWORDS_PUBLIC) | (1L << KEYWORDS_SHORT) | (1L << KEYWORDS_STATIC) | (1L << KEYWORDS_STRICTFP) | (1L << KEYWORDS_SYNCHRONIZED) | (1L << KEYWORDS_VOID) | (1L << IDENTIFIERS))) != 0)) {
				{
				{
				setState(176);
				methodDeclaraction();
				}
				}
				setState(181);
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TerminalNode SEPARATORS_PUNCTUATORS_SEMICOLON() { return getToken(JavaGrammarParser.SEPARATORS_PUNCTUATORS_SEMICOLON, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_typeDeclaration);
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORDS_ABSTRACT:
			case KEYWORDS_CLASS:
			case KEYWORDS_FINAL:
			case KEYWORDS_PROTECTED:
			case KEYWORDS_PUBLIC:
			case KEYWORDS_STATIC:
			case KEYWORDS_STRICTFP:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				classDeclaration();
				}
				break;
			case SEPARATORS_PUNCTUATORS_SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(SEPARATORS_PUNCTUATORS_SEMICOLON);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode KEYWORDS_CLASS() { return getToken(JavaGrammarParser.KEYWORDS_CLASS, 0); }
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassPermissionModifierContext classPermissionModifier() {
			return getRuleContext(ClassPermissionModifierContext.class,0);
		}
		public ClassTypeModifierContext classTypeModifier() {
			return getRuleContext(ClassTypeModifierContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(186);
				classPermissionModifier();
				}
				break;
			}
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(189);
				classTypeModifier();
				}
				break;
			}
			setState(192);
			match(KEYWORDS_CLASS);
			setState(193);
			match(IDENTIFIERS);
			setState(194);
			classBody();
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

	public static class ClassPermissionModifierContext extends ParserRuleContext {
		public TerminalNode KEYWORDS_PUBLIC() { return getToken(JavaGrammarParser.KEYWORDS_PUBLIC, 0); }
		public TerminalNode KEYWORDS_PROTECTED() { return getToken(JavaGrammarParser.KEYWORDS_PROTECTED, 0); }
		public ClassPermissionModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classPermissionModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterClassPermissionModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitClassPermissionModifier(this);
		}
	}

	public final ClassPermissionModifierContext classPermissionModifier() throws RecognitionException {
		ClassPermissionModifierContext _localctx = new ClassPermissionModifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classPermissionModifier);
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(KEYWORDS_PUBLIC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				match(KEYWORDS_PROTECTED);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(199);
				match(KEYWORDS_PUBLIC);
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

	public static class ClassTypeModifierContext extends ParserRuleContext {
		public TerminalNode KEYWORDS_ABSTRACT() { return getToken(JavaGrammarParser.KEYWORDS_ABSTRACT, 0); }
		public TerminalNode KEYWORDS_STATIC() { return getToken(JavaGrammarParser.KEYWORDS_STATIC, 0); }
		public TerminalNode KEYWORDS_FINAL() { return getToken(JavaGrammarParser.KEYWORDS_FINAL, 0); }
		public TerminalNode KEYWORDS_STRICTFP() { return getToken(JavaGrammarParser.KEYWORDS_STRICTFP, 0); }
		public ClassTypeModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classTypeModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterClassTypeModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitClassTypeModifier(this);
		}
	}

	public final ClassTypeModifierContext classTypeModifier() throws RecognitionException {
		ClassTypeModifierContext _localctx = new ClassTypeModifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classTypeModifier);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORDS_CLASS:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case KEYWORDS_ABSTRACT:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(KEYWORDS_ABSTRACT);
				}
				break;
			case KEYWORDS_STATIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				match(KEYWORDS_STATIC);
				}
				break;
			case KEYWORDS_FINAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				match(KEYWORDS_FINAL);
				}
				break;
			case KEYWORDS_STRICTFP:
				enterOuterAlt(_localctx, 5);
				{
				setState(206);
				match(KEYWORDS_STRICTFP);
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

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode SEPARATORS_DELIMITERS_LEFTCURLYBRACKET() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_LEFTCURLYBRACKET, 0); }
		public TerminalNode SEPARATORS_DELIMITERS_RIGHTCURLYBRACKET() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_RIGHTCURLYBRACKET, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(SEPARATORS_DELIMITERS_LEFTCURLYBRACKET);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(210);
				classBodyDeclaration();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
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

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitClassBodyDeclaration(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classBodyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(T__0);
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

	public static class ClassMemberDeclarationContext extends ParserRuleContext {
		public ClassMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterClassMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitClassMemberDeclaration(this);
		}
	}

	public final ClassMemberDeclarationContext classMemberDeclaration() throws RecognitionException {
		ClassMemberDeclarationContext _localctx = new ClassMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classMemberDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(T__0);
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

	public static class MethodDeclaractionContext extends ParserRuleContext {
		public MethodReturnTypeContext methodReturnType() {
			return getRuleContext(MethodReturnTypeContext.class,0);
		}
		public MethodDeclaratorContext methodDeclarator() {
			return getRuleContext(MethodDeclaratorContext.class,0);
		}
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
		public MethodDeclaractionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaraction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterMethodDeclaraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitMethodDeclaraction(this);
		}
	}

	public final MethodDeclaractionContext methodDeclaraction() throws RecognitionException {
		MethodDeclaractionContext _localctx = new MethodDeclaractionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_methodDeclaraction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORDS_PRIVATE) | (1L << KEYWORDS_PROTECTED) | (1L << KEYWORDS_PUBLIC))) != 0)) {
				{
				setState(222);
				methodPermissionModifier();
				}
			}

			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORDS_ABSTRACT) | (1L << KEYWORDS_FINAL) | (1L << KEYWORDS_NATIVE) | (1L << KEYWORDS_STATIC) | (1L << KEYWORDS_STRICTFP) | (1L << KEYWORDS_SYNCHRONIZED))) != 0)) {
				{
				setState(225);
				methodTypeModifier();
				}
			}

			setState(228);
			methodReturnType();
			setState(229);
			methodDeclarator();
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEPARATORS_DELIMITERS_LEFTCURLYBRACKET:
				{
				setState(230);
				block();
				}
				break;
			case SEPARATORS_PUNCTUATORS_SEMICOLON:
				{
				setState(231);
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

	public static class MethodDeclaratorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public TerminalNode SEPARATORS_DELIMITERS_LEFTPARENTHESIS() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_LEFTPARENTHESIS, 0); }
		public TerminalNode SEPARATORS_DELIMITERS_RIGHTPARENTHESIS() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_RIGHTPARENTHESIS, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public MethodDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterMethodDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitMethodDeclarator(this);
		}
	}

	public final MethodDeclaratorContext methodDeclarator() throws RecognitionException {
		MethodDeclaratorContext _localctx = new MethodDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_methodDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(IDENTIFIERS);
			setState(235);
			match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORDS_BOOLEAN) | (1L << KEYWORDS_BYTE) | (1L << KEYWORDS_CHAR) | (1L << KEYWORDS_DOUBLE) | (1L << KEYWORDS_FINAL) | (1L << KEYWORDS_FLOAT) | (1L << KEYWORDS_INT) | (1L << KEYWORDS_LONG) | (1L << KEYWORDS_SHORT) | (1L << IDENTIFIERS))) != 0)) {
				{
				setState(236);
				parameterList();
				}
			}

			setState(239);
			match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEPARATORS_DELIMITERS_LEFTSQUAREBRACKET) {
				{
				setState(240);
				dims();
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
		enterRule(_localctx, 20, RULE_methodPermissionModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
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
		enterRule(_localctx, 22, RULE_methodTypeModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
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
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
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
		enterRule(_localctx, 24, RULE_methodReturnType);
		try {
			setState(249);
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
			case IDENTIFIERS:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				unannType();
				}
				break;
			case KEYWORDS_VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
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
		enterRule(_localctx, 26, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			variableType();
			setState(252);
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

	public static class StatementNoShortIfContext extends ParserRuleContext {
		public StatementWithoutTrailingSubStatementContext statementWithoutTrailingSubStatement() {
			return getRuleContext(StatementWithoutTrailingSubStatementContext.class,0);
		}
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public TerminalNode OPERATORS_ELSE() { return getToken(JavaGrammarParser.OPERATORS_ELSE, 0); }
		public List<StatementNoShortIfContext> statementNoShortIf() {
			return getRuleContexts(StatementNoShortIfContext.class);
		}
		public StatementNoShortIfContext statementNoShortIf(int i) {
			return getRuleContext(StatementNoShortIfContext.class,i);
		}
		public TerminalNode KEYWORDS_IF() { return getToken(JavaGrammarParser.KEYWORDS_IF, 0); }
		public TerminalNode SEPARATORS_DELIMITERS_LEFTPARENTHESIS() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_LEFTPARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEPARATORS_DELIMITERS_RIGHTPARENTHESIS() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_RIGHTPARENTHESIS, 0); }
		public TerminalNode KEYWORDS_ELSE() { return getToken(JavaGrammarParser.KEYWORDS_ELSE, 0); }
		public TerminalNode KEYWORDS_WHILE() { return getToken(JavaGrammarParser.KEYWORDS_WHILE, 0); }
		public ForStatementNoShortIfContext forStatementNoShortIf() {
			return getRuleContext(ForStatementNoShortIfContext.class,0);
		}
		public StatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitStatementNoShortIf(this);
		}
	}

	public final StatementNoShortIfContext statementNoShortIf() throws RecognitionException {
		StatementNoShortIfContext _localctx = new StatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statementNoShortIf);
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				statementWithoutTrailingSubStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				match(IDENTIFIERS);
				setState(256);
				match(OPERATORS_ELSE);
				setState(257);
				statementNoShortIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				match(KEYWORDS_IF);
				setState(259);
				match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
				setState(260);
				expression();
				setState(261);
				match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
				setState(262);
				statementNoShortIf();
				setState(263);
				match(KEYWORDS_ELSE);
				setState(264);
				statementNoShortIf();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(266);
				match(KEYWORDS_WHILE);
				setState(267);
				match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
				setState(268);
				expression();
				setState(269);
				match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
				setState(270);
				statementNoShortIf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(272);
				forStatementNoShortIf();
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

	public static class ForStatementNoShortIfContext extends ParserRuleContext {
		public BasicForStatementNoShortIfContext basicForStatementNoShortIf() {
			return getRuleContext(BasicForStatementNoShortIfContext.class,0);
		}
		public EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf() {
			return getRuleContext(EnhancedForStatementNoShortIfContext.class,0);
		}
		public ForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitForStatementNoShortIf(this);
		}
	}

	public final ForStatementNoShortIfContext forStatementNoShortIf() throws RecognitionException {
		ForStatementNoShortIfContext _localctx = new ForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_forStatementNoShortIf);
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				basicForStatementNoShortIf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				enhancedForStatementNoShortIf();
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

	public static class BasicForStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode KEYWORDS_FOR() { return getToken(JavaGrammarParser.KEYWORDS_FOR, 0); }
		public TerminalNode SEPARATORS_DELIMITERS_LEFTPARENTHESIS() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_LEFTPARENTHESIS, 0); }
		public List<TerminalNode> SEPARATORS_PUNCTUATORS_SEMICOLON() { return getTokens(JavaGrammarParser.SEPARATORS_PUNCTUATORS_SEMICOLON); }
		public TerminalNode SEPARATORS_PUNCTUATORS_SEMICOLON(int i) {
			return getToken(JavaGrammarParser.SEPARATORS_PUNCTUATORS_SEMICOLON, i);
		}
		public TerminalNode SEPARATORS_DELIMITERS_RIGHTPARENTHESIS() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_RIGHTPARENTHESIS, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public BasicForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicForStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterBasicForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitBasicForStatementNoShortIf(this);
		}
	}

	public final BasicForStatementNoShortIfContext basicForStatementNoShortIf() throws RecognitionException {
		BasicForStatementNoShortIfContext _localctx = new BasicForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_basicForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(KEYWORDS_FOR);
			setState(280);
			match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORDS_BOOLEAN) | (1L << KEYWORDS_BYTE) | (1L << KEYWORDS_CHAR) | (1L << KEYWORDS_DOUBLE) | (1L << KEYWORDS_FLOAT) | (1L << KEYWORDS_INT) | (1L << KEYWORDS_LONG) | (1L << KEYWORDS_SHORT) | (1L << IDENTIFIERS))) != 0)) {
				{
				setState(281);
				forInit();
				}
			}

			setState(284);
			match(SEPARATORS_PUNCTUATORS_SEMICOLON);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IDENTIFIERS - 58)) | (1L << (LITERALS_NUMERIC_INT - 58)) | (1L << (LITERALS_NUMERIC_DOUBLE - 58)) | (1L << (LITERALS_LOGICAL_BOOLEAN - 58)) | (1L << (OPERATORS_INCREMENT - 58)) | (1L << (OPERATORS_DECREMENT - 58)) | (1L << (OPERATORS_SUBTRACTION - 58)) | (1L << (SEPARATORS_DELIMITERS_LEFTPARENTHESIS - 58)))) != 0)) {
				{
				setState(285);
				expression();
				}
			}

			setState(288);
			match(SEPARATORS_PUNCTUATORS_SEMICOLON);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIERS) {
				{
				setState(289);
				forUpdate();
				}
			}

			setState(292);
			match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
			setState(293);
			statementNoShortIf();
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

	public static class EnhancedForStatementNoShortIfContext extends ParserRuleContext {
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
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public EnhancedForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterEnhancedForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitEnhancedForStatementNoShortIf(this);
		}
	}

	public final EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf() throws RecognitionException {
		EnhancedForStatementNoShortIfContext _localctx = new EnhancedForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_enhancedForStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(KEYWORDS_FOR);
			setState(296);
			match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
			setState(297);
			keywordsType();
			setState(298);
			match(IDENTIFIERS);
			setState(299);
			match(OPERATORS_ELSE);
			setState(300);
			match(IDENTIFIERS);
			setState(301);
			match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(302);
				block();
				}
				break;
			case 2:
				{
				setState(303);
				statementNoShortIf();
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

	public static class ForStatementContext extends ParserRuleContext {
		public BasicForStatementContext basicForStatement() {
			return getRuleContext(BasicForStatementContext.class,0);
		}
		public EnhancedForStatementContext enhancedForStatement() {
			return getRuleContext(EnhancedForStatementContext.class,0);
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
		enterRule(_localctx, 36, RULE_forStatement);
		try {
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				basicForStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				enhancedForStatement();
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

	public static class BasicForStatementContext extends ParserRuleContext {
		public TerminalNode KEYWORDS_FOR() { return getToken(JavaGrammarParser.KEYWORDS_FOR, 0); }
		public TerminalNode SEPARATORS_DELIMITERS_LEFTPARENTHESIS() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_LEFTPARENTHESIS, 0); }
		public List<TerminalNode> SEPARATORS_PUNCTUATORS_SEMICOLON() { return getTokens(JavaGrammarParser.SEPARATORS_PUNCTUATORS_SEMICOLON); }
		public TerminalNode SEPARATORS_PUNCTUATORS_SEMICOLON(int i) {
			return getToken(JavaGrammarParser.SEPARATORS_PUNCTUATORS_SEMICOLON, i);
		}
		public TerminalNode SEPARATORS_DELIMITERS_RIGHTPARENTHESIS() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_RIGHTPARENTHESIS, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public BasicForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterBasicForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitBasicForStatement(this);
		}
	}

	public final BasicForStatementContext basicForStatement() throws RecognitionException {
		BasicForStatementContext _localctx = new BasicForStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_basicForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(KEYWORDS_FOR);
			setState(311);
			match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORDS_BOOLEAN) | (1L << KEYWORDS_BYTE) | (1L << KEYWORDS_CHAR) | (1L << KEYWORDS_DOUBLE) | (1L << KEYWORDS_FLOAT) | (1L << KEYWORDS_INT) | (1L << KEYWORDS_LONG) | (1L << KEYWORDS_SHORT) | (1L << IDENTIFIERS))) != 0)) {
				{
				setState(312);
				forInit();
				}
			}

			setState(315);
			match(SEPARATORS_PUNCTUATORS_SEMICOLON);
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IDENTIFIERS - 58)) | (1L << (LITERALS_NUMERIC_INT - 58)) | (1L << (LITERALS_NUMERIC_DOUBLE - 58)) | (1L << (LITERALS_LOGICAL_BOOLEAN - 58)) | (1L << (OPERATORS_INCREMENT - 58)) | (1L << (OPERATORS_DECREMENT - 58)) | (1L << (OPERATORS_SUBTRACTION - 58)) | (1L << (SEPARATORS_DELIMITERS_LEFTPARENTHESIS - 58)))) != 0)) {
				{
				setState(316);
				expression();
				}
			}

			setState(319);
			match(SEPARATORS_PUNCTUATORS_SEMICOLON);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIERS) {
				{
				setState(320);
				forUpdate();
				}
			}

			setState(323);
			match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
			setState(324);
			statement();
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
		public StatementWithoutTrailingSubStatementContext statementWithoutTrailingSubStatement() {
			return getRuleContext(StatementWithoutTrailingSubStatementContext.class,0);
		}
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public TerminalNode OPERATORS_ELSE() { return getToken(JavaGrammarParser.OPERATORS_ELSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode KEYWORDS_IF() { return getToken(JavaGrammarParser.KEYWORDS_IF, 0); }
		public TerminalNode SEPARATORS_DELIMITERS_LEFTPARENTHESIS() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_LEFTPARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEPARATORS_DELIMITERS_RIGHTPARENTHESIS() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_RIGHTPARENTHESIS, 0); }
		public TerminalNode KEYWORDS_ELSE() { return getToken(JavaGrammarParser.KEYWORDS_ELSE, 0); }
		public TerminalNode KEYWORDS_WHILE() { return getToken(JavaGrammarParser.KEYWORDS_WHILE, 0); }
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
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
		enterRule(_localctx, 40, RULE_statement);
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				statementWithoutTrailingSubStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				match(IDENTIFIERS);
				setState(328);
				match(OPERATORS_ELSE);
				setState(329);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(330);
				match(KEYWORDS_IF);
				setState(331);
				match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
				setState(332);
				expression();
				setState(333);
				match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
				setState(334);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(336);
				match(KEYWORDS_IF);
				setState(337);
				match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
				setState(338);
				expression();
				setState(339);
				match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
				setState(340);
				statement();
				setState(341);
				match(KEYWORDS_ELSE);
				setState(342);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(344);
				match(KEYWORDS_WHILE);
				setState(345);
				match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
				setState(346);
				expression();
				setState(347);
				match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
				setState(348);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(350);
				forStatement();
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

	public static class StatementWithoutTrailingSubStatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEPARATORS_PUNCTUATORS_SEMICOLON() { return getToken(JavaGrammarParser.SEPARATORS_PUNCTUATORS_SEMICOLON, 0); }
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public TerminalNode KEYWORDS_DO() { return getToken(JavaGrammarParser.KEYWORDS_DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode KEYWORDS_WHILE() { return getToken(JavaGrammarParser.KEYWORDS_WHILE, 0); }
		public TerminalNode SEPARATORS_DELIMITERS_LEFTPARENTHESIS() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_LEFTPARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEPARATORS_DELIMITERS_RIGHTPARENTHESIS() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_RIGHTPARENTHESIS, 0); }
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public TerminalNode KEYWORDS_SYNCHRONIZED() { return getToken(JavaGrammarParser.KEYWORDS_SYNCHRONIZED, 0); }
		public TerminalNode KEYWORDS_THROWS() { return getToken(JavaGrammarParser.KEYWORDS_THROWS, 0); }
		public StatementWithoutTrailingSubStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWithoutTrailingSubStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterStatementWithoutTrailingSubStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitStatementWithoutTrailingSubStatement(this);
		}
	}

	public final StatementWithoutTrailingSubStatementContext statementWithoutTrailingSubStatement() throws RecognitionException {
		StatementWithoutTrailingSubStatementContext _localctx = new StatementWithoutTrailingSubStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_statementWithoutTrailingSubStatement);
		try {
			setState(381);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEPARATORS_DELIMITERS_LEFTCURLYBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				block();
				}
				break;
			case SEPARATORS_PUNCTUATORS_SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				match(SEPARATORS_PUNCTUATORS_SEMICOLON);
				}
				break;
			case T__0:
			case KEYWORDS_NEW:
			case KEYWORDS_SUPER:
			case IDENTIFIERS:
			case OPERATORS_INCREMENT:
			case OPERATORS_DECREMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(355);
				expressionStatement();
				setState(356);
				match(SEPARATORS_PUNCTUATORS_SEMICOLON);
				}
				break;
			case KEYWORDS_SWITCH:
				enterOuterAlt(_localctx, 4);
				{
				setState(358);
				switchStatement();
				}
				break;
			case KEYWORDS_DO:
				enterOuterAlt(_localctx, 5);
				{
				setState(359);
				match(KEYWORDS_DO);
				setState(360);
				statement();
				setState(361);
				match(KEYWORDS_WHILE);
				setState(362);
				match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
				setState(363);
				expression();
				setState(364);
				match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
				setState(365);
				match(SEPARATORS_PUNCTUATORS_SEMICOLON);
				}
				break;
			case KEYWORDS_BREAK:
				enterOuterAlt(_localctx, 6);
				{
				setState(367);
				breakStatement();
				}
				break;
			case KEYWORDS_CONTINUE:
				enterOuterAlt(_localctx, 7);
				{
				setState(368);
				continueStatement();
				}
				break;
			case KEYWORDS_RETURN:
				enterOuterAlt(_localctx, 8);
				{
				setState(369);
				returnStatement();
				}
				break;
			case KEYWORDS_SYNCHRONIZED:
				enterOuterAlt(_localctx, 9);
				{
				setState(370);
				match(KEYWORDS_SYNCHRONIZED);
				setState(371);
				match(KEYWORDS_WHILE);
				setState(372);
				match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
				setState(373);
				expression();
				setState(374);
				match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
				setState(375);
				block();
				}
				break;
			case KEYWORDS_THROWS:
				enterOuterAlt(_localctx, 10);
				{
				setState(377);
				match(KEYWORDS_THROWS);
				setState(378);
				expression();
				setState(379);
				match(SEPARATORS_PUNCTUATORS_SEMICOLON);
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PreIncrementationExpressionContext preIncrementationExpression() {
			return getRuleContext(PreIncrementationExpressionContext.class,0);
		}
		public PreDecrementationExpressionContext preDecrementationExpression() {
			return getRuleContext(PreDecrementationExpressionContext.class,0);
		}
		public PostIncrementationExpressionContext postIncrementationExpression() {
			return getRuleContext(PostIncrementationExpressionContext.class,0);
		}
		public PostDecrementationExpressionContext postDecrementationExpression() {
			return getRuleContext(PostDecrementationExpressionContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expressionStatement);
		try {
			setState(390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				preIncrementationExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(385);
				preDecrementationExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(386);
				postIncrementationExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(387);
				postDecrementationExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(388);
				methodInvocation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(389);
				classInstanceCreationExpression();
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

	public static class ClassInstanceCreationExpressionContext extends ParserRuleContext {
		public TerminalNode KEYWORDS_NEW() { return getToken(JavaGrammarParser.KEYWORDS_NEW, 0); }
		public List<TerminalNode> IDENTIFIERS() { return getTokens(JavaGrammarParser.IDENTIFIERS); }
		public TerminalNode IDENTIFIERS(int i) {
			return getToken(JavaGrammarParser.IDENTIFIERS, i);
		}
		public TerminalNode SEPARATORS_DELIMITERS_LEFTPARENTHESIS() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_LEFTPARENTHESIS, 0); }
		public TerminalNode SEPARATORS_DELIMITERS_RIGHTPARENTHESIS() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_RIGHTPARENTHESIS, 0); }
		public List<TypeLiteralArgumentsContext> typeLiteralArguments() {
			return getRuleContexts(TypeLiteralArgumentsContext.class);
		}
		public TypeLiteralArgumentsContext typeLiteralArguments(int i) {
			return getRuleContext(TypeLiteralArgumentsContext.class,i);
		}
		public List<TerminalNode> SEPARATORS_PUNCTUATORS_DOT() { return getTokens(JavaGrammarParser.SEPARATORS_PUNCTUATORS_DOT); }
		public TerminalNode SEPARATORS_PUNCTUATORS_DOT(int i) {
			return getToken(JavaGrammarParser.SEPARATORS_PUNCTUATORS_DOT, i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ClassInstanceCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterClassInstanceCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitClassInstanceCreationExpression(this);
		}
	}

	public final ClassInstanceCreationExpressionContext classInstanceCreationExpression() throws RecognitionException {
		ClassInstanceCreationExpressionContext _localctx = new ClassInstanceCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_classInstanceCreationExpression);
		int _la;
		try {
			setState(451);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORDS_NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				match(KEYWORDS_NEW);
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPERATORS_LESSTHAN) {
					{
					setState(393);
					typeLiteralArguments();
					}
				}

				setState(396);
				match(IDENTIFIERS);
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEPARATORS_PUNCTUATORS_DOT) {
					{
					{
					setState(397);
					match(SEPARATORS_PUNCTUATORS_DOT);
					setState(398);
					match(IDENTIFIERS);
					}
					}
					setState(403);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPERATORS_LESSTHAN) {
					{
					setState(404);
					typeArgumentsOrDiamond();
					}
				}

				setState(407);
				match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IDENTIFIERS - 58)) | (1L << (LITERALS_NUMERIC_INT - 58)) | (1L << (LITERALS_NUMERIC_DOUBLE - 58)) | (1L << (LITERALS_LOGICAL_BOOLEAN - 58)) | (1L << (OPERATORS_INCREMENT - 58)) | (1L << (OPERATORS_DECREMENT - 58)) | (1L << (OPERATORS_SUBTRACTION - 58)) | (1L << (SEPARATORS_DELIMITERS_LEFTPARENTHESIS - 58)))) != 0)) {
					{
					setState(408);
					argumentList();
					}
				}

				setState(411);
				match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEPARATORS_DELIMITERS_LEFTCURLYBRACKET) {
					{
					setState(412);
					classBody();
					}
				}

				}
				break;
			case IDENTIFIERS:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				expressionName(0);
				setState(416);
				match(SEPARATORS_PUNCTUATORS_DOT);
				setState(417);
				match(KEYWORDS_NEW);
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPERATORS_LESSTHAN) {
					{
					setState(418);
					typeLiteralArguments();
					}
				}

				setState(421);
				match(IDENTIFIERS);
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPERATORS_LESSTHAN) {
					{
					setState(422);
					typeArgumentsOrDiamond();
					}
				}

				setState(425);
				match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPERATORS_LESSTHAN) {
					{
					setState(426);
					typeLiteralArguments();
					}
				}

				setState(429);
				match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEPARATORS_DELIMITERS_LEFTCURLYBRACKET) {
					{
					setState(430);
					classBody();
					}
				}

				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(433);
				primary();
				setState(434);
				match(SEPARATORS_PUNCTUATORS_DOT);
				setState(435);
				match(KEYWORDS_NEW);
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPERATORS_LESSTHAN) {
					{
					setState(436);
					typeLiteralArguments();
					}
				}

				setState(439);
				match(IDENTIFIERS);
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPERATORS_LESSTHAN) {
					{
					setState(440);
					typeArgumentsOrDiamond();
					}
				}

				setState(443);
				match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IDENTIFIERS - 58)) | (1L << (LITERALS_NUMERIC_INT - 58)) | (1L << (LITERALS_NUMERIC_DOUBLE - 58)) | (1L << (LITERALS_LOGICAL_BOOLEAN - 58)) | (1L << (OPERATORS_INCREMENT - 58)) | (1L << (OPERATORS_DECREMENT - 58)) | (1L << (OPERATORS_SUBTRACTION - 58)) | (1L << (SEPARATORS_DELIMITERS_LEFTPARENTHESIS - 58)))) != 0)) {
					{
					setState(444);
					argumentList();
					}
				}

				setState(447);
				match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEPARATORS_DELIMITERS_LEFTCURLYBRACKET) {
					{
					setState(448);
					classBody();
					}
				}

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

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TypeLiteralArgumentsContext typeLiteralArguments() {
			return getRuleContext(TypeLiteralArgumentsContext.class,0);
		}
		public TerminalNode OPERATORS_LESSTHAN() { return getToken(JavaGrammarParser.OPERATORS_LESSTHAN, 0); }
		public TerminalNode OPERATORS_GREATERTHAN() { return getToken(JavaGrammarParser.OPERATORS_GREATERTHAN, 0); }
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitTypeArgumentsOrDiamond(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_typeArgumentsOrDiamond);
		try {
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				typeLiteralArguments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				match(OPERATORS_LESSTHAN);
				setState(455);
				match(OPERATORS_GREATERTHAN);
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

	public static class MethodInvocationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public TerminalNode SEPARATORS_DELIMITERS_LEFTPARENTHESIS() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_LEFTPARENTHESIS, 0); }
		public TerminalNode SEPARATORS_DELIMITERS_RIGHTPARENTHESIS() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_RIGHTPARENTHESIS, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<TerminalNode> SEPARATORS_PUNCTUATORS_DOT() { return getTokens(JavaGrammarParser.SEPARATORS_PUNCTUATORS_DOT); }
		public TerminalNode SEPARATORS_PUNCTUATORS_DOT(int i) {
			return getToken(JavaGrammarParser.SEPARATORS_PUNCTUATORS_DOT, i);
		}
		public KeywordsTypeContext keywordsType() {
			return getRuleContext(KeywordsTypeContext.class,0);
		}
		public TypeLiteralArgumentsContext typeLiteralArguments() {
			return getRuleContext(TypeLiteralArgumentsContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode KEYWORDS_SUPER() { return getToken(JavaGrammarParser.KEYWORDS_SUPER, 0); }
		public MethodInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterMethodInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitMethodInvocation(this);
		}
	}

	public final MethodInvocationContext methodInvocation() throws RecognitionException {
		MethodInvocationContext _localctx = new MethodInvocationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_methodInvocation);
		int _la;
		try {
			setState(523);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				match(IDENTIFIERS);
				setState(459);
				match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IDENTIFIERS - 58)) | (1L << (LITERALS_NUMERIC_INT - 58)) | (1L << (LITERALS_NUMERIC_DOUBLE - 58)) | (1L << (LITERALS_LOGICAL_BOOLEAN - 58)) | (1L << (OPERATORS_INCREMENT - 58)) | (1L << (OPERATORS_DECREMENT - 58)) | (1L << (OPERATORS_SUBTRACTION - 58)) | (1L << (SEPARATORS_DELIMITERS_LEFTPARENTHESIS - 58)))) != 0)) {
					{
					setState(460);
					argumentList();
					}
				}

				setState(463);
				match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				typeName(0);
				setState(465);
				match(SEPARATORS_PUNCTUATORS_DOT);
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPERATORS_LESSTHAN) {
					{
					setState(466);
					typeLiteralArguments();
					}
				}

				setState(469);
				keywordsType();
				setState(470);
				match(IDENTIFIERS);
				setState(471);
				match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IDENTIFIERS - 58)) | (1L << (LITERALS_NUMERIC_INT - 58)) | (1L << (LITERALS_NUMERIC_DOUBLE - 58)) | (1L << (LITERALS_LOGICAL_BOOLEAN - 58)) | (1L << (OPERATORS_INCREMENT - 58)) | (1L << (OPERATORS_DECREMENT - 58)) | (1L << (OPERATORS_SUBTRACTION - 58)) | (1L << (SEPARATORS_DELIMITERS_LEFTPARENTHESIS - 58)))) != 0)) {
					{
					setState(472);
					argumentList();
					}
				}

				setState(475);
				match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(477);
				expressionName(0);
				setState(478);
				match(SEPARATORS_PUNCTUATORS_DOT);
				setState(479);
				match(IDENTIFIERS);
				setState(480);
				match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IDENTIFIERS - 58)) | (1L << (LITERALS_NUMERIC_INT - 58)) | (1L << (LITERALS_NUMERIC_DOUBLE - 58)) | (1L << (LITERALS_LOGICAL_BOOLEAN - 58)) | (1L << (OPERATORS_INCREMENT - 58)) | (1L << (OPERATORS_DECREMENT - 58)) | (1L << (OPERATORS_SUBTRACTION - 58)) | (1L << (SEPARATORS_DELIMITERS_LEFTPARENTHESIS - 58)))) != 0)) {
					{
					setState(481);
					argumentList();
					}
				}

				setState(484);
				match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(486);
				primary();
				setState(487);
				match(SEPARATORS_PUNCTUATORS_DOT);
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPERATORS_LESSTHAN) {
					{
					setState(488);
					typeLiteralArguments();
					}
				}

				setState(491);
				match(IDENTIFIERS);
				setState(492);
				match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IDENTIFIERS - 58)) | (1L << (LITERALS_NUMERIC_INT - 58)) | (1L << (LITERALS_NUMERIC_DOUBLE - 58)) | (1L << (LITERALS_LOGICAL_BOOLEAN - 58)) | (1L << (OPERATORS_INCREMENT - 58)) | (1L << (OPERATORS_DECREMENT - 58)) | (1L << (OPERATORS_SUBTRACTION - 58)) | (1L << (SEPARATORS_DELIMITERS_LEFTPARENTHESIS - 58)))) != 0)) {
					{
					setState(493);
					argumentList();
					}
				}

				setState(496);
				match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(498);
				match(KEYWORDS_SUPER);
				setState(499);
				match(SEPARATORS_PUNCTUATORS_DOT);
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPERATORS_LESSTHAN) {
					{
					setState(500);
					typeLiteralArguments();
					}
				}

				setState(503);
				match(IDENTIFIERS);
				setState(504);
				match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IDENTIFIERS - 58)) | (1L << (LITERALS_NUMERIC_INT - 58)) | (1L << (LITERALS_NUMERIC_DOUBLE - 58)) | (1L << (LITERALS_LOGICAL_BOOLEAN - 58)) | (1L << (OPERATORS_INCREMENT - 58)) | (1L << (OPERATORS_DECREMENT - 58)) | (1L << (OPERATORS_SUBTRACTION - 58)) | (1L << (SEPARATORS_DELIMITERS_LEFTPARENTHESIS - 58)))) != 0)) {
					{
					setState(505);
					argumentList();
					}
				}

				setState(508);
				match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(509);
				typeName(0);
				setState(510);
				match(SEPARATORS_PUNCTUATORS_DOT);
				setState(511);
				match(KEYWORDS_SUPER);
				setState(512);
				match(SEPARATORS_PUNCTUATORS_DOT);
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPERATORS_LESSTHAN) {
					{
					setState(513);
					typeLiteralArguments();
					}
				}

				setState(516);
				match(IDENTIFIERS);
				setState(517);
				match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IDENTIFIERS - 58)) | (1L << (LITERALS_NUMERIC_INT - 58)) | (1L << (LITERALS_NUMERIC_DOUBLE - 58)) | (1L << (LITERALS_LOGICAL_BOOLEAN - 58)) | (1L << (OPERATORS_INCREMENT - 58)) | (1L << (OPERATORS_DECREMENT - 58)) | (1L << (OPERATORS_SUBTRACTION - 58)) | (1L << (SEPARATORS_DELIMITERS_LEFTPARENTHESIS - 58)))) != 0)) {
					{
					setState(518);
					argumentList();
					}
				}

				setState(521);
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

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(T__0);
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

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode SEPARATORS_PUNCTUATORS_DOT() { return getToken(JavaGrammarParser.SEPARATORS_PUNCTUATORS_DOT, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		return typeName(0);
	}

	private TypeNameContext typeName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeNameContext _localctx = new TypeNameContext(_ctx, _parentState);
		TypeNameContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_typeName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(528);
			match(IDENTIFIERS);
			}
			_ctx.stop = _input.LT(-1);
			setState(535);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeName);
					setState(530);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(531);
					match(SEPARATORS_PUNCTUATORS_DOT);
					setState(532);
					match(IDENTIFIERS);
					}
					} 
				}
				setState(537);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SEPARATORS_PUNCTUATORS_COMMA() { return getTokens(JavaGrammarParser.SEPARATORS_PUNCTUATORS_COMMA); }
		public TerminalNode SEPARATORS_PUNCTUATORS_COMMA(int i) {
			return getToken(JavaGrammarParser.SEPARATORS_PUNCTUATORS_COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitArgumentList(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			expression();
			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARATORS_PUNCTUATORS_COMMA) {
				{
				{
				setState(539);
				match(SEPARATORS_PUNCTUATORS_COMMA);
				setState(540);
				expression();
				}
				}
				setState(545);
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

	public static class TypeLiteralArgumentsContext extends ParserRuleContext {
		public TerminalNode OPERATORS_LESSTHAN() { return getToken(JavaGrammarParser.OPERATORS_LESSTHAN, 0); }
		public KeywordsTypeContext keywordsType() {
			return getRuleContext(KeywordsTypeContext.class,0);
		}
		public TerminalNode OPERATORS_GREATERTHAN() { return getToken(JavaGrammarParser.OPERATORS_GREATERTHAN, 0); }
		public TypeLiteralArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeLiteralArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterTypeLiteralArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitTypeLiteralArguments(this);
		}
	}

	public final TypeLiteralArgumentsContext typeLiteralArguments() throws RecognitionException {
		TypeLiteralArgumentsContext _localctx = new TypeLiteralArgumentsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_typeLiteralArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			match(OPERATORS_LESSTHAN);
			setState(547);
			keywordsType();
			setState(548);
			match(OPERATORS_GREATERTHAN);
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

	public static class ExpressionNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode SEPARATORS_PUNCTUATORS_DOT() { return getToken(JavaGrammarParser.SEPARATORS_PUNCTUATORS_DOT, 0); }
		public ExpressionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterExpressionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitExpressionName(this);
		}
	}

	public final ExpressionNameContext expressionName() throws RecognitionException {
		return expressionName(0);
	}

	private ExpressionNameContext expressionName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionNameContext _localctx = new ExpressionNameContext(_ctx, _parentState);
		ExpressionNameContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_expressionName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(551);
			match(IDENTIFIERS);
			}
			_ctx.stop = _input.LT(-1);
			setState(558);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressionName);
					setState(553);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(554);
					match(SEPARATORS_PUNCTUATORS_DOT);
					setState(555);
					match(IDENTIFIERS);
					}
					} 
				}
				setState(560);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode KEYWORDS_SWITCH() { return getToken(JavaGrammarParser.KEYWORDS_SWITCH, 0); }
		public TerminalNode SEPARATORS_DELIMITERS_LEFTPARENTHESIS() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_LEFTPARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEPARATORS_DELIMITERS_RIGHTPARENTHESIS() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_RIGHTPARENTHESIS, 0); }
		public List<TerminalNode> SEPARATORS_DELIMITERS_LEFTCURLYBRACKET() { return getTokens(JavaGrammarParser.SEPARATORS_DELIMITERS_LEFTCURLYBRACKET); }
		public TerminalNode SEPARATORS_DELIMITERS_LEFTCURLYBRACKET(int i) {
			return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_LEFTCURLYBRACKET, i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitSwitchStatement(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_switchStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(KEYWORDS_SWITCH);
			setState(562);
			match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
			setState(563);
			expression();
			setState(564);
			match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
			setState(565);
			match(SEPARATORS_DELIMITERS_LEFTCURLYBRACKET);
			setState(576);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					{
					setState(566);
					switchLabel();
					setState(567);
					switchLabel();
					}
					setState(570); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(569);
							blockStatement();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(572); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(578);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KEYWORDS_CASE || _la==KEYWORDS_DEFAULT) {
				{
				{
				setState(579);
				switchLabel();
				}
				}
				setState(584);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(585);
			match(SEPARATORS_DELIMITERS_LEFTCURLYBRACKET);
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

	public static class SwitchLabelContext extends ParserRuleContext {
		public TerminalNode KEYWORDS_CASE() { return getToken(JavaGrammarParser.KEYWORDS_CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OPERATORS_ELSE() { return getToken(JavaGrammarParser.OPERATORS_ELSE, 0); }
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public TerminalNode KEYWORDS_DEFAULT() { return getToken(JavaGrammarParser.KEYWORDS_DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitSwitchLabel(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_switchLabel);
		try {
			setState(596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(587);
				match(KEYWORDS_CASE);
				setState(588);
				expression();
				setState(589);
				match(OPERATORS_ELSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(591);
				match(KEYWORDS_CASE);
				setState(592);
				match(IDENTIFIERS);
				setState(593);
				match(OPERATORS_ELSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(594);
				match(KEYWORDS_DEFAULT);
				setState(595);
				match(OPERATORS_ELSE);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEPARATORS_PUNCTUATORS_SEMICOLON() { return getToken(JavaGrammarParser.SEPARATORS_PUNCTUATORS_SEMICOLON, 0); }
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_blockStatement);
		try {
			setState(603);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(598);
				localVariableDeclaration();
				setState(599);
				match(SEPARATORS_PUNCTUATORS_SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(601);
				classDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(602);
				statement();
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

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public TerminalNode KEYWORDS_FINAL() { return getToken(JavaGrammarParser.KEYWORDS_FINAL, 0); }
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitLocalVariableDeclaration(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORDS_FINAL) {
				{
				setState(605);
				match(KEYWORDS_FINAL);
				}
			}

			setState(608);
			unannType();
			setState(609);
			variableDeclaratorList();
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

	public static class VariableDeclaratorListContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> SEPARATORS_PUNCTUATORS_COMMA() { return getTokens(JavaGrammarParser.SEPARATORS_PUNCTUATORS_COMMA); }
		public TerminalNode SEPARATORS_PUNCTUATORS_COMMA(int i) {
			return getToken(JavaGrammarParser.SEPARATORS_PUNCTUATORS_COMMA, i);
		}
		public VariableDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterVariableDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitVariableDeclaratorList(this);
		}
	}

	public final VariableDeclaratorListContext variableDeclaratorList() throws RecognitionException {
		VariableDeclaratorListContext _localctx = new VariableDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variableDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			variableDeclarator();
			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARATORS_PUNCTUATORS_COMMA) {
				{
				{
				setState(612);
				match(SEPARATORS_PUNCTUATORS_COMMA);
				setState(613);
				variableDeclarator();
				}
				}
				setState(618);
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode OPERATORS_ASSIGNMENT() { return getToken(JavaGrammarParser.OPERATORS_ASSIGNMENT, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			variableDeclaratorId();
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPERATORS_ASSIGNMENT) {
				{
				setState(620);
				match(OPERATORS_ASSIGNMENT);
				setState(621);
				variableInitializer();
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

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			match(IDENTIFIERS);
			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEPARATORS_DELIMITERS_LEFTSQUAREBRACKET) {
				{
				setState(625);
				dims();
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_variableInitializer);
		try {
			setState(630);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIERS:
			case LITERALS_NUMERIC_INT:
			case LITERALS_NUMERIC_DOUBLE:
			case LITERALS_LOGICAL_BOOLEAN:
			case OPERATORS_INCREMENT:
			case OPERATORS_DECREMENT:
			case OPERATORS_SUBTRACTION:
			case SEPARATORS_DELIMITERS_LEFTPARENTHESIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(628);
				expression();
				}
				break;
			case SEPARATORS_DELIMITERS_LEFTCURLYBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(629);
				arrayInitializer();
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode SEPARATORS_DELIMITERS_LEFTCURLYBRACKET() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_LEFTCURLYBRACKET, 0); }
		public TerminalNode SEPARATORS_DELIMITERS_RIGHTCURLYBRACKET() { return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_RIGHTCURLYBRACKET, 0); }
		public VariableInitializerListContext variableInitializerList() {
			return getRuleContext(VariableInitializerListContext.class,0);
		}
		public TerminalNode SEPARATORS_PUNCTUATORS_COMMA() { return getToken(JavaGrammarParser.SEPARATORS_PUNCTUATORS_COMMA, 0); }
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			match(SEPARATORS_DELIMITERS_LEFTCURLYBRACKET);
			setState(634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IDENTIFIERS - 58)) | (1L << (LITERALS_NUMERIC_INT - 58)) | (1L << (LITERALS_NUMERIC_DOUBLE - 58)) | (1L << (LITERALS_LOGICAL_BOOLEAN - 58)) | (1L << (OPERATORS_INCREMENT - 58)) | (1L << (OPERATORS_DECREMENT - 58)) | (1L << (OPERATORS_SUBTRACTION - 58)) | (1L << (SEPARATORS_DELIMITERS_LEFTPARENTHESIS - 58)) | (1L << (SEPARATORS_DELIMITERS_LEFTCURLYBRACKET - 58)))) != 0)) {
				{
				setState(633);
				variableInitializerList();
				}
			}

			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEPARATORS_PUNCTUATORS_COMMA) {
				{
				setState(636);
				match(SEPARATORS_PUNCTUATORS_COMMA);
				}
			}

			setState(639);
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

	public static class VariableInitializerListContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> SEPARATORS_PUNCTUATORS_COMMA() { return getTokens(JavaGrammarParser.SEPARATORS_PUNCTUATORS_COMMA); }
		public TerminalNode SEPARATORS_PUNCTUATORS_COMMA(int i) {
			return getToken(JavaGrammarParser.SEPARATORS_PUNCTUATORS_COMMA, i);
		}
		public VariableInitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterVariableInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitVariableInitializerList(this);
		}
	}

	public final VariableInitializerListContext variableInitializerList() throws RecognitionException {
		VariableInitializerListContext _localctx = new VariableInitializerListContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_variableInitializerList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			variableInitializer();
			setState(646);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(642);
					match(SEPARATORS_PUNCTUATORS_COMMA);
					setState(643);
					variableInitializer();
					}
					} 
				}
				setState(648);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
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

	public static class DimsContext extends ParserRuleContext {
		public List<TerminalNode> SEPARATORS_DELIMITERS_LEFTSQUAREBRACKET() { return getTokens(JavaGrammarParser.SEPARATORS_DELIMITERS_LEFTSQUAREBRACKET); }
		public TerminalNode SEPARATORS_DELIMITERS_LEFTSQUAREBRACKET(int i) {
			return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_LEFTSQUAREBRACKET, i);
		}
		public List<TerminalNode> SEPARATORS_DELIMITERS_RIGHTSQUAREBRACKET() { return getTokens(JavaGrammarParser.SEPARATORS_DELIMITERS_RIGHTSQUAREBRACKET); }
		public TerminalNode SEPARATORS_DELIMITERS_RIGHTSQUAREBRACKET(int i) {
			return getToken(JavaGrammarParser.SEPARATORS_DELIMITERS_RIGHTSQUAREBRACKET, i);
		}
		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterDims(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitDims(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_dims);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			match(SEPARATORS_DELIMITERS_LEFTSQUAREBRACKET);
			setState(650);
			match(SEPARATORS_DELIMITERS_RIGHTSQUAREBRACKET);
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARATORS_DELIMITERS_LEFTSQUAREBRACKET) {
				{
				{
				setState(651);
				match(SEPARATORS_DELIMITERS_LEFTSQUAREBRACKET);
				setState(652);
				match(SEPARATORS_DELIMITERS_RIGHTSQUAREBRACKET);
				}
				}
				setState(657);
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

	public static class UnannTypeContext extends ParserRuleContext {
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public UnannReferenceTypeContext unannReferenceType() {
			return getRuleContext(UnannReferenceTypeContext.class,0);
		}
		public UnannTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterUnannType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitUnannType(this);
		}
	}

	public final UnannTypeContext unannType() throws RecognitionException {
		UnannTypeContext _localctx = new UnannTypeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_unannType);
		try {
			setState(660);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(658);
				unannPrimitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(659);
				unannReferenceType();
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

	public static class UnannPrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode KEYWORDS_BYTE() { return getToken(JavaGrammarParser.KEYWORDS_BYTE, 0); }
		public TerminalNode KEYWORDS_SHORT() { return getToken(JavaGrammarParser.KEYWORDS_SHORT, 0); }
		public TerminalNode KEYWORDS_INT() { return getToken(JavaGrammarParser.KEYWORDS_INT, 0); }
		public TerminalNode KEYWORDS_LONG() { return getToken(JavaGrammarParser.KEYWORDS_LONG, 0); }
		public TerminalNode KEYWORDS_CHAR() { return getToken(JavaGrammarParser.KEYWORDS_CHAR, 0); }
		public TerminalNode KEYWORDS_FLOAT() { return getToken(JavaGrammarParser.KEYWORDS_FLOAT, 0); }
		public TerminalNode KEYWORDS_DOUBLE() { return getToken(JavaGrammarParser.KEYWORDS_DOUBLE, 0); }
		public TerminalNode KEYWORDS_BOOLEAN() { return getToken(JavaGrammarParser.KEYWORDS_BOOLEAN, 0); }
		public UnannPrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannPrimitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterUnannPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitUnannPrimitiveType(this);
		}
	}

	public final UnannPrimitiveTypeContext unannPrimitiveType() throws RecognitionException {
		UnannPrimitiveTypeContext _localctx = new UnannPrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_unannPrimitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORDS_BOOLEAN) | (1L << KEYWORDS_BYTE) | (1L << KEYWORDS_CHAR) | (1L << KEYWORDS_DOUBLE) | (1L << KEYWORDS_FLOAT) | (1L << KEYWORDS_INT) | (1L << KEYWORDS_LONG) | (1L << KEYWORDS_SHORT))) != 0)) ) {
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

	public static class UnannReferenceTypeContext extends ParserRuleContext {
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public UnannArrayTypeContext unannArrayType() {
			return getRuleContext(UnannArrayTypeContext.class,0);
		}
		public UnannReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannReferenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterUnannReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitUnannReferenceType(this);
		}
	}

	public final UnannReferenceTypeContext unannReferenceType() throws RecognitionException {
		UnannReferenceTypeContext _localctx = new UnannReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_unannReferenceType);
		try {
			setState(667);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(664);
				unannClassOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(665);
				match(IDENTIFIERS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(666);
				unannArrayType();
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

	public static class UnannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public List<UnannClassType_lf_unannClassOrInterfaceTypeContext> unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannClassType_lf_unannClassOrInterfaceTypeContext.class);
		}
		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType(int i) {
			return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class,i);
		}
		public List<UnannInterfaceType_lf_unannClassOrInterfaceTypeContext> unannInterfaceType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class);
		}
		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType(int i) {
			return getRuleContext(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class,i);
		}
		public UnannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterUnannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitUnannClassOrInterfaceType(this);
		}
	}

	public final UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() throws RecognitionException {
		UnannClassOrInterfaceTypeContext _localctx = new UnannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(669);
				unannClassType_lfno_unannClassOrInterfaceType();
				}
				break;
			case 2:
				{
				setState(670);
				unannInterfaceType_lfno_unannClassOrInterfaceType();
				}
				break;
			}
			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARATORS_PUNCTUATORS_DOT) {
				{
				setState(675);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(673);
					unannClassType_lf_unannClassOrInterfaceType();
					}
					break;
				case 2:
					{
					setState(674);
					unannInterfaceType_lf_unannClassOrInterfaceType();
					}
					break;
				}
				}
				setState(679);
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

	public static class UnannClassType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public TypeLiteralArgumentsContext typeLiteralArguments() {
			return getRuleContext(TypeLiteralArgumentsContext.class,0);
		}
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType_lfno_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterUnannClassType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitUnannClassType_lfno_unannClassOrInterfaceType(this);
		}
	}

	public final UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_unannClassType_lfno_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			match(IDENTIFIERS);
			setState(682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPERATORS_LESSTHAN) {
				{
				setState(681);
				typeLiteralArguments();
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

	public static class UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType_lfno_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
		}
	}

	public final UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_unannInterfaceType_lfno_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			unannClassType_lfno_unannClassOrInterfaceType();
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

	public static class UnannClassType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode SEPARATORS_PUNCTUATORS_DOT() { return getToken(JavaGrammarParser.SEPARATORS_PUNCTUATORS_DOT, 0); }
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public TypeLiteralArgumentsContext typeLiteralArguments() {
			return getRuleContext(TypeLiteralArgumentsContext.class,0);
		}
		public UnannClassType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType_lf_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterUnannClassType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitUnannClassType_lf_unannClassOrInterfaceType(this);
		}
	}

	public final UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lf_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_unannClassType_lf_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(SEPARATORS_PUNCTUATORS_DOT);
			setState(687);
			match(IDENTIFIERS);
			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPERATORS_LESSTHAN) {
				{
				setState(688);
				typeLiteralArguments();
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

	public static class UnannInterfaceType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType_lf_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterUnannInterfaceType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitUnannInterfaceType_lf_unannClassOrInterfaceType(this);
		}
	}

	public final UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType() throws RecognitionException {
		UnannInterfaceType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_unannInterfaceType_lf_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			unannClassType_lf_unannClassOrInterfaceType();
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

	public static class UnannArrayTypeContext extends ParserRuleContext {
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public UnannArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannArrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterUnannArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitUnannArrayType(this);
		}
	}

	public final UnannArrayTypeContext unannArrayType() throws RecognitionException {
		UnannArrayTypeContext _localctx = new UnannArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_unannArrayType);
		try {
			setState(701);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(693);
				unannPrimitiveType();
				setState(694);
				dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(696);
				unannClassOrInterfaceType();
				setState(697);
				dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(699);
				match(IDENTIFIERS);
				setState(700);
				dims();
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

	public static class LoopStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitLoopStatement(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_loopStatement);
		try {
			setState(706);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(703);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(704);
				breakStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(705);
				continueStatement();
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
		enterRule(_localctx, 104, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
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
		enterRule(_localctx, 106, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
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
		enterRule(_localctx, 108, RULE_numberEquivalent);
		try {
			setState(714);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERALS_NUMERIC_INT:
			case LITERALS_NUMERIC_DOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(712);
				number();
				}
				break;
			case IDENTIFIERS:
				enterOuterAlt(_localctx, 2);
				{
				setState(713);
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
		enterRule(_localctx, 110, RULE_logicalConst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
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
		enterRule(_localctx, 112, RULE_logicalEquivalent);
		try {
			setState(720);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERALS_LOGICAL_BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(718);
				logicalConst();
				}
				break;
			case IDENTIFIERS:
				enterOuterAlt(_localctx, 2);
				{
				setState(719);
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
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_arithmeticExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPERATORS_SUBTRACTION:
				{
				setState(723);
				match(OPERATORS_SUBTRACTION);
				setState(724);
				arithmeticExpression(7);
				}
				break;
			case SEPARATORS_DELIMITERS_LEFTPARENTHESIS:
				{
				setState(725);
				match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
				setState(726);
				arithmeticExpression(0);
				setState(727);
				match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
				}
				break;
			case IDENTIFIERS:
			case LITERALS_NUMERIC_INT:
			case LITERALS_NUMERIC_DOUBLE:
				{
				setState(729);
				numberEquivalent();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(746);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(744);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(732);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(733);
						match(OPERATORS_MULTIPLICATION);
						setState(734);
						arithmeticExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(735);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(736);
						match(OPERATORS_DIVISION);
						setState(737);
						arithmeticExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(738);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(739);
						match(OPERATORS_ADDITION);
						setState(740);
						arithmeticExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(741);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(742);
						match(OPERATORS_SUBTRACTION);
						setState(743);
						arithmeticExpression(4);
						}
						break;
					}
					} 
				}
				setState(748);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
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
		enterRule(_localctx, 116, RULE_comparisonExpression);
		try {
			setState(757);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(749);
				arithmeticExpression(0);
				setState(750);
				comparisonOperator();
				setState(751);
				arithmeticExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(753);
				match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
				setState(754);
				comparisonExpression();
				setState(755);
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
		int _startState = 118;
		enterRecursionRule(_localctx, 118, RULE_logicalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(760);
				comparisonExpression();
				}
				break;
			case 2:
				{
				setState(761);
				match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
				setState(762);
				logicalExpression(0);
				setState(763);
				match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
				}
				break;
			case 3:
				{
				setState(765);
				logicalEquivalent();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(782);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(780);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpression);
						setState(768);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(769);
						match(OPERATORS_LOGICALAND);
						setState(770);
						logicalExpression(8);
						}
						break;
					case 2:
						{
						_localctx = new LogicalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpression);
						setState(771);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(772);
						match(OPERATORS_LOGICALOR);
						setState(773);
						logicalExpression(7);
						}
						break;
					case 3:
						{
						_localctx = new LogicalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpression);
						setState(774);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(775);
						match(OPERATORS_BITWISEAND);
						setState(776);
						logicalExpression(6);
						}
						break;
					case 4:
						{
						_localctx = new LogicalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpression);
						setState(777);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(778);
						match(OPERATORS_BITWISEOR);
						setState(779);
						logicalExpression(5);
						}
						break;
					}
					} 
				}
				setState(784);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
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
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
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
		enterRule(_localctx, 120, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			match(SEPARATORS_DELIMITERS_LEFTCURLYBRACKET);
			setState(791);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << KEYWORDS_ABSTRACT) | (1L << KEYWORDS_BOOLEAN) | (1L << KEYWORDS_BREAK) | (1L << KEYWORDS_BYTE) | (1L << KEYWORDS_CHAR) | (1L << KEYWORDS_CLASS) | (1L << KEYWORDS_CONTINUE) | (1L << KEYWORDS_DO) | (1L << KEYWORDS_DOUBLE) | (1L << KEYWORDS_FINAL) | (1L << KEYWORDS_FLOAT) | (1L << KEYWORDS_FOR) | (1L << KEYWORDS_IF) | (1L << KEYWORDS_INT) | (1L << KEYWORDS_LONG) | (1L << KEYWORDS_NEW) | (1L << KEYWORDS_PROTECTED) | (1L << KEYWORDS_PUBLIC) | (1L << KEYWORDS_RETURN) | (1L << KEYWORDS_SHORT) | (1L << KEYWORDS_STATIC) | (1L << KEYWORDS_STRICTFP) | (1L << KEYWORDS_SUPER) | (1L << KEYWORDS_SYNCHRONIZED) | (1L << KEYWORDS_SWITCH) | (1L << KEYWORDS_THROWS) | (1L << KEYWORDS_WHILE) | (1L << IDENTIFIERS))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (OPERATORS_INCREMENT - 77)) | (1L << (OPERATORS_DECREMENT - 77)) | (1L << (SEPARATORS_PUNCTUATORS_SEMICOLON - 77)) | (1L << (SEPARATORS_DELIMITERS_LEFTCURLYBRACKET - 77)))) != 0)) {
				{
				setState(787); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(786);
					blockStatement();
					}
					}
					setState(789); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << KEYWORDS_ABSTRACT) | (1L << KEYWORDS_BOOLEAN) | (1L << KEYWORDS_BREAK) | (1L << KEYWORDS_BYTE) | (1L << KEYWORDS_CHAR) | (1L << KEYWORDS_CLASS) | (1L << KEYWORDS_CONTINUE) | (1L << KEYWORDS_DO) | (1L << KEYWORDS_DOUBLE) | (1L << KEYWORDS_FINAL) | (1L << KEYWORDS_FLOAT) | (1L << KEYWORDS_FOR) | (1L << KEYWORDS_IF) | (1L << KEYWORDS_INT) | (1L << KEYWORDS_LONG) | (1L << KEYWORDS_NEW) | (1L << KEYWORDS_PROTECTED) | (1L << KEYWORDS_PUBLIC) | (1L << KEYWORDS_RETURN) | (1L << KEYWORDS_SHORT) | (1L << KEYWORDS_STATIC) | (1L << KEYWORDS_STRICTFP) | (1L << KEYWORDS_SUPER) | (1L << KEYWORDS_SYNCHRONIZED) | (1L << KEYWORDS_SWITCH) | (1L << KEYWORDS_THROWS) | (1L << KEYWORDS_WHILE) | (1L << IDENTIFIERS))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (OPERATORS_INCREMENT - 77)) | (1L << (OPERATORS_DECREMENT - 77)) | (1L << (SEPARATORS_PUNCTUATORS_SEMICOLON - 77)) | (1L << (SEPARATORS_DELIMITERS_LEFTCURLYBRACKET - 77)))) != 0) );
				}
			}

			setState(793);
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
		public List<LoopStatementContext> loopStatement() {
			return getRuleContexts(LoopStatementContext.class);
		}
		public LoopStatementContext loopStatement(int i) {
			return getRuleContext(LoopStatementContext.class,i);
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
		enterRule(_localctx, 122, RULE_loopBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			match(SEPARATORS_DELIMITERS_LEFTCURLYBRACKET);
			setState(799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << KEYWORDS_BREAK) | (1L << KEYWORDS_CONTINUE) | (1L << KEYWORDS_DO) | (1L << KEYWORDS_FOR) | (1L << KEYWORDS_IF) | (1L << KEYWORDS_NEW) | (1L << KEYWORDS_RETURN) | (1L << KEYWORDS_SUPER) | (1L << KEYWORDS_SYNCHRONIZED) | (1L << KEYWORDS_SWITCH) | (1L << KEYWORDS_THROWS) | (1L << KEYWORDS_WHILE) | (1L << IDENTIFIERS))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (OPERATORS_INCREMENT - 77)) | (1L << (OPERATORS_DECREMENT - 77)) | (1L << (SEPARATORS_PUNCTUATORS_SEMICOLON - 77)) | (1L << (SEPARATORS_DELIMITERS_LEFTCURLYBRACKET - 77)))) != 0)) {
				{
				{
				setState(796);
				loopStatement();
				}
				}
				setState(801);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(802);
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
		enterRule(_localctx, 124, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			match(KEYWORDS_IF);
			setState(805);
			match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
			setState(806);
			logicalExpression(0);
			setState(807);
			match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
			setState(810);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(808);
				block();
				}
				break;
			case 2:
				{
				setState(809);
				statement();
				}
				break;
			}
			setState(823);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(812);
					match(KEYWORDS_ELSE);
					setState(813);
					match(KEYWORDS_IF);
					setState(814);
					match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
					setState(815);
					logicalExpression(0);
					setState(816);
					match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
					setState(819);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
					case 1:
						{
						setState(817);
						block();
						}
						break;
					case 2:
						{
						setState(818);
						statement();
						}
						break;
					}
					}
					} 
				}
				setState(825);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			}
			setState(831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORDS_ELSE) {
				{
				setState(826);
				match(KEYWORDS_ELSE);
				setState(829);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(827);
					block();
					}
					break;
				case 2:
					{
					setState(828);
					statement();
					}
					break;
				}
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
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
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
		enterRule(_localctx, 126, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			match(KEYWORDS_DO);
			setState(836);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(834);
				loopBlock();
				}
				break;
			case 2:
				{
				setState(835);
				loopStatement();
				}
				break;
			}
			setState(838);
			match(KEYWORDS_WHILE);
			setState(839);
			match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
			setState(840);
			logicalExpression(0);
			setState(841);
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
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
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
		enterRule(_localctx, 128, RULE_whileDoStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			match(KEYWORDS_WHILE);
			setState(844);
			match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
			setState(845);
			logicalExpression(0);
			setState(846);
			match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
			setState(849);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(847);
				loopBlock();
				}
				break;
			case 2:
				{
				setState(848);
				loopStatement();
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
		enterRule(_localctx, 130, RULE_expression);
		try {
			setState(858);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(851);
				arithmeticExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(852);
				logicalExpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(853);
				assignmentExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(854);
				preIncrementationExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(855);
				postIncrementationExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(856);
				preDecrementationExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(857);
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
		enterRule(_localctx, 132, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			assignmentExpression();
			setState(861);
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
		enterRule(_localctx, 134, RULE_assignmentExpression);
		int _la;
		try {
			setState(879);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(863);
				match(IDENTIFIERS);
				setState(864);
				assignmentOperator();
				setState(867);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(865);
					match(IDENTIFIERS);
					}
					break;
				case 2:
					{
					setState(866);
					expression();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(869);
				match(IDENTIFIERS);
				setState(872); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(870);
					match(OPERATORS_ASSIGNMENT);
					setState(871);
					match(IDENTIFIERS);
					}
					}
					setState(874); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OPERATORS_ASSIGNMENT );
				setState(877);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(876);
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
		enterRule(_localctx, 136, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
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
		enterRule(_localctx, 138, RULE_forInit);
		int _la;
		try {
			int _alt;
			setState(922);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(883);
				variableDeclaration();
				setState(886); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(884);
						match(OPERATORS_ASSIGNMENT);
						setState(885);
						match(IDENTIFIERS);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(888); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(896);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPERATORS_ASSIGNMENT) {
					{
					setState(890);
					match(OPERATORS_ASSIGNMENT);
					setState(894);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIERS:
					case LITERALS_NUMERIC_INT:
					case LITERALS_NUMERIC_DOUBLE:
						{
						setState(891);
						numberEquivalent();
						}
						break;
					case LITERALS_TEXTUAL_CHAR:
						{
						setState(892);
						match(LITERALS_TEXTUAL_CHAR);
						}
						break;
					case LITERALS_TEXTUAL_STRING:
						{
						setState(893);
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
				setState(898);
				match(IDENTIFIERS);
				setState(901); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(899);
						match(OPERATORS_ASSIGNMENT);
						setState(900);
						match(IDENTIFIERS);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(903); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(912);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPERATORS_ASSIGNMENT) {
					{
					setState(905);
					match(OPERATORS_ASSIGNMENT);
					setState(910);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
					case 1:
						{
						setState(906);
						numberEquivalent();
						}
						break;
					case 2:
						{
						setState(907);
						match(LITERALS_TEXTUAL_CHAR);
						}
						break;
					case 3:
						{
						setState(908);
						match(LITERALS_TEXTUAL_STRING);
						}
						break;
					case 4:
						{
						setState(909);
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
				setState(914);
				variableDeclaration();
				setState(915);
				match(OPERATORS_ASSIGNMENT);
				setState(920);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(916);
					numberEquivalent();
					}
					break;
				case 2:
					{
					setState(917);
					match(LITERALS_TEXTUAL_CHAR);
					}
					break;
				case 3:
					{
					setState(918);
					match(LITERALS_TEXTUAL_STRING);
					}
					break;
				case 4:
					{
					setState(919);
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
		enterRule(_localctx, 140, RULE_forUpdate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(925); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(924);
				assignmentExpression();
				}
				}
				setState(927); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIERS );
			setState(933);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARATORS_PUNCTUATORS_COMMA) {
				{
				{
				setState(929);
				match(SEPARATORS_PUNCTUATORS_COMMA);
				setState(930);
				assignmentExpression();
				}
				}
				setState(935);
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
		enterRule(_localctx, 142, RULE_enhancedForStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			match(KEYWORDS_FOR);
			setState(937);
			match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
			setState(938);
			keywordsType();
			setState(939);
			match(IDENTIFIERS);
			setState(940);
			match(OPERATORS_ELSE);
			setState(941);
			match(IDENTIFIERS);
			setState(942);
			match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
			setState(945);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(943);
				block();
				}
				break;
			case 2:
				{
				setState(944);
				statement();
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
		enterRule(_localctx, 144, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(947);
			match(KEYWORDS_RETURN);
			setState(949);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (IDENTIFIERS - 58)) | (1L << (LITERALS_NUMERIC_INT - 58)) | (1L << (LITERALS_NUMERIC_DOUBLE - 58)) | (1L << (LITERALS_LOGICAL_BOOLEAN - 58)) | (1L << (OPERATORS_INCREMENT - 58)) | (1L << (OPERATORS_DECREMENT - 58)) | (1L << (OPERATORS_SUBTRACTION - 58)) | (1L << (SEPARATORS_DELIMITERS_LEFTPARENTHESIS - 58)))) != 0)) {
				{
				setState(948);
				expression();
				}
			}

			setState(951);
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
		enterRule(_localctx, 146, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(953);
			match(KEYWORDS_BREAK);
			setState(955);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIERS) {
				{
				setState(954);
				match(IDENTIFIERS);
				}
			}

			setState(957);
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
		enterRule(_localctx, 148, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959);
			match(KEYWORDS_CONTINUE);
			setState(961);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIERS) {
				{
				setState(960);
				match(IDENTIFIERS);
				}
			}

			setState(963);
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
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode SEPARATORS_PUNCTUATORS_COMMA() { return getToken(JavaGrammarParser.SEPARATORS_PUNCTUATORS_COMMA, 0); }
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
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
		enterRule(_localctx, 150, RULE_parameterList);
		try {
			setState(971);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(965);
				receiverParameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(966);
				formalParameters();
				setState(967);
				match(SEPARATORS_PUNCTUATORS_COMMA);
				setState(968);
				lastFormalParameter();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(970);
				lastFormalParameter();
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

	public static class FormalParametersContext extends ParserRuleContext {
		public List<UnannTypeContext> unannType() {
			return getRuleContexts(UnannTypeContext.class);
		}
		public UnannTypeContext unannType(int i) {
			return getRuleContext(UnannTypeContext.class,i);
		}
		public List<VariableDeclaratorIdContext> variableDeclaratorId() {
			return getRuleContexts(VariableDeclaratorIdContext.class);
		}
		public VariableDeclaratorIdContext variableDeclaratorId(int i) {
			return getRuleContext(VariableDeclaratorIdContext.class,i);
		}
		public List<TerminalNode> KEYWORDS_FINAL() { return getTokens(JavaGrammarParser.KEYWORDS_FINAL); }
		public TerminalNode KEYWORDS_FINAL(int i) {
			return getToken(JavaGrammarParser.KEYWORDS_FINAL, i);
		}
		public List<TerminalNode> SEPARATORS_PUNCTUATORS_COMMA() { return getTokens(JavaGrammarParser.SEPARATORS_PUNCTUATORS_COMMA); }
		public TerminalNode SEPARATORS_PUNCTUATORS_COMMA(int i) {
			return getToken(JavaGrammarParser.SEPARATORS_PUNCTUATORS_COMMA, i);
		}
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_formalParameters);
		int _la;
		try {
			int _alt;
			setState(1004);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(976);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==KEYWORDS_FINAL) {
					{
					{
					setState(973);
					match(KEYWORDS_FINAL);
					}
					}
					setState(978);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(979);
				unannType();
				setState(980);
				variableDeclaratorId();
				setState(993);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(981);
						match(SEPARATORS_PUNCTUATORS_COMMA);
						setState(985);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==KEYWORDS_FINAL) {
							{
							{
							setState(982);
							match(KEYWORDS_FINAL);
							}
							}
							setState(987);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(988);
						unannType();
						setState(989);
						variableDeclaratorId();
						}
						} 
					}
					setState(995);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(996);
				receiverParameter();
				setState(1001);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(997);
						match(SEPARATORS_PUNCTUATORS_COMMA);
						setState(998);
						formalParameter();
						}
						} 
					}
					setState(1003);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
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

	public static class LastFormalParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<TerminalNode> KEYWORDS_FINAL() { return getTokens(JavaGrammarParser.KEYWORDS_FINAL); }
		public TerminalNode KEYWORDS_FINAL(int i) {
			return getToken(JavaGrammarParser.KEYWORDS_FINAL, i);
		}
		public FormalParameterContext formalParameter() {
			return getRuleContext(FormalParameterContext.class,0);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitLastFormalParameter(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_lastFormalParameter);
		int _la;
		try {
			setState(1017);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1009);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==KEYWORDS_FINAL) {
					{
					{
					setState(1006);
					match(KEYWORDS_FINAL);
					}
					}
					setState(1011);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1012);
				unannType();
				setState(1013);
				match(ADDITIONAL_LITERAL_ELLIPSIS);
				setState(1014);
				variableDeclaratorId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1016);
				formalParameter();
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

	public static class FormalParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<TerminalNode> KEYWORDS_FINAL() { return getTokens(JavaGrammarParser.KEYWORDS_FINAL); }
		public TerminalNode KEYWORDS_FINAL(int i) {
			return getToken(JavaGrammarParser.KEYWORDS_FINAL, i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1022);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KEYWORDS_FINAL) {
				{
				{
				setState(1019);
				match(KEYWORDS_FINAL);
				}
				}
				setState(1024);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1025);
			unannType();
			setState(1026);
			variableDeclaratorId();
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

	public static class ReceiverParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode KEYWORDS_THIS() { return getToken(JavaGrammarParser.KEYWORDS_THIS, 0); }
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public TerminalNode SEPARATORS_PUNCTUATORS_DOT() { return getToken(JavaGrammarParser.SEPARATORS_PUNCTUATORS_DOT, 0); }
		public ReceiverParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterReceiverParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitReceiverParameter(this);
		}
	}

	public final ReceiverParameterContext receiverParameter() throws RecognitionException {
		ReceiverParameterContext _localctx = new ReceiverParameterContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_receiverParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
			unannType();
			setState(1031);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIERS) {
				{
				setState(1029);
				match(IDENTIFIERS);
				setState(1030);
				match(SEPARATORS_PUNCTUATORS_DOT);
				}
			}

			setState(1033);
			match(KEYWORDS_THIS);
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
		enterRule(_localctx, 160, RULE_operatorsBitwise);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1035);
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
		enterRule(_localctx, 162, RULE_expressionBitwise);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1037);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIERS || _la==LITERALS_NUMERIC_INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1041); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1038);
				operatorsBitwise();
				setState(1039);
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
				setState(1043); 
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
		enterRule(_localctx, 164, RULE_preIncrementationExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1045);
			match(OPERATORS_INCREMENT);
			setState(1046);
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
		enterRule(_localctx, 166, RULE_postIncrementationExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			match(IDENTIFIERS);
			setState(1049);
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
		enterRule(_localctx, 168, RULE_preDecrementationExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			match(OPERATORS_DECREMENT);
			setState(1052);
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
		enterRule(_localctx, 170, RULE_postDecrementationExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
			match(IDENTIFIERS);
			setState(1055);
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
		enterRule(_localctx, 172, RULE_variableType);
		int _la;
		try {
			setState(1065);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1057);
				keywordsType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1058);
				keywordsType();
				setState(1059);
				match(SEPARATORS_DELIMITERS_LEFTSQUAREBRACKET);
				setState(1061);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LITERALS_NUMERIC_INT) {
					{
					setState(1060);
					match(LITERALS_NUMERIC_INT);
					}
				}

				setState(1063);
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
		enterRule(_localctx, 174, RULE_keywordsType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1067);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORDS_BOOLEAN) | (1L << KEYWORDS_BYTE) | (1L << KEYWORDS_CHAR) | (1L << KEYWORDS_DOUBLE) | (1L << KEYWORDS_FLOAT) | (1L << KEYWORDS_INT) | (1L << KEYWORDS_LONG) | (1L << KEYWORDS_SHORT))) != 0)) ) {
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
		case 27:
			return typeName_sempred((TypeNameContext)_localctx, predIndex);
		case 30:
			return expressionName_sempred((ExpressionNameContext)_localctx, predIndex);
		case 57:
			return arithmeticExpression_sempred((ArithmeticExpressionContext)_localctx, predIndex);
		case 59:
			return logicalExpression_sempred((LogicalExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean typeName_sempred(TypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expressionName_sempred(ExpressionNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean arithmeticExpression_sempred(ArithmeticExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean logicalExpression_sempred(LogicalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3u\u0430\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\3\2\7\2\u00b4\n\2\f\2\16\2\u00b7\13\2\3"+
		"\3\3\3\5\3\u00bb\n\3\3\4\5\4\u00be\n\4\3\4\5\4\u00c1\n\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\5\5\u00cb\n\5\3\6\3\6\3\6\3\6\3\6\5\6\u00d2\n\6\3\7"+
		"\3\7\7\7\u00d6\n\7\f\7\16\7\u00d9\13\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\5\n"+
		"\u00e2\n\n\3\n\5\n\u00e5\n\n\3\n\3\n\3\n\3\n\5\n\u00eb\n\n\3\13\3\13\3"+
		"\13\5\13\u00f0\n\13\3\13\3\13\5\13\u00f4\n\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\5\16\u00fc\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0114\n\20"+
		"\3\21\3\21\5\21\u0118\n\21\3\22\3\22\3\22\5\22\u011d\n\22\3\22\3\22\5"+
		"\22\u0121\n\22\3\22\3\22\5\22\u0125\n\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0133\n\23\3\24\3\24\5\24\u0137\n"+
		"\24\3\25\3\25\3\25\5\25\u013c\n\25\3\25\3\25\5\25\u0140\n\25\3\25\3\25"+
		"\5\25\u0144\n\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u0162\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0180\n\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u0189\n\30\3\31\3\31\5\31\u018d\n\31\3\31\3\31\3\31\7"+
		"\31\u0192\n\31\f\31\16\31\u0195\13\31\3\31\5\31\u0198\n\31\3\31\3\31\5"+
		"\31\u019c\n\31\3\31\3\31\5\31\u01a0\n\31\3\31\3\31\3\31\3\31\5\31\u01a6"+
		"\n\31\3\31\3\31\5\31\u01aa\n\31\3\31\3\31\5\31\u01ae\n\31\3\31\3\31\5"+
		"\31\u01b2\n\31\3\31\3\31\3\31\3\31\5\31\u01b8\n\31\3\31\3\31\5\31\u01bc"+
		"\n\31\3\31\3\31\5\31\u01c0\n\31\3\31\3\31\5\31\u01c4\n\31\5\31\u01c6\n"+
		"\31\3\32\3\32\3\32\5\32\u01cb\n\32\3\33\3\33\3\33\5\33\u01d0\n\33\3\33"+
		"\3\33\3\33\3\33\5\33\u01d6\n\33\3\33\3\33\3\33\3\33\5\33\u01dc\n\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u01e5\n\33\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u01ec\n\33\3\33\3\33\3\33\5\33\u01f1\n\33\3\33\3\33\3\33\3"+
		"\33\3\33\5\33\u01f8\n\33\3\33\3\33\3\33\5\33\u01fd\n\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u0205\n\33\3\33\3\33\3\33\5\33\u020a\n\33\3\33\3"+
		"\33\5\33\u020e\n\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0218"+
		"\n\35\f\35\16\35\u021b\13\35\3\36\3\36\3\36\7\36\u0220\n\36\f\36\16\36"+
		"\u0223\13\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \7 \u022f\n \f \16 "+
		"\u0232\13 \3!\3!\3!\3!\3!\3!\3!\3!\3!\6!\u023d\n!\r!\16!\u023e\7!\u0241"+
		"\n!\f!\16!\u0244\13!\3!\7!\u0247\n!\f!\16!\u024a\13!\3!\3!\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0257\n\"\3#\3#\3#\3#\3#\5#\u025e\n#\3$\5"+
		"$\u0261\n$\3$\3$\3$\3%\3%\3%\7%\u0269\n%\f%\16%\u026c\13%\3&\3&\3&\5&"+
		"\u0271\n&\3\'\3\'\5\'\u0275\n\'\3(\3(\5(\u0279\n(\3)\3)\5)\u027d\n)\3"+
		")\5)\u0280\n)\3)\3)\3*\3*\3*\7*\u0287\n*\f*\16*\u028a\13*\3+\3+\3+\3+"+
		"\7+\u0290\n+\f+\16+\u0293\13+\3,\3,\5,\u0297\n,\3-\3-\3.\3.\3.\5.\u029e"+
		"\n.\3/\3/\5/\u02a2\n/\3/\3/\7/\u02a6\n/\f/\16/\u02a9\13/\3\60\3\60\5\60"+
		"\u02ad\n\60\3\61\3\61\3\62\3\62\3\62\5\62\u02b4\n\62\3\63\3\63\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u02c0\n\64\3\65\3\65\3\65\5\65"+
		"\u02c5\n\65\3\66\3\66\3\67\3\67\38\38\58\u02cd\n8\39\39\3:\3:\5:\u02d3"+
		"\n:\3;\3;\3;\3;\3;\3;\3;\3;\5;\u02dd\n;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;"+
		"\3;\3;\7;\u02eb\n;\f;\16;\u02ee\13;\3<\3<\3<\3<\3<\3<\3<\3<\5<\u02f8\n"+
		"<\3=\3=\3=\3=\3=\3=\3=\5=\u0301\n=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\7=\u030f\n=\f=\16=\u0312\13=\3>\3>\6>\u0316\n>\r>\16>\u0317\5>\u031a"+
		"\n>\3>\3>\3?\3?\7?\u0320\n?\f?\16?\u0323\13?\3?\3?\3@\3@\3@\3@\3@\3@\5"+
		"@\u032d\n@\3@\3@\3@\3@\3@\3@\3@\5@\u0336\n@\7@\u0338\n@\f@\16@\u033b\13"+
		"@\3@\3@\3@\5@\u0340\n@\5@\u0342\n@\3A\3A\3A\5A\u0347\nA\3A\3A\3A\3A\3"+
		"A\3B\3B\3B\3B\3B\3B\5B\u0354\nB\3C\3C\3C\3C\3C\3C\3C\5C\u035d\nC\3D\3"+
		"D\3D\3E\3E\3E\3E\5E\u0366\nE\3E\3E\3E\6E\u036b\nE\rE\16E\u036c\3E\5E\u0370"+
		"\nE\5E\u0372\nE\3F\3F\3G\3G\3G\6G\u0379\nG\rG\16G\u037a\3G\3G\3G\3G\5"+
		"G\u0381\nG\5G\u0383\nG\3G\3G\3G\6G\u0388\nG\rG\16G\u0389\3G\3G\3G\3G\3"+
		"G\5G\u0391\nG\5G\u0393\nG\3G\3G\3G\3G\3G\3G\5G\u039b\nG\5G\u039d\nG\3"+
		"H\6H\u03a0\nH\rH\16H\u03a1\3H\3H\7H\u03a6\nH\fH\16H\u03a9\13H\3I\3I\3"+
		"I\3I\3I\3I\3I\3I\3I\5I\u03b4\nI\3J\3J\5J\u03b8\nJ\3J\3J\3K\3K\5K\u03be"+
		"\nK\3K\3K\3L\3L\5L\u03c4\nL\3L\3L\3M\3M\3M\3M\3M\3M\5M\u03ce\nM\3N\7N"+
		"\u03d1\nN\fN\16N\u03d4\13N\3N\3N\3N\3N\7N\u03da\nN\fN\16N\u03dd\13N\3"+
		"N\3N\3N\7N\u03e2\nN\fN\16N\u03e5\13N\3N\3N\3N\7N\u03ea\nN\fN\16N\u03ed"+
		"\13N\5N\u03ef\nN\3O\7O\u03f2\nO\fO\16O\u03f5\13O\3O\3O\3O\3O\3O\5O\u03fc"+
		"\nO\3P\7P\u03ff\nP\fP\16P\u0402\13P\3P\3P\3P\3Q\3Q\3Q\5Q\u040a\nQ\3Q\3"+
		"Q\3R\3R\3S\3S\3S\3S\6S\u0414\nS\rS\16S\u0415\3T\3T\3T\3U\3U\3U\3V\3V\3"+
		"V\3W\3W\3W\3X\3X\3X\3X\5X\u0428\nX\3X\3X\5X\u042c\nX\3Y\3Y\3Y\2\68>tx"+
		"Z\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\2\13\3\2*,\7\2\13\13\33\33\'\'/\60"+
		"\62\62\n\2\r\r\17\17\22\22\30\30\35\35$$&&..\4\2FGIK\3\2=>\3\2??\6\2E"+
		"EVZ`bfh\3\2\\h\3\2<=\2\u048d\2\u00b5\3\2\2\2\4\u00ba\3\2\2\2\6\u00bd\3"+
		"\2\2\2\b\u00ca\3\2\2\2\n\u00d1\3\2\2\2\f\u00d3\3\2\2\2\16\u00dc\3\2\2"+
		"\2\20\u00de\3\2\2\2\22\u00e1\3\2\2\2\24\u00ec\3\2\2\2\26\u00f5\3\2\2\2"+
		"\30\u00f7\3\2\2\2\32\u00fb\3\2\2\2\34\u00fd\3\2\2\2\36\u0113\3\2\2\2 "+
		"\u0117\3\2\2\2\"\u0119\3\2\2\2$\u0129\3\2\2\2&\u0136\3\2\2\2(\u0138\3"+
		"\2\2\2*\u0161\3\2\2\2,\u017f\3\2\2\2.\u0188\3\2\2\2\60\u01c5\3\2\2\2\62"+
		"\u01ca\3\2\2\2\64\u020d\3\2\2\2\66\u020f\3\2\2\28\u0211\3\2\2\2:\u021c"+
		"\3\2\2\2<\u0224\3\2\2\2>\u0228\3\2\2\2@\u0233\3\2\2\2B\u0256\3\2\2\2D"+
		"\u025d\3\2\2\2F\u0260\3\2\2\2H\u0265\3\2\2\2J\u026d\3\2\2\2L\u0272\3\2"+
		"\2\2N\u0278\3\2\2\2P\u027a\3\2\2\2R\u0283\3\2\2\2T\u028b\3\2\2\2V\u0296"+
		"\3\2\2\2X\u0298\3\2\2\2Z\u029d\3\2\2\2\\\u02a1\3\2\2\2^\u02aa\3\2\2\2"+
		"`\u02ae\3\2\2\2b\u02b0\3\2\2\2d\u02b5\3\2\2\2f\u02bf\3\2\2\2h\u02c4\3"+
		"\2\2\2j\u02c6\3\2\2\2l\u02c8\3\2\2\2n\u02cc\3\2\2\2p\u02ce\3\2\2\2r\u02d2"+
		"\3\2\2\2t\u02dc\3\2\2\2v\u02f7\3\2\2\2x\u0300\3\2\2\2z\u0313\3\2\2\2|"+
		"\u031d\3\2\2\2~\u0326\3\2\2\2\u0080\u0343\3\2\2\2\u0082\u034d\3\2\2\2"+
		"\u0084\u035c\3\2\2\2\u0086\u035e\3\2\2\2\u0088\u0371\3\2\2\2\u008a\u0373"+
		"\3\2\2\2\u008c\u039c\3\2\2\2\u008e\u039f\3\2\2\2\u0090\u03aa\3\2\2\2\u0092"+
		"\u03b5\3\2\2\2\u0094\u03bb\3\2\2\2\u0096\u03c1\3\2\2\2\u0098\u03cd\3\2"+
		"\2\2\u009a\u03ee\3\2\2\2\u009c\u03fb\3\2\2\2\u009e\u0400\3\2\2\2\u00a0"+
		"\u0406\3\2\2\2\u00a2\u040d\3\2\2\2\u00a4\u040f\3\2\2\2\u00a6\u0417\3\2"+
		"\2\2\u00a8\u041a\3\2\2\2\u00aa\u041d\3\2\2\2\u00ac\u0420\3\2\2\2\u00ae"+
		"\u042b\3\2\2\2\u00b0\u042d\3\2\2\2\u00b2\u00b4\5\22\n\2\u00b3\u00b2\3"+
		"\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\3\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\5\6\4\2\u00b9\u00bb\7i\2\2"+
		"\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\5\3\2\2\2\u00bc\u00be\5"+
		"\b\5\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf"+
		"\u00c1\5\n\6\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00c3\7\23\2\2\u00c3\u00c4\7<\2\2\u00c4\u00c5\5\f\7\2\u00c5"+
		"\7\3\2\2\2\u00c6\u00cb\3\2\2\2\u00c7\u00cb\7,\2\2\u00c8\u00cb\7+\2\2\u00c9"+
		"\u00cb\7,\2\2\u00ca\u00c6\3\2\2\2\u00ca\u00c7\3\2\2\2\u00ca\u00c8\3\2"+
		"\2\2\u00ca\u00c9\3\2\2\2\u00cb\t\3\2\2\2\u00cc\u00d2\3\2\2\2\u00cd\u00d2"+
		"\7\13\2\2\u00ce\u00d2\7/\2\2\u00cf\u00d2\7\33\2\2\u00d0\u00d2\7\60\2\2"+
		"\u00d1\u00cc\3\2\2\2\u00d1\u00cd\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d1\u00cf"+
		"\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\13\3\2\2\2\u00d3\u00d7\7o\2\2\u00d4"+
		"\u00d6\5\16\b\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3"+
		"\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da"+
		"\u00db\7p\2\2\u00db\r\3\2\2\2\u00dc\u00dd\7\3\2\2\u00dd\17\3\2\2\2\u00de"+
		"\u00df\7\3\2\2\u00df\21\3\2\2\2\u00e0\u00e2\5\26\f\2\u00e1\u00e0\3\2\2"+
		"\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e5\5\30\r\2\u00e4"+
		"\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\5\32"+
		"\16\2\u00e7\u00ea\5\24\13\2\u00e8\u00eb\5z>\2\u00e9\u00eb\7i\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\23\3\2\2\2\u00ec\u00ed\7<\2\2"+
		"\u00ed\u00ef\7m\2\2\u00ee\u00f0\5\u0098M\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0"+
		"\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\7n\2\2\u00f2\u00f4\5T+\2\u00f3"+
		"\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\25\3\2\2\2\u00f5\u00f6\t\2\2"+
		"\2\u00f6\27\3\2\2\2\u00f7\u00f8\t\3\2\2\u00f8\31\3\2\2\2\u00f9\u00fc\5"+
		"V,\2\u00fa\u00fc\79\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc"+
		"\33\3\2\2\2\u00fd\u00fe\5\u00aeX\2\u00fe\u00ff\7<\2\2\u00ff\35\3\2\2\2"+
		"\u0100\u0114\5,\27\2\u0101\u0102\7<\2\2\u0102\u0103\7D\2\2\u0103\u0114"+
		"\5\36\20\2\u0104\u0105\7 \2\2\u0105\u0106\7m\2\2\u0106\u0107\5\u0084C"+
		"\2\u0107\u0108\7n\2\2\u0108\u0109\5\36\20\2\u0109\u010a\7\31\2\2\u010a"+
		"\u010b\5\36\20\2\u010b\u0114\3\2\2\2\u010c\u010d\7;\2\2\u010d\u010e\7"+
		"m\2\2\u010e\u010f\5\u0084C\2\u010f\u0110\7n\2\2\u0110\u0111\5\36\20\2"+
		"\u0111\u0114\3\2\2\2\u0112\u0114\5 \21\2\u0113\u0100\3\2\2\2\u0113\u0101"+
		"\3\2\2\2\u0113\u0104\3\2\2\2\u0113\u010c\3\2\2\2\u0113\u0112\3\2\2\2\u0114"+
		"\37\3\2\2\2\u0115\u0118\5\"\22\2\u0116\u0118\5$\23\2\u0117\u0115\3\2\2"+
		"\2\u0117\u0116\3\2\2\2\u0118!\3\2\2\2\u0119\u011a\7\36\2\2\u011a\u011c"+
		"\7m\2\2\u011b\u011d\5\u008cG\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2"+
		"\u011d\u011e\3\2\2\2\u011e\u0120\7i\2\2\u011f\u0121\5\u0084C\2\u0120\u011f"+
		"\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\7i\2\2\u0123"+
		"\u0125\5\u008eH\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126"+
		"\3\2\2\2\u0126\u0127\7n\2\2\u0127\u0128\5\36\20\2\u0128#\3\2\2\2\u0129"+
		"\u012a\7\36\2\2\u012a\u012b\7m\2\2\u012b\u012c\5\u00b0Y\2\u012c\u012d"+
		"\7<\2\2\u012d\u012e\7D\2\2\u012e\u012f\7<\2\2\u012f\u0132\7n\2\2\u0130"+
		"\u0133\5z>\2\u0131\u0133\5\36\20\2\u0132\u0130\3\2\2\2\u0132\u0131\3\2"+
		"\2\2\u0133%\3\2\2\2\u0134\u0137\5(\25\2\u0135\u0137\5\u0090I\2\u0136\u0134"+
		"\3\2\2\2\u0136\u0135\3\2\2\2\u0137\'\3\2\2\2\u0138\u0139\7\36\2\2\u0139"+
		"\u013b\7m\2\2\u013a\u013c\5\u008cG\2\u013b\u013a\3\2\2\2\u013b\u013c\3"+
		"\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\7i\2\2\u013e\u0140\5\u0084C\2\u013f"+
		"\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\7i"+
		"\2\2\u0142\u0144\5\u008eH\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0146\7n\2\2\u0146\u0147\5*\26\2\u0147)\3\2\2\2\u0148"+
		"\u0162\5,\27\2\u0149\u014a\7<\2\2\u014a\u014b\7D\2\2\u014b\u0162\5*\26"+
		"\2\u014c\u014d\7 \2\2\u014d\u014e\7m\2\2\u014e\u014f\5\u0084C\2\u014f"+
		"\u0150\7n\2\2\u0150\u0151\5*\26\2\u0151\u0162\3\2\2\2\u0152\u0153\7 \2"+
		"\2\u0153\u0154\7m\2\2\u0154\u0155\5\u0084C\2\u0155\u0156\7n\2\2\u0156"+
		"\u0157\5*\26\2\u0157\u0158\7\31\2\2\u0158\u0159\5*\26\2\u0159\u0162\3"+
		"\2\2\2\u015a\u015b\7;\2\2\u015b\u015c\7m\2\2\u015c\u015d\5\u0084C\2\u015d"+
		"\u015e\7n\2\2\u015e\u015f\5*\26\2\u015f\u0162\3\2\2\2\u0160\u0162\5&\24"+
		"\2\u0161\u0148\3\2\2\2\u0161\u0149\3\2\2\2\u0161\u014c\3\2\2\2\u0161\u0152"+
		"\3\2\2\2\u0161\u015a\3\2\2\2\u0161\u0160\3\2\2\2\u0162+\3\2\2\2\u0163"+
		"\u0180\5z>\2\u0164\u0180\7i\2\2\u0165\u0166\5.\30\2\u0166\u0167\7i\2\2"+
		"\u0167\u0180\3\2\2\2\u0168\u0180\5@!\2\u0169\u016a\7\27\2\2\u016a\u016b"+
		"\5*\26\2\u016b\u016c\7;\2\2\u016c\u016d\7m\2\2\u016d\u016e\5\u0084C\2"+
		"\u016e\u016f\7n\2\2\u016f\u0170\7i\2\2\u0170\u0180\3\2\2\2\u0171\u0180"+
		"\5\u0094K\2\u0172\u0180\5\u0096L\2\u0173\u0180\5\u0092J\2\u0174\u0175"+
		"\7\62\2\2\u0175\u0176\7;\2\2\u0176\u0177\7m\2\2\u0177\u0178\5\u0084C\2"+
		"\u0178\u0179\7n\2\2\u0179\u017a\5z>\2\u017a\u0180\3\2\2\2\u017b\u017c"+
		"\7\66\2\2\u017c\u017d\5\u0084C\2\u017d\u017e\7i\2\2\u017e\u0180\3\2\2"+
		"\2\u017f\u0163\3\2\2\2\u017f\u0164\3\2\2\2\u017f\u0165\3\2\2\2\u017f\u0168"+
		"\3\2\2\2\u017f\u0169\3\2\2\2\u017f\u0171\3\2\2\2\u017f\u0172\3\2\2\2\u017f"+
		"\u0173\3\2\2\2\u017f\u0174\3\2\2\2\u017f\u017b\3\2\2\2\u0180-\3\2\2\2"+
		"\u0181\u0189\5\u0086D\2\u0182\u0189\5\u00a6T\2\u0183\u0189\5\u00aaV\2"+
		"\u0184\u0189\5\u00a8U\2\u0185\u0189\5\u00acW\2\u0186\u0189\5\64\33\2\u0187"+
		"\u0189\5\60\31\2\u0188\u0181\3\2\2\2\u0188\u0182\3\2\2\2\u0188\u0183\3"+
		"\2\2\2\u0188\u0184\3\2\2\2\u0188\u0185\3\2\2\2\u0188\u0186\3\2\2\2\u0188"+
		"\u0187\3\2\2\2\u0189/\3\2\2\2\u018a\u018c\7(\2\2\u018b\u018d\5<\37\2\u018c"+
		"\u018b\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0193\7<"+
		"\2\2\u018f\u0190\7k\2\2\u0190\u0192\7<\2\2\u0191\u018f\3\2\2\2\u0192\u0195"+
		"\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0197\3\2\2\2\u0195"+
		"\u0193\3\2\2\2\u0196\u0198\5\62\32\2\u0197\u0196\3\2\2\2\u0197\u0198\3"+
		"\2\2\2\u0198\u0199\3\2\2\2\u0199\u019b\7m\2\2\u019a\u019c\5:\36\2\u019b"+
		"\u019a\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019f\7n"+
		"\2\2\u019e\u01a0\5\f\7\2\u019f\u019e\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0"+
		"\u01c6\3\2\2\2\u01a1\u01a2\5> \2\u01a2\u01a3\7k\2\2\u01a3\u01a5\7(\2\2"+
		"\u01a4\u01a6\5<\37\2\u01a5\u01a4\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7"+
		"\3\2\2\2\u01a7\u01a9\7<\2\2\u01a8\u01aa\5\62\32\2\u01a9\u01a8\3\2\2\2"+
		"\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ad\7m\2\2\u01ac\u01ae"+
		"\5<\37\2\u01ad\u01ac\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\3\2\2\2\u01af"+
		"\u01b1\7n\2\2\u01b0\u01b2\5\f\7\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2\3\2"+
		"\2\2\u01b2\u01c6\3\2\2\2\u01b3\u01b4\5\66\34\2\u01b4\u01b5\7k\2\2\u01b5"+
		"\u01b7\7(\2\2\u01b6\u01b8\5<\37\2\u01b7\u01b6\3\2\2\2\u01b7\u01b8\3\2"+
		"\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bb\7<\2\2\u01ba\u01bc\5\62\32\2\u01bb"+
		"\u01ba\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bf\7m"+
		"\2\2\u01be\u01c0\5:\36\2\u01bf\u01be\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0"+
		"\u01c1\3\2\2\2\u01c1\u01c3\7n\2\2\u01c2\u01c4\5\f\7\2\u01c3\u01c2\3\2"+
		"\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c6\3\2\2\2\u01c5\u018a\3\2\2\2\u01c5"+
		"\u01a1\3\2\2\2\u01c5\u01b3\3\2\2\2\u01c6\61\3\2\2\2\u01c7\u01cb\5<\37"+
		"\2\u01c8\u01c9\7G\2\2\u01c9\u01cb\7F\2\2\u01ca\u01c7\3\2\2\2\u01ca\u01c8"+
		"\3\2\2\2\u01cb\63\3\2\2\2\u01cc\u01cd\7<\2\2\u01cd\u01cf\7m\2\2\u01ce"+
		"\u01d0\5:\36\2\u01cf\u01ce\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\3\2"+
		"\2\2\u01d1\u020e\7n\2\2\u01d2\u01d3\58\35\2\u01d3\u01d5\7k\2\2\u01d4\u01d6"+
		"\5<\37\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7"+
		"\u01d8\5\u00b0Y\2\u01d8\u01d9\7<\2\2\u01d9\u01db\7m\2\2\u01da\u01dc\5"+
		":\36\2\u01db\u01da\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd"+
		"\u01de\7n\2\2\u01de\u020e\3\2\2\2\u01df\u01e0\5> \2\u01e0\u01e1\7k\2\2"+
		"\u01e1\u01e2\7<\2\2\u01e2\u01e4\7m\2\2\u01e3\u01e5\5:\36\2\u01e4\u01e3"+
		"\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\7n\2\2\u01e7"+
		"\u020e\3\2\2\2\u01e8\u01e9\5\66\34\2\u01e9\u01eb\7k\2\2\u01ea\u01ec\5"+
		"<\37\2\u01eb\u01ea\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed"+
		"\u01ee\7<\2\2\u01ee\u01f0\7m\2\2\u01ef\u01f1\5:\36\2\u01f0\u01ef\3\2\2"+
		"\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\7n\2\2\u01f3\u020e"+
		"\3\2\2\2\u01f4\u01f5\7\61\2\2\u01f5\u01f7\7k\2\2\u01f6\u01f8\5<\37\2\u01f7"+
		"\u01f6\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa\7<"+
		"\2\2\u01fa\u01fc\7m\2\2\u01fb\u01fd\5:\36\2\u01fc\u01fb\3\2\2\2\u01fc"+
		"\u01fd\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u020e\7n\2\2\u01ff\u0200\58\35"+
		"\2\u0200\u0201\7k\2\2\u0201\u0202\7\61\2\2\u0202\u0204\7k\2\2\u0203\u0205"+
		"\5<\37\2\u0204\u0203\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206\3\2\2\2\u0206"+
		"\u0207\7<\2\2\u0207\u0209\7m\2\2\u0208\u020a\5:\36\2\u0209\u0208\3\2\2"+
		"\2\u0209\u020a\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\7n\2\2\u020c\u020e"+
		"\3\2\2\2\u020d\u01cc\3\2\2\2\u020d\u01d2\3\2\2\2\u020d\u01df\3\2\2\2\u020d"+
		"\u01e8\3\2\2\2\u020d\u01f4\3\2\2\2\u020d\u01ff\3\2\2\2\u020e\65\3\2\2"+
		"\2\u020f\u0210\7\3\2\2\u0210\67\3\2\2\2\u0211\u0212\b\35\1\2\u0212\u0213"+
		"\7<\2\2\u0213\u0219\3\2\2\2\u0214\u0215\f\3\2\2\u0215\u0216\7k\2\2\u0216"+
		"\u0218\7<\2\2\u0217\u0214\3\2\2\2\u0218\u021b\3\2\2\2\u0219\u0217\3\2"+
		"\2\2\u0219\u021a\3\2\2\2\u021a9\3\2\2\2\u021b\u0219\3\2\2\2\u021c\u0221"+
		"\5\u0084C\2\u021d\u021e\7j\2\2\u021e\u0220\5\u0084C\2\u021f\u021d\3\2"+
		"\2\2\u0220\u0223\3\2\2\2\u0221\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222"+
		";\3\2\2\2\u0223\u0221\3\2\2\2\u0224\u0225\7G\2\2\u0225\u0226\5\u00b0Y"+
		"\2\u0226\u0227\7F\2\2\u0227=\3\2\2\2\u0228\u0229\b \1\2\u0229\u022a\7"+
		"<\2\2\u022a\u0230\3\2\2\2\u022b\u022c\f\3\2\2\u022c\u022d\7k\2\2\u022d"+
		"\u022f\7<\2\2\u022e\u022b\3\2\2\2\u022f\u0232\3\2\2\2\u0230\u022e\3\2"+
		"\2\2\u0230\u0231\3\2\2\2\u0231?\3\2\2\2\u0232\u0230\3\2\2\2\u0233\u0234"+
		"\7\63\2\2\u0234\u0235\7m\2\2\u0235\u0236\5\u0084C\2\u0236\u0237\7n\2\2"+
		"\u0237\u0242\7o\2\2\u0238\u0239\5B\"\2\u0239\u023a\5B\"\2\u023a\u023c"+
		"\3\2\2\2\u023b\u023d\5D#\2\u023c\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e"+
		"\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0241\3\2\2\2\u0240\u0238\3\2"+
		"\2\2\u0241\u0244\3\2\2\2\u0242\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243"+
		"\u0248\3\2\2\2\u0244\u0242\3\2\2\2\u0245\u0247\5B\"\2\u0246\u0245\3\2"+
		"\2\2\u0247\u024a\3\2\2\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249"+
		"\u024b\3\2\2\2\u024a\u0248\3\2\2\2\u024b\u024c\7o\2\2\u024cA\3\2\2\2\u024d"+
		"\u024e\7\20\2\2\u024e\u024f\5\u0084C\2\u024f\u0250\7D\2\2\u0250\u0257"+
		"\3\2\2\2\u0251\u0252\7\20\2\2\u0252\u0253\7<\2\2\u0253\u0257\7D\2\2\u0254"+
		"\u0255\7\26\2\2\u0255\u0257\7D\2\2\u0256\u024d\3\2\2\2\u0256\u0251\3\2"+
		"\2\2\u0256\u0254\3\2\2\2\u0257C\3\2\2\2\u0258\u0259\5F$\2\u0259\u025a"+
		"\7i\2\2\u025a\u025e\3\2\2\2\u025b\u025e\5\6\4\2\u025c\u025e\5*\26\2\u025d"+
		"\u0258\3\2\2\2\u025d\u025b\3\2\2\2\u025d\u025c\3\2\2\2\u025eE\3\2\2\2"+
		"\u025f\u0261\7\33\2\2\u0260\u025f\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0262"+
		"\3\2\2\2\u0262\u0263\5V,\2\u0263\u0264\5H%\2\u0264G\3\2\2\2\u0265\u026a"+
		"\5J&\2\u0266\u0267\7j\2\2\u0267\u0269\5J&\2\u0268\u0266\3\2\2\2\u0269"+
		"\u026c\3\2\2\2\u026a\u0268\3\2\2\2\u026a\u026b\3\2\2\2\u026bI\3\2\2\2"+
		"\u026c\u026a\3\2\2\2\u026d\u0270\5L\'\2\u026e\u026f\7E\2\2\u026f\u0271"+
		"\5N(\2\u0270\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271K\3\2\2\2\u0272\u0274"+
		"\7<\2\2\u0273\u0275\5T+\2\u0274\u0273\3\2\2\2\u0274\u0275\3\2\2\2\u0275"+
		"M\3\2\2\2\u0276\u0279\5\u0084C\2\u0277\u0279\5P)\2\u0278\u0276\3\2\2\2"+
		"\u0278\u0277\3\2\2\2\u0279O\3\2\2\2\u027a\u027c\7o\2\2\u027b\u027d\5R"+
		"*\2\u027c\u027b\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027f\3\2\2\2\u027e"+
		"\u0280\7j\2\2\u027f\u027e\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0281\3\2"+
		"\2\2\u0281\u0282\7p\2\2\u0282Q\3\2\2\2\u0283\u0288\5N(\2\u0284\u0285\7"+
		"j\2\2\u0285\u0287\5N(\2\u0286\u0284\3\2\2\2\u0287\u028a\3\2\2\2\u0288"+
		"\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289S\3\2\2\2\u028a\u0288\3\2\2\2"+
		"\u028b\u028c\7q\2\2\u028c\u0291\7r\2\2\u028d\u028e\7q\2\2\u028e\u0290"+
		"\7r\2\2\u028f\u028d\3\2\2\2\u0290\u0293\3\2\2\2\u0291\u028f\3\2\2\2\u0291"+
		"\u0292\3\2\2\2\u0292U\3\2\2\2\u0293\u0291\3\2\2\2\u0294\u0297\5X-\2\u0295"+
		"\u0297\5Z.\2\u0296\u0294\3\2\2\2\u0296\u0295\3\2\2\2\u0297W\3\2\2\2\u0298"+
		"\u0299\t\4\2\2\u0299Y\3\2\2\2\u029a\u029e\5\\/\2\u029b\u029e\7<\2\2\u029c"+
		"\u029e\5f\64\2\u029d\u029a\3\2\2\2\u029d\u029b\3\2\2\2\u029d\u029c\3\2"+
		"\2\2\u029e[\3\2\2\2\u029f\u02a2\5^\60\2\u02a0\u02a2\5`\61\2\u02a1\u029f"+
		"\3\2\2\2\u02a1\u02a0\3\2\2\2\u02a2\u02a7\3\2\2\2\u02a3\u02a6\5b\62\2\u02a4"+
		"\u02a6\5d\63\2\u02a5\u02a3\3\2\2\2\u02a5\u02a4\3\2\2\2\u02a6\u02a9\3\2"+
		"\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8]\3\2\2\2\u02a9\u02a7"+
		"\3\2\2\2\u02aa\u02ac\7<\2\2\u02ab\u02ad\5<\37\2\u02ac\u02ab\3\2\2\2\u02ac"+
		"\u02ad\3\2\2\2\u02ad_\3\2\2\2\u02ae\u02af\5^\60\2\u02afa\3\2\2\2\u02b0"+
		"\u02b1\7k\2\2\u02b1\u02b3\7<\2\2\u02b2\u02b4\5<\37\2\u02b3\u02b2\3\2\2"+
		"\2\u02b3\u02b4\3\2\2\2\u02b4c\3\2\2\2\u02b5\u02b6\5b\62\2\u02b6e\3\2\2"+
		"\2\u02b7\u02b8\5X-\2\u02b8\u02b9\5T+\2\u02b9\u02c0\3\2\2\2\u02ba\u02bb"+
		"\5\\/\2\u02bb\u02bc\5T+\2\u02bc\u02c0\3\2\2\2\u02bd\u02be\7<\2\2\u02be"+
		"\u02c0\5T+\2\u02bf\u02b7\3\2\2\2\u02bf\u02ba\3\2\2\2\u02bf\u02bd\3\2\2"+
		"\2\u02c0g\3\2\2\2\u02c1\u02c5\5*\26\2\u02c2\u02c5\5\u0094K\2\u02c3\u02c5"+
		"\5\u0096L\2\u02c4\u02c1\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c4\u02c3\3\2\2"+
		"\2\u02c5i\3\2\2\2\u02c6\u02c7\t\5\2\2\u02c7k\3\2\2\2\u02c8\u02c9\t\6\2"+
		"\2\u02c9m\3\2\2\2\u02ca\u02cd\5l\67\2\u02cb\u02cd\7<\2\2\u02cc\u02ca\3"+
		"\2\2\2\u02cc\u02cb\3\2\2\2\u02cdo\3\2\2\2\u02ce\u02cf\t\7\2\2\u02cfq\3"+
		"\2\2\2\u02d0\u02d3\5p9\2\u02d1\u02d3\7<\2\2\u02d2\u02d0\3\2\2\2\u02d2"+
		"\u02d1\3\2\2\2\u02d3s\3\2\2\2\u02d4\u02d5\b;\1\2\u02d5\u02d6\7R\2\2\u02d6"+
		"\u02dd\5t;\t\u02d7\u02d8\7m\2\2\u02d8\u02d9\5t;\2\u02d9\u02da\7n\2\2\u02da"+
		"\u02dd\3\2\2\2\u02db\u02dd\5n8\2\u02dc\u02d4\3\2\2\2\u02dc\u02d7\3\2\2"+
		"\2\u02dc\u02db\3\2\2\2\u02dd\u02ec\3\2\2\2\u02de\u02df\f\b\2\2\u02df\u02e0"+
		"\7S\2\2\u02e0\u02eb\5t;\t\u02e1\u02e2\f\7\2\2\u02e2\u02e3\7T\2\2\u02e3"+
		"\u02eb\5t;\b\u02e4\u02e5\f\6\2\2\u02e5\u02e6\7Q\2\2\u02e6\u02eb\5t;\7"+
		"\u02e7\u02e8\f\5\2\2\u02e8\u02e9\7R\2\2\u02e9\u02eb\5t;\6\u02ea\u02de"+
		"\3\2\2\2\u02ea\u02e1\3\2\2\2\u02ea\u02e4\3\2\2\2\u02ea\u02e7\3\2\2\2\u02eb"+
		"\u02ee\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ec\u02ed\3\2\2\2\u02edu\3\2\2\2"+
		"\u02ee\u02ec\3\2\2\2\u02ef\u02f0\5t;\2\u02f0\u02f1\5j\66\2\u02f1\u02f2"+
		"\5t;\2\u02f2\u02f8\3\2\2\2\u02f3\u02f4\7m\2\2\u02f4\u02f5\5v<\2\u02f5"+
		"\u02f6\7n\2\2\u02f6\u02f8\3\2\2\2\u02f7\u02ef\3\2\2\2\u02f7\u02f3\3\2"+
		"\2\2\u02f8w\3\2\2\2\u02f9\u02fa\b=\1\2\u02fa\u0301\5v<\2\u02fb\u02fc\7"+
		"m\2\2\u02fc\u02fd\5x=\2\u02fd\u02fe\7n\2\2\u02fe\u0301\3\2\2\2\u02ff\u0301"+
		"\5r:\2\u0300\u02f9\3\2\2\2\u0300\u02fb\3\2\2\2\u0300\u02ff\3\2\2\2\u0301"+
		"\u0310\3\2\2\2\u0302\u0303\f\t\2\2\u0303\u0304\7M\2\2\u0304\u030f\5x="+
		"\n\u0305\u0306\f\b\2\2\u0306\u0307\7N\2\2\u0307\u030f\5x=\t\u0308\u0309"+
		"\f\7\2\2\u0309\u030a\7]\2\2\u030a\u030f\5x=\b\u030b\u030c\f\6\2\2\u030c"+
		"\u030d\7^\2\2\u030d\u030f\5x=\7\u030e\u0302\3\2\2\2\u030e\u0305\3\2\2"+
		"\2\u030e\u0308\3\2\2\2\u030e\u030b\3\2\2\2\u030f\u0312\3\2\2\2\u0310\u030e"+
		"\3\2\2\2\u0310\u0311\3\2\2\2\u0311y\3\2\2\2\u0312\u0310\3\2\2\2\u0313"+
		"\u0319\7o\2\2\u0314\u0316\5D#\2\u0315\u0314\3\2\2\2\u0316\u0317\3\2\2"+
		"\2\u0317\u0315\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u031a\3\2\2\2\u0319\u0315"+
		"\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031c\7p\2\2\u031c"+
		"{\3\2\2\2\u031d\u0321\7o\2\2\u031e\u0320\5h\65\2\u031f\u031e\3\2\2\2\u0320"+
		"\u0323\3\2\2\2\u0321\u031f\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0324\3\2"+
		"\2\2\u0323\u0321\3\2\2\2\u0324\u0325\7p\2\2\u0325}\3\2\2\2\u0326\u0327"+
		"\7 \2\2\u0327\u0328\7m\2\2\u0328\u0329\5x=\2\u0329\u032c\7n\2\2\u032a"+
		"\u032d\5z>\2\u032b\u032d\5*\26\2\u032c\u032a\3\2\2\2\u032c\u032b\3\2\2"+
		"\2\u032d\u0339\3\2\2\2\u032e\u032f\7\31\2\2\u032f\u0330\7 \2\2\u0330\u0331"+
		"\7m\2\2\u0331\u0332\5x=\2\u0332\u0335\7n\2\2\u0333\u0336\5z>\2\u0334\u0336"+
		"\5*\26\2\u0335\u0333\3\2\2\2\u0335\u0334\3\2\2\2\u0336\u0338\3\2\2\2\u0337"+
		"\u032e\3\2\2\2\u0338\u033b\3\2\2\2\u0339\u0337\3\2\2\2\u0339\u033a\3\2"+
		"\2\2\u033a\u0341\3\2\2\2\u033b\u0339\3\2\2\2\u033c\u033f\7\31\2\2\u033d"+
		"\u0340\5z>\2\u033e\u0340\5*\26\2\u033f\u033d\3\2\2\2\u033f\u033e\3\2\2"+
		"\2\u0340\u0342\3\2\2\2\u0341\u033c\3\2\2\2\u0341\u0342\3\2\2\2\u0342\177"+
		"\3\2\2\2\u0343\u0346\7\27\2\2\u0344\u0347\5|?\2\u0345\u0347\5h\65\2\u0346"+
		"\u0344\3\2\2\2\u0346\u0345\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u0349\7;"+
		"\2\2\u0349\u034a\7m\2\2\u034a\u034b\5x=\2\u034b\u034c\7n\2\2\u034c\u0081"+
		"\3\2\2\2\u034d\u034e\7;\2\2\u034e\u034f\7m\2\2\u034f\u0350\5x=\2\u0350"+
		"\u0353\7n\2\2\u0351\u0354\5|?\2\u0352\u0354\5h\65\2\u0353\u0351\3\2\2"+
		"\2\u0353\u0352\3\2\2\2\u0354\u0083\3\2\2\2\u0355\u035d\5t;\2\u0356\u035d"+
		"\5x=\2\u0357\u035d\5\u0088E\2\u0358\u035d\5\u00a6T\2\u0359\u035d\5\u00a8"+
		"U\2\u035a\u035d\5\u00aaV\2\u035b\u035d\5\u00acW\2\u035c\u0355\3\2\2\2"+
		"\u035c\u0356\3\2\2\2\u035c\u0357\3\2\2\2\u035c\u0358\3\2\2\2\u035c\u0359"+
		"\3\2\2\2\u035c\u035a\3\2\2\2\u035c\u035b\3\2\2\2\u035d\u0085\3\2\2\2\u035e"+
		"\u035f\5\u0088E\2\u035f\u0360\7i\2\2\u0360\u0087\3\2\2\2\u0361\u0362\7"+
		"<\2\2\u0362\u0365\5\u008aF\2\u0363\u0366\7<\2\2\u0364\u0366\5\u0084C\2"+
		"\u0365\u0363\3\2\2\2\u0365\u0364\3\2\2\2\u0366\u0372\3\2\2\2\u0367\u036a"+
		"\7<\2\2\u0368\u0369\7E\2\2\u0369\u036b\7<\2\2\u036a\u0368\3\2\2\2\u036b"+
		"\u036c\3\2\2\2\u036c\u036a\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u036f\3\2"+
		"\2\2\u036e\u0370\5\u0084C\2\u036f\u036e\3\2\2\2\u036f\u0370\3\2\2\2\u0370"+
		"\u0372\3\2\2\2\u0371\u0361\3\2\2\2\u0371\u0367\3\2\2\2\u0372\u0089\3\2"+
		"\2\2\u0373\u0374\t\b\2\2\u0374\u008b\3\2\2\2\u0375\u0378\5\34\17\2\u0376"+
		"\u0377\7E\2\2\u0377\u0379\7<\2\2\u0378\u0376\3\2\2\2\u0379\u037a\3\2\2"+
		"\2\u037a\u0378\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u0382\3\2\2\2\u037c\u0380"+
		"\7E\2\2\u037d\u0381\5n8\2\u037e\u0381\7@\2\2\u037f\u0381\7A\2\2\u0380"+
		"\u037d\3\2\2\2\u0380\u037e\3\2\2\2\u0380\u037f\3\2\2\2\u0381\u0383\3\2"+
		"\2\2\u0382\u037c\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u039d\3\2\2\2\u0384"+
		"\u0387\7<\2\2\u0385\u0386\7E\2\2\u0386\u0388\7<\2\2\u0387\u0385\3\2\2"+
		"\2\u0388\u0389\3\2\2\2\u0389\u0387\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u0392"+
		"\3\2\2\2\u038b\u0390\7E\2\2\u038c\u0391\5n8\2\u038d\u0391\7@\2\2\u038e"+
		"\u0391\7A\2\2\u038f\u0391\7<\2\2\u0390\u038c\3\2\2\2\u0390\u038d\3\2\2"+
		"\2\u0390\u038e\3\2\2\2\u0390\u038f\3\2\2\2\u0391\u0393\3\2\2\2\u0392\u038b"+
		"\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u039d\3\2\2\2\u0394\u0395\5\34\17\2"+
		"\u0395\u039a\7E\2\2\u0396\u039b\5n8\2\u0397\u039b\7@\2\2\u0398\u039b\7"+
		"A\2\2\u0399\u039b\7<\2\2\u039a\u0396\3\2\2\2\u039a\u0397\3\2\2\2\u039a"+
		"\u0398\3\2\2\2\u039a\u0399\3\2\2\2\u039b\u039d\3\2\2\2\u039c\u0375\3\2"+
		"\2\2\u039c\u0384\3\2\2\2\u039c\u0394\3\2\2\2\u039d\u008d\3\2\2\2\u039e"+
		"\u03a0\5\u0088E\2\u039f\u039e\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u039f"+
		"\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03a7\3\2\2\2\u03a3\u03a4\7j\2\2\u03a4"+
		"\u03a6\5\u0088E\2\u03a5\u03a3\3\2\2\2\u03a6\u03a9\3\2\2\2\u03a7\u03a5"+
		"\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u008f\3\2\2\2\u03a9\u03a7\3\2\2\2\u03aa"+
		"\u03ab\7\36\2\2\u03ab\u03ac\7m\2\2\u03ac\u03ad\5\u00b0Y\2\u03ad\u03ae"+
		"\7<\2\2\u03ae\u03af\7D\2\2\u03af\u03b0\7<\2\2\u03b0\u03b3\7n\2\2\u03b1"+
		"\u03b4\5z>\2\u03b2\u03b4\5*\26\2\u03b3\u03b1\3\2\2\2\u03b3\u03b2\3\2\2"+
		"\2\u03b4\u0091\3\2\2\2\u03b5\u03b7\7-\2\2\u03b6\u03b8\5\u0084C\2\u03b7"+
		"\u03b6\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03ba\7i"+
		"\2\2\u03ba\u0093\3\2\2\2\u03bb\u03bd\7\16\2\2\u03bc\u03be\7<\2\2\u03bd"+
		"\u03bc\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c0\7i"+
		"\2\2\u03c0\u0095\3\2\2\2\u03c1\u03c3\7\25\2\2\u03c2\u03c4\7<\2\2\u03c3"+
		"\u03c2\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c6\7i"+
		"\2\2\u03c6\u0097\3\2\2\2\u03c7\u03ce\5\u00a0Q\2\u03c8\u03c9\5\u009aN\2"+
		"\u03c9\u03ca\7j\2\2\u03ca\u03cb\5\u009cO\2\u03cb\u03ce\3\2\2\2\u03cc\u03ce"+
		"\5\u009cO\2\u03cd\u03c7\3\2\2\2\u03cd\u03c8\3\2\2\2\u03cd\u03cc\3\2\2"+
		"\2\u03ce\u0099\3\2\2\2\u03cf\u03d1\7\33\2\2\u03d0\u03cf\3\2\2\2\u03d1"+
		"\u03d4\3\2\2\2\u03d2\u03d0\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d5\3\2"+
		"\2\2\u03d4\u03d2\3\2\2\2\u03d5\u03d6\5V,\2\u03d6\u03e3\5L\'\2\u03d7\u03db"+
		"\7j\2\2\u03d8\u03da\7\33\2\2\u03d9\u03d8\3\2\2\2\u03da\u03dd\3\2\2\2\u03db"+
		"\u03d9\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03de\3\2\2\2\u03dd\u03db\3\2"+
		"\2\2\u03de\u03df\5V,\2\u03df\u03e0\5L\'\2\u03e0\u03e2\3\2\2\2\u03e1\u03d7"+
		"\3\2\2\2\u03e2\u03e5\3\2\2\2\u03e3\u03e1\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4"+
		"\u03ef\3\2\2\2\u03e5\u03e3\3\2\2\2\u03e6\u03eb\5\u00a0Q\2\u03e7\u03e8"+
		"\7j\2\2\u03e8\u03ea\5\u009eP\2\u03e9\u03e7\3\2\2\2\u03ea\u03ed\3\2\2\2"+
		"\u03eb\u03e9\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\u03ef\3\2\2\2\u03ed\u03eb"+
		"\3\2\2\2\u03ee\u03d2\3\2\2\2\u03ee\u03e6\3\2\2\2\u03ef\u009b\3\2\2\2\u03f0"+
		"\u03f2\7\33\2\2\u03f1\u03f0\3\2\2\2\u03f2\u03f5\3\2\2\2\u03f3\u03f1\3"+
		"\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f6\3\2\2\2\u03f5\u03f3\3\2\2\2\u03f6"+
		"\u03f7\5V,\2\u03f7\u03f8\7\n\2\2\u03f8\u03f9\5L\'\2\u03f9\u03fc\3\2\2"+
		"\2\u03fa\u03fc\5\u009eP\2\u03fb\u03f3\3\2\2\2\u03fb\u03fa\3\2\2\2\u03fc"+
		"\u009d\3\2\2\2\u03fd\u03ff\7\33\2\2\u03fe\u03fd\3\2\2\2\u03ff\u0402\3"+
		"\2\2\2\u0400\u03fe\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u0403\3\2\2\2\u0402"+
		"\u0400\3\2\2\2\u0403\u0404\5V,\2\u0404\u0405\5L\'\2\u0405\u009f\3\2\2"+
		"\2\u0406\u0409\5V,\2\u0407\u0408\7<\2\2\u0408\u040a\7k\2\2\u0409\u0407"+
		"\3\2\2\2\u0409\u040a\3\2\2\2\u040a\u040b\3\2\2\2\u040b\u040c\7\64\2\2"+
		"\u040c\u00a1\3\2\2\2\u040d\u040e\t\t\2\2\u040e\u00a3\3\2\2\2\u040f\u0413"+
		"\t\n\2\2\u0410\u0411\5\u00a2R\2\u0411\u0412\t\n\2\2\u0412\u0414\3\2\2"+
		"\2\u0413\u0410\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u0413\3\2\2\2\u0415\u0416"+
		"\3\2\2\2\u0416\u00a5\3\2\2\2\u0417\u0418\7O\2\2\u0418\u0419\7<\2\2\u0419"+
		"\u00a7\3\2\2\2\u041a\u041b\7<\2\2\u041b\u041c\7O\2\2\u041c\u00a9\3\2\2"+
		"\2\u041d\u041e\7P\2\2\u041e\u041f\7<\2\2\u041f\u00ab\3\2\2\2\u0420\u0421"+
		"\7<\2\2\u0421\u0422\7P\2\2\u0422\u00ad\3\2\2\2\u0423\u042c\5\u00b0Y\2"+
		"\u0424\u0425\5\u00b0Y\2\u0425\u0427\7q\2\2\u0426\u0428\7=\2\2\u0427\u0426"+
		"\3\2\2\2\u0427\u0428\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u042a\7r\2\2\u042a"+
		"\u042c\3\2\2\2\u042b\u0423\3\2\2\2\u042b\u0424\3\2\2\2\u042c\u00af\3\2"+
		"\2\2\u042d\u042e\t\4\2\2\u042e\u00b1\3\2\2\2\u0083\u00b5\u00ba\u00bd\u00c0"+
		"\u00ca\u00d1\u00d7\u00e1\u00e4\u00ea\u00ef\u00f3\u00fb\u0113\u0117\u011c"+
		"\u0120\u0124\u0132\u0136\u013b\u013f\u0143\u0161\u017f\u0188\u018c\u0193"+
		"\u0197\u019b\u019f\u01a5\u01a9\u01ad\u01b1\u01b7\u01bb\u01bf\u01c3\u01c5"+
		"\u01ca\u01cf\u01d5\u01db\u01e4\u01eb\u01f0\u01f7\u01fc\u0204\u0209\u020d"+
		"\u0219\u0221\u0230\u023e\u0242\u0248\u0256\u025d\u0260\u026a\u0270\u0274"+
		"\u0278\u027c\u027f\u0288\u0291\u0296\u029d\u02a1\u02a5\u02a7\u02ac\u02b3"+
		"\u02bf\u02c4\u02cc\u02d2\u02dc\u02ea\u02ec\u02f7\u0300\u030e\u0310\u0317"+
		"\u0319\u0321\u032c\u0335\u0339\u033f\u0341\u0346\u0353\u035c\u0365\u036c"+
		"\u036f\u0371\u037a\u0380\u0382\u0389\u0390\u0392\u039a\u039c\u03a1\u03a7"+
		"\u03b3\u03b7\u03bd\u03c3\u03cd\u03d2\u03db\u03e3\u03eb\u03ee\u03f3\u03fb"+
		"\u0400\u0409\u0415\u0427\u042b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}