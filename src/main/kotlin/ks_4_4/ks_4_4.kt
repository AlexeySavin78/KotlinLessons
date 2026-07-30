package org.example.ks_4_4

fun main() {

      val day = 5
      val trainingDay = day % 2 == 0
      val ishands = false
      val isabs = false
      val islegs = !ishands
      val isback = !isabs
//      val groupHandsABS = ishands && isabs
//      val isGroupLegsBack = islegs && isback

    println(
        "Упражнения для рук:    ${trainingDay == ishands} \nУпражнения для ног:    ${trainingDay == islegs} \nУпражнения для спины:  ${trainingDay == isback} \nУпражнения для пресса: ${trainingDay == isabs}")
//    val day = 5 // Можно менять на 1, 2, 3... для проверки разных дней

    // Если день нечётный (1, 3, 5...) — тренируем руки и пресс
    // Если день чётный (2, 4, 6...) — тренируем ноги и спину
//    val forArms = day % 2 != 0
//    val forLegs = !forArms
//    val forBack = !forArms
//    val forAbs = forArms
//
//    println(
//        "Упражнения для рук: $forArms\n" +
//                "Упражнения для ног: $forLegs\n" +
//                "Упражнения для спины: $forBack\n" +
//                "Упражнения для пресса: $forAbs"
//    )
}