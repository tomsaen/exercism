object SumOfMultiples {

  def sumOfMultiples(values: List[Int], max: Int): Int = {
    val mults = Range(1, max).filter(number =>
      values.exists(number % _ == 0)
    ).sum
  }
}
