/*
 * [The "BSD license"]
 *  Copyright (c) 2014 Terence Parr
 *  Copyright (c) 2014 Sam Harwell
 *  All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions
 *  are met:
 *
 *  1. Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *  2. Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *  3. The name of the author may not be used to endorse or promote products
 *     derived from this software without specific prior written permission.
 *
 *  THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 *  IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 *  OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 *  IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 *  INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 *  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 *  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 *  THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 *  (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 *  THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

/* Modified by axal25 */

grammar JavaGrammar;

@header{
	package javagrammar;
}
 
compilationUnit
    : packageDeclaration? importDeclaration* typeDeclaration* EOF
    ;

packageDeclaration
    : annotation* KEYWORDS_PACKAGE qualifiedName ';'
    ;

importDeclaration
    : KEYWORDS_IMPORT KEYWORDS_STATIC? qualifiedName ('.' '*')? ';'
    ;

typeDeclaration
    : classOrInterfaceModifier*
      (classDeclaration | interfaceDeclaration | annotationTypeDeclaration)
    | ';'
    ;

modifier
    : classOrInterfaceModifier
    | KEYWORDS_SYNCHRONIZED

    ;

classOrInterfaceModifier
    : annotation
    | KEYWORDS_PUBLIC
    | KEYWORDS_PROTECTED
    | KEYWORDS_PRIVATE
    | KEYWORDS_STATIC
    | KEYWORDS_ABSTRACT
    | KEYWORDS_FINAL    // FINAL for class only -- does not apply to interfaces
    | KEYWORDS_STRICTFP
    ;

variableModifier
    : KEYWORDS_FINAL
    | annotation
    ;

classDeclaration
    : KEYWORDS_CLASS IDENTIFIERS typeParameters?
      (KEYWORDS_EXTENDS typeType)?
      (KEYWORDS_IMPLEMENTS typeList)?
      classBody
    ;

typeParameters
    : '<' typeParameter (',' typeParameter)* '>'//UWAGAAA
    ;

typeParameter
    : annotation* IDENTIFIERS (KEYWORDS_EXTENDS typeBound)?
    ;

typeBound
    : typeType ('&' typeType)*
    ;

interfaceDeclaration
    : KEYWORDS_INTERFACE IDENTIFIERS typeParameters? (KEYWORDS_EXTENDS typeList)? interfaceBody
    ;

classBody
    : '{' classBodyDeclaration* '}'
    ;

interfaceBody
    : '{' interfaceBodyDeclaration* '}'
    ;

classBodyDeclaration
    : ';'
    | KEYWORDS_STATIC? block
    | modifier* memberDeclaration
    ;

memberDeclaration
    : methodDeclaration
    | genericMethodDeclaration
    | fieldDeclaration
    | constructorDeclaration
    | genericConstructorDeclaration
    | interfaceDeclaration
    | annotationTypeDeclaration
    | classDeclaration
    ;

/* We use rule this even for void methods which cannot have [] after parameters.
   This simplifies grammar and we can consider void to be a type, which
   renders the [] matching as a context-sensitive issue or a semantic check
   for invalid return type after parsing.
 */
methodDeclaration
    : methodPermissionModifier? methodTypeModifier? typeTypeOrVoid IDENTIFIERS formalParameters ('[' ']')* //typeTypeOrVoid IDENTIFIERS formalParameters ('[' ']')*
      (KEYWORDS_THROWS qualifiedNameList)?
      methodBody
    ;

methodPermissionModifier:
		  KEYWORDS_PUBLIC
		  |	KEYWORDS_PROTECTED
		  |	KEYWORDS_PRIVATE ;
		  
methodTypeModifier:
		  KEYWORDS_ABSTRACT 
		  |	KEYWORDS_STATIC
		  |	KEYWORDS_FINAL
		  |	KEYWORDS_SYNCHRONIZED
		  |	KEYWORDS_NATIVE
		  |	KEYWORDS_STRICTFP ;


methodBody
    : block
    | ';'
    ;

typeTypeOrVoid
    : typeType
    | KEYWORDS_VOID
    ;


genericMethodDeclaration
    : typeParameters methodDeclaration
    ;

genericConstructorDeclaration
    : typeParameters constructorDeclaration
    ;

constructorDeclaration
    : IDENTIFIERS formalParameters (KEYWORDS_THROWS qualifiedNameList)? constructorBody=block
    ;

fieldDeclaration
    : typeType variableDeclarators ';'
    ;

interfaceBodyDeclaration
    : modifier* interfaceMemberDeclaration
    | ';'
    ;

interfaceMemberDeclaration
    : constDeclaration
    | interfaceMethodDeclaration
    | genericInterfaceMethodDeclaration
    | interfaceDeclaration
    | annotationTypeDeclaration
    | classDeclaration
    ;

constDeclaration
    : typeType constantDeclarator (',' constantDeclarator)* ';'
    ;

constantDeclarator
    : IDENTIFIERS ('[' ']')* '=' variableInitializer
    ;

// see matching of [] comment in methodDeclaratorRest
// methodBody from Java8
interfaceMethodDeclaration
    : interfaceMethodModifier* (typeTypeOrVoid | typeParameters annotation* typeTypeOrVoid)
      IDENTIFIERS formalParameters ('[' ']')* (KEYWORDS_THROWS qualifiedNameList)? methodBody
    ;

// Java8
interfaceMethodModifier
    : annotation
    | KEYWORDS_PUBLIC
    | KEYWORDS_ABSTRACT
    | KEYWORDS_DEFAULT
    | KEYWORDS_STATIC
    | KEYWORDS_STRICTFP
    ;

genericInterfaceMethodDeclaration
    : typeParameters interfaceMethodDeclaration
    ;

variableDeclarators
    : variableDeclarator (',' variableDeclarator)*
    ;

variableDeclarator
    : variableDeclaratorId ('=' variableInitializer)?
    ;

variableDeclaratorId
    : IDENTIFIERS ('[' ']')*
    ;

variableInitializer
    : arrayInitializer
    | expression
    ;

arrayInitializer
    : '{' (variableInitializer (',' variableInitializer)* (',')? )? '}'
    ;

classOrInterfaceType
    : IDENTIFIERS typeArguments? ('.' IDENTIFIERS typeArguments?)*
    ;

typeArgument
    : typeType
    | '?' ((KEYWORDS_EXTENDS | KEYWORDS_SUPER) typeType)?
    ;

qualifiedNameList
    : qualifiedName (',' qualifiedName)*
    ;

formalParameters
    : '(' formalParameterList? ')'
    ;

formalParameterList
    : formalParameter (',' formalParameter)* (',' lastFormalParameter)?
    | lastFormalParameter
    ;

formalParameter
    : variableModifier* typeType variableDeclaratorId
    ;

lastFormalParameter
    : variableModifier* typeType '...' variableDeclaratorId
    ;

qualifiedName
    : IDENTIFIERS ('.' IDENTIFIERS)*
    ;

literal
    : integerLiteral
    | floatLiteral
    | LITERALS_TEXTUAL_CHAR
    | LITERALS_TEXTUAL_STRING
    | LITERALS_LOGICAL_BOOLEAN
    | LITERALS_REFERENCE_NULL
    ;

integerLiteral
	: LITERALS_NUMERIC_INT
    ;

floatLiteral
    : LITERALS_NUMERIC_DOUBLE
    ;

// ANNOTATIONS

annotation
    : '@' qualifiedName ('(' ( elementValuePairs | elementValue )? ')')?
    ;

elementValuePairs
    : elementValuePair (',' elementValuePair)*
    ;

elementValuePair
    : IDENTIFIERS '=' elementValue
    ;

elementValue
    : expression
    | annotation
    | elementValueArrayInitializer
    ;

elementValueArrayInitializer
    : '{' (elementValue (',' elementValue)*)? (',')? '}'
    ;

annotationTypeDeclaration
    : '@' KEYWORDS_INTERFACE IDENTIFIERS annotationTypeBody
    ;

annotationTypeBody
    : '{' (annotationTypeElementDeclaration)* '}'
    ;

annotationTypeElementDeclaration
    : modifier* annotationTypeElementRest
    | ';' // this is not allowed by the grammar, but apparently allowed by the actual compiler
    ;

annotationTypeElementRest
    : typeType annotationMethodOrConstantRest ';'
    | classDeclaration ';'?
    | interfaceDeclaration ';'?
    | annotationTypeDeclaration ';'?
    ;

annotationMethodOrConstantRest
    : annotationMethodRest
    | annotationConstantRest
    ;

annotationMethodRest
    : IDENTIFIERS '(' ')' defaultValue?
    ;

annotationConstantRest
    : variableDeclarators
    ;

defaultValue
    : KEYWORDS_DEFAULT elementValue
    ;

// STATEMENTS / BLOCKS

block
    : '{' blockStatement* '}'
    ;

blockStatement
    : localVariableDeclaration ';'
    | statement
    | localTypeDeclaration
    ;

localVariableDeclaration
    : variableModifier* typeType variableDeclarators
    ;

localTypeDeclaration
    : classOrInterfaceModifier*
      (classDeclaration | interfaceDeclaration)
    | ';'
    ;

statement
    : blockLabel=block
    | KEYWORDS_ASSERT expression (':' expression)? ';'
    | KEYWORDS_IF parExpression statement (KEYWORDS_ELSE statement)?
    | KEYWORDS_FOR '(' forControl ')' statement
    | KEYWORDS_WHILE parExpression statement
    | KEYWORDS_DO statement KEYWORDS_WHILE parExpression ';'
    | KEYWORDS_TRY block (catchClause+ finallyBlock? | finallyBlock)
    | KEYWORDS_TRY resourceSpecification block catchClause* finallyBlock?
    | KEYWORDS_SWITCH parExpression '{' switchBlockStatementGroup* switchLabel* '}'
    | KEYWORDS_SYNCHRONIZED parExpression block
    | KEYWORDS_RETURN expression? ';'
    | KEYWORDS_THROW expression ';'
    | KEYWORDS_BREAK IDENTIFIERS? ';'
    | KEYWORDS_CONTINUE IDENTIFIERS? ';'
    | statementExpression=expression ';'
    | identifierLabel=IDENTIFIERS ':' statement
    ;

catchClause
    : KEYWORDS_CATCH '(' variableModifier* catchType IDENTIFIERS ')' block
    ;

catchType
    : qualifiedName ('|' qualifiedName)*
    ;

finallyBlock
    : KEYWORDS_FINALLY block
    ;

resourceSpecification
    : '(' resources ';'? ')'
    ;

resources
    : resource (';' resource)*
    ;

resource
    : variableModifier* classOrInterfaceType variableDeclaratorId '=' expression
    ;

/** Matches cases then statements, both of which are mandatory.
 *  To handle empty cases at the end, we add switchLabel* to statement.
 */
switchBlockStatementGroup
    : switchLabel+ blockStatement+
    ;

switchLabel
    : KEYWORDS_CASE (constantExpression=expression) ':'
    | KEYWORDS_DEFAULT ':'
    ;

forControl
    : enhancedForControl
    | forInit? ';' expression? ';' forUpdate=expressionList?
    ;

forInit
    : localVariableDeclaration
    | expressionList
    ;

enhancedForControl
    : variableModifier* typeType variableDeclaratorId ':' expression
    ;

// EXPRESSIONS

parExpression
    : '(' expression ')'
    ;

expressionList
    : expression (',' expression)*
    ;

methodCall
    : IDENTIFIERS '(' expressionList? ')'
    ;

expression
    : primary
    | expression bop='.'
      ( IDENTIFIERS
      | methodCall
      | KEYWORDS_THIS
      | KEYWORDS_NEW nonWildcardTypeArguments? innerCreator
      | KEYWORDS_SUPER superSuffix
      | explicitGenericInvocation
      )
    | expression '[' expression ']'
    | methodCall
    | KEYWORDS_NEW creator
    | '(' typeType ')' expression
    | expression postfix=('++' | '--')
    | prefix=('+'|'-'|'++'|'--') expression
    | prefix=('~'|'!') expression
    | expression bop=('*'|'/'|'%') expression
    | expression bop=('+'|'-') expression
    | expression ('<' '<' | '>' '>' '>' | '>' '>') expression
    | expression bop=('<=' | '>=' | '>' | '<') expression
    | expression bop=KEYWORDS_INSTANCEOF typeType
    | expression bop=('==' | '!=') expression
    | expression bop='&' expression
    | expression bop='^' expression
    | expression bop='|' expression
    | expression bop='&&' expression
    | expression bop='||' expression
    | expression bop='?' expression ':' expression
    | <assoc=right> expression
      bop=('=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '>>=' | '>>>=' | '<<=' | '%=')
      expression
    | lambdaExpression // Java8

    // Java 8 methodReference
    | expression '::' typeArguments? IDENTIFIERS
    | typeType '::' (typeArguments? IDENTIFIERS | KEYWORDS_NEW)
    | classType '::' typeArguments? KEYWORDS_NEW
    ;

// Java8
lambdaExpression
    : lambdaParameters '->' lambdaBody
    ;

// Java8
lambdaParameters
    : IDENTIFIERS
    | '(' formalParameterList? ')'
    | '(' IDENTIFIERS (',' IDENTIFIERS)* ')'
    ;

// Java8
lambdaBody
    : expression
    | block
    ;

primary
    : '(' expression ')'
    | KEYWORDS_THIS
    | KEYWORDS_SUPER
    | literal
    | IDENTIFIERS
    | typeTypeOrVoid '.' KEYWORDS_CLASS
    | nonWildcardTypeArguments (explicitGenericInvocationSuffix | KEYWORDS_THIS arguments)
    ;

classType
    : (classOrInterfaceType '.')? annotation* IDENTIFIERS typeArguments?
    ;

creator
    : nonWildcardTypeArguments createdName classCreatorRest
    | createdName (arrayCreatorRest | classCreatorRest)
    ;

createdName
    : IDENTIFIERS typeArgumentsOrDiamond? ('.' IDENTIFIERS typeArgumentsOrDiamond?)*
    | primitiveType
    ;

innerCreator
    : IDENTIFIERS nonWildcardTypeArgumentsOrDiamond? classCreatorRest
    ;

arrayCreatorRest
    : '[' (']' ('[' ']')* arrayInitializer | expression ']' ('[' expression ']')* ('[' ']')*)
    ;

classCreatorRest
    : arguments classBody?
    ;

explicitGenericInvocation
    : nonWildcardTypeArguments explicitGenericInvocationSuffix
    ;

typeArgumentsOrDiamond
    : '<' '>'
    | typeArguments
    ;

nonWildcardTypeArgumentsOrDiamond
    : '<' '>'
    | nonWildcardTypeArguments
    ;

nonWildcardTypeArguments
    : '<' typeList '>'
    ;

typeList
    : typeType (',' typeType)*
    ;

typeType
    : annotation? (classOrInterfaceType | primitiveType) ('[' ']')*
    ;

primitiveType
    : KEYWORDS_BOOLEAN
    | KEYWORDS_CHAR
    | KEYWORDS_BYTE
    | KEYWORDS_SHORT
    | KEYWORDS_INT
    | KEYWORDS_LONG
    | KEYWORDS_FLOAT
    | KEYWORDS_DOUBLE
    ;

typeArguments
    : '<' typeArgument (',' typeArgument)* '>'
    ;

superSuffix
    : arguments
    | '.' IDENTIFIERS arguments?
    ;

explicitGenericInvocationSuffix
    : KEYWORDS_SUPER superSuffix
    | IDENTIFIERS arguments
    ;

arguments
    : '(' expressionList? ')'
    ;

// Lexer Rules-------------------------------------------------------------------------------------------

// Sztuczne, pomocnicze literaly

// Pomocnicze do LITERALS_NUMERIC_DOUBLE

// 10kowe

fragment DecimalFloatingPointLiteral:
				Digits SEPARATORS_PUNCTUATORS_DOT Digits? ExponentPart? FloatTypeSuffix?
				|	SEPARATORS_PUNCTUATORS_DOT Digits ExponentPart? FloatTypeSuffix?
				|	Digits ExponentPart FloatTypeSuffix?
				| Digits FloatTypeSuffix ;
				
fragment FloatTypeSuffix:
				[fFdD] ;

fragment ExponentIndicator:	
				[eE];

fragment ExponentPart:
				ExponentIndicator SignedInteger ;
				
fragment SignedInteger:
				Sign? Digits ;

fragment Sign:	
				[+-];

// 16kowe

fragment HexadecimalFloatingPointLiteral:
				HexSignificand BinaryExponent FloatTypeSuffix? ;
				

fragment HexSignificand:
				HexNumeral SEPARATORS_PUNCTUATORS_DOT?
				|	'0' [xX] HexDigits? SEPARATORS_PUNCTUATORS_DOT HexDigits ;

fragment BinaryExponent:
				BinaryExponentIndicator SignedInteger ;

fragment BinaryExponentIndicator:
				[pP] ;

// Pomocnicze do LITERALS_NUMERIC_INT

// 8kowe

fragment OctalIntegerLiteral:	
				OctalNumeral IntegerTypeSuffix? ;

fragment OctalNumeral:
				'0' Underscores? OctalDigits;

fragment OctalDigits:
				OctalDigit (OctalDigitsAndUnderscores? OctalDigit)? ;

fragment OctalDigit:
				[0-7];

fragment OctalDigitsAndUnderscores:	
				OctalDigitOrUnderscore+ ;

fragment OctalDigitOrUnderscore:
				OctalDigit
				| '_';
// 2kowe

fragment
BinaryIntegerLiteral:
				BinaryNumeral IntegerTypeSuffix? ;

fragment BinaryNumeral:
				'0' [bB] BinaryDigits ;

fragment BinaryDigits:
				BinaryDigit (BinaryDigitsAndUnderscores? BinaryDigit)? ;

fragment BinaryDigit:
				[01] ;

fragment BinaryDigitsAndUnderscores:
				BinaryDigitOrUnderscore+ ;

fragment BinaryDigitOrUnderscore:
				BinaryDigit
				| '_' ;

// 16kowe

fragment HexIntegerLiteral:
				HexNumeral IntegerTypeSuffix? ;
				
fragment HexNumeral:
				'0' [xX] HexDigits;
				
fragment HexDigits:	
				HexDigit ( HexDigitsAndUnderscores? HexDigit )? ;
				
fragment HexDigitsAndUnderscores:
				HexDigitOrUnderscore+ ;

fragment HexDigitOrUnderscore:	
				HexDigit
				|	'_' ;
				
fragment HexDigit:
				[0-9a-fA-F];

// 10kowe

fragment DecimalIntegerLiteral:
				DecimalNumeral IntegerTypeSuffix? ;

fragment IntegerTypeSuffix:	
				[lL];

fragment DecimalNumeral:
				'0'
				|	NONZERODIGIT ( Digits? | Underscores Digits ) ;

fragment Digits:
				DIGIT ( DigitsAndUnderscores? DIGIT )? ;
				
fragment DigitsAndUnderscores:
				DigitOrUnderscore+ ;

fragment DigitOrUnderscore:
				DIGIT
				| '_' ;
				
fragment Underscores:
				'_'+ ;

WHITE_SPACES:
            [ \t\r\n\u000C]+ -> skip ;



LINE_COMMENT:
            COMMENTS_LINE ~([\r\n\u2028\u2029])* -> channel(HIDDEN) ;
            
NEW_LINE: '\r'?'\n';
            
COMMENTS_BLOCK:
        COMMENTS_BLOCK_OPENING .*? COMMENTS_BLOCK_CLOSING -> channel(HIDDEN) ;
        

UNTERMINATED_STRING:
				'"' (~["\\\r\n] | '\\' (. | EOF))* ;        

fragment LETTERORDIGIT:
				LETTER
				| DIGIT ;

fragment DIGIT:
                '0'
                | NONZERODIGIT;
                
fragment NONZERODIGIT:
				[1-9$_];
                
fragment LETTER:
                LOWERCASE_LETTER | UPPERCASE_LETTER 
                | ~[\u0000-\u007F\uD800-\uDBFF]
					{ Character.isJavaIdentifierStart(_input.LA(-1) ) }?
				| [\uD800-\uDBFF] [\uDC00-\uDFFF]
					{ Character.isJavaIdentifierStart(  Character.toCodePoint( (char)_input.LA(-2), (char)_input.LA(-1))  ) }? ;
                
fragment LOWERCASE_LETTER:
				[a-z$_];
				
fragment UPPERCASE_LETTER:
				[A-Z$_];

//Tokeny ( literaly ) rzeczywiste

ADDITIONAL_LITERAL_AT:					'@'; //zmiana
ADDITIONAL_LITERAL_ELLIPSIS:			'...'; //zmiana

//KEYWORDS_CLASS_LONG:					'Long';
//KEYWORDS_CLASS_STRING:					'String';

KEYWORDS_ABSTRACT:				        'abstract'; //nie obsluzone
KEYWORDS_ASSERT:				        'assert'; //nie obsluzone - Nie bede uzywac
KEYWORDS_BOOLEAN:				        'boolean';
KEYWORDS_BREAK: 						'break';
KEYWORDS_BYTE: 							'byte';
KEYWORDS_CASE:							'case';
KEYWORDS_CATCH:				            'catch'; //nie obsluzone
KEYWORDS_CHAR:							'char';
KEYWORDS_CLASS:				            'class'; //nie obsluzone
KEYWORDS_CONST:							'const'; //NIE UZYWALNE
KEYWORDS_CONTINUE:						'continue';
KEYWORDS_DEFAULT:				        'default'; //nie obsluzone
KEYWORDS_DO:							'do';
KEYWORDS_DOUBLE:						'double';
KEYWORDS_ELSE:							'else';
KEYWORDS_EXTENDS:				        'extends'; //nie obsluzone
KEYWORDS_FINAL:				            'final'; //nie obsluzone
KEYWORDS_FINALLY:				        'finally'; //nie obsluzone
KEYWORDS_FLOAT:							'float';
KEYWORDS_FOR:							'for';
KEYWORDS_GOTO:				            'goto'; //NIEUZYWALNE
KEYWORDS_IF:							'if';
KEYWORDS_IMPLEMENTS:	                'implements'; //nie obsluzone
KEYWORDS_IMPORT:				        'import'; //nie obsluzone
KEYWORDS_INSTANCEOF:		            'instanceof'; //nie obsluzone
KEYWORDS_INT:						    'int';
KEYWORDS_INTERFACE:			            'interface'; //nie obsluzone
KEYWORDS_LONG:							'long';
KEYWORDS_NATIVE:			            'native'; //nie obsluzone
KEYWORDS_NEW:				            'new'; //nie obsluzone
KEYWORDS_PACKAGE:			            'package'; //nie obsluzone
KEYWORDS_PRIVATE:			            'private'; //nie obsluzone
KEYWORDS_PROTECTED:				        'protected'; //nie obsluzone
KEYWORDS_PUBLIC:			            'public'; //nie obsluzone
KEYWORDS_RETURN:						'return';
KEYWORDS_SHORT:							'short';
KEYWORDS_STATIC:				        'static'; //nie obsluzone
KEYWORDS_STRICTFP:  		            'strictfp'; //nie obsluzone
KEYWORDS_SUPER:				            'super'; //nie obsluzone
KEYWORDS_SYNCHRONIZED:		            'synchronized'; //nie obsluzone
KEYWORDS_SWITCH:						'switch';
KEYWORDS_THIS:				            'this'; //nie obsluzone
KEYWORDS_THROW:				            'throw'; //nie obsluzone
KEYWORDS_THROWS:			            'throws'; //nie obsluzone
KEYWORDS_TRANSIENT:			            'transient'; //nie obsluzone
KEYWORDS_TRY:				            'try'; //nie obsluzone
KEYWORDS_VOID:							'void';
KEYWORDS_VOLATILE:			            'volatile'; //nie obsluzone
KEYWORDS_WHILE:							'while';

IDENTIFIERS:
	LETTER LETTERORDIGIT* ;
	
    //Dodac rozne rodzaje identifiers? VariableName, ClassName, GlobalVariableName, MethodName
    
LITERALS_NUMERIC_INT:
			DecimalIntegerLiteral
			|	HexIntegerLiteral
			|	OctalIntegerLiteral
			|	BinaryIntegerLiteral ;
                
LITERALS_NUMERIC_DOUBLE:
			DecimalFloatingPointLiteral
			|	HexadecimalFloatingPointLiteral ;
             
LITERALS_LOGICAL_BOOLEAN:				 'true' | 'false';

LITERALS_TEXTUAL_CHAR:		           	 '\'' . '\'' ;
            
LITERALS_TEXTUAL_STRING:				 UNTERMINATED_STRING '"';
            
LITERALS_REFERENCE_NULL:				 'null';

OPERATORS_IF:					         '?';
OPERATORS_ELSE:							 ':';
OPERATORS_ASSIGNMENT:					 '=';
OPERATORS_GREATERTHAN:					 '>';
OPERATORS_LESSTHAN:						 '<';
OPERATORS_LOGICALNOT:					 '!';
OPERATORS_LESSTHANOREQUAL:               '<=';
OPERATORS_GREATERTHANOREQUAL:            '>=';
OPERATORS_LOGICALEQUAL:					 '==';
OPERATORS_LOGICALNOTEQUAL:				 '!=';
OPERATORS_LOGICALAND:					 '&&';
OPERATORS_LOGICALOR:					 '||';
OPERATORS_INCREMENT:					 '++';
OPERATORS_DECREMENT:					 '--';
OPERATORS_ADDITION:						 '+';
OPERATORS_SUBTRACTION:					 '-';
OPERATORS_MULTIPLICATION:				 '*';
OPERATORS_DIVISION:						 '/';
OPERATORS_MODULO:						 '%';
OPERATORS_ADDITIONANDASSIGNMENT:		 '+=';
OPERATORS_SUBTRACTIONANDASSIGNMENT:		 '-=';
OPERATORS_MULTIPLICATIONANDASSIGNMENT:	 '*=';
OPERATORS_DIVISIONANDASSIGNMENT:		 '/=';
OPERATORS_MODULOANDASSIGMENT:            '%=';
OPERATORS_LOGICALANDASSIGNMENT:			 '&&=';
OPERATORS_BITWISENOT:					 '~';
OPERATORS_BITWISEAND:					 '&';
OPERATORS_BITWISEOR:					 '|';
OPERATORS_BITWISEXOR:					 '^';
OPERATORS_BITWISEANDASSIGNMENT:			 '&=';
OPERATORS_BITWISEXORASSIGNMENT:			 '^=';
OPERATORS_BITWISEORASSIGNMENT:			 '|=';
OPERATORS_SHIFTLEFT:					 '<<';
OPERATORS_SHIFTRIGHT:				     '>>';
OPERATORS_SHIFTRIGHTUNSIGNED:			 '>>>';
OPERATORS_SHIFTLEFTASSIGNMENT:			 '<<=';
OPERATORS_SHIFTRIGHTASSIGNMENT:			 '>>=';
OPERATORS_SHIFTRIGHTUNSIGNEDASSIGNMENT:  '>>>=';


SEPARATORS_PUNCTUATORS_SEMICOLON:		 ';';
SEPARATORS_PUNCTUATORS_COMMA:			 ',';
SEPARATORS_PUNCTUATORS_DOT:				 '.';
SEPARATORS_PUNCTUATORS_ESCAPECHARACTER:	 '\\';

SEPARATORS_DELIMITERS_LEFTPARENTHESIS:   '(';
SEPARATORS_DELIMITERS_RIGHTPARENTHESIS:	 ')';
SEPARATORS_DELIMITERS_LEFTCURLYBRACKET:	 '{';
SEPARATORS_DELIMITERS_RIGHTCURLYBRACKET: '}';
SEPARATORS_DELIMITERS_LEFTSQUAREBRACKET: '[';
SEPARATORS_DELIMITERS_RIGHTSQUAREBRACKET:']';

COMMENTS_LINE:    						 '//';
COMMENTS_BLOCK_OPENING:					 '/*';
COMMENTS_BLOCK_CLOSING:					 '*/';
