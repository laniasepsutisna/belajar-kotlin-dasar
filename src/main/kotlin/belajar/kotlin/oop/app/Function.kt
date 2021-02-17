package belajar.kotlin.oop.app

import belajar.kotlin.oop.data.Person

fun main() {
    val name = Person()
    name.firstName = "Lani"
    name.middleName = "Asep"
    name.lastName = "Sutisna"

    name.sayHello("Asep")
    name.run()
    val fullName = name.getFullName()
    println(fullName)
}