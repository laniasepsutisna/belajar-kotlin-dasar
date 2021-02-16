fun main() {
    //for loop
    val names = arrayOf("Ahmad", "Zaki", "Indra", "Nugraha", "Yudi", "Putri")
    var total = 0
    for(name in names){
        println(name)
        total++
    }

    println("Total Perulangan: $total")

    //for range
    for(i in 0..100 step 2){
        println(i)
    }

    for(i in 100 downTo 0 step 2){
        println(i)
    }

    val ukuranArray = names.size - 1
    for(i in 0..ukuranArray){
        println("Index $i = ${names[i]}")
    }


}