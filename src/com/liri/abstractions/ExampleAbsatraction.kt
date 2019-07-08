package com.liri.abstractions

fun main() {

    var phoneUtil = PhoneUtilImpl()
    println("Is Device Airplane mode is ON ? ${phoneUtil.isAirplaneMode}")
}

abstract class PhoneUtil {
    
    val isAirplaneMode:Boolean
        get() {
           return true
        }
}

class PhoneUtilImpl: PhoneUtil() {

}