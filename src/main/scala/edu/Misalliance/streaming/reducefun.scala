package edu.Misalliance.streaming

import org.apache.spark.{SparkConf, SparkContext}

object reducefun {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("WordCount")
    conf.setMaster("local[*]")
    val sc = new SparkContext(conf)

    val x = sc.parallelize(Array(
      ("a", 1), ("b", 1), ("a", 1), ("a", 1), ("b", 1), ("b", 1), ("b", 1), ("b", 1))
      , 2)
    val y = x.reduceByKey((accum, n) => (accum + n))

    y.foreach(println)

  }
}
