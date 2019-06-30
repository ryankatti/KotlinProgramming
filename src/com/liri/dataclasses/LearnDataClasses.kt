package com.liri.dataclasses

fun main() {
    println("Data class ${Motor("Jeep",2020)}")
    println("Data class Person ${Person("Bob")}")

}

data class Motor(val name:String,val year:Int){

}


data class Person(var name:String){
    var age:Int = 20
}