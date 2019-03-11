// Generated from C:/Users/bshelor24/Documents/Taylor 2018-19/lang-struct/A02\AntlrActions.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AntlrActionsParser}.
 */
public interface AntlrActionsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AntlrActionsParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(AntlrActionsParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrActionsParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(AntlrActionsParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrActionsParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(AntlrActionsParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrActionsParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(AntlrActionsParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrActionsParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(AntlrActionsParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrActionsParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(AntlrActionsParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrActionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(AntlrActionsParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrActionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(AntlrActionsParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrActionsParser#terms}.
	 * @param ctx the parse tree
	 */
	void enterTerms(AntlrActionsParser.TermsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrActionsParser#terms}.
	 * @param ctx the parse tree
	 */
	void exitTerms(AntlrActionsParser.TermsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrActionsParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(AntlrActionsParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrActionsParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(AntlrActionsParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrActionsParser#factors}.
	 * @param ctx the parse tree
	 */
	void enterFactors(AntlrActionsParser.FactorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrActionsParser#factors}.
	 * @param ctx the parse tree
	 */
	void exitFactors(AntlrActionsParser.FactorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrActionsParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(AntlrActionsParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrActionsParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(AntlrActionsParser.FactorContext ctx);
}