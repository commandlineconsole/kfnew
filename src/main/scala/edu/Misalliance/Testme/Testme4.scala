package edu.Misalliance.Testme

object Testme4 {

  def main(args: Array[String]): Unit = {

    val A = 20; val B = 10

    def checkif(A: Int): Any = if (A > 0) println(A) else println(20)
    def checksum(A:Int, B:Int): Any = if (A + B > 0) println(A + B) else println(A - B)
    def checkforloop(A: Int) : Any = for (A <- 1 to 2 ) println(A)
    def checkwhile(A: Int) : Any = while( A < B ) { println(A)}

    checkif(A)
    checksum(A, B)
    checkforloop(A)
    checkwhile(A)

  }
}

