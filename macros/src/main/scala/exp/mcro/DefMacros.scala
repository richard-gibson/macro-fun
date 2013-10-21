package exp.mcro

import scala.reflect.macros.Context
import scala.language.experimental.macros

/**
 * User: Richard
 * Date: 21/10/13
 * Time: 21:13
 */
object DefMacros {
  def debug(param:Any): Unit = macro debugImpl

  def debugImpl(c: Context)(param: c.Expr[Any]): c.Expr[Unit] = {
    import c.universe._
    //get name of param as string
    val paramRep = show(param.tree)
    //create a tree representing a constant String
    val paramRepTree = Literal(Constant(paramRep))
    val paramRepExpr = c.Expr[String](paramRepTree)

    reify { println(paramRepExpr.splice+" = "+param.splice) }
  }


}
