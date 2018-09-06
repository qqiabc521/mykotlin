package com.ljj.kotlin.demo3


open class Animal

class Dog: Animal()

fun Animal.name() = "animal"

fun Dog.name() = "dog"

fun Animal.printName(animal: Animal){
    println(animal.name())
}

fun main(args : Array<String>){
    Dog().printName(Dog())
}

