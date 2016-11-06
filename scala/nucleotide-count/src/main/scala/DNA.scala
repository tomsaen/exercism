/**
  * Created by thomas.mueller on 05/11/16.
  */

class DNA(input: String) {

    val validNucs = Set('A', 'C', 'G', 'T')

    val normalized = input.toCharArray

    def count(nuc: Char): Either[String, Int] = {
      val counts = nucleotideCounts

      counts match {
        case Left(x) => Left(x)
        case Right(x) =>
          if (x.contains(nuc)) Right(x(nuc))
          else Left(s"invalid nucleotide '$nuc'")
      }
    }

    def nucleotideCounts: Either[String, collection.mutable.Map[Char, Int]] = {
      val counts = collection.mutable.Map[Char, Int]('A' -> 0, 'C' -> 0, 'G' -> 0, 'T' -> 0)
      for (nuc <- normalized) {
        if (!validNucs.contains(nuc)) return Left(s"invalid nucleotide '$nuc'")
        else counts(nuc) += 1
      }
      Right(counts)
    }
}
