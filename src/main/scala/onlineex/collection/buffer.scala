package onlineex.collection

object buffer {

  def main(args: Array[String]): Unit = {

    // ***************

    val leaders = collection.mutable.Buffer("Reykon")
    leaders += "obama"
    println("leaders     " + leaders)  //  ArrayBuffer(Reykon, obama)

    // ***************

    val coolCreatures = collection.mutable.Buffer("hhj")
    coolCreatures += "ppp"
    println("coolCreatures     " + coolCreatures)   // ArrayBuffer(hhj, ppp)

    // ***************

    val turtles = collection.mutable.Buffer("mikey", "leo")
    turtles(0) = "donny"
    println("turtles     " + turtles)   //  ArrayBuffer(donny, leo)

    // ***************

    val fruits = collection.mutable.Buffer("apple", "orange")
    println("fruits.toList     " +fruits.toList)   // List(apple, orange)

    // ***************

    val veggies = collection.mutable.Buffer("carrots")

    veggies += "peas"
    println(veggies.last) // peas
    println("veggies     " + veggies) // carrots

    // ***************
/*
    var boringBuf = new Buffer('8b76fde713ce', 'base64');
    val result = boringBuf.toString('base64')
    // console.log(result)*/

  }

}
