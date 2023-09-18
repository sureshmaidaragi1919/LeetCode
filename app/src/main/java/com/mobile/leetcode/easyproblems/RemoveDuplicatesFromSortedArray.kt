package com.mobile.leetcode.easyproblems

import java.util.TreeMap

/* https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
* 26. Remove Duplicates from Sorted Array
Easy
Topics
Companies
Hint
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.
Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.



Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

* */

private fun main() {


    val input = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)

    var hashMap = TreeMap<Int, Int>()
    for (num in input) {
        if (hashMap.containsKey(num)) {
            hashMap[num] = hashMap.getValue(num) + 1
        } else {
            hashMap[num] = 1
        }
    }

    hashMap
    for ((key, value) in hashMap.iterator()) {

        println("key $key value $value")
        println()


    }


}

private fun bestApproach(nums: IntArray): Int {
    var counter = 0

    for (i in 1 until nums.size) {
        if (nums[counter] != nums[i]) {
            counter++
            nums[counter] = nums[i]
        }
    }
    return counter + 1
}

private  fun removeDuplicates(nums: IntArray): Int {
    nums.distinct().let {
        it.forEachIndexed { index, value ->
            nums[index] = value
        }
        return it.size
    }
}