// Conditionals
// Write a program that generates 3 random integers between 0 and 20
// Decide if the three numbers can form a valid triangle.
fun main(args: Array<String>) {
    var a = (Math.random()*20).toInt()
    var b = (Math.random()*20).toInt()
    var c = (Math.random()*20).toInt()

    var result = if ((a+b) > c && (b+c)>a && (c+a)>b) "it is valid" else "it is not valid"
    println("a = $a, b = $b, c = $c, result = $result")
}