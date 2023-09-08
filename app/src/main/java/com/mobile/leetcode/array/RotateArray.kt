package com.mobile.leetcode.array

/*
*
*
* Rotate an given array by kth places
*
*  input = [1,2,3,4,5], k =2
* output =[3,4,1,2]
* */


private fun main() {

    val input = arrayOf(1, 2, 3, 4, 5, 6, 7)
    val k = 6
    rotateArrayUsingSizeOfkthTempArray(input, k)
}


/*

TC : O(k*size)
Sp: O(1)
* */
private fun rotateArrayUsingBruteForce(input: Array<Int>, k: Int) {
    val size = input.size - 2

    if (k == input.size) return println("after repeat array remains same")

    for (j in 0..<k) {
        for (i in 0..size) {
            val temp = input[i]
            input[i] = input[i + 1]
            input[i + 1] = temp
        }
    }

    println(input.toList())
}


/*
Optimal  approach
using temp array of size arr.size

Time complexity O(n)
Space complexity O(1)
*/

private fun rotateArrayUsingNaiveApproach(input: Array<Int>, k: Int) {

    if (k >= input.size) return

    var s = input.size
    var output = Array(s, init = { -1 })
    var tempCounter = 0

    for (i in k..<s) {
        output[tempCounter++] = input[i]
    }
    println(output.toList())

    var shit = s - 1
    for (i in k - 1 downTo 0) {
        output[shit--] = input[i]
    }

    println(output.toList())

}

/*
* Here used extra space of arr[kth] instead arr[input.size] at @param rotateArrayUsingNaiveApproach
* */
private fun rotateArrayUsingSizeOfkthTempArray(input: Array<Int>, k: Int) {

    if (k >= input.size) return
    val kthArray = Array(k, init = { 0 })

    for (i in 0..<k) {
        kthArray[i] = input[i]
    }
    println(kthArray.toList().toString())

    var j = 0
    for (i in k..<input.size) {
        input[j++] = input[i]
    }


    for (i in kthArray.indices) {
        input[j++] = kthArray[i]
    }

    println("${input.toList()}")

}