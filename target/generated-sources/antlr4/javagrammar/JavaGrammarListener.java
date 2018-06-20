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
	 * Enter a parse tree produced by {@link JavaGrammarParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(@NotNull JavaGrammarParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(@NotNull JavaGrammarParser.MemberDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link JavaGrammarParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(@NotNull JavaGrammarParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(@NotNull JavaGrammarParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(@NotNull JavaGrammarParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(@NotNull JavaGrammarParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(@NotNull JavaGrammarParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(@NotNull JavaGrammarParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(@NotNull JavaGrammarParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(@NotNull JavaGrammarParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(@NotNull JavaGrammarParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(@NotNull JavaGrammarParser.GenericInterfaceMethodDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(@NotNull JavaGrammarParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(@NotNull JavaGrammarParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(@NotNull JavaGrammarParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(@NotNull JavaGrammarParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstantRest(@NotNull JavaGrammarParser.AnnotationConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstantRest(@NotNull JavaGrammarParser.AnnotationConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(@NotNull JavaGrammarParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(@NotNull JavaGrammarParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(@NotNull JavaGrammarParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(@NotNull JavaGrammarParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull JavaGrammarParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull JavaGrammarParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest(@NotNull JavaGrammarParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest(@NotNull JavaGrammarParser.AnnotationTypeElementRestContext ctx);
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
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(@NotNull JavaGrammarParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(@NotNull JavaGrammarParser.TypeBoundContext ctx);
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
	 * Enter a parse tree produced by {@link JavaGrammarParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(@NotNull JavaGrammarParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(@NotNull JavaGrammarParser.MethodCallContext ctx);
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
	 * Enter a parse tree produced by {@link JavaGrammarParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(@NotNull JavaGrammarParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(@NotNull JavaGrammarParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(@NotNull JavaGrammarParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(@NotNull JavaGrammarParser.InterfaceBodyDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link JavaGrammarParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(@NotNull JavaGrammarParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(@NotNull JavaGrammarParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(@NotNull JavaGrammarParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(@NotNull JavaGrammarParser.TypeParametersContext ctx);
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
	 * Enter a parse tree produced by {@link JavaGrammarParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest(@NotNull JavaGrammarParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest(@NotNull JavaGrammarParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(@NotNull JavaGrammarParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(@NotNull JavaGrammarParser.CatchClauseContext ctx);
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
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(@NotNull JavaGrammarParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(@NotNull JavaGrammarParser.TypeListContext ctx);
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
	 * Enter a parse tree produced by {@link JavaGrammarParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(@NotNull JavaGrammarParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(@NotNull JavaGrammarParser.CreatedNameContext ctx);
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
	 * Enter a parse tree produced by {@link JavaGrammarParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(@NotNull JavaGrammarParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(@NotNull JavaGrammarParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(@NotNull JavaGrammarParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(@NotNull JavaGrammarParser.AnnotationContext ctx);
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
	 * Enter a parse tree produced by {@link JavaGrammarParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(@NotNull JavaGrammarParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(@NotNull JavaGrammarParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(@NotNull JavaGrammarParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(@NotNull JavaGrammarParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(@NotNull JavaGrammarParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(@NotNull JavaGrammarParser.ArrayCreatorRestContext ctx);
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
	 * Enter a parse tree produced by {@link JavaGrammarParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(@NotNull JavaGrammarParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(@NotNull JavaGrammarParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(@NotNull JavaGrammarParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(@NotNull JavaGrammarParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(@NotNull JavaGrammarParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(@NotNull JavaGrammarParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(@NotNull JavaGrammarParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(@NotNull JavaGrammarParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(@NotNull JavaGrammarParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(@NotNull JavaGrammarParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(@NotNull JavaGrammarParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(@NotNull JavaGrammarParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(@NotNull JavaGrammarParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(@NotNull JavaGrammarParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(@NotNull JavaGrammarParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(@NotNull JavaGrammarParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(@NotNull JavaGrammarParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(@NotNull JavaGrammarParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(@NotNull JavaGrammarParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(@NotNull JavaGrammarParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(@NotNull JavaGrammarParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(@NotNull JavaGrammarParser.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(@NotNull JavaGrammarParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(@NotNull JavaGrammarParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(@NotNull JavaGrammarParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(@NotNull JavaGrammarParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(@NotNull JavaGrammarParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(@NotNull JavaGrammarParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(@NotNull JavaGrammarParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(@NotNull JavaGrammarParser.ElementValuePairContext ctx);
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
	 * Enter a parse tree produced by {@link JavaGrammarParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(@NotNull JavaGrammarParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(@NotNull JavaGrammarParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(@NotNull JavaGrammarParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(@NotNull JavaGrammarParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeTypeOrVoid(@NotNull JavaGrammarParser.TypeTypeOrVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeTypeOrVoid(@NotNull JavaGrammarParser.TypeTypeOrVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(@NotNull JavaGrammarParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(@NotNull JavaGrammarParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(@NotNull JavaGrammarParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(@NotNull JavaGrammarParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(@NotNull JavaGrammarParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(@NotNull JavaGrammarParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(@NotNull JavaGrammarParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(@NotNull JavaGrammarParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(@NotNull JavaGrammarParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(@NotNull JavaGrammarParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(@NotNull JavaGrammarParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(@NotNull JavaGrammarParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(@NotNull JavaGrammarParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(@NotNull JavaGrammarParser.AnnotationTypeDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link JavaGrammarParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodRest(@NotNull JavaGrammarParser.AnnotationMethodRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodRest(@NotNull JavaGrammarParser.AnnotationMethodRestContext ctx);
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
	 * Enter a parse tree produced by {@link JavaGrammarParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalTypeDeclaration(@NotNull JavaGrammarParser.LocalTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalTypeDeclaration(@NotNull JavaGrammarParser.LocalTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(@NotNull JavaGrammarParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(@NotNull JavaGrammarParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(@NotNull JavaGrammarParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(@NotNull JavaGrammarParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(@NotNull JavaGrammarParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(@NotNull JavaGrammarParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull JavaGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull JavaGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(@NotNull JavaGrammarParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(@NotNull JavaGrammarParser.MethodBodyContext ctx);
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
	 * Enter a parse tree produced by {@link JavaGrammarParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorDeclaration(@NotNull JavaGrammarParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorDeclaration(@NotNull JavaGrammarParser.GenericConstructorDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link JavaGrammarParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(@NotNull JavaGrammarParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(@NotNull JavaGrammarParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(@NotNull JavaGrammarParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(@NotNull JavaGrammarParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(@NotNull JavaGrammarParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(@NotNull JavaGrammarParser.InterfaceDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link JavaGrammarParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(@NotNull JavaGrammarParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(@NotNull JavaGrammarParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(@NotNull JavaGrammarParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(@NotNull JavaGrammarParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(@NotNull JavaGrammarParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(@NotNull JavaGrammarParser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(@NotNull JavaGrammarParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(@NotNull JavaGrammarParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(@NotNull JavaGrammarParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(@NotNull JavaGrammarParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(@NotNull JavaGrammarParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(@NotNull JavaGrammarParser.ElementValuePairsContext ctx);
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
	 * Enter a parse tree produced by {@link JavaGrammarParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(@NotNull JavaGrammarParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(@NotNull JavaGrammarParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(@NotNull JavaGrammarParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(@NotNull JavaGrammarParser.InterfaceMemberDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link JavaGrammarParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(@NotNull JavaGrammarParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(@NotNull JavaGrammarParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(@NotNull JavaGrammarParser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(@NotNull JavaGrammarParser.GenericMethodDeclarationContext ctx);
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
}