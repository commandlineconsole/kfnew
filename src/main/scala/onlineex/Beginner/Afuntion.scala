package onlineex.Beginner

object Afuntion {

  def main(args: Array[String]): Unit = {

    def triple(x: Int): Int = x * 3
    val tripleCopy: (Int) => Int = triple
    println(tripleCopy(5))
// **********************************
def quadruple(x: Int): Int = x * 4
    val quadrupleCopy = quadruple _
    println(quadrupleCopy(5))
// **********************************
def m(x: Int, y: Int): Int = {if (x > y) x else y}
    val max: (Int, Int) => Int = m
    println(max(88, 99))

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

    def funify(thing: String, f: String => String): String = {
      f(thing) + " and have fun"
    }
    println(funify("cats", play))

    def triple2(x: Int): Int = x * 3
    val tripleCopy2: (Int) => Int = triple2
    println(tripleCopy2(5))

    // **********************************

  }
}
