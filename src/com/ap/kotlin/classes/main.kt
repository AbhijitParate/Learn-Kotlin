package com.ap.kotlin.classes

fun main(args: Array<String>) {
    println("MathLib.add() : " + MathLib.add(3, 6))

    val runningTotal =  RunningTotal()

    for (v in 0..10){
        runningTotal.addValue(v)
        println("Running total : ${runningTotal.runningTotal}")
    }

    println("Weekday ENUM : ${Weekdays.MON}")

    println("Month ENUM : ${Month.JAN}")
    println("Month ENUM->Value : ${Month.JAN.month}")
    println("Month ENUM->Name : ${Month.JAN.name}")
    println("Month ENUM->Ordinal : ${Month.JAN.ordinal}")
    println("Month ENUM->declaringClass : ${Month.JAN.declaringClass}")
}