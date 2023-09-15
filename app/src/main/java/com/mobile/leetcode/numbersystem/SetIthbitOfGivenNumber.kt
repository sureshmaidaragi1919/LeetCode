package com.mobile.leetcode.numbersystem


/*
*
* create Mask n-1 zeros and OR with number
*
*
* Alternative quesiont
*
* */
private fun setIthBit(number: Int, i: Int): Int {
    // Create a mask with only the ith bit set to 1 (all others are 0)
    val mask = 1 shl i
    println("mask ${mask}")

    // Use bitwise AND to check the value of the ith bit
    // If the result is greater than 0, the bit is set to 1; otherwise, it's 0

    val result = number or mask

    // If the result is greater than 0, return 1; otherwise, return 0
    return  result
}

private fun main() {
    val number = 25 // Example number: 11001 in binary
    val i = 2      // Find the 2nd (0-based index) bit

    val bitValue = setIthBit(number, i)
    println("The $i-th bit of $number is $bitValue")
}