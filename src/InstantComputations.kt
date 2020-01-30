import java.time.Instant
import java.time.ZoneOffset

fun getYear(): Int {
    val instaDate = Instant.now()
    //convert
    return instaDate.atOffset(ZoneOffset.UTC).year
}
fun main(){
    println(getYear())
}