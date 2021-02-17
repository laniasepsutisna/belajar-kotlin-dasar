package belajar.kotlin.oop.app

import belajar.kotlin.oop.data.Person

fun main() {
    val eko = Person()
    eko.firstName = "Eko"

    val budi = Person()
    budi.firstName = "Budi"

    val joko = Person()
    joko.firstName = "Joko"

    println(eko.firstName)
    println(budi.firstName)
    println(joko.firstName)
}