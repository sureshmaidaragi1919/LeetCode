package com.mobile.leetcode.string


/*Given two strings, find the number of common characters between them.

Example

For s1 = "aabcc" and s2 = "adcaa", the output should be
solution(s1, s2) = 3.

Strings have 3 common characters - 2 "a"s and 1 "c".

Input/Output

[execution time limit] 3 seconds (kt)

[memory limit] 1 GB

[input] string s1

A string consisting of lowercase English letters.

Guaranteed constraints:
1 ≤ s1.length < 15.

[input] string s2

A string consisting of lowercase English letters.

Guaranteed constraints:
1 ≤ s2.length < 15.

[output] integer
*/


private fun main() {
    println(solution("aabcc", "adcaa"))
}

fun solution(s1: String, s2: String): Int {

    var hashmapStr1 = mutableMapOf<Char, Int>()
    var hashmapStr2 = mutableMapOf<Char, Int>()



    for (element in s1) {
        if (hashmapStr1.contains(element)) {
            hashmapStr1.put(element, hashmapStr1.getValue(element) + 1)
        } else {
            hashmapStr1.put(element, 1)
        }
    }



    for (element in s2) {

        if (hashmapStr2.contains(element)) {
            hashmapStr2.put(element, hashmapStr1.getValue(element) + 1)
        } else {
            hashmapStr2.put(element, 1)
        }
    }

    var result = 0
    for (item in hashmapStr1) {

        if (hashmapStr2.contains(item.key)) {
            result += Math.min(item.value, hashmapStr2.getValue(item.key))
        }
    }

    return result
}
