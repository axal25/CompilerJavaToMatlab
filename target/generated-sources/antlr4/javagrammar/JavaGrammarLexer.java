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
		T__0=1, WHITE_SPACES=2, LINE_COMMENT=3, NEW_LINE=4, COMMENTS_BLOCK=5, 
		UNTERMINATED_STRING=6, ADDITIONAL_LITERAL_AT=7, ADDITIONAL_LITERAL_ELLIPSIS=8, 
		KEYWORDS_CLASS_LONG=9, KEYWORDS_CLASS_STRING=10, KEYWORDS_ABSTRACT=11, 
		KEYWORDS_ASSERT=12, KEYWORDS_BOOLEAN=13, KEYWORDS_BREAK=14, KEYWORDS_BYTE=15, 
		KEYWORDS_CASE=16, KEYWORDS_CATCH=17, KEYWORDS_CHAR=18, KEYWORDS_CLASS=19, 
		KEYWORDS_CONST=20, KEYWORDS_CONTINUE=21, KEYWORDS_DEFAULT=22, KEYWORDS_DO=23, 
		KEYWORDS_DOUBLE=24, KEYWORDS_ELSE=25, KEYWORDS_EXTENDS=26, KEYWORDS_FINAL=27, 
		KEYWORDS_FINALLY=28, KEYWORDS_FLOAT=29, KEYWORDS_FOR=30, KEYWORDS_GOTO=31, 
		KEYWORDS_IF=32, KEYWORDS_IMPLEMENTS=33, KEYWORDS_IMPORT=34, KEYWORDS_INSTANCEOF=35, 
		KEYWORDS_INT=36, KEYWORDS_INTERFACE=37, KEYWORDS_LONG=38, KEYWORDS_NATIVE=39, 
		KEYWORDS_NEW=40, KEYWORDS_PACKAGE=41, KEYWORDS_PRIVATE=42, KEYWORDS_PROTECTED=43, 
		KEYWORDS_PUBLIC=44, KEYWORDS_RETURN=45, KEYWORDS_SHORT=46, KEYWORDS_STATIC=47, 
		KEYWORDS_STRICTFP=48, KEYWORDS_SUPER=49, KEYWORDS_SYNCHRONIZED=50, KEYWORDS_SWITCH=51, 
		KEYWORDS_THIS=52, KEYWORDS_THROW=53, KEYWORDS_THROWS=54, KEYWORDS_TRANSIENT=55, 
		KEYWORDS_TRY=56, KEYWORDS_VOID=57, KEYWORDS_VOLATILE=58, KEYWORDS_WHILE=59, 
		IDENTIFIERS=60, LITERALS_NUMERIC_INT=61, LITERALS_NUMERIC_DOUBLE=62, LITERALS_LOGICAL_BOOLEAN=63, 
		LITERALS_TEXTUAL_CHAR=64, LITERALS_TEXTUAL_STRING=65, LITERALS_REFERENCE_NULL=66, 
		OPERATORS_IF=67, OPERATORS_ELSE=68, OPERATORS_ASSIGNMENT=69, OPERATORS_GREATERTHAN=70, 
		OPERATORS_LESSTHAN=71, OPERATORS_LOGICALNOT=72, OPERATORS_LESSTHANOREQUAL=73, 
		OPERATORS_GREATERTHANOREQUAL=74, OPERATORS_LOGICALEQUAL=75, OPERATORS_LOGICALNOTEQUAL=76, 
		OPERATORS_LOGICALAND=77, OPERATORS_LOGICALOR=78, OPERATORS_INCREMENT=79, 
		OPERATORS_DECREMENT=80, OPERATORS_ADDITION=81, OPERATORS_SUBTRACTION=82, 
		OPERATORS_MULTIPLICATION=83, OPERATORS_DIVISION=84, OPERATORS_MODULO=85, 
		OPERATORS_ADDITIONANDASSIGNMENT=86, OPERATORS_SUBTRACTIONANDASSIGNMENT=87, 
		OPERATORS_MULTIPLICATIONANDASSIGNMENT=88, OPERATORS_DIVISIONANDASSIGNMENT=89, 
		OPERATORS_MODULOANDASSIGMENT=90, OPERATORS_LOGICALANDASSIGNMENT=91, OPERATORS_BITWISENOT=92, 
		OPERATORS_BITWISEAND=93, OPERATORS_BITWISEOR=94, OPERATORS_BITWISEXOR=95, 
		OPERATORS_BITWISEANDASSIGNMENT=96, OPERATORS_BITWISEXORASSIGNMENT=97, 
		OPERATORS_BITWISEORASSIGNMENT=98, OPERATORS_SHIFTLEFT=99, OPERATORS_SHIFTRIGHT=100, 
		OPERATORS_SHIFTRIGHTUNSIGNED=101, OPERATORS_SHIFTLEFTASSIGNMENT=102, OPERATORS_SHIFTRIGHTASSIGNMENT=103, 
		OPERATORS_SHIFTRIGHTUNSIGNEDASSIGNMENT=104, SEPARATORS_PUNCTUATORS_SEMICOLON=105, 
		SEPARATORS_PUNCTUATORS_COMMA=106, SEPARATORS_PUNCTUATORS_DOT=107, SEPARATORS_PUNCTUATORS_ESCAPECHARACTER=108, 
		SEPARATORS_DELIMITERS_LEFTPARENTHESIS=109, SEPARATORS_DELIMITERS_RIGHTPARENTHESIS=110, 
		SEPARATORS_DELIMITERS_LEFTCURLYBRACKET=111, SEPARATORS_DELIMITERS_RIGHTCURLYBRACKET=112, 
		SEPARATORS_DELIMITERS_LEFTSQUAREBRACKET=113, SEPARATORS_DELIMITERS_RIGHTSQUAREBRACKET=114, 
		COMMENTS_LINE=115, COMMENTS_BLOCK_OPENING=116, COMMENTS_BLOCK_CLOSING=117;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "DecimalFloatingPointLiteral", "FloatTypeSuffix", "ExponentIndicator", 
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
		"KEYWORDS_CLASS_LONG", "KEYWORDS_CLASS_STRING", "KEYWORDS_ABSTRACT", "KEYWORDS_ASSERT", 
		"KEYWORDS_BOOLEAN", "KEYWORDS_BREAK", "KEYWORDS_BYTE", "KEYWORDS_CASE", 
		"KEYWORDS_CATCH", "KEYWORDS_CHAR", "KEYWORDS_CLASS", "KEYWORDS_CONST", 
		"KEYWORDS_CONTINUE", "KEYWORDS_DEFAULT", "KEYWORDS_DO", "KEYWORDS_DOUBLE", 
		"KEYWORDS_ELSE", "KEYWORDS_EXTENDS", "KEYWORDS_FINAL", "KEYWORDS_FINALLY", 
		"KEYWORDS_FLOAT", "KEYWORDS_FOR", "KEYWORDS_GOTO", "KEYWORDS_IF", "KEYWORDS_IMPLEMENTS", 
		"KEYWORDS_IMPORT", "KEYWORDS_INSTANCEOF", "KEYWORDS_INT", "KEYWORDS_INTERFACE", 
		"KEYWORDS_LONG", "KEYWORDS_NATIVE", "KEYWORDS_NEW", "KEYWORDS_PACKAGE", 
		"KEYWORDS_PRIVATE", "KEYWORDS_PROTECTED", "KEYWORDS_PUBLIC", "KEYWORDS_RETURN", 
		"KEYWORDS_SHORT", "KEYWORDS_STATIC", "KEYWORDS_STRICTFP", "KEYWORDS_SUPER", 
		"KEYWORDS_SYNCHRONIZED", "KEYWORDS_SWITCH", "KEYWORDS_THIS", "KEYWORDS_THROW", 
		"KEYWORDS_THROWS", "KEYWORDS_TRANSIENT", "KEYWORDS_TRY", "KEYWORDS_VOID", 
		"KEYWORDS_VOLATILE", "KEYWORDS_WHILE", "IDENTIFIERS", "LITERALS_NUMERIC_INT", 
		"LITERALS_NUMERIC_DOUBLE", "LITERALS_LOGICAL_BOOLEAN", "LITERALS_TEXTUAL_CHAR", 
		"LITERALS_TEXTUAL_STRING", "LITERALS_REFERENCE_NULL", "OPERATORS_IF", 
		"OPERATORS_ELSE", "OPERATORS_ASSIGNMENT", "OPERATORS_GREATERTHAN", "OPERATORS_LESSTHAN", 
		"OPERATORS_LOGICALNOT", "OPERATORS_LESSTHANOREQUAL", "OPERATORS_GREATERTHANOREQUAL", 
		"OPERATORS_LOGICALEQUAL", "OPERATORS_LOGICALNOTEQUAL", "OPERATORS_LOGICALAND", 
		"OPERATORS_LOGICALOR", "OPERATORS_INCREMENT", "OPERATORS_DECREMENT", "OPERATORS_ADDITION", 
		"OPERATORS_SUBTRACTION", "OPERATORS_MULTIPLICATION", "OPERATORS_DIVISION", 
		"OPERATORS_MODULO", "OPERATORS_ADDITIONANDASSIGNMENT", "OPERATORS_SUBTRACTIONANDASSIGNMENT", 
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
		null, "'\u000E'", null, null, null, null, null, "'@'", "'...'", "'Long'", 
		"'String'", "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", 
		"'case'", "'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
		"'do'", "'double'", "'else'", "'extends'", "'final'", "'finally'", "'float'", 
		"'for'", "'goto'", "'if'", "'implements'", "'import'", "'instanceof'", 
		"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
		"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
		"'super'", "'synchronized'", "'switch'", "'this'", "'throw'", "'throws'", 
		"'transient'", "'try'", "'void'", "'volatile'", "'while'", null, null, 
		null, null, null, null, "'null'", "'?'", "':'", "'='", "'>'", "'<'", "'!'", 
		"'<='", "'>='", "'=='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", 
		"'-'", "'*'", "'/'", "'%'", "'+='", "'-='", "'*='", "'/='", "'%='", "'&&='", 
		"'~'", "'&'", "'|'", "'^'", "'&='", "'^='", "'|='", "'<<'", "'>>'", "'>>>'", 
		"'<<='", "'>>='", "'>>>='", "';'", "','", "'.'", "'\\'", "'('", "')'", 
		"'{'", "'}'", "'['", "']'", "'//'", "'/*'", "'*/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "WHITE_SPACES", "LINE_COMMENT", "NEW_LINE", "COMMENTS_BLOCK", 
		"UNTERMINATED_STRING", "ADDITIONAL_LITERAL_AT", "ADDITIONAL_LITERAL_ELLIPSIS", 
		"KEYWORDS_CLASS_LONG", "KEYWORDS_CLASS_STRING", "KEYWORDS_ABSTRACT", "KEYWORDS_ASSERT", 
		"KEYWORDS_BOOLEAN", "KEYWORDS_BREAK", "KEYWORDS_BYTE", "KEYWORDS_CASE", 
		"KEYWORDS_CATCH", "KEYWORDS_CHAR", "KEYWORDS_CLASS", "KEYWORDS_CONST", 
		"KEYWORDS_CONTINUE", "KEYWORDS_DEFAULT", "KEYWORDS_DO", "KEYWORDS_DOUBLE", 
		"KEYWORDS_ELSE", "KEYWORDS_EXTENDS", "KEYWORDS_FINAL", "KEYWORDS_FINALLY", 
		"KEYWORDS_FLOAT", "KEYWORDS_FOR", "KEYWORDS_GOTO", "KEYWORDS_IF", "KEYWORDS_IMPLEMENTS", 
		"KEYWORDS_IMPORT", "KEYWORDS_INSTANCEOF", "KEYWORDS_INT", "KEYWORDS_INTERFACE", 
		"KEYWORDS_LONG", "KEYWORDS_NATIVE", "KEYWORDS_NEW", "KEYWORDS_PACKAGE", 
		"KEYWORDS_PRIVATE", "KEYWORDS_PROTECTED", "KEYWORDS_PUBLIC", "KEYWORDS_RETURN", 
		"KEYWORDS_SHORT", "KEYWORDS_STATIC", "KEYWORDS_STRICTFP", "KEYWORDS_SUPER", 
		"KEYWORDS_SYNCHRONIZED", "KEYWORDS_SWITCH", "KEYWORDS_THIS", "KEYWORDS_THROW", 
		"KEYWORDS_THROWS", "KEYWORDS_TRANSIENT", "KEYWORDS_TRY", "KEYWORDS_VOID", 
		"KEYWORDS_VOLATILE", "KEYWORDS_WHILE", "IDENTIFIERS", "LITERALS_NUMERIC_INT", 
		"LITERALS_NUMERIC_DOUBLE", "LITERALS_LOGICAL_BOOLEAN", "LITERALS_TEXTUAL_CHAR", 
		"LITERALS_TEXTUAL_STRING", "LITERALS_REFERENCE_NULL", "OPERATORS_IF", 
		"OPERATORS_ELSE", "OPERATORS_ASSIGNMENT", "OPERATORS_GREATERTHAN", "OPERATORS_LESSTHAN", 
		"OPERATORS_LOGICALNOT", "OPERATORS_LESSTHANOREQUAL", "OPERATORS_GREATERTHANOREQUAL", 
		"OPERATORS_LOGICALEQUAL", "OPERATORS_LOGICALNOTEQUAL", "OPERATORS_LOGICALAND", 
		"OPERATORS_LOGICALOR", "OPERATORS_INCREMENT", "OPERATORS_DECREMENT", "OPERATORS_ADDITION", 
		"OPERATORS_SUBTRACTION", "OPERATORS_MULTIPLICATION", "OPERATORS_DIVISION", 
		"OPERATORS_MODULO", "OPERATORS_ADDITIONANDASSIGNMENT", "OPERATORS_SUBTRACTIONANDASSIGNMENT", 
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
		case 44:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2w\u044c\b\1\4\2\t"+
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
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\3\2\3"+
		"\2\3\3\3\3\3\3\5\3\u0145\n\3\3\3\5\3\u0148\n\3\3\3\5\3\u014b\n\3\3\3\3"+
		"\3\3\3\5\3\u0150\n\3\3\3\5\3\u0153\n\3\3\3\3\3\3\3\5\3\u0158\n\3\3\3\3"+
		"\3\3\3\5\3\u015d\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\5\7\u0167\n\7\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\t\5\t\u0170\n\t\3\n\3\n\5\n\u0174\n\n\3\n\3\n\3"+
		"\n\5\n\u0179\n\n\3\n\3\n\3\n\5\n\u017e\n\n\3\13\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\5\r\u0187\n\r\3\16\3\16\5\16\u018b\n\16\3\16\3\16\3\17\3\17\5\17"+
		"\u0191\n\17\3\17\5\17\u0194\n\17\3\20\3\20\3\21\6\21\u0199\n\21\r\21\16"+
		"\21\u019a\3\22\3\22\5\22\u019f\n\22\3\23\3\23\5\23\u01a3\n\23\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\5\25\u01ab\n\25\3\25\5\25\u01ae\n\25\3\26\3\26\3"+
		"\27\6\27\u01b3\n\27\r\27\16\27\u01b4\3\30\3\30\5\30\u01b9\n\30\3\31\3"+
		"\31\5\31\u01bd\n\31\3\32\3\32\3\32\3\32\3\33\3\33\5\33\u01c5\n\33\3\33"+
		"\5\33\u01c8\n\33\3\34\6\34\u01cb\n\34\r\34\16\34\u01cc\3\35\3\35\5\35"+
		"\u01d1\n\35\3\36\3\36\3\37\3\37\5\37\u01d7\n\37\3 \3 \3!\3!\3!\5!\u01de"+
		"\n!\3!\3!\3!\5!\u01e3\n!\5!\u01e5\n!\3\"\3\"\5\"\u01e9\n\"\3\"\5\"\u01ec"+
		"\n\"\3#\6#\u01ef\n#\r#\16#\u01f0\3$\3$\5$\u01f5\n$\3%\6%\u01f8\n%\r%\16"+
		"%\u01f9\3&\6&\u01fd\n&\r&\16&\u01fe\3&\3&\3\'\3\'\7\'\u0205\n\'\f\'\16"+
		"\'\u0208\13\'\3\'\3\'\3(\5(\u020d\n(\3(\3(\3)\3)\7)\u0213\n)\f)\16)\u0216"+
		"\13)\3)\3)\3)\3)\3*\3*\3*\3*\3*\5*\u0221\n*\7*\u0223\n*\f*\16*\u0226\13"+
		"*\3+\3+\5+\u022a\n+\3,\3,\5,\u022e\n,\3-\3-\3.\3.\3.\3.\3.\3.\3.\5.\u0239"+
		"\n.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63"+
		"\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\38\38\38\38\38\38\39\39\39\39\39\3:\3:\3:\3:\3:\3"+
		";\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3"+
		"?\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3B\3B\3B\3"+
		"B\3B\3B\3B\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3"+
		"F\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3I\3I\3I\3I\3I\3"+
		"J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3M\3M\3"+
		"M\3M\3M\3M\3M\3M\3M\3M\3M\3N\3N\3N\3N\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3"+
		"P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3S\3S\3S\3S\3S\3S\3S\3"+
		"S\3T\3T\3T\3T\3T\3T\3T\3T\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3V\3V\3V\3V\3"+
		"V\3V\3V\3W\3W\3W\3W\3W\3W\3W\3X\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3"+
		"Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\3]\3]\3]\3]\3]\3]\3]\3^\3^\3^\3^\3^\3_\3_\3"+
		"_\3_\3_\3_\3`\3`\3`\3`\3`\3`\3`\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3b\3b\3"+
		"b\3b\3c\3c\3c\3c\3c\3d\3d\3d\3d\3d\3d\3d\3d\3d\3e\3e\3e\3e\3e\3e\3f\3"+
		"f\7f\u03a1\nf\ff\16f\u03a4\13f\3g\3g\3g\3g\5g\u03aa\ng\3h\3h\5h\u03ae"+
		"\nh\3i\3i\3i\3i\3i\3i\3i\3i\3i\5i\u03b9\ni\3j\3j\3j\3j\3k\3k\3k\3l\3l"+
		"\3l\3l\3l\3m\3m\3n\3n\3o\3o\3p\3p\3q\3q\3r\3r\3s\3s\3s\3t\3t\3t\3u\3u"+
		"\3u\3v\3v\3v\3w\3w\3w\3x\3x\3x\3y\3y\3y\3z\3z\3z\3{\3{\3|\3|\3}\3}\3~"+
		"\3~\3\177\3\177\3\u0080\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081\3\u0082"+
		"\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083\3\u0084\3\u0084\3\u0084\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0086\3\u0086\3\u0087\3\u0087\3\u0088\3\u0088"+
		"\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\3\u008c"+
		"\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090\3\u0090\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093"+
		"\3\u0094\3\u0094\3\u0095\3\u0095\3\u0096\3\u0096\3\u0097\3\u0097\3\u0098"+
		"\3\u0098\3\u0099\3\u0099\3\u009a\3\u009a\3\u009b\3\u009b\3\u009c\3\u009c"+
		"\3\u009d\3\u009d\3\u009d\3\u009e\3\u009e\3\u009e\3\u009f\3\u009f\3\u009f"+
		"\3\u0214\2\u00a0\3\3\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31"+
		"\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2="+
		"\2?\2A\2C\2E\2G\2I\2K\4M\5O\6Q\7S\bU\2W\2Y\2[\2]\2_\2a\tc\ne\13g\fi\r"+
		"k\16m\17o\20q\21s\22u\23w\24y\25{\26}\27\177\30\u0081\31\u0083\32\u0085"+
		"\33\u0087\34\u0089\35\u008b\36\u008d\37\u008f \u0091!\u0093\"\u0095#\u0097"+
		"$\u0099%\u009b&\u009d\'\u009f(\u00a1)\u00a3*\u00a5+\u00a7,\u00a9-\u00ab"+
		".\u00ad/\u00af\60\u00b1\61\u00b3\62\u00b5\63\u00b7\64\u00b9\65\u00bb\66"+
		"\u00bd\67\u00bf8\u00c19\u00c3:\u00c5;\u00c7<\u00c9=\u00cb>\u00cd?\u00cf"+
		"@\u00d1A\u00d3B\u00d5C\u00d7D\u00d9E\u00dbF\u00ddG\u00dfH\u00e1I\u00e3"+
		"J\u00e5K\u00e7L\u00e9M\u00ebN\u00edO\u00efP\u00f1Q\u00f3R\u00f5S\u00f7"+
		"T\u00f9U\u00fbV\u00fdW\u00ffX\u0101Y\u0103Z\u0105[\u0107\\\u0109]\u010b"+
		"^\u010d_\u010f`\u0111a\u0113b\u0115c\u0117d\u0119e\u011bf\u011dg\u011f"+
		"h\u0121i\u0123j\u0125k\u0127l\u0129m\u012bn\u012do\u012fp\u0131q\u0133"+
		"r\u0135s\u0137t\u0139u\u013bv\u013dw\3\2\25\6\2FFHHffhh\4\2GGgg\4\2--"+
		"//\4\2ZZzz\4\2RRrr\3\2\629\4\2DDdd\3\2\62\63\5\2\62;CHch\4\2NNnn\5\2\13"+
		"\f\16\17\"\"\5\2\f\f\17\17\u202a\u202b\6\2\f\f\17\17$$^^\3\2\63;\4\2\2"+
		"\u0081\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001\3\2c|\3\2C\\\2\u045b"+
		"\2\3\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3"+
		"\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2"+
		"\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2"+
		"\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d"+
		"\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2"+
		"\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f"+
		"\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2"+
		"\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1"+
		"\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2"+
		"\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3"+
		"\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2"+
		"\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5"+
		"\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2\2\2\u00db\3\2\2\2\2\u00dd\3\2\2"+
		"\2\2\u00df\3\2\2\2\2\u00e1\3\2\2\2\2\u00e3\3\2\2\2\2\u00e5\3\2\2\2\2\u00e7"+
		"\3\2\2\2\2\u00e9\3\2\2\2\2\u00eb\3\2\2\2\2\u00ed\3\2\2\2\2\u00ef\3\2\2"+
		"\2\2\u00f1\3\2\2\2\2\u00f3\3\2\2\2\2\u00f5\3\2\2\2\2\u00f7\3\2\2\2\2\u00f9"+
		"\3\2\2\2\2\u00fb\3\2\2\2\2\u00fd\3\2\2\2\2\u00ff\3\2\2\2\2\u0101\3\2\2"+
		"\2\2\u0103\3\2\2\2\2\u0105\3\2\2\2\2\u0107\3\2\2\2\2\u0109\3\2\2\2\2\u010b"+
		"\3\2\2\2\2\u010d\3\2\2\2\2\u010f\3\2\2\2\2\u0111\3\2\2\2\2\u0113\3\2\2"+
		"\2\2\u0115\3\2\2\2\2\u0117\3\2\2\2\2\u0119\3\2\2\2\2\u011b\3\2\2\2\2\u011d"+
		"\3\2\2\2\2\u011f\3\2\2\2\2\u0121\3\2\2\2\2\u0123\3\2\2\2\2\u0125\3\2\2"+
		"\2\2\u0127\3\2\2\2\2\u0129\3\2\2\2\2\u012b\3\2\2\2\2\u012d\3\2\2\2\2\u012f"+
		"\3\2\2\2\2\u0131\3\2\2\2\2\u0133\3\2\2\2\2\u0135\3\2\2\2\2\u0137\3\2\2"+
		"\2\2\u0139\3\2\2\2\2\u013b\3\2\2\2\2\u013d\3\2\2\2\3\u013f\3\2\2\2\5\u015c"+
		"\3\2\2\2\7\u015e\3\2\2\2\t\u0160\3\2\2\2\13\u0162\3\2\2\2\r\u0166\3\2"+
		"\2\2\17\u016a\3\2\2\2\21\u016c\3\2\2\2\23\u017d\3\2\2\2\25\u017f\3\2\2"+
		"\2\27\u0182\3\2\2\2\31\u0184\3\2\2\2\33\u0188\3\2\2\2\35\u018e\3\2\2\2"+
		"\37\u0195\3\2\2\2!\u0198\3\2\2\2#\u019e\3\2\2\2%\u01a0\3\2\2\2\'\u01a4"+
		"\3\2\2\2)\u01a8\3\2\2\2+\u01af\3\2\2\2-\u01b2\3\2\2\2/\u01b8\3\2\2\2\61"+
		"\u01ba\3\2\2\2\63\u01be\3\2\2\2\65\u01c2\3\2\2\2\67\u01ca\3\2\2\29\u01d0"+
		"\3\2\2\2;\u01d2\3\2\2\2=\u01d4\3\2\2\2?\u01d8\3\2\2\2A\u01e4\3\2\2\2C"+
		"\u01e6\3\2\2\2E\u01ee\3\2\2\2G\u01f4\3\2\2\2I\u01f7\3\2\2\2K\u01fc\3\2"+
		"\2\2M\u0202\3\2\2\2O\u020c\3\2\2\2Q\u0210\3\2\2\2S\u021b\3\2\2\2U\u0229"+
		"\3\2\2\2W\u022d\3\2\2\2Y\u022f\3\2\2\2[\u0238\3\2\2\2]\u023a\3\2\2\2_"+
		"\u023c\3\2\2\2a\u023e\3\2\2\2c\u0240\3\2\2\2e\u0244\3\2\2\2g\u0249\3\2"+
		"\2\2i\u0250\3\2\2\2k\u0259\3\2\2\2m\u0260\3\2\2\2o\u0268\3\2\2\2q\u026e"+
		"\3\2\2\2s\u0273\3\2\2\2u\u0278\3\2\2\2w\u027e\3\2\2\2y\u0283\3\2\2\2{"+
		"\u0289\3\2\2\2}\u028f\3\2\2\2\177\u0298\3\2\2\2\u0081\u02a0\3\2\2\2\u0083"+
		"\u02a3\3\2\2\2\u0085\u02aa\3\2\2\2\u0087\u02af\3\2\2\2\u0089\u02b7\3\2"+
		"\2\2\u008b\u02bd\3\2\2\2\u008d\u02c5\3\2\2\2\u008f\u02cb\3\2\2\2\u0091"+
		"\u02cf\3\2\2\2\u0093\u02d4\3\2\2\2\u0095\u02d7\3\2\2\2\u0097\u02e2\3\2"+
		"\2\2\u0099\u02e9\3\2\2\2\u009b\u02f4\3\2\2\2\u009d\u02f8\3\2\2\2\u009f"+
		"\u0302\3\2\2\2\u00a1\u0307\3\2\2\2\u00a3\u030e\3\2\2\2\u00a5\u0312\3\2"+
		"\2\2\u00a7\u031a\3\2\2\2\u00a9\u0322\3\2\2\2\u00ab\u032c\3\2\2\2\u00ad"+
		"\u0333\3\2\2\2\u00af\u033a\3\2\2\2\u00b1\u0340\3\2\2\2\u00b3\u0347\3\2"+
		"\2\2\u00b5\u0350\3\2\2\2\u00b7\u0356\3\2\2\2\u00b9\u0363\3\2\2\2\u00bb"+
		"\u036a\3\2\2\2\u00bd\u036f\3\2\2\2\u00bf\u0375\3\2\2\2\u00c1\u037c\3\2"+
		"\2\2\u00c3\u0386\3\2\2\2\u00c5\u038a\3\2\2\2\u00c7\u038f\3\2\2\2\u00c9"+
		"\u0398\3\2\2\2\u00cb\u039e\3\2\2\2\u00cd\u03a9\3\2\2\2\u00cf\u03ad\3\2"+
		"\2\2\u00d1\u03b8\3\2\2\2\u00d3\u03ba\3\2\2\2\u00d5\u03be\3\2\2\2\u00d7"+
		"\u03c1\3\2\2\2\u00d9\u03c6\3\2\2\2\u00db\u03c8\3\2\2\2\u00dd\u03ca\3\2"+
		"\2\2\u00df\u03cc\3\2\2\2\u00e1\u03ce\3\2\2\2\u00e3\u03d0\3\2\2\2\u00e5"+
		"\u03d2\3\2\2\2\u00e7\u03d5\3\2\2\2\u00e9\u03d8\3\2\2\2\u00eb\u03db\3\2"+
		"\2\2\u00ed\u03de\3\2\2\2\u00ef\u03e1\3\2\2\2\u00f1\u03e4\3\2\2\2\u00f3"+
		"\u03e7\3\2\2\2\u00f5\u03ea\3\2\2\2\u00f7\u03ec\3\2\2\2\u00f9\u03ee\3\2"+
		"\2\2\u00fb\u03f0\3\2\2\2\u00fd\u03f2\3\2\2\2\u00ff\u03f4\3\2\2\2\u0101"+
		"\u03f7\3\2\2\2\u0103\u03fa\3\2\2\2\u0105\u03fd\3\2\2\2\u0107\u0400\3\2"+
		"\2\2\u0109\u0403\3\2\2\2\u010b\u0407\3\2\2\2\u010d\u0409\3\2\2\2\u010f"+
		"\u040b\3\2\2\2\u0111\u040d\3\2\2\2\u0113\u040f\3\2\2\2\u0115\u0412\3\2"+
		"\2\2\u0117\u0415\3\2\2\2\u0119\u0418\3\2\2\2\u011b\u041b\3\2\2\2\u011d"+
		"\u041e\3\2\2\2\u011f\u0422\3\2\2\2\u0121\u0426\3\2\2\2\u0123\u042a\3\2"+
		"\2\2\u0125\u042f\3\2\2\2\u0127\u0431\3\2\2\2\u0129\u0433\3\2\2\2\u012b"+
		"\u0435\3\2\2\2\u012d\u0437\3\2\2\2\u012f\u0439\3\2\2\2\u0131\u043b\3\2"+
		"\2\2\u0133\u043d\3\2\2\2\u0135\u043f\3\2\2\2\u0137\u0441\3\2\2\2\u0139"+
		"\u0443\3\2\2\2\u013b\u0446\3\2\2\2\u013d\u0449\3\2\2\2\u013f\u0140\7\20"+
		"\2\2\u0140\4\3\2\2\2\u0141\u0142\5C\"\2\u0142\u0144\5\u0129\u0095\2\u0143"+
		"\u0145\5C\"\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0147\3\2"+
		"\2\2\u0146\u0148\5\13\6\2\u0147\u0146\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u014a\3\2\2\2\u0149\u014b\5\7\4\2\u014a\u0149\3\2\2\2\u014a\u014b\3\2"+
		"\2\2\u014b\u015d\3\2\2\2\u014c\u014d\5\u0129\u0095\2\u014d\u014f\5C\""+
		"\2\u014e\u0150\5\13\6\2\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u0152\3\2\2\2\u0151\u0153\5\7\4\2\u0152\u0151\3\2\2\2\u0152\u0153\3\2"+
		"\2\2\u0153\u015d\3\2\2\2\u0154\u0155\5C\"\2\u0155\u0157\5\13\6\2\u0156"+
		"\u0158\5\7\4\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015d\3\2"+
		"\2\2\u0159\u015a\5C\"\2\u015a\u015b\5\7\4\2\u015b\u015d\3\2\2\2\u015c"+
		"\u0141\3\2\2\2\u015c\u014c\3\2\2\2\u015c\u0154\3\2\2\2\u015c\u0159\3\2"+
		"\2\2\u015d\6\3\2\2\2\u015e\u015f\t\2\2\2\u015f\b\3\2\2\2\u0160\u0161\t"+
		"\3\2\2\u0161\n\3\2\2\2\u0162\u0163\5\t\5\2\u0163\u0164\5\r\7\2\u0164\f"+
		"\3\2\2\2\u0165\u0167\5\17\b\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2\2"+
		"\u0167\u0168\3\2\2\2\u0168\u0169\5C\"\2\u0169\16\3\2\2\2\u016a\u016b\t"+
		"\4\2\2\u016b\20\3\2\2\2\u016c\u016d\5\23\n\2\u016d\u016f\5\25\13\2\u016e"+
		"\u0170\5\7\4\2\u016f\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170\22\3\2\2"+
		"\2\u0171\u0173\5\63\32\2\u0172\u0174\5\u0129\u0095\2\u0173\u0172\3\2\2"+
		"\2\u0173\u0174\3\2\2\2\u0174\u017e\3\2\2\2\u0175\u0176\7\62\2\2\u0176"+
		"\u0178\t\5\2\2\u0177\u0179\5\65\33\2\u0178\u0177\3\2\2\2\u0178\u0179\3"+
		"\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\5\u0129\u0095\2\u017b\u017c\5\65"+
		"\33\2\u017c\u017e\3\2\2\2\u017d\u0171\3\2\2\2\u017d\u0175\3\2\2\2\u017e"+
		"\24\3\2\2\2\u017f\u0180\5\27\f\2\u0180\u0181\5\r\7\2\u0181\26\3\2\2\2"+
		"\u0182\u0183\t\6\2\2\u0183\30\3\2\2\2\u0184\u0186\5\33\16\2\u0185\u0187"+
		"\5? \2\u0186\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187\32\3\2\2\2\u0188"+
		"\u018a\7\62\2\2\u0189\u018b\5I%\2\u018a\u0189\3\2\2\2\u018a\u018b\3\2"+
		"\2\2\u018b\u018c\3\2\2\2\u018c\u018d\5\35\17\2\u018d\34\3\2\2\2\u018e"+
		"\u0193\5\37\20\2\u018f\u0191\5!\21\2\u0190\u018f\3\2\2\2\u0190\u0191\3"+
		"\2\2\2\u0191\u0192\3\2\2\2\u0192\u0194\5\37\20\2\u0193\u0190\3\2\2\2\u0193"+
		"\u0194\3\2\2\2\u0194\36\3\2\2\2\u0195\u0196\t\7\2\2\u0196 \3\2\2\2\u0197"+
		"\u0199\5#\22\2\u0198\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u0198\3\2"+
		"\2\2\u019a\u019b\3\2\2\2\u019b\"\3\2\2\2\u019c\u019f\5\37\20\2\u019d\u019f"+
		"\7a\2\2\u019e\u019c\3\2\2\2\u019e\u019d\3\2\2\2\u019f$\3\2\2\2\u01a0\u01a2"+
		"\5\'\24\2\u01a1\u01a3\5? \2\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3"+
		"&\3\2\2\2\u01a4\u01a5\7\62\2\2\u01a5\u01a6\t\b\2\2\u01a6\u01a7\5)\25\2"+
		"\u01a7(\3\2\2\2\u01a8\u01ad\5+\26\2\u01a9\u01ab\5-\27\2\u01aa\u01a9\3"+
		"\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\5+\26\2\u01ad"+
		"\u01aa\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae*\3\2\2\2\u01af\u01b0\t\t\2\2"+
		"\u01b0,\3\2\2\2\u01b1\u01b3\5/\30\2\u01b2\u01b1\3\2\2\2\u01b3\u01b4\3"+
		"\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5.\3\2\2\2\u01b6\u01b9"+
		"\5+\26\2\u01b7\u01b9\7a\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b7\3\2\2\2\u01b9"+
		"\60\3\2\2\2\u01ba\u01bc\5\63\32\2\u01bb\u01bd\5? \2\u01bc\u01bb\3\2\2"+
		"\2\u01bc\u01bd\3\2\2\2\u01bd\62\3\2\2\2\u01be\u01bf\7\62\2\2\u01bf\u01c0"+
		"\t\5\2\2\u01c0\u01c1\5\65\33\2\u01c1\64\3\2\2\2\u01c2\u01c7\5;\36\2\u01c3"+
		"\u01c5\5\67\34\2\u01c4\u01c3\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\3"+
		"\2\2\2\u01c6\u01c8\5;\36\2\u01c7\u01c4\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8"+
		"\66\3\2\2\2\u01c9\u01cb\59\35\2\u01ca\u01c9\3\2\2\2\u01cb\u01cc\3\2\2"+
		"\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd8\3\2\2\2\u01ce\u01d1"+
		"\5;\36\2\u01cf\u01d1\7a\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01cf\3\2\2\2\u01d1"+
		":\3\2\2\2\u01d2\u01d3\t\n\2\2\u01d3<\3\2\2\2\u01d4\u01d6\5A!\2\u01d5\u01d7"+
		"\5? \2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7>\3\2\2\2\u01d8\u01d9"+
		"\t\13\2\2\u01d9@\3\2\2\2\u01da\u01e5\7\62\2\2\u01db\u01e2\5Y-\2\u01dc"+
		"\u01de\5C\"\2\u01dd\u01dc\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e3\3\2"+
		"\2\2\u01df\u01e0\5I%\2\u01e0\u01e1\5C\"\2\u01e1\u01e3\3\2\2\2\u01e2\u01dd"+
		"\3\2\2\2\u01e2\u01df\3\2\2\2\u01e3\u01e5\3\2\2\2\u01e4\u01da\3\2\2\2\u01e4"+
		"\u01db\3\2\2\2\u01e5B\3\2\2\2\u01e6\u01eb\5W,\2\u01e7\u01e9\5E#\2\u01e8"+
		"\u01e7\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ec\5W"+
		",\2\u01eb\u01e8\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ecD\3\2\2\2\u01ed\u01ef"+
		"\5G$\2\u01ee\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0"+
		"\u01f1\3\2\2\2\u01f1F\3\2\2\2\u01f2\u01f5\5W,\2\u01f3\u01f5\7a\2\2\u01f4"+
		"\u01f2\3\2\2\2\u01f4\u01f3\3\2\2\2\u01f5H\3\2\2\2\u01f6\u01f8\7a\2\2\u01f7"+
		"\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2"+
		"\2\2\u01faJ\3\2\2\2\u01fb\u01fd\t\f\2\2\u01fc\u01fb\3\2\2\2\u01fd\u01fe"+
		"\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\3\2\2\2\u0200"+
		"\u0201\b&\2\2\u0201L\3\2\2\2\u0202\u0206\5\u0139\u009d\2\u0203\u0205\n"+
		"\r\2\2\u0204\u0203\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0206"+
		"\u0207\3\2\2\2\u0207\u0209\3\2\2\2\u0208\u0206\3\2\2\2\u0209\u020a\b\'"+
		"\3\2\u020aN\3\2\2\2\u020b\u020d\7\17\2\2\u020c\u020b\3\2\2\2\u020c\u020d"+
		"\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u020f\7\f\2\2\u020fP\3\2\2\2\u0210"+
		"\u0214\5\u013b\u009e\2\u0211\u0213\13\2\2\2\u0212\u0211\3\2\2\2\u0213"+
		"\u0216\3\2\2\2\u0214\u0215\3\2\2\2\u0214\u0212\3\2\2\2\u0215\u0217\3\2"+
		"\2\2\u0216\u0214\3\2\2\2\u0217\u0218\5\u013d\u009f\2\u0218\u0219\3\2\2"+
		"\2\u0219\u021a\b)\3\2\u021aR\3\2\2\2\u021b\u0224\7$\2\2\u021c\u0223\n"+
		"\16\2\2\u021d\u0220\7^\2\2\u021e\u0221\13\2\2\2\u021f\u0221\7\2\2\3\u0220"+
		"\u021e\3\2\2\2\u0220\u021f\3\2\2\2\u0221\u0223\3\2\2\2\u0222\u021c\3\2"+
		"\2\2\u0222\u021d\3\2\2\2\u0223\u0226\3\2\2\2\u0224\u0222\3\2\2\2\u0224"+
		"\u0225\3\2\2\2\u0225T\3\2\2\2\u0226\u0224\3\2\2\2\u0227\u022a\5[.\2\u0228"+
		"\u022a\5W,\2\u0229\u0227\3\2\2\2\u0229\u0228\3\2\2\2\u022aV\3\2\2\2\u022b"+
		"\u022e\7\62\2\2\u022c\u022e\5Y-\2\u022d\u022b\3\2\2\2\u022d\u022c\3\2"+
		"\2\2\u022eX\3\2\2\2\u022f\u0230\t\17\2\2\u0230Z\3\2\2\2\u0231\u0239\5"+
		"]/\2\u0232\u0239\5_\60\2\u0233\u0234\n\20\2\2\u0234\u0239\6.\2\2\u0235"+
		"\u0236\t\21\2\2\u0236\u0237\t\22\2\2\u0237\u0239\6.\3\2\u0238\u0231\3"+
		"\2\2\2\u0238\u0232\3\2\2\2\u0238\u0233\3\2\2\2\u0238\u0235\3\2\2\2\u0239"+
		"\\\3\2\2\2\u023a\u023b\t\23\2\2\u023b^\3\2\2\2\u023c\u023d\t\24\2\2\u023d"+
		"`\3\2\2\2\u023e\u023f\7B\2\2\u023fb\3\2\2\2\u0240\u0241\7\60\2\2\u0241"+
		"\u0242\7\60\2\2\u0242\u0243\7\60\2\2\u0243d\3\2\2\2\u0244\u0245\7N\2\2"+
		"\u0245\u0246\7q\2\2\u0246\u0247\7p\2\2\u0247\u0248\7i\2\2\u0248f\3\2\2"+
		"\2\u0249\u024a\7U\2\2\u024a\u024b\7v\2\2\u024b\u024c\7t\2\2\u024c\u024d"+
		"\7k\2\2\u024d\u024e\7p\2\2\u024e\u024f\7i\2\2\u024fh\3\2\2\2\u0250\u0251"+
		"\7c\2\2\u0251\u0252\7d\2\2\u0252\u0253\7u\2\2\u0253\u0254\7v\2\2\u0254"+
		"\u0255\7t\2\2\u0255\u0256\7c\2\2\u0256\u0257\7e\2\2\u0257\u0258\7v\2\2"+
		"\u0258j\3\2\2\2\u0259\u025a\7c\2\2\u025a\u025b\7u\2\2\u025b\u025c\7u\2"+
		"\2\u025c\u025d\7g\2\2\u025d\u025e\7t\2\2\u025e\u025f\7v\2\2\u025fl\3\2"+
		"\2\2\u0260\u0261\7d\2\2\u0261\u0262\7q\2\2\u0262\u0263\7q\2\2\u0263\u0264"+
		"\7n\2\2\u0264\u0265\7g\2\2\u0265\u0266\7c\2\2\u0266\u0267\7p\2\2\u0267"+
		"n\3\2\2\2\u0268\u0269\7d\2\2\u0269\u026a\7t\2\2\u026a\u026b\7g\2\2\u026b"+
		"\u026c\7c\2\2\u026c\u026d\7m\2\2\u026dp\3\2\2\2\u026e\u026f\7d\2\2\u026f"+
		"\u0270\7{\2\2\u0270\u0271\7v\2\2\u0271\u0272\7g\2\2\u0272r\3\2\2\2\u0273"+
		"\u0274\7e\2\2\u0274\u0275\7c\2\2\u0275\u0276\7u\2\2\u0276\u0277\7g\2\2"+
		"\u0277t\3\2\2\2\u0278\u0279\7e\2\2\u0279\u027a\7c\2\2\u027a\u027b\7v\2"+
		"\2\u027b\u027c\7e\2\2\u027c\u027d\7j\2\2\u027dv\3\2\2\2\u027e\u027f\7"+
		"e\2\2\u027f\u0280\7j\2\2\u0280\u0281\7c\2\2\u0281\u0282\7t\2\2\u0282x"+
		"\3\2\2\2\u0283\u0284\7e\2\2\u0284\u0285\7n\2\2\u0285\u0286\7c\2\2\u0286"+
		"\u0287\7u\2\2\u0287\u0288\7u\2\2\u0288z\3\2\2\2\u0289\u028a\7e\2\2\u028a"+
		"\u028b\7q\2\2\u028b\u028c\7p\2\2\u028c\u028d\7u\2\2\u028d\u028e\7v\2\2"+
		"\u028e|\3\2\2\2\u028f\u0290\7e\2\2\u0290\u0291\7q\2\2\u0291\u0292\7p\2"+
		"\2\u0292\u0293\7v\2\2\u0293\u0294\7k\2\2\u0294\u0295\7p\2\2\u0295\u0296"+
		"\7w\2\2\u0296\u0297\7g\2\2\u0297~\3\2\2\2\u0298\u0299\7f\2\2\u0299\u029a"+
		"\7g\2\2\u029a\u029b\7h\2\2\u029b\u029c\7c\2\2\u029c\u029d\7w\2\2\u029d"+
		"\u029e\7n\2\2\u029e\u029f\7v\2\2\u029f\u0080\3\2\2\2\u02a0\u02a1\7f\2"+
		"\2\u02a1\u02a2\7q\2\2\u02a2\u0082\3\2\2\2\u02a3\u02a4\7f\2\2\u02a4\u02a5"+
		"\7q\2\2\u02a5\u02a6\7w\2\2\u02a6\u02a7\7d\2\2\u02a7\u02a8\7n\2\2\u02a8"+
		"\u02a9\7g\2\2\u02a9\u0084\3\2\2\2\u02aa\u02ab\7g\2\2\u02ab\u02ac\7n\2"+
		"\2\u02ac\u02ad\7u\2\2\u02ad\u02ae\7g\2\2\u02ae\u0086\3\2\2\2\u02af\u02b0"+
		"\7g\2\2\u02b0\u02b1\7z\2\2\u02b1\u02b2\7v\2\2\u02b2\u02b3\7g\2\2\u02b3"+
		"\u02b4\7p\2\2\u02b4\u02b5\7f\2\2\u02b5\u02b6\7u\2\2\u02b6\u0088\3\2\2"+
		"\2\u02b7\u02b8\7h\2\2\u02b8\u02b9\7k\2\2\u02b9\u02ba\7p\2\2\u02ba\u02bb"+
		"\7c\2\2\u02bb\u02bc\7n\2\2\u02bc\u008a\3\2\2\2\u02bd\u02be\7h\2\2\u02be"+
		"\u02bf\7k\2\2\u02bf\u02c0\7p\2\2\u02c0\u02c1\7c\2\2\u02c1\u02c2\7n\2\2"+
		"\u02c2\u02c3\7n\2\2\u02c3\u02c4\7{\2\2\u02c4\u008c\3\2\2\2\u02c5\u02c6"+
		"\7h\2\2\u02c6\u02c7\7n\2\2\u02c7\u02c8\7q\2\2\u02c8\u02c9\7c\2\2\u02c9"+
		"\u02ca\7v\2\2\u02ca\u008e\3\2\2\2\u02cb\u02cc\7h\2\2\u02cc\u02cd\7q\2"+
		"\2\u02cd\u02ce\7t\2\2\u02ce\u0090\3\2\2\2\u02cf\u02d0\7i\2\2\u02d0\u02d1"+
		"\7q\2\2\u02d1\u02d2\7v\2\2\u02d2\u02d3\7q\2\2\u02d3\u0092\3\2\2\2\u02d4"+
		"\u02d5\7k\2\2\u02d5\u02d6\7h\2\2\u02d6\u0094\3\2\2\2\u02d7\u02d8\7k\2"+
		"\2\u02d8\u02d9\7o\2\2\u02d9\u02da\7r\2\2\u02da\u02db\7n\2\2\u02db\u02dc"+
		"\7g\2\2\u02dc\u02dd\7o\2\2\u02dd\u02de\7g\2\2\u02de\u02df\7p\2\2\u02df"+
		"\u02e0\7v\2\2\u02e0\u02e1\7u\2\2\u02e1\u0096\3\2\2\2\u02e2\u02e3\7k\2"+
		"\2\u02e3\u02e4\7o\2\2\u02e4\u02e5\7r\2\2\u02e5\u02e6\7q\2\2\u02e6\u02e7"+
		"\7t\2\2\u02e7\u02e8\7v\2\2\u02e8\u0098\3\2\2\2\u02e9\u02ea\7k\2\2\u02ea"+
		"\u02eb\7p\2\2\u02eb\u02ec\7u\2\2\u02ec\u02ed\7v\2\2\u02ed\u02ee\7c\2\2"+
		"\u02ee\u02ef\7p\2\2\u02ef\u02f0\7e\2\2\u02f0\u02f1\7g\2\2\u02f1\u02f2"+
		"\7q\2\2\u02f2\u02f3\7h\2\2\u02f3\u009a\3\2\2\2\u02f4\u02f5\7k\2\2\u02f5"+
		"\u02f6\7p\2\2\u02f6\u02f7\7v\2\2\u02f7\u009c\3\2\2\2\u02f8\u02f9\7k\2"+
		"\2\u02f9\u02fa\7p\2\2\u02fa\u02fb\7v\2\2\u02fb\u02fc\7g\2\2\u02fc\u02fd"+
		"\7t\2\2\u02fd\u02fe\7h\2\2\u02fe\u02ff\7c\2\2\u02ff\u0300\7e\2\2\u0300"+
		"\u0301\7g\2\2\u0301\u009e\3\2\2\2\u0302\u0303\7n\2\2\u0303\u0304\7q\2"+
		"\2\u0304\u0305\7p\2\2\u0305\u0306\7i\2\2\u0306\u00a0\3\2\2\2\u0307\u0308"+
		"\7p\2\2\u0308\u0309\7c\2\2\u0309\u030a\7v\2\2\u030a\u030b\7k\2\2\u030b"+
		"\u030c\7x\2\2\u030c\u030d\7g\2\2\u030d\u00a2\3\2\2\2\u030e\u030f\7p\2"+
		"\2\u030f\u0310\7g\2\2\u0310\u0311\7y\2\2\u0311\u00a4\3\2\2\2\u0312\u0313"+
		"\7r\2\2\u0313\u0314\7c\2\2\u0314\u0315\7e\2\2\u0315\u0316\7m\2\2\u0316"+
		"\u0317\7c\2\2\u0317\u0318\7i\2\2\u0318\u0319\7g\2\2\u0319\u00a6\3\2\2"+
		"\2\u031a\u031b\7r\2\2\u031b\u031c\7t\2\2\u031c\u031d\7k\2\2\u031d\u031e"+
		"\7x\2\2\u031e\u031f\7c\2\2\u031f\u0320\7v\2\2\u0320\u0321\7g\2\2\u0321"+
		"\u00a8\3\2\2\2\u0322\u0323\7r\2\2\u0323\u0324\7t\2\2\u0324\u0325\7q\2"+
		"\2\u0325\u0326\7v\2\2\u0326\u0327\7g\2\2\u0327\u0328\7e\2\2\u0328\u0329"+
		"\7v\2\2\u0329\u032a\7g\2\2\u032a\u032b\7f\2\2\u032b\u00aa\3\2\2\2\u032c"+
		"\u032d\7r\2\2\u032d\u032e\7w\2\2\u032e\u032f\7d\2\2\u032f\u0330\7n\2\2"+
		"\u0330\u0331\7k\2\2\u0331\u0332\7e\2\2\u0332\u00ac\3\2\2\2\u0333\u0334"+
		"\7t\2\2\u0334\u0335\7g\2\2\u0335\u0336\7v\2\2\u0336\u0337\7w\2\2\u0337"+
		"\u0338\7t\2\2\u0338\u0339\7p\2\2\u0339\u00ae\3\2\2\2\u033a\u033b\7u\2"+
		"\2\u033b\u033c\7j\2\2\u033c\u033d\7q\2\2\u033d\u033e\7t\2\2\u033e\u033f"+
		"\7v\2\2\u033f\u00b0\3\2\2\2\u0340\u0341\7u\2\2\u0341\u0342\7v\2\2\u0342"+
		"\u0343\7c\2\2\u0343\u0344\7v\2\2\u0344\u0345\7k\2\2\u0345\u0346\7e\2\2"+
		"\u0346\u00b2\3\2\2\2\u0347\u0348\7u\2\2\u0348\u0349\7v\2\2\u0349\u034a"+
		"\7t\2\2\u034a\u034b\7k\2\2\u034b\u034c\7e\2\2\u034c\u034d\7v\2\2\u034d"+
		"\u034e\7h\2\2\u034e\u034f\7r\2\2\u034f\u00b4\3\2\2\2\u0350\u0351\7u\2"+
		"\2\u0351\u0352\7w\2\2\u0352\u0353\7r\2\2\u0353\u0354\7g\2\2\u0354\u0355"+
		"\7t\2\2\u0355\u00b6\3\2\2\2\u0356\u0357\7u\2\2\u0357\u0358\7{\2\2\u0358"+
		"\u0359\7p\2\2\u0359\u035a\7e\2\2\u035a\u035b\7j\2\2\u035b\u035c\7t\2\2"+
		"\u035c\u035d\7q\2\2\u035d\u035e\7p\2\2\u035e\u035f\7k\2\2\u035f\u0360"+
		"\7|\2\2\u0360\u0361\7g\2\2\u0361\u0362\7f\2\2\u0362\u00b8\3\2\2\2\u0363"+
		"\u0364\7u\2\2\u0364\u0365\7y\2\2\u0365\u0366\7k\2\2\u0366\u0367\7v\2\2"+
		"\u0367\u0368\7e\2\2\u0368\u0369\7j\2\2\u0369\u00ba\3\2\2\2\u036a\u036b"+
		"\7v\2\2\u036b\u036c\7j\2\2\u036c\u036d\7k\2\2\u036d\u036e\7u\2\2\u036e"+
		"\u00bc\3\2\2\2\u036f\u0370\7v\2\2\u0370\u0371\7j\2\2\u0371\u0372\7t\2"+
		"\2\u0372\u0373\7q\2\2\u0373\u0374\7y\2\2\u0374\u00be\3\2\2\2\u0375\u0376"+
		"\7v\2\2\u0376\u0377\7j\2\2\u0377\u0378\7t\2\2\u0378\u0379\7q\2\2\u0379"+
		"\u037a\7y\2\2\u037a\u037b\7u\2\2\u037b\u00c0\3\2\2\2\u037c\u037d\7v\2"+
		"\2\u037d\u037e\7t\2\2\u037e\u037f\7c\2\2\u037f\u0380\7p\2\2\u0380\u0381"+
		"\7u\2\2\u0381\u0382\7k\2\2\u0382\u0383\7g\2\2\u0383\u0384\7p\2\2\u0384"+
		"\u0385\7v\2\2\u0385\u00c2\3\2\2\2\u0386\u0387\7v\2\2\u0387\u0388\7t\2"+
		"\2\u0388\u0389\7{\2\2\u0389\u00c4\3\2\2\2\u038a\u038b\7x\2\2\u038b\u038c"+
		"\7q\2\2\u038c\u038d\7k\2\2\u038d\u038e\7f\2\2\u038e\u00c6\3\2\2\2\u038f"+
		"\u0390\7x\2\2\u0390\u0391\7q\2\2\u0391\u0392\7n\2\2\u0392\u0393\7c\2\2"+
		"\u0393\u0394\7v\2\2\u0394\u0395\7k\2\2\u0395\u0396\7n\2\2\u0396\u0397"+
		"\7g\2\2\u0397\u00c8\3\2\2\2\u0398\u0399\7y\2\2\u0399\u039a\7j\2\2\u039a"+
		"\u039b\7k\2\2\u039b\u039c\7n\2\2\u039c\u039d\7g\2\2\u039d\u00ca\3\2\2"+
		"\2\u039e\u03a2\5[.\2\u039f\u03a1\5U+\2\u03a0\u039f\3\2\2\2\u03a1\u03a4"+
		"\3\2\2\2\u03a2\u03a0\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u00cc\3\2\2\2\u03a4"+
		"\u03a2\3\2\2\2\u03a5\u03aa\5=\37\2\u03a6\u03aa\5\61\31\2\u03a7\u03aa\5"+
		"\31\r\2\u03a8\u03aa\5%\23\2\u03a9\u03a5\3\2\2\2\u03a9\u03a6\3\2\2\2\u03a9"+
		"\u03a7\3\2\2\2\u03a9\u03a8\3\2\2\2\u03aa\u00ce\3\2\2\2\u03ab\u03ae\5\5"+
		"\3\2\u03ac\u03ae\5\21\t\2\u03ad\u03ab\3\2\2\2\u03ad\u03ac\3\2\2\2\u03ae"+
		"\u00d0\3\2\2\2\u03af\u03b0\7v\2\2\u03b0\u03b1\7t\2\2\u03b1\u03b2\7w\2"+
		"\2\u03b2\u03b9\7g\2\2\u03b3\u03b4\7h\2\2\u03b4\u03b5\7c\2\2\u03b5\u03b6"+
		"\7n\2\2\u03b6\u03b7\7u\2\2\u03b7\u03b9\7g\2\2\u03b8\u03af\3\2\2\2\u03b8"+
		"\u03b3\3\2\2\2\u03b9\u00d2\3\2\2\2\u03ba\u03bb\7)\2\2\u03bb\u03bc\13\2"+
		"\2\2\u03bc\u03bd\7)\2\2\u03bd\u00d4\3\2\2\2\u03be\u03bf\5S*\2\u03bf\u03c0"+
		"\7$\2\2\u03c0\u00d6\3\2\2\2\u03c1\u03c2\7p\2\2\u03c2\u03c3\7w\2\2\u03c3"+
		"\u03c4\7n\2\2\u03c4\u03c5\7n\2\2\u03c5\u00d8\3\2\2\2\u03c6\u03c7\7A\2"+
		"\2\u03c7\u00da\3\2\2\2\u03c8\u03c9\7<\2\2\u03c9\u00dc\3\2\2\2\u03ca\u03cb"+
		"\7?\2\2\u03cb\u00de\3\2\2\2\u03cc\u03cd\7@\2\2\u03cd\u00e0\3\2\2\2\u03ce"+
		"\u03cf\7>\2\2\u03cf\u00e2\3\2\2\2\u03d0\u03d1\7#\2\2\u03d1\u00e4\3\2\2"+
		"\2\u03d2\u03d3\7>\2\2\u03d3\u03d4\7?\2\2\u03d4\u00e6\3\2\2\2\u03d5\u03d6"+
		"\7@\2\2\u03d6\u03d7\7?\2\2\u03d7\u00e8\3\2\2\2\u03d8\u03d9\7?\2\2\u03d9"+
		"\u03da\7?\2\2\u03da\u00ea\3\2\2\2\u03db\u03dc\7#\2\2\u03dc\u03dd\7?\2"+
		"\2\u03dd\u00ec\3\2\2\2\u03de\u03df\7(\2\2\u03df\u03e0\7(\2\2\u03e0\u00ee"+
		"\3\2\2\2\u03e1\u03e2\7~\2\2\u03e2\u03e3\7~\2\2\u03e3\u00f0\3\2\2\2\u03e4"+
		"\u03e5\7-\2\2\u03e5\u03e6\7-\2\2\u03e6\u00f2\3\2\2\2\u03e7\u03e8\7/\2"+
		"\2\u03e8\u03e9\7/\2\2\u03e9\u00f4\3\2\2\2\u03ea\u03eb\7-\2\2\u03eb\u00f6"+
		"\3\2\2\2\u03ec\u03ed\7/\2\2\u03ed\u00f8\3\2\2\2\u03ee\u03ef\7,\2\2\u03ef"+
		"\u00fa\3\2\2\2\u03f0\u03f1\7\61\2\2\u03f1\u00fc\3\2\2\2\u03f2\u03f3\7"+
		"\'\2\2\u03f3\u00fe\3\2\2\2\u03f4\u03f5\7-\2\2\u03f5\u03f6\7?\2\2\u03f6"+
		"\u0100\3\2\2\2\u03f7\u03f8\7/\2\2\u03f8\u03f9\7?\2\2\u03f9\u0102\3\2\2"+
		"\2\u03fa\u03fb\7,\2\2\u03fb\u03fc\7?\2\2\u03fc\u0104\3\2\2\2\u03fd\u03fe"+
		"\7\61\2\2\u03fe\u03ff\7?\2\2\u03ff\u0106\3\2\2\2\u0400\u0401\7\'\2\2\u0401"+
		"\u0402\7?\2\2\u0402\u0108\3\2\2\2\u0403\u0404\7(\2\2\u0404\u0405\7(\2"+
		"\2\u0405\u0406\7?\2\2\u0406\u010a\3\2\2\2\u0407\u0408\7\u0080\2\2\u0408"+
		"\u010c\3\2\2\2\u0409\u040a\7(\2\2\u040a\u010e\3\2\2\2\u040b\u040c\7~\2"+
		"\2\u040c\u0110\3\2\2\2\u040d\u040e\7`\2\2\u040e\u0112\3\2\2\2\u040f\u0410"+
		"\7(\2\2\u0410\u0411\7?\2\2\u0411\u0114\3\2\2\2\u0412\u0413\7`\2\2\u0413"+
		"\u0414\7?\2\2\u0414\u0116\3\2\2\2\u0415\u0416\7~\2\2\u0416\u0417\7?\2"+
		"\2\u0417\u0118\3\2\2\2\u0418\u0419\7>\2\2\u0419\u041a\7>\2\2\u041a\u011a"+
		"\3\2\2\2\u041b\u041c\7@\2\2\u041c\u041d\7@\2\2\u041d\u011c\3\2\2\2\u041e"+
		"\u041f\7@\2\2\u041f\u0420\7@\2\2\u0420\u0421\7@\2\2\u0421\u011e\3\2\2"+
		"\2\u0422\u0423\7>\2\2\u0423\u0424\7>\2\2\u0424\u0425\7?\2\2\u0425\u0120"+
		"\3\2\2\2\u0426\u0427\7@\2\2\u0427\u0428\7@\2\2\u0428\u0429\7?\2\2\u0429"+
		"\u0122\3\2\2\2\u042a\u042b\7@\2\2\u042b\u042c\7@\2\2\u042c\u042d\7@\2"+
		"\2\u042d\u042e\7?\2\2\u042e\u0124\3\2\2\2\u042f\u0430\7=\2\2\u0430\u0126"+
		"\3\2\2\2\u0431\u0432\7.\2\2\u0432\u0128\3\2\2\2\u0433\u0434\7\60\2\2\u0434"+
		"\u012a\3\2\2\2\u0435\u0436\7^\2\2\u0436\u012c\3\2\2\2\u0437\u0438\7*\2"+
		"\2\u0438\u012e\3\2\2\2\u0439\u043a\7+\2\2\u043a\u0130\3\2\2\2\u043b\u043c"+
		"\7}\2\2\u043c\u0132\3\2\2\2\u043d\u043e\7\177\2\2\u043e\u0134\3\2\2\2"+
		"\u043f\u0440\7]\2\2\u0440\u0136\3\2\2\2\u0441\u0442\7_\2\2\u0442\u0138"+
		"\3\2\2\2\u0443\u0444\7\61\2\2\u0444\u0445\7\61\2\2\u0445\u013a\3\2\2\2"+
		"\u0446\u0447\7\61\2\2\u0447\u0448\7,\2\2\u0448\u013c\3\2\2\2\u0449\u044a"+
		"\7,\2\2\u044a\u044b\7\61\2\2\u044b\u013e\3\2\2\2\66\2\u0144\u0147\u014a"+
		"\u014f\u0152\u0157\u015c\u0166\u016f\u0173\u0178\u017d\u0186\u018a\u0190"+
		"\u0193\u019a\u019e\u01a2\u01aa\u01ad\u01b4\u01b8\u01bc\u01c4\u01c7\u01cc"+
		"\u01d0\u01d6\u01dd\u01e2\u01e4\u01e8\u01eb\u01f0\u01f4\u01f9\u01fe\u0206"+
		"\u020c\u0214\u0220\u0222\u0224\u0229\u022d\u0238\u03a2\u03a9\u03ad\u03b8"+
		"\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}