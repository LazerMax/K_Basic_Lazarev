fun main() {
    println("Введите число дней:")
    val input = readlnOrNull()

    if (input != null && input.all { it.isDigit() }) {
        val number = input.toInt()

        val years = number / 365
        val remainingDaysAfterYears = number % 365

        val weeks = remainingDaysAfterYears / 7
        val days = remainingDaysAfterYears % 7

        println("Лет: $years, недель: $weeks, дней: $days")
    } else {
        println("Некорректные входные данные")
    }
}