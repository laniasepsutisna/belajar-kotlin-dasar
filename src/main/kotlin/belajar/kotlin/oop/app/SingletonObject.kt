package belajar.kotlin.oop.app

import belajar.kotlin.oop.data.Application
import belajar.kotlin.oop.data.Utilities

fun main() {
    println(Utilities.name)
    println(Utilities.toUpper("Asep"))

    println(Application.Companion.toUpper("Ahmad"))
    println(Application.toUpper("Ahmad"))

    a()
}

fun a() {
    println(Utilities.name)
}