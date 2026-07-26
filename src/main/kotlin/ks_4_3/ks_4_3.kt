package org.example.ks_4_3

fun main() {

    val isWeatherToday = true
    val isOpenAwning = true
    val Humidity = 20
    val TimeOfYear = "зима"
    val plantMonitoring = isWeatherToday && isOpenAwning && HUMIDITY_THRESHOLD == Humidity && TIME_OF_YEAR != TimeOfYear
    println("Благоприятные ли условия сейчас для роста бобовых? $plantMonitoring")


}
const val HUMIDITY_THRESHOLD = 20
const val TIME_OF_YEAR = "зима"