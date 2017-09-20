package onlineex.FunctionalProgramming

object CookbookStrings {

  def main(args: Array[String]): Unit = {

    // ******************************

    println("ray rice".filter(_ != 'r')) // ay ice
    println("ray rice".filter((c: Char) => c != 'r')) // ay ice
    println("batmanstein".drop(3).take(3).capitalize)  // Man

    // ******************************

    val s1 = "Homer"
    val s2 = "Ho" + "mer"
   println(s1 == s2)   // true

     null == true

    val person1 = null
    val person2 = "frank"

    // person1.toUpperCase == person2.toUpperCase
    // ******************************

    val animals = "dog, cat, pig"
    val  k10 = animals.split(",").map(_.trim)

    println(k10)

    // println(animals.split(", "))


    // ******************************

    var mood = "happy"
    println(s"I am $mood")

    // ******************************

    var usDrinkingAge = 21
    println(s"The drinking age in Canada is ${usDrinkingAge - 3}")

    println("like dessert".toUpperCase)
    println("like dessert".map(_.toUpper))

    // ******************************

    val s = "Milton Friedman died at 94 years of age."
    val regex = "[0-9]+".r
    println(regex.findFirstIn(s))

    // ******************************

    val s21 = "(888) 333-4444"
   print(s21.replaceAll("[0-9]", "K"))

    // ******************************

  }
}
