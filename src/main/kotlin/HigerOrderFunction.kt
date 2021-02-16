fun main() {

    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val lambdaUpper = {value : String -> value.toUpperCase()}
    println(hello("Asep", lambdaUpper))

    println(hello("Asep") { value: String -> value.toLowerCase() })

    val result1 = hello("Zafran", {value: String -> value.toLowerCase()})
    println(result1)

    //trailing lambda
    val result2 = hello("Subekti") { value: String ->
        value.toUpperCase()
    }
    println(result2)
}