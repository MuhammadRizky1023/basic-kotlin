package com.example.basicclasskotlin

fun main(){
//    val myFirstName = "Muhammad"
//    var myLastName = "Rizky"
//    print("Welcome back " + myFirstName + myLastName)
    dataType()
    arrayList()

}

fun dataType(){
    val age: Int = 20;
    val float: Float = 3.22F;
    val sum: Double = 8.88;
    val rank: Char = 'S';
    val male: Boolean = true;
    val user: String = "User"
    println(age)
    println(float)
    println(sum)
    println(rank)
    println(male)
    println(user)
}

fun arrayList(){
    val fruits = arrayOf<String>("Android", "IoT", "Web", "UI/UX")


    println( fruits [3])
    println(fruits[0])
}