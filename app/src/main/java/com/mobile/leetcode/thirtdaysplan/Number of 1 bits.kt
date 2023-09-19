package com.mobile.leetcode.thirtdaysplan


private fun main() {

    val n = "11111111111111111111111111111101"
    hammingWeight(n)

}


// you need treat n as an unsigned value
fun hammingWeight(n: String): Int {

    var result = 0
    for (i in 0..n.length - 1) {
        if (n.get(i) == '1') {
            result++
        }
    }
    println(result)
    return 0
}

fun usingShitf(n: Int): Int {
    /*
         var count = 0
    var number = n
    for (i in 0..31) {
        if (number and 1 == 1) count++
        number = number shr 1
    }
    * */
    return Integer.toBinaryString(n).count { it == '1' }

}