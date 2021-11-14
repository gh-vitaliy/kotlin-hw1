package com.og

class Horse(food: String, location: String, val speed: Int) : Animal(food, location) {
    private val name = "Horse"
    override fun makeNoise() {
        println("Igogo")
    }

    override fun eat() {
        println("$name is eating")
    }

    override fun sleep() {
        println("$name is sleeping")
    }
}