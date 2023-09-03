package com.mobile.leetcode.matrix


/*

Given an n fences and 3 colors, user can paint all the fence with different color with no two adjust fence have same color
find out min time required to paint all fences

The time required to paint each fence with certain color is represented by a nx3 time matrix called times


Example : times = [[2,9,4],[20,7,15],[18,12,19]]
        output = 27
*
* */

private fun main() {

    val n = 3
    val colorsCount = 3
    var input = mutableListOf(
        mutableListOf(2, 9, 4), mutableListOf(20, 7, 15), mutableListOf(18, 12, 19)
    )

    minTimeRequiredToPaintAllFence(input, colorsCount)
    maxTimeRequiredToPaintAllFence(input, colorsCount)

}

private fun minTimeRequiredToPaintAllFence(input: MutableList<MutableList<Int>>, colorsCount: Int) {
    val outputMap = mutableMapOf<Int, Pair<Int, Int>>()
    for (i in input.indices) {
        var min = Int.MAX_VALUE
        for (j in 0..<colorsCount) {
            if (outputMap[i - 1]?.second != j && min >= input[i][j]) {
                min = input[i][j]
                outputMap.put(i, Pair(min, j))

            }
        }
    }


    var result = 0
    for (item in outputMap.iterator()) {
        result += item.value.first
    }

    println("Min time required to paint all fence's is = $result")

}


private fun maxTimeRequiredToPaintAllFence(input: MutableList<MutableList<Int>>, colorsCount: Int) {
    val outputMap = mutableMapOf<Int, Pair<Int, Int>>()
    for (i in input.indices) {
        var max = Int.MIN_VALUE
        for (j in 0..<colorsCount) {
            if (outputMap[i - 1]?.second != j && max <= input[i][j]) {
                max = input[i][j]
                outputMap.put(i, Pair(max, j))

            }
        }
    }


    var result = 0
    for (item in outputMap.iterator()) {
        result += item.value.first
    }

    println("Max time required to paint all fence's is = $result")

}




/*Using 2D matrix*/
private fun minPaintTime(times: MutableList<MutableList<Int>>): Int {
    val n = times.size

    // Initialize a 2D DP array where dp[i][j] represents the minimum time to paint the first i fences with the i-th fence painted with color j.
    val dp = Array(n) { IntArray(3) }


    // Initialize the first row of dp with the times for the first fence.
    dp[0] = times[0].toIntArray()

    // Iterate through the fences starting from the second one.
    for (i in 1 until n) {
        for (j in 0 until 3) {
            // Calculate the minimum time to paint the i-th fence with color j by considering the previous fence.
            dp[i][j] = times[i][j] + minOf(dp[i - 1][(j + 1) % 3], dp[i - 1][(j + 2) % 3])
        }
    }

    // The minimum time to paint all the fences will be the minimum time in the last row of dp.
    val minTime = dp[n - 1].minOrNull() ?: 0

    return minTime
}

