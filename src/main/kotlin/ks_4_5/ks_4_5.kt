package org.example.ks_4_5

fun main() {

    val hull = true
    val isHullIntact = hull == true
    val isHullIntact1 = hull == false
    val crew = readln().toInt()
    val hasEnoughCrew = crew in 55..70
    val hasEnoughCrew1 = crew == 70
    val provisions = readln().toInt()
    val isBoxProvisions = provisions > 50
    val isBoxProvisions1 = provisions >= 50
    val weather = true
    val isWeatherSafe = weather == true

    val canDeparture = (isHullIntact || !isHullIntact1) && (hasEnoughCrew || hasEnoughCrew1) && (isBoxProvisions || isBoxProvisions1) && isWeatherSafe

    println(canDeparture)


}