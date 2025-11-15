package characters
import world.Quest
import world.QuestType
class Trader(
    val name: String,
    private val quests: MutableList<Quest> = mutableListOf()
) {
    fun showAvailableQuests() {
        println("Доступные квесты от $name:")
        quests.forEachIndexed { index, quest ->
            println("${index + 1}. ${quest.title} (${quest.questType.description}) - Награда: ${quest.reward} золота")
        }
    }
    fun giveQuest(index: Int): Quest? {
        return if (index - 1 in quests.indices) {
            quests[index - 1]
        } else {
            null
        }
    }
    fun addQuest(quest: Quest) {
        quests.add(quest)
        println("Квест '${quest.title}' добавлен в список $name.")
    }
}