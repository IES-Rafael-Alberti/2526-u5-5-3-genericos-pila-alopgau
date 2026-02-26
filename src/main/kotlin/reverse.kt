package org.iesra.revilofe

fun <T> reverse(lista: Collection<T>): MutableList<T> {
    val nuevaLista = mutableListOf<T>()
    val pila = Pila(lista.toMutableList())
    val iteratorPila = pila.iterator()
    while (iteratorPila.hasNext()) {
        nuevaLista.add(iteratorPila.next())
    }
    return nuevaLista
}
