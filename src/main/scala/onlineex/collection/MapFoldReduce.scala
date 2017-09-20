package onlineex.collection


object MapFoldReduce {

  def main(args: Array[String]): Unit = {

    var stringNums = List("4", "10", "13")

    println {
      stringNums.map((n: String) => n.toInt)
    }

    // ***************
// Cube every element in the following list.
    var goats = List(3, 2)
    println {
      goats.map { (num) =>
        scala.math.pow(num, 3)
      }
    }     // List(27.0, 8.0)

    // ***************

    var odds = List(1, 5, 7)

    println {
      odds.foldLeft(0) { (memo: Int, num: Int) =>
        memo + num
      }
    }

    // ***************
// Find the longest string in the following array.
    var names = List("tuco", "jesse", "hank", "gustavo")

    println {
      names.reduceLeft { (s1: String, s2: String) =>
        if (s1.length > s2.length) s1 else s2
      }
    }
    // ***************
// Concatenate the strings in the following list using the foldLeft function.
    var letters = List("g", "o", "a", "t")

    println {
      letters.foldLeft("") { (memo: String, letter: String) =>
        memo + letter
      }
    }

    // ***************
// Loop through the following list from right to left and concatenate all of the letters. The answer should be cool
    var huh = List("l", "o", "o", "c")

    println {
      huh.foldRight("") { (letter: String, memo: String) =>
        memo + letter
      }
    }
    // ***************
    //Use the reduceLeft function with the following list to create a string that is separated by commas (the result should be "brazil, argentina, colombia").
    var countries = List("brazil", "argentina", "colombia")

    println {
      countries.reduceLeft[String] { (c1: String, c2: String) =>
        s"$c1, $c2"
      }
    }

    // ***************
// Return an array that uppercases all of the letters in the following list.
    var me = List("i", "am", "quiet")

    println {
      me.map { (word: String) =>
        word.toUpperCase
      }
    }

    // ***************
  // Sum all of the even numbers in the following list.
    var whatever = List(1, 2, 3, 4, 5, 6, 7)

    println {
      whatever.foldLeft(0) { (memo: Int, num: Int) =>
        if (num % 2 == 0) memo + num else memo
      }
    }

    // *****************
  //   Concatenate all the words in the following list that start with the letter "b". Seperate each word with a space.

    var rrr = List("bnt", "beer", "battered", "cool", "burger")

    rrr.filter { (w: String) =>
      w.take(1) == "b"
    }
      .reduceLeft { (a: String, b: String) =>
      s"$a $b"
    }
  }
}
