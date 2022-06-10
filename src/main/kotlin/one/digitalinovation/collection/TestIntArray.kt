package one.digitalinovation.collection

fun main(){
    val values = IntArray(5)

    values[0] = 1
    values[1] = 2
    values[2] = 3
    values[3] = 4
    values[4] = 5

    for (valor in values){
        println(valor)
    }
    println("----------------------")
    //outra forma de fazer o loop pra imprimir a list
    values.forEach {valor->
        println(valor)
    }
    println("----------------------")
    //terceira forma de iterar, porem busca o valor que esta na posição especifica do indice
    for (index in values.indices){
        println(values[index])
    }

    println("----------------------")
    values.sort() //itera ordenado do menor para o maior
    for (valor in values){
        println(valor)
    }
}