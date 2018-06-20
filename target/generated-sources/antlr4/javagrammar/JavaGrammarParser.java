// Generated from JavaGrammar.g4 by ANTLR 4.4

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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2, WHITE_SPACES=3, LINE_COMMENT=4, NEW_LINE=5, COMMENTS_BLOCK=6, 
		UNTERMINATED_STRING=7, ADDITIONAL_LITERAL_AT=8, ADDITIONAL_LITERAL_ELLIPSIS=9, 
		KEYWORDS_ABSTRACT=10, KEYWORDS_ASSERT=11, KEYWORDS_BOOLEAN=12, KEYWORDS_BREAK=13, 
		KEYWORDS_BYTE=14, KEYWORDS_CASE=15, KEYWORDS_CATCH=16, KEYWORDS_CHAR=17, 
		KEYWORDS_CLASS=18, KEYWORDS_CONST=19, KEYWORDS_CONTINUE=20, KEYWORDS_DEFAULT=21, 
		KEYWORDS_DO=22, KEYWORDS_DOUBLE=23, KEYWORDS_ELSE=24, KEYWORDS_EXTENDS=25, 
		KEYWORDS_FINAL=26, KEYWORDS_FINALLY=27, KEYWORDS_FLOAT=28, KEYWORDS_FOR=29, 
		KEYWORDS_GOTO=30, KEYWORDS_IF=31, KEYWORDS_IMPLEMENTS=32, KEYWORDS_IMPORT=33, 
		KEYWORDS_INSTANCEOF=34, KEYWORDS_INT=35, KEYWORDS_INTERFACE=36, KEYWORDS_LONG=37, 
		KEYWORDS_NATIVE=38, KEYWORDS_NEW=39, KEYWORDS_PACKAGE=40, KEYWORDS_PRIVATE=41, 
		KEYWORDS_PROTECTED=42, KEYWORDS_PUBLIC=43, KEYWORDS_RETURN=44, KEYWORDS_SHORT=45, 
		KEYWORDS_STATIC=46, KEYWORDS_STRICTFP=47, KEYWORDS_SUPER=48, KEYWORDS_SYNCHRONIZED=49, 
		KEYWORDS_SWITCH=50, KEYWORDS_THIS=51, KEYWORDS_THROW=52, KEYWORDS_THROWS=53, 
		KEYWORDS_TRANSIENT=54, KEYWORDS_TRY=55, KEYWORDS_VOID=56, KEYWORDS_VOLATILE=57, 
		KEYWORDS_WHILE=58, IDENTIFIERS=59, LITERALS_NUMERIC_INT=60, LITERALS_NUMERIC_DOUBLE=61, 
		LITERALS_LOGICAL_BOOLEAN=62, LITERALS_TEXTUAL_CHAR=63, LITERALS_TEXTUAL_STRING=64, 
		LITERALS_REFERENCE_NULL=65, OPERATORS_IF=66, OPERATORS_ELSE=67, OPERATORS_ASSIGNMENT=68, 
		OPERATORS_GREATERTHAN=69, OPERATORS_LESSTHAN=70, OPERATORS_LOGICALNOT=71, 
		OPERATORS_LESSTHANOREQUAL=72, OPERATORS_GREATERTHANOREQUAL=73, OPERATORS_LOGICALEQUAL=74, 
		OPERATORS_LOGICALNOTEQUAL=75, OPERATORS_LOGICALAND=76, OPERATORS_LOGICALOR=77, 
		OPERATORS_INCREMENT=78, OPERATORS_DECREMENT=79, OPERATORS_ADDITION=80, 
		OPERATORS_SUBTRACTION=81, OPERATORS_MULTIPLICATION=82, OPERATORS_DIVISION=83, 
		OPERATORS_MODULO=84, OPERATORS_ADDITIONANDASSIGNMENT=85, OPERATORS_SUBTRACTIONANDASSIGNMENT=86, 
		OPERATORS_MULTIPLICATIONANDASSIGNMENT=87, OPERATORS_DIVISIONANDASSIGNMENT=88, 
		OPERATORS_MODULOANDASSIGMENT=89, OPERATORS_LOGICALANDASSIGNMENT=90, OPERATORS_BITWISENOT=91, 
		OPERATORS_BITWISEAND=92, OPERATORS_BITWISEOR=93, OPERATORS_BITWISEXOR=94, 
		OPERATORS_BITWISEANDASSIGNMENT=95, OPERATORS_BITWISEXORASSIGNMENT=96, 
		OPERATORS_BITWISEORASSIGNMENT=97, OPERATORS_SHIFTLEFT=98, OPERATORS_SHIFTRIGHT=99, 
		OPERATORS_SHIFTRIGHTUNSIGNED=100, OPERATORS_SHIFTLEFTASSIGNMENT=101, OPERATORS_SHIFTRIGHTASSIGNMENT=102, 
		OPERATORS_SHIFTRIGHTUNSIGNEDASSIGNMENT=103, SEPARATORS_PUNCTUATORS_SEMICOLON=104, 
		SEPARATORS_PUNCTUATORS_COMMA=105, SEPARATORS_PUNCTUATORS_DOT=106, SEPARATORS_PUNCTUATORS_ESCAPECHARACTER=107, 
		SEPARATORS_DELIMITERS_LEFTPARENTHESIS=108, SEPARATORS_DELIMITERS_RIGHTPARENTHESIS=109, 
		SEPARATORS_DELIMITERS_LEFTCURLYBRACKET=110, SEPARATORS_DELIMITERS_RIGHTCURLYBRACKET=111, 
		SEPARATORS_DELIMITERS_LEFTSQUAREBRACKET=112, SEPARATORS_DELIMITERS_RIGHTSQUAREBRACKET=113, 
		COMMENTS_LINE=114, COMMENTS_BLOCK_OPENING=115, COMMENTS_BLOCK_CLOSING=116;
	public static final String[] tokenNames = {
		"<INVALID>", "'::'", "'->'", "WHITE_SPACES", "LINE_COMMENT", "NEW_LINE", 
		"COMMENTS_BLOCK", "UNTERMINATED_STRING", "'@'", "'...'", "'abstract'", 
		"'assert'", "'boolean'", "'break'", "'byte'", "'case'", "'catch'", "'char'", 
		"'class'", "'const'", "'continue'", "'default'", "'do'", "'double'", "'else'", 
		"'extends'", "'final'", "'finally'", "'float'", "'for'", "'goto'", "'if'", 
		"'implements'", "'import'", "'instanceof'", "'int'", "'interface'", "'long'", 
		"'native'", "'new'", "'package'", "'private'", "'protected'", "'public'", 
		"'return'", "'short'", "'static'", "'strictfp'", "'super'", "'synchronized'", 
		"'switch'", "'this'", "'throw'", "'throws'", "'transient'", "'try'", "'void'", 
		"'volatile'", "'while'", "IDENTIFIERS", "LITERALS_NUMERIC_INT", "LITERALS_NUMERIC_DOUBLE", 
		"LITERALS_LOGICAL_BOOLEAN", "LITERALS_TEXTUAL_CHAR", "LITERALS_TEXTUAL_STRING", 
		"'null'", "'?'", "':'", "'='", "'>'", "'<'", "'!'", "'<='", "'>='", "'=='", 
		"'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'%'", 
		"'+='", "'-='", "'*='", "'/='", "'%='", "'&&='", "'~'", "'&'", "'|'", 
		"'^'", "'&='", "'^='", "'|='", "'<<'", "'>>'", "'>>>'", "'<<='", "'>>='", 
		"'>>>='", "';'", "','", "'.'", "'\\'", "'('", "')'", "'{'", "'}'", "'['", 
		"']'", "'//'", "'/*'", "'*/'"
	};
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_modifier = 4, RULE_classOrInterfaceModifier = 5, 
		RULE_variableModifier = 6, RULE_classDeclaration = 7, RULE_typeParameters = 8, 
		RULE_typeParameter = 9, RULE_typeBound = 10, RULE_interfaceDeclaration = 11, 
		RULE_classBody = 12, RULE_interfaceBody = 13, RULE_classBodyDeclaration = 14, 
		RULE_memberDeclaration = 15, RULE_methodDeclaration = 16, RULE_methodPermissionModifier = 17, 
		RULE_methodTypeModifier = 18, RULE_methodBody = 19, RULE_typeTypeOrVoid = 20, 
		RULE_genericMethodDeclaration = 21, RULE_genericConstructorDeclaration = 22, 
		RULE_constructorDeclaration = 23, RULE_fieldDeclaration = 24, RULE_interfaceBodyDeclaration = 25, 
		RULE_interfaceMemberDeclaration = 26, RULE_constDeclaration = 27, RULE_constantDeclarator = 28, 
		RULE_interfaceMethodDeclaration = 29, RULE_interfaceMethodModifier = 30, 
		RULE_genericInterfaceMethodDeclaration = 31, RULE_variableDeclarators = 32, 
		RULE_variableDeclarator = 33, RULE_variableDeclaratorId = 34, RULE_variableInitializer = 35, 
		RULE_arrayInitializer = 36, RULE_classOrInterfaceType = 37, RULE_typeArgument = 38, 
		RULE_qualifiedNameList = 39, RULE_formalParameters = 40, RULE_formalParameterList = 41, 
		RULE_formalParameter = 42, RULE_lastFormalParameter = 43, RULE_qualifiedName = 44, 
		RULE_literal = 45, RULE_integerLiteral = 46, RULE_floatLiteral = 47, RULE_annotation = 48, 
		RULE_elementValuePairs = 49, RULE_elementValuePair = 50, RULE_elementValue = 51, 
		RULE_elementValueArrayInitializer = 52, RULE_annotationTypeDeclaration = 53, 
		RULE_annotationTypeBody = 54, RULE_annotationTypeElementDeclaration = 55, 
		RULE_annotationTypeElementRest = 56, RULE_annotationMethodOrConstantRest = 57, 
		RULE_annotationMethodRest = 58, RULE_annotationConstantRest = 59, RULE_defaultValue = 60, 
		RULE_block = 61, RULE_blockStatement = 62, RULE_localVariableDeclaration = 63, 
		RULE_localTypeDeclaration = 64, RULE_statement = 65, RULE_catchClause = 66, 
		RULE_catchType = 67, RULE_finallyBlock = 68, RULE_resourceSpecification = 69, 
		RULE_resources = 70, RULE_resource = 71, RULE_switchBlockStatementGroup = 72, 
		RULE_switchLabel = 73, RULE_forControl = 74, RULE_forInit = 75, RULE_enhancedForControl = 76, 
		RULE_parExpression = 77, RULE_expressionList = 78, RULE_methodCall = 79, 
		RULE_expression = 80, RULE_lambdaExpression = 81, RULE_lambdaParameters = 82, 
		RULE_lambdaBody = 83, RULE_primary = 84, RULE_classType = 85, RULE_creator = 86, 
		RULE_createdName = 87, RULE_innerCreator = 88, RULE_arrayCreatorRest = 89, 
		RULE_classCreatorRest = 90, RULE_explicitGenericInvocation = 91, RULE_typeArgumentsOrDiamond = 92, 
		RULE_nonWildcardTypeArgumentsOrDiamond = 93, RULE_nonWildcardTypeArguments = 94, 
		RULE_typeList = 95, RULE_typeType = 96, RULE_primitiveType = 97, RULE_typeArguments = 98, 
		RULE_superSuffix = 99, RULE_explicitGenericInvocationSuffix = 100, RULE_arguments = 101;
	public static final String[] ruleNames = {
		"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
		"modifier", "classOrInterfaceModifier", "variableModifier", "classDeclaration", 
		"typeParameters", "typeParameter", "typeBound", "interfaceDeclaration", 
		"classBody", "interfaceBody", "classBodyDeclaration", "memberDeclaration", 
		"methodDeclaration", "methodPermissionModifier", "methodTypeModifier", 
		"methodBody", "typeTypeOrVoid", "genericMethodDeclaration", "genericConstructorDeclaration", 
		"constructorDeclaration", "fieldDeclaration", "interfaceBodyDeclaration", 
		"interfaceMemberDeclaration", "constDeclaration", "constantDeclarator", 
		"interfaceMethodDeclaration", "interfaceMethodModifier", "genericInterfaceMethodDeclaration", 
		"variableDeclarators", "variableDeclarator", "variableDeclaratorId", "variableInitializer", 
		"arrayInitializer", "classOrInterfaceType", "typeArgument", "qualifiedNameList", 
		"formalParameters", "formalParameterList", "formalParameter", "lastFormalParameter", 
		"qualifiedName", "literal", "integerLiteral", "floatLiteral", "annotation", 
		"elementValuePairs", "elementValuePair", "elementValue", "elementValueArrayInitializer", 
		"annotationTypeDeclaration", "annotationTypeBody", "annotationTypeElementDeclaration", 
		"annotationTypeElementRest", "annotationMethodOrConstantRest", "annotationMethodRest", 
		"annotationConstantRest", "defaultValue", "block", "blockStatement", "localVariableDeclaration", 
		"localTypeDeclaration", "statement", "catchClause", "catchType", "finallyBlock", 
		"resourceSpecification", "resources", "resource", "switchBlockStatementGroup", 
		"switchLabel", "forControl", "forInit", "enhancedForControl", "parExpression", 
		"expressionList", "methodCall", "expression", "lambdaExpression", "lambdaParameters", 
		"lambdaBody", "primary", "classType", "creator", "createdName", "innerCreator", 
		"arrayCreatorRest", "classCreatorRest", "explicitGenericInvocation", "typeArgumentsOrDiamond", 
		"nonWildcardTypeArgumentsOrDiamond", "nonWildcardTypeArguments", "typeList", 
		"typeType", "primitiveType", "typeArguments", "superSuffix", "explicitGenericInvocationSuffix", 
		"arguments"
	};

	@Override
	public String getGrammarFileName() { return "JavaGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

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
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public TerminalNode EOF() { return getToken(JavaGrammarParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
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
			setState(205);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(204); packageDeclaration();
				}
				break;
			}
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KEYWORDS_IMPORT) {
				{
				{
				setState(207); importDeclaration();
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADDITIONAL_LITERAL_AT) | (1L << KEYWORDS_ABSTRACT) | (1L << KEYWORDS_CLASS) | (1L << KEYWORDS_FINAL) | (1L << KEYWORDS_INTERFACE) | (1L << KEYWORDS_PRIVATE) | (1L << KEYWORDS_PROTECTED) | (1L << KEYWORDS_PUBLIC) | (1L << KEYWORDS_STATIC) | (1L << KEYWORDS_STRICTFP))) != 0) || _la==SEPARATORS_PUNCTUATORS_SEMICOLON) {
				{
				{
				setState(213); typeDeclaration();
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219); match(EOF);
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

	public static class PackageDeclarationContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode KEYWORDS_PACKAGE() { return getToken(JavaGrammarParser.KEYWORDS_PACKAGE, 0); }
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADDITIONAL_LITERAL_AT) {
				{
				{
				setState(221); annotation();
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227); match(KEYWORDS_PACKAGE);
			setState(228); qualifiedName();
			setState(229); match(SEPARATORS_PUNCTUATORS_SEMICOLON);
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode KEYWORDS_IMPORT() { return getToken(JavaGrammarParser.KEYWORDS_IMPORT, 0); }
		public TerminalNode KEYWORDS_STATIC() { return getToken(JavaGrammarParser.KEYWORDS_STATIC, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231); match(KEYWORDS_IMPORT);
			setState(233);
			_la = _input.LA(1);
			if (_la==KEYWORDS_STATIC) {
				{
				setState(232); match(KEYWORDS_STATIC);
				}
			}

			setState(235); qualifiedName();
			setState(238);
			_la = _input.LA(1);
			if (_la==SEPARATORS_PUNCTUATORS_DOT) {
				{
				setState(236); match(SEPARATORS_PUNCTUATORS_DOT);
				setState(237); match(OPERATORS_MULTIPLICATION);
				}
			}

			setState(240); match(SEPARATORS_PUNCTUATORS_SEMICOLON);
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
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
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
		enterRule(_localctx, 6, RULE_typeDeclaration);
		try {
			int _alt;
			setState(254);
			switch (_input.LA(1)) {
			case ADDITIONAL_LITERAL_AT:
			case KEYWORDS_ABSTRACT:
			case KEYWORDS_CLASS:
			case KEYWORDS_FINAL:
			case KEYWORDS_INTERFACE:
			case KEYWORDS_PRIVATE:
			case KEYWORDS_PROTECTED:
			case KEYWORDS_PUBLIC:
			case KEYWORDS_STATIC:
			case KEYWORDS_STRICTFP:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(242); classOrInterfaceModifier();
						}
						} 
					}
					setState(247);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(251);
				switch (_input.LA(1)) {
				case KEYWORDS_CLASS:
					{
					setState(248); classDeclaration();
					}
					break;
				case KEYWORDS_INTERFACE:
					{
					setState(249); interfaceDeclaration();
					}
					break;
				case ADDITIONAL_LITERAL_AT:
					{
					setState(250); annotationTypeDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SEPARATORS_PUNCTUATORS_SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(253); match(SEPARATORS_PUNCTUATORS_SEMICOLON);
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

	public static class ModifierContext extends ParserRuleContext {
		public ClassOrInterfaceModifierContext classOrInterfaceModifier() {
			return getRuleContext(ClassOrInterfaceModifierContext.class,0);
		}
		public TerminalNode KEYWORDS_SYNCHRONIZED() { return getToken(JavaGrammarParser.KEYWORDS_SYNCHRONIZED, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modifier);
		try {
			setState(258);
			switch (_input.LA(1)) {
			case ADDITIONAL_LITERAL_AT:
			case KEYWORDS_ABSTRACT:
			case KEYWORDS_FINAL:
			case KEYWORDS_PRIVATE:
			case KEYWORDS_PROTECTED:
			case KEYWORDS_PUBLIC:
			case KEYWORDS_STATIC:
			case KEYWORDS_STRICTFP:
				enterOuterAlt(_localctx, 1);
				{
				setState(256); classOrInterfaceModifier();
				}
				break;
			case KEYWORDS_SYNCHRONIZED:
				enterOuterAlt(_localctx, 2);
				{
				setState(257); match(KEYWORDS_SYNCHRONIZED);
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

	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode KEYWORDS_STRICTFP() { return getToken(JavaGrammarParser.KEYWORDS_STRICTFP, 0); }
		public TerminalNode KEYWORDS_ABSTRACT() { return getToken(JavaGrammarParser.KEYWORDS_ABSTRACT, 0); }
		public TerminalNode KEYWORDS_PUBLIC() { return getToken(JavaGrammarParser.KEYWORDS_PUBLIC, 0); }
		public TerminalNode KEYWORDS_STATIC() { return getToken(JavaGrammarParser.KEYWORDS_STATIC, 0); }
		public TerminalNode KEYWORDS_PRIVATE() { return getToken(JavaGrammarParser.KEYWORDS_PRIVATE, 0); }
		public TerminalNode KEYWORDS_PROTECTED() { return getToken(JavaGrammarParser.KEYWORDS_PROTECTED, 0); }
		public TerminalNode KEYWORDS_FINAL() { return getToken(JavaGrammarParser.KEYWORDS_FINAL, 0); }
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterClassOrInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitClassOrInterfaceModifier(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classOrInterfaceModifier);
		try {
			setState(268);
			switch (_input.LA(1)) {
			case ADDITIONAL_LITERAL_AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(260); annotation();
				}
				break;
			case KEYWORDS_PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(261); match(KEYWORDS_PUBLIC);
				}
				break;
			case KEYWORDS_PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(262); match(KEYWORDS_PROTECTED);
				}
				break;
			case KEYWORDS_PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(263); match(KEYWORDS_PRIVATE);
				}
				break;
			case KEYWORDS_STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(264); match(KEYWORDS_STATIC);
				}
				break;
			case KEYWORDS_ABSTRACT:
				enterOuterAlt(_localctx, 6);
				{
				setState(265); match(KEYWORDS_ABSTRACT);
				}
				break;
			case KEYWORDS_FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(266); match(KEYWORDS_FINAL);
				}
				break;
			case KEYWORDS_STRICTFP:
				enterOuterAlt(_localctx, 8);
				{
				setState(267); match(KEYWORDS_STRICTFP);
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

	public static class VariableModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode KEYWORDS_FINAL() { return getToken(JavaGrammarParser.KEYWORDS_FINAL, 0); }
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitVariableModifier(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableModifier);
		try {
			setState(272);
			switch (_input.LA(1)) {
			case KEYWORDS_FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(270); match(KEYWORDS_FINAL);
				}
				break;
			case ADDITIONAL_LITERAL_AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(271); annotation();
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
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode KEYWORDS_IMPLEMENTS() { return getToken(JavaGrammarParser.KEYWORDS_IMPLEMENTS, 0); }
		public TerminalNode KEYWORDS_CLASS() { return getToken(JavaGrammarParser.KEYWORDS_CLASS, 0); }
		public TerminalNode KEYWORDS_EXTENDS() { return getToken(JavaGrammarParser.KEYWORDS_EXTENDS, 0); }
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
		enterRule(_localctx, 14, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274); match(KEYWORDS_CLASS);
			setState(275); match(IDENTIFIERS);
			setState(277);
			_la = _input.LA(1);
			if (_la==OPERATORS_LESSTHAN) {
				{
				setState(276); typeParameters();
				}
			}

			setState(281);
			_la = _input.LA(1);
			if (_la==KEYWORDS_EXTENDS) {
				{
				setState(279); match(KEYWORDS_EXTENDS);
				setState(280); typeType();
				}
			}

			setState(285);
			_la = _input.LA(1);
			if (_la==KEYWORDS_IMPLEMENTS) {
				{
				setState(283); match(KEYWORDS_IMPLEMENTS);
				setState(284); typeList();
				}
			}

			setState(287); classBody();
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

	public static class TypeParametersContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitTypeParameters(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289); match(OPERATORS_LESSTHAN);
			setState(290); typeParameter();
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARATORS_PUNCTUATORS_COMMA) {
				{
				{
				setState(291); match(SEPARATORS_PUNCTUATORS_COMMA);
				setState(292); typeParameter();
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(298); match(OPERATORS_GREATERTHAN);
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

	public static class TypeParameterContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TerminalNode KEYWORDS_EXTENDS() { return getToken(JavaGrammarParser.KEYWORDS_EXTENDS, 0); }
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitTypeParameter(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADDITIONAL_LITERAL_AT) {
				{
				{
				setState(300); annotation();
				}
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(306); match(IDENTIFIERS);
			setState(309);
			_la = _input.LA(1);
			if (_la==KEYWORDS_EXTENDS) {
				{
				setState(307); match(KEYWORDS_EXTENDS);
				setState(308); typeBound();
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

	public static class TypeBoundContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitTypeBound(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311); typeType();
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERATORS_BITWISEAND) {
				{
				{
				setState(312); match(OPERATORS_BITWISEAND);
				setState(313); typeType();
				}
				}
				setState(318);
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

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode KEYWORDS_EXTENDS() { return getToken(JavaGrammarParser.KEYWORDS_EXTENDS, 0); }
		public TerminalNode KEYWORDS_INTERFACE() { return getToken(JavaGrammarParser.KEYWORDS_INTERFACE, 0); }
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319); match(KEYWORDS_INTERFACE);
			setState(320); match(IDENTIFIERS);
			setState(322);
			_la = _input.LA(1);
			if (_la==OPERATORS_LESSTHAN) {
				{
				setState(321); typeParameters();
				}
			}

			setState(326);
			_la = _input.LA(1);
			if (_la==KEYWORDS_EXTENDS) {
				{
				setState(324); match(KEYWORDS_EXTENDS);
				setState(325); typeList();
				}
			}

			setState(328); interfaceBody();
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
		enterRule(_localctx, 24, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330); match(SEPARATORS_DELIMITERS_LEFTCURLYBRACKET);
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADDITIONAL_LITERAL_AT) | (1L << KEYWORDS_ABSTRACT) | (1L << KEYWORDS_BOOLEAN) | (1L << KEYWORDS_BYTE) | (1L << KEYWORDS_CHAR) | (1L << KEYWORDS_CLASS) | (1L << KEYWORDS_DOUBLE) | (1L << KEYWORDS_FINAL) | (1L << KEYWORDS_FLOAT) | (1L << KEYWORDS_INT) | (1L << KEYWORDS_INTERFACE) | (1L << KEYWORDS_LONG) | (1L << KEYWORDS_NATIVE) | (1L << KEYWORDS_PRIVATE) | (1L << KEYWORDS_PROTECTED) | (1L << KEYWORDS_PUBLIC) | (1L << KEYWORDS_SHORT) | (1L << KEYWORDS_STATIC) | (1L << KEYWORDS_STRICTFP) | (1L << KEYWORDS_SYNCHRONIZED) | (1L << KEYWORDS_VOID) | (1L << IDENTIFIERS))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (OPERATORS_LESSTHAN - 70)) | (1L << (SEPARATORS_PUNCTUATORS_SEMICOLON - 70)) | (1L << (SEPARATORS_DELIMITERS_LEFTCURLYBRACKET - 70)))) != 0)) {
				{
				{
				setState(331); classBodyDeclaration();
				}
				}
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(337); match(SEPARATORS_DELIMITERS_RIGHTCURLYBRACKET);
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

	public static class InterfaceBodyContext extends ParserRuleContext {
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitInterfaceBody(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339); match(SEPARATORS_DELIMITERS_LEFTCURLYBRACKET);
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADDITIONAL_LITERAL_AT) | (1L << KEYWORDS_ABSTRACT) | (1L << KEYWORDS_BOOLEAN) | (1L << KEYWORDS_BYTE) | (1L << KEYWORDS_CHAR) | (1L << KEYWORDS_CLASS) | (1L << KEYWORDS_DEFAULT) | (1L << KEYWORDS_DOUBLE) | (1L << KEYWORDS_FINAL) | (1L << KEYWORDS_FLOAT) | (1L << KEYWORDS_INT) | (1L << KEYWORDS_INTERFACE) | (1L << KEYWORDS_LONG) | (1L << KEYWORDS_PRIVATE) | (1L << KEYWORDS_PROTECTED) | (1L << KEYWORDS_PUBLIC) | (1L << KEYWORDS_SHORT) | (1L << KEYWORDS_STATIC) | (1L << KEYWORDS_STRICTFP) | (1L << KEYWORDS_SYNCHRONIZED) | (1L << KEYWORDS_VOID) | (1L << IDENTIFIERS))) != 0) || _la==OPERATORS_LESSTHAN || _la==SEPARATORS_PUNCTUATORS_SEMICOLON) {
				{
				{
				setState(340); interfaceBodyDeclaration();
				}
				}
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(346); match(SEPARATORS_DELIMITERS_RIGHTCURLYBRACKET);
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
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public TerminalNode KEYWORDS_STATIC() { return getToken(JavaGrammarParser.KEYWORDS_STATIC, 0); }
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
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
		enterRule(_localctx, 28, RULE_classBodyDeclaration);
		int _la;
		try {
			int _alt;
			setState(360);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(348); match(SEPARATORS_PUNCTUATORS_SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				_la = _input.LA(1);
				if (_la==KEYWORDS_STATIC) {
					{
					setState(349); match(KEYWORDS_STATIC);
					}
				}

				setState(352); block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(356);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(353); modifier();
						}
						} 
					}
					setState(358);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(359); memberDeclaration();
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

	public static class MemberDeclarationContext extends ParserRuleContext {
		public GenericMethodDeclarationContext genericMethodDeclaration() {
			return getRuleContext(GenericMethodDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext genericConstructorDeclaration() {
			return getRuleContext(GenericConstructorDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitMemberDeclaration(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_memberDeclaration);
		try {
			setState(370);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(362); methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(363); genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(364); fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(365); constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(366); genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(367); interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(368); annotationTypeDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(369); classDeclaration();
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodPermissionModifierContext methodPermissionModifier() {
			return getRuleContext(MethodPermissionModifierContext.class,0);
		}
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public MethodTypeModifierContext methodTypeModifier() {
			return getRuleContext(MethodTypeModifierContext.class,0);
		}
		public TerminalNode KEYWORDS_THROWS() { return getToken(JavaGrammarParser.KEYWORDS_THROWS, 0); }
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORDS_PRIVATE) | (1L << KEYWORDS_PROTECTED) | (1L << KEYWORDS_PUBLIC))) != 0)) {
				{
				setState(372); methodPermissionModifier();
				}
			}

			setState(376);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORDS_ABSTRACT) | (1L << KEYWORDS_FINAL) | (1L << KEYWORDS_NATIVE) | (1L << KEYWORDS_STATIC) | (1L << KEYWORDS_STRICTFP) | (1L << KEYWORDS_SYNCHRONIZED))) != 0)) {
				{
				setState(375); methodTypeModifier();
				}
			}

			setState(378); typeTypeOrVoid();
			setState(379); match(IDENTIFIERS);
			setState(380); formalParameters();
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARATORS_DELIMITERS_LEFTSQUAREBRACKET) {
				{
				{
				setState(381); match(SEPARATORS_DELIMITERS_LEFTSQUAREBRACKET);
				setState(382); match(SEPARATORS_DELIMITERS_RIGHTSQUAREBRACKET);
				}
				}
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(390);
			_la = _input.LA(1);
			if (_la==KEYWORDS_THROWS) {
				{
				setState(388); match(KEYWORDS_THROWS);
				setState(389); qualifiedNameList();
				}
			}

			setState(392); methodBody();
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
		public TerminalNode KEYWORDS_PRIVATE() { return getToken(JavaGrammarParser.KEYWORDS_PRIVATE, 0); }
		public TerminalNode KEYWORDS_PROTECTED() { return getToken(JavaGrammarParser.KEYWORDS_PROTECTED, 0); }
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
		enterRule(_localctx, 34, RULE_methodPermissionModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORDS_PRIVATE) | (1L << KEYWORDS_PROTECTED) | (1L << KEYWORDS_PUBLIC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		public TerminalNode KEYWORDS_NATIVE() { return getToken(JavaGrammarParser.KEYWORDS_NATIVE, 0); }
		public TerminalNode KEYWORDS_STRICTFP() { return getToken(JavaGrammarParser.KEYWORDS_STRICTFP, 0); }
		public TerminalNode KEYWORDS_ABSTRACT() { return getToken(JavaGrammarParser.KEYWORDS_ABSTRACT, 0); }
		public TerminalNode KEYWORDS_STATIC() { return getToken(JavaGrammarParser.KEYWORDS_STATIC, 0); }
		public TerminalNode KEYWORDS_SYNCHRONIZED() { return getToken(JavaGrammarParser.KEYWORDS_SYNCHRONIZED, 0); }
		public TerminalNode KEYWORDS_FINAL() { return getToken(JavaGrammarParser.KEYWORDS_FINAL, 0); }
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
		enterRule(_localctx, 36, RULE_methodTypeModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORDS_ABSTRACT) | (1L << KEYWORDS_FINAL) | (1L << KEYWORDS_NATIVE) | (1L << KEYWORDS_STATIC) | (1L << KEYWORDS_STRICTFP) | (1L << KEYWORDS_SYNCHRONIZED))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_methodBody);
		try {
			setState(400);
			switch (_input.LA(1)) {
			case SEPARATORS_DELIMITERS_LEFTCURLYBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(398); block();
				}
				break;
			case SEPARATORS_PUNCTUATORS_SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(399); match(SEPARATORS_PUNCTUATORS_SEMICOLON);
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

	public static class TypeTypeOrVoidContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode KEYWORDS_VOID() { return getToken(JavaGrammarParser.KEYWORDS_VOID, 0); }
		public TypeTypeOrVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeTypeOrVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterTypeTypeOrVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitTypeTypeOrVoid(this);
		}
	}

	public final TypeTypeOrVoidContext typeTypeOrVoid() throws RecognitionException {
		TypeTypeOrVoidContext _localctx = new TypeTypeOrVoidContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeTypeOrVoid);
		try {
			setState(404);
			switch (_input.LA(1)) {
			case ADDITIONAL_LITERAL_AT:
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
				setState(402); typeType();
				}
				break;
			case KEYWORDS_VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(403); match(KEYWORDS_VOID);
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

	public static class GenericMethodDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterGenericMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitGenericMethodDeclaration(this);
		}
	}

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406); typeParameters();
			setState(407); methodDeclaration();
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

	public static class GenericConstructorDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericConstructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterGenericConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitGenericConstructorDeclaration(this);
		}
	}

	public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
		GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409); typeParameters();
			setState(410); constructorDeclaration();
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

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public BlockContext constructorBody;
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode KEYWORDS_THROWS() { return getToken(JavaGrammarParser.KEYWORDS_THROWS, 0); }
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412); match(IDENTIFIERS);
			setState(413); formalParameters();
			setState(416);
			_la = _input.LA(1);
			if (_la==KEYWORDS_THROWS) {
				{
				setState(414); match(KEYWORDS_THROWS);
				setState(415); qualifiedNameList();
				}
			}

			setState(418); ((ConstructorDeclarationContext)_localctx).constructorBody = block();
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420); typeType();
			setState(421); variableDeclarators();
			setState(422); match(SEPARATORS_PUNCTUATORS_SEMICOLON);
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

	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
			return getRuleContext(InterfaceMemberDeclarationContext.class,0);
		}
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterInterfaceBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitInterfaceBodyDeclaration(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_interfaceBodyDeclaration);
		try {
			int _alt;
			setState(432);
			switch (_input.LA(1)) {
			case ADDITIONAL_LITERAL_AT:
			case KEYWORDS_ABSTRACT:
			case KEYWORDS_BOOLEAN:
			case KEYWORDS_BYTE:
			case KEYWORDS_CHAR:
			case KEYWORDS_CLASS:
			case KEYWORDS_DEFAULT:
			case KEYWORDS_DOUBLE:
			case KEYWORDS_FINAL:
			case KEYWORDS_FLOAT:
			case KEYWORDS_INT:
			case KEYWORDS_INTERFACE:
			case KEYWORDS_LONG:
			case KEYWORDS_PRIVATE:
			case KEYWORDS_PROTECTED:
			case KEYWORDS_PUBLIC:
			case KEYWORDS_SHORT:
			case KEYWORDS_STATIC:
			case KEYWORDS_STRICTFP:
			case KEYWORDS_SYNCHRONIZED:
			case KEYWORDS_VOID:
			case IDENTIFIERS:
			case OPERATORS_LESSTHAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(424); modifier();
						}
						} 
					}
					setState(429);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				setState(430); interfaceMemberDeclaration();
				}
				break;
			case SEPARATORS_PUNCTUATORS_SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(431); match(SEPARATORS_PUNCTUATORS_SEMICOLON);
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

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() {
			return getRuleContext(GenericInterfaceMethodDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitInterfaceMemberDeclaration(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_interfaceMemberDeclaration);
		try {
			setState(440);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(434); constDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(435); interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(436); genericInterfaceMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(437); interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(438); annotationTypeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(439); classDeclaration();
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

	public static class ConstDeclarationContext extends ParserRuleContext {
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitConstDeclaration(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442); typeType();
			setState(443); constantDeclarator();
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARATORS_PUNCTUATORS_COMMA) {
				{
				{
				setState(444); match(SEPARATORS_PUNCTUATORS_COMMA);
				setState(445); constantDeclarator();
				}
				}
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(451); match(SEPARATORS_PUNCTUATORS_SEMICOLON);
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

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterConstantDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitConstantDeclarator(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453); match(IDENTIFIERS);
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARATORS_DELIMITERS_LEFTSQUAREBRACKET) {
				{
				{
				setState(454); match(SEPARATORS_DELIMITERS_LEFTSQUAREBRACKET);
				setState(455); match(SEPARATORS_DELIMITERS_RIGHTSQUAREBRACKET);
				}
				}
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(461); match(OPERATORS_ASSIGNMENT);
			setState(462); variableInitializer();
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

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public TerminalNode KEYWORDS_THROWS() { return getToken(JavaGrammarParser.KEYWORDS_THROWS, 0); }
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitInterfaceMethodDeclaration(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(464); interfaceMethodModifier();
					}
					} 
				}
				setState(469);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			setState(480);
			switch (_input.LA(1)) {
			case ADDITIONAL_LITERAL_AT:
			case KEYWORDS_BOOLEAN:
			case KEYWORDS_BYTE:
			case KEYWORDS_CHAR:
			case KEYWORDS_DOUBLE:
			case KEYWORDS_FLOAT:
			case KEYWORDS_INT:
			case KEYWORDS_LONG:
			case KEYWORDS_SHORT:
			case KEYWORDS_VOID:
			case IDENTIFIERS:
				{
				setState(470); typeTypeOrVoid();
				}
				break;
			case OPERATORS_LESSTHAN:
				{
				setState(471); typeParameters();
				setState(475);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(472); annotation();
						}
						} 
					}
					setState(477);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				}
				setState(478); typeTypeOrVoid();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(482); match(IDENTIFIERS);
			setState(483); formalParameters();
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARATORS_DELIMITERS_LEFTSQUAREBRACKET) {
				{
				{
				setState(484); match(SEPARATORS_DELIMITERS_LEFTSQUAREBRACKET);
				setState(485); match(SEPARATORS_DELIMITERS_RIGHTSQUAREBRACKET);
				}
				}
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(493);
			_la = _input.LA(1);
			if (_la==KEYWORDS_THROWS) {
				{
				setState(491); match(KEYWORDS_THROWS);
				setState(492); qualifiedNameList();
				}
			}

			setState(495); methodBody();
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

	public static class InterfaceMethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode KEYWORDS_STRICTFP() { return getToken(JavaGrammarParser.KEYWORDS_STRICTFP, 0); }
		public TerminalNode KEYWORDS_ABSTRACT() { return getToken(JavaGrammarParser.KEYWORDS_ABSTRACT, 0); }
		public TerminalNode KEYWORDS_DEFAULT() { return getToken(JavaGrammarParser.KEYWORDS_DEFAULT, 0); }
		public TerminalNode KEYWORDS_PUBLIC() { return getToken(JavaGrammarParser.KEYWORDS_PUBLIC, 0); }
		public TerminalNode KEYWORDS_STATIC() { return getToken(JavaGrammarParser.KEYWORDS_STATIC, 0); }
		public InterfaceMethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterInterfaceMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitInterfaceMethodModifier(this);
		}
	}

	public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
		InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_interfaceMethodModifier);
		try {
			setState(503);
			switch (_input.LA(1)) {
			case ADDITIONAL_LITERAL_AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(497); annotation();
				}
				break;
			case KEYWORDS_PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(498); match(KEYWORDS_PUBLIC);
				}
				break;
			case KEYWORDS_ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(499); match(KEYWORDS_ABSTRACT);
				}
				break;
			case KEYWORDS_DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(500); match(KEYWORDS_DEFAULT);
				}
				break;
			case KEYWORDS_STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(501); match(KEYWORDS_STATIC);
				}
				break;
			case KEYWORDS_STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(502); match(KEYWORDS_STRICTFP);
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

	public static class GenericInterfaceMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericInterfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterGenericInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitGenericInterfaceMethodDeclaration(this);
		}
	}

	public final GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() throws RecognitionException {
		GenericInterfaceMethodDeclarationContext _localctx = new GenericInterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_genericInterfaceMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505); typeParameters();
			setState(506); interfaceMethodDeclaration();
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

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitVariableDeclarators(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508); variableDeclarator();
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARATORS_PUNCTUATORS_COMMA) {
				{
				{
				setState(509); match(SEPARATORS_PUNCTUATORS_COMMA);
				setState(510); variableDeclarator();
				}
				}
				setState(515);
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
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
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
		enterRule(_localctx, 66, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516); variableDeclaratorId();
			setState(519);
			_la = _input.LA(1);
			if (_la==OPERATORS_ASSIGNMENT) {
				{
				setState(517); match(OPERATORS_ASSIGNMENT);
				setState(518); variableInitializer();
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
		enterRule(_localctx, 68, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521); match(IDENTIFIERS);
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARATORS_DELIMITERS_LEFTSQUAREBRACKET) {
				{
				{
				setState(522); match(SEPARATORS_DELIMITERS_LEFTSQUAREBRACKET);
				setState(523); match(SEPARATORS_DELIMITERS_RIGHTSQUAREBRACKET);
				}
				}
				setState(528);
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 70, RULE_variableInitializer);
		try {
			setState(531);
			switch (_input.LA(1)) {
			case SEPARATORS_DELIMITERS_LEFTCURLYBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(529); arrayInitializer();
				}
				break;
			case ADDITIONAL_LITERAL_AT:
			case KEYWORDS_BOOLEAN:
			case KEYWORDS_BYTE:
			case KEYWORDS_CHAR:
			case KEYWORDS_DOUBLE:
			case KEYWORDS_FLOAT:
			case KEYWORDS_INT:
			case KEYWORDS_LONG:
			case KEYWORDS_NEW:
			case KEYWORDS_SHORT:
			case KEYWORDS_SUPER:
			case KEYWORDS_THIS:
			case KEYWORDS_VOID:
			case IDENTIFIERS:
			case LITERALS_NUMERIC_INT:
			case LITERALS_NUMERIC_DOUBLE:
			case LITERALS_LOGICAL_BOOLEAN:
			case LITERALS_TEXTUAL_CHAR:
			case LITERALS_TEXTUAL_STRING:
			case LITERALS_REFERENCE_NULL:
			case OPERATORS_LESSTHAN:
			case OPERATORS_LOGICALNOT:
			case OPERATORS_INCREMENT:
			case OPERATORS_DECREMENT:
			case OPERATORS_ADDITION:
			case OPERATORS_SUBTRACTION:
			case OPERATORS_BITWISENOT:
			case SEPARATORS_DELIMITERS_LEFTPARENTHESIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(530); expression(0);
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
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
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
		enterRule(_localctx, 72, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(533); match(SEPARATORS_DELIMITERS_LEFTCURLYBRACKET);
			setState(545);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADDITIONAL_LITERAL_AT) | (1L << KEYWORDS_BOOLEAN) | (1L << KEYWORDS_BYTE) | (1L << KEYWORDS_CHAR) | (1L << KEYWORDS_DOUBLE) | (1L << KEYWORDS_FLOAT) | (1L << KEYWORDS_INT) | (1L << KEYWORDS_LONG) | (1L << KEYWORDS_NEW) | (1L << KEYWORDS_SHORT) | (1L << KEYWORDS_SUPER) | (1L << KEYWORDS_THIS) | (1L << KEYWORDS_VOID) | (1L << IDENTIFIERS) | (1L << LITERALS_NUMERIC_INT) | (1L << LITERALS_NUMERIC_DOUBLE) | (1L << LITERALS_LOGICAL_BOOLEAN) | (1L << LITERALS_TEXTUAL_CHAR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LITERALS_TEXTUAL_STRING - 64)) | (1L << (LITERALS_REFERENCE_NULL - 64)) | (1L << (OPERATORS_LESSTHAN - 64)) | (1L << (OPERATORS_LOGICALNOT - 64)) | (1L << (OPERATORS_INCREMENT - 64)) | (1L << (OPERATORS_DECREMENT - 64)) | (1L << (OPERATORS_ADDITION - 64)) | (1L << (OPERATORS_SUBTRACTION - 64)) | (1L << (OPERATORS_BITWISENOT - 64)) | (1L << (SEPARATORS_DELIMITERS_LEFTPARENTHESIS - 64)) | (1L << (SEPARATORS_DELIMITERS_LEFTCURLYBRACKET - 64)))) != 0)) {
				{
				setState(534); variableInitializer();
				setState(539);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(535); match(SEPARATORS_PUNCTUATORS_COMMA);
						setState(536); variableInitializer();
						}
						} 
					}
					setState(541);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				}
				setState(543);
				_la = _input.LA(1);
				if (_la==SEPARATORS_PUNCTUATORS_COMMA) {
					{
					setState(542); match(SEPARATORS_PUNCTUATORS_COMMA);
					}
				}

				}
			}

			setState(547); match(SEPARATORS_DELIMITERS_RIGHTCURLYBRACKET);
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

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TerminalNode IDENTIFIERS(int i) {
			return getToken(JavaGrammarParser.IDENTIFIERS, i);
		}
		public List<TerminalNode> IDENTIFIERS() { return getTokens(JavaGrammarParser.IDENTIFIERS); }
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitClassOrInterfaceType(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(549); match(IDENTIFIERS);
			setState(551);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(550); typeArguments();
				}
				break;
			}
			setState(560);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(553); match(SEPARATORS_PUNCTUATORS_DOT);
					setState(554); match(IDENTIFIERS);
					setState(556);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						setState(555); typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(562);
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
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public TerminalNode KEYWORDS_SUPER() { return getToken(JavaGrammarParser.KEYWORDS_SUPER, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode KEYWORDS_EXTENDS() { return getToken(JavaGrammarParser.KEYWORDS_EXTENDS, 0); }
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitTypeArgument(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_typeArgument);
		int _la;
		try {
			setState(569);
			switch (_input.LA(1)) {
			case ADDITIONAL_LITERAL_AT:
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
				setState(563); typeType();
				}
				break;
			case OPERATORS_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(564); match(OPERATORS_IF);
				setState(567);
				_la = _input.LA(1);
				if (_la==KEYWORDS_EXTENDS || _la==KEYWORDS_SUPER) {
					{
					setState(565);
					_la = _input.LA(1);
					if ( !(_la==KEYWORDS_EXTENDS || _la==KEYWORDS_SUPER) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(566); typeType();
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

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitQualifiedNameList(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571); qualifiedName();
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARATORS_PUNCTUATORS_COMMA) {
				{
				{
				setState(572); match(SEPARATORS_PUNCTUATORS_COMMA);
				setState(573); qualifiedName();
				}
				}
				setState(578);
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

	public static class FormalParametersContext extends ParserRuleContext {
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
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
		enterRule(_localctx, 80, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579); match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
			setState(581);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADDITIONAL_LITERAL_AT) | (1L << KEYWORDS_BOOLEAN) | (1L << KEYWORDS_BYTE) | (1L << KEYWORDS_CHAR) | (1L << KEYWORDS_DOUBLE) | (1L << KEYWORDS_FINAL) | (1L << KEYWORDS_FLOAT) | (1L << KEYWORDS_INT) | (1L << KEYWORDS_LONG) | (1L << KEYWORDS_SHORT) | (1L << IDENTIFIERS))) != 0)) {
				{
				setState(580); formalParameterList();
				}
			}

			setState(583); match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(598);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(585); formalParameter();
				setState(590);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(586); match(SEPARATORS_PUNCTUATORS_COMMA);
						setState(587); formalParameter();
						}
						} 
					}
					setState(592);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
				setState(595);
				_la = _input.LA(1);
				if (_la==SEPARATORS_PUNCTUATORS_COMMA) {
					{
					setState(593); match(SEPARATORS_PUNCTUATORS_COMMA);
					setState(594); lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(597); lastFormalParameter();
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
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
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
		enterRule(_localctx, 84, RULE_formalParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(600); variableModifier();
					}
					} 
				}
				setState(605);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			setState(606); typeType();
			setState(607); variableDeclaratorId();
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
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
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
		enterRule(_localctx, 86, RULE_lastFormalParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(609); variableModifier();
					}
					} 
				}
				setState(614);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			setState(615); typeType();
			setState(616); match(ADDITIONAL_LITERAL_ELLIPSIS);
			setState(617); variableDeclaratorId();
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIERS(int i) {
			return getToken(JavaGrammarParser.IDENTIFIERS, i);
		}
		public List<TerminalNode> IDENTIFIERS() { return getTokens(JavaGrammarParser.IDENTIFIERS); }
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitQualifiedName(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(619); match(IDENTIFIERS);
			setState(624);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(620); match(SEPARATORS_PUNCTUATORS_DOT);
					setState(621); match(IDENTIFIERS);
					}
					} 
				}
				setState(626);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode LITERALS_TEXTUAL_CHAR() { return getToken(JavaGrammarParser.LITERALS_TEXTUAL_CHAR, 0); }
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public TerminalNode LITERALS_LOGICAL_BOOLEAN() { return getToken(JavaGrammarParser.LITERALS_LOGICAL_BOOLEAN, 0); }
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public TerminalNode LITERALS_TEXTUAL_STRING() { return getToken(JavaGrammarParser.LITERALS_TEXTUAL_STRING, 0); }
		public TerminalNode LITERALS_REFERENCE_NULL() { return getToken(JavaGrammarParser.LITERALS_REFERENCE_NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_literal);
		try {
			setState(633);
			switch (_input.LA(1)) {
			case LITERALS_NUMERIC_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(627); integerLiteral();
				}
				break;
			case LITERALS_NUMERIC_DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(628); floatLiteral();
				}
				break;
			case LITERALS_TEXTUAL_CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(629); match(LITERALS_TEXTUAL_CHAR);
				}
				break;
			case LITERALS_TEXTUAL_STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(630); match(LITERALS_TEXTUAL_STRING);
				}
				break;
			case LITERALS_LOGICAL_BOOLEAN:
				enterOuterAlt(_localctx, 5);
				{
				setState(631); match(LITERALS_LOGICAL_BOOLEAN);
				}
				break;
			case LITERALS_REFERENCE_NULL:
				enterOuterAlt(_localctx, 6);
				{
				setState(632); match(LITERALS_REFERENCE_NULL);
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

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode LITERALS_NUMERIC_INT() { return getToken(JavaGrammarParser.LITERALS_NUMERIC_INT, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitIntegerLiteral(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635); match(LITERALS_NUMERIC_INT);
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

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode LITERALS_NUMERIC_DOUBLE() { return getToken(JavaGrammarParser.LITERALS_NUMERIC_DOUBLE, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitFloatLiteral(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_floatLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637); match(LITERALS_NUMERIC_DOUBLE);
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

	public static class AnnotationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639); match(ADDITIONAL_LITERAL_AT);
			setState(640); qualifiedName();
			setState(647);
			_la = _input.LA(1);
			if (_la==SEPARATORS_DELIMITERS_LEFTPARENTHESIS) {
				{
				setState(641); match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
				setState(644);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(642); elementValuePairs();
					}
					break;
				case 2:
					{
					setState(643); elementValue();
					}
					break;
				}
				setState(646); match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
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

	public static class ElementValuePairsContext extends ParserRuleContext {
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitElementValuePairs(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649); elementValuePair();
			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARATORS_PUNCTUATORS_COMMA) {
				{
				{
				setState(650); match(SEPARATORS_PUNCTUATORS_COMMA);
				setState(651); elementValuePair();
				}
				}
				setState(656);
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

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitElementValuePair(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657); match(IDENTIFIERS);
			setState(658); match(OPERATORS_ASSIGNMENT);
			setState(659); elementValue();
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

	public static class ElementValueContext extends ParserRuleContext {
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitElementValue(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_elementValue);
		try {
			setState(664);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(661); expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(662); annotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(663); elementValueArrayInitializer();
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

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitElementValueArrayInitializer(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(666); match(SEPARATORS_DELIMITERS_LEFTCURLYBRACKET);
			setState(675);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADDITIONAL_LITERAL_AT) | (1L << KEYWORDS_BOOLEAN) | (1L << KEYWORDS_BYTE) | (1L << KEYWORDS_CHAR) | (1L << KEYWORDS_DOUBLE) | (1L << KEYWORDS_FLOAT) | (1L << KEYWORDS_INT) | (1L << KEYWORDS_LONG) | (1L << KEYWORDS_NEW) | (1L << KEYWORDS_SHORT) | (1L << KEYWORDS_SUPER) | (1L << KEYWORDS_THIS) | (1L << KEYWORDS_VOID) | (1L << IDENTIFIERS) | (1L << LITERALS_NUMERIC_INT) | (1L << LITERALS_NUMERIC_DOUBLE) | (1L << LITERALS_LOGICAL_BOOLEAN) | (1L << LITERALS_TEXTUAL_CHAR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LITERALS_TEXTUAL_STRING - 64)) | (1L << (LITERALS_REFERENCE_NULL - 64)) | (1L << (OPERATORS_LESSTHAN - 64)) | (1L << (OPERATORS_LOGICALNOT - 64)) | (1L << (OPERATORS_INCREMENT - 64)) | (1L << (OPERATORS_DECREMENT - 64)) | (1L << (OPERATORS_ADDITION - 64)) | (1L << (OPERATORS_SUBTRACTION - 64)) | (1L << (OPERATORS_BITWISENOT - 64)) | (1L << (SEPARATORS_DELIMITERS_LEFTPARENTHESIS - 64)) | (1L << (SEPARATORS_DELIMITERS_LEFTCURLYBRACKET - 64)))) != 0)) {
				{
				setState(667); elementValue();
				setState(672);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(668); match(SEPARATORS_PUNCTUATORS_COMMA);
						setState(669); elementValue();
						}
						} 
					}
					setState(674);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				}
				}
			}

			setState(678);
			_la = _input.LA(1);
			if (_la==SEPARATORS_PUNCTUATORS_COMMA) {
				{
				setState(677); match(SEPARATORS_PUNCTUATORS_COMMA);
				}
			}

			setState(680); match(SEPARATORS_DELIMITERS_RIGHTCURLYBRACKET);
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

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public TerminalNode KEYWORDS_INTERFACE() { return getToken(JavaGrammarParser.KEYWORDS_INTERFACE, 0); }
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitAnnotationTypeDeclaration(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682); match(ADDITIONAL_LITERAL_AT);
			setState(683); match(KEYWORDS_INTERFACE);
			setState(684); match(IDENTIFIERS);
			setState(685); annotationTypeBody();
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

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitAnnotationTypeBody(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687); match(SEPARATORS_DELIMITERS_LEFTCURLYBRACKET);
			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADDITIONAL_LITERAL_AT) | (1L << KEYWORDS_ABSTRACT) | (1L << KEYWORDS_BOOLEAN) | (1L << KEYWORDS_BYTE) | (1L << KEYWORDS_CHAR) | (1L << KEYWORDS_CLASS) | (1L << KEYWORDS_DOUBLE) | (1L << KEYWORDS_FINAL) | (1L << KEYWORDS_FLOAT) | (1L << KEYWORDS_INT) | (1L << KEYWORDS_INTERFACE) | (1L << KEYWORDS_LONG) | (1L << KEYWORDS_PRIVATE) | (1L << KEYWORDS_PROTECTED) | (1L << KEYWORDS_PUBLIC) | (1L << KEYWORDS_SHORT) | (1L << KEYWORDS_STATIC) | (1L << KEYWORDS_STRICTFP) | (1L << KEYWORDS_SYNCHRONIZED) | (1L << IDENTIFIERS))) != 0) || _la==SEPARATORS_PUNCTUATORS_SEMICOLON) {
				{
				{
				setState(688); annotationTypeElementDeclaration();
				}
				}
				setState(693);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(694); match(SEPARATORS_DELIMITERS_RIGHTCURLYBRACKET);
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

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public AnnotationTypeElementRestContext annotationTypeElementRest() {
			return getRuleContext(AnnotationTypeElementRestContext.class,0);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitAnnotationTypeElementDeclaration(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_annotationTypeElementDeclaration);
		try {
			int _alt;
			setState(704);
			switch (_input.LA(1)) {
			case ADDITIONAL_LITERAL_AT:
			case KEYWORDS_ABSTRACT:
			case KEYWORDS_BOOLEAN:
			case KEYWORDS_BYTE:
			case KEYWORDS_CHAR:
			case KEYWORDS_CLASS:
			case KEYWORDS_DOUBLE:
			case KEYWORDS_FINAL:
			case KEYWORDS_FLOAT:
			case KEYWORDS_INT:
			case KEYWORDS_INTERFACE:
			case KEYWORDS_LONG:
			case KEYWORDS_PRIVATE:
			case KEYWORDS_PROTECTED:
			case KEYWORDS_PUBLIC:
			case KEYWORDS_SHORT:
			case KEYWORDS_STATIC:
			case KEYWORDS_STRICTFP:
			case KEYWORDS_SYNCHRONIZED:
			case IDENTIFIERS:
				enterOuterAlt(_localctx, 1);
				{
				setState(699);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(696); modifier();
						}
						} 
					}
					setState(701);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				}
				setState(702); annotationTypeElementRest();
				}
				break;
			case SEPARATORS_PUNCTUATORS_SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(703); match(SEPARATORS_PUNCTUATORS_SEMICOLON);
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

	public static class AnnotationTypeElementRestContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() {
			return getRuleContext(AnnotationMethodOrConstantRestContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public AnnotationTypeElementRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterAnnotationTypeElementRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitAnnotationTypeElementRest(this);
		}
	}

	public final AnnotationTypeElementRestContext annotationTypeElementRest() throws RecognitionException {
		AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_annotationTypeElementRest);
		try {
			setState(722);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(706); typeType();
				setState(707); annotationMethodOrConstantRest();
				setState(708); match(SEPARATORS_PUNCTUATORS_SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(710); classDeclaration();
				setState(712);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(711); match(SEPARATORS_PUNCTUATORS_SEMICOLON);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(714); interfaceDeclaration();
				setState(716);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(715); match(SEPARATORS_PUNCTUATORS_SEMICOLON);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(718); annotationTypeDeclaration();
				setState(720);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(719); match(SEPARATORS_PUNCTUATORS_SEMICOLON);
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

	public static class AnnotationMethodOrConstantRestContext extends ParserRuleContext {
		public AnnotationMethodRestContext annotationMethodRest() {
			return getRuleContext(AnnotationMethodRestContext.class,0);
		}
		public AnnotationConstantRestContext annotationConstantRest() {
			return getRuleContext(AnnotationConstantRestContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodOrConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterAnnotationMethodOrConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitAnnotationMethodOrConstantRest(this);
		}
	}

	public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() throws RecognitionException {
		AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_annotationMethodOrConstantRest);
		try {
			setState(726);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(724); annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(725); annotationConstantRest();
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

	public static class AnnotationMethodRestContext extends ParserRuleContext {
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationMethodRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterAnnotationMethodRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitAnnotationMethodRest(this);
		}
	}

	public final AnnotationMethodRestContext annotationMethodRest() throws RecognitionException {
		AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728); match(IDENTIFIERS);
			setState(729); match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
			setState(730); match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
			setState(732);
			_la = _input.LA(1);
			if (_la==KEYWORDS_DEFAULT) {
				{
				setState(731); defaultValue();
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

	public static class AnnotationConstantRestContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public AnnotationConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterAnnotationConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitAnnotationConstantRest(this);
		}
	}

	public final AnnotationConstantRestContext annotationConstantRest() throws RecognitionException {
		AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734); variableDeclarators();
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

	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode KEYWORDS_DEFAULT() { return getToken(JavaGrammarParser.KEYWORDS_DEFAULT, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitDefaultValue(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736); match(KEYWORDS_DEFAULT);
			setState(737); elementValue();
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

	public static class BlockContext extends ParserRuleContext {
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
		enterRule(_localctx, 122, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739); match(SEPARATORS_DELIMITERS_LEFTCURLYBRACKET);
			setState(743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADDITIONAL_LITERAL_AT) | (1L << KEYWORDS_ABSTRACT) | (1L << KEYWORDS_ASSERT) | (1L << KEYWORDS_BOOLEAN) | (1L << KEYWORDS_BREAK) | (1L << KEYWORDS_BYTE) | (1L << KEYWORDS_CHAR) | (1L << KEYWORDS_CLASS) | (1L << KEYWORDS_CONTINUE) | (1L << KEYWORDS_DO) | (1L << KEYWORDS_DOUBLE) | (1L << KEYWORDS_FINAL) | (1L << KEYWORDS_FLOAT) | (1L << KEYWORDS_FOR) | (1L << KEYWORDS_IF) | (1L << KEYWORDS_INT) | (1L << KEYWORDS_INTERFACE) | (1L << KEYWORDS_LONG) | (1L << KEYWORDS_NEW) | (1L << KEYWORDS_PRIVATE) | (1L << KEYWORDS_PROTECTED) | (1L << KEYWORDS_PUBLIC) | (1L << KEYWORDS_RETURN) | (1L << KEYWORDS_SHORT) | (1L << KEYWORDS_STATIC) | (1L << KEYWORDS_STRICTFP) | (1L << KEYWORDS_SUPER) | (1L << KEYWORDS_SYNCHRONIZED) | (1L << KEYWORDS_SWITCH) | (1L << KEYWORDS_THIS) | (1L << KEYWORDS_THROW) | (1L << KEYWORDS_TRY) | (1L << KEYWORDS_VOID) | (1L << KEYWORDS_WHILE) | (1L << IDENTIFIERS) | (1L << LITERALS_NUMERIC_INT) | (1L << LITERALS_NUMERIC_DOUBLE) | (1L << LITERALS_LOGICAL_BOOLEAN) | (1L << LITERALS_TEXTUAL_CHAR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LITERALS_TEXTUAL_STRING - 64)) | (1L << (LITERALS_REFERENCE_NULL - 64)) | (1L << (OPERATORS_LESSTHAN - 64)) | (1L << (OPERATORS_LOGICALNOT - 64)) | (1L << (OPERATORS_INCREMENT - 64)) | (1L << (OPERATORS_DECREMENT - 64)) | (1L << (OPERATORS_ADDITION - 64)) | (1L << (OPERATORS_SUBTRACTION - 64)) | (1L << (OPERATORS_BITWISENOT - 64)) | (1L << (SEPARATORS_PUNCTUATORS_SEMICOLON - 64)) | (1L << (SEPARATORS_DELIMITERS_LEFTPARENTHESIS - 64)) | (1L << (SEPARATORS_DELIMITERS_LEFTCURLYBRACKET - 64)))) != 0)) {
				{
				{
				setState(740); blockStatement();
				}
				}
				setState(745);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(746); match(SEPARATORS_DELIMITERS_RIGHTCURLYBRACKET);
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
		public LocalTypeDeclarationContext localTypeDeclaration() {
			return getRuleContext(LocalTypeDeclarationContext.class,0);
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
		enterRule(_localctx, 124, RULE_blockStatement);
		try {
			setState(753);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(748); localVariableDeclaration();
				setState(749); match(SEPARATORS_PUNCTUATORS_SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(751); statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(752); localTypeDeclaration();
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
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
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
		enterRule(_localctx, 126, RULE_localVariableDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(755); variableModifier();
					}
					} 
				}
				setState(760);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			}
			setState(761); typeType();
			setState(762); variableDeclarators();
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

	public static class LocalTypeDeclarationContext extends ParserRuleContext {
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public LocalTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterLocalTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitLocalTypeDeclaration(this);
		}
	}

	public final LocalTypeDeclarationContext localTypeDeclaration() throws RecognitionException {
		LocalTypeDeclarationContext _localctx = new LocalTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_localTypeDeclaration);
		int _la;
		try {
			setState(775);
			switch (_input.LA(1)) {
			case ADDITIONAL_LITERAL_AT:
			case KEYWORDS_ABSTRACT:
			case KEYWORDS_CLASS:
			case KEYWORDS_FINAL:
			case KEYWORDS_INTERFACE:
			case KEYWORDS_PRIVATE:
			case KEYWORDS_PROTECTED:
			case KEYWORDS_PUBLIC:
			case KEYWORDS_STATIC:
			case KEYWORDS_STRICTFP:
				enterOuterAlt(_localctx, 1);
				{
				setState(767);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADDITIONAL_LITERAL_AT) | (1L << KEYWORDS_ABSTRACT) | (1L << KEYWORDS_FINAL) | (1L << KEYWORDS_PRIVATE) | (1L << KEYWORDS_PROTECTED) | (1L << KEYWORDS_PUBLIC) | (1L << KEYWORDS_STATIC) | (1L << KEYWORDS_STRICTFP))) != 0)) {
					{
					{
					setState(764); classOrInterfaceModifier();
					}
					}
					setState(769);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(772);
				switch (_input.LA(1)) {
				case KEYWORDS_CLASS:
					{
					setState(770); classDeclaration();
					}
					break;
				case KEYWORDS_INTERFACE:
					{
					setState(771); interfaceDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SEPARATORS_PUNCTUATORS_SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(774); match(SEPARATORS_PUNCTUATORS_SEMICOLON);
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

	public static class StatementContext extends ParserRuleContext {
		public BlockContext blockLabel;
		public ExpressionContext statementExpression;
		public Token identifierLabel;
		public TerminalNode KEYWORDS_FOR() { return getToken(JavaGrammarParser.KEYWORDS_FOR, 0); }
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public TerminalNode KEYWORDS_IF() { return getToken(JavaGrammarParser.KEYWORDS_IF, 0); }
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public TerminalNode KEYWORDS_TRY() { return getToken(JavaGrammarParser.KEYWORDS_TRY, 0); }
		public TerminalNode KEYWORDS_RETURN() { return getToken(JavaGrammarParser.KEYWORDS_RETURN, 0); }
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public TerminalNode KEYWORDS_CONTINUE() { return getToken(JavaGrammarParser.KEYWORDS_CONTINUE, 0); }
		public TerminalNode KEYWORDS_WHILE() { return getToken(JavaGrammarParser.KEYWORDS_WHILE, 0); }
		public TerminalNode KEYWORDS_THROW() { return getToken(JavaGrammarParser.KEYWORDS_THROW, 0); }
		public TerminalNode KEYWORDS_SWITCH() { return getToken(JavaGrammarParser.KEYWORDS_SWITCH, 0); }
		public TerminalNode KEYWORDS_BREAK() { return getToken(JavaGrammarParser.KEYWORDS_BREAK, 0); }
		public TerminalNode KEYWORDS_DO() { return getToken(JavaGrammarParser.KEYWORDS_DO, 0); }
		public TerminalNode KEYWORDS_ELSE() { return getToken(JavaGrammarParser.KEYWORDS_ELSE, 0); }
		public TerminalNode KEYWORDS_SYNCHRONIZED() { return getToken(JavaGrammarParser.KEYWORDS_SYNCHRONIZED, 0); }
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode KEYWORDS_ASSERT() { return getToken(JavaGrammarParser.KEYWORDS_ASSERT, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
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
		enterRule(_localctx, 130, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(880);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(777); ((StatementContext)_localctx).blockLabel = block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(778); match(KEYWORDS_ASSERT);
				setState(779); expression(0);
				setState(782);
				_la = _input.LA(1);
				if (_la==OPERATORS_ELSE) {
					{
					setState(780); match(OPERATORS_ELSE);
					setState(781); expression(0);
					}
				}

				setState(784); match(SEPARATORS_PUNCTUATORS_SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(786); match(KEYWORDS_IF);
				setState(787); parExpression();
				setState(788); statement();
				setState(791);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(789); match(KEYWORDS_ELSE);
					setState(790); statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(793); match(KEYWORDS_FOR);
				setState(794); match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
				setState(795); forControl();
				setState(796); match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
				setState(797); statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(799); match(KEYWORDS_WHILE);
				setState(800); parExpression();
				setState(801); statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(803); match(KEYWORDS_DO);
				setState(804); statement();
				setState(805); match(KEYWORDS_WHILE);
				setState(806); parExpression();
				setState(807); match(SEPARATORS_PUNCTUATORS_SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(809); match(KEYWORDS_TRY);
				setState(810); block();
				setState(820);
				switch (_input.LA(1)) {
				case KEYWORDS_CATCH:
					{
					setState(812); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(811); catchClause();
						}
						}
						setState(814); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==KEYWORDS_CATCH );
					setState(817);
					_la = _input.LA(1);
					if (_la==KEYWORDS_FINALLY) {
						{
						setState(816); finallyBlock();
						}
					}

					}
					break;
				case KEYWORDS_FINALLY:
					{
					setState(819); finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(822); match(KEYWORDS_TRY);
				setState(823); resourceSpecification();
				setState(824); block();
				setState(828);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==KEYWORDS_CATCH) {
					{
					{
					setState(825); catchClause();
					}
					}
					setState(830);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(832);
				_la = _input.LA(1);
				if (_la==KEYWORDS_FINALLY) {
					{
					setState(831); finallyBlock();
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(834); match(KEYWORDS_SWITCH);
				setState(835); parExpression();
				setState(836); match(SEPARATORS_DELIMITERS_LEFTCURLYBRACKET);
				setState(840);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(837); switchBlockStatementGroup();
						}
						} 
					}
					setState(842);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				}
				setState(846);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==KEYWORDS_CASE || _la==KEYWORDS_DEFAULT) {
					{
					{
					setState(843); switchLabel();
					}
					}
					setState(848);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(849); match(SEPARATORS_DELIMITERS_RIGHTCURLYBRACKET);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(851); match(KEYWORDS_SYNCHRONIZED);
				setState(852); parExpression();
				setState(853); block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(855); match(KEYWORDS_RETURN);
				setState(857);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADDITIONAL_LITERAL_AT) | (1L << KEYWORDS_BOOLEAN) | (1L << KEYWORDS_BYTE) | (1L << KEYWORDS_CHAR) | (1L << KEYWORDS_DOUBLE) | (1L << KEYWORDS_FLOAT) | (1L << KEYWORDS_INT) | (1L << KEYWORDS_LONG) | (1L << KEYWORDS_NEW) | (1L << KEYWORDS_SHORT) | (1L << KEYWORDS_SUPER) | (1L << KEYWORDS_THIS) | (1L << KEYWORDS_VOID) | (1L << IDENTIFIERS) | (1L << LITERALS_NUMERIC_INT) | (1L << LITERALS_NUMERIC_DOUBLE) | (1L << LITERALS_LOGICAL_BOOLEAN) | (1L << LITERALS_TEXTUAL_CHAR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LITERALS_TEXTUAL_STRING - 64)) | (1L << (LITERALS_REFERENCE_NULL - 64)) | (1L << (OPERATORS_LESSTHAN - 64)) | (1L << (OPERATORS_LOGICALNOT - 64)) | (1L << (OPERATORS_INCREMENT - 64)) | (1L << (OPERATORS_DECREMENT - 64)) | (1L << (OPERATORS_ADDITION - 64)) | (1L << (OPERATORS_SUBTRACTION - 64)) | (1L << (OPERATORS_BITWISENOT - 64)) | (1L << (SEPARATORS_DELIMITERS_LEFTPARENTHESIS - 64)))) != 0)) {
					{
					setState(856); expression(0);
					}
				}

				setState(859); match(SEPARATORS_PUNCTUATORS_SEMICOLON);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(860); match(KEYWORDS_THROW);
				setState(861); expression(0);
				setState(862); match(SEPARATORS_PUNCTUATORS_SEMICOLON);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(864); match(KEYWORDS_BREAK);
				setState(866);
				_la = _input.LA(1);
				if (_la==IDENTIFIERS) {
					{
					setState(865); match(IDENTIFIERS);
					}
				}

				setState(868); match(SEPARATORS_PUNCTUATORS_SEMICOLON);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(869); match(KEYWORDS_CONTINUE);
				setState(871);
				_la = _input.LA(1);
				if (_la==IDENTIFIERS) {
					{
					setState(870); match(IDENTIFIERS);
					}
				}

				setState(873); match(SEPARATORS_PUNCTUATORS_SEMICOLON);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(874); ((StatementContext)_localctx).statementExpression = expression(0);
				setState(875); match(SEPARATORS_PUNCTUATORS_SEMICOLON);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(877); ((StatementContext)_localctx).identifierLabel = match(IDENTIFIERS);
				setState(878); match(OPERATORS_ELSE);
				setState(879); statement();
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

	public static class CatchClauseContext extends ParserRuleContext {
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public TerminalNode KEYWORDS_CATCH() { return getToken(JavaGrammarParser.KEYWORDS_CATCH, 0); }
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882); match(KEYWORDS_CATCH);
			setState(883); match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
			setState(887);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADDITIONAL_LITERAL_AT || _la==KEYWORDS_FINAL) {
				{
				{
				setState(884); variableModifier();
				}
				}
				setState(889);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(890); catchType();
			setState(891); match(IDENTIFIERS);
			setState(892); match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
			setState(893); block();
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

	public static class CatchTypeContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitCatchType(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(895); qualifiedName();
			setState(900);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERATORS_BITWISEOR) {
				{
				{
				setState(896); match(OPERATORS_BITWISEOR);
				setState(897); qualifiedName();
				}
				}
				setState(902);
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

	public static class FinallyBlockContext extends ParserRuleContext {
		public TerminalNode KEYWORDS_FINALLY() { return getToken(JavaGrammarParser.KEYWORDS_FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitFinallyBlock(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(903); match(KEYWORDS_FINALLY);
			setState(904); block();
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

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitResourceSpecification(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(906); match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
			setState(907); resources();
			setState(909);
			_la = _input.LA(1);
			if (_la==SEPARATORS_PUNCTUATORS_SEMICOLON) {
				{
				setState(908); match(SEPARATORS_PUNCTUATORS_SEMICOLON);
				}
			}

			setState(911); match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
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

	public static class ResourcesContext extends ParserRuleContext {
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitResources(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(913); resource();
			setState(918);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(914); match(SEPARATORS_PUNCTUATORS_SEMICOLON);
					setState(915); resource();
					}
					} 
				}
				setState(920);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
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

	public static class ResourceContext extends ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitResource(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADDITIONAL_LITERAL_AT || _la==KEYWORDS_FINAL) {
				{
				{
				setState(921); variableModifier();
				}
				}
				setState(926);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(927); classOrInterfaceType();
			setState(928); variableDeclaratorId();
			setState(929); match(OPERATORS_ASSIGNMENT);
			setState(930); expression(0);
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

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitSwitchBlockStatementGroup(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(932); switchLabel();
				}
				}
				setState(935); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KEYWORDS_CASE || _la==KEYWORDS_DEFAULT );
			setState(938); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(937); blockStatement();
				}
				}
				setState(940); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADDITIONAL_LITERAL_AT) | (1L << KEYWORDS_ABSTRACT) | (1L << KEYWORDS_ASSERT) | (1L << KEYWORDS_BOOLEAN) | (1L << KEYWORDS_BREAK) | (1L << KEYWORDS_BYTE) | (1L << KEYWORDS_CHAR) | (1L << KEYWORDS_CLASS) | (1L << KEYWORDS_CONTINUE) | (1L << KEYWORDS_DO) | (1L << KEYWORDS_DOUBLE) | (1L << KEYWORDS_FINAL) | (1L << KEYWORDS_FLOAT) | (1L << KEYWORDS_FOR) | (1L << KEYWORDS_IF) | (1L << KEYWORDS_INT) | (1L << KEYWORDS_INTERFACE) | (1L << KEYWORDS_LONG) | (1L << KEYWORDS_NEW) | (1L << KEYWORDS_PRIVATE) | (1L << KEYWORDS_PROTECTED) | (1L << KEYWORDS_PUBLIC) | (1L << KEYWORDS_RETURN) | (1L << KEYWORDS_SHORT) | (1L << KEYWORDS_STATIC) | (1L << KEYWORDS_STRICTFP) | (1L << KEYWORDS_SUPER) | (1L << KEYWORDS_SYNCHRONIZED) | (1L << KEYWORDS_SWITCH) | (1L << KEYWORDS_THIS) | (1L << KEYWORDS_THROW) | (1L << KEYWORDS_TRY) | (1L << KEYWORDS_VOID) | (1L << KEYWORDS_WHILE) | (1L << IDENTIFIERS) | (1L << LITERALS_NUMERIC_INT) | (1L << LITERALS_NUMERIC_DOUBLE) | (1L << LITERALS_LOGICAL_BOOLEAN) | (1L << LITERALS_TEXTUAL_CHAR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LITERALS_TEXTUAL_STRING - 64)) | (1L << (LITERALS_REFERENCE_NULL - 64)) | (1L << (OPERATORS_LESSTHAN - 64)) | (1L << (OPERATORS_LOGICALNOT - 64)) | (1L << (OPERATORS_INCREMENT - 64)) | (1L << (OPERATORS_DECREMENT - 64)) | (1L << (OPERATORS_ADDITION - 64)) | (1L << (OPERATORS_SUBTRACTION - 64)) | (1L << (OPERATORS_BITWISENOT - 64)) | (1L << (SEPARATORS_PUNCTUATORS_SEMICOLON - 64)) | (1L << (SEPARATORS_DELIMITERS_LEFTPARENTHESIS - 64)) | (1L << (SEPARATORS_DELIMITERS_LEFTCURLYBRACKET - 64)))) != 0) );
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
		public ExpressionContext constantExpression;
		public TerminalNode KEYWORDS_DEFAULT() { return getToken(JavaGrammarParser.KEYWORDS_DEFAULT, 0); }
		public TerminalNode KEYWORDS_CASE() { return getToken(JavaGrammarParser.KEYWORDS_CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 146, RULE_switchLabel);
		try {
			setState(948);
			switch (_input.LA(1)) {
			case KEYWORDS_CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(942); match(KEYWORDS_CASE);
				{
				setState(943); ((SwitchLabelContext)_localctx).constantExpression = expression(0);
				}
				setState(944); match(OPERATORS_ELSE);
				}
				break;
			case KEYWORDS_DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(946); match(KEYWORDS_DEFAULT);
				setState(947); match(OPERATORS_ELSE);
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

	public static class ForControlContext extends ParserRuleContext {
		public ExpressionListContext forUpdate;
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitForControl(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_forControl);
		int _la;
		try {
			setState(962);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(950); enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(952);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADDITIONAL_LITERAL_AT) | (1L << KEYWORDS_BOOLEAN) | (1L << KEYWORDS_BYTE) | (1L << KEYWORDS_CHAR) | (1L << KEYWORDS_DOUBLE) | (1L << KEYWORDS_FINAL) | (1L << KEYWORDS_FLOAT) | (1L << KEYWORDS_INT) | (1L << KEYWORDS_LONG) | (1L << KEYWORDS_NEW) | (1L << KEYWORDS_SHORT) | (1L << KEYWORDS_SUPER) | (1L << KEYWORDS_THIS) | (1L << KEYWORDS_VOID) | (1L << IDENTIFIERS) | (1L << LITERALS_NUMERIC_INT) | (1L << LITERALS_NUMERIC_DOUBLE) | (1L << LITERALS_LOGICAL_BOOLEAN) | (1L << LITERALS_TEXTUAL_CHAR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LITERALS_TEXTUAL_STRING - 64)) | (1L << (LITERALS_REFERENCE_NULL - 64)) | (1L << (OPERATORS_LESSTHAN - 64)) | (1L << (OPERATORS_LOGICALNOT - 64)) | (1L << (OPERATORS_INCREMENT - 64)) | (1L << (OPERATORS_DECREMENT - 64)) | (1L << (OPERATORS_ADDITION - 64)) | (1L << (OPERATORS_SUBTRACTION - 64)) | (1L << (OPERATORS_BITWISENOT - 64)) | (1L << (SEPARATORS_DELIMITERS_LEFTPARENTHESIS - 64)))) != 0)) {
					{
					setState(951); forInit();
					}
				}

				setState(954); match(SEPARATORS_PUNCTUATORS_SEMICOLON);
				setState(956);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADDITIONAL_LITERAL_AT) | (1L << KEYWORDS_BOOLEAN) | (1L << KEYWORDS_BYTE) | (1L << KEYWORDS_CHAR) | (1L << KEYWORDS_DOUBLE) | (1L << KEYWORDS_FLOAT) | (1L << KEYWORDS_INT) | (1L << KEYWORDS_LONG) | (1L << KEYWORDS_NEW) | (1L << KEYWORDS_SHORT) | (1L << KEYWORDS_SUPER) | (1L << KEYWORDS_THIS) | (1L << KEYWORDS_VOID) | (1L << IDENTIFIERS) | (1L << LITERALS_NUMERIC_INT) | (1L << LITERALS_NUMERIC_DOUBLE) | (1L << LITERALS_LOGICAL_BOOLEAN) | (1L << LITERALS_TEXTUAL_CHAR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LITERALS_TEXTUAL_STRING - 64)) | (1L << (LITERALS_REFERENCE_NULL - 64)) | (1L << (OPERATORS_LESSTHAN - 64)) | (1L << (OPERATORS_LOGICALNOT - 64)) | (1L << (OPERATORS_INCREMENT - 64)) | (1L << (OPERATORS_DECREMENT - 64)) | (1L << (OPERATORS_ADDITION - 64)) | (1L << (OPERATORS_SUBTRACTION - 64)) | (1L << (OPERATORS_BITWISENOT - 64)) | (1L << (SEPARATORS_DELIMITERS_LEFTPARENTHESIS - 64)))) != 0)) {
					{
					setState(955); expression(0);
					}
				}

				setState(958); match(SEPARATORS_PUNCTUATORS_SEMICOLON);
				setState(960);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADDITIONAL_LITERAL_AT) | (1L << KEYWORDS_BOOLEAN) | (1L << KEYWORDS_BYTE) | (1L << KEYWORDS_CHAR) | (1L << KEYWORDS_DOUBLE) | (1L << KEYWORDS_FLOAT) | (1L << KEYWORDS_INT) | (1L << KEYWORDS_LONG) | (1L << KEYWORDS_NEW) | (1L << KEYWORDS_SHORT) | (1L << KEYWORDS_SUPER) | (1L << KEYWORDS_THIS) | (1L << KEYWORDS_VOID) | (1L << IDENTIFIERS) | (1L << LITERALS_NUMERIC_INT) | (1L << LITERALS_NUMERIC_DOUBLE) | (1L << LITERALS_LOGICAL_BOOLEAN) | (1L << LITERALS_TEXTUAL_CHAR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LITERALS_TEXTUAL_STRING - 64)) | (1L << (LITERALS_REFERENCE_NULL - 64)) | (1L << (OPERATORS_LESSTHAN - 64)) | (1L << (OPERATORS_LOGICALNOT - 64)) | (1L << (OPERATORS_INCREMENT - 64)) | (1L << (OPERATORS_DECREMENT - 64)) | (1L << (OPERATORS_ADDITION - 64)) | (1L << (OPERATORS_SUBTRACTION - 64)) | (1L << (OPERATORS_BITWISENOT - 64)) | (1L << (SEPARATORS_DELIMITERS_LEFTPARENTHESIS - 64)))) != 0)) {
					{
					setState(959); ((ForControlContext)_localctx).forUpdate = expressionList();
					}
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
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
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
		enterRule(_localctx, 150, RULE_forInit);
		try {
			setState(966);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(964); localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(965); expressionList();
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

	public static class EnhancedForControlContext extends ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitEnhancedForControl(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_enhancedForControl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(971);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(968); variableModifier();
					}
					} 
				}
				setState(973);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			}
			setState(974); typeType();
			setState(975); variableDeclaratorId();
			setState(976); match(OPERATORS_ELSE);
			setState(977); expression(0);
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

	public static class ParExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitParExpression(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(979); match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
			setState(980); expression(0);
			setState(981); match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(983); expression(0);
			setState(988);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARATORS_PUNCTUATORS_COMMA) {
				{
				{
				setState(984); match(SEPARATORS_PUNCTUATORS_COMMA);
				setState(985); expression(0);
				}
				}
				setState(990);
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

	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitMethodCall(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(991); match(IDENTIFIERS);
			setState(992); match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
			setState(994);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADDITIONAL_LITERAL_AT) | (1L << KEYWORDS_BOOLEAN) | (1L << KEYWORDS_BYTE) | (1L << KEYWORDS_CHAR) | (1L << KEYWORDS_DOUBLE) | (1L << KEYWORDS_FLOAT) | (1L << KEYWORDS_INT) | (1L << KEYWORDS_LONG) | (1L << KEYWORDS_NEW) | (1L << KEYWORDS_SHORT) | (1L << KEYWORDS_SUPER) | (1L << KEYWORDS_THIS) | (1L << KEYWORDS_VOID) | (1L << IDENTIFIERS) | (1L << LITERALS_NUMERIC_INT) | (1L << LITERALS_NUMERIC_DOUBLE) | (1L << LITERALS_LOGICAL_BOOLEAN) | (1L << LITERALS_TEXTUAL_CHAR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LITERALS_TEXTUAL_STRING - 64)) | (1L << (LITERALS_REFERENCE_NULL - 64)) | (1L << (OPERATORS_LESSTHAN - 64)) | (1L << (OPERATORS_LOGICALNOT - 64)) | (1L << (OPERATORS_INCREMENT - 64)) | (1L << (OPERATORS_DECREMENT - 64)) | (1L << (OPERATORS_ADDITION - 64)) | (1L << (OPERATORS_SUBTRACTION - 64)) | (1L << (OPERATORS_BITWISENOT - 64)) | (1L << (SEPARATORS_DELIMITERS_LEFTPARENTHESIS - 64)))) != 0)) {
				{
				setState(993); expressionList();
				}
			}

			setState(996); match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
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
		public Token prefix;
		public Token bop;
		public Token postfix;
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public TerminalNode KEYWORDS_SUPER() { return getToken(JavaGrammarParser.KEYWORDS_SUPER, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public TerminalNode KEYWORDS_INSTANCEOF() { return getToken(JavaGrammarParser.KEYWORDS_INSTANCEOF, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public TerminalNode KEYWORDS_THIS() { return getToken(JavaGrammarParser.KEYWORDS_THIS, 0); }
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode KEYWORDS_NEW() { return getToken(JavaGrammarParser.KEYWORDS_NEW, 0); }
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
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
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 160;
		enterRecursionRule(_localctx, 160, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1029);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(999); match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
				setState(1000); typeType();
				setState(1001); match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
				setState(1002); expression(21);
				}
				break;
			case 2:
				{
				setState(1004);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (OPERATORS_INCREMENT - 78)) | (1L << (OPERATORS_DECREMENT - 78)) | (1L << (OPERATORS_ADDITION - 78)) | (1L << (OPERATORS_SUBTRACTION - 78)))) != 0)) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(1005); expression(19);
				}
				break;
			case 3:
				{
				setState(1006);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==OPERATORS_LOGICALNOT || _la==OPERATORS_BITWISENOT) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(1007); expression(18);
				}
				break;
			case 4:
				{
				setState(1008); primary();
				}
				break;
			case 5:
				{
				setState(1009); methodCall();
				}
				break;
			case 6:
				{
				setState(1010); match(KEYWORDS_NEW);
				setState(1011); creator();
				}
				break;
			case 7:
				{
				setState(1012); lambdaExpression();
				}
				break;
			case 8:
				{
				setState(1013); typeType();
				setState(1014); match(T__1);
				setState(1020);
				switch (_input.LA(1)) {
				case IDENTIFIERS:
				case OPERATORS_LESSTHAN:
					{
					setState(1016);
					_la = _input.LA(1);
					if (_la==OPERATORS_LESSTHAN) {
						{
						setState(1015); typeArguments();
						}
					}

					setState(1018); match(IDENTIFIERS);
					}
					break;
				case KEYWORDS_NEW:
					{
					setState(1019); match(KEYWORDS_NEW);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 9:
				{
				setState(1022); classType();
				setState(1023); match(T__1);
				setState(1025);
				_la = _input.LA(1);
				if (_la==OPERATORS_LESSTHAN) {
					{
					setState(1024); typeArguments();
					}
				}

				setState(1027); match(KEYWORDS_NEW);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1109);
					switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1031);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1032);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (OPERATORS_MULTIPLICATION - 82)) | (1L << (OPERATORS_DIVISION - 82)) | (1L << (OPERATORS_MODULO - 82)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(1033); expression(18);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1034);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1035);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==OPERATORS_ADDITION || _la==OPERATORS_SUBTRACTION) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(1036); expression(17);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1037);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1045);
						switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
						case 1:
							{
							setState(1038); match(OPERATORS_LESSTHAN);
							setState(1039); match(OPERATORS_LESSTHAN);
							}
							break;
						case 2:
							{
							setState(1040); match(OPERATORS_GREATERTHAN);
							setState(1041); match(OPERATORS_GREATERTHAN);
							setState(1042); match(OPERATORS_GREATERTHAN);
							}
							break;
						case 3:
							{
							setState(1043); match(OPERATORS_GREATERTHAN);
							setState(1044); match(OPERATORS_GREATERTHAN);
							}
							break;
						}
						setState(1047); expression(16);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1048);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1049);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (OPERATORS_GREATERTHAN - 69)) | (1L << (OPERATORS_LESSTHAN - 69)) | (1L << (OPERATORS_LESSTHANOREQUAL - 69)) | (1L << (OPERATORS_GREATERTHANOREQUAL - 69)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(1050); expression(15);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1051);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1052);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==OPERATORS_LOGICALEQUAL || _la==OPERATORS_LOGICALNOTEQUAL) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(1053); expression(13);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1054);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1055); ((ExpressionContext)_localctx).bop = match(OPERATORS_BITWISEAND);
						setState(1056); expression(12);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1057);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1058); ((ExpressionContext)_localctx).bop = match(OPERATORS_BITWISEXOR);
						setState(1059); expression(11);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1060);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1061); ((ExpressionContext)_localctx).bop = match(OPERATORS_BITWISEOR);
						setState(1062); expression(10);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1063);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1064); ((ExpressionContext)_localctx).bop = match(OPERATORS_LOGICALAND);
						setState(1065); expression(9);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1066);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1067); ((ExpressionContext)_localctx).bop = match(OPERATORS_LOGICALOR);
						setState(1068); expression(8);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1069);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1070); ((ExpressionContext)_localctx).bop = match(OPERATORS_IF);
						setState(1071); expression(0);
						setState(1072); match(OPERATORS_ELSE);
						setState(1073); expression(7);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1075);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1076);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (OPERATORS_ASSIGNMENT - 68)) | (1L << (OPERATORS_ADDITIONANDASSIGNMENT - 68)) | (1L << (OPERATORS_SUBTRACTIONANDASSIGNMENT - 68)) | (1L << (OPERATORS_MULTIPLICATIONANDASSIGNMENT - 68)) | (1L << (OPERATORS_DIVISIONANDASSIGNMENT - 68)) | (1L << (OPERATORS_MODULOANDASSIGMENT - 68)) | (1L << (OPERATORS_BITWISEANDASSIGNMENT - 68)) | (1L << (OPERATORS_BITWISEXORASSIGNMENT - 68)) | (1L << (OPERATORS_BITWISEORASSIGNMENT - 68)) | (1L << (OPERATORS_SHIFTLEFTASSIGNMENT - 68)) | (1L << (OPERATORS_SHIFTRIGHTASSIGNMENT - 68)) | (1L << (OPERATORS_SHIFTRIGHTUNSIGNEDASSIGNMENT - 68)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(1077); expression(5);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1078);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1079); ((ExpressionContext)_localctx).bop = match(SEPARATORS_PUNCTUATORS_DOT);
						setState(1091);
						switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
						case 1:
							{
							setState(1080); match(IDENTIFIERS);
							}
							break;
						case 2:
							{
							setState(1081); methodCall();
							}
							break;
						case 3:
							{
							setState(1082); match(KEYWORDS_THIS);
							}
							break;
						case 4:
							{
							setState(1083); match(KEYWORDS_NEW);
							setState(1085);
							_la = _input.LA(1);
							if (_la==OPERATORS_LESSTHAN) {
								{
								setState(1084); nonWildcardTypeArguments();
								}
							}

							setState(1087); innerCreator();
							}
							break;
						case 5:
							{
							setState(1088); match(KEYWORDS_SUPER);
							setState(1089); superSuffix();
							}
							break;
						case 6:
							{
							setState(1090); explicitGenericInvocation();
							}
							break;
						}
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1093);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1094); match(SEPARATORS_DELIMITERS_LEFTSQUAREBRACKET);
						setState(1095); expression(0);
						setState(1096); match(SEPARATORS_DELIMITERS_RIGHTSQUAREBRACKET);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1098);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1099);
						((ExpressionContext)_localctx).postfix = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==OPERATORS_INCREMENT || _la==OPERATORS_DECREMENT) ) {
							((ExpressionContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
						}
						consume();
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1100);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1101); ((ExpressionContext)_localctx).bop = match(KEYWORDS_INSTANCEOF);
						setState(1102); typeType();
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1103);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1104); match(T__1);
						setState(1106);
						_la = _input.LA(1);
						if (_la==OPERATORS_LESSTHAN) {
							{
							setState(1105); typeArguments();
							}
						}

						setState(1108); match(IDENTIFIERS);
						}
						break;
					}
					} 
				}
				setState(1113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
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

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitLambdaExpression(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1114); lambdaParameters();
			setState(1115); match(T__0);
			setState(1116); lambdaBody();
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

	public static class LambdaParametersContext extends ParserRuleContext {
		public TerminalNode IDENTIFIERS(int i) {
			return getToken(JavaGrammarParser.IDENTIFIERS, i);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public List<TerminalNode> IDENTIFIERS() { return getTokens(JavaGrammarParser.IDENTIFIERS); }
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitLambdaParameters(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_lambdaParameters);
		int _la;
		try {
			setState(1134);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1118); match(IDENTIFIERS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1119); match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
				setState(1121);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADDITIONAL_LITERAL_AT) | (1L << KEYWORDS_BOOLEAN) | (1L << KEYWORDS_BYTE) | (1L << KEYWORDS_CHAR) | (1L << KEYWORDS_DOUBLE) | (1L << KEYWORDS_FINAL) | (1L << KEYWORDS_FLOAT) | (1L << KEYWORDS_INT) | (1L << KEYWORDS_LONG) | (1L << KEYWORDS_SHORT) | (1L << IDENTIFIERS))) != 0)) {
					{
					setState(1120); formalParameterList();
					}
				}

				setState(1123); match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1124); match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
				setState(1125); match(IDENTIFIERS);
				setState(1130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEPARATORS_PUNCTUATORS_COMMA) {
					{
					{
					setState(1126); match(SEPARATORS_PUNCTUATORS_COMMA);
					setState(1127); match(IDENTIFIERS);
					}
					}
					setState(1132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1133); match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
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

	public static class LambdaBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterLambdaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitLambdaBody(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_lambdaBody);
		try {
			setState(1138);
			switch (_input.LA(1)) {
			case ADDITIONAL_LITERAL_AT:
			case KEYWORDS_BOOLEAN:
			case KEYWORDS_BYTE:
			case KEYWORDS_CHAR:
			case KEYWORDS_DOUBLE:
			case KEYWORDS_FLOAT:
			case KEYWORDS_INT:
			case KEYWORDS_LONG:
			case KEYWORDS_NEW:
			case KEYWORDS_SHORT:
			case KEYWORDS_SUPER:
			case KEYWORDS_THIS:
			case KEYWORDS_VOID:
			case IDENTIFIERS:
			case LITERALS_NUMERIC_INT:
			case LITERALS_NUMERIC_DOUBLE:
			case LITERALS_LOGICAL_BOOLEAN:
			case LITERALS_TEXTUAL_CHAR:
			case LITERALS_TEXTUAL_STRING:
			case LITERALS_REFERENCE_NULL:
			case OPERATORS_LESSTHAN:
			case OPERATORS_LOGICALNOT:
			case OPERATORS_INCREMENT:
			case OPERATORS_DECREMENT:
			case OPERATORS_ADDITION:
			case OPERATORS_SUBTRACTION:
			case OPERATORS_BITWISENOT:
			case SEPARATORS_DELIMITERS_LEFTPARENTHESIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1136); expression(0);
				}
				break;
			case SEPARATORS_DELIMITERS_LEFTCURLYBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(1137); block();
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

	public static class PrimaryContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public TerminalNode KEYWORDS_THIS() { return getToken(JavaGrammarParser.KEYWORDS_THIS, 0); }
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public TerminalNode KEYWORDS_SUPER() { return getToken(JavaGrammarParser.KEYWORDS_SUPER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode KEYWORDS_CLASS() { return getToken(JavaGrammarParser.KEYWORDS_CLASS, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 168, RULE_primary);
		try {
			setState(1158);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1140); match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
				setState(1141); expression(0);
				setState(1142); match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1144); match(KEYWORDS_THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1145); match(KEYWORDS_SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1146); literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1147); match(IDENTIFIERS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1148); typeTypeOrVoid();
				setState(1149); match(SEPARATORS_PUNCTUATORS_DOT);
				setState(1150); match(KEYWORDS_CLASS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1152); nonWildcardTypeArguments();
				setState(1156);
				switch (_input.LA(1)) {
				case KEYWORDS_SUPER:
				case IDENTIFIERS:
					{
					setState(1153); explicitGenericInvocationSuffix();
					}
					break;
				case KEYWORDS_THIS:
					{
					setState(1154); match(KEYWORDS_THIS);
					setState(1155); arguments();
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

	public static class ClassTypeContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitClassType(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_classType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1163);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(1160); classOrInterfaceType();
				setState(1161); match(SEPARATORS_PUNCTUATORS_DOT);
				}
				break;
			}
			setState(1168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADDITIONAL_LITERAL_AT) {
				{
				{
				setState(1165); annotation();
				}
				}
				setState(1170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1171); match(IDENTIFIERS);
			setState(1173);
			_la = _input.LA(1);
			if (_la==OPERATORS_LESSTHAN) {
				{
				setState(1172); typeArguments();
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

	public static class CreatorContext extends ParserRuleContext {
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitCreator(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_creator);
		try {
			setState(1184);
			switch (_input.LA(1)) {
			case OPERATORS_LESSTHAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1175); nonWildcardTypeArguments();
				setState(1176); createdName();
				setState(1177); classCreatorRest();
				}
				break;
			case KEYWORDS_BOOLEAN:
			case KEYWORDS_BYTE:
			case KEYWORDS_CHAR:
			case KEYWORDS_DOUBLE:
			case KEYWORDS_FLOAT:
			case KEYWORDS_INT:
			case KEYWORDS_LONG:
			case KEYWORDS_SHORT:
			case IDENTIFIERS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1179); createdName();
				setState(1182);
				switch (_input.LA(1)) {
				case SEPARATORS_DELIMITERS_LEFTSQUAREBRACKET:
					{
					setState(1180); arrayCreatorRest();
					}
					break;
				case SEPARATORS_DELIMITERS_LEFTPARENTHESIS:
					{
					setState(1181); classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class CreatedNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIERS(int i) {
			return getToken(JavaGrammarParser.IDENTIFIERS, i);
		}
		public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
			return getRuleContexts(TypeArgumentsOrDiamondContext.class);
		}
		public List<TerminalNode> IDENTIFIERS() { return getTokens(JavaGrammarParser.IDENTIFIERS); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitCreatedName(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_createdName);
		int _la;
		try {
			setState(1201);
			switch (_input.LA(1)) {
			case IDENTIFIERS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1186); match(IDENTIFIERS);
				setState(1188);
				_la = _input.LA(1);
				if (_la==OPERATORS_LESSTHAN) {
					{
					setState(1187); typeArgumentsOrDiamond();
					}
				}

				setState(1197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEPARATORS_PUNCTUATORS_DOT) {
					{
					{
					setState(1190); match(SEPARATORS_PUNCTUATORS_DOT);
					setState(1191); match(IDENTIFIERS);
					setState(1193);
					_la = _input.LA(1);
					if (_la==OPERATORS_LESSTHAN) {
						{
						setState(1192); typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(1199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case KEYWORDS_BOOLEAN:
			case KEYWORDS_BYTE:
			case KEYWORDS_CHAR:
			case KEYWORDS_DOUBLE:
			case KEYWORDS_FLOAT:
			case KEYWORDS_INT:
			case KEYWORDS_LONG:
			case KEYWORDS_SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1200); primitiveType();
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

	public static class InnerCreatorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterInnerCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitInnerCreator(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1203); match(IDENTIFIERS);
			setState(1205);
			_la = _input.LA(1);
			if (_la==OPERATORS_LESSTHAN) {
				{
				setState(1204); nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1207); classCreatorRest();
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

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitArrayCreatorRest(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1209); match(SEPARATORS_DELIMITERS_LEFTSQUAREBRACKET);
			setState(1237);
			switch (_input.LA(1)) {
			case SEPARATORS_DELIMITERS_RIGHTSQUAREBRACKET:
				{
				setState(1210); match(SEPARATORS_DELIMITERS_RIGHTSQUAREBRACKET);
				setState(1215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEPARATORS_DELIMITERS_LEFTSQUAREBRACKET) {
					{
					{
					setState(1211); match(SEPARATORS_DELIMITERS_LEFTSQUAREBRACKET);
					setState(1212); match(SEPARATORS_DELIMITERS_RIGHTSQUAREBRACKET);
					}
					}
					setState(1217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1218); arrayInitializer();
				}
				break;
			case ADDITIONAL_LITERAL_AT:
			case KEYWORDS_BOOLEAN:
			case KEYWORDS_BYTE:
			case KEYWORDS_CHAR:
			case KEYWORDS_DOUBLE:
			case KEYWORDS_FLOAT:
			case KEYWORDS_INT:
			case KEYWORDS_LONG:
			case KEYWORDS_NEW:
			case KEYWORDS_SHORT:
			case KEYWORDS_SUPER:
			case KEYWORDS_THIS:
			case KEYWORDS_VOID:
			case IDENTIFIERS:
			case LITERALS_NUMERIC_INT:
			case LITERALS_NUMERIC_DOUBLE:
			case LITERALS_LOGICAL_BOOLEAN:
			case LITERALS_TEXTUAL_CHAR:
			case LITERALS_TEXTUAL_STRING:
			case LITERALS_REFERENCE_NULL:
			case OPERATORS_LESSTHAN:
			case OPERATORS_LOGICALNOT:
			case OPERATORS_INCREMENT:
			case OPERATORS_DECREMENT:
			case OPERATORS_ADDITION:
			case OPERATORS_SUBTRACTION:
			case OPERATORS_BITWISENOT:
			case SEPARATORS_DELIMITERS_LEFTPARENTHESIS:
				{
				setState(1219); expression(0);
				setState(1220); match(SEPARATORS_DELIMITERS_RIGHTSQUAREBRACKET);
				setState(1227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1221); match(SEPARATORS_DELIMITERS_LEFTSQUAREBRACKET);
						setState(1222); expression(0);
						setState(1223); match(SEPARATORS_DELIMITERS_RIGHTSQUAREBRACKET);
						}
						} 
					}
					setState(1229);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
				}
				setState(1234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1230); match(SEPARATORS_DELIMITERS_LEFTSQUAREBRACKET);
						setState(1231); match(SEPARATORS_DELIMITERS_RIGHTSQUAREBRACKET);
						}
						} 
					}
					setState(1236);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				}
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

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitClassCreatorRest(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1239); arguments();
			setState(1241);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1240); classBody();
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

	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterExplicitGenericInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitExplicitGenericInvocation(this);
		}
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1243); nonWildcardTypeArguments();
			setState(1244); explicitGenericInvocationSuffix();
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
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
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
		enterRule(_localctx, 184, RULE_typeArgumentsOrDiamond);
		try {
			setState(1249);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1246); match(OPERATORS_LESSTHAN);
				setState(1247); match(OPERATORS_GREATERTHAN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1248); typeArguments();
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

	public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitNonWildcardTypeArgumentsOrDiamond(this);
		}
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1254);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1251); match(OPERATORS_LESSTHAN);
				setState(1252); match(OPERATORS_GREATERTHAN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1253); nonWildcardTypeArguments();
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

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitNonWildcardTypeArguments(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1256); match(OPERATORS_LESSTHAN);
			setState(1257); typeList();
			setState(1258); match(OPERATORS_GREATERTHAN);
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

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitTypeList(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1260); typeType();
			setState(1265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARATORS_PUNCTUATORS_COMMA) {
				{
				{
				setState(1261); match(SEPARATORS_PUNCTUATORS_COMMA);
				setState(1262); typeType();
				}
				}
				setState(1267);
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

	public static class TypeTypeContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitTypeType(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_typeType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1269);
			_la = _input.LA(1);
			if (_la==ADDITIONAL_LITERAL_AT) {
				{
				setState(1268); annotation();
				}
			}

			setState(1273);
			switch (_input.LA(1)) {
			case IDENTIFIERS:
				{
				setState(1271); classOrInterfaceType();
				}
				break;
			case KEYWORDS_BOOLEAN:
			case KEYWORDS_BYTE:
			case KEYWORDS_CHAR:
			case KEYWORDS_DOUBLE:
			case KEYWORDS_FLOAT:
			case KEYWORDS_INT:
			case KEYWORDS_LONG:
			case KEYWORDS_SHORT:
				{
				setState(1272); primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1275); match(SEPARATORS_DELIMITERS_LEFTSQUAREBRACKET);
					setState(1276); match(SEPARATORS_DELIMITERS_RIGHTSQUAREBRACKET);
					}
					} 
				}
				setState(1281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode KEYWORDS_FLOAT() { return getToken(JavaGrammarParser.KEYWORDS_FLOAT, 0); }
		public TerminalNode KEYWORDS_SHORT() { return getToken(JavaGrammarParser.KEYWORDS_SHORT, 0); }
		public TerminalNode KEYWORDS_BOOLEAN() { return getToken(JavaGrammarParser.KEYWORDS_BOOLEAN, 0); }
		public TerminalNode KEYWORDS_DOUBLE() { return getToken(JavaGrammarParser.KEYWORDS_DOUBLE, 0); }
		public TerminalNode KEYWORDS_CHAR() { return getToken(JavaGrammarParser.KEYWORDS_CHAR, 0); }
		public TerminalNode KEYWORDS_INT() { return getToken(JavaGrammarParser.KEYWORDS_INT, 0); }
		public TerminalNode KEYWORDS_BYTE() { return getToken(JavaGrammarParser.KEYWORDS_BYTE, 0); }
		public TerminalNode KEYWORDS_LONG() { return getToken(JavaGrammarParser.KEYWORDS_LONG, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1282);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORDS_BOOLEAN) | (1L << KEYWORDS_BYTE) | (1L << KEYWORDS_CHAR) | (1L << KEYWORDS_DOUBLE) | (1L << KEYWORDS_FLOAT) | (1L << KEYWORDS_INT) | (1L << KEYWORDS_LONG) | (1L << KEYWORDS_SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class TypeArgumentsContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1284); match(OPERATORS_LESSTHAN);
			setState(1285); typeArgument();
			setState(1290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARATORS_PUNCTUATORS_COMMA) {
				{
				{
				setState(1286); match(SEPARATORS_PUNCTUATORS_COMMA);
				setState(1287); typeArgument();
				}
				}
				setState(1292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1293); match(OPERATORS_GREATERTHAN);
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

	public static class SuperSuffixContext extends ParserRuleContext {
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterSuperSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitSuperSuffix(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_superSuffix);
		try {
			setState(1301);
			switch (_input.LA(1)) {
			case SEPARATORS_DELIMITERS_LEFTPARENTHESIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1295); arguments();
				}
				break;
			case SEPARATORS_PUNCTUATORS_DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1296); match(SEPARATORS_PUNCTUATORS_DOT);
				setState(1297); match(IDENTIFIERS);
				setState(1299);
				switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
				case 1:
					{
					setState(1298); arguments();
					}
					break;
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

	public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
		public TerminalNode IDENTIFIERS() { return getToken(JavaGrammarParser.IDENTIFIERS, 0); }
		public TerminalNode KEYWORDS_SUPER() { return getToken(JavaGrammarParser.KEYWORDS_SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocationSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterExplicitGenericInvocationSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitExplicitGenericInvocationSuffix(this);
		}
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_explicitGenericInvocationSuffix);
		try {
			setState(1307);
			switch (_input.LA(1)) {
			case KEYWORDS_SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1303); match(KEYWORDS_SUPER);
				setState(1304); superSuffix();
				}
				break;
			case IDENTIFIERS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1305); match(IDENTIFIERS);
				setState(1306); arguments();
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

	public static class ArgumentsContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1309); match(SEPARATORS_DELIMITERS_LEFTPARENTHESIS);
			setState(1311);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADDITIONAL_LITERAL_AT) | (1L << KEYWORDS_BOOLEAN) | (1L << KEYWORDS_BYTE) | (1L << KEYWORDS_CHAR) | (1L << KEYWORDS_DOUBLE) | (1L << KEYWORDS_FLOAT) | (1L << KEYWORDS_INT) | (1L << KEYWORDS_LONG) | (1L << KEYWORDS_NEW) | (1L << KEYWORDS_SHORT) | (1L << KEYWORDS_SUPER) | (1L << KEYWORDS_THIS) | (1L << KEYWORDS_VOID) | (1L << IDENTIFIERS) | (1L << LITERALS_NUMERIC_INT) | (1L << LITERALS_NUMERIC_DOUBLE) | (1L << LITERALS_LOGICAL_BOOLEAN) | (1L << LITERALS_TEXTUAL_CHAR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LITERALS_TEXTUAL_STRING - 64)) | (1L << (LITERALS_REFERENCE_NULL - 64)) | (1L << (OPERATORS_LESSTHAN - 64)) | (1L << (OPERATORS_LOGICALNOT - 64)) | (1L << (OPERATORS_INCREMENT - 64)) | (1L << (OPERATORS_DECREMENT - 64)) | (1L << (OPERATORS_ADDITION - 64)) | (1L << (OPERATORS_SUBTRACTION - 64)) | (1L << (OPERATORS_BITWISENOT - 64)) | (1L << (SEPARATORS_DELIMITERS_LEFTPARENTHESIS - 64)))) != 0)) {
				{
				setState(1310); expressionList();
				}
			}

			setState(1313); match(SEPARATORS_DELIMITERS_RIGHTPARENTHESIS);
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
		case 80: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 17);
		case 1: return precpred(_ctx, 16);
		case 2: return precpred(_ctx, 15);
		case 3: return precpred(_ctx, 14);
		case 4: return precpred(_ctx, 12);
		case 5: return precpred(_ctx, 11);
		case 6: return precpred(_ctx, 10);
		case 7: return precpred(_ctx, 9);
		case 8: return precpred(_ctx, 8);
		case 9: return precpred(_ctx, 7);
		case 10: return precpred(_ctx, 6);
		case 11: return precpred(_ctx, 5);
		case 12: return precpred(_ctx, 25);
		case 13: return precpred(_ctx, 24);
		case 14: return precpred(_ctx, 20);
		case 15: return precpred(_ctx, 13);
		case 16: return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3v\u0526\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\3\2\5\2\u00d0\n\2\3\2\7"+
		"\2\u00d3\n\2\f\2\16\2\u00d6\13\2\3\2\7\2\u00d9\n\2\f\2\16\2\u00dc\13\2"+
		"\3\2\3\2\3\3\7\3\u00e1\n\3\f\3\16\3\u00e4\13\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\5\4\u00ec\n\4\3\4\3\4\3\4\5\4\u00f1\n\4\3\4\3\4\3\5\7\5\u00f6\n\5\f\5"+
		"\16\5\u00f9\13\5\3\5\3\5\3\5\5\5\u00fe\n\5\3\5\5\5\u0101\n\5\3\6\3\6\5"+
		"\6\u0105\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u010f\n\7\3\b\3\b\5\b"+
		"\u0113\n\b\3\t\3\t\3\t\5\t\u0118\n\t\3\t\3\t\5\t\u011c\n\t\3\t\3\t\5\t"+
		"\u0120\n\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u0128\n\n\f\n\16\n\u012b\13\n\3"+
		"\n\3\n\3\13\7\13\u0130\n\13\f\13\16\13\u0133\13\13\3\13\3\13\3\13\5\13"+
		"\u0138\n\13\3\f\3\f\3\f\7\f\u013d\n\f\f\f\16\f\u0140\13\f\3\r\3\r\3\r"+
		"\5\r\u0145\n\r\3\r\3\r\5\r\u0149\n\r\3\r\3\r\3\16\3\16\7\16\u014f\n\16"+
		"\f\16\16\16\u0152\13\16\3\16\3\16\3\17\3\17\7\17\u0158\n\17\f\17\16\17"+
		"\u015b\13\17\3\17\3\17\3\20\3\20\5\20\u0161\n\20\3\20\3\20\7\20\u0165"+
		"\n\20\f\20\16\20\u0168\13\20\3\20\5\20\u016b\n\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u0175\n\21\3\22\5\22\u0178\n\22\3\22\5\22\u017b"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\7\22\u0182\n\22\f\22\16\22\u0185\13\22"+
		"\3\22\3\22\5\22\u0189\n\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\5\25"+
		"\u0193\n\25\3\26\3\26\5\26\u0197\n\26\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\5\31\u01a3\n\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33"+
		"\7\33\u01ac\n\33\f\33\16\33\u01af\13\33\3\33\3\33\5\33\u01b3\n\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\5\34\u01bb\n\34\3\35\3\35\3\35\3\35\7\35\u01c1"+
		"\n\35\f\35\16\35\u01c4\13\35\3\35\3\35\3\36\3\36\3\36\7\36\u01cb\n\36"+
		"\f\36\16\36\u01ce\13\36\3\36\3\36\3\36\3\37\7\37\u01d4\n\37\f\37\16\37"+
		"\u01d7\13\37\3\37\3\37\3\37\7\37\u01dc\n\37\f\37\16\37\u01df\13\37\3\37"+
		"\3\37\5\37\u01e3\n\37\3\37\3\37\3\37\3\37\7\37\u01e9\n\37\f\37\16\37\u01ec"+
		"\13\37\3\37\3\37\5\37\u01f0\n\37\3\37\3\37\3 \3 \3 \3 \3 \3 \5 \u01fa"+
		"\n \3!\3!\3!\3\"\3\"\3\"\7\"\u0202\n\"\f\"\16\"\u0205\13\"\3#\3#\3#\5"+
		"#\u020a\n#\3$\3$\3$\7$\u020f\n$\f$\16$\u0212\13$\3%\3%\5%\u0216\n%\3&"+
		"\3&\3&\3&\7&\u021c\n&\f&\16&\u021f\13&\3&\5&\u0222\n&\5&\u0224\n&\3&\3"+
		"&\3\'\3\'\5\'\u022a\n\'\3\'\3\'\3\'\5\'\u022f\n\'\7\'\u0231\n\'\f\'\16"+
		"\'\u0234\13\'\3(\3(\3(\3(\5(\u023a\n(\5(\u023c\n(\3)\3)\3)\7)\u0241\n"+
		")\f)\16)\u0244\13)\3*\3*\5*\u0248\n*\3*\3*\3+\3+\3+\7+\u024f\n+\f+\16"+
		"+\u0252\13+\3+\3+\5+\u0256\n+\3+\5+\u0259\n+\3,\7,\u025c\n,\f,\16,\u025f"+
		"\13,\3,\3,\3,\3-\7-\u0265\n-\f-\16-\u0268\13-\3-\3-\3-\3-\3.\3.\3.\7."+
		"\u0271\n.\f.\16.\u0274\13.\3/\3/\3/\3/\3/\3/\5/\u027c\n/\3\60\3\60\3\61"+
		"\3\61\3\62\3\62\3\62\3\62\3\62\5\62\u0287\n\62\3\62\5\62\u028a\n\62\3"+
		"\63\3\63\3\63\7\63\u028f\n\63\f\63\16\63\u0292\13\63\3\64\3\64\3\64\3"+
		"\64\3\65\3\65\3\65\5\65\u029b\n\65\3\66\3\66\3\66\3\66\7\66\u02a1\n\66"+
		"\f\66\16\66\u02a4\13\66\5\66\u02a6\n\66\3\66\5\66\u02a9\n\66\3\66\3\66"+
		"\3\67\3\67\3\67\3\67\3\67\38\38\78\u02b4\n8\f8\168\u02b7\138\38\38\39"+
		"\79\u02bc\n9\f9\169\u02bf\139\39\39\59\u02c3\n9\3:\3:\3:\3:\3:\3:\5:\u02cb"+
		"\n:\3:\3:\5:\u02cf\n:\3:\3:\5:\u02d3\n:\5:\u02d5\n:\3;\3;\5;\u02d9\n;"+
		"\3<\3<\3<\3<\5<\u02df\n<\3=\3=\3>\3>\3>\3?\3?\7?\u02e8\n?\f?\16?\u02eb"+
		"\13?\3?\3?\3@\3@\3@\3@\3@\5@\u02f4\n@\3A\7A\u02f7\nA\fA\16A\u02fa\13A"+
		"\3A\3A\3A\3B\7B\u0300\nB\fB\16B\u0303\13B\3B\3B\5B\u0307\nB\3B\5B\u030a"+
		"\nB\3C\3C\3C\3C\3C\5C\u0311\nC\3C\3C\3C\3C\3C\3C\3C\5C\u031a\nC\3C\3C"+
		"\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\6C\u032f\nC\rC\16"+
		"C\u0330\3C\5C\u0334\nC\3C\5C\u0337\nC\3C\3C\3C\3C\7C\u033d\nC\fC\16C\u0340"+
		"\13C\3C\5C\u0343\nC\3C\3C\3C\3C\7C\u0349\nC\fC\16C\u034c\13C\3C\7C\u034f"+
		"\nC\fC\16C\u0352\13C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u035c\nC\3C\3C\3C\3C\3"+
		"C\3C\3C\5C\u0365\nC\3C\3C\3C\5C\u036a\nC\3C\3C\3C\3C\3C\3C\3C\5C\u0373"+
		"\nC\3D\3D\3D\7D\u0378\nD\fD\16D\u037b\13D\3D\3D\3D\3D\3D\3E\3E\3E\7E\u0385"+
		"\nE\fE\16E\u0388\13E\3F\3F\3F\3G\3G\3G\5G\u0390\nG\3G\3G\3H\3H\3H\7H\u0397"+
		"\nH\fH\16H\u039a\13H\3I\7I\u039d\nI\fI\16I\u03a0\13I\3I\3I\3I\3I\3I\3"+
		"J\6J\u03a8\nJ\rJ\16J\u03a9\3J\6J\u03ad\nJ\rJ\16J\u03ae\3K\3K\3K\3K\3K"+
		"\3K\5K\u03b7\nK\3L\3L\5L\u03bb\nL\3L\3L\5L\u03bf\nL\3L\3L\5L\u03c3\nL"+
		"\5L\u03c5\nL\3M\3M\5M\u03c9\nM\3N\7N\u03cc\nN\fN\16N\u03cf\13N\3N\3N\3"+
		"N\3N\3N\3O\3O\3O\3O\3P\3P\3P\7P\u03dd\nP\fP\16P\u03e0\13P\3Q\3Q\3Q\5Q"+
		"\u03e5\nQ\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R"+
		"\5R\u03fb\nR\3R\3R\5R\u03ff\nR\3R\3R\3R\5R\u0404\nR\3R\3R\5R\u0408\nR"+
		"\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u0418\nR\3R\3R\3R\3R\3R"+
		"\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R"+
		"\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u0440\nR\3R\3R\3R\3R\5R\u0446\nR\3R"+
		"\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u0455\nR\3R\7R\u0458\nR\fR\16"+
		"R\u045b\13R\3S\3S\3S\3S\3T\3T\3T\5T\u0464\nT\3T\3T\3T\3T\3T\7T\u046b\n"+
		"T\fT\16T\u046e\13T\3T\5T\u0471\nT\3U\3U\5U\u0475\nU\3V\3V\3V\3V\3V\3V"+
		"\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\5V\u0487\nV\5V\u0489\nV\3W\3W\3W\5W\u048e"+
		"\nW\3W\7W\u0491\nW\fW\16W\u0494\13W\3W\3W\5W\u0498\nW\3X\3X\3X\3X\3X\3"+
		"X\3X\5X\u04a1\nX\5X\u04a3\nX\3Y\3Y\5Y\u04a7\nY\3Y\3Y\3Y\5Y\u04ac\nY\7"+
		"Y\u04ae\nY\fY\16Y\u04b1\13Y\3Y\5Y\u04b4\nY\3Z\3Z\5Z\u04b8\nZ\3Z\3Z\3["+
		"\3[\3[\3[\7[\u04c0\n[\f[\16[\u04c3\13[\3[\3[\3[\3[\3[\3[\3[\7[\u04cc\n"+
		"[\f[\16[\u04cf\13[\3[\3[\7[\u04d3\n[\f[\16[\u04d6\13[\5[\u04d8\n[\3\\"+
		"\3\\\5\\\u04dc\n\\\3]\3]\3]\3^\3^\3^\5^\u04e4\n^\3_\3_\3_\5_\u04e9\n_"+
		"\3`\3`\3`\3`\3a\3a\3a\7a\u04f2\na\fa\16a\u04f5\13a\3b\5b\u04f8\nb\3b\3"+
		"b\5b\u04fc\nb\3b\3b\7b\u0500\nb\fb\16b\u0503\13b\3c\3c\3d\3d\3d\3d\7d"+
		"\u050b\nd\fd\16d\u050e\13d\3d\3d\3e\3e\3e\3e\5e\u0516\ne\5e\u0518\ne\3"+
		"f\3f\3f\3f\5f\u051e\nf\3g\3g\5g\u0522\ng\3g\3g\3g\2\3\u00a2h\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\2\16\3\2+-\7\2\f\f\34\34((\60\61"+
		"\63\63\4\2\33\33\62\62\3\2PS\4\2II]]\3\2TV\3\2RS\4\2GHJK\3\2LM\6\2FFW"+
		"[acgi\3\2PQ\n\2\16\16\20\20\23\23\31\31\36\36%%\'\'//\u05ac\2\u00cf\3"+
		"\2\2\2\4\u00e2\3\2\2\2\6\u00e9\3\2\2\2\b\u0100\3\2\2\2\n\u0104\3\2\2\2"+
		"\f\u010e\3\2\2\2\16\u0112\3\2\2\2\20\u0114\3\2\2\2\22\u0123\3\2\2\2\24"+
		"\u0131\3\2\2\2\26\u0139\3\2\2\2\30\u0141\3\2\2\2\32\u014c\3\2\2\2\34\u0155"+
		"\3\2\2\2\36\u016a\3\2\2\2 \u0174\3\2\2\2\"\u0177\3\2\2\2$\u018c\3\2\2"+
		"\2&\u018e\3\2\2\2(\u0192\3\2\2\2*\u0196\3\2\2\2,\u0198\3\2\2\2.\u019b"+
		"\3\2\2\2\60\u019e\3\2\2\2\62\u01a6\3\2\2\2\64\u01b2\3\2\2\2\66\u01ba\3"+
		"\2\2\28\u01bc\3\2\2\2:\u01c7\3\2\2\2<\u01d5\3\2\2\2>\u01f9\3\2\2\2@\u01fb"+
		"\3\2\2\2B\u01fe\3\2\2\2D\u0206\3\2\2\2F\u020b\3\2\2\2H\u0215\3\2\2\2J"+
		"\u0217\3\2\2\2L\u0227\3\2\2\2N\u023b\3\2\2\2P\u023d\3\2\2\2R\u0245\3\2"+
		"\2\2T\u0258\3\2\2\2V\u025d\3\2\2\2X\u0266\3\2\2\2Z\u026d\3\2\2\2\\\u027b"+
		"\3\2\2\2^\u027d\3\2\2\2`\u027f\3\2\2\2b\u0281\3\2\2\2d\u028b\3\2\2\2f"+
		"\u0293\3\2\2\2h\u029a\3\2\2\2j\u029c\3\2\2\2l\u02ac\3\2\2\2n\u02b1\3\2"+
		"\2\2p\u02c2\3\2\2\2r\u02d4\3\2\2\2t\u02d8\3\2\2\2v\u02da\3\2\2\2x\u02e0"+
		"\3\2\2\2z\u02e2\3\2\2\2|\u02e5\3\2\2\2~\u02f3\3\2\2\2\u0080\u02f8\3\2"+
		"\2\2\u0082\u0309\3\2\2\2\u0084\u0372\3\2\2\2\u0086\u0374\3\2\2\2\u0088"+
		"\u0381\3\2\2\2\u008a\u0389\3\2\2\2\u008c\u038c\3\2\2\2\u008e\u0393\3\2"+
		"\2\2\u0090\u039e\3\2\2\2\u0092\u03a7\3\2\2\2\u0094\u03b6\3\2\2\2\u0096"+
		"\u03c4\3\2\2\2\u0098\u03c8\3\2\2\2\u009a\u03cd\3\2\2\2\u009c\u03d5\3\2"+
		"\2\2\u009e\u03d9\3\2\2\2\u00a0\u03e1\3\2\2\2\u00a2\u0407\3\2\2\2\u00a4"+
		"\u045c\3\2\2\2\u00a6\u0470\3\2\2\2\u00a8\u0474\3\2\2\2\u00aa\u0488\3\2"+
		"\2\2\u00ac\u048d\3\2\2\2\u00ae\u04a2\3\2\2\2\u00b0\u04b3\3\2\2\2\u00b2"+
		"\u04b5\3\2\2\2\u00b4\u04bb\3\2\2\2\u00b6\u04d9\3\2\2\2\u00b8\u04dd\3\2"+
		"\2\2\u00ba\u04e3\3\2\2\2\u00bc\u04e8\3\2\2\2\u00be\u04ea\3\2\2\2\u00c0"+
		"\u04ee\3\2\2\2\u00c2\u04f7\3\2\2\2\u00c4\u0504\3\2\2\2\u00c6\u0506\3\2"+
		"\2\2\u00c8\u0517\3\2\2\2\u00ca\u051d\3\2\2\2\u00cc\u051f\3\2\2\2\u00ce"+
		"\u00d0\5\4\3\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d4\3\2"+
		"\2\2\u00d1\u00d3\5\6\4\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00da\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d7\u00d9\5\b\5\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dd\u00de\7\2\2\3\u00de\3\3\2\2\2\u00df\u00e1\5b\62\2\u00e0\u00df"+
		"\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\7*\2\2\u00e6\u00e7\5Z."+
		"\2\u00e7\u00e8\7j\2\2\u00e8\5\3\2\2\2\u00e9\u00eb\7#\2\2\u00ea\u00ec\7"+
		"\60\2\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00f0\5Z.\2\u00ee\u00ef\7l\2\2\u00ef\u00f1\7T\2\2\u00f0\u00ee\3\2\2\2"+
		"\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\7j\2\2\u00f3\7\3"+
		"\2\2\2\u00f4\u00f6\5\f\7\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fd\3\2\2\2\u00f9\u00f7\3\2"+
		"\2\2\u00fa\u00fe\5\20\t\2\u00fb\u00fe\5\30\r\2\u00fc\u00fe\5l\67\2\u00fd"+
		"\u00fa\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2"+
		"\2\2\u00ff\u0101\7j\2\2\u0100\u00f7\3\2\2\2\u0100\u00ff\3\2\2\2\u0101"+
		"\t\3\2\2\2\u0102\u0105\5\f\7\2\u0103\u0105\7\63\2\2\u0104\u0102\3\2\2"+
		"\2\u0104\u0103\3\2\2\2\u0105\13\3\2\2\2\u0106\u010f\5b\62\2\u0107\u010f"+
		"\7-\2\2\u0108\u010f\7,\2\2\u0109\u010f\7+\2\2\u010a\u010f\7\60\2\2\u010b"+
		"\u010f\7\f\2\2\u010c\u010f\7\34\2\2\u010d\u010f\7\61\2\2\u010e\u0106\3"+
		"\2\2\2\u010e\u0107\3\2\2\2\u010e\u0108\3\2\2\2\u010e\u0109\3\2\2\2\u010e"+
		"\u010a\3\2\2\2\u010e\u010b\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010d\3\2"+
		"\2\2\u010f\r\3\2\2\2\u0110\u0113\7\34\2\2\u0111\u0113\5b\62\2\u0112\u0110"+
		"\3\2\2\2\u0112\u0111\3\2\2\2\u0113\17\3\2\2\2\u0114\u0115\7\24\2\2\u0115"+
		"\u0117\7=\2\2\u0116\u0118\5\22\n\2\u0117\u0116\3\2\2\2\u0117\u0118\3\2"+
		"\2\2\u0118\u011b\3\2\2\2\u0119\u011a\7\33\2\2\u011a\u011c\5\u00c2b\2\u011b"+
		"\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011e\7\""+
		"\2\2\u011e\u0120\5\u00c0a\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u0122\5\32\16\2\u0122\21\3\2\2\2\u0123\u0124\7H\2"+
		"\2\u0124\u0129\5\24\13\2\u0125\u0126\7k\2\2\u0126\u0128\5\24\13\2\u0127"+
		"\u0125\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2"+
		"\2\2\u012a\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012d\7G\2\2\u012d"+
		"\23\3\2\2\2\u012e\u0130\5b\62\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2"+
		"\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0131"+
		"\3\2\2\2\u0134\u0137\7=\2\2\u0135\u0136\7\33\2\2\u0136\u0138\5\26\f\2"+
		"\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\25\3\2\2\2\u0139\u013e"+
		"\5\u00c2b\2\u013a\u013b\7^\2\2\u013b\u013d\5\u00c2b\2\u013c\u013a\3\2"+
		"\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\27\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0142\7&\2\2\u0142\u0144\7=\2\2"+
		"\u0143\u0145\5\22\n\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0148"+
		"\3\2\2\2\u0146\u0147\7\33\2\2\u0147\u0149\5\u00c0a\2\u0148\u0146\3\2\2"+
		"\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\5\34\17\2\u014b"+
		"\31\3\2\2\2\u014c\u0150\7p\2\2\u014d\u014f\5\36\20\2\u014e\u014d\3\2\2"+
		"\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153"+
		"\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0154\7q\2\2\u0154\33\3\2\2\2\u0155"+
		"\u0159\7p\2\2\u0156\u0158\5\64\33\2\u0157\u0156\3\2\2\2\u0158\u015b\3"+
		"\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\3\2\2\2\u015b"+
		"\u0159\3\2\2\2\u015c\u015d\7q\2\2\u015d\35\3\2\2\2\u015e\u016b\7j\2\2"+
		"\u015f\u0161\7\60\2\2\u0160\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162"+
		"\3\2\2\2\u0162\u016b\5|?\2\u0163\u0165\5\n\6\2\u0164\u0163\3\2\2\2\u0165"+
		"\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169\3\2"+
		"\2\2\u0168\u0166\3\2\2\2\u0169\u016b\5 \21\2\u016a\u015e\3\2\2\2\u016a"+
		"\u0160\3\2\2\2\u016a\u0166\3\2\2\2\u016b\37\3\2\2\2\u016c\u0175\5\"\22"+
		"\2\u016d\u0175\5,\27\2\u016e\u0175\5\62\32\2\u016f\u0175\5\60\31\2\u0170"+
		"\u0175\5.\30\2\u0171\u0175\5\30\r\2\u0172\u0175\5l\67\2\u0173\u0175\5"+
		"\20\t\2\u0174\u016c\3\2\2\2\u0174\u016d\3\2\2\2\u0174\u016e\3\2\2\2\u0174"+
		"\u016f\3\2\2\2\u0174\u0170\3\2\2\2\u0174\u0171\3\2\2\2\u0174\u0172\3\2"+
		"\2\2\u0174\u0173\3\2\2\2\u0175!\3\2\2\2\u0176\u0178\5$\23\2\u0177\u0176"+
		"\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u017b\5&\24\2\u017a"+
		"\u0179\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\5*"+
		"\26\2\u017d\u017e\7=\2\2\u017e\u0183\5R*\2\u017f\u0180\7r\2\2\u0180\u0182"+
		"\7s\2\2\u0181\u017f\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183"+
		"\u0184\3\2\2\2\u0184\u0188\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0187\7\67"+
		"\2\2\u0187\u0189\5P)\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a"+
		"\3\2\2\2\u018a\u018b\5(\25\2\u018b#\3\2\2\2\u018c\u018d\t\2\2\2\u018d"+
		"%\3\2\2\2\u018e\u018f\t\3\2\2\u018f\'\3\2\2\2\u0190\u0193\5|?\2\u0191"+
		"\u0193\7j\2\2\u0192\u0190\3\2\2\2\u0192\u0191\3\2\2\2\u0193)\3\2\2\2\u0194"+
		"\u0197\5\u00c2b\2\u0195\u0197\7:\2\2\u0196\u0194\3\2\2\2\u0196\u0195\3"+
		"\2\2\2\u0197+\3\2\2\2\u0198\u0199\5\22\n\2\u0199\u019a\5\"\22\2\u019a"+
		"-\3\2\2\2\u019b\u019c\5\22\n\2\u019c\u019d\5\60\31\2\u019d/\3\2\2\2\u019e"+
		"\u019f\7=\2\2\u019f\u01a2\5R*\2\u01a0\u01a1\7\67\2\2\u01a1\u01a3\5P)\2"+
		"\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5"+
		"\5|?\2\u01a5\61\3\2\2\2\u01a6\u01a7\5\u00c2b\2\u01a7\u01a8\5B\"\2\u01a8"+
		"\u01a9\7j\2\2\u01a9\63\3\2\2\2\u01aa\u01ac\5\n\6\2\u01ab\u01aa\3\2\2\2"+
		"\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b0"+
		"\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b3\5\66\34\2\u01b1\u01b3\7j\2\2"+
		"\u01b2\u01ad\3\2\2\2\u01b2\u01b1\3\2\2\2\u01b3\65\3\2\2\2\u01b4\u01bb"+
		"\58\35\2\u01b5\u01bb\5<\37\2\u01b6\u01bb\5@!\2\u01b7\u01bb\5\30\r\2\u01b8"+
		"\u01bb\5l\67\2\u01b9\u01bb\5\20\t\2\u01ba\u01b4\3\2\2\2\u01ba\u01b5\3"+
		"\2\2\2\u01ba\u01b6\3\2\2\2\u01ba\u01b7\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba"+
		"\u01b9\3\2\2\2\u01bb\67\3\2\2\2\u01bc\u01bd\5\u00c2b\2\u01bd\u01c2\5:"+
		"\36\2\u01be\u01bf\7k\2\2\u01bf\u01c1\5:\36\2\u01c0\u01be\3\2\2\2\u01c1"+
		"\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c5\3\2"+
		"\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01c6\7j\2\2\u01c69\3\2\2\2\u01c7\u01cc"+
		"\7=\2\2\u01c8\u01c9\7r\2\2\u01c9\u01cb\7s\2\2\u01ca\u01c8\3\2\2\2\u01cb"+
		"\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cf\3\2"+
		"\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d0\7F\2\2\u01d0\u01d1\5H%\2\u01d1;\3"+
		"\2\2\2\u01d2\u01d4\5> \2\u01d3\u01d2\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5"+
		"\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01e2\3\2\2\2\u01d7\u01d5\3\2"+
		"\2\2\u01d8\u01e3\5*\26\2\u01d9\u01dd\5\22\n\2\u01da\u01dc\5b\62\2\u01db"+
		"\u01da\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2"+
		"\2\2\u01de\u01e0\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0\u01e1\5*\26\2\u01e1"+
		"\u01e3\3\2\2\2\u01e2\u01d8\3\2\2\2\u01e2\u01d9\3\2\2\2\u01e3\u01e4\3\2"+
		"\2\2\u01e4\u01e5\7=\2\2\u01e5\u01ea\5R*\2\u01e6\u01e7\7r\2\2\u01e7\u01e9"+
		"\7s\2\2\u01e8\u01e6\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea"+
		"\u01eb\3\2\2\2\u01eb\u01ef\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01ee\7\67"+
		"\2\2\u01ee\u01f0\5P)\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1"+
		"\3\2\2\2\u01f1\u01f2\5(\25\2\u01f2=\3\2\2\2\u01f3\u01fa\5b\62\2\u01f4"+
		"\u01fa\7-\2\2\u01f5\u01fa\7\f\2\2\u01f6\u01fa\7\27\2\2\u01f7\u01fa\7\60"+
		"\2\2\u01f8\u01fa\7\61\2\2\u01f9\u01f3\3\2\2\2\u01f9\u01f4\3\2\2\2\u01f9"+
		"\u01f5\3\2\2\2\u01f9\u01f6\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01f8\3\2"+
		"\2\2\u01fa?\3\2\2\2\u01fb\u01fc\5\22\n\2\u01fc\u01fd\5<\37\2\u01fdA\3"+
		"\2\2\2\u01fe\u0203\5D#\2\u01ff\u0200\7k\2\2\u0200\u0202\5D#\2\u0201\u01ff"+
		"\3\2\2\2\u0202\u0205\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204"+
		"C\3\2\2\2\u0205\u0203\3\2\2\2\u0206\u0209\5F$\2\u0207\u0208\7F\2\2\u0208"+
		"\u020a\5H%\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020aE\3\2\2\2\u020b"+
		"\u0210\7=\2\2\u020c\u020d\7r\2\2\u020d\u020f\7s\2\2\u020e\u020c\3\2\2"+
		"\2\u020f\u0212\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211G"+
		"\3\2\2\2\u0212\u0210\3\2\2\2\u0213\u0216\5J&\2\u0214\u0216\5\u00a2R\2"+
		"\u0215\u0213\3\2\2\2\u0215\u0214\3\2\2\2\u0216I\3\2\2\2\u0217\u0223\7"+
		"p\2\2\u0218\u021d\5H%\2\u0219\u021a\7k\2\2\u021a\u021c\5H%\2\u021b\u0219"+
		"\3\2\2\2\u021c\u021f\3\2\2\2\u021d\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e"+
		"\u0221\3\2\2\2\u021f\u021d\3\2\2\2\u0220\u0222\7k\2\2\u0221\u0220\3\2"+
		"\2\2\u0221\u0222\3\2\2\2\u0222\u0224\3\2\2\2\u0223\u0218\3\2\2\2\u0223"+
		"\u0224\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\7q\2\2\u0226K\3\2\2\2\u0227"+
		"\u0229\7=\2\2\u0228\u022a\5\u00c6d\2\u0229\u0228\3\2\2\2\u0229\u022a\3"+
		"\2\2\2\u022a\u0232\3\2\2\2\u022b\u022c\7l\2\2\u022c\u022e\7=\2\2\u022d"+
		"\u022f\5\u00c6d\2\u022e\u022d\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0231"+
		"\3\2\2\2\u0230\u022b\3\2\2\2\u0231\u0234\3\2\2\2\u0232\u0230\3\2\2\2\u0232"+
		"\u0233\3\2\2\2\u0233M\3\2\2\2\u0234\u0232\3\2\2\2\u0235\u023c\5\u00c2"+
		"b\2\u0236\u0239\7D\2\2\u0237\u0238\t\4\2\2\u0238\u023a\5\u00c2b\2\u0239"+
		"\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023c\3\2\2\2\u023b\u0235\3\2"+
		"\2\2\u023b\u0236\3\2\2\2\u023cO\3\2\2\2\u023d\u0242\5Z.\2\u023e\u023f"+
		"\7k\2\2\u023f\u0241\5Z.\2\u0240\u023e\3\2\2\2\u0241\u0244\3\2\2\2\u0242"+
		"\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243Q\3\2\2\2\u0244\u0242\3\2\2\2"+
		"\u0245\u0247\7n\2\2\u0246\u0248\5T+\2\u0247\u0246\3\2\2\2\u0247\u0248"+
		"\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a\7o\2\2\u024aS\3\2\2\2\u024b\u0250"+
		"\5V,\2\u024c\u024d\7k\2\2\u024d\u024f\5V,\2\u024e\u024c\3\2\2\2\u024f"+
		"\u0252\3\2\2\2\u0250\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0255\3\2"+
		"\2\2\u0252\u0250\3\2\2\2\u0253\u0254\7k\2\2\u0254\u0256\5X-\2\u0255\u0253"+
		"\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0259\3\2\2\2\u0257\u0259\5X-\2\u0258"+
		"\u024b\3\2\2\2\u0258\u0257\3\2\2\2\u0259U\3\2\2\2\u025a\u025c\5\16\b\2"+
		"\u025b\u025a\3\2\2\2\u025c\u025f\3\2\2\2\u025d\u025b\3\2\2\2\u025d\u025e"+
		"\3\2\2\2\u025e\u0260\3\2\2\2\u025f\u025d\3\2\2\2\u0260\u0261\5\u00c2b"+
		"\2\u0261\u0262\5F$\2\u0262W\3\2\2\2\u0263\u0265\5\16\b\2\u0264\u0263\3"+
		"\2\2\2\u0265\u0268\3\2\2\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267"+
		"\u0269\3\2\2\2\u0268\u0266\3\2\2\2\u0269\u026a\5\u00c2b\2\u026a\u026b"+
		"\7\13\2\2\u026b\u026c\5F$\2\u026cY\3\2\2\2\u026d\u0272\7=\2\2\u026e\u026f"+
		"\7l\2\2\u026f\u0271\7=\2\2\u0270\u026e\3\2\2\2\u0271\u0274\3\2\2\2\u0272"+
		"\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273[\3\2\2\2\u0274\u0272\3\2\2\2"+
		"\u0275\u027c\5^\60\2\u0276\u027c\5`\61\2\u0277\u027c\7A\2\2\u0278\u027c"+
		"\7B\2\2\u0279\u027c\7@\2\2\u027a\u027c\7C\2\2\u027b\u0275\3\2\2\2\u027b"+
		"\u0276\3\2\2\2\u027b\u0277\3\2\2\2\u027b\u0278\3\2\2\2\u027b\u0279\3\2"+
		"\2\2\u027b\u027a\3\2\2\2\u027c]\3\2\2\2\u027d\u027e\7>\2\2\u027e_\3\2"+
		"\2\2\u027f\u0280\7?\2\2\u0280a\3\2\2\2\u0281\u0282\7\n\2\2\u0282\u0289"+
		"\5Z.\2\u0283\u0286\7n\2\2\u0284\u0287\5d\63\2\u0285\u0287\5h\65\2\u0286"+
		"\u0284\3\2\2\2\u0286\u0285\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0288\3\2"+
		"\2\2\u0288\u028a\7o\2\2\u0289\u0283\3\2\2\2\u0289\u028a\3\2\2\2\u028a"+
		"c\3\2\2\2\u028b\u0290\5f\64\2\u028c\u028d\7k\2\2\u028d\u028f\5f\64\2\u028e"+
		"\u028c\3\2\2\2\u028f\u0292\3\2\2\2\u0290\u028e\3\2\2\2\u0290\u0291\3\2"+
		"\2\2\u0291e\3\2\2\2\u0292\u0290\3\2\2\2\u0293\u0294\7=\2\2\u0294\u0295"+
		"\7F\2\2\u0295\u0296\5h\65\2\u0296g\3\2\2\2\u0297\u029b\5\u00a2R\2\u0298"+
		"\u029b\5b\62\2\u0299\u029b\5j\66\2\u029a\u0297\3\2\2\2\u029a\u0298\3\2"+
		"\2\2\u029a\u0299\3\2\2\2\u029bi\3\2\2\2\u029c\u02a5\7p\2\2\u029d\u02a2"+
		"\5h\65\2\u029e\u029f\7k\2\2\u029f\u02a1\5h\65\2\u02a0\u029e\3\2\2\2\u02a1"+
		"\u02a4\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a6\3\2"+
		"\2\2\u02a4\u02a2\3\2\2\2\u02a5\u029d\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6"+
		"\u02a8\3\2\2\2\u02a7\u02a9\7k\2\2\u02a8\u02a7\3\2\2\2\u02a8\u02a9\3\2"+
		"\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ab\7q\2\2\u02abk\3\2\2\2\u02ac\u02ad"+
		"\7\n\2\2\u02ad\u02ae\7&\2\2\u02ae\u02af\7=\2\2\u02af\u02b0\5n8\2\u02b0"+
		"m\3\2\2\2\u02b1\u02b5\7p\2\2\u02b2\u02b4\5p9\2\u02b3\u02b2\3\2\2\2\u02b4"+
		"\u02b7\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b8\3\2"+
		"\2\2\u02b7\u02b5\3\2\2\2\u02b8\u02b9\7q\2\2\u02b9o\3\2\2\2\u02ba\u02bc"+
		"\5\n\6\2\u02bb\u02ba\3\2\2\2\u02bc\u02bf\3\2\2\2\u02bd\u02bb\3\2\2\2\u02bd"+
		"\u02be\3\2\2\2\u02be\u02c0\3\2\2\2\u02bf\u02bd\3\2\2\2\u02c0\u02c3\5r"+
		":\2\u02c1\u02c3\7j\2\2\u02c2\u02bd\3\2\2\2\u02c2\u02c1\3\2\2\2\u02c3q"+
		"\3\2\2\2\u02c4\u02c5\5\u00c2b\2\u02c5\u02c6\5t;\2\u02c6\u02c7\7j\2\2\u02c7"+
		"\u02d5\3\2\2\2\u02c8\u02ca\5\20\t\2\u02c9\u02cb\7j\2\2\u02ca\u02c9\3\2"+
		"\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02d5\3\2\2\2\u02cc\u02ce\5\30\r\2\u02cd"+
		"\u02cf\7j\2\2\u02ce\u02cd\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d5\3\2"+
		"\2\2\u02d0\u02d2\5l\67\2\u02d1\u02d3\7j\2\2\u02d2\u02d1\3\2\2\2\u02d2"+
		"\u02d3\3\2\2\2\u02d3\u02d5\3\2\2\2\u02d4\u02c4\3\2\2\2\u02d4\u02c8\3\2"+
		"\2\2\u02d4\u02cc\3\2\2\2\u02d4\u02d0\3\2\2\2\u02d5s\3\2\2\2\u02d6\u02d9"+
		"\5v<\2\u02d7\u02d9\5x=\2\u02d8\u02d6\3\2\2\2\u02d8\u02d7\3\2\2\2\u02d9"+
		"u\3\2\2\2\u02da\u02db\7=\2\2\u02db\u02dc\7n\2\2\u02dc\u02de\7o\2\2\u02dd"+
		"\u02df\5z>\2\u02de\u02dd\3\2\2\2\u02de\u02df\3\2\2\2\u02dfw\3\2\2\2\u02e0"+
		"\u02e1\5B\"\2\u02e1y\3\2\2\2\u02e2\u02e3\7\27\2\2\u02e3\u02e4\5h\65\2"+
		"\u02e4{\3\2\2\2\u02e5\u02e9\7p\2\2\u02e6\u02e8\5~@\2\u02e7\u02e6\3\2\2"+
		"\2\u02e8\u02eb\3\2\2\2\u02e9\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02ec"+
		"\3\2\2\2\u02eb\u02e9\3\2\2\2\u02ec\u02ed\7q\2\2\u02ed}\3\2\2\2\u02ee\u02ef"+
		"\5\u0080A\2\u02ef\u02f0\7j\2\2\u02f0\u02f4\3\2\2\2\u02f1\u02f4\5\u0084"+
		"C\2\u02f2\u02f4\5\u0082B\2\u02f3\u02ee\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f3"+
		"\u02f2\3\2\2\2\u02f4\177\3\2\2\2\u02f5\u02f7\5\16\b\2\u02f6\u02f5\3\2"+
		"\2\2\u02f7\u02fa\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9"+
		"\u02fb\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fb\u02fc\5\u00c2b\2\u02fc\u02fd"+
		"\5B\"\2\u02fd\u0081\3\2\2\2\u02fe\u0300\5\f\7\2\u02ff\u02fe\3\2\2\2\u0300"+
		"\u0303\3\2\2\2\u0301\u02ff\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0306\3\2"+
		"\2\2\u0303\u0301\3\2\2\2\u0304\u0307\5\20\t\2\u0305\u0307\5\30\r\2\u0306"+
		"\u0304\3\2\2\2\u0306\u0305\3\2\2\2\u0307\u030a\3\2\2\2\u0308\u030a\7j"+
		"\2\2\u0309\u0301\3\2\2\2\u0309\u0308\3\2\2\2\u030a\u0083\3\2\2\2\u030b"+
		"\u0373\5|?\2\u030c\u030d\7\r\2\2\u030d\u0310\5\u00a2R\2\u030e\u030f\7"+
		"E\2\2\u030f\u0311\5\u00a2R\2\u0310\u030e\3\2\2\2\u0310\u0311\3\2\2\2\u0311"+
		"\u0312\3\2\2\2\u0312\u0313\7j\2\2\u0313\u0373\3\2\2\2\u0314\u0315\7!\2"+
		"\2\u0315\u0316\5\u009cO\2\u0316\u0319\5\u0084C\2\u0317\u0318\7\32\2\2"+
		"\u0318\u031a\5\u0084C\2\u0319\u0317\3\2\2\2\u0319\u031a\3\2\2\2\u031a"+
		"\u0373\3\2\2\2\u031b\u031c\7\37\2\2\u031c\u031d\7n\2\2\u031d\u031e\5\u0096"+
		"L\2\u031e\u031f\7o\2\2\u031f\u0320\5\u0084C\2\u0320\u0373\3\2\2\2\u0321"+
		"\u0322\7<\2\2\u0322\u0323\5\u009cO\2\u0323\u0324\5\u0084C\2\u0324\u0373"+
		"\3\2\2\2\u0325\u0326\7\30\2\2\u0326\u0327\5\u0084C\2\u0327\u0328\7<\2"+
		"\2\u0328\u0329\5\u009cO\2\u0329\u032a\7j\2\2\u032a\u0373\3\2\2\2\u032b"+
		"\u032c\79\2\2\u032c\u0336\5|?\2\u032d\u032f\5\u0086D\2\u032e\u032d\3\2"+
		"\2\2\u032f\u0330\3\2\2\2\u0330\u032e\3\2\2\2\u0330\u0331\3\2\2\2\u0331"+
		"\u0333\3\2\2\2\u0332\u0334\5\u008aF\2\u0333\u0332\3\2\2\2\u0333\u0334"+
		"\3\2\2\2\u0334\u0337\3\2\2\2\u0335\u0337\5\u008aF\2\u0336\u032e\3\2\2"+
		"\2\u0336\u0335\3\2\2\2\u0337\u0373\3\2\2\2\u0338\u0339\79\2\2\u0339\u033a"+
		"\5\u008cG\2\u033a\u033e\5|?\2\u033b\u033d\5\u0086D\2\u033c\u033b\3\2\2"+
		"\2\u033d\u0340\3\2\2\2\u033e\u033c\3\2\2\2\u033e\u033f\3\2\2\2\u033f\u0342"+
		"\3\2\2\2\u0340\u033e\3\2\2\2\u0341\u0343\5\u008aF\2\u0342\u0341\3\2\2"+
		"\2\u0342\u0343\3\2\2\2\u0343\u0373\3\2\2\2\u0344\u0345\7\64\2\2\u0345"+
		"\u0346\5\u009cO\2\u0346\u034a\7p\2\2\u0347\u0349\5\u0092J\2\u0348\u0347"+
		"\3\2\2\2\u0349\u034c\3\2\2\2\u034a\u0348\3\2\2\2\u034a\u034b\3\2\2\2\u034b"+
		"\u0350\3\2\2\2\u034c\u034a\3\2\2\2\u034d\u034f\5\u0094K\2\u034e\u034d"+
		"\3\2\2\2\u034f\u0352\3\2\2\2\u0350\u034e\3\2\2\2\u0350\u0351\3\2\2\2\u0351"+
		"\u0353\3\2\2\2\u0352\u0350\3\2\2\2\u0353\u0354\7q\2\2\u0354\u0373\3\2"+
		"\2\2\u0355\u0356\7\63\2\2\u0356\u0357\5\u009cO\2\u0357\u0358\5|?\2\u0358"+
		"\u0373\3\2\2\2\u0359\u035b\7.\2\2\u035a\u035c\5\u00a2R\2\u035b\u035a\3"+
		"\2\2\2\u035b\u035c\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u0373\7j\2\2\u035e"+
		"\u035f\7\66\2\2\u035f\u0360\5\u00a2R\2\u0360\u0361\7j\2\2\u0361\u0373"+
		"\3\2\2\2\u0362\u0364\7\17\2\2\u0363\u0365\7=\2\2\u0364\u0363\3\2\2\2\u0364"+
		"\u0365\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0373\7j\2\2\u0367\u0369\7\26"+
		"\2\2\u0368\u036a\7=\2\2\u0369\u0368\3\2\2\2\u0369\u036a\3\2\2\2\u036a"+
		"\u036b\3\2\2\2\u036b\u0373\7j\2\2\u036c\u036d\5\u00a2R\2\u036d\u036e\7"+
		"j\2\2\u036e\u0373\3\2\2\2\u036f\u0370\7=\2\2\u0370\u0371\7E\2\2\u0371"+
		"\u0373\5\u0084C\2\u0372\u030b\3\2\2\2\u0372\u030c\3\2\2\2\u0372\u0314"+
		"\3\2\2\2\u0372\u031b\3\2\2\2\u0372\u0321\3\2\2\2\u0372\u0325\3\2\2\2\u0372"+
		"\u032b\3\2\2\2\u0372\u0338\3\2\2\2\u0372\u0344\3\2\2\2\u0372\u0355\3\2"+
		"\2\2\u0372\u0359\3\2\2\2\u0372\u035e\3\2\2\2\u0372\u0362\3\2\2\2\u0372"+
		"\u0367\3\2\2\2\u0372\u036c\3\2\2\2\u0372\u036f\3\2\2\2\u0373\u0085\3\2"+
		"\2\2\u0374\u0375\7\22\2\2\u0375\u0379\7n\2\2\u0376\u0378\5\16\b\2\u0377"+
		"\u0376\3\2\2\2\u0378\u037b\3\2\2\2\u0379\u0377\3\2\2\2\u0379\u037a\3\2"+
		"\2\2\u037a\u037c\3\2\2\2\u037b\u0379\3\2\2\2\u037c\u037d\5\u0088E\2\u037d"+
		"\u037e\7=\2\2\u037e\u037f\7o\2\2\u037f\u0380\5|?\2\u0380\u0087\3\2\2\2"+
		"\u0381\u0386\5Z.\2\u0382\u0383\7_\2\2\u0383\u0385\5Z.\2\u0384\u0382\3"+
		"\2\2\2\u0385\u0388\3\2\2\2\u0386\u0384\3\2\2\2\u0386\u0387\3\2\2\2\u0387"+
		"\u0089\3\2\2\2\u0388\u0386\3\2\2\2\u0389\u038a\7\35\2\2\u038a\u038b\5"+
		"|?\2\u038b\u008b\3\2\2\2\u038c\u038d\7n\2\2\u038d\u038f\5\u008eH\2\u038e"+
		"\u0390\7j\2\2\u038f\u038e\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u0391\3\2"+
		"\2\2\u0391\u0392\7o\2\2\u0392\u008d\3\2\2\2\u0393\u0398\5\u0090I\2\u0394"+
		"\u0395\7j\2\2\u0395\u0397\5\u0090I\2\u0396\u0394\3\2\2\2\u0397\u039a\3"+
		"\2\2\2\u0398\u0396\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u008f\3\2\2\2\u039a"+
		"\u0398\3\2\2\2\u039b\u039d\5\16\b\2\u039c\u039b\3\2\2\2\u039d\u03a0\3"+
		"\2\2\2\u039e\u039c\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u03a1\3\2\2\2\u03a0"+
		"\u039e\3\2\2\2\u03a1\u03a2\5L\'\2\u03a2\u03a3\5F$\2\u03a3\u03a4\7F\2\2"+
		"\u03a4\u03a5\5\u00a2R\2\u03a5\u0091\3\2\2\2\u03a6\u03a8\5\u0094K\2\u03a7"+
		"\u03a6\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03a7\3\2\2\2\u03a9\u03aa\3\2"+
		"\2\2\u03aa\u03ac\3\2\2\2\u03ab\u03ad\5~@\2\u03ac\u03ab\3\2\2\2\u03ad\u03ae"+
		"\3\2\2\2\u03ae\u03ac\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u0093\3\2\2\2\u03b0"+
		"\u03b1\7\21\2\2\u03b1\u03b2\5\u00a2R\2\u03b2\u03b3\7E\2\2\u03b3\u03b7"+
		"\3\2\2\2\u03b4\u03b5\7\27\2\2\u03b5\u03b7\7E\2\2\u03b6\u03b0\3\2\2\2\u03b6"+
		"\u03b4\3\2\2\2\u03b7\u0095\3\2\2\2\u03b8\u03c5\5\u009aN\2\u03b9\u03bb"+
		"\5\u0098M\2\u03ba\u03b9\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bc\3\2\2"+
		"\2\u03bc\u03be\7j\2\2\u03bd\u03bf\5\u00a2R\2\u03be\u03bd\3\2\2\2\u03be"+
		"\u03bf\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03c2\7j\2\2\u03c1\u03c3\5\u009e"+
		"P\2\u03c2\u03c1\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03c5\3\2\2\2\u03c4"+
		"\u03b8\3\2\2\2\u03c4\u03ba\3\2\2\2\u03c5\u0097\3\2\2\2\u03c6\u03c9\5\u0080"+
		"A\2\u03c7\u03c9\5\u009eP\2\u03c8\u03c6\3\2\2\2\u03c8\u03c7\3\2\2\2\u03c9"+
		"\u0099\3\2\2\2\u03ca\u03cc\5\16\b\2\u03cb\u03ca\3\2\2\2\u03cc\u03cf\3"+
		"\2\2\2\u03cd\u03cb\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce\u03d0\3\2\2\2\u03cf"+
		"\u03cd\3\2\2\2\u03d0\u03d1\5\u00c2b\2\u03d1\u03d2\5F$\2\u03d2\u03d3\7"+
		"E\2\2\u03d3\u03d4\5\u00a2R\2\u03d4\u009b\3\2\2\2\u03d5\u03d6\7n\2\2\u03d6"+
		"\u03d7\5\u00a2R\2\u03d7\u03d8\7o\2\2\u03d8\u009d\3\2\2\2\u03d9\u03de\5"+
		"\u00a2R\2\u03da\u03db\7k\2\2\u03db\u03dd\5\u00a2R\2\u03dc\u03da\3\2\2"+
		"\2\u03dd\u03e0\3\2\2\2\u03de\u03dc\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u009f"+
		"\3\2\2\2\u03e0\u03de\3\2\2\2\u03e1\u03e2\7=\2\2\u03e2\u03e4\7n\2\2\u03e3"+
		"\u03e5\5\u009eP\2\u03e4\u03e3\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03e6"+
		"\3\2\2\2\u03e6\u03e7\7o\2\2\u03e7\u00a1\3\2\2\2\u03e8\u03e9\bR\1\2\u03e9"+
		"\u03ea\7n\2\2\u03ea\u03eb\5\u00c2b\2\u03eb\u03ec\7o\2\2\u03ec\u03ed\5"+
		"\u00a2R\27\u03ed\u0408\3\2\2\2\u03ee\u03ef\t\5\2\2\u03ef\u0408\5\u00a2"+
		"R\25\u03f0\u03f1\t\6\2\2\u03f1\u0408\5\u00a2R\24\u03f2\u0408\5\u00aaV"+
		"\2\u03f3\u0408\5\u00a0Q\2\u03f4\u03f5\7)\2\2\u03f5\u0408\5\u00aeX\2\u03f6"+
		"\u0408\5\u00a4S\2\u03f7\u03f8\5\u00c2b\2\u03f8\u03fe\7\3\2\2\u03f9\u03fb"+
		"\5\u00c6d\2\u03fa\u03f9\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u03fc\3\2\2"+
		"\2\u03fc\u03ff\7=\2\2\u03fd\u03ff\7)\2\2\u03fe\u03fa\3\2\2\2\u03fe\u03fd"+
		"\3\2\2\2\u03ff\u0408\3\2\2\2\u0400\u0401\5\u00acW\2\u0401\u0403\7\3\2"+
		"\2\u0402\u0404\5\u00c6d\2\u0403\u0402\3\2\2\2\u0403\u0404\3\2\2\2\u0404"+
		"\u0405\3\2\2\2\u0405\u0406\7)\2\2\u0406\u0408\3\2\2\2\u0407\u03e8\3\2"+
		"\2\2\u0407\u03ee\3\2\2\2\u0407\u03f0\3\2\2\2\u0407\u03f2\3\2\2\2\u0407"+
		"\u03f3\3\2\2\2\u0407\u03f4\3\2\2\2\u0407\u03f6\3\2\2\2\u0407\u03f7\3\2"+
		"\2\2\u0407\u0400\3\2\2\2\u0408\u0459\3\2\2\2\u0409\u040a\f\23\2\2\u040a"+
		"\u040b\t\7\2\2\u040b\u0458\5\u00a2R\24\u040c\u040d\f\22\2\2\u040d\u040e"+
		"\t\b\2\2\u040e\u0458\5\u00a2R\23\u040f\u0417\f\21\2\2\u0410\u0411\7H\2"+
		"\2\u0411\u0418\7H\2\2\u0412\u0413\7G\2\2\u0413\u0414\7G\2\2\u0414\u0418"+
		"\7G\2\2\u0415\u0416\7G\2\2\u0416\u0418\7G\2\2\u0417\u0410\3\2\2\2\u0417"+
		"\u0412\3\2\2\2\u0417\u0415\3\2\2\2\u0418\u0419\3\2\2\2\u0419\u0458\5\u00a2"+
		"R\22\u041a\u041b\f\20\2\2\u041b\u041c\t\t\2\2\u041c\u0458\5\u00a2R\21"+
		"\u041d\u041e\f\16\2\2\u041e\u041f\t\n\2\2\u041f\u0458\5\u00a2R\17\u0420"+
		"\u0421\f\r\2\2\u0421\u0422\7^\2\2\u0422\u0458\5\u00a2R\16\u0423\u0424"+
		"\f\f\2\2\u0424\u0425\7`\2\2\u0425\u0458\5\u00a2R\r\u0426\u0427\f\13\2"+
		"\2\u0427\u0428\7_\2\2\u0428\u0458\5\u00a2R\f\u0429\u042a\f\n\2\2\u042a"+
		"\u042b\7N\2\2\u042b\u0458\5\u00a2R\13\u042c\u042d\f\t\2\2\u042d\u042e"+
		"\7O\2\2\u042e\u0458\5\u00a2R\n\u042f\u0430\f\b\2\2\u0430\u0431\7D\2\2"+
		"\u0431\u0432\5\u00a2R\2\u0432\u0433\7E\2\2\u0433\u0434\5\u00a2R\t\u0434"+
		"\u0458\3\2\2\2\u0435\u0436\f\7\2\2\u0436\u0437\t\13\2\2\u0437\u0458\5"+
		"\u00a2R\7\u0438\u0439\f\33\2\2\u0439\u0445\7l\2\2\u043a\u0446\7=\2\2\u043b"+
		"\u0446\5\u00a0Q\2\u043c\u0446\7\65\2\2\u043d\u043f\7)\2\2\u043e\u0440"+
		"\5\u00be`\2\u043f\u043e\3\2\2\2\u043f\u0440\3\2\2\2\u0440\u0441\3\2\2"+
		"\2\u0441\u0446\5\u00b2Z\2\u0442\u0443\7\62\2\2\u0443\u0446\5\u00c8e\2"+
		"\u0444\u0446\5\u00b8]\2\u0445\u043a\3\2\2\2\u0445\u043b\3\2\2\2\u0445"+
		"\u043c\3\2\2\2\u0445\u043d\3\2\2\2\u0445\u0442\3\2\2\2\u0445\u0444\3\2"+
		"\2\2\u0446\u0458\3\2\2\2\u0447\u0448\f\32\2\2\u0448\u0449\7r\2\2\u0449"+
		"\u044a\5\u00a2R\2\u044a\u044b\7s\2\2\u044b\u0458\3\2\2\2\u044c\u044d\f"+
		"\26\2\2\u044d\u0458\t\f\2\2\u044e\u044f\f\17\2\2\u044f\u0450\7$\2\2\u0450"+
		"\u0458\5\u00c2b\2\u0451\u0452\f\5\2\2\u0452\u0454\7\3\2\2\u0453\u0455"+
		"\5\u00c6d\2\u0454\u0453\3\2\2\2\u0454\u0455\3\2\2\2\u0455\u0456\3\2\2"+
		"\2\u0456\u0458\7=\2\2\u0457\u0409\3\2\2\2\u0457\u040c\3\2\2\2\u0457\u040f"+
		"\3\2\2\2\u0457\u041a\3\2\2\2\u0457\u041d\3\2\2\2\u0457\u0420\3\2\2\2\u0457"+
		"\u0423\3\2\2\2\u0457\u0426\3\2\2\2\u0457\u0429\3\2\2\2\u0457\u042c\3\2"+
		"\2\2\u0457\u042f\3\2\2\2\u0457\u0435\3\2\2\2\u0457\u0438\3\2\2\2\u0457"+
		"\u0447\3\2\2\2\u0457\u044c\3\2\2\2\u0457\u044e\3\2\2\2\u0457\u0451\3\2"+
		"\2\2\u0458\u045b\3\2\2\2\u0459\u0457\3\2\2\2\u0459\u045a\3\2\2\2\u045a"+
		"\u00a3\3\2\2\2\u045b\u0459\3\2\2\2\u045c\u045d\5\u00a6T\2\u045d\u045e"+
		"\7\4\2\2\u045e\u045f\5\u00a8U\2\u045f\u00a5\3\2\2\2\u0460\u0471\7=\2\2"+
		"\u0461\u0463\7n\2\2\u0462\u0464\5T+\2\u0463\u0462\3\2\2\2\u0463\u0464"+
		"\3\2\2\2\u0464\u0465\3\2\2\2\u0465\u0471\7o\2\2\u0466\u0467\7n\2\2\u0467"+
		"\u046c\7=\2\2\u0468\u0469\7k\2\2\u0469\u046b\7=\2\2\u046a\u0468\3\2\2"+
		"\2\u046b\u046e\3\2\2\2\u046c\u046a\3\2\2\2\u046c\u046d\3\2\2\2\u046d\u046f"+
		"\3\2\2\2\u046e\u046c\3\2\2\2\u046f\u0471\7o\2\2\u0470\u0460\3\2\2\2\u0470"+
		"\u0461\3\2\2\2\u0470\u0466\3\2\2\2\u0471\u00a7\3\2\2\2\u0472\u0475\5\u00a2"+
		"R\2\u0473\u0475\5|?\2\u0474\u0472\3\2\2\2\u0474\u0473\3\2\2\2\u0475\u00a9"+
		"\3\2\2\2\u0476\u0477\7n\2\2\u0477\u0478\5\u00a2R\2\u0478\u0479\7o\2\2"+
		"\u0479\u0489\3\2\2\2\u047a\u0489\7\65\2\2\u047b\u0489\7\62\2\2\u047c\u0489"+
		"\5\\/\2\u047d\u0489\7=\2\2\u047e\u047f\5*\26\2\u047f\u0480\7l\2\2\u0480"+
		"\u0481\7\24\2\2\u0481\u0489\3\2\2\2\u0482\u0486\5\u00be`\2\u0483\u0487"+
		"\5\u00caf\2\u0484\u0485\7\65\2\2\u0485\u0487\5\u00ccg\2\u0486\u0483\3"+
		"\2\2\2\u0486\u0484\3\2\2\2\u0487\u0489\3\2\2\2\u0488\u0476\3\2\2\2\u0488"+
		"\u047a\3\2\2\2\u0488\u047b\3\2\2\2\u0488\u047c\3\2\2\2\u0488\u047d\3\2"+
		"\2\2\u0488\u047e\3\2\2\2\u0488\u0482\3\2\2\2\u0489\u00ab\3\2\2\2\u048a"+
		"\u048b\5L\'\2\u048b\u048c\7l\2\2\u048c\u048e\3\2\2\2\u048d\u048a\3\2\2"+
		"\2\u048d\u048e\3\2\2\2\u048e\u0492\3\2\2\2\u048f\u0491\5b\62\2\u0490\u048f"+
		"\3\2\2\2\u0491\u0494\3\2\2\2\u0492\u0490\3\2\2\2\u0492\u0493\3\2\2\2\u0493"+
		"\u0495\3\2\2\2\u0494\u0492\3\2\2\2\u0495\u0497\7=\2\2\u0496\u0498\5\u00c6"+
		"d\2\u0497\u0496\3\2\2\2\u0497\u0498\3\2\2\2\u0498\u00ad\3\2\2\2\u0499"+
		"\u049a\5\u00be`\2\u049a\u049b\5\u00b0Y\2\u049b\u049c\5\u00b6\\\2\u049c"+
		"\u04a3\3\2\2\2\u049d\u04a0\5\u00b0Y\2\u049e\u04a1\5\u00b4[\2\u049f\u04a1"+
		"\5\u00b6\\\2\u04a0\u049e\3\2\2\2\u04a0\u049f\3\2\2\2\u04a1\u04a3\3\2\2"+
		"\2\u04a2\u0499\3\2\2\2\u04a2\u049d\3\2\2\2\u04a3\u00af\3\2\2\2\u04a4\u04a6"+
		"\7=\2\2\u04a5\u04a7\5\u00ba^\2\u04a6\u04a5\3\2\2\2\u04a6\u04a7\3\2\2\2"+
		"\u04a7\u04af\3\2\2\2\u04a8\u04a9\7l\2\2\u04a9\u04ab\7=\2\2\u04aa\u04ac"+
		"\5\u00ba^\2\u04ab\u04aa\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac\u04ae\3\2\2"+
		"\2\u04ad\u04a8\3\2\2\2\u04ae\u04b1\3\2\2\2\u04af\u04ad\3\2\2\2\u04af\u04b0"+
		"\3\2\2\2\u04b0\u04b4\3\2\2\2\u04b1\u04af\3\2\2\2\u04b2\u04b4\5\u00c4c"+
		"\2\u04b3\u04a4\3\2\2\2\u04b3\u04b2\3\2\2\2\u04b4\u00b1\3\2\2\2\u04b5\u04b7"+
		"\7=\2\2\u04b6\u04b8\5\u00bc_\2\u04b7\u04b6\3\2\2\2\u04b7\u04b8\3\2\2\2"+
		"\u04b8\u04b9\3\2\2\2\u04b9\u04ba\5\u00b6\\\2\u04ba\u00b3\3\2\2\2\u04bb"+
		"\u04d7\7r\2\2\u04bc\u04c1\7s\2\2\u04bd\u04be\7r\2\2\u04be\u04c0\7s\2\2"+
		"\u04bf\u04bd\3\2\2\2\u04c0\u04c3\3\2\2\2\u04c1\u04bf\3\2\2\2\u04c1\u04c2"+
		"\3\2\2\2\u04c2\u04c4\3\2\2\2\u04c3\u04c1\3\2\2\2\u04c4\u04d8\5J&\2\u04c5"+
		"\u04c6\5\u00a2R\2\u04c6\u04cd\7s\2\2\u04c7\u04c8\7r\2\2\u04c8\u04c9\5"+
		"\u00a2R\2\u04c9\u04ca\7s\2\2\u04ca\u04cc\3\2\2\2\u04cb\u04c7\3\2\2\2\u04cc"+
		"\u04cf\3\2\2\2\u04cd\u04cb\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce\u04d4\3\2"+
		"\2\2\u04cf\u04cd\3\2\2\2\u04d0\u04d1\7r\2\2\u04d1\u04d3\7s\2\2\u04d2\u04d0"+
		"\3\2\2\2\u04d3\u04d6\3\2\2\2\u04d4\u04d2\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5"+
		"\u04d8\3\2\2\2\u04d6\u04d4\3\2\2\2\u04d7\u04bc\3\2\2\2\u04d7\u04c5\3\2"+
		"\2\2\u04d8\u00b5\3\2\2\2\u04d9\u04db\5\u00ccg\2\u04da\u04dc\5\32\16\2"+
		"\u04db\u04da\3\2\2\2\u04db\u04dc\3\2\2\2\u04dc\u00b7\3\2\2\2\u04dd\u04de"+
		"\5\u00be`\2\u04de\u04df\5\u00caf\2\u04df\u00b9\3\2\2\2\u04e0\u04e1\7H"+
		"\2\2\u04e1\u04e4\7G\2\2\u04e2\u04e4\5\u00c6d\2\u04e3\u04e0\3\2\2\2\u04e3"+
		"\u04e2\3\2\2\2\u04e4\u00bb\3\2\2\2\u04e5\u04e6\7H\2\2\u04e6\u04e9\7G\2"+
		"\2\u04e7\u04e9\5\u00be`\2\u04e8\u04e5\3\2\2\2\u04e8\u04e7\3\2\2\2\u04e9"+
		"\u00bd\3\2\2\2\u04ea\u04eb\7H\2\2\u04eb\u04ec\5\u00c0a\2\u04ec\u04ed\7"+
		"G\2\2\u04ed\u00bf\3\2\2\2\u04ee\u04f3\5\u00c2b\2\u04ef\u04f0\7k\2\2\u04f0"+
		"\u04f2\5\u00c2b\2\u04f1\u04ef\3\2\2\2\u04f2\u04f5\3\2\2\2\u04f3\u04f1"+
		"\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4\u00c1\3\2\2\2\u04f5\u04f3\3\2\2\2\u04f6"+
		"\u04f8\5b\62\2\u04f7\u04f6\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04fb\3\2"+
		"\2\2\u04f9\u04fc\5L\'\2\u04fa\u04fc\5\u00c4c\2\u04fb\u04f9\3\2\2\2\u04fb"+
		"\u04fa\3\2\2\2\u04fc\u0501\3\2\2\2\u04fd\u04fe\7r\2\2\u04fe\u0500\7s\2"+
		"\2\u04ff\u04fd\3\2\2\2\u0500\u0503\3\2\2\2\u0501\u04ff\3\2\2\2\u0501\u0502"+
		"\3\2\2\2\u0502\u00c3\3\2\2\2\u0503\u0501\3\2\2\2\u0504\u0505\t\r\2\2\u0505"+
		"\u00c5\3\2\2\2\u0506\u0507\7H\2\2\u0507\u050c\5N(\2\u0508\u0509\7k\2\2"+
		"\u0509\u050b\5N(\2\u050a\u0508\3\2\2\2\u050b\u050e\3\2\2\2\u050c\u050a"+
		"\3\2\2\2\u050c\u050d\3\2\2\2\u050d\u050f\3\2\2\2\u050e\u050c\3\2\2\2\u050f"+
		"\u0510\7G\2\2\u0510\u00c7\3\2\2\2\u0511\u0518\5\u00ccg\2\u0512\u0513\7"+
		"l\2\2\u0513\u0515\7=\2\2\u0514\u0516\5\u00ccg\2\u0515\u0514\3\2\2\2\u0515"+
		"\u0516\3\2\2\2\u0516\u0518\3\2\2\2\u0517\u0511\3\2\2\2\u0517\u0512\3\2"+
		"\2\2\u0518\u00c9\3\2\2\2\u0519\u051a\7\62\2\2\u051a\u051e\5\u00c8e\2\u051b"+
		"\u051c\7=\2\2\u051c\u051e\5\u00ccg\2\u051d\u0519\3\2\2\2\u051d\u051b\3"+
		"\2\2\2\u051e\u00cb\3\2\2\2\u051f\u0521\7n\2\2\u0520\u0522\5\u009eP\2\u0521"+
		"\u0520\3\2\2\2\u0521\u0522\3\2\2\2\u0522\u0523\3\2\2\2\u0523\u0524\7o"+
		"\2\2\u0524\u00cd\3\2\2\2\u00a1\u00cf\u00d4\u00da\u00e2\u00eb\u00f0\u00f7"+
		"\u00fd\u0100\u0104\u010e\u0112\u0117\u011b\u011f\u0129\u0131\u0137\u013e"+
		"\u0144\u0148\u0150\u0159\u0160\u0166\u016a\u0174\u0177\u017a\u0183\u0188"+
		"\u0192\u0196\u01a2\u01ad\u01b2\u01ba\u01c2\u01cc\u01d5\u01dd\u01e2\u01ea"+
		"\u01ef\u01f9\u0203\u0209\u0210\u0215\u021d\u0221\u0223\u0229\u022e\u0232"+
		"\u0239\u023b\u0242\u0247\u0250\u0255\u0258\u025d\u0266\u0272\u027b\u0286"+
		"\u0289\u0290\u029a\u02a2\u02a5\u02a8\u02b5\u02bd\u02c2\u02ca\u02ce\u02d2"+
		"\u02d4\u02d8\u02de\u02e9\u02f3\u02f8\u0301\u0306\u0309\u0310\u0319\u0330"+
		"\u0333\u0336\u033e\u0342\u034a\u0350\u035b\u0364\u0369\u0372\u0379\u0386"+
		"\u038f\u0398\u039e\u03a9\u03ae\u03b6\u03ba\u03be\u03c2\u03c4\u03c8\u03cd"+
		"\u03de\u03e4\u03fa\u03fe\u0403\u0407\u0417\u043f\u0445\u0454\u0457\u0459"+
		"\u0463\u046c\u0470\u0474\u0486\u0488\u048d\u0492\u0497\u04a0\u04a2\u04a6"+
		"\u04ab\u04af\u04b3\u04b7\u04c1\u04cd\u04d4\u04d7\u04db\u04e3\u04e8\u04f3"+
		"\u04f7\u04fb\u0501\u050c\u0515\u0517\u051d\u0521";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}