package edu.Misalliance.Testme

object CJ {

  def main(args: Array[String]): Unit = {

    // ************************

    val numbers = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(numbers(8))

    val numberset = Set(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)

    val hostPort = ("localhost", 80)

    println(hostPort._1)
    println(hostPort._2)

    hostPort match {
      case ("localhost", port) => println("localhost port case 1")
      case (host, port) => println("localhost port case 2")
    }

    println(hostPort)

    // ************************

    println(1 -> 2, 3 -> 4)

    println(Map(1 -> 2))

    println(Map("foo" -> "bar"))

    println("___________ " + Map(1 -> Map("foo" -> "bar")))

    // ********************

    def timesTwo(i: Int): Int = i * 2

    //  (i: Int): Int =  i * 1

    println(Map("timesTwo" -> { timesTwo(8)
    }))


    // numbers.foreach((i: Int) => i * 2)

    numbers.map(x => x * 2)

    // numbers.filter()

    List(1, 2, 3).zip(List("a", "b", "c"))

    // *********

    val rdd4 = List( List(1, 2), List(3, 4)).flatten

    rdd4.foreach(println)

          println(rdd4)

    // ********************

          val nestedNumbers = List(List(1, 2), List(3, 4))
          val rdd5 = nestedNumbers.flatMap(x => x.map(_ * 2))

          println(rdd5.map(x => (x,1)._1).sum)

    // ********************

          //println(nestedNumbers.map(x => (x,1)._1).sum)

    val extensions = Map("steve" -> 100, "sbob" -> 101, "joe" -> 201)

    extensions.filter((namePhone: (String, Int)) => namePhone._2 < 200)

    println(extensions.filter(x => x._1 contains("bob")))

   /*println( extensions.filter(
     {case (name, extension) =>
       (
         name.startsWith("s")
   )}))
*/

    val rdd6 = extensions.filter({case (name, extension) => (name.startsWith("s"))})

    println(rdd6.filter(x => (x._2).<(103)))


    class Calculator {
      val brand: String = "HP"
         def add(m: Int, n: Int): Int = m + n
       }

    val calc = new Calculator

    calc.add(1,2)
    println(calc.brand + "************" + calc.add(1,2))

  }

}

