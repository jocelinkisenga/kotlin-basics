fun main() {
    //immutable sets
    val ReadOnlyFrits = setOf("apple", "mango", "bannas")

    //mutable set
    var ListeOfCapitals: MutableSet<String> = mutableSetOf("washington", "paris", "London")

    println(ReadOnlyFrits)

    //size of set
    println(ListeOfCapitals.size)

    //add element to list

    println(ListeOfCapitals.add("kinshasa"))

    //clear set
    println(ListeOfCapitals.clear())
}