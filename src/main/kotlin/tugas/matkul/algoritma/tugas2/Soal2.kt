package tugas.matkul.algoritma.tugas2

fun main() {
    //konversi ke detik untuk jam menit detik keberangkatan
    val j1 = 8
    val m1 = 52
    val d1 = 45
    val detik1 = j1 * 3600 + m1 * 60 + d1

    //konversi ke detik untuk jam menit detik tiba
    val j2 = 12
    val m2 = 15
    val d2 = 10
    val detik2 = j2 * 3600 + m2 * 60 + d2

    //kurangi antara detik yang awal keberangkatan & detik tiba
    val l = detik2 - detik1

    //konversi detik ke jam menit detik untuk mengetahui berapa jam dia menghabiskan waktu
    val j = l / 3600
    val x = j * 3600
    val y = l - x
    val m = y / 60
    val z = m * 60
    val d = y - z

    //hasil print output
    println("Jadi dia menghabiskan waktu selama:")
    println("Total Detik: $l")
    println("$j Jam")
    println("$m Menit")
    println("$d Detik:")
    println("By: Lani Asep Sutisna")
}
