import java.util.*

fun main() {

    var n1 = 0
    var n2 = 1

    println("Enter number of terms:")
    val read = Scanner(System.`in`)
    val n = read.nextInt()

    for (i in 1..n) {
        print("$n1 ")

        val sum = n1 + n2
        n1 = n2
        n2 = sum
    }

}