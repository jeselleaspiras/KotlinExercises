import java.util.*

fun main() {

    println("Enter word to check if it's a palindrome:")
    val s = readLine()
    val sReverse = s?.reversed()

    if ( s == sReverse )
        println("$s is a palindrome!")
    else
        println("$s is not a palindrome!")

}
