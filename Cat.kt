package com.og

class Cat(food: String, location: String, val fluffiness: Int) : Animal(food, location) {
    private val name = "Cat"
    override fun makeNoise() {
        println("Meow")
    }

    override fun eat() {
        println("$name is eating")
    }

    override fun sleep() {
        println("$name is sleeping")
    }
}