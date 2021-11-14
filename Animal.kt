package com.og

abstract class Animal(val food: String, val location: String) {
    open val name = this.javaClass.name.split(".").last()
    abstract fun makeNoise()

    fun eat() {
        println("$name is eating")
    }

    fun sleep() {
        println("$name is sleeping")
    }
}