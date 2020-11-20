fun main() {

    println("Enter a sentence: ")
    val s = readLine()
    val words = s?.split(" ")
    val hMap = mutableMapOf<Int, String>()

    if (words != null)
        for ((index, word) in words.withIndex())
            hMap.put(index, word)

    println("HashMap: $hMap")
    println("Number of Words: ${hMap.size}")

}