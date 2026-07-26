package org.example.ks_4_2

fun main() {

    val weightFirstCargo = 20
    val volumeFirstCargo = 80
    val weightSecondCargo = 50
    val volumeSecondCargo = 100
    println(
        "Груз с весом 20 кг и объёмом 80 л соответствует категории 'Average': ${
            weightFirstCargo > WEIGHT_MINIMAL && weightFirstCargo <= WEIGHT_MAXIMUM
                    && volumeFirstCargo < VOLUME_MAXIMUM
        }"
    )
    println(
        "Груз с весом 50 кг и объёмом 100 л соответствует категории 'Average': ${
            weightSecondCargo > WEIGHT_MINIMAL && weightSecondCargo <= WEIGHT_MAXIMUM
                    && volumeSecondCargo < VOLUME_MAXIMUM
        }"
    )


}

const val WEIGHT_MINIMAL = 35
const val WEIGHT_MAXIMUM = 100
const val VOLUME_MAXIMUM = 100