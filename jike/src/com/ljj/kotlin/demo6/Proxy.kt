package com.ljj.kotlin.demo6


interface  Animal{
    fun bark()
}

class Dog: Animal{
    override fun bark() {
        println("wang wang")
    }
}

class Zoo(animal: Animal) : Animal by animal{
    override fun bark() {
        println("zoo")
    }
}

fun main(args: Array<String>){
    Zoo(Dog()).bark()
}