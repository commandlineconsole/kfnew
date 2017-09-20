package onlineex.SparkTrans

object SQLAndDatasets {

  def main(args: Array[String]): Unit = {

    case class Dork(name: String, birthYear: Int, specialty: String)

    val dorks = List(
      Dork("stallman", 1953, "programmer"),
      Dork("newton", 1643, "physics"),
      Dork("frink", 1965, "professor")
    )

  //  var dorkDs: org.apache.spark.sql.Dataset[Dork] = spark.createDataset(dorks)


  }
}
