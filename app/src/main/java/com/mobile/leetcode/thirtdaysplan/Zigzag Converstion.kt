package com.mobile.leetcode.thirtdaysplan

/*
* The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);


Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I
Example 3:

Input: s = "A", numRows = 1
Output: "A"

* */
private fun main(){

    println(convert("PAYPALISHIRING",4))
    //PAHNAPLSIIGYIR
println("paypal".indexOf("pal"))


}

fun convert(s: String, numRows: Int): String {
    if (numRows == 1) return s

    val array = Array(numRows) { StringBuilder() }
    var goingUp = false
    var row = 0

    for (c in s) {
        array[row].append(c)

        if (row == 0) goingUp = false
        if (row + 1 == numRows) goingUp = true
        if (goingUp) row-- else row++
    }
    return array.joinToString("")
}