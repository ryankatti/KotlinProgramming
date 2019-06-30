package com.liri.basics

fun main() {
    val list:MutableList<Int> = mutableListOf(1,2,3,4,5)
    val list1:List<Int>  = listOf(1,2,3,4,5)

    println(list.forEach{it -> println(it) })
    println("1st = ${list.first()}")
    println("Lasy = ${list.last()}")


    val list2 = list1.subList(0,2)


    val map = mutableMapOf<Int,Any?>()
    val map2 = mutableMapOf(1 to "One", 2 to "Two")

    map[1] = "Kotlin"
    map[2] = "Java"


    for((key,value) in map){
       println("Key $key value $value")
    }
}