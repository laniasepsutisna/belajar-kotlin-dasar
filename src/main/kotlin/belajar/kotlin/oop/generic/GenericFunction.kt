package belajar.kotlin.oop.generic

import belajar.kotlin.oop.data.Function

fun main(){
    val function = Function("Asep")

    function.sayHello("Andi")
    function.sayHello<String>("Ahmad")

    function.sayHello(10)
    function.sayHello<Int>(11)
}