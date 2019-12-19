// simple function
/*
The bellow function takes in a message which is a string
and returns a nullable output, no return value(Unit)
*/
fun printMsg(message: String): Unit{
    println(message)
}

// Function with an optional second parameter
fun printMsgPrx(message: String, prefix: String = "You!"){
    println("[$prefix] $message")
}

// Entry point
fun main() {
    printMsg("Kotlin")
    printMsgPrx("I think I know what I am doing")
    // change the order of the arguments
    printMsgPrx(prefix = "Mama", message = "I love you")
}
