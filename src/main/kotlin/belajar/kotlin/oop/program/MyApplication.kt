package belajar.kotlin.oop.program

class MyApplication(val name: String, private val version: Int) {

    fun info(): String = "Application $name-$version"

}