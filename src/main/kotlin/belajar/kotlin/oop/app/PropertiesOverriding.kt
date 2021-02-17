package belajar.kotlin.oop.app

import belajar.kotlin.oop.data.Rectangle
import belajar.kotlin.oop.data.Shape
import belajar.kotlin.oop.data.Triangle

fun main() {
    val shape = Shape()
    println(shape.corner)

    val shape2 = Rectangle()
    println(shape2.corner)

    val shape3 = Triangle()
    println(shape3.corner)
}