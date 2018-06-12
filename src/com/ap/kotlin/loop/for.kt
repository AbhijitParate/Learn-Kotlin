package com.ap.kotlin.loop

fun main(args: Array<String>) {
    val colors = arrayOf("RED", "GREEN", "BLUE")
    val integers = intArrayOf(1,2,3,4,5,6)

    printHeader("Colors")
    for (c in colors) print("$c ")

    printHeader("Integers")
    for (i in integers) print("$i ")

    printHeader("Integers using indices")
    for (i in integers.indices) print("${integers[i]} ")

    printHeader("Integers using indices with 2 steps")
    for (i in integers.indices step 2) print("${integers[i]} ")

    printHeader("Integers using range with size")
    for (i in 0..integers.size - 1) print("${integers[i]} ")

    printHeader("Integers using range with until")
    for (i in 0 until integers.size) print("${integers[i]} ")
}

fun printHeader(string: String){
    println()
    for (i in string.indices) print("*")
    println()
    println(string)
    for (i in string.indices) print("*")
    println()
}