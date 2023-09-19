package com.mobile.leetcode.thirtdaysplan

/*
* Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.



Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1*/

private fun main() {

println(unique(intArrayOf(2,2,1)))
}


private fun unique(array:IntArray): Int {
    var result =0

    array.forEach { result = result xor it }

    return result
}