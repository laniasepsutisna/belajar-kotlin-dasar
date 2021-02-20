package belajar.kotlin.oop.generic

import belajar.kotlin.oop.data.MyData

fun main() {
    val myDataString: MyData<String, Int> = MyData<String, Int>("Asep", 100)
    myDataString.printData()

    val myDataInt= MyData(1, "Asep")
    myDataInt.printData()
}