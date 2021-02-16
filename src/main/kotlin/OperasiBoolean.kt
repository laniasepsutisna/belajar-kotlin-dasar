fun main() {
    val finalExam = 80
    val attendant = 67
    val extra     = 80

    val passFinalExam = finalExam > 75
    val passAttendant = attendant > 75
    val passExtra     = extra > 70

    val pass = ((passFinalExam && passAttendant) || passExtra)
    println(pass)
}