package belajar.kotlin.oop.app

import belajar.kotlin.oop.data.Application

typealias App = Application
typealias Aplikasi = App

typealias StringSupplier =  () -> String

fun supplier(value: StringSupplier){
    println("Hello ${value()}")
}

fun main(){
    val app = App("Kotlin App")
    val aplikasi = Aplikasi("Kotlin App")

    println(app.name)
    println(aplikasi.name)

    supplier { "Asep" }
}