package javagrammar;

public class AntlrJavaGrammarListener extends JavaGrammarBaseListener {
	 
    @Override
    public void enterCompilationUnit( JavaGrammarParser.CompilationUnitContext ctx) {
        System.out.println( ctx.getText() );
    }
 
}