package com.mobile.leetcode.graph

import android.os.Build
import androidx.annotation.RequiresApi

/*

You are given an array routes representing bus routes where routes[i] is a bus route that the ith bus repeats forever.

For example, if routes[0] = [1, 5, 7], this means that the 0th bus travels in the sequence 1 -> 5 -> 7 -> 1 -> 5 -> 7 -> 1 -> ... forever.
You will start at the bus stop source (You are not on any bus initially), and you want to go to the bus stop target. You can travel between bus stops by buses only.

Return the least number of buses you must take to travel from source to target. Return -1 if it is not possible.



Example 1:

Input: routes = [[1,2,7],[3,6,7]], source = 1, target = 6
Output: 2
Explanation: The best strategy is take the first bus to the bus stop 7, then take the second bus to the bus stop 6.
Example 2:

Input: routes = [[7,12],[4,5,15],[6],[15,19],[9,12,13]], source = 15, target = 12
Output: -1

* */

@RequiresApi(Build.VERSION_CODES.N)

class Solution {

    fun numBusesToDestination(routes: Array<IntArray>, source: Int, target: Int): Int {
        if (source == target) return 0
        val busStopToBusNum = mutableMapOf<Int, MutableList<Int>>()
        val busTaken = Array(routes.size) { false }
        routes.forEachIndexed { index, ints ->
            ints.forEach { stop ->
                val busNum = busStopToBusNum.getOrDefault(stop, mutableListOf())
                busNum.add(index)
                busStopToBusNum[stop] = busNum
            }
        }
        val deq = ArrayDeque<Pair<Int, Int>>()
        busStopToBusNum[source]?.let { busNums -> deq.addAll(busNums.map { it to 1 }) }
        while (deq.isNotEmpty()) {
            val (busNum, count) = deq.removeFirst()
            if (!busTaken[busNum]) {
                busTaken[busNum] = true
                routes[busNum].forEach { stop ->
                    if (stop == target) return count
                    busStopToBusNum[stop]?.let { busNums -> deq.addAll(busNums.map { it to count + 1 }) }
                }
            }
        }
        return -1
    }
}

@RequiresApi(Build.VERSION_CODES.N)
fun main() {
    val sol = Solution()
    val result = sol.numBusesToDestination(
        arrayOf(intArrayOf(1, 2, 7), intArrayOf(3, 6, 7)),
        source = 1,
        target = 6
    )

    println("No of buses needs to catch to reach target bustop is : $result")
}

