fun main() {
    val list = listOf("Java", "Kotlin", "C++", "Go", "Javascript", null)
    val listResult =
        list
        .filterNotNull()
        .take(3)
//        .filter {
//            it.startsWith("J")
//        }
//        .map {
//            it.length
//        }
        .associate {
            it to it.length
        }
        .forEach {
            println("${it.key} == ${it.value}")
        }


    val language = list.first();
    println(language)
    val lastLanguageNonNull = list.filterNotNull().last()
    println(lastLanguageNonNull)

    val notFoundLanguage = list.filterNotNull().findLast { it.startsWith("foo") }.orEmpty()
    println(notFoundLanguage)

}