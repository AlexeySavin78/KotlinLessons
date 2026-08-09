package org.example.ks_5_2

fun main() {

    val yearOfBirth = readln().toInt()
    val theCurrentYear = 2026
    val userAge = theCurrentYear - yearOfBirth
    if (userAge >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")


}

const val AGE_OF_MAJORITY = 18