package edu.Misalliance.rdd

import org.apache.spark.SparkContext
object AggregateOrder {

  def main(args: Array[String]) {

    val sc = new SparkContext("local", "AggregateOrder Test")
     val data = List("12", "23", "345", "4567")

    val pairs = sc.parallelize(data, 1)

    val result = pairs.aggregate("")(

      (x,y) => math.min(x.length, y.length).toString,
      (x,y) => x + y
    )

    result.foreach(println)
   // println(result)

  }
}