package org.example.ks_4_4

fun main() {

    var isTrainingDay = 5
    val isHands = 5
    val isLegs = 6
    val isBack = 6
    val isAbs = 5

    println(
        "Упражнения для рук:    ${isTrainingDay == isHands} \nУпражнения для ног:    ${isTrainingDay == isLegs} \nУпражнения для спины:  ${isTrainingDay == isBack} \nУпражнения для пресса: ${isTrainingDay == isAbs} ${isTrainingDay + 1}")

}