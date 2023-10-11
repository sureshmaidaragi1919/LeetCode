package com.mobile.leetcode.thirtdaysplan

/*
* https://leetcode.com/problems/gas-station/description/?envType=study-plan-v2&envId=top-interview-150
*
* There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].

You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the ith station to its next (i + 1)th station. You begin the journey with an empty tank at one of the gas stations.

Given two integer arrays gas and cost, return the starting gas station's index if you can travel around the circuit once in the clockwise direction, otherwise return -1. If there exists a solution, it is guaranteed to be
*
*
* Input: gas = [1,2,3,4,5], cost = [3,4,5,1,2]
Output: 3
* */

private fun main() {
    var gas = intArrayOf(1, 2, 3, 4, 5)
    var cost = intArrayOf(3, 4, 5, 1, 2)
    println(canCompleteCircuit(gas, cost))
    println(canComplete(gas,cost))

}

fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {

    var diff = 0
    var totalGasSum = 0
    var totalCostSum = 0
    var resultIndex = 0

    for (i in 0 until gas.size) {
        totalCostSum += cost[i]
        totalGasSum += gas[i]

        diff += gas[i] - cost[i]

        if (diff < 0) {
            resultIndex = i + 1
            diff = 0

        }

    }
    return if (totalGasSum < totalCostSum) -1 else resultIndex

}

fun canComplete(gas: IntArray, cost: IntArray): Int {

    var result = -1
    var i = 0
    var prev = 0
    var totalGasSum =0
    var totalCostSum =0

    while (i <= gas.size-1) {

        totalGasSum +=gas[i]
        totalCostSum +=cost[i]
        if (prev + gas[i] >= cost[i]) {
            prev += gas[i] - cost[i]
            i++

        } else {
            result = i++
            prev = 0
        }
    }
    return if(totalGasSum<totalCostSum) -1 else result+1
}