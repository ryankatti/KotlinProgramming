package com.liri.sealedclasses

fun main() {
   println("Sealed class ${Consta(2.0)}")
}


sealed class Expre

data class Consta(var value:Double) : Expre(){
    
}