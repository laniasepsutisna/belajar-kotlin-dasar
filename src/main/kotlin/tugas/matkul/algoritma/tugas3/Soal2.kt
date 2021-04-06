package tugas.matkul.algoritma.tugas3

import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    val a = input.nextInt()
    val b = input.nextInt()
    val c = input.nextInt()

    println("Menghitung Sisi Segitiga:")
    println("Sisi 1: $a | Sisi 2:  $b | Sisi 3: $c")
    if (a==b && b == c){
        println("SEGITIGA SAMA SISI")
    }else if(a==b || a==c || b==c ){
        println("SEGITIGA SAMA KAKI")
    }else{
        println("SEGITIGA SEMBARANG")
    }
}