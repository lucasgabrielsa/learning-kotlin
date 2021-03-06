fun main() {
    val interestingThings = listOf("Basketball", "Kotlin", "Programming")

    val mutableInterestingThings = mutableListOf("Basketball", "Kotlin", "Programming")
    mutableInterestingThings.add("Playing With My Daughter")

    interestingThings.forEach {it -> println(it)}
    mutableInterestingThings.forEach {it -> println(it)}

    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    val mutableMap = mutableMapOf(1 to "a", 2 to "b", 3 to "c")

    map.forEach { (key, value) -> println("$key -> $value")  }
}