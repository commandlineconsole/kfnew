package edu.Misalliance.IntQ

import org.apache.spark.{SparkConf, SparkContext}

object MapPart_04 {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("WordCount")
    conf.setMaster("local[*]")
    val sc = new SparkContext(conf)


    // TODO : flatMap, Map, reduceByKey
    val lines = sc.parallelize(List("This is a word", "This is another word"), 7)
       lines.partitions.size

    println("lines :" + lines.partitions.size)

    val words = lines.flatMap(line => line.split(" "))
    val units = words.map ( word => (word, 1) )
    val counts = units.reduceByKey ( (x, y) => x + y )

    println("counts.foreach(println) :" + counts.foreach(println))
    println("counts : " + counts)
    counts.toDebugString
    counts.collect()
    println(" counts.collect() :" +  counts.collect())


    // TODO : reduceByKey


    val inputrdd = sc.parallelize(Seq(("maths", 50), ("maths", 60), ("english", 65)))
    val mapped = inputrdd.mapValues(mark => (mark, 1));
    val reduced = mapped.reduceByKey((x, y) => (x._1 + y._1, x._2 + y._2))

    val average = reduced.map { x =>
      val temp = x._2
      val total = temp._1
      val count = temp._2
      (x._1, total / count)
    }

    average.collect()

    // TODO : flatMap, Map, reduceByKey

    val rdd1 =  sc.parallelize(List("yellow",   "red", "blue",     "cyan", "black"), 3)

    val mapped2 =   rdd1.mapPartitionsWithIndex{

      (index, iterator) => {
        println("Called in Partition -> " + index)
        val myList = iterator.toList

        myList.map(x => x + " -> " + index).iterator
      }
    }

    println(" mapped2.collect() : " +  mapped2.collect())
    // mapped2.collect()

    // TODO : aggregate

    val inputrdd3 = sc.parallelize(List(("maths", 21), ("english", 22), ("science", 31)), 3)
    inputrdd3.partitions.size

    val result = inputrdd3.aggregate(5) (
      (a, b) => (a + b._2)
     ,(a, b) => (a + b)
    )

    println("result : " + result)


    // TODO : sum

    val rdd5 = sc.parallelize(List(("maths", 80), ("science", 90)))

    println("rdd5.partitions.length : " + rdd5.partitions.length)

    val additionalMarks = ("extra", 4)
    println("additionalMarks : " + additionalMarks)

    val sum = rdd5.fold(additionalMarks){ (acc, marks) =>
      val sum = acc._2 + marks._2
      ("total", sum)
    }

    println("sum :" + sum)
  }
}
