package com.liri.companionobjects

fun main() {

    Diamond.greetings()

    println(GoldPan.message)
}


class Diamond {
    companion object{
        fun greetings(){
            println("Good Morning")
        }
    }
}


object GoldPan {
   var message = "Good Morning"

}