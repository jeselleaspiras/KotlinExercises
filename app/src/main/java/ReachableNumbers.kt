/**
 * Let's denote a function f(x) in such a way: we add 1 to x,
 * then, while there is at least one trailing zero in the resulting number,
 * we remove that zero.
 */

tailrec fun removeZeroes(x: Int): Int =
        if (x % 10 == 0) removeZeroes(x / 10) else x

fun f(x: Int) = removeZeroes(x + 1)

fun main() {
    println("Enter an integer:")
    var n = readLine()!!.toInt() // read integer from the input
    val reached = HashSet<Int>() // a mutable hash set
    while (reached.add(n)) n = f(n) // iterate function f
    println(reached.size) // print answer to the output
}