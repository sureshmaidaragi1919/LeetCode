package com.mobile.leetcode.array
fun main(){
    findLowestHighestIndex(intArrayOf(2,3,4,4,4,51,53),4)
}
fun findLowestHighestIndex(arr: IntArray, key: Int) {
    var lowestIndex = arr.size - 1
    var highestIndex = 0
    for (i in arr.indices) {
        if (arr[i] == key) {
            if (i < lowestIndex) {
                lowestIndex = i
            }
            if (i > highestIndex) {
                highestIndex = i
            }
        }
    }
    println("$lowestIndex $highestIndex")
}