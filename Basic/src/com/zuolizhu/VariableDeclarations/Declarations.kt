package com.zuolizhu.VariableDeclarations

fun main(args: Array<String>) {
    val number = 25
    val intergerNumber: Int
    intergerNumber = 10

    var changeableNumber: Int
    changeableNumber = 12
    changeableNumber = 15

    val employee1 = Employee("Zuoli Zhu", 1)
    employee1.name = "ZL Z"
    val employee2 : Employee
    val number2 = 2

    if(number > number2) {
        employee2 = Employee("Bad Name", 200)
    } else {
        employee2 = Employee("Good Name", 100)
    }


}

/**
 * Type Aliases in Kotlin
 */



class Employee(var name: String, val id: Int) {

}