package com.mobile.leetcode.linkedlist


fun main() {

    class Node(data: Any) {
        var data = data
        var next: Node? = null
        var prev: Node? = null
    }

    class LinkedList {
        var head: Node? = null
        fun push(data: Any): Node? {
            val node = Node(data)
            node.next = head
            head = node
            return head
        }

        fun isLoopExists(node: Node?): Boolean {
            val set = HashSet<Node>()
            var temp = node
            while (temp != null) {
                if (set.contains(temp)) {
                    return true
                } else {
                    set.add(temp)
                }
                temp = temp.next
            }
            return false
        }
    }


    val myList = LinkedList()
    myList.push(1)
    myList.push(2)
    myList.push(3)
    myList.push(4)
    myList.push(5)
    myList.push(6)
    myList.push(7)

    myList.head?.next?.next?.next = myList.head
    println("Is my LinkedList contains loop ${myList.isLoopExists(myList.head)}")

}