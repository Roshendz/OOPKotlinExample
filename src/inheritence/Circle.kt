package inheritence

import kotlin.random.Random

class Circle(
    val radius: Double
) : Shape("Circle"){
    //private val pi = 3.141592

    //Using companion object we do need to initialized Circle class
    companion object {
        fun randomCircle(): Circle {
            val radius = Random.nextDouble(1.0, 10.0)
            return Circle(radius)
        }
    }

    init {
        println("$name created with radius = $radius")
        println("$name area is ${area()}")
        println("$name perimeter is ${perimeter()}")
    }

    fun area() = radius * radius * GenericNumbers.pi

    fun perimeter() = 2 * radius * GenericNumbers.pi
}