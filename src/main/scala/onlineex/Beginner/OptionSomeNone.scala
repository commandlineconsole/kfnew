package onlineex.Beginner

object OptionSomeNone {

  def main(args: Array[String]): Unit = {

    // Option, Some, and None


/*
     def Option2(x2 : String) = if (x2 == null) None else Some(x2)
    def Option3(x2 : Int) = if (x2 == null) None else Some(x2)

    println(Option2("22").getOrElse("Naidu"))
    println(Option2("78").get)
    println(Option2("Jagan"))

    println(Option3(454).getOrElse("Naidu"))
    println(Option3(0).get)
    println(Option3(99))
*/

    // Option, Some, and None

    val x: Option[Int] = Some(0013164165464)
    println(x.get)

    var y: Option[String] = Some("slkdlksdf")
    println(y.get)

    val firstName : Option[Int] = Some(121212)
    println(firstName.getOrElse(10000))

    val bestNumber: Option[Int] = None
    println(bestNumber.getOrElse(8))

    val bestNumber2: Option[Int] = None
    println(bestNumber2)

    val bestNumber4: Option[String] = None
    println(bestNumber4)

    var myMood2: Option[String] = Some("happy")
    //   myMood2 = Some(10)
    myMood2 = Some("Jagan")
    println(myMood2.get)


    def fullName(firstName: String, lastName: String)

    : String = {
      Seq(firstName, lastName).
        flatMap(Option[String]).
        mkString(",")
    }

    println(fullName(null, "barker"))
    println(fullName("coolio", null))
    println(fullName("cat", "dog"))


    def makeFun(word: String): String = {
      if (word == null) {
        "I like fun!"
      } else {
        s"$word is fun"
      }
    }

    println(makeFun("paint")) // "paint is fun"
    println(makeFun(null)) // "I like fun!"
  }

}
