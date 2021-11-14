package com.og

abstract class Animal(val food: String, val location: String) {
    abstract fun makeNoise()
    abstract fun eat()
    abstract fun sleep()
}