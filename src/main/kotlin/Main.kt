import com.ict.employeemanager.Employee
import com.ict.employeemanager.HRManager

//Hello World!!
//fun main(){
//    println("Hello World!")
//
//    print("Hello ")
//    print("World!")
//}

//Declare variable
//Sub: Khai bao bien
//fun main(){
//
//    //Ex1
//    var x = 5 // var variable: you can change value
//    x = 10
//
//    val y = 20 // val cannot be assigned
//    //y = 30 : Error
//
//    //Ex2
//    var z: Int = 20
//    z = x
//    val t: String = "Bien trong Kotlin"
//
//    //"x is: $x,y is: $y ": String Template
//    println("x is: $x,y is: $y")
//
//    println("$z ".plus(t))
//    println("z is $z and t is $t")
//
//    //Convert Double -> Int
//    var a:Double = 5.0
//    var b:Int = a.toInt()
//    b = 10
//
//    println("a: $a")
//    println("b: $b")
//}

//Functions
//fun main(){
//    sayHello("Tai Mobile")
//
//    println("\n")
//    val resultSum = sum(20.99,10.21)
//    println("sum is $resultSum")
//    println("sum is ${sum(1.1,2.9)}")
//    println("sum is ${sum(x = 1.1,y = 2.9)}")
//
//    println("\n")
//    val resultDiv = div(11.0,3.0)
//    println("div is ".plus(resultDiv))
//
//    println("\n")
//    showColor(255,0,0,0.5f)
//
//    println("\n")
//    like("ToiDiCodeDao","Android Book","Beginner Android","Kotlin Tutorial")
//
//    println("\n")
//    val z = 20 plus 5
//    println("z = $z")
//    println("10 plus 11 = ${10 plus 11}")
//
//    //Double
//    val t = 4.0 mul 5.2
//    println("t = $t")
//    println("4.0 mul 5.2 = ${10 plus 11}")
//
//    //Float
//    println("20 div 11 = ${20f div 11f}")
//
//    //String
//    val message:String = "I" love "You"
//    println(message)
//    println("I" love "you, too")
//
//    //Type String Kotlin: non-null
//    val message1:String = "Abc"
//    //message1 = null : Error
//
//    //null safety
//    var email:String? //nullable
//    email = null
//
//    println("email length is: ${email?.length ?: 0}")
//    println("email is ${email?:"ict@gmail.com"}") // ?: Neu null -> ict@gmail.com
//}

//Control flow
//fun main(){
//    printToDoDay(3)
//    printNumGreater(212.0,545.2)
//    printNumGreaterAsExpression(2112.2,2212.2)
//    printGrade(100)
//    printDay(5,7)
//
//    println("\n")
//    exUseWhileAndDoWhile()
//    val result = sumNum1ToN(10)
//    print(" = $result")
//    sumInt()
//    exUseFor()
//    printTriangle()
//    printAlpha()
//    printNumber()
//}

//Array
//fun main(){
//    exArrays()
//    checkArrUseIn()
//    testFuncInArray()
//    practiceArray()
//}

//Collections
//fun main() {
//    exImmutable()
//    exMutable()
//    countWordOccurrences()
//}

//CastTypeOOP
//fun main(){
//    castTypeOop()
//}

//ExOOPCalc
//fun main(){
//    val calc = Calc()
//    calc.a = 10
//    calc.b = 8
//
//    println("MAX: ${calc.max()}")
//    println("SUM: ${calc.sum()}")
//    println("IS TRIANGLE: ${calc.isTriangle(12)}")
//    calc.printCalc()
//}

//ExOOPStudent
//fun main(){
//    val student1 = Student(1,"nguyen van mot",2021)
//    val student2 = Student(2,"nguyen van hai",2022)
//    val student3 = Student(3,"nguyen van ba",2023)
//
//    val school = School()
//    school.addStudent(student1)
//    school.addStudent(student2)
//    school.addStudent(student3)
//
//    println("All Student in School")
//    school.displayAllStudents()
//
//    val searchId = 2
//    val foundStudent = school.findStudentById(searchId)
//    if (foundStudent != null) {
//        println("Student with ID $searchId found:")
//        foundStudent.printInfo()
//    } else {
//        println("Student with ID $searchId not found.")
//    }
//
//    school.removeStudent(student2)
//    println("After Remove Student")
//    school.displayAllStudents()
//
//    val searchIdRemove = 1
//    if (foundStudent != null) {
//        school.removeStudentById(searchIdRemove)
//        println("After Remove Student")
//        school.displayAllStudents()
//    } else {
//        println("Student with ID $searchId not found.")
//    }
//}

//EmployeeManager
fun main() {
    val hrManager = HRManager()

    while (true) {
        println("--------- Hệ thống quản lý nhân sự ---------")
        println("1. Đăng nhập quản lý (Admin)")
        println("2. Thoát")

        when (readlnOrNull()?.toIntOrNull() ?: 0) {
            1 -> {
                if (hrManager.loggedInEmployeeId != null) {
                    println("Bạn đã đăng nhập rồi.")
                } else {
                    hrManager.loginAsAdmin()
                }
            }

            2 -> {
                println("Đã thoát khỏi hệ thống quản lý nhân sự.")
                break
            }

            else -> println("Lựa chọn không hợp lệ.")
        }

        if (hrManager.loggedInEmployeeId != null) {
            if (hrManager.loggedInEmployeeId == -1) {
                println("--------- Chào mừng Admin ---------")
                // Đăng nhập với tư cách Admin
                while (true) {
                    println("1. Thêm nhân viên mới")
                    println("2. Sửa thông tin nhân viên")
                    println("3. Xoá nhân viên")
                    println("4. Sắp xếp nhân viên theo lương")
                    println("5. Sắp xếp nhân viên theo tuổi")
                    println("6. Sắp xếp nhân viên theo tuổi")
                    println("7. Tìm kiếm nhân viên theo tên")
                    println("8. Xem thong tin nhan vien")
                    println("9. Đăng xuất")

                    when (readlnOrNull()?.toIntOrNull() ?: 0) {
                        1 -> {
                            println("Nhập thông tin nhân viên mới:")
                            println("ID:")
                            val id = readlnOrNull()?.toIntOrNull() ?: 0
                            println("Tên:")
                            val name = readlnOrNull() ?: ""
                            println("Vị trí:")
                            val position = readlnOrNull() ?: ""
                            println("Tuổi:")
                            val age = readlnOrNull()?.toIntOrNull() ?: 0
                            println("Lương:")
                            val salary = readlnOrNull()?.toFloatOrNull() ?: 0f

                            hrManager.addEmployee(Employee(id, name, age, position, salary))
                        }

                        2 -> {
                            println("Nhập thông tin nhân viên cần sửa (theo ID):")
                            println("ID:")
                            val id = readlnOrNull()?.toIntOrNull() ?: 0
                            println("Tên:")
                            val name = readlnOrNull() ?: ""
                            println("Vị trí:")
                            val position = readlnOrNull() ?: ""
                            println("Tuổi:")
                            val age = readlnOrNull()?.toIntOrNull() ?: 0
                            println("Lương:")
                            val salary = readlnOrNull()?.toFloatOrNull() ?: 0f

                            hrManager.updateEmployee(id, name, age, position, salary)
                        }

                        3 -> {
                            println("Nhập ID của nhân viên cần xoá:")
                            val idToDelete = readlnOrNull()?.toIntOrNull() ?: 0
                            hrManager.deleteEmployee(idToDelete)
                        }

                        4 -> hrManager.sortEmployeesBySalary()
                        5 -> hrManager.sortEmployeesByAge()
                        6 -> {
                            println("Nhập id nhân viên cần tìm kiếm:")
                            val searchId = readlnOrNull()?.toIntOrNull() ?: 0
                            hrManager.viewEmployeeInfo(searchId)
                        }
                        7 -> {
                            println("Nhập tên nhân viên cần tìm kiếm:")
                            val searchName = readlnOrNull() ?: ""
                            hrManager.searchEmployeeByName(searchName)
                        }

                        8 -> {
                            println("Thong tin tat ca nhan vien:")
                            hrManager.printEmployee()
                        }

                        9 -> {
                            println("Đã thoát khỏi tài khoản Admin.")
                            hrManager.loggedInEmployeeId = null
                            break
                        }

                        else -> println("Lựa chọn không hợp lệ.")
                    }
                }
            }
        }
    }
}