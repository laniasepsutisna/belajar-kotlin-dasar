package belajar.kotlin.oop.app

import belajar.kotlin.oop.data.Product

fun main() {
    val product1 = Product("Indomie", 2500, "Food")
    val product2 = product1.copy(name = "Supermie")
    println(product1)
    println(product2)
}