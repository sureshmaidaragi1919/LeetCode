package com.mobile.leetcode.thirtdaysplan

import java.math.BigInteger


private fun main() {

    println(trailingZeroesV1(25))
}
var res = 0
fun trailingZeroesV1(n: Int): Int {
    if (n < 5) return res
    res = res + n / 5
    return trailingZeroesV1(n / 5)
}
fun trailingZeroes(n: Int): Int {

    if (n == 0) return 0

    var result :BigInteger= 1.toBigInteger()

    for (i in n downTo 1) {

        result = result * i.toBigInteger()

    }

    println("result $result")
    var zerocount = 0
    while (result > 0.toBigInteger()) {

        if (result % 10.toBigInteger() == 0.toBigInteger()) {
            zerocount++
        } else {
            return zerocount
        }

        result = result / 10.toBigInteger()
    }

    return zerocount
}