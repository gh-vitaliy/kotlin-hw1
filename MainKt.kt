package com.og

fun main() {
    val veterinarian = Veterinarian()
    val animalList: List<Animal> =
        listOf(
            Dog("Cat", "Street", 5),
            Cat("Milk", "Home", 3),
            Horse("Oats", "Farm", 120)
        )
    animalList.forEach { animal -> veterinarian.treatAnimal(animal) }
}