package com.ap.kotlin.exception

fun main(args: Array<String>) {

    try {
        val d1 = getInput("Value 1: ")
        val d2 = getInput("Value 2: ")

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

private fun getInput(prompt: String): Double {
    print(prompt)
    val v1 = readLine()
    return v1!!.toDouble()
}