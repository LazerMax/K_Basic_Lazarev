fun main() {
    println("Введите имя:")
    val name = readlnOrNull()
    println("Введите возраст")
    val age = readlnOrNull();

    if (name != null && age != null && age.all { it.isDigit() }) {
        println("Привет, $name! Тебе уже $age")
    } else {
        println("Некорректные входные данные")
    }
}