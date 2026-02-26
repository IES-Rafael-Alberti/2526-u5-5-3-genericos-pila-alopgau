package org.iesra.revilofe


class Pila<T>: Iterable<T> {
    private val pila: MutableList<T>
    var size: Int
    constructor() {
        pila = mutableListOf()
        size = pila.size
    }
    constructor(origen: MutableList<T>) {
        pila = origen
        size = pila.size
    }

    fun push(elemento: T) {
    pila.add(elemento)
        size++
    }

    fun pop(): T {
        if (this.isEmpty())  throw NoSuchElementException()
        val elemento = pila[pila.lastIndex]
        pila.removeAt(pila.lastIndex)
        size--
        return elemento
    }
    fun peek(): T = pila[pila.lastIndex]
    fun isEmpty(): Boolean {
      if (pila.size == 0) return true else return false
    }
    fun snapshot() = pila.toList()
    override fun iterator(): Iterator<T> {
        var posicion = this.size-1
    return object : Iterator<T> {
        override fun hasNext() = 0 <= posicion

        override fun next(): T{
            val elem = pila[posicion]
            posicion--
            return elem
        }
    }
    }
}