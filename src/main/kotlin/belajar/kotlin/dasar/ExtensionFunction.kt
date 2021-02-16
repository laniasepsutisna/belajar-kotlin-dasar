fun String.hello(): String = "Hello $this"

fun String.printHello(): Unit = println("Hello $this")

fun main() {
    val name: String = "Asep"
    println(name.hello())

    name.printHello()
    "Sutisna".printHello()
}