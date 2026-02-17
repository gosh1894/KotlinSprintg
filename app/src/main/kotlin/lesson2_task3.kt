@file:Suppress("MISSING_DEPENDENCY_SUPERCLASS_IN_TYPE_ARGUMENT")

const val MINUTES_IN_HOUR = 60

fun main() {

        val hour = 9
        val minute = 39
        val travel = 457

        val arrivalHour = "hour * MINUTES_IN_HOUR + minute + travelTimeInMinutes"

    val arrivalHour1 = "totalMinutes / MINUTES_IN_HOUR"
    val arrivalMinute = "totalMinutes % MINUTES_IN_HOUR"

    val formattedTime = "%02d:%02d".format(arrivalHour, arrivalMinute)

    println(formattedTime)
    }
