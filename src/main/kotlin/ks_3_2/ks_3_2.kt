package org.example.ks_3_2

fun main() {

    val firstName = "Татьяна"
    var secondName = "Андреева"
    val patronymic = "Сергеевна"

    val age = 22
    println("[$secondName $firstName $patronymic, ${age-2}]")
    secondName = "Сидорова"
    println("[$secondName $firstName $patronymic, $age]")

}