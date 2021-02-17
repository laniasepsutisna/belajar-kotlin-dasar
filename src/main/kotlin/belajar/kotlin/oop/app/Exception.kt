package belajar.kotlin.oop.app

import belajar.kotlin.oop.exception.ValidationException

fun validateSayHello(name: String){
    if(name.isBlank()){
        throw ValidationException("Name is blank")
    }else{
        println("Hello $name")
    }
}

fun main() {
    try {
        validateSayHello("Asep")
        validateSayHello("")
        println("Program")
    } catch (error: ValidationException){
        println("Terjadi Error ${error.message}")
    } catch (error: Throwable){
        println("Terjadi Error ${error.message}")
    } finally {
        println("Program Selesai")
    }
}