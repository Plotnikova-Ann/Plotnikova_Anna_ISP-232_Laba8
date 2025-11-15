import world.Quest
import world.QuestType
import characters.Trader
fun main() {
    val escortQuest = Quest(
        title = "Сопроводи торговца до деревни",
        duration = 4,
        reward = 120,
        difficulty = "Средний",
        questType = QuestType.ESCORT
    )
    escortQuest.printInfo()
    println()
    val trader = Trader(name = "Ральф")
    trader.addQuest(Quest(
        title = "Собрать травы",
        duration = 2,
        reward = 50,
        difficulty = "Лёгкий",
        questType = QuestType.DELIVERY
    ))
    trader.addQuest(Quest(
        title = "Убить волков",
        duration = 3,
        reward = 100,
        difficulty = "Средний",
        questType = QuestType.ELIMINATION
    ))
    trader.showAvailableQuests()
    val selectedQuest = trader.giveQuest(index = 1)
    selectedQuest?.describe()
}

private fun Quest.printInfo() {
    TODO("Not yet implemented")
}

