package com.liri.invoke

fun main() {

    var config  = Config()
    println(config.get())

    var configInvoke = ConfigInvoke()
    println(configInvoke())

    var number1 = 20
    var number2 = 40

    println(number1.plus(number2))


    var greetings = "Good Morning!!. "
    var message   = " How are you doing ?"

    println(greetings.plus(message))
}


class Config {

    fun get(): String {
        return "Config"
    }
}

class ConfigInvoke {

    operator fun invoke():String{
       return this.get()
    }

    
    private fun get():String{
        return "ConfigInvoke"
    }
    
}