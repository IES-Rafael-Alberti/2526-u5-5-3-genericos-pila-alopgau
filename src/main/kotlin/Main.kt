package org.iesra.revilofe


fun main() {
    val pila = Pila<Int>()
    pila.push(1)
    pila.push(2)
    pila.push(3)
    println(pila.snapshot())
    pila.forEach {
        println(it)
    }


    val numbers = listOf("one", "two", "three", "four")
    val numbersRev = reverse(numbers)

    if (listOf("four", "three", "two", "one") != numbersRev) {
        println("Error")
    } else {
        println("Correcto")
    }

    println(numbersRev)
}
