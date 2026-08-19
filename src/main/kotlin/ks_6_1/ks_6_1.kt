package org.example.ks_6_1

fun main() {

    println("Создайте логин:")
    val login = readln()
    println("Создайте пароль:")
    val password = readln()
    println("Регистрация прошла успешно.Для авторизации введите логин:")
    var loginUser = readln()
    while (loginUser != login) {
        println("Неверный логин. Введите логин:")
        loginUser = readln()
    }
    println("Введите пароль:")
    var passwordUser = readln()
    while (passwordUser != password) {
        println("Неверный пароль. Введите пароль:")
        passwordUser = readln()
    }
    println("Авторизация прошла успешно")
}