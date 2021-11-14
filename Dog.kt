package com.og

class Dog(food: String, location: String, val barkNoise: Int) : Animal(food, location) {
    override fun makeNoise() {
        println("Woof!")
    }
}