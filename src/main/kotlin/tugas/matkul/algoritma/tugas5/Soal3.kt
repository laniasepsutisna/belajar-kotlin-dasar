package tugas.matkul.algoritma.tugas5
import kotlin.math.floor

fun main() {
    val derajatPerJam = 30
    // maximal derajat = 360 karena dari jam 0 sampai jam 12
    val maxDerajat = 360
    var iDerajat = 0
    var jam = 0

    // cek setiap jam
    while (iDerajat < maxDerajat) {
        val m1 = (2 * iDerajat).toFloat()
        val m2 = m1 / 11
        if (m2 != 60f) {
            val s = (m2 - m2.toInt()) * 60
            val m = floor(m2)
            val sd = floor(s)
            println("Berhimpit pada pukul $jam:${m.toInt()}:${sd.toInt()}")
        }
        jam++
        iDerajat += derajatPerJam
    }
}