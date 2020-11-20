fun main() {

    println("Enter word to print duplicates:")
    val s = readLine()
    val set = mutableSetOf<Char>()
    val dup = mutableSetOf<Char>()

    if (s != null) {
        for (i in s.toCharArray()) {
            if (set.contains(i))
                dup.add(i)
            else
                set.add(i)
        }
    }

    for (letter in dup)
        print("$letter ")

}