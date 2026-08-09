package org.example.ks_5_3

fun main() {

    println("Лоторея. Что бы участвовать в лотерее, введите два числа от 0 до 42:")
    val firstNumber = readln().toInt()
    val secondNumber = readln().toInt()
    val correctNumberOne = 7
    val correctNumberTwo = 35
    if (firstNumber == correctNumberTwo && secondNumber == correctNumberOne) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (firstNumber == correctNumberTwo || secondNumber == correctNumberOne) {
        println("Вы выиграли утешительный приз!")
    } else println("Неудача!")
    println("Выигрышные номера 35 и 7")
}