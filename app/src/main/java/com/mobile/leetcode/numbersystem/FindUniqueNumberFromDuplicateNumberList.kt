package com.mobile.leetcode.numbersystem

private fun main() {

    val input = arrayOf(2, 3, 3, 4, 2, 6, 4)

    findunique(input)
}

fun findunique(input: Array<Int>) {

    var unique = 0;
    for (element in input) {
        unique = element.xor(unique)
    }

    println(unique)
}
