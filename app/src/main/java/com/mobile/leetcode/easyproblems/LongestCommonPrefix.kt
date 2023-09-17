package com.mobile.leetcode.easyproblems


//https://leetcode.com/problems/longest-common-prefix/description/
/*
* Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
* */

private fun main() {
    val strs = arrayOf("flow", "flow", "flight")

    strs.sort()
    if (strs.isEmpty() || strs.size == 1) return
    val firstString = strs[0]
    val lastString = strs[1]
    var index = 0

    while (index < firstString.length && index < lastString.length) {

        if (firstString[index] == lastString[index]) {
            index++
        } else {
            break
        }
    }

    println("result is  = ${firstString.subSequence(0, index)}")
}