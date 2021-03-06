fun newSayHello(greeting: String, itemsToGreet:List<String>) {
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun newSayHelloVarArg(greeting: String, vararg itemsToGreet:String) {
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}



fun main() {
    val interestingThings = listOf("Basketball", "Soccer", "Playing")
    var arrayInterestingThings = arrayOf("Travel",  "Eating", "Biking")
    newSayHello("Hello", interestingThings)
    newSayHelloVarArg("Hello")
    newSayHelloVarArg("Hello", "Java")
    newSayHelloVarArg("Hi", *arrayInterestingThings)
}

// * to pass a collection as a var arg argument

