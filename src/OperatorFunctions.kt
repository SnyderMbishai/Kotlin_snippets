fun main(){
    operator fun Int.times(str: String) = str.repeat(this)
    println(1 * "bye")

    operator fun String.get(range: IntRange) = substring(range)
    val str = "Shit happens. Hello Hello."
    println(str[0..14])
}
