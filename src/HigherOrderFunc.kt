// Higher order functions
fun printFilteredString(list: List<String>, predicate: (String) -> Boolean){
    list.forEach{
       if (predicate(it)){
           println(it)
       }
    }
}

fun main(){
    val list = listOf("Ein", "Twei", "Drei","Fier", "Funf")
    printFilteredString(list, {it.startsWith(prefix="F")})
    printFilteredString(list){
        it.startsWith(prefix = "E")
    }
}
