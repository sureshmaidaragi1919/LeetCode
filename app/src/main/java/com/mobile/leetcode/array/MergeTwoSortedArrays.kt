package com.mobile.leetcode.array

import java.util.PriorityQueue
import java.util.Queue
import java.util.TreeMap

/*
* Time Complexity: O( nlog(n) + mlog(m) )
*/




fun main() {
    val a = intArrayOf(1, 3, 5, 7)
    val b = intArrayOf(2, 44, 6, 8, 9)

    //mergeArrays(a, b)
    // mergeTowArrays(a, b)
    mergeTwoArraysWithPriorityQueue(a, b)
}

//Using TreeMap which internally sorts the items
fun mergeArrays(a: IntArray, b: IntArray) {
    val mp: MutableMap<Int, Boolean> =
        TreeMap() //Using tree map because internally it sorts the items

    for (element in a) {
        mp[element] = true
    }
    for (element in b) {
        mp[element] = true
    }

    for (entries in mp.entries) {
        print(entries.key.toString() + " ")
    }
}


//when both array's of same size time we achieve time complexity o(m) or o(n)
fun mergeTowArrays(a: IntArray, b: IntArray) {

    var output = IntArray(a.size + b.size)
    var index = 0
    for (i in a.indices) {
        if (a[i] <= b[i]) {
            output[index] = a[i]
            index++
            output[index] = b[i]
            index++
        } else {
            output[index] = b[i]
            index++
            output[index] = a[i]
            index++

        }
    }
    println(output.toList())
}

/*Using priority queue
*
* Time Complexity: O((N+M)*log(N+M))
* Auxiliary Space: O(N+M)
*
*
* */

private fun mergeTwoArraysWithPriorityQueue(a: IntArray, b: IntArray) {

    val queue: Queue<Int> = PriorityQueue<Int>()
    queue.addAll(a.toTypedArray())
    queue.addAll(b.toTypedArray())

    while (queue.isNotEmpty()) {
        print(" ${queue.poll()} ")
    }


}