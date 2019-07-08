package com.liri.inlineclasses

fun main() {
    val securePassWord = Password("passcode")
    println(securePassWord)

    val inlineTest = Name("Kotlin")
    println(inlineTest.greets())
}


inline class Password(val value:String)

inline class Name(val value:String){
    val length:Int get() = 200

    fun greets(){
        println("Hello $value")
    }
}