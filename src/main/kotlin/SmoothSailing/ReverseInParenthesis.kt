package SmoothSailing

// Write a function that reverses characters in (possibly nested) parentheses in the input string.

fun reverseInParentheses(inputString: String): String {
    var result = inputString
    var openParenthesisIndex = result.lastIndexOf('(')

    while (openParenthesisIndex != -1) {
        // First we need to get the last open parenthesis,
        // then we need to find the correspondent close parenthesis using the 'indexOf' from the
        // open parenthesis index

        val closeParenthesisIndex = result.indexOf(')', openParenthesisIndex)

        result = result.replace(
            result.substring(openParenthesisIndex, closeParenthesisIndex + 1),
            result.substring(openParenthesisIndex + 1, closeParenthesisIndex).reversed()
        )

        openParenthesisIndex = result.lastIndexOf('(')
    }

    return result
}