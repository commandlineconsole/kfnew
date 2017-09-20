package edu.Misalliance.Testme

import org.apache.spark.{SparkConf, SparkContext}

object TestmePractise {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("WordCount")
    conf.setMaster("local[*]")
    val sc = new SparkContext(conf)

    val sdata = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val rdd2 = sdata.filter(x => x > 9)
    val rdd = sc.parallelize(rdd2).map(x => (x, 1)._1*10).sum()
    println(rdd)


  }

}
