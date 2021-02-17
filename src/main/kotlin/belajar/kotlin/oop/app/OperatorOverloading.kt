package belajar.kotlin.oop.app

import belajar.kotlin.oop.data.Fruit

fun main() {
    val fruit1 = Fruit(100)
    val fruit2 = Fruit(100)
    val fuirt3 = fruit1 + fruit2

    println(fuirt3)
    println(fuirt3-Fruit(10))
}