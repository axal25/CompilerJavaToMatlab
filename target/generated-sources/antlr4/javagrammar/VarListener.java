package javagrammar;

import java.util.List;
import java.util.Stack;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.misc.NotNull;

public class VarListener extends JavaGrammarBaseListener{
    
	@Override 
	public void enterVariableDeclaratorId
	( JavaGrammarParser.VariableDeclaratorIdContext ctx ) { 
		 String identifiers = ctx.IDENTIFIERS().getText();
		 printThis("variable declarator id : " + identifiers);
	}
	
	@Override 
	public void enterVariableDeclarator
	(@NotNull JavaGrammarParser.VariableDeclaratorContext ctx) {
		String identifiers2 = ctx.getText();
		printThis("variable declarator : " + identifiers2);
	}
	
	@Override 
	public void enterLocalVariableDeclaration
	(JavaGrammarParser.LocalVariableDeclarationContext ctx) {
		List a = null;
		//sd fksdmfk
		String ala = "";
		try{
			a = ctx.variableModifier();
			for (int i=0; i<a.size(); i++){
				ala = ala + ctx.variableModifier(i).getText();
			}
		}catch(Exception e){
			
		}
		String identifiers3 = ctx.typeType().getText();
		String identifiers4 = ctx.variableDeclarators().getText();	
		if(!a.isEmpty()){
			printThis("local variable declaration : " + ala + ' ' + identifiers3 + ' ' + identifiers4);
		}else{
		printThis("local variable declaration : " + ' ' + identifiers3 + ' ' + identifiers4);
		}
		
	}
	private void printThis(String something) {
		System.out.println(something);
    }
}
