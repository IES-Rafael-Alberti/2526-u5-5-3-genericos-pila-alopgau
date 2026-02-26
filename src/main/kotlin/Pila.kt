package org.example

class Pila<T> {
    private val pila: MutableList<T>

    constructor() {
        pila = mutableListOf()
    }
    fun push(elemento: T) = pila.add(0,elemento)
    fun pop(): T? {
        if (this.vacia()) return null
        val elemento = pila[0]
        pila.removeAt(0)
        return elemento
    }
    fun vacia() = pila.isEmpty()
    fun ver() = pila.toList()
}