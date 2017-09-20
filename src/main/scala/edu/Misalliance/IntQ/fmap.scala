package edu.Misalliance.IntQ

import org.apache.spark.{SparkConf, SparkContext}


object fmap {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("WordCount")
    conf.setMaster("local[*]")
    val sc = new SparkContext(conf)

    val lines = sc.textFile("C:\\msg\\kafka\\kf\\kf\\README.md")

    println("lines.map(_.split(\" \")).take(3) : " +lines.map(_.split(" ")).take(3))
    println("lines.flatMap(_.split(\" \")).take(3) : " + lines.flatMap(_.split(" ")).take(3))

  }

}
