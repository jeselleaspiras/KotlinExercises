fun main()
{
    println("Enter your name:")
    val name = readLine()
    println("Enter your age:")
    var age: Int = Integer.valueOf(readLine())
    println("Your name is $name and your age is $age")
    println("Enter 1 to 7:")
    var num: Int = Integer.valueOf(readLine())
    var numProvided = when(num){
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
