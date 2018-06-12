package com.ap.kotlin.const

import com.ap.kotlin.const.Constants.Companion.GREEN

const val RED = "RED" // This won't be available outside current file

fun main(args: Array<String>) {
    println("RED = $RED")
    println("GREEN = $GREEN")
    // This is similar to 'public static final string' in Java
}