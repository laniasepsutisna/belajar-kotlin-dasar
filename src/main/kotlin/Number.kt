fun main(){
    //integer
    var age: Int = 30
    println(age)

    //float
    var value: Float = 98.98F
    var radius: Double = 2039293203.30434
    println(value)
    println(radius)

    //literals
    var decimalLiteral: Int = 100
    var hexaDecimalLiteral: Int = 0xFF
    var binaryLiteral: Int = 0b00010
    println(decimalLiteral)
    println(hexaDecimalLiteral)
    println(binaryLiteral)

    //undescore
    var distance: Short = 2_000
    var balance: Long = 100_000_000L
    println(distance)
    println(balance)

    //conversion
    var number: Int = 100
    var byte: Byte = number.toByte()
    var short: Short = number.toShort()
    var price: Int = balance.toInt()
    println(number)
    println(byte)
    println(short)
    println(price)

}