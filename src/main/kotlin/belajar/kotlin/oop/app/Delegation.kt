package belajar.kotlin.oop.app

import belajar.kotlin.oop.data.MyBase
import belajar.kotlin.oop.data.MyBaseDelegate

fun main() {
    val base = MyBase()
    base.sayHello("Asep")

    val baseDelegate = MyBaseDelegate(base)
    baseDelegate.sayHello("Joko")
    baseDelegate.sayGoodBye("Ahmad")
}