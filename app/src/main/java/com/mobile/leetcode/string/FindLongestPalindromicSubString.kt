package com.mobile.leetcode.string

/*
Input: str = “forgeeksskeegfor”
Output: “geeksskeeg”
Explanation: There are several possible palindromic substrings like “kssk”, “ss”, “eeksskee” etc. But the substring “geeksskeeg” is the longest among all.

Input: str = “Geeks”
Output: “ee”*/



private fun main() {
    val input = "forgeeksskeegfor"

    usingBruteForceApproach(input)

}

/*TC : o(n3)*/
/*SC : o(n)*/
private fun usingBruteForceApproach(input: String) {
    val list = mutableListOf<String>()

    for (i in input.indices) {

        for (j in i until input.length) {
            var formatted = input.substring(i, j)
            if (isPalindrome(formatted)) {
                list.add(formatted)
            }
        }
    }

    println("__________________")
    var max = Int.MIN_VALUE
    var result = ""
    for (i in list.indices) {
        if (list[i].length >= max) {
            result = list[i]
            max = list[i].length
        }
    }
    println("Longest palindrome is $result")

}
