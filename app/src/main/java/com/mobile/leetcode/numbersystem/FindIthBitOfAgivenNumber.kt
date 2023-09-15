package com.mobile.leetcode.numbersystem


/*
*

*
* Alternative quesiont
*
* */
private fun findIthBit(number: Int, i: Int): Int {
    // Create a mask with only the ith bit set to 1 (all others are 0)
    val mask = 1 shl i

    // Use bitwise AND to check the value of the ith bit
    // If the result is greater than 0, the bit is set to 1; otherwise, it's 0
    val result = number and mask

    // If the result is greater than 0, return 1; otherwise, return 0
    return if (result > 0) 1 else 0
}

private fun main() {
    val number = 25 // Example number: 11001 in binary
    val i = 2      // Find the 2nd (0-based index) bit

    val bitValue = findIthBit(number, i)
    println("The $i-th bit of $number is $bitValue")
}