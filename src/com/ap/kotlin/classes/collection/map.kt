package com.ap.kotlin.classes.collection

import com.ap.kotlin.loop.printHeader

fun main(args: Array<String>) {
    printHeader("Map")

    val map = mapOf<String, String>(
            Pair("CA", "Sacramento"),
            Pair("OR", "Salem"),
            Pair("WA", "Olympia")
    )

    for ((s, c) in map){
        println("Capitol of $s is $c")
    }

    val mutableMap = mutableMapOf<String, String>()
    mutableMap["CA"] = "Sacramento"
    mutableMap["OR"] = "Salem"
    mutableMap.put("WA", "Olympia")
}