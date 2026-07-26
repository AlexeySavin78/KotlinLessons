package org.example.ks_4_3

fun main() {

    val isWeatherToday = true
    val isOpenAwning = true
    val plantMonitoring = isWeatherToday && isOpenAwning && HUMIDITY_THRESHOLD == 20 && TIME_OF_YEAR != "winter"
    println("Благоприятные ли условия сейчас для роста бобовых? $plantMonitoring")


}
const val HUMIDITY_THRESHOLD = 20
const val TIME_OF_YEAR = "winter"