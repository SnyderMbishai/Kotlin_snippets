fun main(){

    // Same operations as arrays.

    // Looking at map:
    val map = mapOf(1 to "me", 2 to "you", 3 to "her") //immutable
    map.forEach{key, value -> println("$key -> $value")}

    //mutables
    val myMutableList = mutableListOf("a", "b", "c")
    println(myMutableList)
    myMutableList.add("d")
    println(myMutableList)
    val mutableMap = mutableMapOf(1 to "aa", 2 to "bb", 3 to "cc")
    mutableMap.put(4, "dd")
}