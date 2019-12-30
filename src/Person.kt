// the val is defined to initialize the passed in parameters
class PersonTwo(val firstName: String, val secondName:String){
    init{
        println("1")
    }
    // initializing second constructor
    constructor(): this("Snyder", "Mbishai"){
        println("second constructor baby!")
    }
    init{
        println("2")
    }
}
// it gets better
class PersonThree(val firstName: String = "Snyder", val secondName: String = "Mbishai"){
    //see how we omitted constructors....

    // lets define another property
    var nickname: String? = null
        //set
        set(value){
            field = value
            println("my new nickname is $value")
        }
        get(){
            println("and i will return: $field")
            return field
        }
    fun personInfo(){
//        val nicks = if(nickname != null) nickname else "no nickname"
        val nicks = nickname ?: "no nickname"
        println("$firstName $secondName ($nicks)")
    }
}

fun main(){
    val goat = PersonTwo() //we can omit the parameters as the defaults are provided in the second constructor
    println(goat.firstName)
    val you = PersonTwo("F1", "F2")
    println(you.firstName)
    val three = PersonThree()
    three.personInfo()
}
