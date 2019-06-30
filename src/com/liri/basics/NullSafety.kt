package com.liri.basics

fun main() {

    var company: String? = null
    var msg = getGreetings(120)
    
     println(getGreetings(20))
}

fun getGreetings(age: Int): String? {
    if (age > 100) {
        return null
    } else return "Good Day"
}

