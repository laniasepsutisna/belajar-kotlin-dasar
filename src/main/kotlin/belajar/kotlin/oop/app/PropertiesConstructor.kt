package belajar.kotlin.oop.app

import belajar.kotlin.oop.data.User

fun main() {
    val user1 = User("eko", "rahasia123")
    val user2 = User("joko", "rahasia123")

    println(user1.username)
    println(user1.password)

    println(user2.username)
    println(user2.password)
}