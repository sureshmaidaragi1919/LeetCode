package com.mobile.leetcode.easyproblems

/*
* https://leetcode.com/problems/minimum-index-sum-of-two-lists/solutions/2435320/easy-java-o-n-solution/
*
* Given two arrays of strings list1 and list2, find the common strings with the least index sum.

A common string is a string that appeared in both list1 and list2.

A common string with the least index sum is a common string such that if it appeared at list1[i] and list2[j] then i + j should be the minimum value among all the other common strings.

Return all the common strings with the least index sum. Return the answer in any order.



Example 1:

Input: list1 = ["Shogun","Tapioca Express","Burger King","KFC"], list2 = ["Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"]
Output: ["Shogun"]
Explanation: The only common string is "Shogun".
Example 2:

Input: list1 = ["Shogun","Tapioca Express","Burger King","KFC"], list2 = ["KFC","Shogun","Burger King"]
Output: ["Shogun"]
Explanation: The common string with the least index sum is "Shogun" with index sum = (0 + 1) = 1.
Example 3:

Input: list1 = ["happy","sad","good"], list2 = ["sad","happy","good"]
Output: ["sad","happy"]
Explanation: There are three common strings:
"happy" with index sum = (0 + 1) = 1.
"sad" with index sum = (1 + 0) = 1.
"good" with index sum = (2 + 2) = 4.
The strings with the least index sum are "sad" and "happy".
* */
private fun main() {
    val list1 = arrayOf("Shogun", "Tapioca Express", "Burger King", "KFC")
    val list2 = arrayOf("KFC", "Shogun", "Burger King")
    println( findRestaurant(list1,list2).toList())
}

fun findRestaurant(list1: Array<String>, list2: Array<String>):Array<String> {

    val hashmap = HashMap<String, Int>()

    for (i in 0 until list1.size) {
        hashmap[list1.get(i)] = i
    }


    var outputMap = HashMap<String, Int>()
    for (i in 0 until list2.size) {
        if (hashmap.containsKey(list2[i])) {
            val cal = hashmap.getValue(list2.get(i)) + i
            outputMap.put(list2.get(i), cal)

        }
    }
    val fucc = outputMap.entries.sortedBy { it.value }

    var min = Int.MAX_VALUE
    var index = 0
    var finalList = mutableListOf<String>()
    for (item in fucc.iterator()) {

        if(item.value<=min){
            finalList.add(item.key)
            min = item.value
        }
    }

    return finalList.toTypedArray()


}