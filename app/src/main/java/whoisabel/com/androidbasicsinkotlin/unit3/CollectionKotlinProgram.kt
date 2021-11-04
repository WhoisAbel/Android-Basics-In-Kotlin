package whoisabel.com.androidbasicsinkotlin.unit3

fun main() {
    val numbers = listOf(1, 4, 8, 3, 0)
    numbers.forEach { println(it.toString()) }


    val functionTypes: (Int) -> Int = { a: Int -> a * 2 }
    println(functionTypes(12))


    val peopleNames = listOf("Fred", "Ann", "Barbara", "Joe")
    println(peopleNames.sorted())
    println(peopleNames.sortedWith { str1: String, str2: String -> str1.length - str2.length })


    val words = listOf(
        "about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative"
    )

    val filterWords = words
        .filter { it.startsWith("b", ignoreCase = true) }
        .shuffled()
        .take(1)

    println(filterWords)


}