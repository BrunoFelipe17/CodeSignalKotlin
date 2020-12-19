package EdgeOfTheOcean

/* Given an array of integers, find the pair of adjacent elements that
has the largest product and return that product. */

fun adjacentElementsProduct(inputArray: MutableList<Int>): Int {
    var max = Int.MIN_VALUE

    for (index in 0 until inputArray.size - 1) {
        val multiplicationResult = inputArray[index] * inputArray[index + 1]
        if (multiplicationResult > max) {
            max = multiplicationResult
        }
    }

    return max
}