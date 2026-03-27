import kotlin.math.pow
// Variables and Arithmetic / Strings
// Write a program that generates a random circle radius between 1 and 10
// and calculates the circle's area.
fun main(args : Array<String>) {
    val radius = Math.random() * 10
    println("radius = $radius")
    // val area = Math.PI * (radius * radius)
    val area = Math.PI * (radius.toDouble().pow(2))
    println("area = $area")
}