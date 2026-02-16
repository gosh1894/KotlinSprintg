package lesson_3

fun main() {
    val n = 6

    val table = """
        $n x 1 = ${n * 1}
        $n x 2 = ${n * 2}
        $n x 3 = ${n * 3}
        $n x 4 = ${n * 4}
        $n x 5 = ${n * 5}
        $n x 6 = ${n * 6}
    """.trimIndent()

    println(table)
}