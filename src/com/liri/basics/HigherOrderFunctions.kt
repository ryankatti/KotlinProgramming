package com.liri.basics

fun main() {

    val numList = 1..50
    val evenList = numList.filter { it % 2 == 0 }
   // evenList.forEach { it-> println(it) }

    val mulitply = { num1:Int ->num1 * 2 }
    println("Mulitply $mulitply")

    println("${makeMathFunctions(5)}")
    val numList2 =  arrayOf(1,2,3,4,5)
    mathOnList(numList2,mulitply)
}


fun makeMathFunctions(num:Int) :(Int)->Int = { num2-> num * num2}

fun mathOnList(numList: Array<Int>, myFunc: (num: Int) -> Int) {
    for (num in numList) {
        println("MathOnList ${myFunc(num)}")
    }
}


