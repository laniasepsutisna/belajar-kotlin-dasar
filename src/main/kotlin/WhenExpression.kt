fun main() {
    var nilai = "D"
    when (nilai){
        "A" -> println("Amazing")
        "B" -> println("Good")
        "C" -> println("Not Bad")
        "D" -> println("Bad")
        "E" -> println("Try Again Next Year")
        else -> println("Ups")
    }

    when(nilai){
        "A", "B", "C" -> {
            println("Selamat Anda Lulus")
        }else -> {
            println("Maaf, Anda Tidak Lulus")
        }
    }

    nilai = "A"
    val nilaiLulus: Array<String> = arrayOf("A", "B", "C")
    when (nilai){
        in nilaiLulus -> println("SELAMAT ANDA LULUS")
        !in nilaiLulus -> println("MAAF ANDA TIDAK LULUS")
    }

    val name = "Asep"
    when(name) {
        is String -> println("Name is String")
        !is String -> println("Name is not String")
    }

    val exampValue = 56
    when{
        exampValue > 80 -> println("Amazing")
        exampValue > 80 -> println("Good Job")
        exampValue > 60 -> println("Not Bad")
        else -> println("Silahkan Ngulang Tahun Depan")
    }
}