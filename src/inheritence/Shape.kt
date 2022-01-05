package inheritence

open class Shape(
    var name: String
) {
    init {
        println("Super class initialized!")
    }

    fun changeName(newName: String) {
        name = newName
    }
}