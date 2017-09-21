package edu

import org.apache.spark.streaming._
object Map_01 {

  def main(args: Array[String]): Unit = {

    import onlineex.SparkTrans.config._

/*
    val x1 = sc.parallelize(Array(1,2,3,4,5,6))
    val result = 0

    val y1 = x1.filter(n => n%2 == 0)
    y1.foreach(println)

    println(y1.collect().sum)
    println(y1.collect().mkString(", "))


    // val x = sc.parallelize(Array("b", "a", "c"))

    val y = y1.map(z => (z,1))
    val z = y.map(z => y.foreach(println))

    val x2 = sc.parallelize(Array(1,2,3))
    val y2 = x2.flatMap(n => Array(n, n*100, 42))
    val y3 = x2.map(n => Array(n, n*100, 42))

    println("******* flatMap 123 ********* ")
    println(x2.collect().mkString(", "))
    println("******* flatMap 456 ********* ")
    println(y2.collect().mkString(", "))
    println("******* flatMap 789 ********* ")

    println("******* map 123 ********* ")
    println(y3.collect().mkString(", "))
    println("******* map 456 ********* ")


    val x4 = sc.parallelize(Array("John", "Fred", "Anna", "James", "Ja", "A456", "A123"))
    val y4 = x4.groupBy(w => w.charAt(0))
    println("******* groupBy 123 ********* ")
    println(y4.collect().mkString(", "))
    println("******* groupBy 456 ********* ")

    val x5 = sc.parallelize(
      Array(('B',5),('B',4),('A',3),('A',2),('A',1)))

    val y5 = x5.groupByKey()

    println("******* groupBykey 123 ********* ")
    println(x5.collect().mkString(", "))
    println("******* groupBykey 123 ********* ")
    println(y5.collect().mkString(", "))

*/

    val words = Array("one", "two", "two", "three", "three", "three")

    val wordPairsRDD = sc.parallelize(words).
                          map(word => (word, 1))
                          // .reduceByKey(_ + _).collect()


  val wordCountsWithGroup = wordPairsRDD.reduceByKey((a,b) => a + b)
                           /*     //.groupByKey()
                                .map(t => (t._1, t._2.sum))   //  .map(t => (t._1, t._2))
                                .collect()*/

   // println(wordCountsWithGroup)
    wordCountsWithGroup.foreach(println)

/*
    println("******* reduceByKey 345 ********* ")

    val wordCountsWithGroup = wordPairsRDD
      .groupByKey()
      .map(t => (t._1, t._2.sum))   //  .map(t => (t._1, t._2))
      .collect()

    println(wordCountsWithGroup)
    wordCountsWithGroup.foreach(println)       // TODO  : (one,1) (two,2) (three,3)

    println("******* groupByKey 123 ********* ")

    val x6 = sc.parallelize(Array(1,2,3), 2)

    def f(i:Iterator[Int])={ (i.sum,42).productIterator }
    val y6 = x6.mapPartitions(f)
    // glom() flattens elements on the same partition  val xOut = x.glom().collect()
    val yOut = y6.glom().collect()

    println("******* mapPartitions 123 ********* ")
    println(yOut)
    yOut.foreach(println)
    println("******* mapPartitions 345 ********* ")*/
  }

}
