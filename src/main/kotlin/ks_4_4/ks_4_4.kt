package org.example.ks_4_4

fun main() {

    var isTrainingDay = 1
    val isHands = 1
    val isLegs = 2
    val isBack = 2
    val isAbs = 1

    println(
        "Упражнения для рук:     ${(isTrainingDay + 1) == isHands}" + "Упражнения для ног:     ${(isTrainingDay + 1)== isLegs} " +
                "Упражнения для спины:   ${(isTrainingDay + 1) == isBack} Упражнения для пресса:  ${(isTrainingDay + 1) == isAbs}"
    )

}