import java.util.*
import kotlin.math.E

//enum class
enum class EntityType{
    HELP, EASY, MEDIUM, HARD;

    fun formatName() = name.toLowerCase().capitalize()
}

object EntityFactory{
    fun create(type: EntityType) : Entity {
        val id = UUID.randomUUID().toString()
        val name = when(type){
            EntityType.EASY -> type.name
            EntityType.MEDIUM -> type.formatName()
            EntityType.HARD -> type.formatName()
            EntityType.HELP -> type.formatName()
        }
//        return Entity(id, name) //before
        return when(type){
            EntityType.EASY -> Entity.Easy(id, name)
            EntityType.MEDIUM -> Entity.Medium(id, name)
            EntityType.HARD -> Entity.Hard(id, name, multiplier = 2f)
            EntityType.HELP -> Entity.Help
        }
    }
}

//class Entity(val id: String, val name: String){
//    override fun toString(): String {
//        return "id: $id name: $name"
//    }
//}

    // hierarchy

sealed class Entity(){
    object Help : Entity(){
        val name = "Help"
    }
    data class Easy(val id: String, val name: String) : Entity()
    data class Medium(val id: String, val name: String) : Entity()
    data class Hard(val id: String, val name: String, val multiplier: Float) : Entity()
}

// Companion objects
//interface IdProvider{
//    fun getId() : String
//}

//class Entity private constructor(val id: String){
    //declaration
//    companion object Factory{
//        fun create() = Entity(id="id")
//    }
    //companion
//    companion object : IdProvider {
//        override fun getId(): String {
//           return "123"
//        }
//
////        val id = "id"
//        fun create() = Entity(getId())
//    }
//getId}

fun Entity.Medium.printInfo(){
    println("medium class: $id")
}

fun main() {
    Entity.Medium(id="id", name="name").printInfo()
    val entity: Entity = EntityFactory.create(EntityType.EASY)
    val msg = when (entity){
        Entity.Help -> "help class"
        is Entity.Easy -> "easy class"
        is Entity.Medium -> "medium class"
        is Entity.Hard -> "Hard class"
    }
    println(msg)


    // Data class at work, inbuilt methods like to string and equal to
    val ent1 = EntityFactory.create(EntityType.EASY)
    val ent2 = EntityFactory.create(EntityType.EASY)
    val ent3 = Entity.Easy(id="id", name="name")
    val ent4 = ent3.copy(name="New Name")
    if(ent1 == ent2){
        println("Equal")
    }else{
        println("Not Equal")
    }
//    val entity = EntityFactory.create(EntityType.EASY)
//    println(entity)
//
//    val mediumEntity = EntityFactory.create(EntityType.MEDIUM)
//    println(mediumEntity)
//
//    val hardEntity = EntityFactory.create(EntityType.HARD)
//    println(hardEntity)
}