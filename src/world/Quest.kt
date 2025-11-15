package world
open class Mission(val title: String, val reward: Int) {
    open fun describe() {
        println("Миссия '$title', награда: $reward золотых")
    }
}
class Quest(
    title: String,
    val duration: Int,
    reward: Int,
    val difficulty: String,
    val questType: QuestType
) : Mission(title, reward) {

    override fun describe() {
        println("Квест '$title' на $duration часов, сложность: $difficulty, награда: $reward золотых")
        println("Тип квеста: ${questType.description}")
        fun printInfo() {
            println("Название квеста: $title")
            println("Тип квеста: ${questType.description}")
            println("Время выполнения: $duration ч.")
            println("Награда: $reward золотых")
            println("Уровень сложности: $difficulty")
        }
    }
}