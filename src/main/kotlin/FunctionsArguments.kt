fun greetPerson(greeting: String = "Hello", name: String = "Jhon Doe") = println("$greeting $name")

fun main() {
    greetPerson(name = "Lucas Gabriel", greeting = "Oi")
    greetPerson(greeting = "Oi")
    greetPerson(name = "Beatriz de Oliveira Alves")
    greetPerson()
}