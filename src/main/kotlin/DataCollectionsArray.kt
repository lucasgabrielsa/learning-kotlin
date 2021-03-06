fun main() {
    val interestingThings = arrayOf("Basketball", "Kotlin", "Programming")

    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(0))

    for(interestingThing in interestingThings) {
        println(interestingThing)
    }

    println("--------------------------------------")

    interestingThings.forEach {  interestingThing -> println(interestingThing) }

    println("--------------------------------------")

    interestingThings.forEachIndexed { index, interestingThing ->
        println("$interestingThing at index $index")
    }
}