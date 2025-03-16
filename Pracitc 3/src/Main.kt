fun main() {
    println("Введите четырехзначное число:")
    val input = readlnOrNull()

    if (input != null && input.length == 4 && input.all { it.isDigit() }) {
        val digits = input.map { it.toString().toInt() }
        println("Результат: ${digits.joinToString(", ")}")
    } else {
        println("Введен некорректный ввод. Пожалуйста, введите четырехзначное число.")
    }
}