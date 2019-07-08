package com.liri.classes



fun main() {
    var car =  Car("Honda", 2012)
    println("Car Manufacture = ${car.manufacturer } and year = ${car.year}")
}



class Car(var manufacturer: String){
    var year:Int = 0
    init {
        println("Manufacture = $manufacturer")
    }

    /**
     * You can't declare properties in the  secondary constructors.
     */
    constructor(manufacturer:String, year:Int):this(manufacturer){
        this.year = year
    }
}