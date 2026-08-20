package org.example.ks_6_3

fun main() {

    println("Таймер. Введите колличество секунд, которое нужно засечь:")
    var seconds = readln().toInt()
    do {
        println("Осталось секунд: $seconds")
        Thread.sleep(1000)
        seconds--
    } while (seconds > 0)
    println("Время вышло")
}