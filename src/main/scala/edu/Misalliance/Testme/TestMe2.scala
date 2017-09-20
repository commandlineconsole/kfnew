package edu.Misalliance.Testme

import org.apache.spark.SparkContext

object TestMe2 {

  def main(args: Array[String]): Unit = {

    val sc = new SparkContext("local", "AggregateAction Test")

    val data = Array (("A1", 100), ("A2", 200), ("B1", 300), ("B2", 400), ("C1", 500), ("C2", 600))
    val data2 = Array (("A1", 100), ("A2", 200), ("B1", 300), ("B2", 400), ("C1", 500), ("C2", 600))

    val pairs = sc.parallelize(data, 1)
    val pairs2 = sc.parallelize(data2, 1)

    val rddjoin = pairs.join(pairs2)
    val finalRDD1 = pairs.lookup("B1")

   // rddjoin.foreach(println)
    finalRDD1.foreach(println)
   // for (elem <- finalRDD1) {println(elem)}


  }
}
