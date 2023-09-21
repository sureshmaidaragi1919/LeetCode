package com.mobile.leetcode.array

import java.util.PriorityQueue
import java.util.Queue
import java.util.TreeMap

/*
* Time Complexity: O( nlog(n) + mlog(m) )
*/




fun main() {
    val a = intArrayOf(1)
    val b = intArrayOf(2, 4, 6, 8, 9, 55)


    //mergeArrays(a, b)
    // mergeTowArrays(a, b)
    //  mergeTwoArraysWithPriorityQueue(a, b)
    mergeWithoutAnyInbuilt(a, b)
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

private fun mergeWithoutAnyInbuilt(a: IntArray, b: IntArray) {
    var output = mutableListOf<Int>()
    for (i in a.indices) {
        output.add(i, a[i])
    }
    var count = output.size
    for (zeros in b.indices) {
        output.add(count++, 0)
    }

    var i = a.size - 1
    var j = b.size - 1
    var k = a.size + b.size - 1
    while (j >= 0) {
        output.set(index = k--, element = if (i < 0 || a[i] <= b[j]) b[j--] else a[i--])
    }

    println("Merged list is ${output}")
}


private fun mergBhai(a: IntArray, b: IntArray) {

    var output = IntArray(a.size + b.size )

    var i = 0
    var j = 0

    var index = 0
    while (i < a.size && j < b.size) {

        if (a[i] > b[j]) {
            output[index++] = b[j]
            output[index++] = a[i]
        } else {
            output[index++] = a[j]
            output[index++] = b[i]
        }
        i++
        j++
    }

    for (m in i until a.size) {
        output[index++]
    }

    for (m in j until b.size) {
        output[index++]
    }
    println("merged list bhai ${output.toList()}")
}