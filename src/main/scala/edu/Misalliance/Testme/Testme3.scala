package edu.Misalliance.Testme


object Testme3 {

  def main(args: Array[String]): Unit = {

    val m1 = Map("fname" -> "Al", "lname" -> "Alexander")

    for ((k, v) <- m1)
    // printf("key: %s, value: %s\n", k, v)
      printf("%s 123, %s 123\n", k, v)

    m1.foreach(println)

  }
}
