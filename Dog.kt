package com.og

class Dog(food: String, location: String, val barkNoise: Int) : Animal(food, location) {
    private val name = "Dog"
    override fun makeNoise() {
        println("Woof!")
    }

    override fun eat() {
        println("$name is eating")
    }

    override fun sleep() {
        println("$name is sleeping")
    }
}