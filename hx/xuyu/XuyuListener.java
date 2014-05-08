// Generated from Xuyu.g4 by ANTLR 4.2.2

	package hx.xuyu;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XuyuParser}.
 */
public interface XuyuListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link XuyuParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(@NotNull XuyuParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link XuyuParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(@NotNull XuyuParser.ValContext ctx);

	/**
	 * Enter a parse tree produced by {@link XuyuParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull XuyuParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link XuyuParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull XuyuParser.AssignContext ctx);

	/**
	 * Enter a parse tree produced by {@link XuyuParser#returnst}.
	 * @param ctx the parse tree
	 */
	void enterReturnst(@NotNull XuyuParser.ReturnstContext ctx);
	/**
	 * Exit a parse tree produced by {@link XuyuParser#returnst}.
	 * @param ctx the parse tree
	 */
	void exitReturnst(@NotNull XuyuParser.ReturnstContext ctx);

	/**
	 * Enter a parse tree produced by {@link XuyuParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(@NotNull XuyuParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link XuyuParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(@NotNull XuyuParser.VarContext ctx);

	/**
	 * Enter a parse tree produced by {@link XuyuParser#breaks}.
	 * @param ctx the parse tree
	 */
	void enterBreaks(@NotNull XuyuParser.BreaksContext ctx);
	/**
	 * Exit a parse tree produced by {@link XuyuParser#breaks}.
	 * @param ctx the parse tree
	 */
	void exitBreaks(@NotNull XuyuParser.BreaksContext ctx);

	/**
	 * Enter a parse tree produced by {@link XuyuParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull XuyuParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link XuyuParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull XuyuParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link XuyuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull XuyuParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link XuyuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull XuyuParser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link XuyuParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull XuyuParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link XuyuParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull XuyuParser.StatContext ctx);

	/**
	 * Enter a parse tree produced by {@link XuyuParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull XuyuParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link XuyuParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull XuyuParser.PrintContext ctx);

	/**
	 * Enter a parse tree produced by {@link XuyuParser#iterate}.
	 * @param ctx the parse tree
	 */
	void enterIterate(@NotNull XuyuParser.IterateContext ctx);
	/**
	 * Exit a parse tree produced by {@link XuyuParser#iterate}.
	 * @param ctx the parse tree
	 */
	void exitIterate(@NotNull XuyuParser.IterateContext ctx);

	/**
	 * Enter a parse tree produced by {@link XuyuParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(@NotNull XuyuParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link XuyuParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(@NotNull XuyuParser.InputContext ctx);

	/**
	 * Enter a parse tree produced by {@link XuyuParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(@NotNull XuyuParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link XuyuParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(@NotNull XuyuParser.FileContext ctx);

	/**
	 * Enter a parse tree produced by {@link XuyuParser#deffunc}.
	 * @param ctx the parse tree
	 */
	void enterDeffunc(@NotNull XuyuParser.DeffuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link XuyuParser#deffunc}.
	 * @param ctx the parse tree
	 */
	void exitDeffunc(@NotNull XuyuParser.DeffuncContext ctx);

	/**
	 * Enter a parse tree produced by {@link XuyuParser#inline}.
	 * @param ctx the parse tree
	 */
	void enterInline(@NotNull XuyuParser.InlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link XuyuParser#inline}.
	 * @param ctx the parse tree
	 */
	void exitInline(@NotNull XuyuParser.InlineContext ctx);

	/**
	 * Enter a parse tree produced by {@link XuyuParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(@NotNull XuyuParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link XuyuParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(@NotNull XuyuParser.ConditionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link XuyuParser#whiles}.
	 * @param ctx the parse tree
	 */
	void enterWhiles(@NotNull XuyuParser.WhilesContext ctx);
	/**
	 * Exit a parse tree produced by {@link XuyuParser#whiles}.
	 * @param ctx the parse tree
	 */
	void exitWhiles(@NotNull XuyuParser.WhilesContext ctx);

	/**
	 * Enter a parse tree produced by {@link XuyuParser#continues}.
	 * @param ctx the parse tree
	 */
	void enterContinues(@NotNull XuyuParser.ContinuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link XuyuParser#continues}.
	 * @param ctx the parse tree
	 */
	void exitContinues(@NotNull XuyuParser.ContinuesContext ctx);
}