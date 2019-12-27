/*
Infix functions can be called using the infix notation.
the dot and parenthesis are omitted.
For a function to qualify as infix:
 - must be member or extension functions
 - have single parameter
 - not accept variable number of argument nor have default values
 */

fun main(){
    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "bye")

    val pair = "Me" to "You"
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "You" onto "Me"
    println(myPair)

    val red = Person("Red")
    val yellow = Person("Yellow")
    red likes yellow
    println(red.likedPeople)
}

class Person(val name: String){
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person){likedPeople.add(other)}
}
