package belajar.kotlin.oop.app

import belajar.kotlin.oop.data.ExecutiveCustomer
import belajar.kotlin.oop.data.PremiumCustomer

fun main() {
    val premiumCustomer = PremiumCustomer("Asep")
    println(premiumCustomer.name)

    val executiveCustomer = ExecutiveCustomer("Budi", 10000000)
    println("${executiveCustomer.name} ${executiveCustomer.balance}")
}