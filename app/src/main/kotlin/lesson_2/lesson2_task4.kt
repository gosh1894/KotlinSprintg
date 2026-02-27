package lesson_2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buffModifier = 0.2

    val bonusCrystal = (crystalOre * buffModifier).toInt():
    val bonusIron = (ironOre * buffModifier).toInt()

    println("Бонусная кристаллическая руда (+20%): $bonusCrystal")
    println("Бонусная железная руда (+20%): $bonusIron")
    println("Итого кристаллов: ${crystalOre + bonusCrystal}")
}
