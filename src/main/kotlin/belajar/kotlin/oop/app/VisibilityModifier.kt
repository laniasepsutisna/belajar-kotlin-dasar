package belajar.kotlin.oop.app

import belajar.kotlin.oop.data.SuperTeacher
import belajar.kotlin.oop.data.Teacher

fun main() {
    val teacher = SuperTeacher("Asep")
    println(teacher.name)
    teacher.test()
}