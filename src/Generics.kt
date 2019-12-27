// Create a generic class

class MutableClass<E>(vararg parameters: E){
    private val values = parameters.toMutableList()
    fun push(value: E) = values.add(value)
    fun peek(): E = values.last()
    fun pop(): E = values.removeAt(values.size - 1)
    fun isEmpty() = values.isEmpty()
    fun size() = values.size
    override  fun toString() = "MutableClass(${values.joinToString()}})"
}

fun main(){
    val stack = MutableClass(0.62, 3.14, 2.7)
    stack.push(9.87)
    println(stack)
    println("peak(): ${stack.peek()}")
    println(stack)

    for (x in 1..stack.size()){
        println("pop(): ${stack.pop()}")
        println(stack)
    }
}
