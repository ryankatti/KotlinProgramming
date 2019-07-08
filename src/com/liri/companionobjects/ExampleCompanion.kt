package com.liri.companionobjects

fun main() {
    var redBull = RedBull()
    redBull.greettings()

    println(RedBull.getSystemTime())

}


class RedBull {
    fun greettings() = println("Good Morning !")

    companion object {
        fun getSystemTime():Long {
            return System.currentTimeMillis()
        }
    }
}