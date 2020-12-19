package EdgeOfTheOcean

import kotlin.math.abs

/*
Ratiorg got statues of different sizes as a present from CodeMaster for his birthday,
each statue having an non-negative integer size.
Since he likes to make things perfect, he wants to arrange them from smallest to
largest so that each statue will be bigger than the previous one exactly by 1.
He may need some additional statues to be able to accomplish that.
Help him figure out the minimum number of additional statues needed.
 */

//fun makeArrayConsecutive2(statues: MutableList<Int>): Int {
//    if (statues.size < 2) return 0
//
//    var counter = 0
//
//    statues.sort()
//
//    for (index in 0 until statues.size - 1) {
//        val calc = abs(statues[index] - statues[index + 1])
//        if (calc > 1) counter += calc - 1
//    }
//    return counter
//}


// Refactor

fun makeArrayConsecutive2(statues: MutableList<Int>): Int {
    statues.sort()
    return statues[statues.lastIndex] - statues[0] - statues.size + 1
}