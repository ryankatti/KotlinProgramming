package com.liri.sortings

fun main() {

    var listOfNumber = listOf(10,24,35,42,45,56,67,18,89,410,411,12,153,164,715)

    var evenNumbers = listOfNumber.filter { it % 2 == 0  }
    for (value in evenNumbers) {
        println(value)
    }


    var myDoubleNumberList = listOfNumber.map { it * 2 }
    myDoubleNumberList.forEach { println(it) }

     var testNumber = listOf(1,2,3,4,5,6)

      var sortedNumber = testNumber.filter { it % 2 == 0 }
                                               .map { it *2 }
     sortedNumber.forEach { println(it) }


    var cars = listOf<Car>(Car("BMW",2000), Car("Audi", 2001), Car("Honda", 2002),
        Car("Subaro", 2004),Car("Tesla",2005), Car("Kia", 2006))

    var sortCars = cars.filter { it.name.startsWith("H") }
                                    .map { it.name.reversed()  }
    sortCars.forEach { println(it) }
}




class Car(var name:String, var year:Int) {

}