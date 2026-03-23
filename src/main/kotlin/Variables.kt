fun main(args : Array<String>) {
    // val x        // compiler error
    val x = 2       // inferred type
    val y : Int     // declared type
    val z : Int = 2 // type declaration is unnecessary
    // val w : Int = 4.6 // compiler error, no implicit casting
}