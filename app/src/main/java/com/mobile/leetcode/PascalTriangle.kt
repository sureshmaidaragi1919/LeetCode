package com.mobile.leetcode

/*Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each

number is the sum of the two numbers directly above it as shown:
Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]
*/

fun main() {

    println(formPascalTriangle(5))
}

fun formPascalTriangle(row: Int): MutableList<MutableList<Int>> {


    val pascalList = mutableListOf(mutableListOf<Int>())

    if (row == 0) return pascalList

    val childList = mutableListOf<Int>()

    childList.add(1)

    pascalList.add(childList)

    for (i in 1 until  row) {

        val oldRow = pascalList[i - 1]

        val newRow = mutableListOf<Int>()

        newRow.add(1)

        for (j in 1 until i-1) {

            newRow.add(oldRow[j - 1] + oldRow[j])

        }

        newRow.add(1)

        pascalList.add(newRow)

    }

    return pascalList

}

