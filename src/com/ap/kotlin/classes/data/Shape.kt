package com.ap.kotlin.classes.data

data class Shape(private val _shape: String?, var sides: Int?) {


    var shape: String = _shape ?: "Unknown"

}