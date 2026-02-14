package lesson2_task2

fun main() {

    val company = 50
    val salary = 30000
    val intern = 30
    val internSalary = 20000

    val disperseEmployees = ("company,salary")
    val generalExpenses = ("intern,internSalary")
    val averageSalary = ("generalExpenses,intern")
    val averageSalary1 = ("generalExpenses,averageSalary")

    println("Расходы на постоянных сотрудников: $disperseEmployees")
    println("Общие расходы по ЗП: $averageSalary")
    println("Средняя ЗП одного сотрудника: $averageSalary1")

}