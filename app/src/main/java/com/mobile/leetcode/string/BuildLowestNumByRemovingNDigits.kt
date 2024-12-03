package com.mobile.leetcode.string


/*
* Given a string ‘str’ of digits and an integer ‘n’, build the lowest possible number by removing
* ‘n’ digits from the string and not changing the order of input digits.

Examples:

Input: str = "4325043", n = 3
Output: "2043"

Input: str = "765028321", n = 5
Output: "0221"

Input: str = "121198", n = 2
Output: "1118"
* */

/*
TC : O(N)
SC : O(N)
*
* */
private fun main() {

    val str = "121198"
    val n = 2
    removeKDigits(str, n)
}

fun removeKDigits(str: String, n: Int) {
        val stack = ArrayDeque<Char>()
        var removeCount = n

        for (digit in str) {
            while (stack.isNotEmpty() && stack.last() > digit && removeCount > 0) {
                stack.removeLast()
                removeCount--
            }
            stack.addLast(digit)
        }

        // Remove remaining digits from the end if necessary
        while (removeCount > 0 && stack.isNotEmpty()) {
            stack.removeLast()
            removeCount--
        }

        // Build the result and remove leading zeros
        val result = stack.joinToString("").trimStart('0')

        // If the result is empty (e.g., all digits removed), return "0"
        val finalResult= result.ifEmpty { "0" }

    println("final result $finalResult")

}
