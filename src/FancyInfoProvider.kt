class FancyInfoProvider : BasicInfoProvider(){
    override val sessionIdPrefix: String
        get() = "Fancy session"

    override val providerDetail: String
        get() = "Fancy Info Provider"

    override fun printInfo(person: PersonThree) {
        super.printInfo(person)
        println("Fancy Fancy....")
    }
}