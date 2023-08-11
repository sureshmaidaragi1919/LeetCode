package com.mobile.leetcode

/*
*
* arr = [2, 3, 5, 9, 14, 16, 18], target = 14
*
* output = 14 target =14
* output = 4 target = 3
* output = 18 target = 20
*
* */



fun main() {

    val input = arrayOf(2, 3, 5, 14, 16, 18)
    val target = 14

    println(findTarget(target, input, 0, input.lastIndex))
}

fun findTarget(target: Int, input: Array<Int>, start: Int, end: Int): Int {

    val mid = (start + end) / 2

    if (input[mid] == target) return mid

    if (input[mid] >= target) {

        findTarget(target, input, start, mid+1)

    } else {

        findTarget(target, input, mid+1, end)
    }

    return -1
}

