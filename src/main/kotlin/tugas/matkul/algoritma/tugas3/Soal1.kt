package tugas.matkul.algoritma.tugas3

import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    val a = input.nextInt()
    val b = input.nextInt()
    val c = input.nextInt()

    println("Nilai Input: $a $b $c")
    print("Nilai Tengah: ")
    if((b in (a + 1) until c) || (b in (c + 1) until a)){
        println(b)
    }else if((a in (b + 1) until c) || (a in (c + 1) until b)){
        println(a)
    }else{
        println(c)
    }
}