package com.mobile.leetcode

class DeleteNodeForGivenKey {

    companion object {

        @JvmStatic
        fun main(array: Array<String>) {

        }

        fun deleteKeyThNode(node: LList.Node, key: Int) {

            var temp: LList.Node? = node
            var prev: LList.Node? = node

            if (temp == null) return

            while (temp != null) {

                if (temp.data == key) {
                    temp = temp.next

                } else {
                    prev = temp
                    temp = temp.next
                }
            }

        }
    }
}