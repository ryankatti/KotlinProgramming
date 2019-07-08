package com.liri.classes


fun main() {

    var user = User()
    user.name = "Bob"
    println("User Name ")


    var employee = Employee("ALice",30203)
    println("Employe Name = ${employee.name} and Id = ${employee.id}")

}


class User {
    var name:String = ""
}


class Employee(name:String, id:Int){
     var name:String = ""
     var id:Int= 0

    init {
        this.name = name
        this.id = id
    }
}


