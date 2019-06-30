package com.liri.basics

fun main() {
    val numberList = 1..10
    val listSum = numberList.reduce { x, y -> x + y }
    println("Reduced sum = $listSum")

    val listSum2 = numberList.fold(5){x, y -> x + y }
    println("Fold sum = $listSum2")


    println("Even numbers ${numberList.any { it % 2 == 0 }}")
    println("Even numbers ${numberList.all { it % 2 == 0 }}")

    val bigNumber = numberList.filter {  it > 3 }

    bigNumber.forEach { n -> println(n) }



    val times = numberList.map { it -> it * 2 }
    times.forEach {n-> println(n)  }

}