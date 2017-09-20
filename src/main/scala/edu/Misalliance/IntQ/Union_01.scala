package edu.Misalliance.IntQ

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by Ja on 05/08/2017.
  */
object Union_01 {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("WordCount")
    conf.setMaster("local[*]")
    val sc = new SparkContext(conf)

    val rdd1 = sc.parallelize(List("lion", "tiger", "tiger", "peacock", "horse"))
    val rdd2 = sc.parallelize(List("lion", "tiger"))
    rdd1.distinct.collect
    rdd1.union(rdd2).collect
    rdd1.intersection(rdd2).collect
    rdd1.subtract(rdd2).collect
    rdd1.cartesian(rdd2).collect
  }

}
