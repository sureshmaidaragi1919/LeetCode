package com.mobile.leetcode.numbersystem


private fun main() {

    val num = 12  //1100
    val i = 2 //result = 1110

    resetIthBit(num, i)
}

private fun resetIthBit(num: Int, i: Int) {

    val mask = (1 shl i)
    //get complement of mask so
    println("mask is ${mask.toString(2)}")
    val cMask = mask.inv()
    println("inverse of mask is ${cMask.toString(2)}")
/*Note that the complemented number is displayed as -v because Kotlin represents negative numbers using two's complement notation.*/

    val result = cMask and num
    println(result)
}