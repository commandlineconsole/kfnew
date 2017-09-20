package edu.Misalliance.IntQ
import org.apache.spark.{SparkConf, SparkContext}

object wc {

          def main(args: Array[String]) {

        val sc = new SparkContext(new SparkConf().setMaster("local[2]").setAppName("Spark Count"))
        // get threshold
        val threshold = args(1).toInt
        // read in text file and split each document into words
        val tokenized = sc.textFile(args(0)).flatMap(_.split(" "))
        // count the occurrence of each word
        val wordCounts = tokenized.map((_, 1)).reduceByKey(_ + _)
        // filter out words with fewer than threshold occurrences
        val filtered = wordCounts.filter(_._2 >= threshold)
        // count characters
        val charCounts = filtered.flatMap(_._1.toCharArray).map((_, 1)).reduceByKey(_ + _)

      }

}
