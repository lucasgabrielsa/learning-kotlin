fun printFilteredStrings(list: List<String>, predicate: (String) -> Boolean) {
    list.forEach {
        if(predicate(it)) {
            println(it)
        }
    }
}

fun printFilteredStringsWithNullOption(list: List<String>, predicate: ((String) -> Boolean)?) {
    list.forEach {
        if(predicate?.invoke(it) == true) {
            println(it)
        }
    }
}

fun getPrintPredicate(): (String) -> Boolean {
    return { it.startsWith("J")}
}

fun main() {
    val listProgrammingLanguages = listOf("Kotlin", "Java", "Go")
    val myFunction = fun(filter:String): Boolean {
        return filter.equals("Go", true)
    }

    val newFunction = fun(filter:String, search: String): Boolean {
        return filter.equals(search, true)
    }

    printFilteredStrings(listProgrammingLanguages, myFunction)
    printFilteredStrings(listProgrammingLanguages,fun(filter:String): Boolean {
        return filter.equals("Go", true)
    })
    printFilteredStrings(listProgrammingLanguages) {
        it.startsWith("K")
    }

    printFilteredStringsWithNullOption(listProgrammingLanguages, null)
    println("-------------------------------------------")

    printFilteredStrings(listProgrammingLanguages, getPrintPredicate())
}


