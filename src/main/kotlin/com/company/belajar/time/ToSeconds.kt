package com.company.belajar.time

fun String.toSeconds(): Int {
    val factors = arrayOf(3600, 60, 1)
    var value = 0
    this.replace(".", ":").split(":").forEachIndexed { i, s -> value += factors[i] * s.toInt() }
    return value
}