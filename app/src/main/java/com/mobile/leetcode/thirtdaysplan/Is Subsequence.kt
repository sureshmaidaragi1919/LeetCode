package com.mobile.leetcode.thirtdaysplan

import java.util.Stack





private fun main() {

    println(optimisedSub("abc", "ahbgdc"))

}

/*Using while loop o(n) times*/
fun isSubsequence(s: String, t: String): Boolean {

    var sIndex = 0
    var tIndex = 0

    var sSize = s.length - 1
    var tSize = t.length - 1

    if (sSize > tSize) return false

    if (s.isEmpty()) return true

    if (s.length == 1 && t.length == 1 && s != t) return false

    while (sIndex <= sSize && tIndex <= tSize) {

        if (sIndex <= sSize && s[sIndex] == t[tIndex]) {
            sIndex++
            tIndex++
        } else {
            tIndex++
        }
    }

    return sIndex == s.length
}

private fun optimisedSub(s: String, t: String): Boolean {
    var i = 0
    var j = 0

    while (i < s.length && j < t.length) {
        if (s[i] == t[j]) {
            i++
        }
        j++
    }

    return i == s.length
}

fun isSubsequenceV1UsingStack(s: String, t: String): Boolean {
    val stack = Stack<Char>()
    for (i in 0 until s.length) {
        stack.push(s[i])
    }
    var i = t.length - 1
    while (i >= 0 && stack.size > 0) {
        if (t[i] == stack.peek()) {
            stack.pop()
        }
        i--
    }
    return stack.isEmpty()
}