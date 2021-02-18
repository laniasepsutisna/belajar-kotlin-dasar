package belajar.kotlin.oop.app

import belajar.kotlin.oop.data.Employee
import belajar.kotlin.oop.data.Manager
import belajar.kotlin.oop.data.VicePresident

fun main() {
    var employee: Employee = Employee("Asep")
    employee.sayHello("Indra")

    employee = Manager("Ahmad")
    employee.sayHello("Andi")

    employee = VicePresident("Indi")
    employee.sayHello("Intan")
}