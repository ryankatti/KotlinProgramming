package com.liri.basics

import java.util.*

fun main() {

    val rand = Random()
    val magicNumber =  rand.nextInt(5)+1
    var guess = 0

    while(magicNumber != guess){
         guess+= 1
    }

    println("Magic Number was $guess")

    for (x in 1..100) {
        if (x % 2 == 0) {
            continue
        }

        println("Odd = $x")
        if (x == 10) {
            break
        }
    }


    var myArray:Array<Int> = arrayOf(1,2,3,5,6)

    for (i in myArray.indices)
        println(myArray[i])

    for((index, value) in myArray.withIndex()){
       println("Index = $index value = $value")
    }
}


