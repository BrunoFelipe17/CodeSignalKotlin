package SmoothSailing

/*
Some people are standing in a row in a park.
There are trees between them which cannot be moved.
Your task is to rearrange the people by their heights
in a non-descending order without moving the trees.
People can be very tall!


Example

For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
sortByHeight(a) = [-1, 150, 160, 170, -1, -1, 180, 190].
 */

fun sortByHeight(a: MutableList<Int>): MutableList<Int> {
    val newList: MutableList<Int> = a.filter { it >= 0 }.sorted().toMutableList()

    return a.map {
        when (it) {
            -1 -> -1
            else -> newList.removeAt(0)
        }
    }.toMutableList()
}
