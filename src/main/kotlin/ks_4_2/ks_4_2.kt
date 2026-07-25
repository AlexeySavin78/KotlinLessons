package org.example.ks_4_2

fun main() {

    val average = "$WEIGHT_MINIMAL, $WEIGHT_MAXIMUM, $VOLUME_MAXIMUM"
    val firstCargoWeight = 20
    val firstCargoVolume = 80
    val firstCargo = "$firstCargoWeight, $firstCargoVolume"
    val secondCargoWeight = 50
    val secondCargoVolume = 100
    val secondCargo = "$secondCargoWeight, $secondCargoVolume"
    println(average == firstCargo)
    println(average == secondCargo)


}
const val WEIGHT_MINIMAL = 35
const val WEIGHT_MAXIMUM = 100
const val VOLUME_MAXIMUM = 100