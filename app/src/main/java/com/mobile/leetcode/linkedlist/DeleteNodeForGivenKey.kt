package com.mobile.leetcode.linkedlist

class DeleteNodeForGivenKey {

    companion object {

        @JvmStatic
        fun main(array: Array<String>) {

            val root = LList.Node(1)
            root.next = LList.Node(2)
            root.next?.next = LList.Node(3)
            root.next?.next?.next = LList.Node(4)
            deleteKeyThNode(root, 3)
        }


        fun deleteKeyThNode(node: LList.Node, key: Int) {

            var temp: LList.Node? = node

            while (temp != null) {
                if (temp.next?.data == key) {
                    temp.next = temp.next?.next
                } else {
                    temp = temp.next
                }
            }

            var tempv: LList.Node? = node
            while (tempv != null) {
                println(tempv.data)
                tempv = tempv.next
            }
        }
    }
}