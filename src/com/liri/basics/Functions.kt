package com.liri.basics

fun main() {
    var num1: Int = 20
    var num2: Int = 50

    println("Add $num1 and $num2 ${add(num1,num2)}")
    println("Substract $num1 and $num2 ${substract(num1,num2)}")
    println("Substract $num1 and $num2 ${substract(num1 = num1,num2 = num2)}")
    displayMessage("Kotlin")
    println(nextTo(20))
    println("Sum ${getSum(1,2,2,2,2,2,2,4)}")

    val multiply = {num1:Int, num2:Int ->num1*num2}
    println("Multiply = ${multiply(5,3)}")
    println("Factorial ${factorial(5)}")
}


fun add(num1: Int, num2: Int): Int = num1 + num2

fun substract(num1: Int, num2: Int) = num2 - num1

fun displayMessage(message: String){
    println("Hello $message")
}


fun nextTo(num:Int):Pair<Int,Int>{
    return Pair(num+10, num+2)
}


fun getSum(vararg nums:Int):Int{
    var sum = 0
    nums.forEach {n-> sum += n  }
    return sum
}


fun factorial(number: Int): Int {
    tailrec fun factTailRec(y: Int, z: Int): Int {
        if (y == 0) return z
         else return factTailRec(y - 1, y * z)
    }
    return factTailRec(number,1)
}
