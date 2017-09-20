package onlineex.OOPS

object SingletonObjectsTraits {

  def main(args: Array[String]): Unit = {

    object Hello {
      def speak = "sup"
    }

    println(Hello.speak)

// *******************
class Pikachu {
  def superpower = "electricity"
}

    var p = new Pikachu   // Object can not be extended.
    println(p.superpower)

    // *******************

    class Simpson {
      var color = "yellow"
    }

    object Bart extends Simpson {
      def speak = {
        s"I am $color"
      }
    }

    println(Bart.speak)   // I am yellow

    // ****************

    object Cake {
      var base = "cookies"
      var sauce = "peanut butter"
      def apply() = {
        s"Give me $base and $sauce"
      }
    }
    println(Cake())   // Give me cookies and peanut butter

    // *********

    trait Cool {
      var speak = "I am groovy"
    }

    object JoeCamel extends Cool

    println(JoeCamel.speak)   // I am groovy

// *************

    trait Hyper {
      var how = "Give caffeine"
    }

    class Coffee extends Hyper

    var myCup = new Coffee
    println(myCup.how)   // Give caffeine

    // *****************
    trait Speed {
      def run = {
        "really fast"
      }
    }

    trait Jump {
      def leap = {
        "really high"
      }
    }

    object Spiderman extends Speed with Jump {
      def describe = {
        s"I can run $run and jump $leap"
      }
    }

    println(Spiderman.describe)

    // *************************
    class Diva {     // object, trait can't instanciated
      var attitude = "horrible"
    }

    var arianaGrande = new Diva

    println(arianaGrande.attitude)
    // **********
    trait X {
      var yyy = "hi"
    }

    trait Y {
      var yyy1 = "bye"
    }

    object Moo extends X with Y
    println(Moo.yyy)

// *************

  }
}
