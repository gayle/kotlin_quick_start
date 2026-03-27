import javax.imageio.stream.ImageInputStream

// When
// Write a program that generates a random number between 1 and 12.
// The program prints the month name for the month represented by the number.
// For example the number one, "January" would be printed.
fun main (args: Array<String>) {
    var numericMonth = (Math.random() * 12).toInt() + 1
    var textMonth = when(numericMonth) {
        1 -> "January"
        2 -> "February"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "August"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        12 -> "December"
        else -> "N/A"
    }
    println("$numericMonth is $textMonth")
}