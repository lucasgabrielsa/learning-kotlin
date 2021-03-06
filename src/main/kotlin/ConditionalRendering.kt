val engineerName = "Lucas"
var greetingIntro: String? =  null

fun main() {
    //greetingIntro = "Hello"
    if(greetingIntro != null) {
        println(greetingIntro)
    } else {
        println("Hi")
    }
    println(engineerName)

    when(greetingIntro) {
        null -> println("greetingIntro is Null")
        else -> println("greetingIntro is not Null")
    }

    //printing variable in another file?
    println(name)

    val greetingToPrint = if(greetingIntro != null) greetingIntro else "Hi again"
    val greetingToPrintTwo = when (greetingToPrint) {
        null -> "Hi"
        else -> greetingToPrint
    }
    println(greetingToPrint)
    println(greetingToPrintTwo)
}