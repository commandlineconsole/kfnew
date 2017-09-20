package edu.Misalliance.Testme

import org.apache.spark.{SparkConf, SparkContext}
object ReduceByEx {

  def main(args: Array[String]): Unit = {

/*
Map
ReduceBYkey   / GroupBYkey - map(t => (t._1, t._2.sum)).
collect
*/

    val conf = new SparkConf().setAppName("WordCount")
    conf.setMaster("local[*]")
    val sc = new SparkContext(conf)

    val words = Array("one", "two", "two", "three", "three", "three")

    val rdd1 = sc.parallelize(words).map(x => (x, 1)).reduceByKey(_ + _).collect().foreach(println)
    val rdd2 = sc.parallelize(words).map(x =>(x,1)).groupByKey().map(x => (x._1, x._2.sum)).collect().foreach(println)



  }
}
