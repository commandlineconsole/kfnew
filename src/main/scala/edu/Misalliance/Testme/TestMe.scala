package edu.Misalliance.Testme

object TestMe {
  def main(args: Array[String]): Unit = {

    /*

    if ()
    else

    match{
    }

    for () { }

    do () { }
    while ( )

    */

    val A = 10

    if (A > 0) println("this is possible")
    else println("this is impossible")


    val Number = 10

    Number match {
      case 1 => println("print 1")
      case 2 => println("print 2")
      case _ => println("print10")
    }

    for (k <- 1 to 10) {
      val S2 = k * 10
      println(S2)
    }

    for (x <- 1 to 15) {
      val valA = x + 10
      println(valA)
    }

    val x = 0
    while (x > 10) {
      println(x)
    }

    var x1 = 10

    do {
      println(x1)
      x1 -= 1
    } while (x1 >= 1)

  }
}
