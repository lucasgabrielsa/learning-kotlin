import java.util.*

sealed class EntitySealed {

    object Help:EntitySealed() {
        val name = "Help"
    }

    data class Easy(val id:String, val name: String): EntitySealed() {
        override fun equals(other: Any?): Boolean {
            return super.equals(other)
        }

        override fun hashCode(): Int {
            return super.hashCode()
        }
    }
    data class Medium(val id:String, val name: String): EntitySealed()
    data class Hard(val id:String, val name: String, val multiplier: Float): EntitySealed()
}

fun EntitySealed.Medium.printInfo() {
    println("printInfo on Medium class created")
}

object EntitySealedFactory {
    fun create(type: EntityType): EntitySealed {
        val id = UUID.randomUUID().toString()
        val name = when(type) {
            EntityType.HELP -> type.getFormattedName()
            EntityType.EASY -> type.getFormattedName()
            EntityType.MEDIUM -> type.getFormattedName()
            EntityType.HARD -> type.getFormattedName()
        }
        return when (type) {
            EntityType.HELP -> EntitySealed.Help
            EntityType.EASY -> EntitySealed.Easy(id, name)
            EntityType.MEDIUM -> EntitySealed.Medium(id, name)
            EntityType.HARD -> EntitySealed.Hard(id, name, 2F)
        }
    }
}

val EntitySealed.Medium.info:String
    get() = "Medium Info"

fun main() {
    val entity:EntitySealed = EntitySealedFactory.create(EntityType.HELP)
    val msg = when(entity) {
        is EntitySealed.Easy -> "easy class"
        is EntitySealed.Hard -> "hard class"
        EntitySealed.Help -> "Help class"
        is EntitySealed.Medium -> "medium class"
    }
    println(msg)

    val entity1 = EntitySealedFactory.create(EntityType.EASY)
    val entity2 = EntitySealedFactory.create(EntityType.EASY)

    if(entity1 == entity2) {
        println("equals")
    } else {
        println("not equals")
    }

    val entity3 = EntitySealed.Easy("id", "name")
    val entity4 = entity3.copy()

    if(entity3 == entity4) {
        println("equals")
    } else {
        println("not equals")
    }

    val entityMedium = EntitySealed.Medium("id", "name").printInfo();

    var entityNew = EntitySealedFactory.create(EntityType.MEDIUM)

    if(entityNew is EntitySealed.Medium) {
        entityNew.printInfo()
        println(entityNew.info)
    }
}