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
/*
    // Option, Some, and None

    val x: Option[String] = Some("naidu")  // Naidu
    println(x.get)

    var y: Option[String] = None  // None
    println(y)

    val firstName : Option[String] = None  // None

    println(firstName.getOrElse("123456"))
    println(firstName.getOrElse("123456"))

    val bestNumber: Option[Int] = None   // None
    println(bestNumber.getOrElse(8))

    val bestNumber2: Option[Int] = None
    println(bestNumber2)

    val bestNumber4: Option[String] = None
    println(bestNumber4)
*/

    var myMood2: Option[String] = Some("happy")
    myMood2 = Some("Jagan")
    println(myMood2.get)

   /* def fullName( firstName: String,
                  lastName: String)
    : String = {
      Seq(firstName, lastName).
        flatMap(Option[String]).
        mkString(",")
    }

    var y: Option[String] = None
    println(y)

    println(fullName(null, "barker"))
    println(fullName("coolio", null))
    println(fullName("cat", "dog"))

              def makeFun(word: String): String = {
                if (word == null) {
                  "I like fun!" }
              else {
                  s"$word is fun"
                }
              }

              println(makeFun("paint")) // "paint is fun"
              println(makeFun(null)) // "I like fun!"


    val bestNumber2: Option[Int] = Some(1212)
    println(bestNumber2)

    val bestNumber4: Option[String] = None
    println(bestNumber4)
    println(bestNumber4.getOrElse("123456"))*/

  }
}
