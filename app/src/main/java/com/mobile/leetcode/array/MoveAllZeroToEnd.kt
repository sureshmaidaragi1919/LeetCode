package com.mobile.leetcode.array

/*
*
* input [1,2,0,4,6,0,2]
* output [1,2,4,6,2,0,0]
*
* */


private fun main() {

    val input = intArrayOf(1, 2, 0, 4, 6, 0, 2)
    moveUsingOptimalWay(input)
}


/*
Detect all zeros first and put it in temp array
*
* */
private fun moveUsingBruteForceApproach(intArray: IntArray) {

    var temp = Array(intArray.size, init = { 0 })

    var j = 0
    for (i in intArray.indices) {
        if (intArray[i] != 0) {
            temp[j++] = intArray[i]
        }
    }
    println(temp.toList().toString())

}

private fun moveUsingOptimalWay(nums: IntArray) {
    var resIdx = 0
    for ((i, n) in nums.withIndex()) {
        if (n != 0) {
            nums[resIdx] = n
            resIdx += 1
        }
    }
    for (i in resIdx..nums.size - 1) {
        nums[i] = 0
    }

    println(nums.toList().toString())

}