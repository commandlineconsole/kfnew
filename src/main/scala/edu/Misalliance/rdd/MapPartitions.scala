package edu.Misalliance.rdd
import org.apache.spark.SparkContext

object MapPartitions {
  def main(args: Array[String]) {

    val sc = new SparkContext("local", "MapPartitionsRDDTest")

    val data = Array[(String, Int)](
      ("A1", 1), ("A2", 2),
      ("B1", 1), ("B2", 4),
      ("C1", 3), ("C2", 4))

    val pairs = sc.parallelize(data, 1)
    val finalRDD = pairs.mapPartitions(iter => iter.filter(_._2 >= 3))

    finalRDD.foreach(println)

  }
}

