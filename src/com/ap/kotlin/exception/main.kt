package com.ap.kotlin.exception

fun main(args: Array<String>) {

    try {
        print("Value 1 :")
        val v1 = readLine()
        val d1 = v1!!.toDouble()

        print("Value 2 :")
        val v2 = readLine()
        val d2 = v2!!.toDouble()

        val sum = d1 + d2
        println("sum = $sum")
//    } catch (e: Exception) {
        // the most generic exception should be
        // at the end of exception
//        println(e.message)
    } catch (e: KotlinNullPointerException) {
        println("Value is null")
    } catch (e: NumberFormatException) {
        println("Value is not number")
    } catch (e: Exception) {
        println(e.message)
    }

}