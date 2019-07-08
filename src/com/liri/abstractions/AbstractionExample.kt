package com.liri.abstractions

fun main() {

    var car = Car("BMW","Blue", 3023.0,400.0)
    var ducati = MotorCycle("Ducati 2000", "Red", 550.0, 900.0)

    car.displayDetails()
    ducati.displayDetails()
}


abstract class Vehicle(val name:String,val color:String,val weight:Double)  {

    // Abstract Property (Must be overridden by Subclasses)
    abstract var maxSpeed:Double

    // Abstract Methods (Must be implemented by Subclasses)
    abstract fun start()
    abstract fun stop()

    fun displayDetails(){
        println("name = $name color = $color weight = $weight")
    }

}