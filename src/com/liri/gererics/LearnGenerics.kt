package com.liri.gererics

fun main() {

   var boxInt = Box(20)
   var boxString = Box("Message")
    

  println("Box of Int = ${boxInt}")
}

class Box<T>(t:T){

}


