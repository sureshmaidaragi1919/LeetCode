package com.mobile.leetcode.linkedlist

class DeleteNodeForGivenKey {

    companion object {

        @JvmStatic
        fun main(array: Array<String>) {

            val root = LList.Node(1)
            root.next = LList.Node(2)
            root.next?.next = LList.Node(3)
            root.next?.next?.next = LList.Node(4)
            root.next?.next?.next?.next = LList.Node(2)
            //deleteKeyThNode(root, 2)
            println("includes other corner cases tooo")
            displayLL(solution(root, 1))
        }

        private fun displayLL(node: LList.Node?) {
            var tempv: LList.Node? = node
            while (tempv != null) {
                println(tempv.data)
                tempv = tempv.next
            }
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

        /*It includes other corner cases too*/
        fun solution(l: LList.Node?, k: Int): LList.Node? {

            var l: LList.Node? = l
            if (l == null) {
                return l
            }
            while (l?.data == k && l != null) {
                l = l.next
                if (l == null) break
            }
            if (l == null) {
                return l
            }
            var c: LList.Node? = l
            while (c?.next != null) {
                if (c.next?.data == k) {
                    c.next = c.next?.next
                } else {
                    c = c.next
                }
            }
            return l


        }


        //Easy to understand
        fun solutionv(l: LList.Node?, k: Int): LList.Node? {
            if (l == null) return null

            var head = l
            while (head?.data == k) {
                head = head.next
            }

            var prev = head
            var next = head?.next
            while (next != null) {
                if (next.data == k) {
                    prev?.next = next.next
                } else {
                    prev = next
                }
                next = next.next
            }
            return head
        }
    }

}