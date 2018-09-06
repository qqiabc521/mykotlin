package com.ljj.kotlin.demo2

class A : AInterface {

    override fun putNum(num: Int) {
        println("int: $num")
    }

    companion object {

        val a = A()
    }
}
