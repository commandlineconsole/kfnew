package edu.Misalliance.faq

import org.apache.spark.{SparkConf, SparkContext}

object colls {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("WordCount")
    conf.setMaster("local[*]")
    val sc = new SparkContext(conf)

    /*
    val m = Map(1 -> "a", 2 -> "b", 3 -> "c")
    val m2 = Map(1 -> "1", 2 -> "2", 3 -> "3")

    println(m.getOrElse(100, "NOT FOUND"))
    println(m.getOrElse(1, "NOT FOUND"))

    println(m.filter(_._2 != "b"))

    println(m2.map(x => (x._2, (2 * x._2.toInt).toString)))
    println(m2.map(x => (x, (3 * x._1.toInt).toString)))

    m.keys
    m.values

    println(m2.reduce((a, b) => {
      (
        a._1 + b._1,
        a._2 + b._2
      )
    }))

  }

  // TODO: Reduce

  val l = List("a", "b", "c", "d")
  l.reduce((a, b) => {
    a + b
  })
  l.reduceLeft((a, b) => {
    a + b
  }) // (((a + b) + c) + d)
  l.reduceRight((a, b) => {
    a + b
  }) // (a + (b + (c + d)))

  // TODO: fold

  val I2 = List("a", "b", "c", "d", "e", "f")
  println(I2.fold("#")((a, b) => {
    a + b
  }))
  println(I2.foldLeft("#")((a, b) => {
    a + b
  }))
  println(I2.foldRight("#")((a, b) => {
    a + b
  }))

  // TODO: zip and unzip

        val s0 = Seq(1,2,3,4,5,6)
        val s1 = Seq(6,5,4,3,2,1)
        val z = s0 zip s1 // same of val z = s0.zip(s1)
        z.unzip
  println("s0 :" + s0)
println("s1 :" + s1)
  println("z :" + z)
  println("z.unzip :" + z.unzip)

  // TODO : zipWithIndex

val Kl = List("a", "b", "c", "d", "e", "f")
  println("Kl.zipWithIndex : " + Kl.zipWithIndex)

   val m2 = Map("A" -> List(1, 2, 3),
               "B" -> List(3, 4, 5),
                "C" -> List(6, 7, 8))

  println("m2.values.flatten : " + m2.values.flatten)

  // TODO :

val Ml = List(
  ("a", 1),
  ("b", 2),
  ("a", 2),
  ("a", 3),
  ("c", 1))

 println( "Ml.groupBy(_._1) : " + Ml.groupBy(_._1))
  println( "Ml.groupBy(_._2) : " + Ml.groupBy(_._2))

val mk = Map(1 -> "a", 2 -> "b", 3 -> "c")
  println("println(\"\" + mk.mapValues(_ + \"#\")) :  " + mk.mapValues(_ + "#!!!!"))

  // TODO :

    val Nl = List("a", "b", "c", "d", "a").groupBy(identity)
  println( "Nl.mapValues(_.length) : " + Nl.mapValues(_.length))
*/

/*    for (i <- 1 to 10) {print(i * 2 + " ")}

        println("")

    println(for (i <- (1 to 10)) yield i * 20)*/

    var i = 0

/*
    while(i < 1) { print(i*2 + " ") ; i+=1}  // 0 1 2 // 0, 2, 4
*/

    Iterator.continually{val r = i ; i+=1 ; r }.
      takeWhile(x => x < 10).
      foreach(x => print(x + " "))    //  foreach(x => print(x + " //"


      val words = List("a", "a", "b", "c", "d", "e", "e", "e")
      val words_rdd = sc.parallelize(words)
      val g = words_rdd.map((_, 1)).groupByKey().mapValues(x =>
      x.reduce((a, b) => (a + b)))

      println(g.collectAsMap)


  }
}
