package belajar.kotlin.oop.app

import belajar.kotlin.oop.data.HandPhone
import belajar.kotlin.oop.data.Laptop

fun printObject(any: Any){
    if(any is Laptop){
        println("Laptop with name ${any.name}")
    }else if (any is HandPhone){
        println("HandPhone with name ${any.name}")
    }else{
        println(any)
    }
}

fun printObjectWithWhen(any: Any){
    when (any) {
        is Laptop -> println("Laptop with name ${any.name}")
        is HandPhone -> println("HandPhone with name ${any.name}")
        else -> println(any)
    }
}

fun printString(any: Any){
    val value = any as String
    println(value)
}

fun printStringSafe(any: Any){
    val value: String? = any as? String
    println(value)
}

fun main() {
    printString("Ahmad")
    //printString(1)

    printStringSafe("Bagus")
    printStringSafe(1)

    printObjectWithWhen("Asep")
    printObjectWithWhen(1)
    printObjectWithWhen(Laptop("Acer"))
    printObjectWithWhen(HandPhone("Samsung"))
}