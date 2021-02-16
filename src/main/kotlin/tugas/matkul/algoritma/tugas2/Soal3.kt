package tugas.matkul.algoritma.tugas2
import com.company.belajar.time.toSeconds

fun main() {
    val wa = "08:00:00".toSeconds()
    val wb = "08:01:40".toSeconds()

    val selisihWaktu = wb - wa
    val k1 = 3 //m/detik
    val k2 = 2 //m/detik
    val totalJarak = 900 //m
    val selisihJarak = k1 * selisihWaktu

    //Waktu Berpapasan
    val wp = (totalJarak - selisihJarak) / (k1 + k2)
    val detikWP = wb + wp

    //Konversi dari Detik ke Jam Menit Detik
    val j = detikWP / 3600
    val x = j * 3600
    val y = detikWP - x
    val m = y / 60
    val z = m * 60
    val d = y - z

    //Print Output
    println("Jadi Ali dan Badu Berpapasan Pada Pukul:")
    println("Dalam Satuan Detik: $detikWP")
    println("Jam: $j ")
    println("Menit: $m ")
    println("Detik: $d ")
    println("By: Lani Asep Sutisna")
}
