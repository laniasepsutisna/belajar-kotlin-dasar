fun fullName(firstName: String, middleName: String, lastName: String){
    println("Hello $firstName $middleName $lastName")
}

fun main() {
    fullName("Lani", "Asep", "Sutisna")
    fullName(firstName = "Lani", lastName = "Sutisna", middleName = "Asep")

}