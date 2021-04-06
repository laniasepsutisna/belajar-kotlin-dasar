package tugas.matkul.algoritma.tugas5
import com.company.belajar.time.toSeconds

fun main() {
    val waktuAli = "08:00:00".toSeconds()
    val waktuBadu = "08:20:00".toSeconds()
    val selisihWaktu = waktuAli - waktuBadu
    var isKetemu = false; var isBaduJalan = false; var isAliBalik = false
    var tBadu = 0; val totalJarak = 1000.0; var jarakAli = 0.0; var jarakBadu = 0.0
    val percepatanAli = 0.1
    var kecAli = 2 - percepatanAli
    val kecBadu = 3.0
    var t = 0

    while (!isKetemu || jarakBadu <= totalJarak) {
        t++
        if (!isAliBalik) {
            kecAli += percepatanAli
        } else {
            // jika ali balik, kecepatannya 5 terus
            kecAli = 5.0
        }
        // pengecekan badu harus jalan atau tidak hanya sekali saja
        if (!isBaduJalan) {
            isBaduJalan = t == selisihWaktu
        }
        jarakAli += kecAli
        if (isBaduJalan) {
            tBadu++
            jarakBadu += kecBadu
            var j1 = 0.0
            var j2 = 0.0
            if (isAliBalik) {
                j1 = jarakAli
                j2 = totalJarak - jarakBadu
            } else {
                j1 = jarakBadu
                j2 = totalJarak - jarakAli
            }
            isKetemu = j1 >= j2
        }

        // ali akan balik jika jarak ali lebih besar sama dengan total jarak
        if (jarakAli >= totalJarak) {
            isAliBalik = true
            jarakAli = 0.0
        }
    }
    println("Mereka bertemu pada $tBadu detik setelah badu berangkat")
}