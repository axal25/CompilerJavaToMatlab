import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import javagrammar.ParsingValidatorListener;
import javagrammar.JavaGrammarLexer;
import javagrammar.JavaGrammarParser;
import javagrammar.InterpreterListener;

public class Attacher {

	Attacher() {}
	
	private void privPrintMethodDeclaration(String javaSentence) 
	{
		// Get our lexer
	    JavaGrammarLexer lexer;
	    lexer = new JavaGrammarLexer(new ANTLRInputStream( javaSentence ));
	 
	    // Get a list of matched tokens
	    CommonTokenStream tokens = new CommonTokenStream(lexer);
	 
	    // Pass the tokens to the parser
	    JavaGrammarParser parser = new JavaGrammarParser(tokens);
	 
	    // Specify our entry point
	    JavaGrammarParser.MethodDeclarationContext methodDeclaraction_ctx = parser.methodDeclaration();
	 
	    // Walk it and attach our listener
		ParseTreeWalker walker = new ParseTreeWalker();
		ParsingValidatorListener listener = new ParsingValidatorListener();
		walker.walk(listener, methodDeclaraction_ctx);
	}
	
	private void privPrintJavaGrammar(String javaSentence) 
	{
		// Get our lexer
	    JavaGrammarLexer lexer = new JavaGrammarLexer(new ANTLRInputStream( javaSentence ));
	 
	    // Get a list of matched tokens
	    CommonTokenStream tokens = new CommonTokenStream(lexer);
	 
	    // Pass the tokens to the parser
	    JavaGrammarParser parser = new JavaGrammarParser(tokens);
	 
	    // Specify our entry point
	    JavaGrammarParser.CompilationUnitContext compilationUnit_ctx = parser.compilationUnit();
	 
	    // Walk it and attach our listener
		ParseTreeWalker walker = new ParseTreeWalker();
		ParsingValidatorListener listener = new ParsingValidatorListener();
		walker.walk(listener, compilationUnit_ctx);
	}
	
	private void privPrintIdentifiers(String javaSentence) 
	{
		// Get our lexer
	    JavaGrammarLexer lexer = new JavaGrammarLexer(new ANTLRInputStream( javaSentence ));
	 
	    // Get a list of matched tokens
	    CommonTokenStream tokens = new CommonTokenStream(lexer);
	 
	    // Pass the tokens to the parser
	    JavaGrammarParser parser = new JavaGrammarParser(tokens);
	    
	    // Specify our entry point
	    JavaGrammarParser.CompilationUnitContext compilationUnit_ctx = parser.compilationUnit();
	   
        ParseTreeWalker.DEFAULT.walk(new InterpreterListener(), compilationUnit_ctx);
	}
	
	public void pubPrintMethodDeclaration( String inputSentence )
	{
		privPrintMethodDeclaration( inputSentence );
	}
	
	public void pubPrintJavaGrammar( String inputSentence )
	{
		privPrintJavaGrammar( inputSentence );
	}

	public void pubPrintIdentifiers( String inputSentence )
	{
		privPrintIdentifiers( inputSentence );
	}
}
