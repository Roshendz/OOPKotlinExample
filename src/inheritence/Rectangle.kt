package inheritence

class Rectangle(
    val a:Double,
    val b:Double
) : Shape("Rectangle"){
    init {
        println("$name created with a = $a and b = $b")
    }

    fun area(): Double = a * b

    fun perimeter(): Double = 2 * a + 2 * b

    fun isSquare() = a == b
}