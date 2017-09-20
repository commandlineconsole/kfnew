package edu

import org.apache.spark.{SparkConf, SparkContext}


  object Tokenizer {
    def main(args: Array[String]): Unit = {

      val conf = new SparkConf().setAppName("WordCount")
      conf.setMaster("local[*]")
      val sc = new SparkContext(conf)

      val lines = sc.textFile("C:\\msg\\kafka\\kf\\kf\\README.md")


      //val logData = sc.textFile(lines, 2).cache()

      val tokens = lines.flatMap(line => line.split(","))
                         .map(word => (word, 1))
                         .reduceByKey((a, b) => a + b)

   //   val termFrequency = tokens.map(word => (word, 1)).reduceByKey((a, b) => a + b)

    // termFrequency.collect.map(tf => println("Term, Frequency: " + tf))

       tokens.foreach(println)

    //  println(tokens)

   //   println(termFrequency)

      /*  tokens.saveAsTextFile("C:\\msg\\kafka\\kf\\kf\\README2.md")
      termFrequency.saveAsTextFile("C:\\msg\\kafka\\kf\\kf\\README3.md")
    */
    }

  }
