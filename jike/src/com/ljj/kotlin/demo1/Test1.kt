package com.ljj.kotlin.demo1

import kotlin.reflect.KClass

var age: Int = 10
var name: String = "ljj"
var name2: String? = null

fun main(args: Array<String>){
    name2 = "my kotlin"
    name = name2!!
    name2 = name
    printlen(name)
    testClass(JavaMain::class.java)
    testClass(KotlinMain::class)
    println(JavaMain.`in`)
}

fun printlen(str: String): String {
    println("这是一个字符串： $str")
    return str
}

fun testClass(clazz: Class<JavaMain>){
    println(clazz.name)
}

fun testClass(clazz: KClass<KotlinMain>){
    println(clazz.simpleName)
}