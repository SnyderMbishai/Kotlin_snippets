// mark the class to be inherited by open

open class Animal{
    open fun canBleed(){
        println("Can Bleed, Can Bleed!!!")
    }
}

class Human : Animal() {
    override fun canBleed(){
        println("This human bleeds red confetti!!!")
    }
}

// With parameterized constructor:
open class African(val origin: String){
    fun greet(){
        println("Hello person from $origin!")
    }
}
class Kenyan : African("Kenya")

// Passing arguments to the superclass:
open class Fruit(val name: String, val origin: String){
    fun describeFruit(){
        println("This fruit from $origin is called $name")
    }
}

class Avocado(name: String) : Fruit(name = name, origin = "Kenya")

fun main(){
    val fri : Animal = Human()
    fri.canBleed()

    //parameterized
    val kenyan : African = Kenyan()
    kenyan.greet()

    //pass arguments to superclass
    val thisFruit : Fruit = Avocado("Avocado")
    thisFruit.describeFruit()
}
