// Generated from JavaGrammar.g4 by ANTLR 4.7.1

	package javagrammar;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaGrammarLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"DecimalFloatingPointLiteral", "FloatTypeSuffix", "ExponentIndicator", 
		"ExponentPart", "SignedInteger", "Sign", "HexadecimalFloatingPointLiteral", 
		"HexSignificand", "BinaryExponent", "BinaryExponentIndicator", "OctalIntegerLiteral", 
		"OctalNumeral", "OctalDigits", "OctalDigit", "OctalDigitsAndUnderscores", 
		"OctalDigitOrUnderscore", "BinaryIntegerLiteral", "BinaryNumeral", "BinaryDigits", 
		"BinaryDigit", "BinaryDigitsAndUnderscores", "BinaryDigitOrUnderscore", 
		"HexIntegerLiteral", "HexNumeral", "HexDigits", "HexDigitsAndUnderscores", 
		"HexDigitOrUnderscore", "HexDigit", "DecimalIntegerLiteral", "IntegerTypeSuffix", 
		"DecimalNumeral", "Digits", "DigitsAndUnderscores", "DigitOrUnderscore", 
		"Underscores", "WHITE_SPACES", "LINE_COMMENT", "NEW_LINE", "COMMENTS_BLOCK", 
		"UNTERMINATED_STRING", "LETTERORDIGIT", "DIGIT", "NONZERODIGIT", "LETTER", 
		"LOWERCASE_LETTER", "UPPERCASE_LETTER", "ADDITIONAL_LITERAL_AT", "ADDITIONAL_LITERAL_ELLIPSIS", 
		"KEYWORDS_ABSTRACT", "KEYWORDS_ASSERT", "KEYWORDS_BOOLEAN", "KEYWORDS_BREAK", 
		"KEYWORDS_BYTE", "KEYWORDS_CASE", "KEYWORDS_CATCH", "KEYWORDS_CHAR", "KEYWORDS_CLASS", 
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


	public JavaGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JavaGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 43:
			return LETTER_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean LETTER_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return  Character.isJavaIdentifierStart(_input.LA(-1) ) ;
		case 1:
			return  Character.isJavaIdentifierStart(  Character.toCodePoint( (char)_input.LA(-2), (char)_input.LA(-1))  ) ;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2u\u0440\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\3\2\3\2\3\2\5\2\u013f\n\2\3\2\5\2\u0142"+
		"\n\2\3\2\5\2\u0145\n\2\3\2\3\2\3\2\5\2\u014a\n\2\3\2\5\2\u014d\n\2\3\2"+
		"\3\2\3\2\5\2\u0152\n\2\3\2\3\2\3\2\5\2\u0157\n\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\5\3\6\5\6\u0161\n\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\5\b\u016a\n\b\3\t"+
		"\3\t\5\t\u016e\n\t\3\t\3\t\3\t\5\t\u0173\n\t\3\t\3\t\5\t\u0177\n\t\3\n"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\5\f\u0180\n\f\3\r\3\r\5\r\u0184\n\r\3\r\3\r"+
		"\3\16\3\16\5\16\u018a\n\16\3\16\5\16\u018d\n\16\3\17\3\17\3\20\6\20\u0192"+
		"\n\20\r\20\16\20\u0193\3\21\3\21\5\21\u0198\n\21\3\22\3\22\5\22\u019c"+
		"\n\22\3\23\3\23\3\23\3\23\3\24\3\24\5\24\u01a4\n\24\3\24\5\24\u01a7\n"+
		"\24\3\25\3\25\3\26\6\26\u01ac\n\26\r\26\16\26\u01ad\3\27\3\27\5\27\u01b2"+
		"\n\27\3\30\3\30\5\30\u01b6\n\30\3\31\3\31\3\31\3\31\3\32\3\32\5\32\u01be"+
		"\n\32\3\32\5\32\u01c1\n\32\3\33\6\33\u01c4\n\33\r\33\16\33\u01c5\3\34"+
		"\3\34\5\34\u01ca\n\34\3\35\3\35\3\36\3\36\5\36\u01d0\n\36\3\37\3\37\3"+
		" \3 \3 \5 \u01d7\n \3 \3 \3 \5 \u01dc\n \5 \u01de\n \3!\3!\5!\u01e2\n"+
		"!\3!\5!\u01e5\n!\3\"\6\"\u01e8\n\"\r\"\16\"\u01e9\3#\3#\5#\u01ee\n#\3"+
		"$\6$\u01f1\n$\r$\16$\u01f2\3%\6%\u01f6\n%\r%\16%\u01f7\3%\3%\3&\3&\7&"+
		"\u01fe\n&\f&\16&\u0201\13&\3&\3&\3\'\5\'\u0206\n\'\3\'\3\'\3(\3(\7(\u020c"+
		"\n(\f(\16(\u020f\13(\3(\3(\3(\3(\3)\3)\3)\3)\3)\5)\u021a\n)\7)\u021c\n"+
		")\f)\16)\u021f\13)\3*\3*\5*\u0223\n*\3+\3+\5+\u0227\n+\3,\3,\3-\3-\3-"+
		"\3-\3-\3-\3-\5-\u0232\n-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\38\3"+
		"8\38\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3"+
		"<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3"+
		"@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3"+
		"C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3F\3F\3F\3F\3F\3G\3G\3G\3H\3"+
		"H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3"+
		"J\3J\3J\3J\3J\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3"+
		"M\3N\3N\3N\3N\3N\3N\3N\3O\3O\3O\3O\3P\3P\3P\3P\3P\3P\3P\3P\3Q\3Q\3Q\3"+
		"Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3S\3S\3S\3S\3S\3S\3S\3T\3"+
		"T\3T\3T\3T\3T\3T\3U\3U\3U\3U\3U\3U\3V\3V\3V\3V\3V\3V\3V\3W\3W\3W\3W\3"+
		"W\3W\3W\3W\3W\3X\3X\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3"+
		"Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3\\\3]\3]"+
		"\3]\3]\3]\3]\3^\3^\3^\3^\3^\3^\3^\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3`\3`"+
		"\3`\3`\3a\3a\3a\3a\3a\3b\3b\3b\3b\3b\3b\3b\3b\3b\3c\3c\3c\3c\3c\3c\3d"+
		"\3d\7d\u0395\nd\fd\16d\u0398\13d\3e\3e\3e\3e\5e\u039e\ne\3f\3f\5f\u03a2"+
		"\nf\3g\3g\3g\3g\3g\3g\3g\3g\3g\5g\u03ad\ng\3h\3h\3h\3h\3i\3i\3i\3j\3j"+
		"\3j\3j\3j\3k\3k\3l\3l\3m\3m\3n\3n\3o\3o\3p\3p\3q\3q\3q\3r\3r\3r\3s\3s"+
		"\3s\3t\3t\3t\3u\3u\3u\3v\3v\3v\3w\3w\3w\3x\3x\3x\3y\3y\3z\3z\3{\3{\3|"+
		"\3|\3}\3}\3~\3~\3~\3\177\3\177\3\177\3\u0080\3\u0080\3\u0080\3\u0081\3"+
		"\u0081\3\u0081\3\u0082\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0084\3\u0084\3\u0085\3\u0085\3\u0086\3\u0086\3\u0087\3\u0087\3\u0088"+
		"\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\3\u008b"+
		"\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\3\u0091\3\u0091\3\u0092\3\u0092\3\u0093"+
		"\3\u0093\3\u0094\3\u0094\3\u0095\3\u0095\3\u0096\3\u0096\3\u0097\3\u0097"+
		"\3\u0098\3\u0098\3\u0099\3\u0099\3\u009a\3\u009a\3\u009b\3\u009b\3\u009b"+
		"\3\u009c\3\u009c\3\u009c\3\u009d\3\u009d\3\u009d\3\u020d\2\u009e\3\2\5"+
		"\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2"+
		"%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\3K\4"+
		"M\5O\6Q\7S\2U\2W\2Y\2[\2]\2_\ba\tc\ne\13g\fi\rk\16m\17o\20q\21s\22u\23"+
		"w\24y\25{\26}\27\177\30\u0081\31\u0083\32\u0085\33\u0087\34\u0089\35\u008b"+
		"\36\u008d\37\u008f \u0091!\u0093\"\u0095#\u0097$\u0099%\u009b&\u009d\'"+
		"\u009f(\u00a1)\u00a3*\u00a5+\u00a7,\u00a9-\u00ab.\u00ad/\u00af\60\u00b1"+
		"\61\u00b3\62\u00b5\63\u00b7\64\u00b9\65\u00bb\66\u00bd\67\u00bf8\u00c1"+
		"9\u00c3:\u00c5;\u00c7<\u00c9=\u00cb>\u00cd?\u00cf@\u00d1A\u00d3B\u00d5"+
		"C\u00d7D\u00d9E\u00dbF\u00ddG\u00dfH\u00e1I\u00e3J\u00e5K\u00e7L\u00e9"+
		"M\u00ebN\u00edO\u00efP\u00f1Q\u00f3R\u00f5S\u00f7T\u00f9U\u00fbV\u00fd"+
		"W\u00ffX\u0101Y\u0103Z\u0105[\u0107\\\u0109]\u010b^\u010d_\u010f`\u0111"+
		"a\u0113b\u0115c\u0117d\u0119e\u011bf\u011dg\u011fh\u0121i\u0123j\u0125"+
		"k\u0127l\u0129m\u012bn\u012do\u012fp\u0131q\u0133r\u0135s\u0137t\u0139"+
		"u\3\2\25\6\2FFHHffhh\4\2GGgg\4\2--//\4\2ZZzz\4\2RRrr\3\2\629\4\2DDdd\3"+
		"\2\62\63\5\2\62;CHch\4\2NNnn\5\2\13\f\16\17\"\"\5\2\f\f\17\17\u202a\u202b"+
		"\6\2\f\f\17\17$$^^\3\2\63;\4\2\2\u0081\ud802\udc01\3\2\ud802\udc01\3\2"+
		"\udc02\ue001\3\2c|\3\2C\\\2\u044f\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2"+
		"\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2"+
		"\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2"+
		"\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b"+
		"\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2"+
		"\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad"+
		"\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2"+
		"\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf"+
		"\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2"+
		"\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1"+
		"\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2"+
		"\2\2\u00db\3\2\2\2\2\u00dd\3\2\2\2\2\u00df\3\2\2\2\2\u00e1\3\2\2\2\2\u00e3"+
		"\3\2\2\2\2\u00e5\3\2\2\2\2\u00e7\3\2\2\2\2\u00e9\3\2\2\2\2\u00eb\3\2\2"+
		"\2\2\u00ed\3\2\2\2\2\u00ef\3\2\2\2\2\u00f1\3\2\2\2\2\u00f3\3\2\2\2\2\u00f5"+
		"\3\2\2\2\2\u00f7\3\2\2\2\2\u00f9\3\2\2\2\2\u00fb\3\2\2\2\2\u00fd\3\2\2"+
		"\2\2\u00ff\3\2\2\2\2\u0101\3\2\2\2\2\u0103\3\2\2\2\2\u0105\3\2\2\2\2\u0107"+
		"\3\2\2\2\2\u0109\3\2\2\2\2\u010b\3\2\2\2\2\u010d\3\2\2\2\2\u010f\3\2\2"+
		"\2\2\u0111\3\2\2\2\2\u0113\3\2\2\2\2\u0115\3\2\2\2\2\u0117\3\2\2\2\2\u0119"+
		"\3\2\2\2\2\u011b\3\2\2\2\2\u011d\3\2\2\2\2\u011f\3\2\2\2\2\u0121\3\2\2"+
		"\2\2\u0123\3\2\2\2\2\u0125\3\2\2\2\2\u0127\3\2\2\2\2\u0129\3\2\2\2\2\u012b"+
		"\3\2\2\2\2\u012d\3\2\2\2\2\u012f\3\2\2\2\2\u0131\3\2\2\2\2\u0133\3\2\2"+
		"\2\2\u0135\3\2\2\2\2\u0137\3\2\2\2\2\u0139\3\2\2\2\3\u0156\3\2\2\2\5\u0158"+
		"\3\2\2\2\7\u015a\3\2\2\2\t\u015c\3\2\2\2\13\u0160\3\2\2\2\r\u0164\3\2"+
		"\2\2\17\u0166\3\2\2\2\21\u0176\3\2\2\2\23\u0178\3\2\2\2\25\u017b\3\2\2"+
		"\2\27\u017d\3\2\2\2\31\u0181\3\2\2\2\33\u0187\3\2\2\2\35\u018e\3\2\2\2"+
		"\37\u0191\3\2\2\2!\u0197\3\2\2\2#\u0199\3\2\2\2%\u019d\3\2\2\2\'\u01a1"+
		"\3\2\2\2)\u01a8\3\2\2\2+\u01ab\3\2\2\2-\u01b1\3\2\2\2/\u01b3\3\2\2\2\61"+
		"\u01b7\3\2\2\2\63\u01bb\3\2\2\2\65\u01c3\3\2\2\2\67\u01c9\3\2\2\29\u01cb"+
		"\3\2\2\2;\u01cd\3\2\2\2=\u01d1\3\2\2\2?\u01dd\3\2\2\2A\u01df\3\2\2\2C"+
		"\u01e7\3\2\2\2E\u01ed\3\2\2\2G\u01f0\3\2\2\2I\u01f5\3\2\2\2K\u01fb\3\2"+
		"\2\2M\u0205\3\2\2\2O\u0209\3\2\2\2Q\u0214\3\2\2\2S\u0222\3\2\2\2U\u0226"+
		"\3\2\2\2W\u0228\3\2\2\2Y\u0231\3\2\2\2[\u0233\3\2\2\2]\u0235\3\2\2\2_"+
		"\u0237\3\2\2\2a\u0239\3\2\2\2c\u023d\3\2\2\2e\u0246\3\2\2\2g\u024d\3\2"+
		"\2\2i\u0255\3\2\2\2k\u025b\3\2\2\2m\u0260\3\2\2\2o\u0265\3\2\2\2q\u026b"+
		"\3\2\2\2s\u0270\3\2\2\2u\u0276\3\2\2\2w\u027c\3\2\2\2y\u0285\3\2\2\2{"+
		"\u028d\3\2\2\2}\u0290\3\2\2\2\177\u0297\3\2\2\2\u0081\u029c\3\2\2\2\u0083"+
		"\u02a4\3\2\2\2\u0085\u02aa\3\2\2\2\u0087\u02b2\3\2\2\2\u0089\u02b8\3\2"+
		"\2\2\u008b\u02bc\3\2\2\2\u008d\u02c1\3\2\2\2\u008f\u02c4\3\2\2\2\u0091"+
		"\u02cf\3\2\2\2\u0093\u02d6\3\2\2\2\u0095\u02e1\3\2\2\2\u0097\u02e5\3\2"+
		"\2\2\u0099\u02ef\3\2\2\2\u009b\u02f4\3\2\2\2\u009d\u02fb\3\2\2\2\u009f"+
		"\u02ff\3\2\2\2\u00a1\u0307\3\2\2\2\u00a3\u030f\3\2\2\2\u00a5\u0319\3\2"+
		"\2\2\u00a7\u0320\3\2\2\2\u00a9\u0327\3\2\2\2\u00ab\u032d\3\2\2\2\u00ad"+
		"\u0334\3\2\2\2\u00af\u033d\3\2\2\2\u00b1\u0344\3\2\2\2\u00b3\u034a\3\2"+
		"\2\2\u00b5\u0357\3\2\2\2\u00b7\u035e\3\2\2\2\u00b9\u0363\3\2\2\2\u00bb"+
		"\u0369\3\2\2\2\u00bd\u0370\3\2\2\2\u00bf\u037a\3\2\2\2\u00c1\u037e\3\2"+
		"\2\2\u00c3\u0383\3\2\2\2\u00c5\u038c\3\2\2\2\u00c7\u0392\3\2\2\2\u00c9"+
		"\u039d\3\2\2\2\u00cb\u03a1\3\2\2\2\u00cd\u03ac\3\2\2\2\u00cf\u03ae\3\2"+
		"\2\2\u00d1\u03b2\3\2\2\2\u00d3\u03b5\3\2\2\2\u00d5\u03ba\3\2\2\2\u00d7"+
		"\u03bc\3\2\2\2\u00d9\u03be\3\2\2\2\u00db\u03c0\3\2\2\2\u00dd\u03c2\3\2"+
		"\2\2\u00df\u03c4\3\2\2\2\u00e1\u03c6\3\2\2\2\u00e3\u03c9\3\2\2\2\u00e5"+
		"\u03cc\3\2\2\2\u00e7\u03cf\3\2\2\2\u00e9\u03d2\3\2\2\2\u00eb\u03d5\3\2"+
		"\2\2\u00ed\u03d8\3\2\2\2\u00ef\u03db\3\2\2\2\u00f1\u03de\3\2\2\2\u00f3"+
		"\u03e0\3\2\2\2\u00f5\u03e2\3\2\2\2\u00f7\u03e4\3\2\2\2\u00f9\u03e6\3\2"+
		"\2\2\u00fb\u03e8\3\2\2\2\u00fd\u03eb\3\2\2\2\u00ff\u03ee\3\2\2\2\u0101"+
		"\u03f1\3\2\2\2\u0103\u03f4\3\2\2\2\u0105\u03f7\3\2\2\2\u0107\u03fb\3\2"+
		"\2\2\u0109\u03fd\3\2\2\2\u010b\u03ff\3\2\2\2\u010d\u0401\3\2\2\2\u010f"+
		"\u0403\3\2\2\2\u0111\u0406\3\2\2\2\u0113\u0409\3\2\2\2\u0115\u040c\3\2"+
		"\2\2\u0117\u040f\3\2\2\2\u0119\u0412\3\2\2\2\u011b\u0416\3\2\2\2\u011d"+
		"\u041a\3\2\2\2\u011f\u041e\3\2\2\2\u0121\u0423\3\2\2\2\u0123\u0425\3\2"+
		"\2\2\u0125\u0427\3\2\2\2\u0127\u0429\3\2\2\2\u0129\u042b\3\2\2\2\u012b"+
		"\u042d\3\2\2\2\u012d\u042f\3\2\2\2\u012f\u0431\3\2\2\2\u0131\u0433\3\2"+
		"\2\2\u0133\u0435\3\2\2\2\u0135\u0437\3\2\2\2\u0137\u043a\3\2\2\2\u0139"+
		"\u043d\3\2\2\2\u013b\u013c\5A!\2\u013c\u013e\7\60\2\2\u013d\u013f\5A!"+
		"\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u0142"+
		"\5\t\5\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\3\2\2\2\u0143"+
		"\u0145\5\5\3\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0157\3\2"+
		"\2\2\u0146\u0147\7\60\2\2\u0147\u0149\5A!\2\u0148\u014a\5\t\5\2\u0149"+
		"\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u014d\5\5"+
		"\3\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u0157\3\2\2\2\u014e"+
		"\u014f\5A!\2\u014f\u0151\5\t\5\2\u0150\u0152\5\5\3\2\u0151\u0150\3\2\2"+
		"\2\u0151\u0152\3\2\2\2\u0152\u0157\3\2\2\2\u0153\u0154\5A!\2\u0154\u0155"+
		"\5\5\3\2\u0155\u0157\3\2\2\2\u0156\u013b\3\2\2\2\u0156\u0146\3\2\2\2\u0156"+
		"\u014e\3\2\2\2\u0156\u0153\3\2\2\2\u0157\4\3\2\2\2\u0158\u0159\t\2\2\2"+
		"\u0159\6\3\2\2\2\u015a\u015b\t\3\2\2\u015b\b\3\2\2\2\u015c\u015d\5\7\4"+
		"\2\u015d\u015e\5\13\6\2\u015e\n\3\2\2\2\u015f\u0161\5\r\7\2\u0160\u015f"+
		"\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\5A!\2\u0163"+
		"\f\3\2\2\2\u0164\u0165\t\4\2\2\u0165\16\3\2\2\2\u0166\u0167\5\21\t\2\u0167"+
		"\u0169\5\23\n\2\u0168\u016a\5\5\3\2\u0169\u0168\3\2\2\2\u0169\u016a\3"+
		"\2\2\2\u016a\20\3\2\2\2\u016b\u016d\5\61\31\2\u016c\u016e\7\60\2\2\u016d"+
		"\u016c\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0177\3\2\2\2\u016f\u0170\7\62"+
		"\2\2\u0170\u0172\t\5\2\2\u0171\u0173\5\63\32\2\u0172\u0171\3\2\2\2\u0172"+
		"\u0173\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\7\60\2\2\u0175\u0177\5"+
		"\63\32\2\u0176\u016b\3\2\2\2\u0176\u016f\3\2\2\2\u0177\22\3\2\2\2\u0178"+
		"\u0179\5\25\13\2\u0179\u017a\5\13\6\2\u017a\24\3\2\2\2\u017b\u017c\t\6"+
		"\2\2\u017c\26\3\2\2\2\u017d\u017f\5\31\r\2\u017e\u0180\5=\37\2\u017f\u017e"+
		"\3\2\2\2\u017f\u0180\3\2\2\2\u0180\30\3\2\2\2\u0181\u0183\7\62\2\2\u0182"+
		"\u0184\5G$\2\u0183\u0182\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\3\2\2"+
		"\2\u0185\u0186\5\33\16\2\u0186\32\3\2\2\2\u0187\u018c\5\35\17\2\u0188"+
		"\u018a\5\37\20\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\3"+
		"\2\2\2\u018b\u018d\5\35\17\2\u018c\u0189\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"\34\3\2\2\2\u018e\u018f\t\7\2\2\u018f\36\3\2\2\2\u0190\u0192\5!\21\2\u0191"+
		"\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2"+
		"\2\2\u0194 \3\2\2\2\u0195\u0198\5\35\17\2\u0196\u0198\7a\2\2\u0197\u0195"+
		"\3\2\2\2\u0197\u0196\3\2\2\2\u0198\"\3\2\2\2\u0199\u019b\5%\23\2\u019a"+
		"\u019c\5=\37\2\u019b\u019a\3\2\2\2\u019b\u019c\3\2\2\2\u019c$\3\2\2\2"+
		"\u019d\u019e\7\62\2\2\u019e\u019f\t\b\2\2\u019f\u01a0\5\'\24\2\u01a0&"+
		"\3\2\2\2\u01a1\u01a6\5)\25\2\u01a2\u01a4\5+\26\2\u01a3\u01a2\3\2\2\2\u01a3"+
		"\u01a4\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a7\5)\25\2\u01a6\u01a3\3\2"+
		"\2\2\u01a6\u01a7\3\2\2\2\u01a7(\3\2\2\2\u01a8\u01a9\t\t\2\2\u01a9*\3\2"+
		"\2\2\u01aa\u01ac\5-\27\2\u01ab\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad"+
		"\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae,\3\2\2\2\u01af\u01b2\5)\25\2"+
		"\u01b0\u01b2\7a\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b0\3\2\2\2\u01b2.\3\2"+
		"\2\2\u01b3\u01b5\5\61\31\2\u01b4\u01b6\5=\37\2\u01b5\u01b4\3\2\2\2\u01b5"+
		"\u01b6\3\2\2\2\u01b6\60\3\2\2\2\u01b7\u01b8\7\62\2\2\u01b8\u01b9\t\5\2"+
		"\2\u01b9\u01ba\5\63\32\2\u01ba\62\3\2\2\2\u01bb\u01c0\59\35\2\u01bc\u01be"+
		"\5\65\33\2\u01bd\u01bc\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\3\2\2\2"+
		"\u01bf\u01c1\59\35\2\u01c0\u01bd\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\64"+
		"\3\2\2\2\u01c2\u01c4\5\67\34\2\u01c3\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2"+
		"\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\66\3\2\2\2\u01c7\u01ca"+
		"\59\35\2\u01c8\u01ca\7a\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01c8\3\2\2\2\u01ca"+
		"8\3\2\2\2\u01cb\u01cc\t\n\2\2\u01cc:\3\2\2\2\u01cd\u01cf\5? \2\u01ce\u01d0"+
		"\5=\37\2\u01cf\u01ce\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0<\3\2\2\2\u01d1"+
		"\u01d2\t\13\2\2\u01d2>\3\2\2\2\u01d3\u01de\7\62\2\2\u01d4\u01db\5W,\2"+
		"\u01d5\u01d7\5A!\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01dc"+
		"\3\2\2\2\u01d8\u01d9\5G$\2\u01d9\u01da\5A!\2\u01da\u01dc\3\2\2\2\u01db"+
		"\u01d6\3\2\2\2\u01db\u01d8\3\2\2\2\u01dc\u01de\3\2\2\2\u01dd\u01d3\3\2"+
		"\2\2\u01dd\u01d4\3\2\2\2\u01de@\3\2\2\2\u01df\u01e4\5U+\2\u01e0\u01e2"+
		"\5C\"\2\u01e1\u01e0\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3"+
		"\u01e5\5U+\2\u01e4\u01e1\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5B\3\2\2\2\u01e6"+
		"\u01e8\5E#\2\u01e7\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01e7\3\2\2"+
		"\2\u01e9\u01ea\3\2\2\2\u01eaD\3\2\2\2\u01eb\u01ee\5U+\2\u01ec\u01ee\7"+
		"a\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ec\3\2\2\2\u01eeF\3\2\2\2\u01ef\u01f1"+
		"\7a\2\2\u01f0\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2"+
		"\u01f3\3\2\2\2\u01f3H\3\2\2\2\u01f4\u01f6\t\f\2\2\u01f5\u01f4\3\2\2\2"+
		"\u01f6\u01f7\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9"+
		"\3\2\2\2\u01f9\u01fa\b%\2\2\u01faJ\3\2\2\2\u01fb\u01ff\5\u0135\u009b\2"+
		"\u01fc\u01fe\n\r\2\2\u01fd\u01fc\3\2\2\2\u01fe\u0201\3\2\2\2\u01ff\u01fd"+
		"\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0202\3\2\2\2\u0201\u01ff\3\2\2\2\u0202"+
		"\u0203\b&\3\2\u0203L\3\2\2\2\u0204\u0206\7\17\2\2\u0205\u0204\3\2\2\2"+
		"\u0205\u0206\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0208\7\f\2\2\u0208N\3"+
		"\2\2\2\u0209\u020d\5\u0137\u009c\2\u020a\u020c\13\2\2\2\u020b\u020a\3"+
		"\2\2\2\u020c\u020f\3\2\2\2\u020d\u020e\3\2\2\2\u020d\u020b\3\2\2\2\u020e"+
		"\u0210\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0211\5\u0139\u009d\2\u0211\u0212"+
		"\3\2\2\2\u0212\u0213\b(\3\2\u0213P\3\2\2\2\u0214\u021d\7$\2\2\u0215\u021c"+
		"\n\16\2\2\u0216\u0219\7^\2\2\u0217\u021a\13\2\2\2\u0218\u021a\7\2\2\3"+
		"\u0219\u0217\3\2\2\2\u0219\u0218\3\2\2\2\u021a\u021c\3\2\2\2\u021b\u0215"+
		"\3\2\2\2\u021b\u0216\3\2\2\2\u021c\u021f\3\2\2\2\u021d\u021b\3\2\2\2\u021d"+
		"\u021e\3\2\2\2\u021eR\3\2\2\2\u021f\u021d\3\2\2\2\u0220\u0223\5Y-\2\u0221"+
		"\u0223\5U+\2\u0222\u0220\3\2\2\2\u0222\u0221\3\2\2\2\u0223T\3\2\2\2\u0224"+
		"\u0227\7\62\2\2\u0225\u0227\5W,\2\u0226\u0224\3\2\2\2\u0226\u0225\3\2"+
		"\2\2\u0227V\3\2\2\2\u0228\u0229\t\17\2\2\u0229X\3\2\2\2\u022a\u0232\5"+
		"[.\2\u022b\u0232\5]/\2\u022c\u022d\n\20\2\2\u022d\u0232\6-\2\2\u022e\u022f"+
		"\t\21\2\2\u022f\u0230\t\22\2\2\u0230\u0232\6-\3\2\u0231\u022a\3\2\2\2"+
		"\u0231\u022b\3\2\2\2\u0231\u022c\3\2\2\2\u0231\u022e\3\2\2\2\u0232Z\3"+
		"\2\2\2\u0233\u0234\t\23\2\2\u0234\\\3\2\2\2\u0235\u0236\t\24\2\2\u0236"+
		"^\3\2\2\2\u0237\u0238\7B\2\2\u0238`\3\2\2\2\u0239\u023a\7\60\2\2\u023a"+
		"\u023b\7\60\2\2\u023b\u023c\7\60\2\2\u023cb\3\2\2\2\u023d\u023e\7c\2\2"+
		"\u023e\u023f\7d\2\2\u023f\u0240\7u\2\2\u0240\u0241\7v\2\2\u0241\u0242"+
		"\7t\2\2\u0242\u0243\7c\2\2\u0243\u0244\7e\2\2\u0244\u0245\7v\2\2\u0245"+
		"d\3\2\2\2\u0246\u0247\7c\2\2\u0247\u0248\7u\2\2\u0248\u0249\7u\2\2\u0249"+
		"\u024a\7g\2\2\u024a\u024b\7t\2\2\u024b\u024c\7v\2\2\u024cf\3\2\2\2\u024d"+
		"\u024e\7d\2\2\u024e\u024f\7q\2\2\u024f\u0250\7q\2\2\u0250\u0251\7n\2\2"+
		"\u0251\u0252\7g\2\2\u0252\u0253\7c\2\2\u0253\u0254\7p\2\2\u0254h\3\2\2"+
		"\2\u0255\u0256\7d\2\2\u0256\u0257\7t\2\2\u0257\u0258\7g\2\2\u0258\u0259"+
		"\7c\2\2\u0259\u025a\7m\2\2\u025aj\3\2\2\2\u025b\u025c\7d\2\2\u025c\u025d"+
		"\7{\2\2\u025d\u025e\7v\2\2\u025e\u025f\7g\2\2\u025fl\3\2\2\2\u0260\u0261"+
		"\7e\2\2\u0261\u0262\7c\2\2\u0262\u0263\7u\2\2\u0263\u0264\7g\2\2\u0264"+
		"n\3\2\2\2\u0265\u0266\7e\2\2\u0266\u0267\7c\2\2\u0267\u0268\7v\2\2\u0268"+
		"\u0269\7e\2\2\u0269\u026a\7j\2\2\u026ap\3\2\2\2\u026b\u026c\7e\2\2\u026c"+
		"\u026d\7j\2\2\u026d\u026e\7c\2\2\u026e\u026f\7t\2\2\u026fr\3\2\2\2\u0270"+
		"\u0271\7e\2\2\u0271\u0272\7n\2\2\u0272\u0273\7c\2\2\u0273\u0274\7u\2\2"+
		"\u0274\u0275\7u\2\2\u0275t\3\2\2\2\u0276\u0277\7e\2\2\u0277\u0278\7q\2"+
		"\2\u0278\u0279\7p\2\2\u0279\u027a\7u\2\2\u027a\u027b\7v\2\2\u027bv\3\2"+
		"\2\2\u027c\u027d\7e\2\2\u027d\u027e\7q\2\2\u027e\u027f\7p\2\2\u027f\u0280"+
		"\7v\2\2\u0280\u0281\7k\2\2\u0281\u0282\7p\2\2\u0282\u0283\7w\2\2\u0283"+
		"\u0284\7g\2\2\u0284x\3\2\2\2\u0285\u0286\7f\2\2\u0286\u0287\7g\2\2\u0287"+
		"\u0288\7h\2\2\u0288\u0289\7c\2\2\u0289\u028a\7w\2\2\u028a\u028b\7n\2\2"+
		"\u028b\u028c\7v\2\2\u028cz\3\2\2\2\u028d\u028e\7f\2\2\u028e\u028f\7q\2"+
		"\2\u028f|\3\2\2\2\u0290\u0291\7f\2\2\u0291\u0292\7q\2\2\u0292\u0293\7"+
		"w\2\2\u0293\u0294\7d\2\2\u0294\u0295\7n\2\2\u0295\u0296\7g\2\2\u0296~"+
		"\3\2\2\2\u0297\u0298\7g\2\2\u0298\u0299\7n\2\2\u0299\u029a\7u\2\2\u029a"+
		"\u029b\7g\2\2\u029b\u0080\3\2\2\2\u029c\u029d\7g\2\2\u029d\u029e\7z\2"+
		"\2\u029e\u029f\7v\2\2\u029f\u02a0\7g\2\2\u02a0\u02a1\7p\2\2\u02a1\u02a2"+
		"\7f\2\2\u02a2\u02a3\7u\2\2\u02a3\u0082\3\2\2\2\u02a4\u02a5\7h\2\2\u02a5"+
		"\u02a6\7k\2\2\u02a6\u02a7\7p\2\2\u02a7\u02a8\7c\2\2\u02a8\u02a9\7n\2\2"+
		"\u02a9\u0084\3\2\2\2\u02aa\u02ab\7h\2\2\u02ab\u02ac\7k\2\2\u02ac\u02ad"+
		"\7p\2\2\u02ad\u02ae\7c\2\2\u02ae\u02af\7n\2\2\u02af\u02b0\7n\2\2\u02b0"+
		"\u02b1\7{\2\2\u02b1\u0086\3\2\2\2\u02b2\u02b3\7h\2\2\u02b3\u02b4\7n\2"+
		"\2\u02b4\u02b5\7q\2\2\u02b5\u02b6\7c\2\2\u02b6\u02b7\7v\2\2\u02b7\u0088"+
		"\3\2\2\2\u02b8\u02b9\7h\2\2\u02b9\u02ba\7q\2\2\u02ba\u02bb\7t\2\2\u02bb"+
		"\u008a\3\2\2\2\u02bc\u02bd\7i\2\2\u02bd\u02be\7q\2\2\u02be\u02bf\7v\2"+
		"\2\u02bf\u02c0\7q\2\2\u02c0\u008c\3\2\2\2\u02c1\u02c2\7k\2\2\u02c2\u02c3"+
		"\7h\2\2\u02c3\u008e\3\2\2\2\u02c4\u02c5\7k\2\2\u02c5\u02c6\7o\2\2\u02c6"+
		"\u02c7\7r\2\2\u02c7\u02c8\7n\2\2\u02c8\u02c9\7g\2\2\u02c9\u02ca\7o\2\2"+
		"\u02ca\u02cb\7g\2\2\u02cb\u02cc\7p\2\2\u02cc\u02cd\7v\2\2\u02cd\u02ce"+
		"\7u\2\2\u02ce\u0090\3\2\2\2\u02cf\u02d0\7k\2\2\u02d0\u02d1\7o\2\2\u02d1"+
		"\u02d2\7r\2\2\u02d2\u02d3\7q\2\2\u02d3\u02d4\7t\2\2\u02d4\u02d5\7v\2\2"+
		"\u02d5\u0092\3\2\2\2\u02d6\u02d7\7k\2\2\u02d7\u02d8\7p\2\2\u02d8\u02d9"+
		"\7u\2\2\u02d9\u02da\7v\2\2\u02da\u02db\7c\2\2\u02db\u02dc\7p\2\2\u02dc"+
		"\u02dd\7e\2\2\u02dd\u02de\7g\2\2\u02de\u02df\7q\2\2\u02df\u02e0\7h\2\2"+
		"\u02e0\u0094\3\2\2\2\u02e1\u02e2\7k\2\2\u02e2\u02e3\7p\2\2\u02e3\u02e4"+
		"\7v\2\2\u02e4\u0096\3\2\2\2\u02e5\u02e6\7k\2\2\u02e6\u02e7\7p\2\2\u02e7"+
		"\u02e8\7v\2\2\u02e8\u02e9\7g\2\2\u02e9\u02ea\7t\2\2\u02ea\u02eb\7h\2\2"+
		"\u02eb\u02ec\7c\2\2\u02ec\u02ed\7e\2\2\u02ed\u02ee\7g\2\2\u02ee\u0098"+
		"\3\2\2\2\u02ef\u02f0\7n\2\2\u02f0\u02f1\7q\2\2\u02f1\u02f2\7p\2\2\u02f2"+
		"\u02f3\7i\2\2\u02f3\u009a\3\2\2\2\u02f4\u02f5\7p\2\2\u02f5\u02f6\7c\2"+
		"\2\u02f6\u02f7\7v\2\2\u02f7\u02f8\7k\2\2\u02f8\u02f9\7x\2\2\u02f9\u02fa"+
		"\7g\2\2\u02fa\u009c\3\2\2\2\u02fb\u02fc\7p\2\2\u02fc\u02fd\7g\2\2\u02fd"+
		"\u02fe\7y\2\2\u02fe\u009e\3\2\2\2\u02ff\u0300\7r\2\2\u0300\u0301\7c\2"+
		"\2\u0301\u0302\7e\2\2\u0302\u0303\7m\2\2\u0303\u0304\7c\2\2\u0304\u0305"+
		"\7i\2\2\u0305\u0306\7g\2\2\u0306\u00a0\3\2\2\2\u0307\u0308\7r\2\2\u0308"+
		"\u0309\7t\2\2\u0309\u030a\7k\2\2\u030a\u030b\7x\2\2\u030b\u030c\7c\2\2"+
		"\u030c\u030d\7v\2\2\u030d\u030e\7g\2\2\u030e\u00a2\3\2\2\2\u030f\u0310"+
		"\7r\2\2\u0310\u0311\7t\2\2\u0311\u0312\7q\2\2\u0312\u0313\7v\2\2\u0313"+
		"\u0314\7g\2\2\u0314\u0315\7e\2\2\u0315\u0316\7v\2\2\u0316\u0317\7g\2\2"+
		"\u0317\u0318\7f\2\2\u0318\u00a4\3\2\2\2\u0319\u031a\7r\2\2\u031a\u031b"+
		"\7w\2\2\u031b\u031c\7d\2\2\u031c\u031d\7n\2\2\u031d\u031e\7k\2\2\u031e"+
		"\u031f\7e\2\2\u031f\u00a6\3\2\2\2\u0320\u0321\7t\2\2\u0321\u0322\7g\2"+
		"\2\u0322\u0323\7v\2\2\u0323\u0324\7w\2\2\u0324\u0325\7t\2\2\u0325\u0326"+
		"\7p\2\2\u0326\u00a8\3\2\2\2\u0327\u0328\7u\2\2\u0328\u0329\7j\2\2\u0329"+
		"\u032a\7q\2\2\u032a\u032b\7t\2\2\u032b\u032c\7v\2\2\u032c\u00aa\3\2\2"+
		"\2\u032d\u032e\7u\2\2\u032e\u032f\7v\2\2\u032f\u0330\7c\2\2\u0330\u0331"+
		"\7v\2\2\u0331\u0332\7k\2\2\u0332\u0333\7e\2\2\u0333\u00ac\3\2\2\2\u0334"+
		"\u0335\7u\2\2\u0335\u0336\7v\2\2\u0336\u0337\7t\2\2\u0337\u0338\7k\2\2"+
		"\u0338\u0339\7e\2\2\u0339\u033a\7v\2\2\u033a\u033b\7h\2\2\u033b\u033c"+
		"\7r\2\2\u033c\u00ae\3\2\2\2\u033d\u033e\7U\2\2\u033e\u033f\7v\2\2\u033f"+
		"\u0340\7t\2\2\u0340\u0341\7k\2\2\u0341\u0342\7p\2\2\u0342\u0343\7i\2\2"+
		"\u0343\u00b0\3\2\2\2\u0344\u0345\7u\2\2\u0345\u0346\7w\2\2\u0346\u0347"+
		"\7r\2\2\u0347\u0348\7g\2\2\u0348\u0349\7t\2\2\u0349\u00b2\3\2\2\2\u034a"+
		"\u034b\7u\2\2\u034b\u034c\7{\2\2\u034c\u034d\7p\2\2\u034d\u034e\7e\2\2"+
		"\u034e\u034f\7j\2\2\u034f\u0350\7t\2\2\u0350\u0351\7q\2\2\u0351\u0352"+
		"\7p\2\2\u0352\u0353\7k\2\2\u0353\u0354\7|\2\2\u0354\u0355\7g\2\2\u0355"+
		"\u0356\7f\2\2\u0356\u00b4\3\2\2\2\u0357\u0358\7u\2\2\u0358\u0359\7y\2"+
		"\2\u0359\u035a\7k\2\2\u035a\u035b\7v\2\2\u035b\u035c\7e\2\2\u035c\u035d"+
		"\7j\2\2\u035d\u00b6\3\2\2\2\u035e\u035f\7v\2\2\u035f\u0360\7j\2\2\u0360"+
		"\u0361\7k\2\2\u0361\u0362\7u\2\2\u0362\u00b8\3\2\2\2\u0363\u0364\7v\2"+
		"\2\u0364\u0365\7j\2\2\u0365\u0366\7t\2\2\u0366\u0367\7q\2\2\u0367\u0368"+
		"\7y\2\2\u0368\u00ba\3\2\2\2\u0369\u036a\7v\2\2\u036a\u036b\7j\2\2\u036b"+
		"\u036c\7t\2\2\u036c\u036d\7q\2\2\u036d\u036e\7y\2\2\u036e\u036f\7u\2\2"+
		"\u036f\u00bc\3\2\2\2\u0370\u0371\7v\2\2\u0371\u0372\7t\2\2\u0372\u0373"+
		"\7c\2\2\u0373\u0374\7p\2\2\u0374\u0375\7u\2\2\u0375\u0376\7k\2\2\u0376"+
		"\u0377\7g\2\2\u0377\u0378\7p\2\2\u0378\u0379\7v\2\2\u0379\u00be\3\2\2"+
		"\2\u037a\u037b\7v\2\2\u037b\u037c\7t\2\2\u037c\u037d\7{\2\2\u037d\u00c0"+
		"\3\2\2\2\u037e\u037f\7x\2\2\u037f\u0380\7q\2\2\u0380\u0381\7k\2\2\u0381"+
		"\u0382\7f\2\2\u0382\u00c2\3\2\2\2\u0383\u0384\7x\2\2\u0384\u0385\7q\2"+
		"\2\u0385\u0386\7n\2\2\u0386\u0387\7c\2\2\u0387\u0388\7v\2\2\u0388\u0389"+
		"\7k\2\2\u0389\u038a\7n\2\2\u038a\u038b\7g\2\2\u038b\u00c4\3\2\2\2\u038c"+
		"\u038d\7y\2\2\u038d\u038e\7j\2\2\u038e\u038f\7k\2\2\u038f\u0390\7n\2\2"+
		"\u0390\u0391\7g\2\2\u0391\u00c6\3\2\2\2\u0392\u0396\5Y-\2\u0393\u0395"+
		"\5S*\2\u0394\u0393\3\2\2\2\u0395\u0398\3\2\2\2\u0396\u0394\3\2\2\2\u0396"+
		"\u0397\3\2\2\2\u0397\u00c8\3\2\2\2\u0398\u0396\3\2\2\2\u0399\u039e\5;"+
		"\36\2\u039a\u039e\5/\30\2\u039b\u039e\5\27\f\2\u039c\u039e\5#\22\2\u039d"+
		"\u0399\3\2\2\2\u039d\u039a\3\2\2\2\u039d\u039b\3\2\2\2\u039d\u039c\3\2"+
		"\2\2\u039e\u00ca\3\2\2\2\u039f\u03a2\5\3\2\2\u03a0\u03a2\5\17\b\2\u03a1"+
		"\u039f\3\2\2\2\u03a1\u03a0\3\2\2\2\u03a2\u00cc\3\2\2\2\u03a3\u03a4\7v"+
		"\2\2\u03a4\u03a5\7t\2\2\u03a5\u03a6\7w\2\2\u03a6\u03ad\7g\2\2\u03a7\u03a8"+
		"\7h\2\2\u03a8\u03a9\7c\2\2\u03a9\u03aa\7n\2\2\u03aa\u03ab\7u\2\2\u03ab"+
		"\u03ad\7g\2\2\u03ac\u03a3\3\2\2\2\u03ac\u03a7\3\2\2\2\u03ad\u00ce\3\2"+
		"\2\2\u03ae\u03af\7)\2\2\u03af\u03b0\13\2\2\2\u03b0\u03b1\7)\2\2\u03b1"+
		"\u00d0\3\2\2\2\u03b2\u03b3\5Q)\2\u03b3\u03b4\7$\2\2\u03b4\u00d2\3\2\2"+
		"\2\u03b5\u03b6\7p\2\2\u03b6\u03b7\7w\2\2\u03b7\u03b8\7n\2\2\u03b8\u03b9"+
		"\7n\2\2\u03b9\u00d4\3\2\2\2\u03ba\u03bb\7A\2\2\u03bb\u00d6\3\2\2\2\u03bc"+
		"\u03bd\7<\2\2\u03bd\u00d8\3\2\2\2\u03be\u03bf\7?\2\2\u03bf\u00da\3\2\2"+
		"\2\u03c0\u03c1\7@\2\2\u03c1\u00dc\3\2\2\2\u03c2\u03c3\7>\2\2\u03c3\u00de"+
		"\3\2\2\2\u03c4\u03c5\7#\2\2\u03c5\u00e0\3\2\2\2\u03c6\u03c7\7>\2\2\u03c7"+
		"\u03c8\7?\2\2\u03c8\u00e2\3\2\2\2\u03c9\u03ca\7@\2\2\u03ca\u03cb\7?\2"+
		"\2\u03cb\u00e4\3\2\2\2\u03cc\u03cd\7?\2\2\u03cd\u03ce\7?\2\2\u03ce\u00e6"+
		"\3\2\2\2\u03cf\u03d0\7#\2\2\u03d0\u03d1\7?\2\2\u03d1\u00e8\3\2\2\2\u03d2"+
		"\u03d3\7(\2\2\u03d3\u03d4\7(\2\2\u03d4\u00ea\3\2\2\2\u03d5\u03d6\7~\2"+
		"\2\u03d6\u03d7\7~\2\2\u03d7\u00ec\3\2\2\2\u03d8\u03d9\7-\2\2\u03d9\u03da"+
		"\7-\2\2\u03da\u00ee\3\2\2\2\u03db\u03dc\7/\2\2\u03dc\u03dd\7/\2\2\u03dd"+
		"\u00f0\3\2\2\2\u03de\u03df\7-\2\2\u03df\u00f2\3\2\2\2\u03e0\u03e1\7/\2"+
		"\2\u03e1\u00f4\3\2\2\2\u03e2\u03e3\7,\2\2\u03e3\u00f6\3\2\2\2\u03e4\u03e5"+
		"\7\61\2\2\u03e5\u00f8\3\2\2\2\u03e6\u03e7\7\'\2\2\u03e7\u00fa\3\2\2\2"+
		"\u03e8\u03e9\7-\2\2\u03e9\u03ea\7?\2\2\u03ea\u00fc\3\2\2\2\u03eb\u03ec"+
		"\7/\2\2\u03ec\u03ed\7?\2\2\u03ed\u00fe\3\2\2\2\u03ee\u03ef\7,\2\2\u03ef"+
		"\u03f0\7?\2\2\u03f0\u0100\3\2\2\2\u03f1\u03f2\7\61\2\2\u03f2\u03f3\7?"+
		"\2\2\u03f3\u0102\3\2\2\2\u03f4\u03f5\7\'\2\2\u03f5\u03f6\7?\2\2\u03f6"+
		"\u0104\3\2\2\2\u03f7\u03f8\7(\2\2\u03f8\u03f9\7(\2\2\u03f9\u03fa\7?\2"+
		"\2\u03fa\u0106\3\2\2\2\u03fb\u03fc\7\u0080\2\2\u03fc\u0108\3\2\2\2\u03fd"+
		"\u03fe\7(\2\2\u03fe\u010a\3\2\2\2\u03ff\u0400\7~\2\2\u0400\u010c\3\2\2"+
		"\2\u0401\u0402\7`\2\2\u0402\u010e\3\2\2\2\u0403\u0404\7(\2\2\u0404\u0405"+
		"\7?\2\2\u0405\u0110\3\2\2\2\u0406\u0407\7`\2\2\u0407\u0408\7?\2\2\u0408"+
		"\u0112\3\2\2\2\u0409\u040a\7~\2\2\u040a\u040b\7?\2\2\u040b\u0114\3\2\2"+
		"\2\u040c\u040d\7>\2\2\u040d\u040e\7>\2\2\u040e\u0116\3\2\2\2\u040f\u0410"+
		"\7@\2\2\u0410\u0411\7@\2\2\u0411\u0118\3\2\2\2\u0412\u0413\7@\2\2\u0413"+
		"\u0414\7@\2\2\u0414\u0415\7@\2\2\u0415\u011a\3\2\2\2\u0416\u0417\7>\2"+
		"\2\u0417\u0418\7>\2\2\u0418\u0419\7?\2\2\u0419\u011c\3\2\2\2\u041a\u041b"+
		"\7@\2\2\u041b\u041c\7@\2\2\u041c\u041d\7?\2\2\u041d\u011e\3\2\2\2\u041e"+
		"\u041f\7@\2\2\u041f\u0420\7@\2\2\u0420\u0421\7@\2\2\u0421\u0422\7?\2\2"+
		"\u0422\u0120\3\2\2\2\u0423\u0424\7=\2\2\u0424\u0122\3\2\2\2\u0425\u0426"+
		"\7.\2\2\u0426\u0124\3\2\2\2\u0427\u0428\7\60\2\2\u0428\u0126\3\2\2\2\u0429"+
		"\u042a\7^\2\2\u042a\u0128\3\2\2\2\u042b\u042c\7*\2\2\u042c\u012a\3\2\2"+
		"\2\u042d\u042e\7+\2\2\u042e\u012c\3\2\2\2\u042f\u0430\7}\2\2\u0430\u012e"+
		"\3\2\2\2\u0431\u0432\7\177\2\2\u0432\u0130\3\2\2\2\u0433\u0434\7]\2\2"+
		"\u0434\u0132\3\2\2\2\u0435\u0436\7_\2\2\u0436\u0134\3\2\2\2\u0437\u0438"+
		"\7\61\2\2\u0438\u0439\7\61\2\2\u0439\u0136\3\2\2\2\u043a\u043b\7\61\2"+
		"\2\u043b\u043c\7,\2\2\u043c\u0138\3\2\2\2\u043d\u043e\7,\2\2\u043e\u043f"+
		"\7\61\2\2\u043f\u013a\3\2\2\2\66\2\u013e\u0141\u0144\u0149\u014c\u0151"+
		"\u0156\u0160\u0169\u016d\u0172\u0176\u017f\u0183\u0189\u018c\u0193\u0197"+
		"\u019b\u01a3\u01a6\u01ad\u01b1\u01b5\u01bd\u01c0\u01c5\u01c9\u01cf\u01d6"+
		"\u01db\u01dd\u01e1\u01e4\u01e9\u01ed\u01f2\u01f7\u01ff\u0205\u020d\u0219"+
		"\u021b\u021d\u0222\u0226\u0231\u0396\u039d\u03a1\u03ac\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}