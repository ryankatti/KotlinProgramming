package com.liri.extensions

fun main() {
    val bar = "Bob"
    println(bar.ToUpperCase())

    var list:MutableList<Int> = MutableList(2) { index ->  2+ index }
    list.add(0,20)
    list.add(1,40)

    println(list.swap(0,1))

    println("Foo ${Foo().foo()}")
}

fun String.ToUpperCase() : String{
    println("Extension function called")
    return this.toUpperCase()
}

fun MutableList<Int>.swap(index1:Int, index2:Int) :MutableList<Int>{
      val temp = this[index1]
      this[index1] = this[index2]
      this[index2] = temp
      return this
}

class Foo {

    fun foo() {
        println("Member function foo")
    }
}


fun Foo.foo(){
    println("Extension function foo ")
}