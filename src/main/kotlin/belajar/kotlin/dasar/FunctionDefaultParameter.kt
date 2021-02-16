fun hello(firstName: String, lastName: String = ""){
    println("Hello $firstName $lastName")
}

fun main() {
    hello("Asep")
    hello("Asep", "Sutisna")
    hello("Sukma", "Ahmad")
    hello("Putri")
}