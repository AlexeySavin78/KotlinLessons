package org.example.ks_6_4

import kotlin.random.Random

fun main() {

    val number = Random.nextInt(10)
    var attempts = 5
    println("Угадайте число от 1 до 9:")
    var userNumbers = readln().toInt()
    while (true) {
        --attempts
        if (userNumbers == number) {
            println("Это была великолепная игра!")
            break
        }
        if (userNumbers != number) {
            println("Число не угадано.")
            println("Осталось $attempts попыток")
        }
        if (attempts == 0) {
            println("Было загадано число $number")
            break
        }
        userNumbers = readln().toInt()
    }

}