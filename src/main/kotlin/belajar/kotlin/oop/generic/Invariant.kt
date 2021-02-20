package belajar.kotlin.oop.generic

class Invariant<T>(var data: T)

fun main() {
    val invariantString = Invariant("String")

    //val invariantAny: Invariant<Any> = invariantString
    //invariantAny.data = 100
}