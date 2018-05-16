grammar JavaGrammar;

@header{
	package javagrammar;
}
 
// Parser Rules
 
compilationUnit:
				method* ;
                // packageDeclaration? importDeclaration* typeDeclaration* EOF;

method:
        /*annotation*/ methodPermissionModifier? methodTypeModifier? methodReturnType IDENTIFIERS
        SEPARATORS_DELIMITERS_LEFTPARENTHESIS parameterList? SEPARATORS_DELIMITERS_RIGHTPARENTHESIS 
        ( block | SEPARATORS_PUNCTUATORS_SEMICOLON ) ;

/*annotation:
		;*/

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
		  variableType
		| KEYWORDS_VOID ;

variableDeclaration:
                     variableType IDENTIFIERS
                     ;

statement:
          variableDeclaration SEPARATORS_PUNCTUATORS_SEMICOLON
          | ifStatement
          | whileDoStatement
          | doWhileStatement
          | forStatement
          | enhancedForStatement
          | returnStatement 
          ;

loopStatment:
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
    | IDENTIFIERS
    ;

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
      SEPARATORS_DELIMITERS_LEFTCURLYBRACKET statement* SEPARATORS_DELIMITERS_RIGHTCURLYBRACKET
      ;
loopBlock:
      SEPARATORS_DELIMITERS_LEFTCURLYBRACKET loopStatment* SEPARATORS_DELIMITERS_RIGHTCURLYBRACKET
      ;


ifStatement:
    KEYWORDS_IF SEPARATORS_DELIMITERS_LEFTPARENTHESIS logicalExpression SEPARATORS_DELIMITERS_RIGHTPARENTHESIS (block | statement)
    ( KEYWORDS_ELSE KEYWORDS_IF SEPARATORS_DELIMITERS_LEFTPARENTHESIS logicalExpression SEPARATORS_DELIMITERS_RIGHTPARENTHESIS (block | statement))*
    (KEYWORDS_ELSE (block | statement))?
    ;

doWhileStatement:
    KEYWORDS_DO (loopBlock | loopStatment) KEYWORDS_WHILE SEPARATORS_DELIMITERS_LEFTPARENTHESIS logicalExpression SEPARATORS_DELIMITERS_RIGHTPARENTHESIS
    ;

whileDoStatement:
    KEYWORDS_WHILE SEPARATORS_DELIMITERS_LEFTPARENTHESIS logicalExpression SEPARATORS_DELIMITERS_RIGHTPARENTHESIS (loopBlock | loopStatment)
    ;

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
	  | OPERATORS_BITWISEORASSIGNMENT
	  ;

expression:
        arithmeticExpression
      | logicalExpression
      | assignmentExpression
      | preIncrementationExpression
      | postIncrementationExpression
      | preDecrementationExpression
      | postDecrementationExpression
      ;

assignment:
        assignmentExpression
        SEPARATORS_PUNCTUATORS_SEMICOLON
      ;


assignmentExpression:
        IDENTIFIERS assignmentOperator (IDENTIFIERS | expression)
      | IDENTIFIERS (OPERATORS_ASSIGNMENT IDENTIFIERS)+ expression?
      ;

forStatement:
        enhancedForStatement
      | KEYWORDS_FOR SEPARATORS_DELIMITERS_LEFTPARENTHESIS forInit? SEPARATORS_PUNCTUATORS_SEMICOLON logicalExpression? SEPARATORS_PUNCTUATORS_SEMICOLON forUpdate? SEPARATORS_DELIMITERS_RIGHTPARENTHESIS
        (loopBlock | loopStatment)
      ;

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
        ( variableType IDENTIFIERS (SEPARATORS_PUNCTUATORS_COMMA parameterList)* ) ;

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

stringNullAssignment:
        KEYWORDS_STRING IDENTIFIERS OPERATORS_ASSIGNMENT LITERALS_REFERENCE_NULL 
        ;

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
      | KEYWORDS_DOUBLE 
      | KEYWORDS_STRING ;
 
// Lexer Rules-------------------------------------------------------------------------------------------

// Sztuczne, pomocnicze literaly

// Pomocnicze do LITERALS_NUMERIC_DOUBLE

// 10kowe

fragment DecimalFloatingPointLiteral:
				Digits '.' Digits? ExponentPart? FloatTypeSuffix?
				|	'.' Digits ExponentPart? FloatTypeSuffix?
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
				HexNumeral '.'?
				|	'0' [xX] HexDigits? '.' HexDigits ;

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

KEYWORDS_ABSTRACT:				        'abstract'; //nie obsluzone
KEYWORDS_ASSERT:				        'assert'; //nie obsluzone
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
KEYWORDS_STRING:						'String';
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
