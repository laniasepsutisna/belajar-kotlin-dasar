package tugas.matkul.algoritma.tugas4

fun main() {
    val menit: Int
    val detik: Int
    val totalJarak      = 1000
    val kecepatanAli    = 2
    val kecepatanBadu   = 3
    var durasi          = 0
    var jarakA          = 0
    var jarakB          = 0
    var index           = 1

    while (index < totalJarak) {
        jarakA += kecepatanAli
        jarakB += kecepatanBadu

        if(jarakA == (totalJarak - jarakB)){
            durasi = index
        }

        index++
    }

    println(durasi);

    menit = durasi / 60
    detik = durasi % 60

    println("Pada Pukul 08:0$menit:$detik Ali & Badu Berpapasan")
}