package com.mobile.leetcode.matrix

/*Note: Try to solve this task in-place (with O(1) additional memory), since this is what you'll be asked to do during an interview.

You are given an n x n 2D matrix that represents an image. Rotate the image by 90 degrees (clockwise).

Example

For

a = [[1, 2, 3],
     [4, 5, 6],
     [7, 8, 9]]
the output should be

solution(a) =
    [[7, 4, 1],
     [8, 5, 2],
     [9, 6, 3]]

     */

private fun main() {

    val a = mutableListOf(mutableListOf(1, 2, 3), mutableListOf(4, 5, 6), mutableListOf(7, 8, 9))

    val n = 3
    usingBruteForceApproach(a, n)
}


/*
SC: o(n2)
TC : O(n2)
 */

private fun usingBruteForceApproach(matrix: MutableList<MutableList<Int>>, n: Int) {

    val result = mutableListOf<MutableList<Int>>()
    for (i in 0 until n) {
        val rsu = mutableListOf<Int>()
        for (j in n - 1 downTo 0) {
            rsu.add(matrix[j][i])
        }
        result.add(i, rsu)
    }

    println(result)
}