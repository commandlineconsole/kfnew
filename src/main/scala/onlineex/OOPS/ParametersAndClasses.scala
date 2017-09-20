package onlineex.OOPS

object ParametersAndClasses {

  def main(args: Array[String]): Unit = {

/*    object Whatever {
      def speak(something: String)(implicit nice: String) = {
        println(s"$something $nice")
      }
    }

    println {
      Whatever.speak("I am ")("a surfer dude")
    }

    // ****************

    object Whatever2 {
      def speak(something: String)(implicit nice: String) = {
        println(s"$something $nice")
      }
  }

    implicit val nice = "the walrus"

    println {
      Whatever.speak("I am")
    }
    println {
      Whatever.speak("I like")("catfood")
    }*/

/*
    // ****************

    object Omg {
      def speak(implicit emotion: String) = {
        println(s"Pikachu is $emotion")
      }
    }

    implicit val abcdefg = "confused"
    Omg.speak
    Omg.speak("Jagan")

    def evil(implicit scared: String) = {
      println(s"Scala is $scared")
    }

    evil
    evil("cool")

    // ************
*/

  /*  object StringUtils {

      implicit class Better(val x: String) {
        def fun = {
            s"$x is fun!"
        }
      }

    }

    import StringUtils._
    println("bob".fun)
    // println("bob".fun)
  //  println(Better("Jagan"))
    println("bob".fun)

    // ***********************

    object IntUtils {
      implicit class Calculator(val num: Int) {
        def add(n: Int) = {
          num + n
        }
      }
    }

    import IntUtils._
    println(4.add(5))

    // ****************************/

    object DoubleUtils {
      // implicit class Funny(val num: Double, joke: String) {
      implicit class Funny(val num: Double) {    // implicit class won't accept two parameters
        def knockKnock = {
          s"${num.toString} is here"
        }
      }
    }

    import DoubleUtils._
    println(3.14.knockKnock)

    // ************************
  }

}
