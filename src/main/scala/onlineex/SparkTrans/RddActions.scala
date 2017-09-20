package onlineex.SparkTrans

import onlineex.SparkTrans.config.sc

object RddActions {

  def main(args: Array[String]): Unit = {

    val numbersRdd = sc.parallelize(List(9, 2))
    val squaresRdd = numbersRdd.map { x => x * x }
    val squaresArray = squaresRdd.collect()
    squaresArray.foreach(println)

// ******************
    val namesRdd2 = sc.parallelize(List("luisa", "melissa", "eva"))
    val namesCount = namesRdd2.count()
    println(namesCount)

// ******************

    val numbersRdd3 = sc.parallelize(List(900, 333, 555, 10))
    val biggestNumber = numbersRdd3.max()
    println(biggestNumber)

    // ******************

    val numbersRdd4 = sc.parallelize(List(4, 99, 2, 348, 99, 1))
    val numbers = numbersRdd4.take(3)
    println(numbers.toList)

    // ******************

    val numbersRdd5 = sc.parallelize(List(4, 99, 2, 348, 99, 1))
    val numbers5 = numbersRdd5.takeOrdered(2)
    println(numbers5.toList)

    // ******************
    val numbersRdd6 = sc.parallelize(List(4, 99, 2, 348, 99, 1))
    val numbers6 = numbersRdd6.top(2)
    println(numbers6.toList)
    // ******************
    val numbersRdd7 = sc.parallelize(List(4, 99, 2, 348, 99, 1))
    val sum = numbersRdd7.fold(0) { (memo: Int, n: Int) =>
      memo + n
    }
    println(sum)

    // **************

    val numbersRdd8 = sc.parallelize(List(9, 2)) // step 1
    val squaresRdd8 = numbersRdd8.map { x => x * x } // step 2

    // val evenSquares8 = squaresRdd8.filter { x: Int => x % 2 == 0 } // step 3
   // val squaresArray8 = evenSquares8.collect() // step 4

    println(squaresRdd8)
  }
}
