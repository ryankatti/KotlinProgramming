package com.liri.dataclasses

fun main() {
  var apple = Apple("Texas West")
  println(apple)

  var bot1 = Bot("Chat", 2122)
  var bot2 =  Bot("Chat",2122)
  println("Bot1 and Bot2 equals = ${bot1 == bot2}")

  var newBot = bot1.copy(unqiueId = 1234)
    println(newBot)
}


data class Bot(var name:String,var unqiueId:Int) {

}

class Apple(region:String){
   init {
       println("Apple region $region")
   }
}