package belajar.kotlin.oop.app

import belajar.kotlin.oop.data.Company

fun main() {
    val company1 = Company("Asep")
    val company2 = Company("Asep")

    println(company1 == company2)
    println(company1 == company1)
    println(company2 == company2)
}