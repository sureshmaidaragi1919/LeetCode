package com.mobile.leetcode.string

/*

val s = "A1 man, a plan, a canal: +Panama"



* */

private fun main() {

    val s = "A man, a plan, a canal: Panama"
    val value = s.replace("[^a-zA-Z0-9]".toRegex(), "")
    println(" ${value}")

    println("Is palindrome -> ${isPalindrome(value)}")
    println("Is palindrome -> ${isPalindromeV1(s)}")
}


//took time around 235ms
fun isPalindrome(s: String): Boolean {

    println(s.length)
    if (s.isEmpty()) return true
    if(s.length==1) return true
    if (s.length == 2 && s == s.reversed()) return true

    val mid: Int = s.length / 2
    if (s.length % 2 == 0) {
        val leftString = s.substring(0, mid).uppercase()
        val rightString = s.substring(mid, s.length).uppercase().reversed()
        println("left $leftString")
        println("right $rightString")

        return leftString == rightString
    } else {
        val leftString = s.substring(0, mid).uppercase()
        val rightString = s.substring(mid + 1, s.length).uppercase().reversed()
        println("left $leftString")
        println("right $rightString")

        return leftString == rightString
    }

}

// best  solution
//took time around 163ms

fun isPalindromeV1(s: String): Boolean {
    var i = 0
    var j = s.length - 1
    while (i < j) {
        val start = s[i]
        val end = s[j]
        if (!Character.isLetterOrDigit(start)) {
            i++
            continue
        }
        if (!Character.isLetterOrDigit(end)) {
            j--
            continue
        }
        if (start.lowercaseChar() != end.lowercaseChar()) {
            return false
        }
        i++
        j--
    }
    return true
}