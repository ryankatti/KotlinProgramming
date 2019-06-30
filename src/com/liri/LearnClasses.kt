package com.liri

fun main() {
    val dog = Animal("Petty", 2.20,20.0)
    dog.getInfo()


    var dog2 = Dog("Bob",2.0, 3.8,"Jane Doe")
    dog2.getInfo()


    var math = Maths("Kotlin")
    println(math.calculateSum(20))
}


open class Animal(val name:String, var height:Double,var weight:Double){

    init {
       println("Animal Init method")

        val regex = Regex(".*\\d+.*")
        require(!name.matches(regex)){
            "Animal name can't contain number"
        }

        require(height > 0){"Animal height should be > 0"}
        require(weight > 0){"Animal weight should > 0"}

    }


    open fun getInfo(){
        println("name = $name height = $height weight= $weight ")
    }
}


class Dog(name:String,height:Double,weight:Double,var owner:String):Animal(name,height,weight){

    override fun getInfo() {
        println("name = $name height = $height weight= $weight  and owner is $owner")
    }
}


interface LearnInterface {
    val total:Int
    fun calculateSum(number:Int)
}


class Maths constructor(var name:String):LearnInterface {

    override val total: Int
        get() = 200

    override fun calculateSum(number: Int) {
       println("Calculate Sum ${name}")
    }

}