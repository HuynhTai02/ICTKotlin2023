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
fun main(){
    exArrays()
    checkArrUseIn()
}