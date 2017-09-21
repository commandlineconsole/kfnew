package onlineex.Beginner

object ExpressionsConditionals {

  def main(args: Array[String]): Unit = {

    var number = { val x = 2 * 2; x + 40 }
    println(number)

    // ************************

    var ttt = {var first = "katy"; s"$first perry"}
    println(ttt)

    // **************************

    var source = "hotline"
    var badSong = {s"$source bling"}
    println(badSong)

    // **************************

    var band = {var name = "sublime val";
      name}
    println(band)

    // **************************
    def band2 = {
      var name = "sublime def"
      name
    }

    println(band2)
    // **************************


    if (10 > 2) {
      println("ten is greater than two")
    }


    // **************************
    if (10 > 2) println("ten is greater than two")
    // **************************
    if (5 != 5) println("not equal") else println("they're equal!")
    // ***************************
    if (true) {
      println("it is true")
    } else {
      println("i'm confused")
    }
    // *********************
  }
}


