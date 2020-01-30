import kotlin.math.pow

fun calculateCompoundInterest(rate: Double, time: Int, principalAmt: Double): Pair<Double, List<Double>> {
    var compoundInterest = principalAmt * (1 + rate / 100).pow(time)
    var t = time
    // get the list of all the generated ones

    var listOfInterests = generateSequence(){
        (principalAmt * (1 + rate / 100).pow((t--).toDouble())).takeIf { it >= principalAmt }
    }.toList()

    return Pair(compoundInterest, listOfInterests)
}

fun main(){

    var x = calculateCompoundInterest(5.0, 5, 1000.0)
    println(x.first )
    println(x.second )
}
