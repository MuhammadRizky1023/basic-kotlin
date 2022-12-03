package com.example.basicclasskotlin

fun main(){
    operator()
    comparisonOperator()
    mathOperator()
    logicalOperator()
}

fun operator(){
    val result1 = 90
    val result2 = result1 + 80
    val result = result1 + result2
    println(result)
    println(result2)
    println(result1)
}

fun mathOperator(){
    var result1 = 90
    result1 += 50
    val result2 = result1 /5
    val result = result1 % result2
    println(result)
    println(result2)
    println(result1)
}

fun comparisonOperator(){
    val num1 = 90;
    val num2 = 80;
    println(num1 != num2)
}

fun logicalOperator(){
    val num  = 10
    println(num >  5 || num  < 8)

    val sum= 5
    println(sum > 10  &&  sum > 3)

    val boolean = false
    println(!boolean)


}