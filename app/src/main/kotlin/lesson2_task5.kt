import kotlin.math.pow

fun main() {

    val initialAmount = 70_000.0
    val annualRatePercent = 16.7
    val years = 20
    val rateModifier = annualRatePercent / 100
    val finalAmount = initialAmount * (1 + rateModifier).pow(years)
    val formattedResult = "%.3f".format(finalAmount)

    println("Сумма вклада через $years лет составит: $formattedResult")
}


