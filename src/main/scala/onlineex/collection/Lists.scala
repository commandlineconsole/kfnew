package onlineex.collection

object Lists {
  def main(args: Array[String]): Unit = {


    val people = List("lebron", "messi", "ke$ha")
    println(people.size)

    val lyrics = List("all", "that", "i", "know")
    println(lyrics.head)

    //****************
    val future = List("soon", "i'll", "be", "60 years old")
    println(future.tail)

    //****************
    val spanish = List("como", "j", "balvin", "va")
    println(s"${spanish(1)} ${spanish(2)} boboo")



    // ****************

    val numbers = List(11, 22, 33)
    var total = 0

    for (i <- numbers) {
      total += i
    }
    println(total)

    val sumup = Map( )

    // ****************

    val odds = List(2, 2, 2)
    var result = 0
    odds.foreach( (num: Int) => result += num )
    // odds.foreach( (num: Int) => _ + _)


    //odds.foreach( (num: Int) => result = num )  //
    println(result)


    /*
    // ****************

    val singers = List("shakira", "nicky jam")
    var result2 = singers.map( (s: String) => s"$s is cool" )
    println(result2)
    // ****************

    val evens = List(2, 4, 8)
    println {
     evens.foldLeft(10) { (memo: Int, y: Int) =>
       memo + y

     }
    }
*/

}
}
