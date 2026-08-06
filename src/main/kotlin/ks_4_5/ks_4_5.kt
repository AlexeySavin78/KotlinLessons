package org.example.ks_4_5

fun main() {

    val hull = readln().toBoolean()
    val isHullDamaged = hull == true
    val crew = readln().toInt()
    val hasEnoughCrew = crew >= ENOUGH_CREW_LOWER && crew <= ENOUGH_CREW_UPPER
    val hasEnoughCrew1 = crew == ENOUGH_CREW_UPPER
    val provisions = readln().toInt()
    val isBoxProvisions = provisions > BOX_PROVISION
    val isBoxProvisions1 = provisions >= BOX_PROVISION
    val isWeatherSafe = readln().toBoolean()

    val canDeparture = (!isHullDamaged && hasEnoughCrew && isBoxProvisions)
            || (isHullDamaged && hasEnoughCrew1 && isBoxProvisions1 && isWeatherSafe)

    println(canDeparture)


}

const val ENOUGH_CREW_LOWER = 55
const val ENOUGH_CREW_UPPER = 70
const val BOX_PROVISION = 50