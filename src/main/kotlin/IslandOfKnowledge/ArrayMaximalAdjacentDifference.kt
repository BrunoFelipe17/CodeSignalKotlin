package IslandOfKnowledge

fun arrayMaximalAdjacentDifference(inputArray: MutableList<Int>): Int {

    var result = 0

    for (i in 1 until inputArray.size) {
        result = kotlin.math.max(result, kotlin.math.abs(inputArray[i] - inputArray[i - 1]))
    }

    return result
}
