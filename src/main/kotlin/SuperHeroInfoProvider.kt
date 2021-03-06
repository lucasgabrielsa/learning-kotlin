interface PersonInfoProvider {

    val providerInfo:String

  //    fun printInfo(superHero: SuperHero)
  //  basic behavior in the interface, it's possible with Kotlin
    fun printInfo(superHero: SuperHero) {
        println(providerInfo)
        superHero.printInfo()
    }
}

interface SessionInforProvider {
    fun getSessionId(): String
}

open class BasicInfoProvider : PersonInfoProvider, SessionInforProvider {
    override val providerInfo: String
        get() = "BasicInfoProvider"

    protected open val sessionIdPrefix = "Session"

    override fun printInfo(superHero: SuperHero) {
        super.printInfo(superHero)
        println("additional print statement")
    }

    override fun getSessionId(): String {
        return sessionIdPrefix
    }
}



fun main() {
    //val provider = BasicInfoProvider()

    val provider = object : PersonInfoProvider {
        override val providerInfo: String
            get() = "New info Provider"

        fun getSessionId() = "id"
    }


    provider.printInfo(SuperHero())
    provider.getSessionId()

    checkTypes(provider)
}


fun checkTypes(infoProvider: PersonInfoProvider) {
    //can use !is to check the inverse
    if(infoProvider is SessionInforProvider) {
        println("is a session info provider")
        //cast
       // (infoProvider as SessionInfoProvider).getSessionId()
        infoProvider.getSessionId()
    } else {
        println("not a session info provider")
    }
}