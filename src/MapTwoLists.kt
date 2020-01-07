val list1 = listOf(1,2,3)
val list2 = listOf("a","b","c")

val map: Map<Int,String> = list1.zip(list2).toMap()

fun main(){
    println(map)
}