import java.util.*

// recursion
var count = 0
fun rec(){
    count++
    if (count<=3) {
        print("$count... ")
        rec()
    }
}

fun main() {

    rec()
    val names = listOf("Jeselle", "Justin", "Yuxi")
    println("Here's a list: ")
    for ((index, value) in names.withIndex()) {
        print("[$index: $value] ")
    }

    println("Enter your name:")
    val name = readLine()
    println("Enter your age:")
    val read = Scanner(System.`in`)
    val age = read.nextInt()
    println("Your name is $name and your age is $age")

    println("Enter 1 to 7 :")
//    val num: Int = Integer.valueOf(readLine())
    val num = read.nextInt()
    val numProvided = when(num) {
        1->"Sunday"
        2->"Monday"
        3->"Tuesday"
        4->"Wednesday"
        5->"Thursday"
        6->"Friday"
        7->"Saturday"
        else->"Invalid number!"
    }
    println("You provided $numProvided")

}