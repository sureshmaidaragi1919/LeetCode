package com.mobile.leetcode.array

/*

Input: arr[] = {{11, 20}, {30, 40}, {5, 10}, {40, 30}, {10, 5}}
Output: Following pairs have symmetric pairs
(30, 40)
(5, 10)


 */

private fun main() {
    val input =
        arrayOf(Pair(10, 20), Pair(10, 20), Pair(30, 40), Pair(5, 10), Pair(40, 30), Pair(10, 5))

    printSymmetricsArrayPair(input)
}

//Using brute force approach
//Time complexity O(n^2)
fun printSymmetricsArrayPair(input: Array<Pair<Int, Int>>) {

    val hashSet = HashSet<Pair<Int, Int>>()
    for (i in input.indices) {
        for (j in input.indices) {
            if (input[i].first == input[j].second || input[i].first == input[j].first && input[i].second == input[j].first || input[i].second == input[j].second) {
                if (!hashSet.contains(Pair(input[i].second, input[i].first))) hashSet.add(input[i])

            }
        }

    }

    //Print data
    for (item in hashSet.iterator()) {
        println(item)
    }

}


//With time complexity O(n)
fun printSymmetricsArrayPairV1(input: Array<Pair<Int, Int>>) {

    val hashSet = HashSet<Pair<Int, Int>>(input.size / 2)
    for (i in input.indices) {

        if (hashSet.contains(
                Pair(
                    input[i].second, input[i].first
                )
            )
        ) {
            //do nothing
        } else {
            hashSet.add(input[i])
        }


    }

    //Print data
    for (item in hashSet.iterator()) {
        println(item)
    }

}