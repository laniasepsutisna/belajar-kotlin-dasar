package belajar.kotlin.oop.app

import belajar.kotlin.oop.data.City
import belajar.kotlin.oop.data.Country

fun main() {
    val city = City("Jakarta")
    val country = Country("Indonesia")

    println(city.name)
    println(country.name)
}