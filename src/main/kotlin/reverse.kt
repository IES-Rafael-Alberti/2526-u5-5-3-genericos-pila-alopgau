package org.iesra.revilofe

fun <T> reverse(lista: Collection<T>): MutableList<T> {
    val nuevaLista = mutableListOf<T>()
    val pila = Pila(lista.toMutableList())
    pila.forEach { nuevaLista.add(it) }
    return nuevaLista
}
