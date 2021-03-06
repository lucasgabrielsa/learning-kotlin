val name: String = "Lucas Gabriel"
var greeting:String = "Hello"
var nameCanBeNull: String? = null
var notTypedString = "Teste"


fun main() {
    var nameThatCanChange = "Talita Alves"
    nameThatCanChange = "$nameThatCanChange My love"
    println(name)
    println(nameThatCanChange)

    val result:Boolean = name.equals("Lucas gabriel", false)
    println("Resulted=> $result")

    greeting = "$greeting Kotlin $nameCanBeNull"

    println(greeting)
}