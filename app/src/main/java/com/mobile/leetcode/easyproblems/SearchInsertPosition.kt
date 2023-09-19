package com.mobile.leetcode.easyproblems

/*
https://leetcode.com/problems/search-insert-position/description/

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
* */
fun main() {
    val nums = intArrayOf(1, 3, 5, 6)
    val target = 2

    println(searchInsert(nums, target))
}

private fun searchInsert(nums: IntArray, target: Int): Int {

    var start = 0
    var end = nums.size - 1


    while (start <= end) {

        var mid = (start + end) / 2

        if (nums[mid] == target) return mid

        if (nums[mid] < target) {
            start = mid + 1
        }

        if (nums[mid] > target) {
            end = mid - 1
        }

    }

    return start
}
