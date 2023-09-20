package com.mobile.leetcode.thirtdaysplan


private fun main() {
    var nums = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    var k = 3
    rotateBhai(nums, k)
    println(nums.toList())
}

private fun rotateBhai(nums: IntArray, k: Int) {

    var temp = 0

    for (j in 0 until k) {

        temp = nums[nums.size - 1]

        for (i in nums.size - 1 downTo 1) {
            nums[i] = nums[i - 1]
        }

        nums[0] = temp

    }
}