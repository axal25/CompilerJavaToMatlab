import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import drink.AntlrDrinkListener;
import drink.DrinkLexer;
import drink.DrinkParser;

import javagrammar.AntlrJavaGrammarListener;
import javagrammar.JavaGrammarLexer;
import javagrammar.JavaGrammarParser;

public class Attacher {
	
	Attacher() {}
	
	private void printDrink(String drinkSentence) 
	{
		// Get our lexer
	    DrinkLexer lexer = new DrinkLexer(new ANTLRInputStream(drinkSentence));
	 
	    // Get a list of matched tokens
	    CommonTokenStream tokens = new CommonTokenStream(lexer);
	 
	    // Pass the tokens to the parser
	    DrinkParser parser = new DrinkParser(tokens);
	 
	    // Specify our entry point
	    DrinkParser.DrinkSentenceContext drinkSentenceContext = parser.drinkSentence();
	 
	    // Walk it and attach our listener
		ParseTreeWalker walker = new ParseTreeWalker();
		AntlrDrinkListener listener = new AntlrDrinkListener();
		walker.walk(listener, drinkSentenceContext);
	}
	
	private void printJavaGrammar(String javaSentence) 
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
		AntlrJavaGrammarListener listener = new AntlrJavaGrammarListener();
		walker.walk(listener, compilationUnit_ctx);
	}
	
	public void pubPrintDrink( String drinkSentence )
	{
		printDrink( drinkSentence );
	}
	
	public void pubPrintJavaGrammar( String inputSentence )
	{
		printJavaGrammar( inputSentence );
	}

}
