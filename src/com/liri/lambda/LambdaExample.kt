package com.liri.lambda

fun main() {

    var addLambdaFunction:(Int)->Unit = {s -> println(s)}
    var subLambdaFunctions:(Int,Int)->Int = { a,b -> a-b  }

    addTwoNumbers(20,50, addLambdaFunction)
    substractTwoNumber(80,30,subLambdaFunctions)

}

fun addTwoNumbers(num:Int, num2:Int, addLambda:(Int)->Unit){
   var sum =  num + num2
    addLambda(sum)
}


fun substractTwoNumber(num:Int,num2:Int, subLambada:(Int,Int)->Int){
    var sub = subLambada(num,num2)
    println("Substraction = $sub")
}