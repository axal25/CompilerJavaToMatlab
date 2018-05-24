// Generated from JavaGrammar.g4 by ANTLR 4.4

	package javagrammar;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaGrammarParser}.
 */
public interface JavaGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(@NotNull JavaGrammarParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(@NotNull JavaGrammarParser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#methodPermissionModifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodPermissionModifier(@NotNull JavaGrammarParser.MethodPermissionModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#methodPermissionModifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodPermissionModifier(@NotNull JavaGrammarParser.MethodPermissionModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(@NotNull JavaGrammarParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(@NotNull JavaGrammarParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#loopBlock}.
	 * @param ctx the parse tree
	 */
	void enterLoopBlock(@NotNull JavaGrammarParser.LoopBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#loopBlock}.
	 * @param ctx the parse tree
	 */
	void exitLoopBlock(@NotNull JavaGrammarParser.LoopBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#methodReturnType}.
	 * @param ctx the parse tree
	 */
	void enterMethodReturnType(@NotNull JavaGrammarParser.MethodReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#methodReturnType}.
	 * @param ctx the parse tree
	 */
	void exitMethodReturnType(@NotNull JavaGrammarParser.MethodReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterStatementNoShortIf(@NotNull JavaGrammarParser.StatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitStatementNoShortIf(@NotNull JavaGrammarParser.StatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lf_primary(@NotNull JavaGrammarParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lf_primary(@NotNull JavaGrammarParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(@NotNull JavaGrammarParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(@NotNull JavaGrammarParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(@NotNull JavaGrammarParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(@NotNull JavaGrammarParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull JavaGrammarParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull JavaGrammarParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterVariableType(@NotNull JavaGrammarParser.VariableTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitVariableType(@NotNull JavaGrammarParser.VariableTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lf_unannClassOrInterfaceType(@NotNull JavaGrammarParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lf_unannClassOrInterfaceType(@NotNull JavaGrammarParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(@NotNull JavaGrammarParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(@NotNull JavaGrammarParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lfno_primary(@NotNull JavaGrammarParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lfno_primary(@NotNull JavaGrammarParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(@NotNull JavaGrammarParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(@NotNull JavaGrammarParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(@NotNull JavaGrammarParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(@NotNull JavaGrammarParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull JavaGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull JavaGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(@NotNull JavaGrammarParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(@NotNull JavaGrammarParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(@NotNull JavaGrammarParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(@NotNull JavaGrammarParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lfno_classOrInterfaceType(@NotNull JavaGrammarParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lfno_classOrInterfaceType(@NotNull JavaGrammarParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void enterDimExprs(@NotNull JavaGrammarParser.DimExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void exitDimExprs(@NotNull JavaGrammarParser.DimExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(@NotNull JavaGrammarParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(@NotNull JavaGrammarParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary(@NotNull JavaGrammarParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary(@NotNull JavaGrammarParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(@NotNull JavaGrammarParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(@NotNull JavaGrammarParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#numberEquivalent}.
	 * @param ctx the parse tree
	 */
	void enterNumberEquivalent(@NotNull JavaGrammarParser.NumberEquivalentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#numberEquivalent}.
	 * @param ctx the parse tree
	 */
	void exitNumberEquivalent(@NotNull JavaGrammarParser.NumberEquivalentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(@NotNull JavaGrammarParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(@NotNull JavaGrammarParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionName(@NotNull JavaGrammarParser.ExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionName(@NotNull JavaGrammarParser.ExpressionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lf_primary(@NotNull JavaGrammarParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lf_primary(@NotNull JavaGrammarParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#unannType}.
	 * @param ctx the parse tree
	 */
	void enterUnannType(@NotNull JavaGrammarParser.UnannTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#unannType}.
	 * @param ctx the parse tree
	 */
	void exitUnannType(@NotNull JavaGrammarParser.UnannTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression_lf_postfixExpression(@NotNull JavaGrammarParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression_lf_postfixExpression(@NotNull JavaGrammarParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#whileDoStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileDoStatement(@NotNull JavaGrammarParser.WhileDoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#whileDoStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileDoStatement(@NotNull JavaGrammarParser.WhileDoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(@NotNull JavaGrammarParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(@NotNull JavaGrammarParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreationExpression(@NotNull JavaGrammarParser.ArrayCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreationExpression(@NotNull JavaGrammarParser.ArrayCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(@NotNull JavaGrammarParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(@NotNull JavaGrammarParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void enterUnannArrayType(@NotNull JavaGrammarParser.UnannArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void exitUnannArrayType(@NotNull JavaGrammarParser.UnannArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(@NotNull JavaGrammarParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(@NotNull JavaGrammarParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull JavaGrammarParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull JavaGrammarParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classTypeModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassTypeModifier(@NotNull JavaGrammarParser.ClassTypeModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classTypeModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassTypeModifier(@NotNull JavaGrammarParser.ClassTypeModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(@NotNull JavaGrammarParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(@NotNull JavaGrammarParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#operatorsBitwise}.
	 * @param ctx the parse tree
	 */
	void enterOperatorsBitwise(@NotNull JavaGrammarParser.OperatorsBitwiseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#operatorsBitwise}.
	 * @param ctx the parse tree
	 */
	void exitOperatorsBitwise(@NotNull JavaGrammarParser.OperatorsBitwiseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(@NotNull JavaGrammarParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(@NotNull JavaGrammarParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(@NotNull JavaGrammarParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(@NotNull JavaGrammarParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(@NotNull JavaGrammarParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(@NotNull JavaGrammarParser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(@NotNull JavaGrammarParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(@NotNull JavaGrammarParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(@NotNull JavaGrammarParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(@NotNull JavaGrammarParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lf_primary(@NotNull JavaGrammarParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lf_primary(@NotNull JavaGrammarParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(@NotNull JavaGrammarParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(@NotNull JavaGrammarParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpression(@NotNull JavaGrammarParser.ArithmeticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpression(@NotNull JavaGrammarParser.ArithmeticExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(@NotNull JavaGrammarParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(@NotNull JavaGrammarParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(@NotNull JavaGrammarParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(@NotNull JavaGrammarParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#keywordsType}.
	 * @param ctx the parse tree
	 */
	void enterKeywordsType(@NotNull JavaGrammarParser.KeywordsTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#keywordsType}.
	 * @param ctx the parse tree
	 */
	void exitKeywordsType(@NotNull JavaGrammarParser.KeywordsTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull JavaGrammarParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull JavaGrammarParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lfno_primary(@NotNull JavaGrammarParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lfno_primary(@NotNull JavaGrammarParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(@NotNull JavaGrammarParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(@NotNull JavaGrammarParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(@NotNull JavaGrammarParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(@NotNull JavaGrammarParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#postDecrementationExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementationExpression(@NotNull JavaGrammarParser.PostDecrementationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#postDecrementationExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementationExpression(@NotNull JavaGrammarParser.PostDecrementationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(@NotNull JavaGrammarParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(@NotNull JavaGrammarParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(@NotNull JavaGrammarParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lfno_unannClassOrInterfaceType(@NotNull JavaGrammarParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(@NotNull JavaGrammarParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(@NotNull JavaGrammarParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(@NotNull JavaGrammarParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(@NotNull JavaGrammarParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lf_classOrInterfaceType(@NotNull JavaGrammarParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lf_classOrInterfaceType(@NotNull JavaGrammarParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(@NotNull JavaGrammarParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(@NotNull JavaGrammarParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull JavaGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull JavaGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(@NotNull JavaGrammarParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(@NotNull JavaGrammarParser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#expressionBitwise}.
	 * @param ctx the parse tree
	 */
	void enterExpressionBitwise(@NotNull JavaGrammarParser.ExpressionBitwiseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#expressionBitwise}.
	 * @param ctx the parse tree
	 */
	void exitExpressionBitwise(@NotNull JavaGrammarParser.ExpressionBitwiseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(@NotNull JavaGrammarParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(@NotNull JavaGrammarParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(@NotNull JavaGrammarParser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(@NotNull JavaGrammarParser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(@NotNull JavaGrammarParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(@NotNull JavaGrammarParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(@NotNull JavaGrammarParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(@NotNull JavaGrammarParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_arrayAccess(@NotNull JavaGrammarParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_arrayAccess(@NotNull JavaGrammarParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression(@NotNull JavaGrammarParser.PostDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression(@NotNull JavaGrammarParser.PostDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(@NotNull JavaGrammarParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(@NotNull JavaGrammarParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(@NotNull JavaGrammarParser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(@NotNull JavaGrammarParser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterForStatementNoShortIf(@NotNull JavaGrammarParser.ForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitForStatementNoShortIf(@NotNull JavaGrammarParser.ForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lfno_classOrInterfaceType(@NotNull JavaGrammarParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lfno_classOrInterfaceType(@NotNull JavaGrammarParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression(@NotNull JavaGrammarParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression(@NotNull JavaGrammarParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#preIncrementationExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementationExpression(@NotNull JavaGrammarParser.PreIncrementationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#preIncrementationExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementationExpression(@NotNull JavaGrammarParser.PreIncrementationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(@NotNull JavaGrammarParser.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(@NotNull JavaGrammarParser.MethodDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(@NotNull JavaGrammarParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(@NotNull JavaGrammarParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpression(@NotNull JavaGrammarParser.PreDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpression(@NotNull JavaGrammarParser.PreDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lfno_primary(@NotNull JavaGrammarParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lfno_primary(@NotNull JavaGrammarParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorList(@NotNull JavaGrammarParser.VariableDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorList(@NotNull JavaGrammarParser.VariableDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#logicalEquivalent}.
	 * @param ctx the parse tree
	 */
	void enterLogicalEquivalent(@NotNull JavaGrammarParser.LogicalEquivalentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#logicalEquivalent}.
	 * @param ctx the parse tree
	 */
	void exitLogicalEquivalent(@NotNull JavaGrammarParser.LogicalEquivalentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(@NotNull JavaGrammarParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(@NotNull JavaGrammarParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerList(@NotNull JavaGrammarParser.VariableInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerList(@NotNull JavaGrammarParser.VariableInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(@NotNull JavaGrammarParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(@NotNull JavaGrammarParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(@NotNull JavaGrammarParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(@NotNull JavaGrammarParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(@NotNull JavaGrammarParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(@NotNull JavaGrammarParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(@NotNull JavaGrammarParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(@NotNull JavaGrammarParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void enterDimExpr(@NotNull JavaGrammarParser.DimExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void exitDimExpr(@NotNull JavaGrammarParser.DimExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#preDecrementationExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementationExpression(@NotNull JavaGrammarParser.PreDecrementationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#preDecrementationExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementationExpression(@NotNull JavaGrammarParser.PreDecrementationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lf_unannClassOrInterfaceType(@NotNull JavaGrammarParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lf_unannClassOrInterfaceType(@NotNull JavaGrammarParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(@NotNull JavaGrammarParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(@NotNull JavaGrammarParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(@NotNull JavaGrammarParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(@NotNull JavaGrammarParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(@NotNull JavaGrammarParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(@NotNull JavaGrammarParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatementNoShortIf(@NotNull JavaGrammarParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatementNoShortIf(@NotNull JavaGrammarParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(@NotNull JavaGrammarParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(@NotNull JavaGrammarParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(@NotNull JavaGrammarParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(@NotNull JavaGrammarParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(@NotNull JavaGrammarParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(@NotNull JavaGrammarParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_arrayAccess(@NotNull JavaGrammarParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_arrayAccess(@NotNull JavaGrammarParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#methodDeclaraction}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaraction(@NotNull JavaGrammarParser.MethodDeclaractionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#methodDeclaraction}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaraction(@NotNull JavaGrammarParser.MethodDeclaractionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatement(@NotNull JavaGrammarParser.EnhancedForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatement(@NotNull JavaGrammarParser.EnhancedForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(@NotNull JavaGrammarParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(@NotNull JavaGrammarParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(@NotNull JavaGrammarParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(@NotNull JavaGrammarParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classPermissionModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassPermissionModifier(@NotNull JavaGrammarParser.ClassPermissionModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classPermissionModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassPermissionModifier(@NotNull JavaGrammarParser.ClassPermissionModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(@NotNull JavaGrammarParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(@NotNull JavaGrammarParser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(@NotNull JavaGrammarParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(@NotNull JavaGrammarParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void enterUnannPrimitiveType(@NotNull JavaGrammarParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void exitUnannPrimitiveType(@NotNull JavaGrammarParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatementNoShortIf(@NotNull JavaGrammarParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatementNoShortIf(@NotNull JavaGrammarParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(@NotNull JavaGrammarParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(@NotNull JavaGrammarParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary(@NotNull JavaGrammarParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary(@NotNull JavaGrammarParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassOrInterfaceType(@NotNull JavaGrammarParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassOrInterfaceType(@NotNull JavaGrammarParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(@NotNull JavaGrammarParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(@NotNull JavaGrammarParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeLiteralArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeLiteralArguments(@NotNull JavaGrammarParser.TypeLiteralArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeLiteralArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeLiteralArguments(@NotNull JavaGrammarParser.TypeLiteralArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression_lf_postfixExpression(@NotNull JavaGrammarParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression_lf_postfixExpression(@NotNull JavaGrammarParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull JavaGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull JavaGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType(@NotNull JavaGrammarParser.InterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType(@NotNull JavaGrammarParser.InterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(@NotNull JavaGrammarParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(@NotNull JavaGrammarParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lf_primary(@NotNull JavaGrammarParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lf_primary(@NotNull JavaGrammarParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(@NotNull JavaGrammarParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(@NotNull JavaGrammarParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannReferenceType(@NotNull JavaGrammarParser.UnannReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannReferenceType(@NotNull JavaGrammarParser.UnannReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#methodTypeModifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodTypeModifier(@NotNull JavaGrammarParser.MethodTypeModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#methodTypeModifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodTypeModifier(@NotNull JavaGrammarParser.MethodTypeModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lfno_unannClassOrInterfaceType(@NotNull JavaGrammarParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lfno_unannClassOrInterfaceType(@NotNull JavaGrammarParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull JavaGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull JavaGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lfno_primary(@NotNull JavaGrammarParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lfno_primary(@NotNull JavaGrammarParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lfno_primary(@NotNull JavaGrammarParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lfno_primary(@NotNull JavaGrammarParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(@NotNull JavaGrammarParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(@NotNull JavaGrammarParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#logicalConst}.
	 * @param ctx the parse tree
	 */
	void enterLogicalConst(@NotNull JavaGrammarParser.LogicalConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#logicalConst}.
	 * @param ctx the parse tree
	 */
	void exitLogicalConst(@NotNull JavaGrammarParser.LogicalConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lf_classOrInterfaceType(@NotNull JavaGrammarParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lf_classOrInterfaceType(@NotNull JavaGrammarParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(@NotNull JavaGrammarParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(@NotNull JavaGrammarParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull JavaGrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull JavaGrammarParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(@NotNull JavaGrammarParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(@NotNull JavaGrammarParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(@NotNull JavaGrammarParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(@NotNull JavaGrammarParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(@NotNull JavaGrammarParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(@NotNull JavaGrammarParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull JavaGrammarParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull JavaGrammarParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#postIncrementationExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementationExpression(@NotNull JavaGrammarParser.PostIncrementationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#postIncrementationExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementationExpression(@NotNull JavaGrammarParser.PostIncrementationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionList(@NotNull JavaGrammarParser.StatementExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionList(@NotNull JavaGrammarParser.StatementExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(@NotNull JavaGrammarParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(@NotNull JavaGrammarParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(@NotNull JavaGrammarParser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(@NotNull JavaGrammarParser.LeftHandSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatement(@NotNull JavaGrammarParser.BasicForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatement(@NotNull JavaGrammarParser.BasicForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(@NotNull JavaGrammarParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(@NotNull JavaGrammarParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lf_primary(@NotNull JavaGrammarParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lf_primary(@NotNull JavaGrammarParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference(@NotNull JavaGrammarParser.MethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference(@NotNull JavaGrammarParser.MethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(@NotNull JavaGrammarParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(@NotNull JavaGrammarParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(@NotNull JavaGrammarParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(@NotNull JavaGrammarParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(@NotNull JavaGrammarParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(@NotNull JavaGrammarParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(@NotNull JavaGrammarParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(@NotNull JavaGrammarParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(@NotNull JavaGrammarParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(@NotNull JavaGrammarParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#statementWithoutTrailingSubStatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithoutTrailingSubStatement(@NotNull JavaGrammarParser.StatementWithoutTrailingSubStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#statementWithoutTrailingSubStatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithoutTrailingSubStatement(@NotNull JavaGrammarParser.StatementWithoutTrailingSubStatementContext ctx);
}