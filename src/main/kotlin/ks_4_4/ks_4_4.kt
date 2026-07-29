package org.example.ks_4_4

fun main() {

    var isTrainingDay = 1
    val isHands = 1
    val isLegs = 2
    val isBack = 2
    val isAbs = 1

    println(
        "Упражнения для рук:     ${isTrainingDay == isHands} \nУпражнения для ног:     ${isTrainingDay == isLegs} " +
                "\nУпражнения для спины:   ${isTrainingDay == isBack} \nУпражнения для пресса:  ${isTrainingDay == isAbs}"
    )


}