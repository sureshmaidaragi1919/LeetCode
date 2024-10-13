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
    val strs = arrayOf("flower", "flow", "flight")

    strs.sort()
    println(strs.toList())
    if (strs.isEmpty() || strs.size == 1) return
    val firstString = strs[0]
    val lastString = strs[1]
    var index = 0

    while (index<firstString.length && index < lastString.length) {

        if (firstString[index] == lastString[index]) {
            index++
        } else {
            break
        }
    }

    println("result is  = ${firstString.subSequence(0, index)}")

    usingBestApproach(strs)
}

private fun usingBestApproach(str: Array<String>) {

    var prefix = str[0]

    for (i in 1 until str.size) {

        println("index of ${str[i].indexOf(prefix)}")
        while (str[i].indexOf(prefix) != 0) {
            println("index of ${str[i].indexOf(prefix)}")
            prefix = prefix.substring(0, prefix.length - 1)
            println(prefix)
        }
        if (prefix.isEmpty()){
            return
        }

    }
    println("using best approach $prefix")

}