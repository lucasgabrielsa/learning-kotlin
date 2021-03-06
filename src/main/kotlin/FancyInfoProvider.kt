class FancyInfoProvider : BasicInfoProvider() {

    override val sessionIdPrefix: String
        get() = "Fancy Session"

    override val providerInfo: String
        get() = "FancyInfoProvider"

    override fun printInfo(superHero: SuperHero) {
        super.printInfo(superHero)
        println("FancyInfo printInfo additional statement")
    }
}