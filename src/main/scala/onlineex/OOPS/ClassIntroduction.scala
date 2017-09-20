package onlineex.OOPS

object ClassIntroduction {

  def main(args: Array[String]): Unit = {

    // ***********************

    class User(n: String) {
      val name: String = n
    }
    var u = new User(n = "Frank")
    println(u.name)  // Frank

    // ***********************

    class Carrot(val flavor: String)

    var c = new Carrot(flavor = "weird")

    println(c.flavor)  // weird

    // ***********************

    class Cat(val name: String) {
      def greet: String = {
        s"My name is $name"
      }
    }

    var myCat = new Cat(name = "darla")
    println(myCat.greet)  // My name is darla

    // ***********************

    class Singer(var alias: String)

    var singers = List(
      new Singer("miley"),
      new Singer("bradley")
    )

    println {
      singers map (_.alias)
    }                                // List(miley, bradley)

    // ***********************


    class A { def hi = "Hello from A" }
    class B extends A

    var bInstance = new B    // new instance

    println {
      bInstance.hi         // Hello from A
    }

    // ***********************

    class Tree { def about = "I am made of wood" }
    class Pine extends Tree { override def about = super.about + " and sticky!"}

    var aPine = new Pine
    println(aPine.about)     // I am made of wood and sticky!

    // ***********************

    class Mango(var status: String) {

      def updateStatus(s: String): Unit = {
        status = s
      }
    }

    var myMango = new Mango("ripe")
    println(myMango.status)

    myMango.updateStatus("rotten")
    println(myMango.status)   // rotten

    // ***********************


    class Kitchen(var color: String, val floorType: String = "tile") {

      def describe = {
        s"The kitchen has $floorType floors"
      }
    }

    var myKitchen = new Kitchen("purple")
    println(myKitchen.describe)   //  The kitchen has tile floors

    // ***********************

    class Person(var firstName: String, var lastName: String) {

      def fullName = {
        s"$firstName $lastName"
      }
    }

    var bob = new Person("bob", "loblaw")
    println(bob.fullName)   //  bob loblaw

  }
}
