package onlineex.OOPS


object AbstractClassesOverloadingMethodsApply {
  def main(args: Array[String]): Unit = {

    abstract class Mammal {
      val warmBlooded: Boolean = true
    }

    class Pig extends Mammal

    var missPiggy = new Pig

    println(missPiggy.warmBlooded)   // true

    // ******************
// method overloading

    class Whatever {
      def aaa(s: String): String = {
        "I like words"
      }
      def aaa(i: Int): String = {
        "Numbers are fun"
      }
    }

    var w = new Whatever
    println(w.aaa("hi"))  // I like words
    println(w.aaa(34))   // Numbers are fun

    // ******************

    class Cloud {
      def apply() = {
        "floating"
      }
    }

    var c = new Cloud
    println(c.apply())  // floating

    //*****************
    //
    class Star {
      def apply() = {
        "shining"
      }
    }

    var s = new Star
    println(s())     // shining
  }

}
