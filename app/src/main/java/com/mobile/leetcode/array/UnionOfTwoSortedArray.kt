package com.mobile.leetcode.array

/*
*
*  input1 = [1,2,4,5,6,7]
*  input1 = [0,2,7,8,9]
*
* output = {0,1,2,4,5,6,7,8,9}
*
* */

private fun main() {

    val input1 = intArrayOf(1, 2, 4, 5, 6, 7)
    val input2 = intArrayOf(0, 2, 7, 8, 9)

    findUnionUsingBruteForceApproach(input1, input2)
}


/*
* TC : O(2n) = O(n1logn1)+O(n2logn2)
* SC : 0(n1+n2)
* */
fun findUnionUsingBruteForceApproach(input1: IntArray, input2: IntArray) {

    val hashSet: HashSet<Int> = HashSet()

    for ((i, n) in input1.withIndex()) {

        hashSet.add(n)

    }
    for ((i, n) in input2.withIndex()) {
        hashSet.add(n)
    }

    println(hashSet.toList().toString())

}



