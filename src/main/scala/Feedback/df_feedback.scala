package Feedback

  import Feedback.common._
  import org.apache.log4j.{Level, Logger}

object df_feedback {

    def main(args: Array[String]): Unit = {
      Logger.getLogger("org").setLevel(Level.OFF)
      Logger.getLogger("akka").setLevel(Level.OFF)

      val rootLogger = Logger.getRootLogger()
      rootLogger.setLevel(Level.ERROR)
      // For implicit conversions like converting RDDs to DataFrames
      val rawRDD = read("feedback/feedback.csv")
      val initRDD = toRDD(rawRDD)
      val finalRDD = feedbackGroupedRDD(initRDD)

      val initDf = toDF(rawRDD)
      val finalDf = feedbackGrouped(initDf)
      val finalSqlDf = feedbackGroupedSql(initDf)

      val initDs = feedbackSummaryTyped(initDf)
      val finalDs = feedbackGroupedTyped(initDs)


      rawRDD.foreach(println);  println("******* rawRDD**********")
      initRDD.foreach(println);  println("******* initRDD**********")
      finalRDD.foreach(println);  println("******* finalRDD**********")

      initDf.show(); println("******* initDf**********")
      finalDf.show(); println("******* finalDf **********")
      finalSqlDf.show(); println("******* finalSqlDf**********")

      initDs.show(); println("******* initDs **********")
      finalDs.show(); println("******* finalDs**********")

      spark.close(); println("******* **********")
    }
  }




