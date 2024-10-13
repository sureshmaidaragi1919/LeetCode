package com.mobile.leetcode.array

/*
*Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.

Return the minimized largest sum of the split.

A subarray is a contiguous part of the array.
*
* nums = [7, 2, 5, 10,8] m =2
* ouput = 18
* */


private fun main() {

    val result = intArrayOf(7, 2, 5, 10, 8)

    val k = 2

}

private fun countSStudent(arr: IntArray, pages: Int): Int {

    var student = 1
    var pagesStudent = 0

    for (i in arr.indices) {

        if (pagesStudent + arr[i] <= pages) {
            pagesStudent += arr[i]
        } else {
            student += 1
            pagesStudent = arr[i]
        }
    }
    return student
}


private fun findPages(arr: IntArray, k: Int): Int {
    var max = Int.MIN_VALUE
    var sum = 0
    var currentSum = 0
    for (i in 0 until k) {
        currentSum += arr[i]
    }
    max = currentSum

    for (i in k until arr.size-1) {

        currentSum +=arr[i+1]

    }

    return 0

}


