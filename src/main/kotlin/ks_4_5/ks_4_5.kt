package org.example.ks_4_5

fun main() {

    val hull = readln().toInt()
    val isHullIntact = hull == 0
    val crew = readln().toInt()
    val hasEnoughCrew = crew in 50..70
    val provisions = readln().toInt()
    val isBoxProvisions = provisions > 50
    val weather = readln()
    val isWeatherSafe = weather == "благоприятная"

    val canDeparture = (isHullIntact || !isHullIntact) && hasEnoughCrew && isBoxProvisions && isWeatherSafe

    println(canDeparture)


}