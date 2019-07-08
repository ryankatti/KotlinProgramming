package com.liri.gererics.interfaces

fun main() {
   var myInterface:MyInterface = Child()
    println("${myInterface.bar()} prop value = ${myInterface.prop}")
    println("${myInterface.bar()} prop value = ${myInterface.propertyWithImplementation}")

}


interface MyInterface {
    val prop:Int
    val propertyWithImplementation: String
        get() = "MyInterface Foo"
    fun foo()
    fun bar(){
       println("MyInterface Bar")
    }
}

class Child: MyInterface {

    override val prop: Int
        get() = 200

    override fun foo() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun bar() {
        super.bar()
    }

    override val propertyWithImplementation: String
        get() = "Derived class"
}