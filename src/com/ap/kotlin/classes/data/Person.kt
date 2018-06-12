package com.ap.kotlin.classes.data

class Person(private val _fn: String,
             private val _ln: String) {
    val fullName: String = "$_fn $_ln"
}