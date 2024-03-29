package com.mobile.leetcode.linkedlist

/*
* Given the head of a singly linked list, reverse the list, and return the reversed list.

Example 1:

Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
Example 2:

Input: head = [1,2]
Output: [2,1]
Example 3:

Input: head = []
Output: []

* */

class LList {


    class Node(var data: Int?) {
        var prev: Node? = null
        var next: Node? = null
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            var head: Node? = null

            head = Node(5)
            head.next = Node(10)
            head.next!!.next = Node(20)
            head.next!!.next!!.next = Node(30)
            head.next!!.next!!.next!!.next = Node(40)

            var ll = LList()
            println("original list")
            ll.printList(head)
            println("")
            var reversedNode = ll.reverseLList(head)
            println("after reverse")
            ll.printList(reversedNode)
        }
    }



    fun reverseLList(head: Node?): Node? {

        var prev: Node? = null
        var current: Node? = head

        while (current != null) {
            val next = current.next
            current.next = prev
            prev = current
            current = next
        }

        return prev

    }

    fun printList(root: Node?) {

        var node = root
        while (node != null) {
            print("${node.data}  ")
            node = node.next
        }
    }

}






