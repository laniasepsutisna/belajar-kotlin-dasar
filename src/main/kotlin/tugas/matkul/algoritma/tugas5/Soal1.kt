package tugas.matkul.algoritma.tugas5
import com.company.belajar.time.toSeconds
fun main() {
    val waktuAli = "08:00:00".toSeconds()
    val waktuBadu = "07:59:50".toSeconds()
    var selisihWaktu = waktuAli - waktuBadu
    // selisih waktu 10 detik
    var kecAli = 2.0; val kecBadu = 5.0; val jarakTotal = 1000.0; var jarakA = 0.0; var jarakB = 0.0
    jarakB = jarakB + (kecBadu * selisihWaktu);
    // 50m. karena badu berangkat duluan
    var isExit = false; var t = 0
    while (!isExit) {
        t++
        jarakB += kecBadu
        if (t >= 10 && t % 10 == 0) {
            kecAli += 0.5
        }
        jarakA += kecAli
        val j1 = jarakA
        val j2 = jarakTotal - jarakB
        isExit = j1 >= j2
    }

    var waktuPapasan = t + waktuAli
    //konversi detik ke jam menit detik untuk mengetahui berapa jam dia menghabiskan waktu
    val j = waktuPapasan / 3600
    val x = j * 3600
    val y = waktuPapasan - x
    val m = y / 60
    val z = m * 60
    val d = y - z
    println("Mereka bertemu pada $t detik setelah jam 08:00:00 atau tepatnya jam $j:$m:$d")
}