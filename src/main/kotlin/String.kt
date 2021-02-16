fun main() {
    var firstName: String = "Lani"
    var middleName: String = "Asep"
    var lastName: String = "Sutisna"
    var address1: String = """
        |Jl. Penghulu No. 22
        |Jakarta
        |Indonesia
    """.trimMargin()
    var address2: String = """
        >Jl. Penghulu No. 22
        >Jakarta
        >Indonesia
    """.trimMargin(marginPrefix = ">")
    var fullName: String = "$firstName $middleName $lastName"
    var desc: String = "Total $fullName char = ${fullName.length}"

    println(firstName)
    println(middleName)
    println(lastName)
    println(address1)
    println(address2)
    println(fullName)
    println(desc)
}