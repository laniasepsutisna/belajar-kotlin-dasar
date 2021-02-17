package belajar.kotlin.oop.app

data class Friend(val name: String)

fun sayHello(friend: Friend?){
//    if(friend != null) {
//        println("Hello ${friend.name}")
//    }
//    println("Hello ${friend?.name}")

//    val name = friend?.name ?: "Friend" //elvis operator
//    println("Hello $name")

    val name = friend!!.name
    print("Hello $name")
}

fun main() {
    sayHello(Friend("Asep"))
//    sayHello(null) //error
}