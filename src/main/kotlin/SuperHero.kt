class SuperHero(val firstName:String = "Peter", val lastName:String = "Parker") {
    var nickName:String? = null
      set(value) {
          field = value
          println("Nickname is changed to $value")
      }
      get() {
         println("The returned value is $field")
         return field
      }

    fun printInfo() {
        //val nickNameToPrint = if(nickName != null) nickName else "no nickname"
        val nickNameToPrint = nickName ?: "no nickname"
        println("$firstName ($nickNameToPrint) $lastName")
    }
}