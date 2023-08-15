package com.mobile.leetcode.array

fun findMissingNumbers(arr: IntArray, count: Int): Int {
    var total: Int = (count + 1) * (count + 2) / 2
    var i = 0
    while (i < count) {
        total -= arr[i]
        i++
    }
    return total
}


 fun main( ) {
    val arr = intArrayOf(1, 2, 4, 6, 3, 7, 8)
     println(arr.size)
    println(findMissingNumbers(arr, arr.size))
}