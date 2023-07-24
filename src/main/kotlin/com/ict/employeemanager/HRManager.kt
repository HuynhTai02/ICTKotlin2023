package com.ict.employeemanager

class HRManager {
    private val employees = mutableListOf<Employee>()
    internal var loggedInEmployeeId: Int? = null

    fun addEmployee(employee: Employee) {
        employees.add(employee)
        println("Nhân viên đã được thêm vào hệ thống.")
    }

    fun printEmployee(){
        println(employees)
    }

    fun updateEmployee(id: Int?, name: String, age: Int?, position: String, salary: Float?) {
        val employee = employees.find { it.id == id }
        if (employee != null) {
            if (name.isNotEmpty()) {
                employee.name = name
            }
            if (age != null) {
                employee.age = age
            }
            if (position.isNotEmpty()) {
                employee.position = position
            }
            if (salary != null) {
                employee.salary = salary
            }
            println("Thông tin nhân viên đã được cập nhật.")
        } else {
            println("Không tìm thấy nhân viên có ID $id.")
        }
    }

    fun deleteEmployee(id: Int?) {
        val employee = employees.find { it.id == id }
        if (employee != null) {
            employees.remove(employee)
            println("Nhân viên có ID $id đã được xoá khỏi hệ thống.")
        } else {
            println("Không tìm thấy nhân viên có ID $id.")
        }
    }

    fun viewEmployeeInfo(employeeId: Int?) {
        val employee = employees.find { it.id == employeeId }
        if (employee != null) {
            println("Thông tin của nhân viên có ID ${employee.id}:")
            println("Tên: ${employee.name}")
            println("Vị trí: ${employee.position}")
            println("Tuổi: ${employee.age}")
            println("Lương: ${employee.salary}")
        } else {
            println("Không tìm thấy thông tin cho nhân viên có ID $employeeId.")
        }
    }

    fun sortEmployeesBySalary() {
        employees.sortByDescending { it.salary }
        println("Đã sắp xếp nhân viên theo lương giảm dần.")
    }

    fun sortEmployeesByAge() {
        employees.sortBy { it.age }
        println("Đã sắp xếp nhân viên theo tuổi tăng dần.")
    }

    fun searchEmployeeByName(name: String) {
        val matchingEmployees = employees.filter { it.name.contains(name, ignoreCase = true) }
        if (matchingEmployees.isNotEmpty()) {
            println("Kết quả tìm kiếm:")
            matchingEmployees.forEach {
                println("ID: ${it.id}, Tên: ${it.name}, Vị trí: ${it.position}, Tuổi: ${it.age}, Lương: ${it.salary}")
            }
        } else {
            println("Không tìm thấy nhân viên có tên chứa \"$name\".")
        }
    }

    fun loginAsAdmin() {
        println("Đăng nhập với tài khoản quản lý (Admin):")

        println("Tài khoản: ")
        val username = readln()
        println("Mật khẩu: ")
        val password = readln()

        if (username == "admin" && password == "admin123") {
            println("Đăng nhập thành công với tài khoản Admin.")
            loggedInEmployeeId = -1 // Dùng giá trị -1 để biểu thị là đăng nhập với tư cách admin
        } else {
            println("Tài khoản hoặc mật khẩu không đúng.")
        }
    }
}