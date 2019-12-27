class Birthday // Declare class

// Declare class with properties
class Details(val name: String, var age: Int)

// create instances
fun main(){
    val bday = Birthday()
    val details = Details("You", 25)

    println(details.name)
    details.age = 30
    println(details.age)
}
