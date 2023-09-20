package com.mobile.leetcode.thirtdaysplan

/*
* Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.



Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
* */


private fun main() {

    var nums = intArrayOf(4, 2, 3, 4, 4, 3)
    findMajority(nums)
    println(bruteForceApproach(nums))

}


/*This the logic is to find n/2*/
private fun findMajority(nums: IntArray) {
    var result = 0

    result = nums.apply { sort() }[(nums.size / 2)]
    println(result)
}

private fun bruteForceApproach(nums: IntArray): Int {

    for (i in 0 until nums.size) {

        var count = 0

        for (j in 0 until nums.size) {

            if (nums[i] == nums[j]) {
                count++
            }
        }

        if (count >= nums.size / 2) return nums[i]
    }

    return -1
}

fun majorityElement(nums: IntArray): Int {
    //Moore's Voting Algorithm

    var count =0
    var element = 0

    for ( i in 0 until nums.size){

        if(count==0){
            element = nums[i]
            count =1
        }else if(nums[i]==element){
            count++
        }else {
            count--
        }
    }

    var count1 =0
    for(i in 0 until nums.size){
        if(nums[i]==element) count1++
    }
    if(count1>(nums.size/2)) return element
    else return -1
}