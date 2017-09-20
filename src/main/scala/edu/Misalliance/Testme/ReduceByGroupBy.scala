package edu.Misalliance.Testme

import org.apache.spark.{SparkConf, SparkContext}


object ReduceByGroupBy {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("WordCount")
    conf.setMaster("local[*]")
    val sc = new SparkContext(conf)

    val words = Array("one", "two", "two", "three", "three", "three")
    val wordPairsRDD = sc.parallelize(words).
                                map(word => (word, 1))

    val wordCountsWithReduce = wordPairsRDD
      .reduceByKey(_ + _)
      .collect()

    wordCountsWithReduce.foreach(println)

    val wordCountsWithGroup = wordPairsRDD
      .groupByKey()
      .map(t => (t._1, t._2.sum))
      .collect()

    wordCountsWithGroup.foreach(println)

  }
}

/*

(one,1)
(two,2)
(three,3)

(one,1)
(two,2)
(three,3)
 */