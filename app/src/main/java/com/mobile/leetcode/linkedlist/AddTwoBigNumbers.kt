package com.mobile.leetcode.linkedlist


/*
* You're given 2 huge integers represented by linked lists. Each linked list element is a number from 0 to 9999 that represents a number with exactly 4 digits. The represented number might have leading zeros. Your task is to add up these huge integers and return the result in the same format.

Example

For a = [9876, 5432, 1999] and b = [1, 8001], the output should be
solution(a, b) = [9876, 5434, 0].

Explanation: 987654321999 + 18001 = 987654340000.

For a = [123, 4, 5] and b = [100, 100, 100], the output should be
solution(a, b) = [223, 104, 105].

Explanation: 12300040005 + 10001000100 = 22301040105.
* */

private fun main() {


}


fun remainderExists(value: Int): Boolean {
    // since a & b both have guaranteed constraints
    // 0 ≤ element value ≤ 9999 => max number = 19998,
    // remainder can only be 1 if n d igits > 4 digits
    return value / 10000 == 1
}

fun removeLastDigit(value: Int): Int {
    // If there is a carry, set remainder to 1 (carry)
    // and remove last digit.
    var value = value
    var temp = 0
    var tenth = 1
    while (value >= 10) {
        temp += value % 10 * tenth
        tenth *= 10
        value /= 10
    }
    return temp
}

fun reverse(list: LList.Node?): LList.Node? {
    // O(1) space complexity reverse
    var list: LList.Node? = list
    var prev: LList.Node? = null
    while (list != null) {
        val next: LList.Node? = list.next
        list.next = prev
        prev = list
        list = next
    }
    return prev
}

fun addTwoHugeNumbers(a: LList.Node?, b: LList.Node?): LList.Node? {
    var a: LList.Node? = a
    var b: LList.Node? = b
    val header: LList.Node = LList.Node(0) // fake head
    var cur: LList.Node? = header
    a = reverse(a)
    b = reverse(b)
    var sum: Int? = null
    var remainder = 0
    while (a != null || b != null) {
        sum = 0
        if (a != null) {
            sum += a.data!!
            a = a.next
        }
        if (b != null) {
            sum += b.data!!
            b = b.next
        }
        sum += remainder
        if (remainderExists(sum)) {
            remainder = 1
            sum = removeLastDigit(sum)
        } else remainder = 0
        cur?.next = LList.Node(sum)
        cur = cur?.next
    }

    // if there's carry in last digit (> 9999)
    if (remainder == 1) cur?.next = LList.Node(1)
    return reverse(header.next)
}

