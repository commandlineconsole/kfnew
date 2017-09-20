package edu

import org.apache.spark.{SparkConf, SparkContext}
case class Person(first_name:String,last_name:String)

object Map_05 {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("WordCount")

    conf.setMaster("local[*]")
    val sc = new SparkContext(conf)
    val sqlContext = new org.apache.spark.sql.SQLContext(sc)
    val hc = new org.apache.spark.sql.hive.HiveContext(sc)

    val name = "Shakespeare"
    val lines = sc.textFile("C:\\Users\\Ja\\Pictures\\scala usefuls\\gitrepo\\kf\\README.md")

    val numAs2 = lines.flatMap(line => line.split(","))
    val personRDD = numAs2

    println(personRDD)
    personRDD.foreach(println)

/*    import sqlContext.implicits._

    val personDF = personRDD.toDF()

    personDF.registerTempTable("person")

    val people = hc.sql("select * from person")

    people.collect.foreach(println)*/

  }
}