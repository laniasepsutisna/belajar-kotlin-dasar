package belajar.kotlin.oop.app

import belajar.kotlin.oop.data.Game
import belajar.kotlin.oop.data.Login
import belajar.kotlin.oop.data.MinMax

fun minmax(value1: Int, value2: Int): MinMax{
    return when {
        value1 > value2 -> MinMax(value1, value2)
        else -> MinMax(value1, value2)
    }
}

fun login(login: Login, callback: (Login) -> Boolean): Boolean {
    return callback(login)
}

fun main() {
    val game = Game("Game Kotlin", 1000000)

    //val name = game.name
    //val price = game.price
    val (name, price) = game
    println(name)
    println(price)

    //val result = minmax(10, 100)
    //val min = result.min
    //val max = result.max
    val (min, max) = minmax(10, 100)
    println(min)
    println(max)

    val login = Login("asep", "rahasia")
    val auth = login(login){ (username, password) ->
        username == "asep" && password == "rahasia"
    }

    println("User login: $auth")
}