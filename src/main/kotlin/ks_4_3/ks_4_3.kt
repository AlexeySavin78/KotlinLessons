package org.example.ks_4_3

fun main() {

    val isWeatherToday = true
    val isOpenAwning = true
    val isHumidity = 20
    val isTimeOfYear = "зима"
    val plantMonitoring = isWeatherToday && isOpenAwning && HUMIDITY_THRESHOLD == isHumidity && TIME_OF_YEAR != isTimeOfYear
    println("Благоприятные ли условия сейчас для роста бобовых? $plantMonitoring")


}
const val HUMIDITY_THRESHOLD = 20
const val TIME_OF_YEAR = "зима"