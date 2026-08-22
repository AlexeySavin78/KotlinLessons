package org.example.ks_6_3

fun main() {

    println("Таймер. Введите колличество секунд, которое нужно засечь:")
    var secondsCount = readln().toInt()
    do {
        println("Осталось секунд: $secondsCount")
        Thread.sleep(1000)
        secondsCount--
    } while (secondsCount > 0)
    println("Время вышло")
}