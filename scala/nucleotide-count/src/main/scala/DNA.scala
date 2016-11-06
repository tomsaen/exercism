/**
  * Created by thomas.mueller on 05/11/16.
  */
class DNA(input: String) {

    val validNucs = Set('A', 'C', 'G', 'T')

    val counts = input.toCharArray.groupBy(identity).mapValues(_.size)

    val nucCounts = validNucs.map(char => (char, counts.getOrElse(char, 0))).toMap

    def count(nuc: Char): Either[String, Int] = {
        println(nucCounts)
        if (nucCounts.contains(nuc))
            Right(nucCounts(nuc))
        else
            Left(s"invalid nucleotide '$nuc'")
    }

    def nucleotideCounts: Either[String, Map[Char, Int]] = Left("Not implemented yet")

}
