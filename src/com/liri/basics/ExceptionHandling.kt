package com.liri.basics

import java.lang.IllegalArgumentException

fun main() {

    println("Please enter divider")
    val divder = readLine().run { this?.toInt() }

    try {
        if(divder == 0){
            throw IllegalArgumentException("Can't divide by 0")
        } else {
            println("5 / $divder = ${5/ divder!!}")
        }
    }  catch (e:IllegalArgumentException){
        println("${e.message}")
    }
}