/**
  * Created by thomas.mueller on 04/11/16.
  */
object Pangrams {
    val letters = 'a' to 'z'

    def isPangram(input: String): Boolean = {
        input.replaceAll("[^a-zA-Z]", "").map(_.toLower).toSet.size == letters.length
    }

}
