package com.mobile.leetcode.thirtdaysplan


private fun main(){

    println(convert("PAYPALISHIRING",4))
    //PAHNAPLSIIGYIR

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