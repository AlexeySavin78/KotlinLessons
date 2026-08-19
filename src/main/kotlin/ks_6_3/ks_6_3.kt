package org.example.ks_6_3

fun main() {

    println("Таймер. Введите колличество секунд, которое нужно засечь:")
    var secondsTimer = readln().toInt()
    do {
        println("Осталось секунд: $secondsTimer")
        Thread.sleep(1000)
        secondsTimer--
    } while (secondsTimer > 0)
    println("Время вышло")
}