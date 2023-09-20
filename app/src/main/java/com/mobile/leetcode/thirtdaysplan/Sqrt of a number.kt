package com.mobile.leetcode.thirtdaysplan


/*
* Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.


Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.*/
private fun main() {

linearMethod(26)
    println(mySqrtV1(2147395599))
}


/*takes o(n) times which is very naive approach*/
private fun linearMethod(n: Int) {
    var result = 0

    for (i in 0 until n) {

        if (i * i <= n) {
            result = i
        } else {
            break
        }
    }

    println(result)
}

fun mySqrt(x: Int): Int {

    if(x==0) return 0
    if(x==1) return 1
    var start =1
    var end = x
    var mid = (start+end)/2
    var result =1

    while(start<=end){

        mid = (start+end)/2
        if(mid*mid<=x){
            result = mid
            start = mid+1

        }
        else {
            end = mid-1
        }
    }
    return result
}

fun mySqrtV1(x: Int): Long {
    var i = 0L
    while(i*i <= x) { i++ }
    return i-1
}