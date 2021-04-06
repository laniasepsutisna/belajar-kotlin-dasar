package tugas.matkul.algoritma.tugas5

fun main() {
    println("Jawaban Soal 4"); println("Diketahui:"); println("A = 1X + 2Y B = 2X + 3Y C = 3X + 4Y");
    println("A + B + C <= 50"); println("SUM X = 74"); println("SUM Y = 122"); println("Maka:");

    val sumX = 74.0; val sumY = 122.0
    var a = 0.0; var b = 0.0; var c = 0.0
    val sumABCLimit = 50.0; var sumABC = 0.0

    val x = sumX / 6
    val y = sumY / 9
    a = 1 * x + 2 * y
    b = 2 * x + 3 * y
    c = 3 * x + 4 * y

    sumABC = a + b + c;
    println("Total Robot A:${a.toInt()}");
    println("Total Robot B:${b.toInt()}");
    println("Total Robot C:${c.toInt()}");
    if (sumABC > sumABCLimit)
    {
        println("DATA SALAH");
        println("Total ROBOT ($sumABC) lebih besar dari $sumABCLimit");
    }
}