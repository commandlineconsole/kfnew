package edu.Misalliance.Testme

object Iteratorex {
  def main(args: Array[String]): Unit = {

    var sum = 0
    val x = List(1, 2, 3, 4, 5)

/*
    x.foreach(sum += _)
    println(sum)
    println(x.sum)

    for (name <- x) println(name)
    x.foreach(println)
*/

   val filterx =  x.filter(i => i % 2 == 1)
    //filterx.foreach(println)

    def isEven(i: Int): Boolean = i % 2 == 0
    def isEven2(i: Int) :Boolean = i % 2 == 0

    println(x.filter(isEven))
    println(x.filter(isEven2))

     println(x.find(i => i > 0))

    println( x.partition(_ % 2 == 0))

    val rdd2 = x.filter(x => x.!=(12))
    println(rdd2)

    // import spark.implicits._

   //val todataframe = x.toSet.exist

    // println(todataframe)



  }
}
