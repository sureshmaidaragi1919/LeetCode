package com.mobile.leetcode.array

/*
*
*
* Rotate an given array by kth places
*
*  input = [1,2,3,4,5], k =2
* output =[3,4,1,2]
* */


private fun main() {

    val input = arrayOf(1, 2, 3, 4, 5, 6, 7)
    val k = 1

    rotateArrayUsingBruteForce(input, k)
}


/*

TC : O(k*size)
Sp: O(1)
* */
private fun rotateArrayUsingBruteForce(input: Array<Int>, k: Int) {
    val size = input.size - 2

    if (k == input.size) return println("after repeat array remains same")

    for (j in 0..<k) {
        for (i in 0..size) {
            val temp = input[i]
            input[i] = input[i + 1]
            input[i + 1] = temp
        }
    }

    println(input.toList())
}