fun main() {

    //break
    var i = 0
    while (true){
        println("Break Me $i")
        i++
        if(i > 1000){
            break
        }
    }

    //continue
    for(i in 1..1000){
        if(i % 3 == 0){
            continue
        }
        println("Bilangan $i")
    }
}