open class Quadrilateral
class Square : Quadrilateral()
class Rectangle : Quadrilateral()

fun castTypeOop(){
    val quadrilateral:Quadrilateral = Rectangle()
    if (quadrilateral is Square){
        //    var Square:Square = Quadrilateral() Error
        // Use AS to cast Type Oop
        val Square:Square = Quadrilateral() as Square
    }else{
        println("Quadrilateral is not Square")
    }
}