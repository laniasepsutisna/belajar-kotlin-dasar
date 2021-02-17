package belajar.kotlin.oop.app

import belajar.kotlin.oop.data.Boss

fun main(){
    val boss1 = Boss("Asep")
    val employee1 = boss1.Employee("Budi")
    val employee2 = boss1.Employee("Joko")

    val boss2 = Boss("Jaki")
    val employee3 = boss2.Employee("Indra")
    val employee4 = boss2.Employee("Sukma")

    employee1.hi()
    employee2.hi()
    employee3.hi()
    employee4.hi()
}