package ExploringTheWaters

fun alternatingSums(a: MutableList<Int>): MutableList<Int> {
    val sum = arrayOf(0, 0)

    a.mapIndexed { index, value ->
        if (index % 2 == 0) {
            sum[0] += value
        } else {
            sum[1] += value
        }

    }

    return sum.toMutableList()
}