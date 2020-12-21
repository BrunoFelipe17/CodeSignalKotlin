package EdgeOfTheOcean

/*
After becoming famous, the CodeBots decided to move into a new building together.
Each of the rooms has a different cost, and some of them are free,
but there's a rumour that all the free rooms are haunted!
Since the CodeBots are quite superstitious, they refuse to stay in any of
the free rooms, or any of the rooms below any of the free rooms.

Given matrix, a rectangular matrix of integers, where each value
represents the cost of the room, your task is to return the total
sum of all rooms that are suitable for the CodeBots
(ie: add up all the values that don't appear below a 0).
 */

fun matrixElementsSum(matrix: MutableList<MutableList<Int>>): Int {
    var sum = 0

    for (i in 0 until matrix[0].size) {
        var calc = 0
        for (j in matrix.size - 1 downTo 0) {
            calc = if (matrix[j][i] == 0) 0 else matrix[j][i] + calc
        }
        sum += calc
    }

    return sum
}