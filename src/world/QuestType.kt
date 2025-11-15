package world

enum class QuestType(val description: String) {
    DELIVERY(description = "Доставка предмета"),
    ELIMINATION(description = "Устранение противника"),
    ESCORT(description = "Сопровождение персонажа"),
    EXPLORE(description = "Исследование новой территории"),
    BOSSFIGHT(description = "Битва с боссом")
}