package com.mobile.leetcode.array

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
    val target = 16

    println(findTarget(target, input, 0, input.lastIndex))
}

fun findTarget(target: Int, input: Array<Int>, start: Int, end: Int): Int {

    val mid = (start + end) / 2
    if (mid == input.size - 1) return -1

    if (input[mid] == target) return mid

    if (input[mid] > target) {

        return findTarget(target, input, start, mid)

    } else {

        return findTarget(target, input, mid + 1, end)
    }

}

