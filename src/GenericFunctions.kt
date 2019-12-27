class MutableStack<E>(vararg x: E){
    var elements = x.toMutableList()
}

fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)

fun main(){
    val stack = mutableStackOf(0.1, 0.3, 0.5)
    println(stack)
}