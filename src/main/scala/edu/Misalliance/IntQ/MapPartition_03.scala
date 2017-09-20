package Int

import org.apache.spark.{SparkConf, SparkContext}

object MapPartition_03 {

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("WordCount")

    conf.setMaster("local[*]")

    val sc = new SparkContext(conf)
    val rdd1 = sc.parallelize(List("yellow", "red", "blue", "cyan", "black"), 5)

                val mapped = rdd1.mapPartitionsWithIndex {
                  (index, iterator) => {
                    println("Called in Partition -> " + index.hashCode())

                    val myList = iterator.toList
                    println(myList)
                    myList.map(x113 => x113 + " -> " + index).iterator

                    //println(myList.toString())
                    //println(myList)
                  }
                }

    println(" mapped.collect() :" + mapped.collect())

  }
}
