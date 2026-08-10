package org.example.ks_5_3

fun main() {

    println("Лотерея. Чтобы участвовать в лотерее, введите два числа от 0 до 42:")
    val firstNumber = readln().toInt()
    val secondNumber = readln().toInt()
    val correctNumberOne = 7
    val correctNumberTwo = 35
    if ((firstNumber == correctNumberTwo || secondNumber == correctNumberTwo) &&
        (firstNumber == correctNumberOne || secondNumber == correctNumberOne)
    ) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if ((firstNumber == correctNumberTwo || secondNumber == correctNumberTwo) ||
        (firstNumber == correctNumberOne || secondNumber == correctNumberOne)
    ) {
        println("Вы выиграли утешительный приз!")
    } else println("Неудача!")
    println("Выигрышные номера $correctNumberTwo и $correctNumberOne")
}