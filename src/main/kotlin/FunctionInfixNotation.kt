infix fun String.to(type: String): String {
    if(type == "UP"){
        return this.toUpperCase()
    }else{
        return this.toLowerCase()
    }
}

fun main(){
    val result = "Lani Asep Sutisna" to "UP"
    println(result)

    1000 downTo 1
}