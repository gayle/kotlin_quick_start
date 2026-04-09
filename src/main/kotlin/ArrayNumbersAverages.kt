// Arrays
// Write a program that defines an array of double with size of 10 and initializes its cells with random number.
// For each number in the array the program will print if it is lower or bigger than the average of the numbers on the array.
fun main (args: Array<String>) {
    var a = DoubleArray(10)
    for (i in a.indices) {
        println("${i}")
        a[i] = Math.random()
    }

    // find the average of all the numbers in the qrray
    var avg = a.average()
    println("average is $avg")

    // This is the way I originally wrote it
//    for (i in a.indices)
//        if (a[i] > avg)
//            println("${a[i]} is greater than ${avg}")
//        else if (a[i] < avg)
//            println("${a[i]} is less than ${avg}")
//        else
//            println("${a[i]} is equal to $(avg)")

    // Can also do this way, which is more succinct
    for (num in a) {
        println(
            "${num} is " + if (num > avg) "greater than ${avg}"
            else if (num < avg) "less than ${avg}"
            else "equal to ${avg}"
        )
    }
}



