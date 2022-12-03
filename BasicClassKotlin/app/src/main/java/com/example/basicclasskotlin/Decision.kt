package com.example.basicclasskotlin

fun main(){
    whenStatement()
    ifElseStatement()
    forLoopStatement()
    whileStatement()
    doWhileStatement()
    breakAndContinue()
    forEachStatement()
}

fun whenStatement(){
    val daily = 6

    val dailyResult = when (daily) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "do not have day "
    }
    println(dailyResult)
}

fun ifElseStatement(){
    val timer = 6
    val decision = if (timer < 18) {
        "Good morning"
    } else {
        "Good evening."
    }
    println(decision)

    val timing = 15
    if (timing < 12) {
        println("Good morning.")
    } else if (timing < 18) {
        println("Good afternoon")
    } else {
        println("Good night")
    }
}

fun forLoopStatement(){
    val itClass = arrayOf("Android", "UI/UX", "Iot", "Web")
    for (i in itClass){
        println(i)
    }
}

fun whileStatement(){
    var int = 0
    while (int < 10) {
        println(int)
        int++
    }
}

fun doWhileStatement(){
    var int = 0
    do {
        println(int)
        int++
    }
    while (int < 15)
}

fun breakAndContinue(){
    var i = 0
    while (i <  25) {
        print(" $i ")
        i++
        if (i == 10) {
            continue
        }
    }
}

fun forEachStatement(){
    val classList = listOf<String>("Android", "UI/UX", "Web", "IoT")

    classList.forEach{
        println(it)
    }
}