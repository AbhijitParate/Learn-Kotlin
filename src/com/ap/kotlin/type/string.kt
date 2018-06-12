package com.ap.kotlin.type

fun main(args: Array<String>) {
    var aString = "Hello"
    val charArray = aString.toCharArray()
    val byteArray = aString.toByteArray()

    println("charArray = ${charArray.asList()}")
    println("byteArray = ${byteArray.asList()}")

    aString += " World"

    println("Iterate over string using index")
    print('[')
    for (i in 0 until aString.length)
        print(" ${aString[i]} ")
    print(']')

    println()
    println("Iterate over string using get")
    print('[')
    for (i in 0 until aString.length){
        val c = aString.get(i) // notice warning
        print(" $c ")
    }
    print(']')

    println()
    println("Iterate over string using char")
    print('[')
    for (c in charArray){
        print(" $c ")
    }
    print(']')
}