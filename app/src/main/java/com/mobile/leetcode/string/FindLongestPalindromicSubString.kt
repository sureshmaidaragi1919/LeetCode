package com.mobile.leetcode.string

/*
Input: str = “forgeeksskeegfor”
Output: “geeksskeeg”
Explanation: There are several possible palindromic substrings like “kssk”, “ss”, “eeksskee” etc. But the substring “geeksskeeg” is the longest among all.

Input: str = “Geeks”
Output: “ee”*/



private fun main() {
    val input = "ababa"

    // usingBruteForceApproach(input)

    bestApproach(input)

}

/*TC : o(n3)*/
/*SC : o(n)*/
private fun usingBruteForceApproach(input: String) {
    val list = mutableListOf<String>()

    for (i in input.indices) {

        for (j in i until input.length) {
            val formatted = input.substring(i, j)
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


/*Using o(n2)*/


private fun bestApproach(s:String) {
    var start = 0
    var end = 0

    fun check(q: Int, p: Int) {
        var i = q
        var j = p
        while (i >= 0 && j < s.length && s[i] == s[j]) {
            i--
            j++
        }
        if (j - i > end - start) {
            end = j
            start = i + 1
        }
    }

    for (i in s.indices) {
        if (i != 0) check(i - 1, i)
        check(i, i)
    }
    println("Result ${s.substring(start, end)}")
}
