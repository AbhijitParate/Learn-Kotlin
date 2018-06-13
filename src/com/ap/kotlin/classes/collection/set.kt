package com.ap.kotlin.classes.collection

import com.ap.kotlin.classes.data.ClothingItem
import com.ap.kotlin.loop.printHeader

fun main(args: Array<String>) {
    printHeader("mutableListOf")
    val colorList = mutableListOf<String>()
    colorList.add("Red")
    colorList.add("Blue")
    colorList.add("Green")
    println(colorList)

    printHeader("colorList::removeAt")
    colorList.removeAt(0)
    println(colorList)


    printHeader("colorList::remove")
    colorList.remove("Green")
    println(colorList)

    printHeader("set")
    val set =  setOf("Red", "Blue", "Green")
    println(set)

    printHeader("mutableSet")
    val mutableSet = set.toMutableSet()
    println(mutableSet)

    val clothingItems = mutableSetOf<ClothingItem>()
    clothingItems.add(ClothingItem("XL", 10, 9.99))
    clothingItems.add(ClothingItem("XL", 10, 9.99))
    clothingItems.add(ClothingItem("M", 10, 9.99))
    println(clothingItems)
}