package com.mobile.leetcode.easyproblems


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
