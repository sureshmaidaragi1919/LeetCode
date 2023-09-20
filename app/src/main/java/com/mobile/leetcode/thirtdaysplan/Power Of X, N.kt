package com.mobile.leetcode.thirtdaysplan


/*
* Implement pow(x, n), which calculates x raised to the power n (i.e., xn).



Example 1:

Input: x = 2.00000, n = 10
Output: 1024.00000
Example 2:

Input: x = 2.10000, n = 3
Output: 9.26100
Example 3:

Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25


Constraints:

-100.0 < x < 100.0
-231 <= n <= 231-1
n is an integer.
Either x is not zero or n > 0.
-104 <= xn <= 104
* */


private fun main() {
    println(myPow(1.0, 2147483647))
}


/*Works with o(n) times but issue is when n is too big*/
fun myPow(x: Double, n: Int): Double {
    var result = 1.0
    if (n < 0) {
        var temp = n * (-1)
        for (i in 0 until temp) {
            result *= x
        }

        result = 1 / result
    } else {
        for (i in 0 until n) {
            result *= x
        }
    }

    return result
}

fun myPowV1(x: Double, n: Int): Double {
    var x = x
    var absN = n.toLong()
    if (n < 0) {
        x = 1 / x
        absN = -absN
    }
    var pow = 1.0
    while (absN > 0) {
        if (absN and 1L != 0L) {
            pow *= x
        }
        x *= x
        absN = absN shr 1
    }
    return pow
}