package com.liri.abstractions

class MotorCycle(name:String, color:String, weight:Double, override var maxSpeed: Double):
    Vehicle(name,color,weight) {
    
    override fun start() {
        println("Motor cycle starts")
    }

    override fun stop() {
       println("Motor cycle stops")
    }

}