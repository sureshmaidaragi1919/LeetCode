package com.mobile.leetcode.thirtdaysplan

/*
https://leetcode.com/problems/sliding-window-maximum/description/
You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right.
 You can only see the k numbers in the window. Each time the sliding window moves right by one position.

Return the max sliding window.



Example 1:

Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
Explanation:
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
Example 2:

Input: nums = [1], k = 1
Output: [1]


 */
private fun main() {
    var a = intArrayOf(1, 3, -1, -3, 5, 3, 6, 7)
    var k = 3

    println(usingBruteForceApproach(a, k).toList())
}


private fun usingBruteForceApproach(a: IntArray, k: Int): IntArray {

    var output = IntArray(a.size - k + 1)
    var index = 0
    for (i in 0..a.size - k) {
        var max = Int.MIN_VALUE

        for (j in i until i + k) {
            max = Math.max(max, a[j])
        }
        output[index++] = max

    }
    return output
}


//Using best approach
private fun maxNumberInSlidingWindow(a: IntArray, k: Int): IntArray {

    return intArrayOf()
}
