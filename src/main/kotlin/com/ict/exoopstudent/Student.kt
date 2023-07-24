package com.ict.exoopstudent

//Constructor
//Ex1
//class Student(name: String, age: Int) {
//    private val name:String = name
//    private val age:Int = age
//    fun printInF() {
//        println("Name: $name")
//        println("Age: $age")
//    }
//}

//Ex2
//class Student(private val name: String, private val age: Int) {
//    fun printInF() {
//        println("Name: $name")
//        println("Age: $age")
//    }
//}

//Ex3
//Internal
//Regulations are for internal use only
//Sub: Quy định chỉ được sử dụng bên trong nội bộ goi (Package)
//class Student internal constructor(var name: String,var age:Int){
//    fun printInF() {
//        println("Name: $name")
//        println("Age: $age")
//    }
//}

//Ex4
class Student(var id:Int, var name: String, var age: Int) {
    init {
        name = name.split(" ").joinToString(" ") { it.capitalize() }
    }

    fun printInfo() {
        println("Id: $id")
        println("Name: $name")
        println("Age: $age")
    }
}

