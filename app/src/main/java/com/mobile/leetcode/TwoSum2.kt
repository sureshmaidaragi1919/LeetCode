package com.mobile.leetcode

import java.util.*

/*
* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


*/

fun main() {
    println(twoSum(arrayOf(3, 3), 6).contentToString())
}

fun twoSum(nums: Array<Int>, target: Int): IntArray {

    val array = IntArray(2)

    for (i in nums.indices) {

        val newTarget = target - nums[i]
        val newList = nums.toMutableList()
        newList.removeAt(i)
        if (newList.contains(newTarget)) {
            return intArrayOf(i, nums.lastIndexOf(newTarget))
        }
    }

    return array

}