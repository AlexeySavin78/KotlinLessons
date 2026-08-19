package org.example.ks_6_2


fun main() {

    println("Таймер. Введите колличество секунд, которое нужно засечь:")
    val seconds = readln().toInt()
    var secondsTimer = seconds
    while (secondsTimer > 0) {
        Thread.sleep(1000)
        secondsTimer--
    }
    println("Прошло $seconds секунд")
}