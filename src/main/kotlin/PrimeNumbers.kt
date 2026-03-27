// Loops
// Write a program that generates a random number between 2 and 1000
// The program will print on the screen all prime numbers between 2 and this number.
// A prime number can be divided only by one and by itself.
// For example, the numbers 3, 5, 13 are all primes.
fun main (args: Array<String>) {
    //var num = 20
    var num = (Math.random() * 2000).toInt() + 1
    for(n in 1..num) {
        var isPrime = true
        for(i in 2..n-1)
              // isPrime = if(n % i == 0) false else true // That's wrong b/c it doen't 'break'
              if(n % i == 0) {
                  isPrime = false
                  break
              }
        if (isPrime) {
            println("$n is prime")
        }
    }
}

