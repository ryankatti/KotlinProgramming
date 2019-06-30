package com.liri.controlflow


fun main() {

    val value = 40
    val value2 = 70
    println("Max number ($value , $value2) is = ${findTheMaxNumber(value,value2)}")
    println("Max number using function as expression ($value , $value2) is = ${findMaxNumber(value,value2)}")
    println("Max number using function as block ($value , $value2) is = ${blockFunction(value,value2)}")

    println("WhenStatement ${whenStatementfunction(20)}")

    println("ForLoop ${verifyForLoop()}")

}


fun findTheMaxNumber(value:Int,value2: Int):Int {
    if(value > value2)
        return value
    else return value2
}

//function as expression.
fun findMaxNumber(value:Int, value2:Int):Int = if(value > value2) value else value2


fun blockFunction(value:Int, value2:Int):Int {
    val max = if( value > value2){
                        println("Value is greater than value2")
                        value
                    } else {
                        println("Value is smaller than value2")
                        value2
                    }
    return max
}


fun whenStatementfunction(value:Int){
    when(value){
        1-> println("When value is 1")
        2-> println("When value is 2")
        3, 20 -> println("Number range is inbetween 1 to 20")
        else ->{
            println("Nothing matched default case")
        }
    }
}


fun verifyForLoop(){
    for(index in 1..200){
        println(index)
    }
}



