package one.digitalinovation.collection

fun main() {
    val values = intArrayOf(2, 3, 4, 6, 10, 12)
    //Desta forma posso inicializar o array sem indicar o tamanho, como no anterior

    values.forEach {
        println(it)
    }
}