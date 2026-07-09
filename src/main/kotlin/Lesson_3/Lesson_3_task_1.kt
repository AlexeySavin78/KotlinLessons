package org.example.Lesson_5

fun main() {

        val greetingTemplate = "Привет,  "
        val userName = "Алекс"

        var fullGreeting = "$greetingTemplate$userName! Хорошего дня!"
        println(fullGreeting)

        fullGreeting = "$greetingTemplate$userName! Приятного вечера!"
        println(fullGreeting)


}