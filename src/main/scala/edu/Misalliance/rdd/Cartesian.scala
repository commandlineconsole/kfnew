package edu.Misalliance.rdd

import org.apache.spark.SparkContext

object Cartesian{

  def main(args: Array[String]) {

    val sc = new SparkContext("local", "Cartesian Test")

    val data1 = Array[(String, Int)](("A1", 1), ("A2", 2), ("B1", 3), ("B2", 4), ("C1", 5), ("C1", 6))
    val data2 = Array[(String, Int)](("A1", 7), ("A2", 8), ("B1", 9), ("C1", 0))

    val pairs1 = sc.parallelize(data1, 1)
    val pairs2 = sc.parallelize(data2, 1)

    val resultRDD = pairs1.union(pairs2)
    resultRDD.foreach(println)

  }
}