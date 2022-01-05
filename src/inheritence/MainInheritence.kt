package inheritence

fun main() {
    val myCircle = Circle(3.0)
    myCircle.changeName("MyCircle")
    println("The name of the circle is ${myCircle.name}")

    val myTriangle = Triangle(5.0, 5.0, 5.0)
    myTriangle.changeName("MyTriangle")
    println("The name of the triangle is ${myCircle.name}")

    val myRectangle = Rectangle(4.0, 4.0)
    myRectangle.changeName("MyRectangle")
    println("The name of the rectangle is ${myRectangle.name}")

    val circle = Circle.randomCircle()
}