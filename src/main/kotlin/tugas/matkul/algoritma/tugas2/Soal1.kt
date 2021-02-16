package tugas.matkul.algoritma.tugas2

fun main() {
    //konversi ke detik untuk jam menit detik keberangkatan
    val j1 = 8
    val m1 = 52
    val d1 = 45
    val detik1 = j1 * 3600 + m1 * 60 + d1
    val detik2 = 5000 //total detik tiba ditujuan

    //jumlahkan antara detik yang awal jam keberangkatan & detik yang dari soal 5000
    val l = detik1 + detik2

    //konversi ke jam menit detik untuk mengetahui pukul berapa sampainya
    val j = l / 3600
    val x = j * 3600
    val y = l - x
    val m = y / 60
    val z = m * 60
    val d = y - z

    //hasil print output
    println("Jadi dia sampe tujuan pada pukul sebagai berikut:")
    println("Total Detik: $l")
    println("Jam: $j")
    println("Menit: $m")
    println("Detik: $d")

}