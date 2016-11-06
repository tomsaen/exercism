object Hamming {

  def compute(left: String, right: String): Option[Int] = {
    if (left.length != right.length) None
    else Some(left.zip(right).filter(t => t._1 != t._2).length)
  }
}
