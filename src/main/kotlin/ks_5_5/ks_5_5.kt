package org.example.ks_5_5

import kotlin.random.Random

fun main() {

    val number = List(3) { Random.nextInt(43) }
    println("Лотерея. Введите три числа:")
    val userNumbers = List(3) { readln().toInt() }
    val matches = number.intersect(userNumbers.toSet()).size
    val winNumbers = when (matches) {
         3 -> "Поздравляем! Вы угадали все числа и выиграли джекпот!"
         2 -> "Поздравляем! Вы угадали два числа и получаете крупный приз!"
         1 -> "Поздравляем! Вы угадали одно число и получаете утешительный приз!"
        else -> "Сожалеем. Вы не угадали ни одного числа."
    }
    println(winNumbers)
    println("Выигрышные номера: $number")

}