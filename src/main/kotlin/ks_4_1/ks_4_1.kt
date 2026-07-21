package org.example.ks_4_1

fun main() {

    val bookedToday = 13
    val bookedTomorrow = 9
    val isAvailableToday: Boolean = bookedToday < TOTAL_TABLES
    val isAvailableTomorrow: Boolean = bookedTomorrow < TOTAL_TABLES
    println(
        "Доступность столиков на сегодня: $isAvailableToday " +
                "\nДоступность столиков на завтра: $isAvailableTomorrow"
    )


}

const val TOTAL_TABLES = 13