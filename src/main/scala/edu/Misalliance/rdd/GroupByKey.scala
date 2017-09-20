package edu.Misalliance.rdd

import java.util.Random

import org.apache.spark.{SparkConf, SparkContext}

object GroupByKey {
  def main(args: Array[String]) {
    val sparkConf = new SparkConf().setAppName("GroupBy Test").setMaster("local[2]")
    val sc = new SparkContext(sparkConf)

    var numMappers = 10
    var numKVPairs = 100
    var valSize = 100
    var numReducers = 3

    val pairs1 = sc.parallelize(0 until numMappers, numMappers).flatMap { p =>

      val ranGen = new Random

      var arr1 = new Array[(Int, Array[Byte])](numKVPairs)

      for (i <- 0 until numKVPairs) {

        val byteArr = new Array[Byte](valSize)
        ranGen.nextBytes(byteArr)
        arr1(i) = (ranGen.nextInt(10), byteArr)

      }
      arr1
    }.cache

    // Enforce that everything has been calculated and in cache

    pairs1.count

    val result = pairs1.groupByKey(numReducers)
    println(result.count)
   // println(result.toDebugString)

    sc.stop()
  }
}