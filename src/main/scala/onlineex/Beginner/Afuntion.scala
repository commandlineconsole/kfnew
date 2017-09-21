package onlineex.Beginner

object Afuntion {

  def main(args: Array[String]): Unit = {

      def triple(x: Int): Int = x * 3
      val tripleCopy :Int => Int = triple
      println(tripleCopy(5))

    def choise(x: Int): Int = if(x > 5 ) 50 else 56
    val valchoise : Int => Int = choise
    println(valchoise(45))

    def m(x: Int, y: Int): Int = if ( x > y) x else y
    val valchoise2 : (Int, Int) => Int = m _
    println(valchoise2(49, 45))

    def fullname(fname: String, lname: String) : String = {s"$fname, $lname"}
    println(fullname("Jagan", "Naidu"))

    def des(name: String): String = s"we are in the prcess of $name"
    println(des("datamigratoin"))


    def funify(f: String => String, thing: String): String = {
      f(thing) + " and have fun"
    }

    println(funify(des, "Jagan"))


/*
    // **********************************
    def quadruple(x: Int): Int = x * 4
    val quadrupleCopy = quadruple _
    println(quadrupleCopy(5))

    // **********************************
    def m(x: Int, y: Int): Int = {if (x > y) x else y}
    val max: (Int, Int) => Int = m
    println(max(88, 99))

    // *************

    def m90(x: Int, y: Int): Int = {if ( x > y ) x else y}
    val max90 : (Int, Int) => Int =  m90
    println("max90(8,3)" + max90(8,3))

// **********************************


        var fullName = (first: String, last: String) => {s"$first $last"}
        println(fullName("bob", "loblaw"))


// **********************************

    var min = (a: Int, b: Int) => {if (a > b) b else a}
    println(min(78, 44))
// **********************************

        val hi = () => "howdy!"
        println(hi())


        // **********************************

        def sad = "meow"
        val catCry = sad
        println(catCry)


            // **********************************

    def play(thing: String): String = {s"Let's play with $thing"}

    // ****************

    def funify(thing: String, f: String => String): String = {
      f(thing) + " and have fun"
    }

    println(funify("cats", play))


            def triple4(x: Int): Int = x * 3
            val tripleCopy4: (Int) => Int = triple4
            println(tripleCopy4(5))
*/

  }
}
