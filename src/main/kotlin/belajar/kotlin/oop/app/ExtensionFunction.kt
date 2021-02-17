package belajar.kotlin.oop.app

import belajar.kotlin.oop.data.Student
import belajar.kotlin.oop.data.sayHello
import belajar.kotlin.oop.data.upperName

fun main() {
    val student = Student("Asep", 15)
    student.sayHello("Budi")
    println(student?.upperName)
}