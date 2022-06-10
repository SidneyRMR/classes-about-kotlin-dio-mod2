package one.digitalinovation.collection

fun main() {
    val nomes = Array(3){""}
    nomes[0] = "Maria"
    nomes[1] = "João"
    nomes[2] = "Jorge"

    for (nome in nomes){
        println(nome)
    }
    nomes.sort()
    nomes.forEach { println(it) }

}