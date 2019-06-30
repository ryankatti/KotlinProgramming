package com.liri.inheritance


data class User(var firstName:String,var lastName:String) {
    init {
        println("User class Inside init block")
    }
}


class Vehicle {

    constructor(vehicle: Vehicle){
        println("Secondary constructor")
    }

}

class Book(author:String){

    constructor(author: String,year:Int):this(author) {

    }
}

fun main() {

    println("Creating User Object ${User("Jane","Deo").toString()}")

    println("Base class ${Base("Jane").displayMessage()}")
}



open class Base(var name:String){
    init {
        println("Init block inside base class")
    }

    open fun displayMessage(){
        println("Display Message in Base class")
    }
}

class Derived(name:String):Base(name){
   init {
       println("Init block inside derived class ")
   }

    override fun displayMessage(){
        println("Display Message in derived class")
    }
}


interface Foo {
    val count:Int
}

class Bar:Foo {
    override var count: Int = 200
}

open class Ball {
    open val value :Int get() = 100
}


class BatMan: Ball() {
    override val value:Int get() = 200
}

