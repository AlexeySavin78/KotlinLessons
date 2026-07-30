package org.example.ks_4_4

fun main() {

      val day = 5
      val istrainingDay = day % 2 == 0
      val ishands = false
      val isabs = false
      val islegs = !ishands
      val isback = !isabs

    println(
        "Упражнения для рук:    ${istrainingDay == ishands} \nУпражнения для ног:    ${istrainingDay == islegs} \nУпражнения для спины:  ${istrainingDay == isback} \nУпражнения для пресса: ${istrainingDay == isabs}")
}