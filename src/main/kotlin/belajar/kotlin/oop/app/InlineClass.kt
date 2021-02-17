package belajar.kotlin.oop.app

import belajar.kotlin.oop.data.Token

fun main() {
    val token = Token("Value Token")
    println(token.value)
    println(token.toUpper())
}