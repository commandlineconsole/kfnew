package edu.Misalliance.rdd

import org.apache.spark.SparkContext
object Aggregate {

  def main(args: Array[String]) {

    val sc = new SparkContext("local", "AggregateAction Test")

    val data = Array[(String, Int)] (
      ("A1", 100), ("A2", 200),
      ("B1", 300), ("B2", 400),
      ("C1", 500), ("C2", 600)
    )

    val pairs = sc.parallelize(data, 3)

    pairs.foreach(print)

    val result = pairs.aggregate(("", 0))(

      (U, T) => (U._1 + T._1, U._2 + T._2)
     ,(U, T) => ("[" + U._1 + T._1 + "] ", U._2 + T._2)
    )

    println(result)

  }
}