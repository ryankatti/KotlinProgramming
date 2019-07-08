package com.liri.invoke

fun main() {

    var point = Point(201,405)
    var point2 = Point(302,485)
     println(point.plus(point2).x)

    var sum = point + point2

    println("Sum x = ${sum.x} y =${sum.y} ")
}


class Point(val x:Int = 10, val y:Int = 20){

    //overloading plus function
    operator fun plus(p:Point):Point {
        return Point(x+p.x, y+p.y)
    }
}