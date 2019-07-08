package com.liri.gererics.Objects

fun main() {
     var objA = A(20)
     println("${objA.foo()}")
}



open class A(x: Int) {
    open val y: Int = x

    fun foo() {
        val adHoc = object {
            var x: Int = 20
            var y: Int = 40
        }
        println(adHoc.x + adHoc.y)
    }
}

interface B

val ab: A = object : A(1), B {
    override val y = 15
}

