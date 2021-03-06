fun getGreeting(): String? {
    //return "Hello Kotlin"
    return null
}

fun getGreetingSingleExpression() = "Hello Kotlin"

fun sayHello(){
    println(getGreeting())
}

fun main() {
    println(getGreeting())
    sayHello()
    println(getGreetingSingleExpression())
}