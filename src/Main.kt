import Sort.shakerSort

fun main() {
    val list = arrayListOf(9, 4, 5, 6, 7, 2, 8, 1, 3)
    println("Original: $list")
    list.shakerSort(true)
    println("Shaker sorted: $list")
}