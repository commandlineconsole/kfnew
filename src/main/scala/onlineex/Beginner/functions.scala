package onlineex.Beginner

object functions {

  def main(args: Array[String]): Unit = {

    def howdy() = "hi y'all"
    println(howdy())

    // *******************

    def view = "mountains"
    println(view)

    // *******************

    def building = {
      "tall"
    }

    println(building)

    // *******************

    def happy(thing: String) = {
      s"I like $thing"
    }

    println(happy("cats"))

    // *******************

    def crazy(number: Int) = {
      number + 3
    }

    // println(crazy("book"))
    println(crazy(123))
    // *******************

    def cool(number: Double): String = {
      s"${number.toString} is cool"
    }

    println(cool(3.14))
    // *******************

    def singSong(times: Int): Any = {
      s"I'm going to sing ${times} times"
    }

    println(singSong(5))

    // *******************

    def add(a: Int, b: Int): Int = {
      a + b
    }

    println(add(3, 6))

    // *******************

    def fullName(first: String, last: String = "balvin"): String = {
      s"$first $last"
    }

    println(fullName("j"))

    // *******************
    def mathFun(x: Int, y: Int = 99): Int = {
      x * y
    }

    println(mathFun(4, 5))

    // *******************
    def airplane(company: String): String = {
      s"The plane belongs to $company"
    }

    println(airplane("Delta"))

    // *******************
    def theBest(category: String, thing: String): String = {
      s"The best type of $category is $thing"
    }

    println(theBest("Squirtle", "Pokemon"))
    // *******************
  }

}
