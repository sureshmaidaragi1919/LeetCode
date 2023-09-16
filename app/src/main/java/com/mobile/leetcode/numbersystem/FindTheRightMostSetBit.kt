package com.mobile.leetcode.numbersystem


private fun main() {

    val num = 9
    val result = findTheRightMostSetBit(num)

    println("$result")
}

private fun findTheRightMostSetBit(num: Int): Int {
    var num = num
    if (num == 0) return 0

    var mask = 1
    var position = 0
    while (true) {

        if (num and mask != 0) {
            return position
        }

        position++
        num = num shr 1
    }

}