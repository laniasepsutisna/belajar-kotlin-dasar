fun main() {
    //operasi matematika
    val result1: Int = 10 / 3
    println(result1)

    val result2: Int = 10 + 10 / 2
    println(result2)

    val result3: Double = 10.0 / 3.0
    println(result3)

    //operasi augmented assignments
    var total: Int = 0
    val barang1 = 100
    total += barang1
    val barang2 = 200
    total += barang2
    val barang3 = 300
    total += barang3
    println(total)

    //operasi unary operator
    total++ //total = total + 1
    total++ //total = total + 1
    total++ //total = total + 1
    println(total)

    val suhu = -5
    println(suhu)

    val sehat = true
    println(!sehat)
}