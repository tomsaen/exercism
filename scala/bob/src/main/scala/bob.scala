class Bob {
  def hey(input: String): String = {
    val trimmed = input.trim
    if (trimmed.isEmpty) "Fine. Be that way!"
    else if (trimmed.exists(_.isLetter) && trimmed.toUpperCase == input) "Whoa, chill out!"
    else if (trimmed.endsWith("?")) "Sure."
    else "Whatever."
  }
}
