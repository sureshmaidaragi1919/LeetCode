package com.mobile.leetcode.thirtdaysplan


/*
* Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal
substring
 consisting of non-space characters only.



Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
*/

private fun main() {
    val s = "   fly me   to   the moon  "

    usingForEach(s)
}

private fun findLength(s: String) {
    val result = s.trim().split(" ").findLast { true }?.length ?: 0
    println(result)
}

private fun usingForEach(s: String) {
    var count = 0
    for (i in s.length - 1 downTo 0) {
        if (s[i] == ' ' && count == 0) {
            count = 0
        } else if (s[i] == ' ' && count != 0) {
            break
        } else {
            count++
        }
    }

    println(count)
}

private fun lengthOfLastWord(s: String): Int {
    val arr = s.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
    val h = arr[arr.size - 1]
    return h.length
}