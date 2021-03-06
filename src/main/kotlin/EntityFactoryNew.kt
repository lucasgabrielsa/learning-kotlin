import java.util.*

enum class EntityType {
    HELP, EASY, MEDIUM, HARD;

    fun getFormattedName() = name.toLowerCase().capitalize()
}


object EntityFactory {
    fun create(type: EntityType): EntityTest {
        val id = UUID.randomUUID().toString()
        val name = when(type) {
            EntityType.HELP -> type.getFormattedName()
            EntityType.EASY -> type.getFormattedName()
            EntityType.MEDIUM -> type.getFormattedName()
            EntityType.HARD -> type.getFormattedName()
        }
        return EntityTest(id, name)
    }
}

class EntityTest(private val id: String, private val name:String) {
    override fun toString(): String {
        return "id: $id name:$name"
    }
}

fun main() {
    val entity = EntityFactory.create(EntityType.EASY)
    println(entity)
}