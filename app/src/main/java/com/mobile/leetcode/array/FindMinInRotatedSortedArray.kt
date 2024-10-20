package com.mobile.leetcode.array

import java.util.Stack
import kotlin.math.min


fun main(){

    val input = intArrayOf(3, 4, 5, 6, 0, 2)
    usingArray(input)
    usingBinarySearch(input)

}

private fun usingArray(input: IntArray) {


    var start_pointer = 0
    var next_pointer = 1
    var size = input.size
    val stack = Stack<Boolean>()

    while (next_pointer < size) {

        if (input[start_pointer] > input[next_pointer]) {
            if (stack.isNotEmpty() && stack.pop() == false) {
                println("output ${input[next_pointer]}")

                //   break
            } else stack.push(true)
        } else {
            if (stack.isNotEmpty() && stack.pop() == true) {
                println("output ${input[start_pointer]}")
                // break
            } else stack.push(false)
        }
        next_pointer++
        start_pointer++

        println(next_pointer)
    }
}


//binary search log n
// 3, 4, 5, 0, 1, 2
fun usingBinarySearch(arrays: IntArray) {

    var start = 0
    var mid = 0
    var last = arrays.size - 1
    var ans = Int.MAX_VALUE
    println("inis")

    while (start <= last) {

        mid = (start + last) / 2

        if(arrays[start]<=arrays[last]){
            ans = min(ans, arrays[start])
            break
        }
        if (arrays[start] <= arrays[mid]) {
            ans = min(ans, arrays[start])
            start = mid + 1
        } else {
            last = mid -1
            ans = min(ans,arrays[mid])

        }

    }

    println("Ans $ans")

}