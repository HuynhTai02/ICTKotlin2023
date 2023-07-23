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
}

//Can use the in operator
fun checkArrUseIn() {
    //to check an element exists in an array
    val namePeople = arrayOf("Mai", "Lien", "Anh", "Quynh", "Nga")
    println("Use if else")
    if ("Nga" in namePeople) {
        println("Exists")
    } else {
        println("Not exists")
    }

    //loop through the array elements
    val numInt: IntArray = intArrayOf(1, 2, 3, 4)
    println("Use For")
    for (x in numInt) {
        print(numInt[x])
        //print(x)
    }

    // use operator ?. để tránh NullPointerException khi truy cập phần tử có thể null
    println("\nNullPointerException")
    val nullableNumbers: Array<Int?> = arrayOf(1, 2, null, 4, 5)
    for (number in nullableNumbers) {
        print(number?.toString() ?: "null")
    }
}