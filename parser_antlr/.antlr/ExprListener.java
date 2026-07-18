// Generated from c:/Programas/Universidad/Automatas II/Analizador Lex-Sin/parser_antlr/Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(ExprParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(ExprParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(ExprParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(ExprParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#codigo}.
	 * @param ctx the parse tree
	 */
	void enterCodigo(ExprParser.CodigoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#codigo}.
	 * @param ctx the parse tree
	 */
	void exitCodigo(ExprParser.CodigoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(ExprParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(ExprParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(ExprParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(ExprParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#importar_libreria}.
	 * @param ctx the parse tree
	 */
	void enterImportar_libreria(ExprParser.Importar_libreriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#importar_libreria}.
	 * @param ctx the parse tree
	 */
	void exitImportar_libreria(ExprParser.Importar_libreriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#declarar_func}.
	 * @param ctx the parse tree
	 */
	void enterDeclarar_func(ExprParser.Declarar_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#declarar_func}.
	 * @param ctx the parse tree
	 */
	void exitDeclarar_func(ExprParser.Declarar_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(ExprParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(ExprParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#paremetros}.
	 * @param ctx the parse tree
	 */
	void enterParemetros(ExprParser.ParemetrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#paremetros}.
	 * @param ctx the parse tree
	 */
	void exitParemetros(ExprParser.ParemetrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(ExprParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(ExprParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#llamada_funcion}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_funcion(ExprParser.Llamada_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#llamada_funcion}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_funcion(ExprParser.Llamada_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(ExprParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(ExprParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#cond_if}.
	 * @param ctx the parse tree
	 */
	void enterCond_if(ExprParser.Cond_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#cond_if}.
	 * @param ctx the parse tree
	 */
	void exitCond_if(ExprParser.Cond_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#cond_while}.
	 * @param ctx the parse tree
	 */
	void enterCond_while(ExprParser.Cond_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#cond_while}.
	 * @param ctx the parse tree
	 */
	void exitCond_while(ExprParser.Cond_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#cond_for}.
	 * @param ctx the parse tree
	 */
	void enterCond_for(ExprParser.Cond_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#cond_for}.
	 * @param ctx the parse tree
	 */
	void exitCond_for(ExprParser.Cond_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#cond_foreach}.
	 * @param ctx the parse tree
	 */
	void enterCond_foreach(ExprParser.Cond_foreachContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#cond_foreach}.
	 * @param ctx the parse tree
	 */
	void exitCond_foreach(ExprParser.Cond_foreachContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#cond_switch}.
	 * @param ctx the parse tree
	 */
	void enterCond_switch(ExprParser.Cond_switchContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#cond_switch}.
	 * @param ctx the parse tree
	 */
	void exitCond_switch(ExprParser.Cond_switchContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#manejo_excepcion}.
	 * @param ctx the parse tree
	 */
	void enterManejo_excepcion(ExprParser.Manejo_excepcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#manejo_excepcion}.
	 * @param ctx the parse tree
	 */
	void exitManejo_excepcion(ExprParser.Manejo_excepcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#control_salto}.
	 * @param ctx the parse tree
	 */
	void enterControl_salto(ExprParser.Control_saltoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#control_salto}.
	 * @param ctx the parse tree
	 */
	void exitControl_salto(ExprParser.Control_saltoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(ExprParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(ExprParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(ExprParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(ExprParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expr_incremento}.
	 * @param ctx the parse tree
	 */
	void enterExpr_incremento(ExprParser.Expr_incrementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expr_incremento}.
	 * @param ctx the parse tree
	 */
	void exitExpr_incremento(ExprParser.Expr_incrementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#declarar_var}.
	 * @param ctx the parse tree
	 */
	void enterDeclarar_var(ExprParser.Declarar_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#declarar_var}.
	 * @param ctx the parse tree
	 */
	void exitDeclarar_var(ExprParser.Declarar_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#declarar_array}.
	 * @param ctx the parse tree
	 */
	void enterDeclarar_array(ExprParser.Declarar_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#declarar_array}.
	 * @param ctx the parse tree
	 */
	void exitDeclarar_array(ExprParser.Declarar_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#elementos}.
	 * @param ctx the parse tree
	 */
	void enterElementos(ExprParser.ElementosContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#elementos}.
	 * @param ctx the parse tree
	 */
	void exitElementos(ExprParser.ElementosContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#elemento}.
	 * @param ctx the parse tree
	 */
	void enterElemento(ExprParser.ElementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#elemento}.
	 * @param ctx the parse tree
	 */
	void exitElemento(ExprParser.ElementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#acceso_arreglo}.
	 * @param ctx the parse tree
	 */
	void enterAcceso_arreglo(ExprParser.Acceso_arregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#acceso_arreglo}.
	 * @param ctx the parse tree
	 */
	void exitAcceso_arreglo(ExprParser.Acceso_arregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#ternario}.
	 * @param ctx the parse tree
	 */
	void enterTernario(ExprParser.TernarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#ternario}.
	 * @param ctx the parse tree
	 */
	void exitTernario(ExprParser.TernarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expr_matematica}.
	 * @param ctx the parse tree
	 */
	void enterExpr_matematica(ExprParser.Expr_matematicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expr_matematica}.
	 * @param ctx the parse tree
	 */
	void exitExpr_matematica(ExprParser.Expr_matematicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#echo}.
	 * @param ctx the parse tree
	 */
	void enterEcho(ExprParser.EchoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#echo}.
	 * @param ctx the parse tree
	 */
	void exitEcho(ExprParser.EchoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#declarar_clase}.
	 * @param ctx the parse tree
	 */
	void enterDeclarar_clase(ExprParser.Declarar_claseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#declarar_clase}.
	 * @param ctx the parse tree
	 */
	void exitDeclarar_clase(ExprParser.Declarar_claseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#miembro_clase}.
	 * @param ctx the parse tree
	 */
	void enterMiembro_clase(ExprParser.Miembro_claseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#miembro_clase}.
	 * @param ctx the parse tree
	 */
	void exitMiembro_clase(ExprParser.Miembro_claseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#modificador}.
	 * @param ctx the parse tree
	 */
	void enterModificador(ExprParser.ModificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#modificador}.
	 * @param ctx the parse tree
	 */
	void exitModificador(ExprParser.ModificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#instanciacion}.
	 * @param ctx the parse tree
	 */
	void enterInstanciacion(ExprParser.InstanciacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#instanciacion}.
	 * @param ctx the parse tree
	 */
	void exitInstanciacion(ExprParser.InstanciacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#acceso_miembro}.
	 * @param ctx the parse tree
	 */
	void enterAcceso_miembro(ExprParser.Acceso_miembroContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#acceso_miembro}.
	 * @param ctx the parse tree
	 */
	void exitAcceso_miembro(ExprParser.Acceso_miembroContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#acceso_estatico}.
	 * @param ctx the parse tree
	 */
	void enterAcceso_estatico(ExprParser.Acceso_estaticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#acceso_estatico}.
	 * @param ctx the parse tree
	 */
	void exitAcceso_estatico(ExprParser.Acceso_estaticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(ExprParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(ExprParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#valor_comparable}.
	 * @param ctx the parse tree
	 */
	void enterValor_comparable(ExprParser.Valor_comparableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#valor_comparable}.
	 * @param ctx the parse tree
	 */
	void exitValor_comparable(ExprParser.Valor_comparableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#op_aritmeticos}.
	 * @param ctx the parse tree
	 */
	void enterOp_aritmeticos(ExprParser.Op_aritmeticosContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#op_aritmeticos}.
	 * @param ctx the parse tree
	 */
	void exitOp_aritmeticos(ExprParser.Op_aritmeticosContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#op_comparacion}.
	 * @param ctx the parse tree
	 */
	void enterOp_comparacion(ExprParser.Op_comparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#op_comparacion}.
	 * @param ctx the parse tree
	 */
	void exitOp_comparacion(ExprParser.Op_comparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#op_asignacion}.
	 * @param ctx the parse tree
	 */
	void enterOp_asignacion(ExprParser.Op_asignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#op_asignacion}.
	 * @param ctx the parse tree
	 */
	void exitOp_asignacion(ExprParser.Op_asignacionContext ctx);
}