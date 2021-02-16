fun sum(a: Int, b: Int): Int {
    return a + b
}

fun avg(a: Int, b: Int): Int{
    return if(b == 0){
        0
    }else {
        a / b
    }
}

fun main() {
    val result1 = sum(10, 10)
    println(result1)

    val result2 = sum(40, 50)
    println(result2)

    val result3 = avg(5, 0)
    println(result3)

}