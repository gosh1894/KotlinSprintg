import kotlin.math.pow

fun main() {

        val initialAmount = 70_000.0
        val annualRate = 0.167
        val years = 20

        val finalAmount = initialAmount * (1 + annualRate).pow(years)
        val formattedResult = "%.3f".format(finalAmount)

        println("Сумма вклада через $years лет составит: $formattedResult")
    }


