fun main(){
    fun printAll(vararg message: String){
        for(m in message) println(m)
    }
    printAll("One", "two", "three", "four", "&&&%$#")

    fun printAllWithPrefix(vararg messages: String, prefix: String){
        for (m in messages) println(prefix + m)
    }
    printAllWithPrefix("Eine","Twei", "Drei", "Funf", prefix = "X = ")

    fun log(vararg entries: String){
        printAll(*entries)
    }
}
