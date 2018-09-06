package com.ljj.kotlin.demo5


class Single private constructor(){
    companion object {
        fun get(): Single{
            return Holder.instance
        }
    }

    private object Holder{
        val instance = Single()
    }
}

class StringUtil{
    companion object {
        fun isEmpty(str : String): Boolean{
            return "" == str
        }
    }
}

fun main(args: Array<String>){
    println(StringUtil.isEmpty("test"))

    Single.get()
}