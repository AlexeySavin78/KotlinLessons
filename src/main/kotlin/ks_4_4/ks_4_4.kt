package org.example.ks_4_4

fun main() {

    var isTrainingDay = true
    println(
        "Упражнения для рук:     $isTrainingDay \nУпражнения для ног:     ${!isTrainingDay} " +
                "\nУпражнени для спины:    ${!isTrainingDay} \nУпражнения для пресса:  $isTrainingDay"
    )
    isTrainingDay = false
    println(
        "Упражнения для рук:     $isTrainingDay \nУпражнения для ног:     ${!isTrainingDay} " +
                "\nУпражнени для спины:    ${!isTrainingDay} \nУпражнения для пресса:  $isTrainingDay"
    )

}