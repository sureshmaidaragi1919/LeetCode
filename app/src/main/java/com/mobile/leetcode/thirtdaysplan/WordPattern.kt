package com.mobile.leetcode.thirtdaysplan
/*
*
* Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.



Example 1:

Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Example 2:

Input: pattern = "abba", s = "dog cat cat fish"
Output: false
Example 3:

Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false
* */

private fun main() {

    val pattern = "abba"
    val s = "dog dog dog dog"

    println(isValid(pattern, s.split(" ").toTypedArray()))
}


private fun isValid(pattern: String, s: Array<String>): Boolean {

        if (pattern.length != s.size) return false

        val hashMap = HashMap<Char, String>()

        for (i in 0 until pattern.length) {

            if (hashMap.containsKey(pattern[i])) {

                if (hashMap.getValue(pattern[i]) != s[i]) {
                    return false
                }

            } else {
                if(hashMap.containsValue(s[i])){
                    return false

                }else{
                    hashMap.put(pattern[i], s[i])
                }


            }

        }

        return true

}