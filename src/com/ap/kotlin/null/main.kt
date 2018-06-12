package com.ap.kotlin.`null`

fun main(args: Array<String>) {
    var nullValue: String? = null
    println("nullValue = $nullValue")

    var length: Int? = nullValue?.length
    println("length = $length")

    val length2 = nullValue?.length
    println("length2 = $length2")


    nullValue = "Hello"
    println("nullValue = $nullValue")

    length = nullValue.length
    println("length = $length")

//    var n = null
//    var n = "HELLO"
    var n: String? = "HELLO"
    var message = if (n == null) "Value is null" else "Value is not null"
    println("message = $message")

    message = n ?: "Null"
    println("message = $message")

    val x = null
    val num = null
    try {
        num = x!! // this will result in null pointer exception
        println("num = $num")
    } catch (e: KotlinNullPointerException){
        print("num = $num ")
    }

}