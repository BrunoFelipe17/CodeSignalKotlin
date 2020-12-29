package ExploringTheWaters

fun arrayChange(inputArray: MutableList<Int>): Int {
    var result = 0
    for (index in 1 until inputArray.size) {
        if (inputArray[index - 1] >= inputArray[index]) {
            val calc = Math.abs(inputArray[index - 1] - inputArray[index]) + 1
            inputArray[index] += calc
            result += calc
        }
    }

    return result
}