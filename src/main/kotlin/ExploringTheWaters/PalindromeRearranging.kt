package ExploringTheWaters

fun palindromeRearranging(inputString: String) =
    inputString.toSet().filter { c ->
        inputString.count { it == c} % 2 == 1 }
        .count() < 2
