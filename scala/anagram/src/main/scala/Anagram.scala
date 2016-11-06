/**
  * Created by thomas.mueller on 04/11/16.
  */
class Anagram(input: String) {

    val original = input.toLowerCase
    val chars = normalize(input)

    def normalize(s: String): List[Char] = s.toLowerCase.toList.sorted

    def matches(candidates: Seq[String]): Seq[String] = {
        candidates.filter({ item =>
            if (item.toLowerCase == original)
                false
            else {
                val norm = normalize(item)
                norm == chars
            }
        }).toSet.toList
    }
}
