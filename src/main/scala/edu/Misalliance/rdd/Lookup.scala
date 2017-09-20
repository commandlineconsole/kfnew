package edu.Misalliance.rdd

import org.apache.spark.SparkContext

object Lookup {
  def main(args: Array[String]) {

    val sc = new SparkContext("local", "LookUp Test")

    val data = Array[(String, Int)] (
      ("A", 1), ("B", 2),
      ("B", 3), ("C", 4),
      ("C", 5), ("C", 6))

    val pairs = sc.parallelize(data, 3)

    val finalRDD1 = pairs.lookup("B")
    val finalRDD2 = pairs.lookup("A")
    val finalRDD3 = pairs.lookup("C")

    finalRDD1.foreach(println)
    finalRDD2.foreach(println)
    finalRDD3.foreach(println)

  }
}
