package com.liri.nestedclasses

fun main() {
    var outer:Outer = Outer()
    println(outer.Foo().foo())
}


class Outer{
    private val bar:Int = 2

    inner class Foo {
        fun foo(){
            println("Foo Inner class method")
        }
    }


}
