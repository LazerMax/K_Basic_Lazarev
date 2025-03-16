fun main() {
    println("Введите число:")
    val input = readlnOrNull()

    if (input != null && input.all { it.isDigit() }) {
        println("$input${input.toInt()*2}")
    } else {
        println("Некорректные входные данные")
    }
}