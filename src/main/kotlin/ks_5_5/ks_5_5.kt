package org.example.ks_5_5

import kotlin.random.Random

fun main() {

    val number = List(3) { Random.nextInt(43) }
    println("Лотерея. Введите три числа:")
    val userNumbers = List(3) { readln().toInt() }
    val matches = number.intersect(userNumbers)
    val winNumbers = when {
        matches == setOf(3) -> "Поздравляем! Вы угадали все числа и выиграл джекпот!"
        matches == setOf(2) -> "Поздравляем! Вы угадали два числа и получаете крупный приз!"
        matches == setOf(1) -> "Поздравляем! Вы угадали одно число и плучаете утешительный приз!"
        else -> "Сожелеем. Вы неугадали ни одного числа."
    }
    println("$winNumbers")
    println("Выигрышные номера: $number")

    }