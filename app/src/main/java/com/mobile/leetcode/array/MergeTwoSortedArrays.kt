package com.mobile.leetcode.array

import java.util.*

/*
* Time Complexity: O( nlog(n) + mlog(m) )
*/
fun mergeArrays(a: IntArray, b: IntArray) {
    val mp: MutableMap<Int, Boolean> = TreeMap() //Using tree map because internally it sorts the items

    for (element in a) {
        mp[element] = true
    }
    for (element in b) {
        mp[element] = true
    }

    for (entries in mp.entries) {
        print(entries.key.toString() + " ")
    }
}

fun main() {
    val a = intArrayOf(1, 3, 5, 7)
    val b = intArrayOf(2, 4, 6, 8)

    mergeArrays(a, b)
}