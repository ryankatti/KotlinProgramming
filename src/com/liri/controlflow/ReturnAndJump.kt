package com.liri.controlflow


fun main() {

    var person:Person = Person("Liri")
    var name = person.name?: return

    println("Person Name ${person.name}")
    println("Label ${labelVerify()}")
}


class Person(var name:String) {
}

fun labelVerify(){
    loop@ for (i in 1..100) {
           println("i = $i")
          for (j in 1..100) {
             if ( j == 100) break@loop
              println("j = $j")
        }
    }
}
