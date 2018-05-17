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
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(JavaGrammarParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(JavaGrammarParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JavaGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JavaGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classPermissionModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassPermissionModifier(JavaGrammarParser.ClassPermissionModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classPermissionModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassPermissionModifier(JavaGrammarParser.ClassPermissionModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classTypeModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassTypeModifier(JavaGrammarParser.ClassTypeModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classTypeModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassTypeModifier(JavaGrammarParser.ClassTypeModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(JavaGrammarParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(JavaGrammarParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(JavaGrammarParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(JavaGrammarParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(JavaGrammarParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(JavaGrammarParser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#methodDeclaraction}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaraction(JavaGrammarParser.MethodDeclaractionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#methodDeclaraction}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaraction(JavaGrammarParser.MethodDeclaractionContext ctx);
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
	 * Enter a parse tree produced by {@link JavaGrammarParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterStatementNoShortIf(JavaGrammarParser.StatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitStatementNoShortIf(JavaGrammarParser.StatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterForStatementNoShortIf(JavaGrammarParser.ForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitForStatementNoShortIf(JavaGrammarParser.ForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatementNoShortIf(JavaGrammarParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatementNoShortIf(JavaGrammarParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatementNoShortIf(JavaGrammarParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatementNoShortIf(JavaGrammarParser.EnhancedForStatementNoShortIfContext ctx);
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
	 * Enter a parse tree produced by {@link JavaGrammarParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatement(JavaGrammarParser.BasicForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatement(JavaGrammarParser.BasicForStatementContext ctx);
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
	 * Enter a parse tree produced by {@link JavaGrammarParser#statementWithoutTrailingSubStatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithoutTrailingSubStatement(JavaGrammarParser.StatementWithoutTrailingSubStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#statementWithoutTrailingSubStatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithoutTrailingSubStatement(JavaGrammarParser.StatementWithoutTrailingSubStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(JavaGrammarParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(JavaGrammarParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression(JavaGrammarParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression(JavaGrammarParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(JavaGrammarParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(JavaGrammarParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(JavaGrammarParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(JavaGrammarParser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(JavaGrammarParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(JavaGrammarParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(JavaGrammarParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(JavaGrammarParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(JavaGrammarParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(JavaGrammarParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeLiteralArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeLiteralArguments(JavaGrammarParser.TypeLiteralArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeLiteralArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeLiteralArguments(JavaGrammarParser.TypeLiteralArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionName(JavaGrammarParser.ExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionName(JavaGrammarParser.ExpressionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(JavaGrammarParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(JavaGrammarParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(JavaGrammarParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(JavaGrammarParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(JavaGrammarParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(JavaGrammarParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(JavaGrammarParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(JavaGrammarParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorList(JavaGrammarParser.VariableDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorList(JavaGrammarParser.VariableDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(JavaGrammarParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(JavaGrammarParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(JavaGrammarParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(JavaGrammarParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(JavaGrammarParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(JavaGrammarParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(JavaGrammarParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(JavaGrammarParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerList(JavaGrammarParser.VariableInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerList(JavaGrammarParser.VariableInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(JavaGrammarParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(JavaGrammarParser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#unannType}.
	 * @param ctx the parse tree
	 */
	void enterUnannType(JavaGrammarParser.UnannTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#unannType}.
	 * @param ctx the parse tree
	 */
	void exitUnannType(JavaGrammarParser.UnannTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void enterUnannPrimitiveType(JavaGrammarParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void exitUnannPrimitiveType(JavaGrammarParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannReferenceType(JavaGrammarParser.UnannReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannReferenceType(JavaGrammarParser.UnannReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassOrInterfaceType(JavaGrammarParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassOrInterfaceType(JavaGrammarParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lfno_unannClassOrInterfaceType(JavaGrammarParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lfno_unannClassOrInterfaceType(JavaGrammarParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(JavaGrammarParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lfno_unannClassOrInterfaceType(JavaGrammarParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lf_unannClassOrInterfaceType(JavaGrammarParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lf_unannClassOrInterfaceType(JavaGrammarParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lf_unannClassOrInterfaceType(JavaGrammarParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lf_unannClassOrInterfaceType(JavaGrammarParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void enterUnannArrayType(JavaGrammarParser.UnannArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void exitUnannArrayType(JavaGrammarParser.UnannArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(JavaGrammarParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(JavaGrammarParser.LoopStatementContext ctx);
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