// Generated from C:/Users/bshelor24/Documents/Taylor 2018-19/lang-struct/A02\AntlrActions.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AntlrActionsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AntlrActionsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AntlrActionsParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(AntlrActionsParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrActionsParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(AntlrActionsParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrActionsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(AntlrActionsParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrActionsParser#terms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerms(AntlrActionsParser.TermsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrActionsParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(AntlrActionsParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrActionsParser#factors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactors(AntlrActionsParser.FactorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AntlrActionsParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(AntlrActionsParser.FactorContext ctx);
}