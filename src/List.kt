fun main() {
    val ListeDesAnimaux = listOf("chien", "chevre", "cochon")
    var ListeDesCris: MutableList<String> = mutableListOf("bourdonne","miaule")

    println(ListeDesAnimaux)

    //premier element
    println(ListeDesCris.first())

    //ajouter un element ne peut pas ajouter
    //ListeDesAnimaux.add("lion")

    //ajouter un element a la fin
    ListeDesCris.add("parle")
    println(ListeDesCris)

    //ajouter a un index donne
    ListeDesCris.add(1, "juvenal")
    println(ListeDesCris)

    //effacer touts
    ListeDesCris.clear()
    println(ListeDesCris)
}