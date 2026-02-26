package org.iesra.revilofe

import java.util.function.Consumer

class Pila<T>: Iterable<T> {
    private val pila: MutableList<T>
    private val iterator = iterator()

    constructor() {
        pila = mutableListOf()
    }
    init {
        iterator.has
    }
    fun push(elemento: T) = pila.add(elemento)
    fun pop(): T? {
        if (this.isEmpty()) return null
        val elemento = pila[pila.lastIndex]
        pila.removeAt(pila.lastIndex)
        return elemento
    }
    fun peek(): T? {
        if (this.isEmpty()) return null
        return pila[pila.lastIndex]
    }
    fun isEmpty(): Boolean {
      if (pila.size == 0) return true else return false
    }
    fun snapshot() = pila.toList()
    fun size() = pila.size
    override fun iterator(): Iterator<T> {
        return pila.listIterator()
    }




}