package com.mobile.leetcode.easyproblems

import com.mobile.leetcode.linkedlist.LList

/*
https://leetcode.com/problems/merge-two-sorted-lists/
*
 You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.


 */

private fun main() {

    val ll1 = LList.Node(1)
    ll1.next = LList.Node(4)
    ll1.next?.next = LList.Node(5)
    ll1.next?.next?.next = LList.Node(7)

    val ll2 = LList.Node(1)
    ll2.next = LList.Node(3)
    ll2.next?.next = LList.Node(6)

    getMergedSortedLL(ll1, ll2)

}

fun getMergedSortedLL(ll1: LList.Node, ll2: LList.Node) {
    var ll1: LList.Node? = ll1
    var ll2: LList.Node? = ll2

    var dummy = LList.Node(0)
    var tail: LList.Node? = dummy

    while (ll1 != null && ll2 != null) {

        if (ll1.data!! >= ll2.data!!) {
            tail?.next = ll2
            ll2 = ll2.next
        } else {
            tail?.next = ll1
            ll1 = ll1.next
        }

        tail = tail?.next
    }



    if (ll1 != null) {
        tail?.next = ll1
    }

    if (ll2 != null) {
        tail?.next = ll2
    }

    printResult(dummy.next)
}

fun printResult(next: LList.Node?) {

    var head = next
    while (head != null) {
        println(head.data)
        head = head.next
    }


}
