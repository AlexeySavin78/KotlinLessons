package org.example.ks_4_2

fun main() {

    val weightFirstCargo = 20
    val volumeFirstCargo = 80
    val weightSecondCargo = 50
    val volumeSecondCargo = 100
    println(
        "Груз весом 20 и объёмом 80 соответствует категории 'average' ${
            weightFirstCargo > WEIGHT_MINIMAL && weightFirstCargo <= WEIGHT_MAXIMUM
                    && volumeFirstCargo < VOLUME_MAXIMUM
        }"
    )
    println(
        "Груз весом 50 и объёмом 100 соответствует категории 'average' ${
            weightSecondCargo > WEIGHT_MINIMAL && weightSecondCargo <= WEIGHT_MAXIMUM
                    && volumeSecondCargo < VOLUME_MAXIMUM
        }"
    )


}

const val WEIGHT_MINIMAL = 35
const val WEIGHT_MAXIMUM = 100
const val VOLUME_MAXIMUM = 100