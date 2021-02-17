package belajar.kotlin.oop.app

import belajar.kotlin.oop.data.Manager
import belajar.kotlin.oop.data.VicePresident

fun main() {
    val manager = Manager("Asep")
    manager.sayHello("Agus")

    val vicePresident = VicePresident("Budi")
    vicePresident.sayHello("Joko")
}