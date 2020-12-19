package EdgeOfTheOcean

/*
Given a sequence of integers as an array, determine whether
it is possible to obtain a strictly increasing sequence by
removing no more than one element from the array.

Note: sequence a0, a1, ..., an is considered to be a strictly
increasing if a0 < a1 < ... < an. Sequence containing only one
element is also considered to be strictly increasing.
 */

fun almostIncreasingSequence(sequence: MutableList<Int>): Boolean {
    var errorGreater = 0
    var errorEqual = 0

    for (index in 0 until sequence.size - 1) {
        if (sequence[index] >= sequence[index + 1]) {
            errorGreater++
        }

        if (index > 0) {
            if (sequence[index - 1] >= sequence[index + 1]) {
                errorEqual++
            }
        }
    }
    return errorGreater == 1 && errorEqual <= 1
}
