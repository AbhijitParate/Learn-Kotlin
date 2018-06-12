package com.ap.kotlin.classes

fun main(args: Array<String>) {
    println("MathLib.add() : " + MathLib.add(3, 6))

    val runningTotal =  RunningTotal()

    for (v in 0..10){
        runningTotal.addValue(v)
        println("Running total : ${runningTotal.runningTotal}")
    }
}