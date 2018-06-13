package com.ap.kotlin.classes.collection

import com.ap.kotlin.classes.data.ClothingItem
import com.ap.kotlin.loop.printHeader

fun main(args: Array<String>) {
    printHeader("homogeneous array")
    val colors = arrayOf("Red", "Green", "Blue")
    for (element in colors) println(element)

    printHeader("mixed array")
    val mixed = arrayOf("Green", 12)
    for (element in mixed) println(element)

    printHeader("arrayOfNulls")
    val nulls = arrayOfNulls<String>(3)
    for (e in nulls) println(e)

    nulls[0] = "Red"
    nulls.set(1, "Blue")
    nulls[2] = "Green"
    for (e in nulls) {
        println(e)
    }

    printHeader("sortedArray")
    var sortedArray = colors.sortedArray()
    for (e in sortedArray) {
        println(e)
    }

    printHeader("sortedArrayDescending")
    var sortedArrayDescending = colors.sortedArrayDescending()
    for (e in sortedArrayDescending) {
        println(e)
    }

    printHeader("forEach")
    colors.forEach { println(it) }


    printHeader("println(colors)")
    println(colors)
    println("Number of colors ${colors.size}")
}