//Conditions
//if elseif else
fun printToDoDay(day: Int) {
    if (day == 2 || day == 4 || day == 6) {
        println("I'm study Kotlin")
    } else if (day == 3 || day == 5) {
        println("I'm study Android")
    } else {
        println("I'm sleep")
    }
}

fun printNumGreater(num1: Double, num2: Double) {
    if (num1 > num2)
        println("$num1 > $num2")
    else
        println("$num1 < $num2")
}

//if elseif else expression
fun printNumGreaterAsExpression(a: Double, b: Double) {
    val max = if (a > b) {
        println("$a > $b")
        a // sau khi kt dieu kien dung -> gan max = a
    } else {
        println("$a < $b")
        b // sau khi kt dieu kien dung -> gan max = b
    }

    println("max is $max")
}

fun printGrade(score: Int) {
    val grade: String = if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else if (score >= 60) {
        "D"
    } else {
        "F"
    }

    println("Your grade is: $grade")
}

//when
fun printDay(day: Int, dayExpression: Int) {
    when (day) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid day")
    }

    //Expression
    val result = when (dayExpression) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day"
    }

    println(result)
}

//Loops
fun exUseWhileAndDoWhile() {
    var i = 10;
    println("start while")
    while (i <= 5) {
        print("i = $i \t")
        i++
    }
    println("end while")

    var j = 10
    println("\nstart do...while")
    do {
        print("j = $j \t")
        j++
    } while (j <= 5)
    println("end do...while")
}

//Use While
fun sumNum1ToN(number: Int): Int {
    println("\n")
    var sum = 0
    var i = 1
    while (i <= number) {
        sum += i
        if (i < 10) {
            print("$i + ")
        } else {
            print("$i")
        }
        i++
    }

    return sum
}

//Use Do..While
fun sumInt() {
    var sum = 0
    var number: Int

    do {
        println("\nNhập một số nguyên dương (nhập 0 để kết thúc): ")
        number = readlnOrNull()?.toIntOrNull() ?: 0

        if (number < 0) {
            println("Số $number không phải là số nguyên dương. Vui lòng nhập lại.")
        } else {
            sum += number
        }
    } while (number != 0)

    println("Tổng các số nguyên dương đã nhập là: $sum")
}

//Use For
fun exUseFor() {
    val numbers = arrayOf(1, 2, 3, 4, 5)

    for (number in numbers) {
        print("$number ")
    }

    println("\n")
    for (i in numbers.indices)
        print(numbers[i])
}

fun printTriangle() {
    var size: Int?

    do {
        print("\nNhập kích thước hình tam giác (số nguyên dương > 0): ")
        size = readlnOrNull()?.toIntOrNull()

        if (size == null || size <= 0) {
            println("\nKích thước phải là số nguyên dương > 0. Vui lòng nhập lại.")
        }
    } while (size == null || size <= 0)

    for (i in 1..size) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}

//Ranges
//Duyệt tuần tự hết giá trị trong danh sách (closed range)
fun printAlpha() {
    for (chars in 'a'..'g') {
        print("$chars ")
    }

    println("\nBreak")
    for (chars in 'A'..'C') {
        for(numbers in 1..4){
            print("\n$chars and $numbers ")
            if(numbers == 2){
                break
            }
        }
    }

    println("\nContinue")
    for (chars in 'A'..'C') {
        for(numbers in 1..4){
            if(numbers == 2){
                break
            }
            print("\n$chars and $numbers ")
        }
    }

    println("\nReturn")
    for (chars in 'A'..'C') {
        for(numbers in 1..4){
            print("\n$chars and $numbers ")
            if(numbers == 2){
                return
            }
        }
    }

    println("Làm gì in được dòng này ra")
}

fun printNumber(){
    //Điều hướng bước nhảy downTo
    println("\n")
    for (i in 10 downTo  -10) {
        print("$i ")
    }

    //Điều hướng bước nhảy step
    println("\n")
    for (i in -10 ..  10 step 2) {
        print("$i ")
    }

    //Duyệt tuần tự gần hết giá trị trong danh sách (half-open range)
    println("\n")
    for (i in 1 until 10) { // 1 2 3 4 5 6 7 8 9
        print("$i ")
    }
}