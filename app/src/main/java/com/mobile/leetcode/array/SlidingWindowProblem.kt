package com.mobile.leetcode.array


/*Input  : arr[] = {100, 200, 300, 400}, k = 2
Output : 700


Input  : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}, k = 4
Output : 39
*/


private fun main() {

    val input_array = arrayOf(100, 200, 300, 400)
    val k = 2

    val result = findMax(input_array, k)
    println("Result is $result")
}


/*
* Using brute force apprach
* TC ': O(n*k)
* Auxiliary Space : O(1)
* */
private fun findMaxSum(inputArray: Array<Int>, k: Int): Int {
    var maxSum = 0

    //Corner case
    if (k > inputArray.size) {
        return -1
    }
    var k = k - 1 //because index start with zero

    //Corner case
    if (k == inputArray.size) {
        for (i in inputArray.indices) {
            maxSum += inputArray[i]
        }
        return maxSum
    }

    //Best case
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


/*
Using fist window and reducing i-1 and adding k+1
TC : O(n)
Auxiliary Space : O(1)
* */

private fun findMax(inputArray: Array<Int>, k: Int): Int {

    if (k >= inputArray.size) {
        return -1
    }

    var maxSum = 0

    for (i in 0..<k) {
        maxSum += inputArray[i]
    }

    var currentSum = maxSum
    for (i in k..<inputArray.size) {
        currentSum += inputArray[i] - inputArray[i - k]
        maxSum = Math.max(currentSum, maxSum)
    }

    return maxSum
}