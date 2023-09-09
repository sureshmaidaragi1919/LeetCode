package com.mobile.leetcode.array

/*
*
* Given an array of integers nums which is sorted in ascending order, and an integer target,
*  write a function to search target in nums . If target exists,thenreturnitsindex.Otherwise,return -1 .
You must write an algorithm with 0(log n) runtime complexity.
*
* input arr =[1,2,3,4,5,6] k =3
* */



private fun main() {

    var arr = intArrayOf(1, 2, 3, 4, 5, 6)

    println("result is  ${findIt(arr, 0, arr.size - 1)}")

}

val k = 5
private fun findItByLogN(arr: IntArray, startIndex: Int, endIndex: Int): Int {
    var startIndexTemp = startIndex
    var endIndexTemp = endIndex
    while (startIndexTemp <= endIndexTemp) {

        var mid = (startIndexTemp + endIndexTemp) / 2
        if (arr[mid] == k) return mid
        else if (arr[mid] > k) {
            endIndexTemp = mid - 1
        } else {
            startIndexTemp = mid + 1
        }
    }
    return -1
}


/*
* Using recursion*/
private fun findIt(arr: IntArray, startIndex: Int, endIndex: Int) {

    if (startIndex >= endIndex) return
    val mid = (startIndex + endIndex) / 2
    if (arr[mid] == k) println(mid)
    if (arr[mid] > k) findIt(arr, startIndex, mid - 1)
    if (arr[mid] < k) findIt(arr, mid + 1, endIndex)

}