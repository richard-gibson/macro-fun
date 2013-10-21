package exp.examples

/**
 * User: Richard
 * Date: 21/10/13
 * Time: 21:55
 */
object MacroExamples extends App {

  def examples() {
    import exp.mcro.DefMacros._

    val debugString = "debug string"
    val a=1
    val b=2
    val pair = (a,b)

    debug(debugString)
    debug(a)
    debug(b+a)
    debug(b,a)
    debug(pair)
  }
  examples()
  }
