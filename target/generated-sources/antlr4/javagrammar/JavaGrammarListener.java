// Generated from JavaGrammar.g4 by ANTLR 4.7.1

	package javagrammar;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaGrammarParser}.
 */
public interface JavaGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(JavaGrammarParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(JavaGrammarParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(JavaGrammarParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(JavaGrammarParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#methodPermissionModifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodPermissionModifier(JavaGrammarParser.MethodPermissionModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#methodPermissionModifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodPermissionModifier(JavaGrammarParser.MethodPermissionModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#methodTypeModifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodTypeModifier(JavaGrammarParser.MethodTypeModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#methodTypeModifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodTypeModifier(JavaGrammarParser.MethodTypeModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#methodReturnType}.
	 * @param ctx the parse tree
	 */
	void enterMethodReturnType(JavaGrammarParser.MethodReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#methodReturnType}.
	 * @param ctx the parse tree
	 */
	void exitMethodReturnType(JavaGrammarParser.MethodReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(JavaGrammarParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(JavaGrammarParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JavaGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JavaGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#loopStatment}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatment(JavaGrammarParser.LoopStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#loopStatment}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatment(JavaGrammarParser.LoopStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(JavaGrammarParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(JavaGrammarParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(JavaGrammarParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(JavaGrammarParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#numberEquivalent}.
	 * @param ctx the parse tree
	 */
	void enterNumberEquivalent(JavaGrammarParser.NumberEquivalentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#numberEquivalent}.
	 * @param ctx the parse tree
	 */
	void exitNumberEquivalent(JavaGrammarParser.NumberEquivalentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#logicalConst}.
	 * @param ctx the parse tree
	 */
	void enterLogicalConst(JavaGrammarParser.LogicalConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#logicalConst}.
	 * @param ctx the parse tree
	 */
	void exitLogicalConst(JavaGrammarParser.LogicalConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#logicalEquivalent}.
	 * @param ctx the parse tree
	 */
	void enterLogicalEquivalent(JavaGrammarParser.LogicalEquivalentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#logicalEquivalent}.
	 * @param ctx the parse tree
	 */
	void exitLogicalEquivalent(JavaGrammarParser.LogicalEquivalentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpression(JavaGrammarParser.ArithmeticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpression(JavaGrammarParser.ArithmeticExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(JavaGrammarParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(JavaGrammarParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(JavaGrammarParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(JavaGrammarParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JavaGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JavaGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#loopBlock}.
	 * @param ctx the parse tree
	 */
	void enterLoopBlock(JavaGrammarParser.LoopBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#loopBlock}.
	 * @param ctx the parse tree
	 */
	void exitLoopBlock(JavaGrammarParser.LoopBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(JavaGrammarParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(JavaGrammarParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(JavaGrammarParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(JavaGrammarParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#whileDoStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileDoStatement(JavaGrammarParser.WhileDoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#whileDoStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileDoStatement(JavaGrammarParser.WhileDoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(JavaGrammarParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(JavaGrammarParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JavaGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JavaGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(JavaGrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(JavaGrammarParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(JavaGrammarParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(JavaGrammarParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(JavaGrammarParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(JavaGrammarParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(JavaGrammarParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(JavaGrammarParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(JavaGrammarParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(JavaGrammarParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatement(JavaGrammarParser.EnhancedForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatement(JavaGrammarParser.EnhancedForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(JavaGrammarParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(JavaGrammarParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(JavaGrammarParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(JavaGrammarParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(JavaGrammarParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(JavaGrammarParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(JavaGrammarParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(JavaGrammarParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#operatorsBitwise}.
	 * @param ctx the parse tree
	 */
	void enterOperatorsBitwise(JavaGrammarParser.OperatorsBitwiseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#operatorsBitwise}.
	 * @param ctx the parse tree
	 */
	void exitOperatorsBitwise(JavaGrammarParser.OperatorsBitwiseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#expressionBitwise}.
	 * @param ctx the parse tree
	 */
	void enterExpressionBitwise(JavaGrammarParser.ExpressionBitwiseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#expressionBitwise}.
	 * @param ctx the parse tree
	 */
	void exitExpressionBitwise(JavaGrammarParser.ExpressionBitwiseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#stringNullAssignment}.
	 * @param ctx the parse tree
	 */
	void enterStringNullAssignment(JavaGrammarParser.StringNullAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#stringNullAssignment}.
	 * @param ctx the parse tree
	 */
	void exitStringNullAssignment(JavaGrammarParser.StringNullAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#preIncrementationExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementationExpression(JavaGrammarParser.PreIncrementationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#preIncrementationExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementationExpression(JavaGrammarParser.PreIncrementationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#postIncrementationExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementationExpression(JavaGrammarParser.PostIncrementationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#postIncrementationExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementationExpression(JavaGrammarParser.PostIncrementationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#preDecrementationExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementationExpression(JavaGrammarParser.PreDecrementationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#preDecrementationExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementationExpression(JavaGrammarParser.PreDecrementationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#postDecrementationExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementationExpression(JavaGrammarParser.PostDecrementationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#postDecrementationExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementationExpression(JavaGrammarParser.PostDecrementationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterVariableType(JavaGrammarParser.VariableTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitVariableType(JavaGrammarParser.VariableTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#keywordsType}.
	 * @param ctx the parse tree
	 */
	void enterKeywordsType(JavaGrammarParser.KeywordsTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#keywordsType}.
	 * @param ctx the parse tree
	 */
	void exitKeywordsType(JavaGrammarParser.KeywordsTypeContext ctx);
}