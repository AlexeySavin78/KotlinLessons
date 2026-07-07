package org.example

fun main() {

    var rawLogin = "  Android_Dev  "

    // 1. Убери пробелы по краям (trim)
    // 2. Приведи к нижнему регистру (lowercase)
    // 3. Выведи результат и проверь isEmpty()

    var normalLogin = rawLogin.trim().lowercase()
    println(normalLogin)
    println(normalLogin.isEmpty())

}