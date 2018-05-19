package practice


object mapMethod {
  def main(args: Array[String]) : Unit = {

    // map
//    val numbers = List(10, 20, 30)
//
//    val firstNewNums = numbers.map{(number: Int) => number*2}
//    println(firstNewNums)
//
//    val secondNewNums = numbers.map{(number: Int) => number*2.0};
//    println(secondNewNums)

    // flatMap
    val numbers = List(1, 4, 9)

    val firstNewNums = numbers.flatMap{number => List(number, number + 1)}
    println(firstNewNums)

    val secondNewNums = numbers.flatMap{number => if (number > 5) List() else List(number)}
    println(secondNewNums)




  }

}
