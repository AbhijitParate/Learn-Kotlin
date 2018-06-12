package com.ap.kotlin.functions

fun main(args: Array<String>) {

    val result1 = add1(5, 10)
    println("result1 = $result1")

    val result2 = add2(5, 10)
    println("result2 = $result2")

    // you can pass the params in any order
    val result3 = add2(p2=15, p1=25)
    println("result3 = $result3")

    val result4 = calc(10, 10)
    println("result4 = $result4")

    val result5 = calc(10, 10, "-")
    println("result5 = $result5")

    val result6 = sum(1,2,3,4,5,6)
    println("result6 = $result6")

}

// this function doesn't return anything
fun add1(p1: Int, p2: Int) {
    println("p1 = $p1")
    println("p2 = $p2")
}

// this function return Int
fun add2(p1: Int, p2: Int): Int {
    return p1 + p2
}

// this function return Int
fun calc(p1: Int, p2: Int, op: String = "+"): Int {
    if (op == "+") return p1 + p2
    else if (op == "-") return p1 - p2
    else return -1
}

fun sum(vararg nums: Int): Int{
    var sum = 0
    for (i in 0 until nums.size){
        sum += nums[i]
    }
    return sum
}