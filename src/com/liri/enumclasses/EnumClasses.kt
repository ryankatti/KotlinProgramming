package com.liri.enumclasses

fun main() {
     val color = Color.RED
     println(color)
}


enum class Color(val rgb:Int){
     RED(0XFF0000),
     GREEN(0X00FF00),
     BLUE(0X0000FF)
}


enum class ProtocolState {
    WALKING{
        fun signal(){
            println("walking")
        }

    },

    TALKING{
        fun signal(){
            println("TALKING")
        }
    }



}