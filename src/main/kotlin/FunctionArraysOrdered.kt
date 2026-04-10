// Function Declaration and Usage
// Write a function that accepts an ary of int, and returns true if the array is ordered.
// Accpet a second default param that determines if they array is sorted in asc or desc order.
fun main (args: Array<String>) {
    var arr = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(is_ordered(arr))
    println(is_ordered(arr, false))
}

fun is_ordered(list: IntArray, asc: Boolean = true) : Boolean {
    // var max = if(a > b) a else b
    var sorted_list = if(asc) list.sortedArray() else list.sortedArrayDescending()
    return list.contentEquals(sorted_list)
}



