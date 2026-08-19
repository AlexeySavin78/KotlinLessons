package org.example.ks_6_1

fun main() {

    println("Создайте логин:")
    val login = readln()
    println("Создайте пароль:")
    val password = readln()
    println("Регистрация прошла успешно.Для авторизации введите логин и пароль:")
    var loginUser = readln()
    var passwordUser = readln()
    while (loginUser != login || passwordUser != password) {
        println("Неверный логин или пароль. Введите логин и пароль:")
        loginUser = readln()
        passwordUser = readln()
    }
    println("Авторизация прошла успешно")
}