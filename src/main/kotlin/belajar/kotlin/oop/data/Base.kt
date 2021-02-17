package belajar.kotlin.oop.data

interface Base {
    fun sayHello(name: String)
    fun sayGoodBye(name: String)
}

class MyBase: Base {
    override fun sayHello(name: String) {
        println("Hello $name")
    }

    override fun sayGoodBye(name: String) {
        println("Good Bye $name")
    }
}

class MyBaseDelegate(private val base: Base) : Base by base{
    override fun sayHello(name: String) {
        println("Hai! $name")
    }
}