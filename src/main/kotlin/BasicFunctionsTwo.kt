fun sayHello(greeting: String,itemToGreet:String) = "$greeting $itemToGreet"

fun main() {
    println(sayHello("Hello","Kotlin"))
    println(sayHello("Hi","World"))
}