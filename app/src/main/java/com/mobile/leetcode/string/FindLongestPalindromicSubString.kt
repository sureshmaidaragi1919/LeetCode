package com.mobile.leetcode.string

/*
Input: str = “forgeeksskeegfor”
Output: “geeksskeeg”
Explanation: There are several possible palindromic substrings like “kssk”, “ss”, “eeksskee” etc. But the substring “geeksskeeg” is the longest among all.

Input: str = “Geeks”
Output: “ee”*/



private fun main() {

    val input = "forgeeksskeegfor"

    var startPointer = 0
    var endPointer = 1
    val list = mutableListOf<String>()

    for (i in input.indices) {

        for (j in i until input.length) {

            list.add(input.substring(i, j))

        }
    }

}
