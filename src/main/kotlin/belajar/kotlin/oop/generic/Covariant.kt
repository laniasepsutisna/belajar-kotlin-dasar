package belajar.kotlin.oop.generic

class Covariant<out T>(val data: T){

    fun data(): T {
        return data
    }

// membuat function dengan input generic covariant
//    fun setData(param: T){
//        data = param
//    }
}

fun main() {
    val covariantString = Covariant<String>("Eko")
    val covariantAny: Covariant<Any> = covariantString

    println(covariantAny.data())
}