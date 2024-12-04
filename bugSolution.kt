fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val toRemove = mutableListOf<Int>()
    list.forEach { if (it % 2 == 0) toRemove.add(it) }
    toRemove.forEach { list.remove(it) }
    println(list)
}