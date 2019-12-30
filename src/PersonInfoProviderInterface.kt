interface PersonInfoProviderInterface {
    val providerDetail: String

    fun printInfo(person: PersonThree){
        println(providerDetail)
        person.personInfo()
    }
}

interface SessionInfoProvider{
    fun getSessionId() : String
}

open class BasicInfoProvider : PersonInfoProviderInterface , SessionInfoProvider{
    override val providerDetail: String
        get() = "BasicInfoProvider"

    protected open val sessionIdPrefix = "session"

    override fun printInfo(person: PersonThree) {
        super.printInfo(person)
        println("additional info.....")
    }
    override fun getSessionId() : String {
        return sessionIdPrefix
    }
}

fun main(){
    val provider = object : PersonInfoProviderInterface{
        override val providerDetail: String
            get() = "New Info Provider"

        fun getSessionId() = "id"
    }
    provider.printInfo(PersonThree())
    provider.getSessionId()
    checkType(provider)
}
// type checking vs type casting
fun checkType(infoProvider: PersonInfoProviderInterface){
    if (infoProvider !is SessionInfoProvider){
        println("Is not a SessionInfoProvider")
    }else{
        println("Is a SessionInfoProvider")
        //Casting
        //(infoProvider as SessionInfoProvider).getSessionId()
        //Using the inbuilt Kotlin casting abilities...
        // smart casting
        infoProvider.getSessionId()
    }
}
