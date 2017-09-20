package edu.Misalliance.rdd

import org.apache.spark.{HashPartitioner, SparkContext}

object PartitionBy {
  def main(args: Array[String]) {

    //val sc = new SparkContext("local", "wordcount")
    // val sc = new SparkContext("local", "ReduceByKeyToDriver Test")
    val sc = new SparkContext("local", "workdcound")

    val detail4 = Array[(String, Int)](("A",1),("B",2))

    val data1 = Array[(String, Int)](
      ("K", 1), ("T", 2),
      ("T", 3), ("W", 4),
      ("W", 5), ("W", 6))

    val pairs = sc.parallelize(data1, 1)

    var  result = pairs.partitionBy(new HashPartitioner(10))


  //  println("result : " + result)
    result.foreach(println)

  }
}