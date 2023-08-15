package com.mobile.leetcode.array

/*
* Given an integer array nums, return true if any value appears at
*  least twice in the array, and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
* */

fun main() {

    println(containsDuplicate(arrayOf(1, 2, 4, 5, 6, 1)))
}

fun containsDuplicate(array: Array<Int>): Boolean {

    val hashSet = mutableListOf<Int>()
    array.forEachIndexed { index, integer ->

        if (hashSet.contains(integer)) return true
        hashSet.add(integer)
    }
    return false
}
