package edu.Misalliance.rdd

import org.apache.spark.SparkContext

object CollectAsMap {
  def main(args: Array[String]) {

    val sc = new SparkContext("local", "CollectAsMap Test")

    val data = Array[(String, Int)](("A", 1), ("B", 2), ("B", 3), ("C", 4), ("C", 5), ("C", 6))

    val pairs = sc.makeRDD(data, 10)

    val result = pairs.collectAsMap()

    print(result)

  }
}