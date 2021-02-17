package belajar.kotlin.oop.app

import belajar.kotlin.oop.data.Company

fun main() {
    val company1 = Company("Asep")
    val company2 = Company("Asep")

    println(company1.hashCode())
    println(company2.hashCode())
    println(company1.hashCode() == company2.hashCode())
}