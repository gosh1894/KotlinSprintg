
fun main() {


        val hour = 9
        val minute = 39
        val travel = 457
        val total = hour * 60 + minute + travel

        val arrivalHour = total / 60
        val arrivalMinute = total % 60

        println(
            (if (arrivalHour < 10) "0$arrivalHour" else "$arrivalHour") + ":" +
                    (if (arrivalMinute < 10) "0$arrivalMinute" else "$arrivalMinute")
        )
    }
