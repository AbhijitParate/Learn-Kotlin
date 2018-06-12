package com.ap.kotlin.keywords

val a = 0 // val means that the variable is immutable,
// value can beset only once, value can't be changed once set
var b = 1 // var means its mutable

fun main(args: Array<String>) {
    val num = 42
    println("Value of num : $num")
    //num++ //Val can't be reassigned
    var num2 = 42
    println("Value of num2 : $num2")
    num2++
    println("Value of num2 : $num2")

    var num3 =  32.1 // implicit date type
    var num4:Double =  32.1 // explicit date type

    println("Value of a : $a") // here a is a top level variable
    println("Value of ab: $b") // same as b

}