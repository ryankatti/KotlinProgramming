package com.liri.abstractions

class Car(name:String,color:String, weight:Double,
          override var maxSpeed: Double) : Vehicle(name,color,weight) {

    override fun start() {
        println("Car start")
    }

    override fun stop() {
       println("Car stop")
    }

}