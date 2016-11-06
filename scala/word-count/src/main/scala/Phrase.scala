class Phrase(input: String) {

    def wordCount: Map[String, Int] = {
        val withoutCommas = replace(input)
        val splitted = withoutCommas.split(" +")
        val clean = removeSpecialChars(splitted)
        clean.groupBy(identity).mapValues(_.length)
    }

    def replace(input: String): String = {
        input.replaceAll("[\\,\\:]", " ")
    }

    def removeSpecialChars(input: Array[String]): Array[String] =
        input.map(_.toLowerCase.replaceAll("\\W", ""))

}