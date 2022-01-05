package abstracts

abstract class Shape(
    var name: String
) {
    init {
        println("Super class initialized!")
    }

    abstract fun area(): Double

    abstract fun perimeter(): Double

    fun changeName(newName: String) {
        name = newName
    }
}