package org.example.ks_5_1

fun main() {

    val firstNumber = readln().toInt()
    val secondNumber = readln().toInt()
    val amoundAddition = firstNumber + secondNumber
    println("Проверка на бота. Сложите два числа: $firstNumber + $secondNumber")
    val resultAddition = readln().toInt()
    if (resultAddition == amoundAddition) println("Добро пожаловать!")
    else println("Доступ запрещён.")

}