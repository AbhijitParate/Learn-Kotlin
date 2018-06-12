package com.ap.kotlin.classes

// No type
enum class Weekdays {
    SUN, MON, TUE, WED, THU, FRI, SAT
}

enum class Month(val month: String) {
    JAN("January"),
    FEB("February"),
    MAR("March"),
    APR("April"),
    MAY("May"),
    JUN("June"),
    JUL("July"),
    AUG("August"),
    SEP("September"),
    OCT("October"),
    NOV("November"),
    DEC("December")
}