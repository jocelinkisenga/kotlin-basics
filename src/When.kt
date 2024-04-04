fun main() {
    val name: String = "juve"

    when(name) {
        "hello" -> println("salut")
        "juve" -> println("salut $name")
        else -> println("Aurevoir")
    }
}