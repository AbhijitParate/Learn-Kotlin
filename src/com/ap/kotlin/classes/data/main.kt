package com.ap.kotlin.classes.data

fun main(args: Array<String>) {
    val item = DataClass("A", 1)
    println(item)
    item.num = 2
    println(item)

    val clothingItem = ClothingItem("xl", 10, 10.toDouble())
    val clothingItem2 = ClothingItem(null)
    println(clothingItem)
    println(clothingItem2)
    clothingItem.price = 100.toDouble()
    println(clothingItem.price)

    val shape = Shape(null, 3)
    println(shape)
    println("Shape : " + shape.shape)


    val p = Person("Joe", "Anderson")
    println("Full Name : ${p.fullName} ")
}