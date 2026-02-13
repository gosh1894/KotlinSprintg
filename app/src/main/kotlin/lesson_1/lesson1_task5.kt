package lesson_1

fun main() {

    val totalSeconds = 6480
    val hours = totalSeconds / 3600
    val secondsAfterHours = totalSeconds % 3600
    val minutes = secondsAfterHours / 60
    val seconds = secondsAfterHours % 60
    val h = if (hours < 10) "0$hours" else "$hours"
    val m = if (minutes < 10) "0$minutes" else "$minutes"
    val s = if (seconds < 10) "0$seconds" else "$seconds"

    println("$h:$m:$s")
}