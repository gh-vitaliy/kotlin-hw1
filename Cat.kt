package com.og

class Cat(food: String, location: String, val fluffiness: Int) : Animal(food, location) {

    override fun makeNoise() {
        println("Meow")
    }
}