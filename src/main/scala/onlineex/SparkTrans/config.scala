package onlineex.SparkTrans

import org.apache.log4j.{Level, Logger}
import org.apache.spark.{SparkConf, SparkContext}
/**
  * Created by Ja on 17/09/2017.
  */
object config {

  Logger.getLogger("org").setLevel(Level.OFF)
  Logger.getLogger("akka").setLevel(Level.OFF)

  val conf = new SparkConf().setAppName("WordCount")
  conf.setMaster("local[*]")

  val sc = new SparkContext(conf)
  val rootLogger = Logger.getRootLogger()
  rootLogger.setLevel(Level.ERROR)


}
