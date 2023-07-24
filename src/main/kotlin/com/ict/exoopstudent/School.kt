package com.ict.exoopstudent

class School {
    private val students = mutableListOf<Student>()

    fun addStudent(student: Student) {
        students.add(student)
    }

    fun findStudentById(id: Int): Student? {
        return students.find { it.id == id }
    }

    fun removeStudent(student: Student) {
        students.remove(student)
    }

    fun removeStudentById(id: Int) {
        students.removeIf { it.id == id }
    }

    fun displayAllStudents() {
        println("Students in School:")
        students.forEach { it.printInfo() }
    }
}