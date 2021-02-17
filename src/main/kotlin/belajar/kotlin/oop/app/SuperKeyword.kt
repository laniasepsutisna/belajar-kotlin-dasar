package belajar.kotlin.oop.app

import belajar.kotlin.oop.data.Rectangle

fun main() {
    val rectangle = Rectangle()
    println("Corner ${rectangle.corner}")
    println("Parent Corner ${rectangle.parentCorner}")

    rectangle.printName()
}