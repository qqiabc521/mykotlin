package com.ljj.kotlin.demo3

import java.io.File

fun main(args: Array<String>){
    val file = File("mykotlin.iml")
    println(file.readText())
}
