package onlineex.FunctionalProgramming

object Purefunctions {

  def main(args: Array[String]): Unit = {

    // ******************

    def add(x: Int, y: Int): Int = { x + y }
    println(add(10,20))

    // ******************

    var x = 33
    def changeStuff: Int = { x+10 }
    println(changeStuff)

    // ********************

    def funify: String = {
      var word = new StringBuilder("Beach")
      word.append("Fun!").toString
    }

    println(funify)

    // ********** **********

    class Person(n: String) { var name = n }

    def changeName(p: Person): Unit = { p.name = "cathy" }

    var bob2 = new Person("bob")

    val K = changeName(bob2)

    println(K)

    // ********** **********

    def fullName(firstName: String, lastName: String): String = {
      s"$firstName $lastName"
    }

    println(fullName("Ricky", "Bobby"))

    // ********** **********

    def loco: Unit = {
      println("toma 4loco!")
    }

    loco

    // ********** **********

    import java.io._

    def shaggy: Unit = {

      val path = s"${System.getProperty("user.home")}/Desktop/mr_lover.txt"
      val file = new File(path)
      file.createNewFile();

    }

     println(shaggy)

    // ********** **********

    def divide(numerator: Double, denominator: Double): Double = {

      if (denominator == 0)

        throw new IllegalArgumentException("The denominator can't be zero")

      else

        numerator / denominator
    }

    // ********** **********

  }
}

