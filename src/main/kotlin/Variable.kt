//variable constant
const val APP = "Belajar Kotlin Dasar"
const val VERSION = "0.0.1"

fun main() {

    //mutable: bisa diubah nilainya
    val firstName = "Asep"
    val lastName = "Sutisna"
    println(firstName)
    println(lastName)

    //immutable: tidak bisa diubah nilainya
    val nim = "2011600778"
    val age = 28
    println(nim)
    println(age)

    //nullable
    var room: String? = null
    room = "B00029"

    //error karena room bisa null
    println(room?.length)
    println(room)

    //variable constant
    println(APP)
    println(VERSION)

}