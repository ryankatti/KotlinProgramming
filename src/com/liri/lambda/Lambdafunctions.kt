package com.liri.lambda

fun main() {
    // val product = {x:Int, y:Int -> x*y }
    val product: (Int, Int) -> Int = { x, y -> x * y }
    println(" 2* 3 = ${product(2, 3)}")

    val numbers = listOf(9,34,32,7,4,9,45,889)
    val num = numbers.count { it >20 }
    println(num)

    var sum = 0
    numbers.forEach { sum += it }
    println("The sum of $numbers is $sum ")

    var maxValue = max(numbers,{x,y -> x<y})
    println(maxValue)
}


fun <T> max(collection:Collection<T>, less:(T,T)->Boolean):T ?{
     var max:T? = null
    for(x in collection){
      if(max == null || less(max,x)){
        max = x
      }
    }
    return max
}

