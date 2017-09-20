package edu.Misalliance.rdd

import org.apache.spark.SparkContext
object ReduceByKey {

  def main(args: Array[String]) {

    val sc = new SparkContext("local", "ReduceByKeyToDriver Test")

    val data1 = Array[(String, Int)] (
      ("K", 1), ("U", 2),
      ("U", 3), ("W", 4),
      ("W", 5), ("W", 6))

    val pairs = sc.parallelize(data1, 100)

    // val pairs = sc.parallelize(Array[(String, Int)](("K", 1), ("U", 2), ("U", 3), ("W", 4), ("W", 5), ("W", 6)),3)

    val result = pairs.reduceByKey(_ + _, 1)
    result.foreach(println)
  }

}

/*
(K,1)
(U,5)
(W,15)

(A1,1)(A2,2)
(B1,3)(B2,4)
(C1,5)(C2,6)

 */