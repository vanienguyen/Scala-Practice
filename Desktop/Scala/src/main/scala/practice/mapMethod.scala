package practice

object SalaryRaiser {

  def doubleUp(numbers: List[Int]): List[Int] =
    numbers.map(number => number * 2)


  def divideByTwo(numbers: List[Int]): List[Double] =
    numbers.map(number => number / 2.0)
}


object mapMethod {
  def main(args: Array[String]) : Unit = {

    val numbers = List(10, 20, 30)

    val firstNewNumbers = SalaryRaiser.doubleUp(numbers);
    println(firstNewNumbers)

    val secondNewNumbers = SalaryRaiser.divideByTwo(numbers);
    println(secondNewNumbers)
  }

}
