package com.ap.kotlin.type

fun main(args: Array<String>) {
    var aString = "Hello"
    val charArray = aString.toCharArray()
    val byteArray = aString.toByteArray()

    println("charArray = ${charArray.asList()}")
    println("byteArray = ${byteArray.asList()}")

    aString += " World"

    print('[')
    for (i in 0 until aString.length)
        print(" ${aString[i]} ")
    print(']')

    println()
    print('[')
    for (i in 0 until aString.length){
        val c = aString.get(i) // notice warning
        print(" $c ")
    }
    print(']')
}