fun main() {

    val members: Array<String> = arrayOf("Ahmad", "Budi", "Joko")
    val values: Array<Byte> = arrayOf(100, 90,97)
    val balances: Array<Int> = arrayOf(10_000, 20_000, 30_000)
    //set index
    balances[0] = 40_000

    val nilai: Array<Int> = arrayOf(10,9,8)

    println(members.size)
    println(values[0])
    println(balances[0])
    println(nilai[0])
    println(nilai[1])
    println(nilai[2])

    //array nullable
    val names: Array<String?> = arrayOfNulls(5)
    names[0] ="Indra"
    names[1] ="Indra"
    names[2] ="Indra"
    names[3] ="Indra"
    names[4] =null //array nullable
    println(names.size)
    println(names[4])
}