package com.ap.kotlin.loop

fun main(args: Array<String>) {
    val integers = intArrayOf(1,2,3,4,5,6)
    var counter = 0

    printHeader("While loop with counter")
    while (counter < integers.size) {
        println("counter = $counter " +
                "value = ${integers[counter]}")
        counter++
    }

    counter = 0
    printHeader("Do / While loop")
    do {
        println("counter = $counter " +
                "value = ${integers.get(counter)}")
        counter++
    } while (counter < integers.size)
}