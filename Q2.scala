object PatternMatchingApp {
  def main(args: Array[String]): Unit = {
    if (args.length != 1) {
      println("Please provide exactly one integer argument.")
    } else {
      try {
        val input = args(0).toInt
        val result = input match {
          case x if x <= 0 => "Negative/Zero is input"
          case x if x % 2 == 0 => "Even number is given"
          case _ => "Odd number is given"
        }
        println(result)
      } catch {
        case e: NumberFormatException => println("Please provide a valid integer.")
      }
    }
  }
}
