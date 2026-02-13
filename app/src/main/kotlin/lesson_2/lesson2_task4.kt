package lesson_2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buffModifier = 0.20

    val bonusCrystal = (crystalOre * buffModifier).toInt()
    val bonusIron = (ironOre * buffModifier).toInt()

    println("Бонусная кристаллическая руда: $bonusCrystal")
    println("Бонусная железная руда: $bonusIron")
}
