package com.ap.kotlin.classes.data

data class ClothingItem constructor(var size: String?, val count: Int, private var _price: Double) {

    var price: Double = _price
        set(value) {
            field = value * 0.5
        }

    init {
        size = size?.toUpperCase() ?: "UNKNOWN"
    }

    constructor(size: String?) : this(null, 5, 10.toDouble()) {
        this.size = "Unknown"
    }
}