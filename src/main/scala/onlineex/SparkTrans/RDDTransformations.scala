package onlineex.SparkTrans

import onlineex.SparkTrans.config.sc

object RDDTransformations {

  def main(args: Array[String]): Unit = {

    val mammals = List("Lion", "Dolphin", "Whale")
    val mammalsRdd = sc.parallelize(mammals)
    val mammalsLengthRdd = mammalsRdd.map { (m: String) => m.length }                // m.length
    mammalsLengthRdd.collect().foreach(println)

    // *********************

    val languages = List("spanish", "french", "farsi")
    val languagesRdd = sc.parallelize(languages)
    val someLanguagesRdd = languagesRdd.filter { (l: String) =>                    // filter l.take(1) != "f"
      l.take(1) != "f"
    }

    someLanguagesRdd.collect().foreach(println)

    // **********************

    val numbers = List("one", "two")
    val letters = List("a", "b")
    val numbersRdd = sc.parallelize(numbers)
    val lettersRdd = sc.parallelize(letters)
    val both = numbers.union(letters)                          // union
    println(both)                                          // List(one, two, a, b)

    // **********************

        val numbersRdd5 = sc.parallelize(List(1, 2, 3, 4, 3, 2, 1))
        val uniqueNumbersRdd = numbersRdd5.distinct             // distinct

        uniqueNumbersRdd.collect().foreach(println)  // 1,2,3,4

        // **********************

          val numbersRdd6 = sc.parallelize(List(10, 20))
          val lettersRdd7 = sc.parallelize(List("a", "b"))
          val zippedPairsRdd = numbersRdd6.zip(lettersRdd7)            // zip  // (10,a) (20,b)
          zippedPairsRdd.collect().foreach(println)

          // **********************

          case class Person(name: String, age: Int)

          val bob = new Person("bob", 40)
          val mario = new Person("mario", 40)
          val britney = new Person("britney", 16)

          val peopleRdd = sc.parallelize(List(bob, mario, britney))
          val inDaClubRdd = peopleRdd.map { p => {p.name + " " + p.age}}
          inDaClubRdd.collect().foreach(println)                           // bob 40 mario 40 britney 16

          // **********************/


  }
}
