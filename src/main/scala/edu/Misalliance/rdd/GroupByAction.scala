package edu.Misalliance.rdd

import org.apache.spark.SparkContext

object GroupByAction {
  def main(args: Array[String]) {

    val sc = new SparkContext("local", "GroupByAction Test")

    val data = Array[(String, Int)](

      ("A1", 1), ("A2", 2),
      ("B1", 6), ("A2", 4),
      ("B1", 3), ("B1", 5)
    )

    val pairs = sc.parallelize(data, 1)
      pairs.foreach(println)

  }

}