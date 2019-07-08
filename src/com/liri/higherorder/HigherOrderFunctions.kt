package com.liri.gererics.HigherOrder

fun main() {

    var values = listOf(2, 4, 5, 3, 8, 8, 9)
    //Passing functions to functions
    // values.forEach { println(it) }
    values.forEach(::println)

}


