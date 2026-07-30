package org.example.ks_4_4

fun main() {

      val day = 5
      val trainingDay = day % 2 == 0
      val ishands = false
      val isabs = false
      val islegs = !ishands
      val isback = !isabs

    println(
        "Упражнения для рук:    ${trainingDay == ishands} \nУпражнения для ног:    ${trainingDay == islegs} \nУпражнения для спины:  ${trainingDay == isback} \nУпражнения для пресса: ${trainingDay == isabs}")
}