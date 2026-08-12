package org.example.ks_5_4

fun main() {

    println("Введите логин:")
    val userName = readln()
    when (userName) {
        "Zaphod" -> {
            println("Введите пароль:")
            val password = readln()
            when (password) {
                "PanGalactic" -> println("Пользователь \"Zaphod\", вам разрешено входить на борт корабля \"Heart of Gold\"")
                else -> println("Неверный пароль")
            }
        }
        else -> println("Пользователь не зарегистрирован. Зарегистрируйтесь, пожалуйста")
    }
}