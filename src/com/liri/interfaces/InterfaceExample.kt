package com.liri.interfaces

fun main() {

    var button = Button()
    button.onClick()
    button.onTouch()
}


interface ButtonEventListeners {
    
    var tag:String

    fun onTouch()

    fun onClick(){
        println("ButtonEventListeners onclick ")
    }
}


interface EventListeners{
    
    fun onTouch(){
      println("EventListeners onTouch")
    }

    fun onClick(){
        println("EventListeners OnClick")
    }
}


class Button: ButtonEventListeners,EventListeners {

    override var tag:String = "Tag"

    override fun onTouch() {
      println("Button on Touch Listener")
       super.onTouch()
    }

    override fun onClick() {
        super<EventListeners>.onClick()
        super<ButtonEventListeners>.onClick()
        println("Buttonclass Impl onClick")
    }
}