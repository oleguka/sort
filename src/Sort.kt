import Swap.swapAt

object Sort {

    fun <T : Comparable<T>> ArrayList<T>.bubbleSort(
        showPasses: Boolean = false
    ) {
        if (this.size < 2) return
        for (end in this.lastIndex downTo 1) {
            println(end)
            var swapped = false
            for (current in 0 until end) {
                if (this[current] > this[current + 1]) {
                    this.swapAt(current, current + 1)
                    swapped = true
                }
            }
            if (showPasses) println(this)
            if (!swapped) return
        }
    }

    fun <T : Comparable<T>> ArrayList<T>.shakerSort(
        showPasses: Boolean = false
    ) {
        if (this.size < 2) return

        var left = 0
        var right = this.lastIndex
        do {
            for (i in left until right) {
                if (this[i] > this[i + 1]) {
                    this.swapAt(i, i + 1)
                }
            }
            right--
            for (i in right downTo left + 1) {
                if (this[i] < this[i - 1]) {
                    this.swapAt(i, i - 1)
                }
            }
            left++
            if (showPasses) println(this)
        } while (left < right)
    }
}