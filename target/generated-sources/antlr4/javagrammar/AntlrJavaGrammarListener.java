package javagrammar;

public class AntlrJavaGrammarListener extends JavaGrammarBaseListener {
	 
    @Override
    public void enterCompilationUnit( JavaGrammarParser.CompilationUnitContext ctx) {
        System.out.println( ctx.getText() );
    }
    
    @Override
    public void enterMethodDeclaraction( JavaGrammarParser.MethodDeclaractionContext ctx) {
        System.out.println( ctx.getText() );
    }
 
}