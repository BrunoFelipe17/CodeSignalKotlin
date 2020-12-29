package ExploringTheWaters

fun areSimilar(a: MutableList<Int>, b: MutableList<Int>): Boolean {
    return a.sorted() == b.sorted() && a.zip(b).filter { it.first != it.second }.count() < 3
}