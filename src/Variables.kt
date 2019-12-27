// Mutable and Immutable
// a variable must be initialized before being used(read)
fun worth() = true

fun main() {
    var s: String = "Nope" //mutable
    val t: Int = 7 // immutable
    val u = 8 //immutable

    val rate: Int // uninitialized
    if (worth()){
        rate = 10
    }else{
        rate = 100
    }
    println(rate)
}


