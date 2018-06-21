package javagrammar;

import java.util.List;
import java.util.Objects;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class InterpreterListener extends JavaGrammarBaseListener{
	String buffer;
	
	public InterpreterListener() {
		buffer = "";
	}
    
	@Override 
	public void enterVariableDeclaratorId
	( JavaGrammarParser.VariableDeclaratorIdContext ctx ) { 
		 String identifiers = ctx.IDENTIFIERS().getText();
		 printThis("variable declarator id : " + identifiers);
	}
	
	@Override 
	public void enterVariableDeclarator
	(JavaGrammarParser.VariableDeclaratorContext ctx) {
		String identifiers2 = ctx.getText();
		printThis("variable declarator : " + identifiers2);
	}
	
	@Override 
	public void enterLocalVariableDeclaration
	(JavaGrammarParser.LocalVariableDeclarationContext ctx) {
		List a = null;
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
	
	@Override
	public void enterMethodDeclaration( JavaGrammarParser.MethodDeclarationContext ctx ) {
		//		methodDeclaration
		//	    : methodPermissionModifier? methodTypeModifier? typeTypeOrVoid IDENTIFIERS formalParameters ('[' ']')* //typeTypeOrVoid IDENTIFIERS formalParameters ('[' ']')*
		//	      (KEYWORDS_THROWS qualifiedNameList)?
		//	      methodBody
		//	    ;
		String methodPermissionModifier = getTextVersion( ctx.methodPermissionModifier() );
		String methodTypeModifier = getTextVersion( ctx.methodTypeModifier() );
		String typeTypeOrVoid = getTextVersion( ctx.typeTypeOrVoid() );
		
//		for(int i=0; i<ctx.getChildCount(); i++) {
//			System.out.println("\n\tchild#"+i+": "+ ctx.getChild(i).getText() );
//			
//			if( ctx.getChild(i) instanceof TerminalNode ) { 
//				System.out.println("This is terminal node: " + ctx.getChild(i).getText() );
//			}
//			
//			if( ctx.getChild(i) instanceof JavaGrammarParser.TypeTypeOrVoidContext ) {
//				System.out.println("\n\t\tThis child is instanceof typeTypeOrVoid / JavaGrammarParser.TypeTypeOrVoidContext");
//			}
//		}
		
		System.out.println("ctx.getText(): "+ctx.getText());
		try {
			ParseTree parseTreeMethodDeclaration = getParseTreeReference( ctx );
			recursive( parseTreeMethodDeclaration );
		}
		catch( Exception e ) {
			System.out.println("\n\n"+e.getMessage()+"\n\n"+e.getStackTrace()+"\n\n");
		}
	}
	
	public ParseTree getParseTreeReference( ParserRuleContext prCtx ) throws Exception {
		ParseTree parent = prCtx.getParent();
		ParseTree thisNode = null;
		for( int i=0; i<parent.getChildCount(); i++ ) {
			System.out.println("parent.getChild("+i+"): " + parent.getChild(i).getText());
			if( Objects.equals(parent.getChild(i).getText() , prCtx.getText()) ) {
				ParseTree parseTreeMethodDeclaration = parent.getChild(i);
				System.out.println("\n\n\t\t\tFOUND PARSE TREE REF\n");
				thisNode = parseTreeMethodDeclaration;
			}
		}
		if( thisNode == null ) {
			throw new Exception("Couldn't find Parse Tree Reference.");
		}
		return thisNode;
	}
	
	public void recursive( ParseTree parseTree ) {
		for(int i=0; i<parseTree.getChildCount(); i++) { 
			if( parseTree.getChild(i) instanceof TerminalNode ) { 
				System.out.println("\t\tThis is terminal node: " + parseTree.getChild(i).getText() );
				buffer = buffer + parseTree.getChild(i).getText() + " ";
			}
			else {
				recursive( parseTree.getChild(i) );
			}
		}
	}
	
	public String getTextVersion( ParserRuleContext prCtx ) {
		if( prCtx == null ) {
			return "";
		}
		else {
			return prCtx.getText();
		} 
	}

	public String getOutputFileContent() {
		String outputFileContent = "InterpreterListener.buffer is equal to \"\"";
		// publiczna metoda zwracajaca zintepretowany String (z Javy na Matlaba)
		// inputFileContent -> outputFileContent
		if( Objects.equals(buffer,"") ) {
			outputFileContent = buffer;
		}
		return outputFileContent;
	}
}
