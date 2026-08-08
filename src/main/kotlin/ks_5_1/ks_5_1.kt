package org.example.ks_5_1

fun main() {

    val firstNumber = 33
    val secondNumber = 56
    val sum = firstNumber + secondNumber
    println("Проверка на бота. Сложите два числа: $firstNumber + $secondNumber")
    val resultAddition = readln().toInt()
    if (resultAddition == sum) println("Добро пожаловать!")
    else println("Доступ запрещен.")

}