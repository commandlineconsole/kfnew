package onlineex.collection

object Maps {

  def main(args: Array[String]): Unit = {

    // ************************

    val simple = Map(
      "r" -> "red", "g" -> "green")
    println(simple("g"))     // green

    // ************************

    val airport = Map("jfk" -> "new york", "lga" -> "new york")
   // println(airport("lax"))
    println(airport("jfk"))  // New York

    // ************************

    val player = Map("skates" -> "bauer", "stick" -> "nike")
    println(player.contains("stick"))  // true

    // ************************

    val cool = Map("a" -> "aaa", "b" -> "bbb", "a" -> "ccc", "a" -> "ccc123")
    println(cool("a"))   // ccc123

    // ************************

    val numbers = Map(1 -> "one", 2 -> "two", 3 -> "three")
    val odds = numbers - 3
    println(odds)     //  Map(1 -> one, 2 -> two)

    // ************************

    val some = Map(23 -> "twenty three")
    val more = some + (8 -> "eight")
    println(more)  // Map(23 -> twenty three, 8 -> eight)

    // ************************

/*    val shoes = collection.mutable.Map("jordan" -> "nike")
    shoes += ("griffey" -> "nike")
    println(shoes)*/


/*
        val animals = Map("fox" -> "sly")
         animals += ("cheetah" -> "fast")
        println(animals)
    */

    val birthYears = Map("lebron" -> 1984, "jordan" -> 1963)

    val yearSum =
      birthYears.foldLeft(0) {
        case ( memo: Int, (name: String, year: Int))
      =>  memo + year
    }

    println(yearSum / birthYears.size)  // 1973
    println(yearSum)                  // 3947
    println(birthYears.size)          // 2
    println(birthYears)               // Map(lebron -> 1984, jordan -> 1963)

  }
}
