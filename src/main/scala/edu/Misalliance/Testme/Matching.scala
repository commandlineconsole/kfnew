package edu.Misalliance.Testme


object Matching {
  def main(args: Array[String]): Unit = {

    def bigger(o: Any): Any = {
      o match {
        case i: Int if i < 0 => i - 1
        case i: Int => i + 1
        case d: Double if d < 0.0 => d - 0.1
        case d: Double => d + 0.1
        case text: String => text + "s"
      }
    }

   println( bigger(0.9))

    case class Calculator(brand: String, model: String)

    def calcType(calc: Calculator) = calc match {
      case _ if calc.brand == "HP" && calc.model == "20B" => "financial"
      case _ if calc.brand == "HP" && calc.model == "48G" => "scientific"
      case _ if calc.brand == "HP" && calc.model == "30B" => "business"
      case _ => "unknown"
    }

    val hp20b = Calculator("HP", "20B")

   // case Calculator(_, _) => "Calculator of unknown type"

    println(calcType(hp20b))



  }

}
