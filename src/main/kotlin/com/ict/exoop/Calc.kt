package com.ict.exoop

class Calc {
    var a = 0
    var b = 0

    fun sum():Int{
        return a + b
    }

    fun max():Int{
        return if (a > b) a else b
    }

    fun isTriangle(c:Int): Boolean {
        return a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a
    }

    fun printCalc(){
        println("A: $a, B: $b")
    }
}