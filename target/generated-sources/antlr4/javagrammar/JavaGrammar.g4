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
 
// Parser Rules
 
compilationUnit:
				methodDeclaraction* ;
                // packageDeclaration? importDeclaration* typeDeclaration* EOF;

typeDeclaration:
		  classDeclaration
		  //|	interfaceDeclaration
		  |	SEPARATORS_PUNCTUATORS_SEMICOLON ;
		  
classDeclaration:	
		  classPermissionModifier? classTypeModifier? KEYWORDS_CLASS IDENTIFIERS /* TypeParameters */ 
		  /*(KEYWORDS_EXTENDS classType)?*/ /*(KEYWORDS_IMPLEMENTS interfaceTypeList)?*/ 
		  classBody ;
		  //|	enumDeclaration ;
		  
classPermissionModifier:
		/*annotation*/
		|	KEYWORDS_PUBLIC
		|	KEYWORDS_PROTECTED
		|	KEYWORDS_PUBLIC ;
		
classTypeModifier:
		|	KEYWORDS_ABSTRACT
		|	KEYWORDS_STATIC
		|	KEYWORDS_FINAL
		|	KEYWORDS_STRICTFP ;

classBody:
		SEPARATORS_DELIMITERS_LEFTCURLYBRACKET classBodyDeclaration* SEPARATORS_DELIMITERS_RIGHTCURLYBRACKET ;
		
classBodyDeclaration: '\u000E';
//		classMemberDeclaration
//		|	block
//		|	KEYWORDS_STATIC block
//		|	constructorModifier* 
//		typeParameters? simpleTypeName SEPARATORS_DELIMITERS_LEFTPARENTHESIS formalParameterList? SEPARATORS_DELIMITERS_RIGHTPARENTHESIS
//		(KEYWORDS_THROWS exceptionTypeList)? constructorBody ;
		
classMemberDeclaration: '\u000E';	
//		fieldDeclaration
//		|	methodDeclaration
//		|	classDeclaration
//		|	interfaceDeclaration
//		|	SEPARATORS_PUNCTUATORS_SEMICOLON ;


/*
classType:
		classOrInterfaceType SEPARATORS_PUNCTUATORS_DOT *//*annotation**//* IDENTIFIERS typeArguments? ;
		
classOrInterfaceType:
		(	classType_lfno_classOrInterfaceType
		|	interfaceType_lfno_classOrInterfaceType
		)
		(	classType_lf_classOrInterfaceType
		|	interfaceType_lf_classOrInterfaceType
		)* ;
*/
/*
interfaceTypeList:
			interfaceType (SEPARATORS_PUNCTUATORS_COMMA interfaceType)* ;
			
interfaceType:	
			classType; */
			
//classType:
//		  /* annotation* */ IDENTIFIERS typeArguments?
//		  |	/* classOrInterfaceType SEPARATORS_PUNCTUATORS_DOT */ /* annotation* */ IDENTIFIERS typeArguments? ;
//		  
//typeArguments
//	:	OPERATORS_LESSTHAN typeArgumentList OPERATORS_GREATERTHAN
//	;
//
//typeArgumentList
//	:	typeArgument (SEPARATORS_PUNCTUATORS_COMMA typeArgument)*
//	;
//
//typeArgument
//	:	referenceType
//	|	wildcard
//	;
//
//wildcard
//	:	annotation* '?' wildcardBounds?
//	;
//
//wildcardBounds
//	:	'extends' referenceType
//	|	KEYWORDS_SUPER referenceType
//;


methodDeclaraction:
        /*annotation*/ methodPermissionModifier? methodTypeModifier? methodReturnType methodDeclarator
        ( block | SEPARATORS_PUNCTUATORS_SEMICOLON ) ;

/*annotation:
		;*/
methodDeclarator:
		IDENTIFIERS SEPARATORS_DELIMITERS_LEFTPARENTHESIS parameterList? SEPARATORS_DELIMITERS_RIGHTPARENTHESIS dims?;

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

methodReturnType:
		  unannType
		| KEYWORDS_VOID ;

variableDeclaration:
                     variableType IDENTIFIERS ;

statementNoShortIf:
		  statementWithoutTrailingSubStatement
		  |	IDENTIFIERS OPERATORS_ELSE statementNoShortIf
		  |	KEYWORDS_IF SEPARATORS_DELIMITERS_LEFTPARENTHESIS expression SEPARATORS_DELIMITERS_RIGHTPARENTHESIS statementNoShortIf KEYWORDS_ELSE statementNoShortIf
		  |	KEYWORDS_WHILE SEPARATORS_DELIMITERS_LEFTPARENTHESIS expression SEPARATORS_DELIMITERS_RIGHTPARENTHESIS statementNoShortIf
		  |	forStatementNoShortIf ;
		  
forStatementNoShortIf:
		  basicForStatementNoShortIf
		  |	enhancedForStatementNoShortIf ;

basicForStatementNoShortIf:
		  KEYWORDS_FOR SEPARATORS_DELIMITERS_LEFTPARENTHESIS forInit? SEPARATORS_PUNCTUATORS_SEMICOLON expression? SEPARATORS_PUNCTUATORS_SEMICOLON forUpdate? SEPARATORS_DELIMITERS_RIGHTPARENTHESIS statementNoShortIf ;
		  
enhancedForStatementNoShortIf:
		  KEYWORDS_FOR SEPARATORS_DELIMITERS_LEFTPARENTHESIS keywordsType IDENTIFIERS OPERATORS_ELSE IDENTIFIERS SEPARATORS_DELIMITERS_RIGHTPARENTHESIS (block | statementNoShortIf) ;

forStatement:
		  basicForStatement
		  |	enhancedForStatement ;


basicForStatement:
		  KEYWORDS_FOR SEPARATORS_DELIMITERS_LEFTPARENTHESIS forInit? SEPARATORS_PUNCTUATORS_SEMICOLON expression? SEPARATORS_PUNCTUATORS_SEMICOLON forUpdate? SEPARATORS_DELIMITERS_RIGHTPARENTHESIS statement ;

statement:
		statementWithoutTrailingSubStatement
		|	IDENTIFIERS OPERATORS_ELSE statement
		|	KEYWORDS_IF SEPARATORS_DELIMITERS_LEFTPARENTHESIS expression SEPARATORS_DELIMITERS_RIGHTPARENTHESIS statement 
		|	KEYWORDS_IF SEPARATORS_DELIMITERS_LEFTPARENTHESIS expression SEPARATORS_DELIMITERS_RIGHTPARENTHESIS statement KEYWORDS_ELSE statement
		|	KEYWORDS_WHILE SEPARATORS_DELIMITERS_LEFTPARENTHESIS expression SEPARATORS_DELIMITERS_RIGHTPARENTHESIS statement
		|	forStatement ;
		  
statementWithoutTrailingSubStatement:
		  block
		  |	SEPARATORS_PUNCTUATORS_SEMICOLON
		  |	expressionStatement SEPARATORS_PUNCTUATORS_SEMICOLON
		  |	switchStatement
		  |	KEYWORDS_DO statement 
		  		KEYWORDS_WHILE SEPARATORS_DELIMITERS_LEFTPARENTHESIS 
		  			expression
		  		SEPARATORS_DELIMITERS_RIGHTPARENTHESIS SEPARATORS_PUNCTUATORS_SEMICOLON
		  |	breakStatement
		  |	continueStatement
		  |	returnStatement
		  |	KEYWORDS_SYNCHRONIZED KEYWORDS_WHILE SEPARATORS_DELIMITERS_LEFTPARENTHESIS expression SEPARATORS_DELIMITERS_RIGHTPARENTHESIS block
		  |	KEYWORDS_THROWS expression SEPARATORS_PUNCTUATORS_SEMICOLON ;
//		  |	tryStatement ;
		
expressionStatement:
		  assignment
		  |	preIncrementationExpression
		  |	preDecrementationExpression
		  |	postIncrementationExpression
		  |	postDecrementationExpression
		  |	methodInvocation
		  |	classInstanceCreationExpression ;
		  
classInstanceCreationExpression
		  :	KEYWORDS_NEW /*typeArguments?*/ typeLiteralArguments? /* annotation* */ IDENTIFIERS (SEPARATORS_PUNCTUATORS_DOT /* annotation* */ IDENTIFIERS)* typeArgumentsOrDiamond? SEPARATORS_DELIMITERS_LEFTPARENTHESIS argumentList? SEPARATORS_DELIMITERS_RIGHTPARENTHESIS classBody?
		  |	expressionName SEPARATORS_PUNCTUATORS_DOT KEYWORDS_NEW /*typeArguments?*/ typeLiteralArguments? /* annotation* */ IDENTIFIERS typeArgumentsOrDiamond? SEPARATORS_DELIMITERS_LEFTPARENTHESIS /*typeArguments?*/ typeLiteralArguments? SEPARATORS_DELIMITERS_RIGHTPARENTHESIS classBody?
		  |	primary SEPARATORS_PUNCTUATORS_DOT KEYWORDS_NEW /*typeArguments?*/ typeLiteralArguments? /* annotation* */ IDENTIFIERS typeArgumentsOrDiamond? SEPARATORS_DELIMITERS_LEFTPARENTHESIS argumentList? SEPARATORS_DELIMITERS_RIGHTPARENTHESIS classBody?
		  ;
		  
typeArgumentsOrDiamond:
		  /*typeArguments*/ typeLiteralArguments
		  | OPERATORS_LESSTHAN OPERATORS_GREATERTHAN;
		  
methodInvocation
		:	IDENTIFIERS SEPARATORS_DELIMITERS_LEFTPARENTHESIS argumentList? SEPARATORS_DELIMITERS_RIGHTPARENTHESIS
		|	typeName SEPARATORS_PUNCTUATORS_DOT /*typeArguments?*/ typeLiteralArguments? keywordsType IDENTIFIERS SEPARATORS_DELIMITERS_LEFTPARENTHESIS argumentList? SEPARATORS_DELIMITERS_RIGHTPARENTHESIS
		|	expressionName SEPARATORS_PUNCTUATORS_DOT /*typeArguments?*/ IDENTIFIERS SEPARATORS_DELIMITERS_LEFTPARENTHESIS argumentList? SEPARATORS_DELIMITERS_RIGHTPARENTHESIS
		|	primary SEPARATORS_PUNCTUATORS_DOT /*typeArguments?*/ typeLiteralArguments? IDENTIFIERS SEPARATORS_DELIMITERS_LEFTPARENTHESIS argumentList? SEPARATORS_DELIMITERS_RIGHTPARENTHESIS
		|	KEYWORDS_SUPER SEPARATORS_PUNCTUATORS_DOT /*typeArguments?*/ typeLiteralArguments? IDENTIFIERS SEPARATORS_DELIMITERS_LEFTPARENTHESIS argumentList? SEPARATORS_DELIMITERS_RIGHTPARENTHESIS
		|	typeName SEPARATORS_PUNCTUATORS_DOT KEYWORDS_SUPER SEPARATORS_PUNCTUATORS_DOT /*typeArguments?*/ typeLiteralArguments? IDENTIFIERS SEPARATORS_DELIMITERS_LEFTPARENTHESIS argumentList? SEPARATORS_DELIMITERS_RIGHTPARENTHESIS
		;
		
primary : '\u000E';
//		(	primaryNoNewArray_lfno_primary
//		|	arrayCreationExpression
//		)
//		(	primaryNoNewArray_lf_primary
//		)* ;
	
typeName:
		IDENTIFIERS
		| typeName SEPARATORS_PUNCTUATORS_DOT IDENTIFIERS ;
	
argumentList:
		expression (SEPARATORS_PUNCTUATORS_COMMA expression)* ;
		
		
typeLiteralArguments:
		OPERATORS_LESSTHAN keywordsType OPERATORS_GREATERTHAN;
		
expressionName:
		IDENTIFIERS
		|	expressionName SEPARATORS_PUNCTUATORS_DOT IDENTIFIERS ;		  

switchStatement:	
			KEYWORDS_SWITCH SEPARATORS_DELIMITERS_LEFTPARENTHESIS expression SEPARATORS_DELIMITERS_RIGHTPARENTHESIS 
			SEPARATORS_DELIMITERS_LEFTCURLYBRACKET 
				( (switchLabel switchLabel) blockStatement+ )* switchLabel* 
			SEPARATORS_DELIMITERS_LEFTCURLYBRACKET ;
			
switchLabel:
		  KEYWORDS_CASE expression OPERATORS_ELSE
		  |	KEYWORDS_CASE IDENTIFIERS OPERATORS_ELSE
		  |	KEYWORDS_DEFAULT OPERATORS_ELSE ;

blockStatement:
		  localVariableDeclaration SEPARATORS_PUNCTUATORS_SEMICOLON
	      |	classDeclaration
		  |	statement ;
		  
localVariableDeclaration:
		  KEYWORDS_FINAL? unannType variableDeclaratorList ;
		  
variableDeclaratorList:
		  variableDeclarator (SEPARATORS_PUNCTUATORS_COMMA variableDeclarator)* ;

variableDeclarator:
		  variableDeclaratorId (OPERATORS_ASSIGNMENT variableInitializer)? ;

variableDeclaratorId:
		  IDENTIFIERS dims? ;

variableInitializer:
		  expression
		  | arrayInitializer ;
	
arrayInitializer:
		  SEPARATORS_DELIMITERS_LEFTCURLYBRACKET variableInitializerList? SEPARATORS_PUNCTUATORS_COMMA? SEPARATORS_DELIMITERS_RIGHTCURLYBRACKET ;
	
variableInitializerList:
		  variableInitializer (SEPARATORS_PUNCTUATORS_COMMA variableInitializer)* ;

dims:
		/* annotation* */ SEPARATORS_DELIMITERS_LEFTSQUAREBRACKET SEPARATORS_DELIMITERS_RIGHTSQUAREBRACKET ( /* annotation* */ SEPARATORS_DELIMITERS_LEFTSQUAREBRACKET SEPARATORS_DELIMITERS_RIGHTSQUAREBRACKET)* ;
		
unannType:
		  unannPrimitiveType
		  | unannReferenceType ;
		  
unannPrimitiveType:
		  KEYWORDS_BYTE
		  |	KEYWORDS_SHORT
		  |	KEYWORDS_INT
		  |	KEYWORDS_LONG
		  | KEYWORDS_CHAR
		  |	KEYWORDS_FLOAT
		  | KEYWORDS_DOUBLE 
		  | KEYWORDS_BOOLEAN;
		  //| KEYWORDS_CLASS_STRING//ZMIANA ale bez sensu na razie proba 1
         //| KEYWORDS_CLASS_LONG;//ZMIANA ale bez sensu na razie proba 1

unannReferenceType:	
		  unannClassOrInterfaceType
		  |	/* unannTypeVariable */ IDENTIFIERS
		  |	unannArrayType ;
		  
unannClassOrInterfaceType:
		  (unannClassType_lfno_unannClassOrInterfaceType
		  |	unannInterfaceType_lfno_unannClassOrInterfaceType )
		  (	unannClassType_lf_unannClassOrInterfaceType
		  |	unannInterfaceType_lf_unannClassOrInterfaceType  )* ;

unannClassType_lfno_unannClassOrInterfaceType:
			IDENTIFIERS /* typeArguments? */ typeLiteralArguments? ;
	
unannInterfaceType_lfno_unannClassOrInterfaceType:
			unannClassType_lfno_unannClassOrInterfaceType ;
	
unannClassType_lf_unannClassOrInterfaceType:
			SEPARATORS_PUNCTUATORS_DOT /* annotation* */ IDENTIFIERS /* typeArguments? */ typeLiteralArguments? ;
	
unannInterfaceType_lf_unannClassOrInterfaceType:
			unannClassType_lf_unannClassOrInterfaceType ;
			
unannArrayType:
		  unannPrimitiveType dims
		  |	unannClassOrInterfaceType dims
		  |	/*unannTypeVariable*/ IDENTIFIERS dims ;

loopStatement:
                statement
             |  breakStatement
             |  continueStatement
             ;

comparisonOperator:
      OPERATORS_GREATERTHAN
    | OPERATORS_LESSTHAN
    | OPERATORS_GREATERTHANOREQUAL
    | OPERATORS_LESSTHANOREQUAL
    | OPERATORS_LOGICALEQUAL
    ;

number:
      LITERALS_NUMERIC_INT
    | LITERALS_NUMERIC_DOUBLE
    ;

numberEquivalent:
      number
    | IDENTIFIERS
    ;

logicalConst:
      LITERALS_LOGICAL_BOOLEAN
    | LITERALS_LOGICAL_BOOLEAN
    ;

logicalEquivalent:
      logicalConst
    | IDENTIFIERS ;

arithmeticExpression:
       OPERATORS_SUBTRACTION arithmeticExpression
     | arithmeticExpression OPERATORS_MULTIPLICATION arithmeticExpression
     | arithmeticExpression OPERATORS_DIVISION arithmeticExpression
     | arithmeticExpression OPERATORS_ADDITION arithmeticExpression
     | arithmeticExpression OPERATORS_SUBTRACTION arithmeticExpression
     | SEPARATORS_DELIMITERS_LEFTPARENTHESIS arithmeticExpression SEPARATORS_DELIMITERS_RIGHTPARENTHESIS
     | numberEquivalent
     ;

comparisonExpression:
       arithmeticExpression comparisonOperator arithmeticExpression
     | SEPARATORS_DELIMITERS_LEFTPARENTHESIS comparisonExpression SEPARATORS_DELIMITERS_RIGHTPARENTHESIS
     ;

logicalExpression:
       logicalExpression OPERATORS_LOGICALAND logicalExpression
     | logicalExpression OPERATORS_LOGICALOR logicalExpression
     | logicalExpression OPERATORS_BITWISEAND logicalExpression
     | logicalExpression OPERATORS_BITWISEOR logicalExpression
     | comparisonExpression
     | SEPARATORS_DELIMITERS_LEFTPARENTHESIS logicalExpression SEPARATORS_DELIMITERS_RIGHTPARENTHESIS
     | logicalEquivalent
     ;

block: 
		SEPARATORS_DELIMITERS_LEFTCURLYBRACKET (blockStatement+)? SEPARATORS_DELIMITERS_RIGHTCURLYBRACKET ;
		
loopBlock:
      SEPARATORS_DELIMITERS_LEFTCURLYBRACKET loopStatement* SEPARATORS_DELIMITERS_RIGHTCURLYBRACKET ;


ifStatement:
    KEYWORDS_IF SEPARATORS_DELIMITERS_LEFTPARENTHESIS logicalExpression SEPARATORS_DELIMITERS_RIGHTPARENTHESIS (block | statement)
    ( KEYWORDS_ELSE KEYWORDS_IF SEPARATORS_DELIMITERS_LEFTPARENTHESIS logicalExpression SEPARATORS_DELIMITERS_RIGHTPARENTHESIS (block | statement))*
    (KEYWORDS_ELSE (block | statement))?
    ;

doWhileStatement:
    KEYWORDS_DO (loopBlock | loopStatement) KEYWORDS_WHILE SEPARATORS_DELIMITERS_LEFTPARENTHESIS logicalExpression SEPARATORS_DELIMITERS_RIGHTPARENTHESIS
    ;

whileDoStatement:
    KEYWORDS_WHILE SEPARATORS_DELIMITERS_LEFTPARENTHESIS logicalExpression SEPARATORS_DELIMITERS_RIGHTPARENTHESIS (loopBlock | loopStatement)
    ;

expression:
        arithmeticExpression
      | logicalExpression
      | assignmentExpression
      | preIncrementationExpression
      | postIncrementationExpression
      | preDecrementationExpression
      | postDecrementationExpression ;

assignment:
        assignmentExpression
        SEPARATORS_PUNCTUATORS_SEMICOLON ;


assignmentExpression:
        IDENTIFIERS assignmentOperator (IDENTIFIERS | expression)
      | IDENTIFIERS (OPERATORS_ASSIGNMENT IDENTIFIERS)+ expression? ;

assignmentOperator:
        OPERATORS_ASSIGNMENT
	  | OPERATORS_MULTIPLICATIONANDASSIGNMENT
	  | OPERATORS_DIVISIONANDASSIGNMENT
	  | OPERATORS_MODULOANDASSIGMENT
	  | OPERATORS_ADDITIONANDASSIGNMENT
	  | OPERATORS_SUBTRACTIONANDASSIGNMENT
	  | OPERATORS_SHIFTLEFTASSIGNMENT
	  | OPERATORS_SHIFTRIGHTASSIGNMENT
	  | OPERATORS_SHIFTRIGHTUNSIGNEDASSIGNMENT
	  | OPERATORS_BITWISEANDASSIGNMENT
	  | OPERATORS_BITWISEXORASSIGNMENT
	  | OPERATORS_BITWISEORASSIGNMENT ;

forInit:
        variableDeclaration (OPERATORS_ASSIGNMENT IDENTIFIERS)+ (OPERATORS_ASSIGNMENT (numberEquivalent | LITERALS_TEXTUAL_CHAR | LITERALS_TEXTUAL_STRING))?
      | IDENTIFIERS (OPERATORS_ASSIGNMENT IDENTIFIERS)+ (OPERATORS_ASSIGNMENT (numberEquivalent | LITERALS_TEXTUAL_CHAR | LITERALS_TEXTUAL_STRING | IDENTIFIERS))?
      | variableDeclaration OPERATORS_ASSIGNMENT (numberEquivalent | LITERALS_TEXTUAL_CHAR | LITERALS_TEXTUAL_STRING | IDENTIFIERS)
      ;

forUpdate:
        assignmentExpression+ (SEPARATORS_PUNCTUATORS_COMMA assignmentExpression)*
      ;

enhancedForStatement:
        KEYWORDS_FOR SEPARATORS_DELIMITERS_LEFTPARENTHESIS keywordsType IDENTIFIERS OPERATORS_ELSE IDENTIFIERS SEPARATORS_DELIMITERS_RIGHTPARENTHESIS (block | statement)
      ;

returnStatement:
        KEYWORDS_RETURN expression? SEPARATORS_PUNCTUATORS_SEMICOLON
      ;

breakStatement:
        KEYWORDS_BREAK IDENTIFIERS? SEPARATORS_PUNCTUATORS_SEMICOLON
      ;

continueStatement:
      KEYWORDS_CONTINUE IDENTIFIERS? SEPARATORS_PUNCTUATORS_SEMICOLON
    ;

parameterList:
        //( variableType IDENTIFIERS (SEPARATORS_PUNCTUATORS_COMMA parameterList)* ) ;
        receiverParameter
        | formalParameters  SEPARATORS_PUNCTUATORS_COMMA lastFormalParameter
        | lastFormalParameter
        ;

formalParameters
	:	KEYWORDS_FINAL* unannType variableDeclaratorId (SEPARATORS_PUNCTUATORS_COMMA KEYWORDS_FINAL* unannType variableDeclaratorId)*
	|	receiverParameter (SEPARATORS_PUNCTUATORS_COMMA formalParameter)*
	;

lastFormalParameter
	:	KEYWORDS_FINAL* unannType '...' variableDeclaratorId
	|	formalParameter
;

formalParameter
	:	KEYWORDS_FINAL* unannType variableDeclaratorId
;

receiverParameter
	:	unannType (IDENTIFIERS SEPARATORS_PUNCTUATORS_DOT)? KEYWORDS_THIS
;

operatorsBitwise:
		OPERATORS_BITWISENOT
      | OPERATORS_BITWISEAND
      | OPERATORS_BITWISEOR
      | OPERATORS_BITWISEXOR
      | OPERATORS_BITWISEANDASSIGNMENT
      | OPERATORS_BITWISEORASSIGNMENT
      | OPERATORS_BITWISEXORASSIGNMENT
      | OPERATORS_SHIFTRIGHTUNSIGNED
      | OPERATORS_SHIFTLEFT
      | OPERATORS_SHIFTRIGHT
      | OPERATORS_SHIFTRIGHTUNSIGNEDASSIGNMENT
      | OPERATORS_SHIFTLEFTASSIGNMENT
      | OPERATORS_SHIFTRIGHTASSIGNMENT ;

expressionBitwise:
        (IDENTIFIERS | LITERALS_NUMERIC_INT) (operatorsBitwise (IDENTIFIERS | LITERALS_NUMERIC_INT))+ 
        ;

//stringNullAssignment:
      //  KEYWORDS_CLASS_STRING IDENTIFIERS OPERATORS_ASSIGNMENT LITERALS_REFERENCE_NULL 
       // ;

preIncrementationExpression:
        OPERATORS_INCREMENT IDENTIFIERS 
        ;

postIncrementationExpression:
        IDENTIFIERS OPERATORS_INCREMENT 
        ;

preDecrementationExpression:
        OPERATORS_DECREMENT IDENTIFIERS 
        ;

postDecrementationExpression:
        IDENTIFIERS OPERATORS_DECREMENT 
        ;

variableType:
		keywordsType
		| keywordsType SEPARATORS_DELIMITERS_LEFTSQUAREBRACKET LITERALS_NUMERIC_INT? SEPARATORS_DELIMITERS_RIGHTSQUAREBRACKET ;

keywordsType:
        KEYWORDS_BOOLEAN
      | KEYWORDS_BYTE
      | KEYWORDS_CHAR
      | KEYWORDS_INT
      | KEYWORDS_SHORT
      | KEYWORDS_LONG
      | KEYWORDS_FLOAT
      | KEYWORDS_DOUBLE ;
    //  | KEYWORDS_CLASS_STRING
    //  | KEYWORDS_CLASS_LONG;
      
 
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
				[1-9];
                
fragment LETTER:
                LOWERCASE_LETTER | UPPERCASE_LETTER 
                | ~[\u0000-\u007F\uD800-\uDBFF]
					{ Character.isJavaIdentifierStart(_input.LA(-1) ) }?
				| [\uD800-\uDBFF] [\uDC00-\uDFFF]
					{ Character.isJavaIdentifierStart(  Character.toCodePoint( (char)_input.LA(-2), (char)_input.LA(-1))  ) }? ;
                
fragment LOWERCASE_LETTER:
				[a-z];
				
fragment UPPERCASE_LETTER:
				[A-Z];

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
