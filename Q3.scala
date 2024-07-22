object StringFormatter {
  // Method to convert a string to uppercase
  def toUpper(str: String): String = str.toUpperCase

  // Method to convert a string to lowercase
  def toLower(str: String): String = str.toLowerCase

  // Method to format a name using a provided formatting function
  def formatNames(name: String)(formatFunction: String => String): String = formatFunction(name)

  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    println(formatNames("Benny")(toUpper))         
    println(formatNames("Niroshan")(name => 
      name.substring(0, 2).toUpperCase + name.substring(2)))  
    println(formatNames("Saman")(toLower))        
    println(formatNames("Kumara")(name => 
      name.substring(0, 1).toUpperCase + name.substring(1, 5) + name.substring(5).toUpperCase))  
  }
}
