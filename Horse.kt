package com.og

class Horse(food: String, location: String, val speed: Int) : Animal(food, location) {

    override fun makeNoise() {
        println("Igogo")
    }
}