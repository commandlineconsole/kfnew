package edu.Misalliance.IntQ
import org.apache.spark.{SparkConf, SparkContext}

object Reduce {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("WordCount")
    conf.setMaster("local[*]")
    val sc = new SparkContext(conf)

    val x = sc.parallelize(1 to 10, 2)
    val y = x.reduce((accum, n) => (accum + n))

    val y11 = x.reduce(_ + _)
    val y1 = x.reduce(_ * _)
    val y3 =  x.reduce(_ + _)

    println(x)
    println(y)
    println(y11)
    println(y1)
    println(y3)

  }
}

