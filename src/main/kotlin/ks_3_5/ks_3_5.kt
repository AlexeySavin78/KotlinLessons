package org.example.ks_3_5

fun main() {


    val moveChess = "D2-D4;0"
    val parts = moveChess.split("-",";")
    val startMove = parts[0]
    val endMove = parts[1]
    val move = parts[2]
    println(startMove)
    println(endMove)
    println(move)


}