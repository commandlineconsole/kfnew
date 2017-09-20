package edu.Misalliance.IntQ
import org.apache.spark.{SparkConf, SparkContext}

object Map_02 {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("WordCount")
    conf.setMaster("local[*]")
    val sc = new SparkContext(conf)

    val inputrdd = sc.parallelize(Seq(("maths", 50), ("maths", 60), ("english", 65)))

    val mapped = inputrdd.mapValues(mark => (mark, 1));

    val reduced = mapped.reduceByKey((x, y) => (x._1 + y._1, x._1 + y._1))
    val reduced2 = mapped.reduceByKey((x, y) => (x._1 + y._1, x._2 + y._2))

    println("reduced : " + reduced)
    println("reduced2 :" +reduced2)

    val average = reduced.map { x =>
      val temp = x._2
      val total = temp._1
      val count = temp._2
      (x._1, total / count)
    }

    val average2 = reduced.map { x =>
      val temp = x._2
      val total = temp._1
      val count = temp._2
      (x._1, total / count)
    }

    println("average.collect() :" + average.collect())
   println("average.foreach(println) :" +average.foreach(println))
    println("average2.foreach(println) :" + average2.foreach(println))

  }

}
