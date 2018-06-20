package javagrammar;

import org.antlr.v4.runtime.misc.NotNull;

public class ParsingValidatorListener extends JavaGrammarBaseListener {
	 
    @Override
    public void enterCompilationUnit( JavaGrammarParser.CompilationUnitContext ctx) {
        System.out.println( ctx.getText() );
    }
    
    @Override
    public void enterMethodDeclaration
    ( JavaGrammarParser.MethodDeclarationContext ctx ) {
        System.out.println( ctx.getText() );
    }

}