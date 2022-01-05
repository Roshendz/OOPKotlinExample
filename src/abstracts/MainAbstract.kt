package abstracts

fun main() {
    val myCircle = Circle(3.0)
    myCircle.changeName("MyCircle")
    println("The name of the circle is ${myCircle.name}")

    val myTriangle= Triangle(5.0, 5.0, 5.0)
    myTriangle.changeName("MyTriangle")
    println("The name of the triangle is ${myCircle.name}")
}