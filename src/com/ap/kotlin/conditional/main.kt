package com.ap.kotlin.conditional

fun main(args: Array<String>) {

    print("Enter state code : ")
    var state = readLine()

    when (state) {
        "CA" -> println("California")
        "OR" -> println("Oregon")
        "WA" -> println("Washington")
    }

    val s = when (state) {
        "CA" -> "California"
        "OR" -> "Oregon"
        "WA" -> "Washington"
        else -> "Don't know"
    }

    println("state = $s")

    when (state) {
        "CA", "OR", "WA" -> println("West coast")
        else -> println("Rest of USA")
    }

    val num = 42
    when (num) {
        in 1..39 -> println("Not yet")
        in 40..45 -> println("Close enough")
        else -> {
            println("Definitely not")
            println("Not really")
        }
    }

}