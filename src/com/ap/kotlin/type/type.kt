package com.ap.kotlin.type

import kotlin.math.abs
import kotlin.math.absoluteValue

fun main(args: Array<String>){
    val myInt =  42
    val myLong:Long = myInt.toLong()
    // up-cast and down-cast is not automatically available
    // you have to manually do it

    println("Type of myInt is ${myInt::class.simpleName}")
    println("Type of myLong is ${myLong::class.simpleName}")
    println("Type of myLong is ${myLong::class.qualifiedName}")


    var intA = 10
    val intB = 15

    val match1 = (intA == intB)
    println("Value of match1 : $match1")

    val match2 = intA.equals(intB) //Notice the warning here
    println("Value of match1 : $match2")

    println("Comparision : ${intA.compareTo(intB)}")

    val sum = intA + intB
    println("Value of sum : $sum")

    val sum2 = intA.plus(intB)
    println("Value of sum : $sum2")

    val diff = intA - intB
    println("Value of diff : $diff")

    val diff2 = intA.minus(intB)
    println("Value of diff : $diff2")

    intA++

    println("intA = $intA")

    val inc = intA.inc()
    println("intA = $intA")
    println("inc = $inc")


    val negative = -45
    val abs1 = Math.abs(negative)
    val abs2 = abs(negative)
    val abs3 = negative.absoluteValue
    println("abs = $abs1, $abs2, $abs3")








}