package com.mobile.leetcode.binary

/*
* Given two binary strings a and b return their sum as a binary string. s
*
* a = "101"
* b = "11"
* output = "1000"
*
* * a = "11"
* b = "1"
* output = "100"
* */


private fun main() {

    val a = "1010"
    val b = "1011"

    var i = a.length - 1
    var j = b.length - 1

    var sum = 0
    var carry = 0
    var result = ""

    while (i >= 0 || j >= 0) {

        sum = carry
        if (i >= 0) sum += a[i] - '0'
        if (j >= 0) sum += a[j] - '0'

        result += sum % 2
        carry = sum / 2
        i--
        j--
    }

    if (carry != 0) result += '1'

    println("result ${result.reversed()}")
}

//Using inbuilt functions
fun addBinary(a: String, b: String): String {
    return (a.toBigInteger(2) + b.toBigInteger(2)).toString(2)

}