fun exArrays() {
    //key: arrayOf()
    val namePeople = arrayOf("Mai", "Lien", "Anh", "Quynh", "Nga")
    println("index 0: " + namePeople[0])
    println("index 1: " + namePeople[1])
    namePeople[0] = "Minh"
    println("Change value index 0: " + namePeople[0])
    println("index 2: " + namePeople[2])
    println("index 3: " + namePeople[3])
    println("index 4: " + namePeople[4])
    println("Size: " + namePeople.size)
    //Neu dung $ String ex: $namePeople[2] -> &21212 (dia chi)

    val ints = arrayOf(1, 2, 4, 5, 7)
    for (i in ints)
        print("$i\t")
    println("\n")
    for (i in ints.indices)
        print("${ints[i]}\t")
}

//Can use the in operator
fun checkArrUseIn() {
    //to check an element exists in an array
    val namePeople = arrayOf("Mai", "Lien", "Anh", "Quynh", "Nga")
    println("\nUse if else")
    if ("Nga" in namePeople) {
        println("Exists")
    } else {
        println("Not exists")
    }

    //loop through the array elements
    val numInt: IntArray = intArrayOf(1, 2, 3, 4)
    println("Use For")
    for (x in numInt) {
        print(x)
    }

    // use operator ?. để tránh NullPointerException khi truy cập phần tử có thể null
    println("\nNullPointerException")
    val nullableNumbers: Array<Int?> = arrayOf(1, 2, null, 4, 5)
    for (number in nullableNumbers) {
        print(number?.toString() ?: "null")
    }
}

fun testFuncInArray() {
    var arrChars = arrayOf("aaa", "g", "f", "aqq", "fc", "e", "cc", "qa")
    println("SIZE: " + arrChars.size)
    println("MAX: " + arrChars.max())
    println("MIN: " + arrChars.min())

    println("\nFilter In Array: ")
    //lambda
    val filtered1Chars = arrChars.filter { it.length > 1 }
    println(filtered1Chars)

    //normal
    val filtered2Chars = arrChars.filter { char -> char.startsWith("a") }
    println(filtered2Chars)

    val filtered3Chars = arrChars.filter { char -> char > "fa" }
    println(filtered3Chars)

    print("\nBEFORE SORT:\t")
    for (char in arrChars) {
        print(char + "\t")
    }

    println("\nAFTER SORT ASC: ")
    arrChars.sort()
    for (char in arrChars) {
        print(char + "\t")
    }

    print("\nBEFORE SORT\t")
    arrChars = arrayOf("a", "g", "p", "q", "f", "e", "c")
    for (char in arrChars) {
        print(char + "\t")
    }

    println("\nAFTER SORT DES: ")
    arrChars.sortDescending()
    for (char in arrChars) {
        print(char + "\t")
    }

    println("\nAFTER REVERSE: ")
    arrChars.reverse()
    for (char in arrChars) {
        print(char + "\t")
    }
}

fun practiceArray() {
    val numbers: IntArray = IntArray(10)

    println("Input Array:")
    for (i in numbers.indices) {
        print("index[${i + 1}]: ")
        numbers[i] = readlnOrNull()?.toInt() ?: 0
    }

    //duyệt theo giá trị
    println("Output Array:")
    for (number in numbers) {
        print("$number ")
    }
    println()

    //duyệt theo vị trí
    println("Output Array:")
    for (number in numbers.indices) {
        print("$number ")
    }
    println()

    println("Print Sum Array:")
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    println("Sum Array: $sum")

    // Find the largest element in an array
    println("Find the largest element in an array")
    var maxNumber = numbers[0]
    for (i in numbers.indices) {
        if (numbers[i] > maxNumber) {
            maxNumber = numbers[i]
        }
    }
    println("The largest element in an array: $maxNumber")

    // Sort array in asc
    numbers.sort()
    println("Array after sorting: ${numbers.joinToString(", ")}")

    // Check value exists in array
    println("Input value to check exists: ")
    var searchValue: Int? = null

    while (searchValue == null) {
        val input = readln()
        searchValue = input.toIntOrNull()

        if (searchValue == null) {
            println("Invalid input. Please enter an integer value.")
        }
    }

    val isValueExist = numbers.contains(searchValue)
    if (isValueExist) {
        println("$searchValue exists in array.")
    } else {
        println("$searchValue not exists in array.")
    }
}