package onlineex.OOPS

object CaseClasses {

  def main(args: Array[String]): Unit = {

    case class PersonData(name: String, age: Int)
    val bob = new PersonData("bob", 99000)
    val fred = bob.copy(name = "fred")
    val fred2 = bob.copy(name = "Jagan")
    println(fred2.age + " " + fred2.name)   // 99000 Jagan

    // *************
    case class PersonData2(name: String, age: Int)
    val bob1 = new PersonData2("bob", 99)
    val bob2 = new PersonData2("bob", 99)
    println(bob1 == bob2)   // true
    // *****************

    case class Dog(breed: String, age: Int)
    val fido = new Dog("lab", 4)
    println(fido.toString)   // Dog(lab,4)

    // *************

    case class Cat(color: String)
    val spanky = Cat("black")
    println(spanky.color)   // black

    // *************

  }
}