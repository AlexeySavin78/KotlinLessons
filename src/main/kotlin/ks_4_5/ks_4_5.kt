package org.example.ks_4_5

fun main() {

    val hull = readln().toBoolean()
    val isHullIntact = hull == true
    val crew = readln().toInt()
    val hasEnoughCrew = crew in 55..70
    val hasEnoughCrew1 = crew == 70
    val provisions = readln().toInt()
    val isBoxProvisions = provisions > 50
    val isBoxProvisions1 = provisions >= 50
    val weather = readln().toBoolean()
    val isWeatherSafe = weather == true
    val isWeatherSafe1 = weather == false

    val canDeparture = (isHullIntact && hasEnoughCrew && isBoxProvisions && (isWeatherSafe || isWeatherSafe1))
            || (!isHullIntact && hasEnoughCrew1 && isBoxProvisions1 && isWeatherSafe)

    println(canDeparture)


}