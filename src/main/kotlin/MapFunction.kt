// Lambda Expressions
// Write a function called "map". The function would get an array of integers, and a function, called the "mapping function"
// The function would return an array containing the elements of the input array, after it was passed to teh mapping function
fun main (args: Array<String>) {
    var arr = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("initial list is ${arr.asList()}")
    var result = map(arr, {x -> x * 3})
    print("result is ${result.asList()}")
}

fun map(arr: IntArray, op: (Int) -> Int) : IntArray{
    var result = IntArray(arr.size)
    for(index in arr.indices)
        result[index] = op(arr[index])
    return result
}