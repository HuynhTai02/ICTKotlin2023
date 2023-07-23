//func which not returns value
//Java: void
//Kotlin: Unit
fun sayHello(name:String):Unit{
    println("Hello " + name)
    println("Hello $name")
}

fun showColor(red:Int,blue:Int,green:Int,alpha:Float){
    println("color: $red - $blue - $green - $alpha")
}

//func which returns value
fun sum(x:Double,y:Double):Double{
    return x + y
}
//or
fun div(x:Double,y: Double) = x / y

//func with Variadic Arguments - vararg
//Sub: vararg - bạn có thể truyền một số lượng bất kỳ đối số cùng kiểu vào hàm mà không cần phải tạo một mảng.
fun like(vararg books: String) {
    for (book in books ){
        println("I like $book")
    }
}

//infix func
//can be called without using the period and brackets
//Sub: Ham goi ma khong can phai dong ngoac, mo ngoac gan giong ngon ngu tu nhien
infix fun Int.plus(x:Int):Int{
    return this + x
}

infix fun Double.mul(x:Double): Double = this * x

infix fun Float.div(x:Float) = this / x

infix fun String.love(name:String) = "$this love $name"