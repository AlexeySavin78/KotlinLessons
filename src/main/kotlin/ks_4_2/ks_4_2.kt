package org.example.ks_4_2

fun main() {

    val weightFirstCargo = 20
    val volumeFirstCargo = 80
    val weightSecondCargo = 50
    val volumeSecondCargo = 100
    val average = weightFirstCargo > WEIGHT_MINIMAL && weightFirstCargo <= WEIGHT_MAXIMUM
            && volumeFirstCargo < VOLUME_MAXIMUM
    println(average)
    val average2 = weightSecondCargo > WEIGHT_MINIMAL && weightSecondCargo <= WEIGHT_MAXIMUM
            && volumeSecondCargo < VOLUME_MAXIMUM
    println(average2)
    println("Груз весом $weightFirstCargo и объёмом $volumeFirstCargo соответствует категории 'average'")
    println("Груз весом $weightSecondCargo и объёмом $volumeSecondCargo соответствует категории 'average'")




}
const val WEIGHT_MINIMAL = 35
const val WEIGHT_MAXIMUM = 100
const val VOLUME_MAXIMUM = 100