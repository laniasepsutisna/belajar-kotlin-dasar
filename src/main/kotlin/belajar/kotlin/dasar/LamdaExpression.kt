fun toUpper(value: String): String = value.toUpperCase()

fun main() {

    //lambda expression
    val lambdaName: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }

    val result = lambdaName("Intan", "Putri")
    println(result)

    //lambda with it
    val sayHello: (String) -> String = {
        "Hello $it"
    }

    println(sayHello("Lani Asep Sutisna"))

    //lambda method references
    val toUpperCase : (String) -> String = ::toUpper
    println(toUpperCase("Ahmad Nugraha"))

}