package com.mobile.leetcode.thirtdaysplan


/*
*
* 11. Container With Most Water
Medium
Topics
Companies
Hint
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.
* */

private fun main() {

    println(maxAreaV1(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)))

}

//Using brute force approach
fun maxArea(height: IntArray): Int {

    var result = 0
    for (i in 0 until height.size) {

        for (j in i + 1 until height.size) {

            var height = Math.min(height[i], height[j])
            var width = (j - i)

            var area = height * width
            result = Math.max(area, result)
        }
    }

    return result

}

//Using best approach
fun maxAreaV1(height: IntArray): Int {
    var i = 0
    var j = height.size - 1
    var result = 0

    while (i < j) {

        val ht = Math.min(height[i], height[j])
        val width = (j - i)

        val area = ht * width
        result = Math.max(area, result)

        if(height[i]>height[j]){
            j--
        }else{
            i++
        }
    }

    return result
}