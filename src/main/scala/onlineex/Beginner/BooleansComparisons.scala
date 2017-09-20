package onlineex.Beginner

object BooleansComparisons {

  def main(args: Array[String]): Unit = {

    var t: Boolean = true
    println(t)
    println(10 > 3)
    println(5 != 5)
    println(true && false)
    println(5 < 6 && 10 == 10)
    println(false || true)
    // println("frank" || true)


    println(40.getClass)  // int
    println(99.isInstanceOf[Int]) //true

    var f = "4.44".toFloat  // float
    println(f.getClass) // float

    println(77.toString == "77") // True


  }

}
