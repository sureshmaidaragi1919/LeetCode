package com.mobile.leetcode.linkedlist


/*
* Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.

*
* Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.

* */

private fun main() {

    val ll = LList.Node(1)
    ll.next = LList.Node(2)
    ll.next?.next = LList.Node(3)
    ll.next?.next?.next = LList.Node(4)
    ll.next?.next?.next?.next = LList.Node(5)

    usingTempVariable(ll)
}


/*
TC : O(n)
* */
fun findMiddleOfLLUsingTwoPointers(ll: LList.Node) {

    var fast: LList.Node? = ll
    var slow: LList.Node? = ll
    while (fast != null && fast.next != null) {

        fast = fast.next?.next
        slow = slow?.next
    }

    printLLItems(slow)
}

/*
* Using temp variable to find mid
*
* */

private fun usingTempVariable(ll: LList.Node) {

    var head: LList.Node? = ll
    var size = 0
    while (head != null) {
        size++
        head = head.next
    }

    var temp: LList.Node? = ll
    for (i in 0 until size / 2) {
        temp = temp?.next
    }
    printLLItems(temp)
}

fun printLLItems(slow: LList.Node?) {

    var slow = slow
    while (slow != null) {
        println(slow.data)
        slow = slow.next

    }
}


