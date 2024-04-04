fun main() {
    val name: String = "juve"

    when(name) {
        "hello" -> println("salut")
        "juve" -> println("salut $name")
        else -> println("Aurevoir")
    }

    //inline expression

    val result =   when(name) {
        "hello" -> "salut"
        "juve" -> "salut $name"
        else -> "Aurevoir"
    }

    println(result)
}