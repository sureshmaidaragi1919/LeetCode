package com.mobile.leetcode.array


/*Input  : arr[] = {100, 200, 300, 400}, k = 2
Output : 700


Input  : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}, k = 4
Output : 39
*/


private fun main() {

    val input_array = arrayOf(1, 4, 2, 10)
    val k = 5

    val result = findMaxSum(input_array, k)
    println("Result is $result")
}



/*
* Using brute force apprach
* TC ': O(n)+O(k)
* SC : O(1)
* */
private fun findMaxSum(inputArray: Array<Int>, k: Int): Int {
    var maxSum = 0

    if (k > inputArray.size) {
        return -1
    }
    var k = k - 1 //because index start with zero

    if (k == inputArray.size) {
        for (i in inputArray.indices) {
            maxSum += inputArray[i]
        }
        return maxSum
    }

    for (i in inputArray.indices) {

        if (i + k < inputArray.size) {
            var totalSum = calculateSum(inputArray, i, i + k)
            maxSum = Math.max(totalSum, maxSum)
        }
    }


    return maxSum
}

private fun calculateSum(inputArray: Array<Int>, start: Int, end: Int): Int {

    var totalSum = 0
    for (i in start..end) {
        totalSum += inputArray[i]
    }

    return totalSum

}

